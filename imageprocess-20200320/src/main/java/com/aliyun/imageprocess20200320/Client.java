// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320;

import com.aliyun.tea.*;
import com.aliyun.imageprocess20200320.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imageprocess", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DetectKneeXRayResponse detectKneeXRay(DetectKneeXRayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectKneeXRay", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new DetectKneeXRayResponse());
    }

    public DetectKneeXRayResponse detectKneeXRayAdvance(DetectKneeXRayAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        com.aliyun.tearpc.models.Config authConfig = com.aliyun.tearpc.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", "openplatform.aliyuncs.com"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
        // Step 1: request OSS api to upload file
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("endpoint", com.aliyun.common.Common.getEndpoint(authResponse.endpoint, authResponse.useAccelerate, _endpointType)),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
            new TeaPair("filename", authResponse.objectKey),
            new TeaPair("content", request.urlObject),
            new TeaPair("contentType", "")
        ));
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", authResponse.accessKeyId),
            new TeaPair("policy", authResponse.encodedPolicy),
            new TeaPair("signature", authResponse.signature),
            new TeaPair("key", authResponse.objectKey),
            new TeaPair("file", fileObj),
            new TeaPair("successActionStatus", "201")
        ));
        com.aliyun.oss.models.PostObjectRequest uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
            new TeaPair("bucketName", authResponse.bucket),
            new TeaPair("header", ossHeader)
        ));
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.common.Common.convert(runtime, ossRuntime);
        ossClient.postObject(uploadRequest, ossRuntime);
        // Step 2: request final api
        DetectKneeXRayRequest detectKneeXRayreq = new DetectKneeXRayRequest();
        com.aliyun.common.Common.convert(request, detectKneeXRayreq);
        detectKneeXRayreq.url = "http://" + authResponse.bucket + "." + authResponse.endpoint + "/" + authResponse.objectKey + "";
        DetectKneeXRayResponse detectKneeXRayResp = this.detectKneeXRay(detectKneeXRayreq, runtime);
        return detectKneeXRayResp;
    }

    public DetectSpineMRIResponse detectSpineMRI(DetectSpineMRIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectSpineMRI", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new DetectSpineMRIResponse());
    }

    public TranslateMedResponse translateMed(TranslateMedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TranslateMed", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new TranslateMedResponse());
    }

    public DetectLungNoduleResponse detectLungNodule(DetectLungNoduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectLungNodule", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new DetectLungNoduleResponse());
    }

    public DetectCovid19CadResponse detectCovid19Cad(DetectCovid19CadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetectCovid19Cad", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new DetectCovid19CadResponse());
    }

    public GetAsyncJobResultResponse getAsyncJobResult(GetAsyncJobResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAsyncJobResult", "HTTPS", "POST", "2020-03-20", "AK", null, TeaModel.buildMap(request), runtime), new GetAsyncJobResultResponse());
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}

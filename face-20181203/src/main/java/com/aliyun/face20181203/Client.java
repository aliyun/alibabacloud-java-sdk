// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203;

import com.aliyun.tea.*;
import com.aliyun.face20181203.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("face", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddFaceResponse addFaceWithOptions(AddFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddFace", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new AddFaceResponse());
    }

    public AddFaceResponse addFace(AddFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFaceWithOptions(request, runtime);
    }

    public DeleteFaceResponse deleteFaceWithOptions(DeleteFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFace", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFaceResponse());
    }

    public DeleteFaceResponse deleteFace(DeleteFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFaceWithOptions(request, runtime);
    }

    public DetectFaceResponse detectFaceWithOptions(DetectFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetectFace", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DetectFaceResponse());
    }

    public DetectFaceResponse detectFace(DetectFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detectFaceWithOptions(request, runtime);
    }

    public GetFaceAttributeResponse getFaceAttributeWithOptions(GetFaceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFaceAttribute", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetFaceAttributeResponse());
    }

    public GetFaceAttributeResponse getFaceAttribute(GetFaceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFaceAttributeWithOptions(request, runtime);
    }

    public ListFaceResponse listFaceWithOptions(ListFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFace", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListFaceResponse());
    }

    public ListFaceResponse listFace(ListFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFaceWithOptions(request, runtime);
    }

    public ListGroupResponse listGroupWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListGroup", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ListGroupResponse());
    }

    public ListGroupResponse listGroup() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupWithOptions(runtime);
    }

    public RecognizeFaceResponse recognizeFaceWithOptions(RecognizeFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeFace", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new RecognizeFaceResponse());
    }

    public RecognizeFaceResponse recognizeFace(RecognizeFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeFaceWithOptions(request, runtime);
    }

    public VerifyFaceResponse verifyFaceWithOptions(VerifyFaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyFace", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyFaceResponse());
    }

    public VerifyFaceResponse verifyFace(VerifyFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyFaceWithOptions(request, runtime);
    }
}

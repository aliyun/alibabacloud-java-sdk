// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320;

import com.aliyun.tea.*;
import com.aliyun.imageprocess20200320.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imageprocess", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>主动脉瘤肺动脉高压检测</p>
     * 
     * @param request AnalyzeChestVesselRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnalyzeChestVesselResponse
     */
    public AnalyzeChestVesselResponse analyzeChestVesselWithOptions(AnalyzeChestVesselRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnalyzeChestVessel"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnalyzeChestVesselResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>主动脉瘤肺动脉高压检测</p>
     * 
     * @param request AnalyzeChestVesselRequest
     * @return AnalyzeChestVesselResponse
     */
    public AnalyzeChestVesselResponse analyzeChestVessel(AnalyzeChestVesselRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.analyzeChestVesselWithOptions(request, runtime);
    }

    public AnalyzeChestVesselResponse analyzeChestVesselAdvance(AnalyzeChestVesselAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        AnalyzeChestVesselRequest analyzeChestVesselReq = new AnalyzeChestVesselRequest();
        com.aliyun.openapiutil.Client.convert(request, analyzeChestVesselReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (AnalyzeChestVesselAdvanceRequest.AnalyzeChestVesselAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    AnalyzeChestVesselRequest.AnalyzeChestVesselRequestURLList tmp = analyzeChestVesselReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        AnalyzeChestVesselResponse analyzeChestVesselResp = this.analyzeChestVesselWithOptions(analyzeChestVesselReq, runtime);
        return analyzeChestVesselResp;
    }

    /**
     * <b>summary</b> : 
     * <p>骨密度估计</p>
     * 
     * @param request CalcBMDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CalcBMDResponse
     */
    public CalcBMDResponse calcBMDWithOptions(CalcBMDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CalcBMD"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CalcBMDResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>骨密度估计</p>
     * 
     * @param request CalcBMDRequest
     * @return CalcBMDResponse
     */
    public CalcBMDResponse calcBMD(CalcBMDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.calcBMDWithOptions(request, runtime);
    }

    public CalcBMDResponse calcBMDAdvance(CalcBMDAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        CalcBMDRequest calcBMDReq = new CalcBMDRequest();
        com.aliyun.openapiutil.Client.convert(request, calcBMDReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (CalcBMDAdvanceRequest.CalcBMDAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    CalcBMDRequest.CalcBMDRequestURLList tmp = calcBMDReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        CalcBMDResponse calcBMDResp = this.calcBMDWithOptions(calcBMDReq, runtime);
        return calcBMDResp;
    }

    /**
     * @param request CalcCACSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CalcCACSResponse
     */
    public CalcCACSResponse calcCACSWithOptions(CalcCACSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CalcCACS"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CalcCACSResponse());
    }

    /**
     * @param request CalcCACSRequest
     * @return CalcCACSResponse
     */
    public CalcCACSResponse calcCACS(CalcCACSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.calcCACSWithOptions(request, runtime);
    }

    public CalcCACSResponse calcCACSAdvance(CalcCACSAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        CalcCACSRequest calcCACSReq = new CalcCACSRequest();
        com.aliyun.openapiutil.Client.convert(request, calcCACSReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (CalcCACSAdvanceRequest.CalcCACSAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    CalcCACSRequest.CalcCACSRequestURLList tmp = calcCACSReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        CalcCACSResponse calcCACSResp = this.calcCACSWithOptions(calcCACSReq, runtime);
        return calcCACSResp;
    }

    /**
     * @param request DetectCovid19CadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectCovid19CadResponse
     */
    public DetectCovid19CadResponse detectCovid19CadWithOptions(DetectCovid19CadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectCovid19Cad"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectCovid19CadResponse());
    }

    /**
     * @param request DetectCovid19CadRequest
     * @return DetectCovid19CadResponse
     */
    public DetectCovid19CadResponse detectCovid19Cad(DetectCovid19CadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectCovid19CadWithOptions(request, runtime);
    }

    public DetectCovid19CadResponse detectCovid19CadAdvance(DetectCovid19CadAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        DetectCovid19CadRequest detectCovid19CadReq = new DetectCovid19CadRequest();
        com.aliyun.openapiutil.Client.convert(request, detectCovid19CadReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (DetectCovid19CadAdvanceRequest.DetectCovid19CadAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    DetectCovid19CadRequest.DetectCovid19CadRequestURLList tmp = detectCovid19CadReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        DetectCovid19CadResponse detectCovid19CadResp = this.detectCovid19CadWithOptions(detectCovid19CadReq, runtime);
        return detectCovid19CadResp;
    }

    /**
     * <b>summary</b> : 
     * <p>脂肪肝检测</p>
     * 
     * @param request DetectLiverSteatosisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectLiverSteatosisResponse
     */
    public DetectLiverSteatosisResponse detectLiverSteatosisWithOptions(DetectLiverSteatosisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectLiverSteatosis"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectLiverSteatosisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>脂肪肝检测</p>
     * 
     * @param request DetectLiverSteatosisRequest
     * @return DetectLiverSteatosisResponse
     */
    public DetectLiverSteatosisResponse detectLiverSteatosis(DetectLiverSteatosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectLiverSteatosisWithOptions(request, runtime);
    }

    public DetectLiverSteatosisResponse detectLiverSteatosisAdvance(DetectLiverSteatosisAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        DetectLiverSteatosisRequest detectLiverSteatosisReq = new DetectLiverSteatosisRequest();
        com.aliyun.openapiutil.Client.convert(request, detectLiverSteatosisReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (DetectLiverSteatosisAdvanceRequest.DetectLiverSteatosisAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    DetectLiverSteatosisRequest.DetectLiverSteatosisRequestURLList tmp = detectLiverSteatosisReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        DetectLiverSteatosisResponse detectLiverSteatosisResp = this.detectLiverSteatosisWithOptions(detectLiverSteatosisReq, runtime);
        return detectLiverSteatosisResp;
    }

    /**
     * @param request DetectLungNoduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectLungNoduleResponse
     */
    public DetectLungNoduleResponse detectLungNoduleWithOptions(DetectLungNoduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            body.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectLungNodule"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectLungNoduleResponse());
    }

    /**
     * @param request DetectLungNoduleRequest
     * @return DetectLungNoduleResponse
     */
    public DetectLungNoduleResponse detectLungNodule(DetectLungNoduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectLungNoduleWithOptions(request, runtime);
    }

    public DetectLungNoduleResponse detectLungNoduleAdvance(DetectLungNoduleAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        DetectLungNoduleRequest detectLungNoduleReq = new DetectLungNoduleRequest();
        com.aliyun.openapiutil.Client.convert(request, detectLungNoduleReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (DetectLungNoduleAdvanceRequest.DetectLungNoduleAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    DetectLungNoduleRequest.DetectLungNoduleRequestURLList tmp = detectLungNoduleReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        DetectLungNoduleResponse detectLungNoduleResp = this.detectLungNoduleWithOptions(detectLungNoduleReq, runtime);
        return detectLungNoduleResp;
    }

    /**
     * <b>summary</b> : 
     * <p>淋巴结检测</p>
     * 
     * @param request DetectLymphRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectLymphResponse
     */
    public DetectLymphResponse detectLymphWithOptions(DetectLymphRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectLymph"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectLymphResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>淋巴结检测</p>
     * 
     * @param request DetectLymphRequest
     * @return DetectLymphResponse
     */
    public DetectLymphResponse detectLymph(DetectLymphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectLymphWithOptions(request, runtime);
    }

    public DetectLymphResponse detectLymphAdvance(DetectLymphAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        DetectLymphRequest detectLymphReq = new DetectLymphRequest();
        com.aliyun.openapiutil.Client.convert(request, detectLymphReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (DetectLymphAdvanceRequest.DetectLymphAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    DetectLymphRequest.DetectLymphRequestURLList tmp = detectLymphReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        DetectLymphResponse detectLymphResp = this.detectLymphWithOptions(detectLymphReq, runtime);
        return detectLymphResp;
    }

    /**
     * <b>summary</b> : 
     * <p>胰腺癌检测</p>
     * 
     * @param request DetectPancRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectPancResponse
     */
    public DetectPancResponse detectPancWithOptions(DetectPancRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectPanc"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectPancResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>胰腺癌检测</p>
     * 
     * @param request DetectPancRequest
     * @return DetectPancResponse
     */
    public DetectPancResponse detectPanc(DetectPancRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectPancWithOptions(request, runtime);
    }

    public DetectPancResponse detectPancAdvance(DetectPancAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        DetectPancRequest detectPancReq = new DetectPancRequest();
        com.aliyun.openapiutil.Client.convert(request, detectPancReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (DetectPancAdvanceRequest.DetectPancAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    DetectPancRequest.DetectPancRequestURLList tmp = detectPancReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        DetectPancResponse detectPancResp = this.detectPancWithOptions(detectPancReq, runtime);
        return detectPancResp;
    }

    /**
     * @param request DetectRibFractureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectRibFractureResponse
     */
    public DetectRibFractureResponse detectRibFractureWithOptions(DetectRibFractureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectRibFracture"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectRibFractureResponse());
    }

    /**
     * @param request DetectRibFractureRequest
     * @return DetectRibFractureResponse
     */
    public DetectRibFractureResponse detectRibFracture(DetectRibFractureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectRibFractureWithOptions(request, runtime);
    }

    public DetectRibFractureResponse detectRibFractureAdvance(DetectRibFractureAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        DetectRibFractureRequest detectRibFractureReq = new DetectRibFractureRequest();
        com.aliyun.openapiutil.Client.convert(request, detectRibFractureReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (DetectRibFractureAdvanceRequest.DetectRibFractureAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    DetectRibFractureRequest.DetectRibFractureRequestURLList tmp = detectRibFractureReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        DetectRibFractureResponse detectRibFractureResp = this.detectRibFractureWithOptions(detectRibFractureReq, runtime);
        return detectRibFractureResp;
    }

    /**
     * @param request DetectSkinDiseaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetectSkinDiseaseResponse
     */
    public DetectSkinDiseaseResponse detectSkinDiseaseWithOptions(DetectSkinDiseaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectSkinDisease"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectSkinDiseaseResponse());
    }

    /**
     * @param request DetectSkinDiseaseRequest
     * @return DetectSkinDiseaseResponse
     */
    public DetectSkinDiseaseResponse detectSkinDisease(DetectSkinDiseaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detectSkinDiseaseWithOptions(request, runtime);
    }

    public DetectSkinDiseaseResponse detectSkinDiseaseAdvance(DetectSkinDiseaseAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        DetectSkinDiseaseRequest detectSkinDiseaseReq = new DetectSkinDiseaseRequest();
        com.aliyun.openapiutil.Client.convert(request, detectSkinDiseaseReq);
        if (!com.aliyun.teautil.Common.isUnset(request.urlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.urlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            detectSkinDiseaseReq.url = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        DetectSkinDiseaseResponse detectSkinDiseaseResp = this.detectSkinDiseaseWithOptions(detectSkinDiseaseReq, runtime);
        return detectSkinDiseaseResp;
    }

    /**
     * <b>summary</b> : 
     * <p>会话反馈</p>
     * 
     * @param request FeedbackSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FeedbackSessionResponse
     */
    public FeedbackSessionResponse feedbackSessionWithOptions(FeedbackSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feedback)) {
            body.put("Feedback", request.feedback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FeedbackSession"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FeedbackSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会话反馈</p>
     * 
     * @param request FeedbackSessionRequest
     * @return FeedbackSessionResponse
     */
    public FeedbackSessionResponse feedbackSession(FeedbackSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.feedbackSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>胸部CT平扫筛查结果报告生成</p>
     * 
     * @param tmpReq GenerateReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateReportResponse
     */
    public GenerateReportResponse generateReportWithOptions(GenerateReportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GenerateReportShrinkRequest request = new GenerateReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reportConfigs)) {
            request.reportConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reportConfigs, "ReportConfigs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportConfigsShrink)) {
            body.put("ReportConfigs", request.reportConfigsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateReport"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>胸部CT平扫筛查结果报告生成</p>
     * 
     * @param request GenerateReportRequest
     * @return GenerateReportResponse
     */
    public GenerateReportResponse generateReport(GenerateReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateReportWithOptions(request, runtime);
    }

    /**
     * @param request GetAsyncJobResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncJobResultResponse
     */
    public GetAsyncJobResultResponse getAsyncJobResultWithOptions(GetAsyncJobResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncJobResult"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncJobResultResponse());
    }

    /**
     * @param request GetAsyncJobResultRequest
     * @return GetAsyncJobResultResponse
     */
    public GetAsyncJobResultResponse getAsyncJobResult(GetAsyncJobResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsyncJobResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CVD心血管不良事件预测</p>
     * 
     * @param request PredictCVDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PredictCVDResponse
     */
    public PredictCVDResponse predictCVDWithOptions(PredictCVDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PredictCVD"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PredictCVDResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CVD心血管不良事件预测</p>
     * 
     * @param request PredictCVDRequest
     * @return PredictCVDResponse
     */
    public PredictCVDResponse predictCVD(PredictCVDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.predictCVDWithOptions(request, runtime);
    }

    public PredictCVDResponse predictCVDAdvance(PredictCVDAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        PredictCVDRequest predictCVDReq = new PredictCVDRequest();
        com.aliyun.openapiutil.Client.convert(request, predictCVDReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (PredictCVDAdvanceRequest.PredictCVDAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    PredictCVDRequest.PredictCVDRequestURLList tmp = predictCVDReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        PredictCVDResponse predictCVDResp = this.predictCVDWithOptions(predictCVDReq, runtime);
        return predictCVDResp;
    }

    /**
     * @param request RunCTRegistrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCTRegistrationResponse
     */
    public RunCTRegistrationResponse runCTRegistrationWithOptions(RunCTRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.floatingList)) {
            body.put("FloatingList", request.floatingList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referenceList)) {
            body.put("ReferenceList", request.referenceList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCTRegistration"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCTRegistrationResponse());
    }

    /**
     * @param request RunCTRegistrationRequest
     * @return RunCTRegistrationResponse
     */
    public RunCTRegistrationResponse runCTRegistration(RunCTRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCTRegistrationWithOptions(request, runtime);
    }

    public RunCTRegistrationResponse runCTRegistrationAdvance(RunCTRegistrationAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        RunCTRegistrationRequest runCTRegistrationReq = new RunCTRegistrationRequest();
        com.aliyun.openapiutil.Client.convert(request, runCTRegistrationReq);
        if (!com.aliyun.teautil.Common.isUnset(request.floatingList)) {
            Integer i0 = 0;
            for (RunCTRegistrationAdvanceRequest.RunCTRegistrationAdvanceRequestFloatingList item0 : request.floatingList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.floatingURLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.floatingURLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    RunCTRegistrationRequest.RunCTRegistrationRequestFloatingList tmp = runCTRegistrationReq.floatingList.get(i0);
                    tmp.floatingURL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referenceList)) {
            Integer i1 = 0;
            for (RunCTRegistrationAdvanceRequest.RunCTRegistrationAdvanceRequestReferenceList item0 : request.referenceList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.referenceURLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.referenceURLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    RunCTRegistrationRequest.RunCTRegistrationRequestReferenceList tmp = runCTRegistrationReq.referenceList.get(i1);
                    tmp.referenceURL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i1 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i1), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        RunCTRegistrationResponse runCTRegistrationResp = this.runCTRegistrationWithOptions(runCTRegistrationReq, runtime);
        return runCTRegistrationResp;
    }

    /**
     * @param request RunMedQARequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunMedQAResponse
     */
    public RunMedQAResponse runMedQAWithOptions(RunMedQARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.answerImageDataList)) {
            body.put("AnswerImageDataList", request.answerImageDataList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.answerImageURLList)) {
            body.put("AnswerImageURLList", request.answerImageURLList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.answerTextList)) {
            body.put("AnswerTextList", request.answerTextList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            body.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.questionType)) {
            body.put("QuestionType", request.questionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunMedQA"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunMedQAResponse());
    }

    /**
     * @param request RunMedQARequest
     * @return RunMedQAResponse
     */
    public RunMedQAResponse runMedQA(RunMedQARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runMedQAWithOptions(request, runtime);
    }

    public RunMedQAResponse runMedQAAdvance(RunMedQAAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        RunMedQARequest runMedQAReq = new RunMedQARequest();
        com.aliyun.openapiutil.Client.convert(request, runMedQAReq);
        if (!com.aliyun.teautil.Common.isUnset(request.answerImageURLList)) {
            Integer i0 = 0;
            for (RunMedQAAdvanceRequest.RunMedQAAdvanceRequestAnswerImageURLList item0 : request.answerImageURLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.answerImageURLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.answerImageURLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    RunMedQARequest.RunMedQARequestAnswerImageURLList tmp = runMedQAReq.answerImageURLList.get(i0);
                    tmp.answerImageURL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        RunMedQAResponse runMedQAResp = this.runMedQAWithOptions(runMedQAReq, runtime);
        return runMedQAResp;
    }

    /**
     * <b>summary</b> : 
     * <p>结直肠癌筛查</p>
     * 
     * @param request ScreenCRCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScreenCRCResponse
     */
    public ScreenCRCResponse screenCRCWithOptions(ScreenCRCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScreenCRC"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScreenCRCResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>结直肠癌筛查</p>
     * 
     * @param request ScreenCRCRequest
     * @return ScreenCRCResponse
     */
    public ScreenCRCResponse screenCRC(ScreenCRCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.screenCRCWithOptions(request, runtime);
    }

    public ScreenCRCResponse screenCRCAdvance(ScreenCRCAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ScreenCRCRequest screenCRCReq = new ScreenCRCRequest();
        com.aliyun.openapiutil.Client.convert(request, screenCRCReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (ScreenCRCAdvanceRequest.ScreenCRCAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    ScreenCRCRequest.ScreenCRCRequestURLList tmp = screenCRCReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        ScreenCRCResponse screenCRCResp = this.screenCRCWithOptions(screenCRCReq, runtime);
        return screenCRCResp;
    }

    /**
     * <b>summary</b> : 
     * <p>胸部CT平扫</p>
     * 
     * @param request ScreenChestCTRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScreenChestCTResponse
     */
    public ScreenChestCTResponse screenChestCTWithOptions(ScreenChestCTRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mask)) {
            body.put("Mask", request.mask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            body.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScreenChestCT"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScreenChestCTResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>胸部CT平扫</p>
     * 
     * @param request ScreenChestCTRequest
     * @return ScreenChestCTResponse
     */
    public ScreenChestCTResponse screenChestCT(ScreenChestCTRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.screenChestCTWithOptions(request, runtime);
    }

    public ScreenChestCTResponse screenChestCTAdvance(ScreenChestCTAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ScreenChestCTRequest screenChestCTReq = new ScreenChestCTRequest();
        com.aliyun.openapiutil.Client.convert(request, screenChestCTReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (ScreenChestCTAdvanceRequest.ScreenChestCTAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    ScreenChestCTRequest.ScreenChestCTRequestURLList tmp = screenChestCTReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        ScreenChestCTResponse screenChestCTResp = this.screenChestCTWithOptions(screenChestCTReq, runtime);
        return screenChestCTResp;
    }

    /**
     * <b>summary</b> : 
     * <p>食管癌筛查</p>
     * 
     * @param request ScreenECRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScreenECResponse
     */
    public ScreenECResponse screenECWithOptions(ScreenECRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScreenEC"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScreenECResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>食管癌筛查</p>
     * 
     * @param request ScreenECRequest
     * @return ScreenECResponse
     */
    public ScreenECResponse screenEC(ScreenECRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.screenECWithOptions(request, runtime);
    }

    public ScreenECResponse screenECAdvance(ScreenECAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ScreenECRequest screenECReq = new ScreenECRequest();
        com.aliyun.openapiutil.Client.convert(request, screenECReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (ScreenECAdvanceRequest.ScreenECAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    ScreenECRequest.ScreenECRequestURLList tmp = screenECReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        ScreenECResponse screenECResp = this.screenECWithOptions(screenECReq, runtime);
        return screenECResp;
    }

    /**
     * <b>summary</b> : 
     * <p>胃癌筛查</p>
     * 
     * @param request ScreenGCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScreenGCResponse
     */
    public ScreenGCResponse screenGCWithOptions(ScreenGCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScreenGC"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScreenGCResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>胃癌筛查</p>
     * 
     * @param request ScreenGCRequest
     * @return ScreenGCResponse
     */
    public ScreenGCResponse screenGC(ScreenGCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.screenGCWithOptions(request, runtime);
    }

    public ScreenGCResponse screenGCAdvance(ScreenGCAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ScreenGCRequest screenGCReq = new ScreenGCRequest();
        com.aliyun.openapiutil.Client.convert(request, screenGCReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (ScreenGCAdvanceRequest.ScreenGCAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    ScreenGCRequest.ScreenGCRequestURLList tmp = screenGCReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        ScreenGCResponse screenGCResp = this.screenGCWithOptions(screenGCReq, runtime);
        return screenGCResp;
    }

    /**
     * <b>summary</b> : 
     * <p>肝癌筛查</p>
     * 
     * @param request ScreenLCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScreenLCResponse
     */
    public ScreenLCResponse screenLCWithOptions(ScreenLCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScreenLC"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScreenLCResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>肝癌筛查</p>
     * 
     * @param request ScreenLCRequest
     * @return ScreenLCResponse
     */
    public ScreenLCResponse screenLC(ScreenLCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.screenLCWithOptions(request, runtime);
    }

    public ScreenLCResponse screenLCAdvance(ScreenLCAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        ScreenLCRequest screenLCReq = new ScreenLCRequest();
        com.aliyun.openapiutil.Client.convert(request, screenLCReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (ScreenLCAdvanceRequest.ScreenLCAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    ScreenLCRequest.ScreenLCRequestURLList tmp = screenLCReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        ScreenLCResponse screenLCResp = this.screenLCWithOptions(screenLCReq, runtime);
        return screenLCResp;
    }

    /**
     * <b>summary</b> : 
     * <p>放疗淋巴站分割</p>
     * 
     * @param request SegmentLymphNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SegmentLymphNodeResponse
     */
    public SegmentLymphNodeResponse segmentLymphNodeWithOptions(SegmentLymphNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyPart)) {
            body.put("BodyPart", request.bodyPart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SegmentLymphNode"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SegmentLymphNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>放疗淋巴站分割</p>
     * 
     * @param request SegmentLymphNodeRequest
     * @return SegmentLymphNodeResponse
     */
    public SegmentLymphNodeResponse segmentLymphNode(SegmentLymphNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.segmentLymphNodeWithOptions(request, runtime);
    }

    public SegmentLymphNodeResponse segmentLymphNodeAdvance(SegmentLymphNodeAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        SegmentLymphNodeRequest segmentLymphNodeReq = new SegmentLymphNodeRequest();
        com.aliyun.openapiutil.Client.convert(request, segmentLymphNodeReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (SegmentLymphNodeAdvanceRequest.SegmentLymphNodeAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    SegmentLymphNodeRequest.SegmentLymphNodeRequestURLList tmp = segmentLymphNodeReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        SegmentLymphNodeResponse segmentLymphNodeResp = this.segmentLymphNodeWithOptions(segmentLymphNodeReq, runtime);
        return segmentLymphNodeResp;
    }

    /**
     * <b>summary</b> : 
     * <p>多器官分割</p>
     * 
     * @param request SegmentOARRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SegmentOARResponse
     */
    public SegmentOARResponse segmentOARWithOptions(SegmentOARRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyPart)) {
            body.put("BodyPart", request.bodyPart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contrast)) {
            body.put("Contrast", request.contrast);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maskList)) {
            body.put("MaskList", request.maskList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SegmentOAR"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SegmentOARResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多器官分割</p>
     * 
     * @param request SegmentOARRequest
     * @return SegmentOARResponse
     */
    public SegmentOARResponse segmentOAR(SegmentOARRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.segmentOARWithOptions(request, runtime);
    }

    public SegmentOARResponse segmentOARAdvance(SegmentOARAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        SegmentOARRequest segmentOARReq = new SegmentOARRequest();
        com.aliyun.openapiutil.Client.convert(request, segmentOARReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (SegmentOARAdvanceRequest.SegmentOARAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    SegmentOARRequest.SegmentOARRequestURLList tmp = segmentOARReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        SegmentOARResponse segmentOARResp = this.segmentOARWithOptions(segmentOARReq, runtime);
        return segmentOARResp;
    }

    /**
     * <b>summary</b> : 
     * <p>放疗靶区勾画算法</p>
     * 
     * @param request TargetVolumeSegmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TargetVolumeSegmentResponse
     */
    public TargetVolumeSegmentResponse targetVolumeSegmentWithOptions(TargetVolumeSegmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cancerType)) {
            body.put("CancerType", request.cancerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFormat)) {
            body.put("DataFormat", request.dataFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetVolumeType)) {
            body.put("TargetVolumeType", request.targetVolumeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            body.put("URLList", request.URLList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TargetVolumeSegment"),
            new TeaPair("version", "2020-03-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TargetVolumeSegmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>放疗靶区勾画算法</p>
     * 
     * @param request TargetVolumeSegmentRequest
     * @return TargetVolumeSegmentResponse
     */
    public TargetVolumeSegmentResponse targetVolumeSegment(TargetVolumeSegmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.targetVolumeSegmentWithOptions(request, runtime);
    }

    public TargetVolumeSegmentResponse targetVolumeSegmentAdvance(TargetVolumeSegmentAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "imageprocess"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        TargetVolumeSegmentRequest targetVolumeSegmentReq = new TargetVolumeSegmentRequest();
        com.aliyun.openapiutil.Client.convert(request, targetVolumeSegmentReq);
        if (!com.aliyun.teautil.Common.isUnset(request.URLList)) {
            Integer i0 = 0;
            for (TargetVolumeSegmentAdvanceRequest.TargetVolumeSegmentAdvanceRequestURLList item0 : request.URLList) {
                if (!com.aliyun.teautil.Common.isUnset(item0.URLObject)) {
                    authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
                    ossConfig.accessKeyId = authResponse.body.accessKeyId;
                    ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
                    ossClient = new com.aliyun.oss.Client(ossConfig);
                    fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                        new TeaPair("filename", authResponse.body.objectKey),
                        new TeaPair("content", item0.URLObject),
                        new TeaPair("contentType", "")
                    ));
                    ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                        new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                        new TeaPair("policy", authResponse.body.encodedPolicy),
                        new TeaPair("signature", authResponse.body.signature),
                        new TeaPair("key", authResponse.body.objectKey),
                        new TeaPair("file", fileObj),
                        new TeaPair("successActionStatus", "201")
                    ));
                    uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                        new TeaPair("bucketName", authResponse.body.bucket),
                        new TeaPair("header", ossHeader)
                    ));
                    ossClient.postObject(uploadRequest, ossRuntime);
                    TargetVolumeSegmentRequest.TargetVolumeSegmentRequestURLList tmp = targetVolumeSegmentReq.URLList.get(i0);
                    tmp.URL = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
                    i0 = com.aliyun.darabonbanumber.Client.ltoi(com.aliyun.darabonbanumber.Client.add(com.aliyun.darabonbanumber.Client.itol(i0), com.aliyun.darabonbanumber.Client.itol(1)));
                }

            }
        }

        TargetVolumeSegmentResponse targetVolumeSegmentResp = this.targetVolumeSegmentWithOptions(targetVolumeSegmentReq, runtime);
        return targetVolumeSegmentResp;
    }
}

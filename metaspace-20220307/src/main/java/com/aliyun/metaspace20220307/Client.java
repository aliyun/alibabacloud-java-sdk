// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307;

import com.aliyun.tea.*;
import com.aliyun.metaspace20220307.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("metaspace", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>用协同码发起协同</p>
     * 
     * @param request ApplyCoordinationWithCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyCoordinationWithCodeResponse
     */
    public ApplyCoordinationWithCodeResponse applyCoordinationWithCodeWithOptions(ApplyCoordinationWithCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coordinationCode)) {
            body.put("CoordinationCode", request.coordinationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyCoordinationWithCode"),
            new TeaPair("version", "2022-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyCoordinationWithCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用协同码发起协同</p>
     * 
     * @param request ApplyCoordinationWithCodeRequest
     * @return ApplyCoordinationWithCodeResponse
     */
    public ApplyCoordinationWithCodeResponse applyCoordinationWithCode(ApplyCoordinationWithCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyCoordinationWithCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Owner主动结束本次协同，同步失效协同码</p>
     * 
     * @param request EndAllCoordinationByOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EndAllCoordinationByOwnerResponse
     */
    public EndAllCoordinationByOwnerResponse endAllCoordinationByOwnerWithOptions(EndAllCoordinationByOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            body.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EndAllCoordinationByOwner"),
            new TeaPair("version", "2022-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EndAllCoordinationByOwnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Owner主动结束本次协同，同步失效协同码</p>
     * 
     * @param request EndAllCoordinationByOwnerRequest
     * @return EndAllCoordinationByOwnerResponse
     */
    public EndAllCoordinationByOwnerResponse endAllCoordinationByOwner(EndAllCoordinationByOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.endAllCoordinationByOwnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成协同码</p>
     * 
     * @param request GenerateCoordinationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateCoordinationCodeResponse
     */
    public GenerateCoordinationCodeResponse generateCoordinationCodeWithOptions(GenerateCoordinationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loginRegionId)) {
            body.put("LoginRegionId", request.loginRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            body.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            body.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateCoordinationCode"),
            new TeaPair("version", "2022-03-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCoordinationCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成协同码</p>
     * 
     * @param request GenerateCoordinationCodeRequest
     * @return GenerateCoordinationCodeResponse
     */
    public GenerateCoordinationCodeResponse generateCoordinationCode(GenerateCoordinationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateCoordinationCodeWithOptions(request, runtime);
    }
}

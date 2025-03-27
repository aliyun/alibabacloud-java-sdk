// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mobi20240411;

import com.aliyun.tea.*;
import com.aliyun.mobi20240411.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mobi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>通过模板创建应用</p>
     * 
     * @param request CreateAppFromTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppFromTemplateResponse
     */
    public CreateAppFromTemplateResponse createAppFromTemplateWithOptions(CreateAppFromTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actualParameters)) {
            query.put("ActualParameters", request.actualParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionsContent)) {
            query.put("ConnectionsContent", request.connectionsContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasesContent)) {
            query.put("DatabasesContent", request.databasesContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.icon)) {
            query.put("Icon", request.icon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variablesContent)) {
            query.put("VariablesContent", request.variablesContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppFromTemplate"),
            new TeaPair("version", "2024-04-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppFromTemplateResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateAppFromTemplateResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>通过模板创建应用</p>
     * 
     * @param request CreateAppFromTemplateRequest
     * @return CreateAppFromTemplateResponse
     */
    public CreateAppFromTemplateResponse createAppFromTemplate(CreateAppFromTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppFromTemplateWithOptions(request, runtime);
    }
}

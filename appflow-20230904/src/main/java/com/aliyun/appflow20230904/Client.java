// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904;

import com.aliyun.tea.*;
import com.aliyun.appflow20230904.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "appflow.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("appflow", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>Creates a flow or a flow version.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow.</p>
     * 
     * @param request CreateFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowDesc)) {
            query.put("FlowDesc", request.flowDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            query.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowTemplate)) {
            query.put("FlowTemplate", request.flowTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.launchStatus)) {
            query.put("LaunchStatus", request.launchStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlow"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a flow or a flow version.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a flow.</p>
     * 
     * @param request CreateFlowRequest
     * @return CreateFlowResponse
     */
    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a connection flow or a connection flow version.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user authentication credential.</p>
     * 
     * @param request CreateUserAuthConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserAuthConfigResponse
     */
    public CreateUserAuthConfigResponse createUserAuthConfigWithOptions(CreateUserAuthConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfig)) {
            query.put("AuthConfig", request.authConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfigName)) {
            query.put("AuthConfigName", request.authConfigName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorVersion)) {
            query.put("ConnectorVersion", request.connectorVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserAuthConfig"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserAuthConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a connection flow or a connection flow version.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user authentication credential.</p>
     * 
     * @param request CreateUserAuthConfigRequest
     * @return CreateUserAuthConfigResponse
     */
    public CreateUserAuthConfigResponse createUserAuthConfig(CreateUserAuthConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserAuthConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a connection flow.</p>
     * 
     * @param request DeleteFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlowWithOptions(DeleteFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlow"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a connection flow.</p>
     * 
     * @param request DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a connection flow or a connection flow version.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user authentication credential.</p>
     * 
     * @param request DeleteUserAuthConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserAuthConfigResponse
     */
    public DeleteUserAuthConfigResponse deleteUserAuthConfigWithOptions(DeleteUserAuthConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfigId)) {
            query.put("AuthConfigId", request.authConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorVersion)) {
            query.put("ConnectorVersion", request.connectorVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserAuthConfig"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserAuthConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a connection flow or a connection flow version.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user authentication credential.</p>
     * 
     * @param request DeleteUserAuthConfigRequest
     * @return DeleteUserAuthConfigResponse
     */
    public DeleteUserAuthConfigResponse deleteUserAuthConfig(DeleteUserAuthConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserAuthConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a flow.</p>
     * 
     * @param request DisableFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableFlowResponse
     */
    public DisableFlowResponse disableFlowWithOptions(DisableFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableFlow"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a flow.</p>
     * 
     * @param request DisableFlowRequest
     * @return DisableFlowResponse
     */
    public DisableFlowResponse disableFlow(DisableFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a flow.</p>
     * 
     * @param request EnableFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableFlowResponse
     */
    public EnableFlowResponse enableFlowWithOptions(EnableFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableFlow"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a flow.</p>
     * 
     * @param request EnableFlowRequest
     * @return EnableFlowResponse
     */
    public EnableFlowResponse enableFlow(EnableFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a logon session token.</p>
     * 
     * @param request GenerateUserSessionTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateUserSessionTokenResponse
     */
    public GenerateUserSessionTokenResponse generateUserSessionTokenWithOptions(GenerateUserSessionTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatbotId)) {
            query.put("ChatbotId", request.chatbotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireSecond)) {
            query.put("ExpireSecond", request.expireSecond);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            query.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrateId)) {
            query.put("IntegrateId", request.integrateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAvatar)) {
            query.put("UserAvatar", request.userAvatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUserSessionToken"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUserSessionTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a logon session token.</p>
     * 
     * @param request GenerateUserSessionTokenRequest
     * @return GenerateUserSessionTokenResponse
     */
    public GenerateUserSessionTokenResponse generateUserSessionToken(GenerateUserSessionTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUserSessionTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a flow.</p>
     * 
     * @param request GetFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFlowResponse
     */
    public GetFlowResponse getFlowWithOptions(GetFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFlow"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a flow.</p>
     * 
     * @param request GetFlowRequest
     * @return GetFlowResponse
     */
    public GetFlowResponse getFlow(GetFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation gets the details of a specified credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the details of a user authentication credential.</p>
     * 
     * @param request GetUserAuthConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserAuthConfigResponse
     */
    public GetUserAuthConfigResponse getUserAuthConfigWithOptions(GetUserAuthConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfigId)) {
            query.put("AuthConfigId", request.authConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorVersion)) {
            query.put("ConnectorVersion", request.connectorVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserAuthConfig"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserAuthConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation gets the details of a specified credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the details of a user authentication credential.</p>
     * 
     * @param request GetUserAuthConfigRequest
     * @return GetUserAuthConfigResponse
     */
    public GetUserAuthConfigResponse getUserAuthConfig(GetUserAuthConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserAuthConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes a connector action.</p>
     * 
     * @param tmpReq InvokeActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeActionResponse
     */
    public InvokeActionResponse invokeActionWithOptions(InvokeActionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvokeActionShrinkRequest request = new InvokeActionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authConfig)) {
            request.authConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authConfig, "AuthConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "Body", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.headers)) {
            request.headersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.headers, "Headers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.path)) {
            request.pathShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.path, "Path", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.query)) {
            request.queryShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.query, "Query", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionId)) {
            query.put("ActionId", request.actionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionVersion)) {
            query.put("ActionVersion", request.actionVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfigShrink)) {
            query.put("AuthConfig", request.authConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("Body", request.bodyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorVersion)) {
            query.put("ConnectorVersion", request.connectorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headersShrink)) {
            query.put("Headers", request.headersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathShrink)) {
            query.put("Path", request.pathShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryShrink)) {
            query.put("Query", request.queryShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            query.put("Stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeAction"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeActionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes a connector action.</p>
     * 
     * @param request InvokeActionRequest
     * @return InvokeActionResponse
     */
    public InvokeActionResponse invokeAction(InvokeActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeActionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Launches a flow.</p>
     * 
     * @param request LaunchFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LaunchFlowResponse
     */
    public LaunchFlowResponse launchFlowWithOptions(LaunchFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowDesc)) {
            query.put("FlowDesc", request.flowDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            query.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowTemplate)) {
            query.put("FlowTemplate", request.flowTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LaunchFlow"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LaunchFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Launches a flow.</p>
     * 
     * @param request LaunchFlowRequest
     * @return LaunchFlowResponse
     */
    public LaunchFlowResponse launchFlow(LaunchFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.launchFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a connector flow or a connector flow version.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of connector flows.</p>
     * 
     * @param request ListFlowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowsResponse
     */
    public ListFlowsResponse listFlowsWithOptions(ListFlowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlows"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a connector flow or a connector flow version.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of connector flows.</p>
     * 
     * @param request ListFlowsRequest
     * @return ListFlowsResponse
     */
    public ListFlowsResponse listFlows(ListFlowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves user auth configs that match specified filters.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists user authentication credentials.</p>
     * 
     * @param request ListUserAuthConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserAuthConfigsResponse
     */
    public ListUserAuthConfigsResponse listUserAuthConfigsWithOptions(ListUserAuthConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorVersion)) {
            query.put("ConnectorVersion", request.connectorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserAuthConfigs"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserAuthConfigsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves user auth configs that match specified filters.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists user authentication credentials.</p>
     * 
     * @param request ListUserAuthConfigsRequest
     * @return ListUserAuthConfigsResponse
     */
    public ListUserAuthConfigsResponse listUserAuthConfigs(ListUserAuthConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserAuthConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a connection flow.</p>
     * 
     * @param request UpdateFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowResponse
     */
    public UpdateFlowResponse updateFlowWithOptions(UpdateFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowDesc)) {
            query.put("FlowDesc", request.flowDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowName)) {
            query.put("FlowName", request.flowName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowTemplate)) {
            query.put("FlowTemplate", request.flowTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlow"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a connection flow.</p>
     * 
     * @param request UpdateFlowRequest
     * @return UpdateFlowResponse
     */
    public UpdateFlowResponse updateFlow(UpdateFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlowWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specific user authentication credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a user authentication credential.</p>
     * 
     * @param request UpdateUserAuthConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserAuthConfigResponse
     */
    public UpdateUserAuthConfigResponse updateUserAuthConfigWithOptions(UpdateUserAuthConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authConfig)) {
            query.put("AuthConfig", request.authConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfigId)) {
            query.put("AuthConfigId", request.authConfigId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authConfigName)) {
            query.put("AuthConfigName", request.authConfigName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorId)) {
            query.put("ConnectorId", request.connectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectorVersion)) {
            query.put("ConnectorVersion", request.connectorVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserAuthConfig"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserAuthConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specific user authentication credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a user authentication credential.</p>
     * 
     * @param request UpdateUserAuthConfigRequest
     * @return UpdateUserAuthConfigResponse
     */
    public UpdateUserAuthConfigResponse updateUserAuthConfig(UpdateUserAuthConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserAuthConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Withdraws a connection flow.</p>
     * 
     * @param request WithdrawFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WithdrawFlowResponse
     */
    public WithdrawFlowResponse withdrawFlowWithOptions(WithdrawFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            query.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowVersion)) {
            query.put("FlowVersion", request.flowVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WithdrawFlow"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WithdrawFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Withdraws a connection flow.</p>
     * 
     * @param request WithdrawFlowRequest
     * @return WithdrawFlowResponse
     */
    public WithdrawFlowResponse withdrawFlow(WithdrawFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.withdrawFlowWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531;

import com.aliyun.tea.*;
import com.aliyun.mse20190531.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mse", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @summary 新增服务鉴权规则
     *
     * @param request AddAuthPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAuthPolicyResponse
     */
    public AddAuthPolicyResponse addAuthPolicyWithOptions(AddAuthPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authRule)) {
            query.put("AuthRule", request.authRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.k8sNamespace)) {
            query.put("K8sNamespace", request.k8sNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAuthPolicy"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAuthPolicyResponse());
    }

    /**
     * @summary 新增服务鉴权规则
     *
     * @param request AddAuthPolicyRequest
     * @return AddAuthPolicyResponse
     */
    public AddAuthPolicyResponse addAuthPolicy(AddAuthPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAuthPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Creates authorization information for a gateway.
     *
     * @param tmpReq AddAuthResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAuthResourceResponse
     */
    public AddAuthResourceResponse addAuthResourceWithOptions(AddAuthResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddAuthResourceShrinkRequest request = new AddAuthResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authResourceHeaderList)) {
            request.authResourceHeaderListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authResourceHeaderList, "AuthResourceHeaderList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authId)) {
            query.put("AuthId", request.authId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authResourceHeaderListShrink)) {
            query.put("AuthResourceHeaderList", request.authResourceHeaderListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreCase)) {
            query.put("IgnoreCase", request.ignoreCase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAuthResource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAuthResourceResponse());
    }

    /**
     * @summary Creates authorization information for a gateway.
     *
     * @param request AddAuthResourceRequest
     * @return AddAuthResourceResponse
     */
    public AddAuthResourceResponse addAuthResource(AddAuthResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAuthResourceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a blacklist or a whitelist.
     *
     * @param request AddBlackWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBlackWhiteListResponse
     */
    public AddBlackWhiteListResponse addBlackWhiteListWithOptions(AddBlackWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isWhite)) {
            query.put("IsWhite", request.isWhite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdJsonList)) {
            query.put("ResourceIdJsonList", request.resourceIdJsonList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBlackWhiteList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBlackWhiteListResponse());
    }

    /**
     * @summary Creates a blacklist or a whitelist.
     *
     * @param request AddBlackWhiteListRequest
     * @return AddBlackWhiteListResponse
     */
    public AddBlackWhiteListResponse addBlackWhiteList(AddBlackWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBlackWhiteListWithOptions(request, runtime);
    }

    /**
     * @summary Adds a gateway.
     *
     * @param tmpReq AddGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewayResponse
     */
    public AddGatewayResponse addGatewayWithOptions(AddGatewayRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddGatewayShrinkRequest request = new AddGatewayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.zoneInfo)) {
            request.zoneInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.zoneInfo, "ZoneInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableHardwareAcceleration)) {
            query.put("EnableHardwareAcceleration", request.enableHardwareAcceleration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSls)) {
            query.put("EnableSls", request.enableSls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXtrace)) {
            query.put("EnableXtrace", request.enableXtrace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseSecurityGroup)) {
            query.put("EnterpriseSecurityGroup", request.enterpriseSecurityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbSpec)) {
            query.put("InternetSlbSpec", request.internetSlbSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mserVersion)) {
            query.put("MserVersion", request.mserVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlbNetworkType)) {
            query.put("NlbNetworkType", request.nlbNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replica)) {
            query.put("Replica", request.replica);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbSpec)) {
            query.put("SlbSpec", request.slbSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId2)) {
            query.put("VSwitchId2", request.vSwitchId2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpc)) {
            query.put("Vpc", request.vpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.xtraceRatio)) {
            query.put("XtraceRatio", request.xtraceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneInfoShrink)) {
            query.put("ZoneInfo", request.zoneInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGateway"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewayResponse());
    }

    /**
     * @summary Adds a gateway.
     *
     * @param request AddGatewayRequest
     * @return AddGatewayResponse
     */
    public AddGatewayResponse addGateway(AddGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGatewayWithOptions(request, runtime);
    }

    /**
     * @summary Adds an authentication configuration for a gateway.
     *
     * @param tmpReq AddGatewayAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewayAuthResponse
     */
    public AddGatewayAuthResponse addGatewayAuthWithOptions(AddGatewayAuthRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddGatewayAuthShrinkRequest request = new AddGatewayAuthShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authResourceList)) {
            request.authResourceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authResourceList, "AuthResourceList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalAuthZJSON)) {
            request.externalAuthZJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalAuthZJSON, "ExternalAuthZJSON", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scopesList)) {
            request.scopesListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scopesList, "ScopesList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authResourceConfig)) {
            query.put("AuthResourceConfig", request.authResourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authResourceListShrink)) {
            query.put("AuthResourceList", request.authResourceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authResourceMode)) {
            query.put("AuthResourceMode", request.authResourceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecret)) {
            query.put("ClientSecret", request.clientSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookieDomain)) {
            query.put("CookieDomain", request.cookieDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalAuthZJSONShrink)) {
            query.put("ExternalAuthZJSON", request.externalAuthZJSONShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isWhite)) {
            query.put("IsWhite", request.isWhite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuer)) {
            query.put("Issuer", request.issuer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwks)) {
            query.put("Jwks", request.jwks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginUrl)) {
            query.put("LoginUrl", request.loginUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectUrl)) {
            query.put("RedirectUrl", request.redirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopesListShrink)) {
            query.put("ScopesList", request.scopesListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sub)) {
            query.put("Sub", request.sub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenName)) {
            query.put("TokenName", request.tokenName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenNamePrefix)) {
            query.put("TokenNamePrefix", request.tokenNamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenPass)) {
            query.put("TokenPass", request.tokenPass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenPosition)) {
            query.put("TokenPosition", request.tokenPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGatewayAuth"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewayAuthResponse());
    }

    /**
     * @summary Adds an authentication configuration for a gateway.
     *
     * @param request AddGatewayAuthRequest
     * @return AddGatewayAuthResponse
     */
    public AddGatewayAuthResponse addGatewayAuth(AddGatewayAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGatewayAuthWithOptions(request, runtime);
    }

    /**
     * @summary Adds a consumer on which a gateway performs authentication operations.
     *
     * @param request AddGatewayAuthConsumerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewayAuthConsumerResponse
     */
    public AddGatewayAuthConsumerResponse addGatewayAuthConsumerWithOptions(AddGatewayAuthConsumerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeType)) {
            query.put("EncodeType", request.encodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwks)) {
            query.put("Jwks", request.jwks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyName)) {
            query.put("KeyName", request.keyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyValue)) {
            query.put("KeyValue", request.keyValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenName)) {
            query.put("TokenName", request.tokenName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenPass)) {
            query.put("TokenPass", request.tokenPass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenPosition)) {
            query.put("TokenPosition", request.tokenPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenPrefix)) {
            query.put("TokenPrefix", request.tokenPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGatewayAuthConsumer"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewayAuthConsumerResponse());
    }

    /**
     * @summary Adds a consumer on which a gateway performs authentication operations.
     *
     * @param request AddGatewayAuthConsumerRequest
     * @return AddGatewayAuthConsumerResponse
     */
    public AddGatewayAuthConsumerResponse addGatewayAuthConsumer(AddGatewayAuthConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGatewayAuthConsumerWithOptions(request, runtime);
    }

    /**
     * @summary Associates a domain name with a gateway.
     *
     * @param request AddGatewayDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewayDomainResponse
     */
    public AddGatewayDomainResponse addGatewayDomainWithOptions(AddGatewayDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2)) {
            query.put("Http2", request.http2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mustHttps)) {
            query.put("MustHttps", request.mustHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsMax)) {
            query.put("TlsMax", request.tlsMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsMin)) {
            query.put("TlsMin", request.tlsMin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGatewayDomain"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewayDomainResponse());
    }

    /**
     * @summary Associates a domain name with a gateway.
     *
     * @param request AddGatewayDomainRequest
     * @return AddGatewayDomainResponse
     */
    public AddGatewayDomainResponse addGatewayDomain(AddGatewayDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGatewayDomainWithOptions(request, runtime);
    }

    /**
     * @summary Adds a gateway route.
     *
     * @param tmpReq AddGatewayRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewayRouteResponse
     */
    public AddGatewayRouteResponse addGatewayRouteWithOptions(AddGatewayRouteRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddGatewayRouteShrinkRequest request = new AddGatewayRouteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.directResponseJSON)) {
            request.directResponseJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.directResponseJSON, "DirectResponseJSON", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fallbackServices)) {
            request.fallbackServicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fallbackServices, "FallbackServices", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.predicates)) {
            request.predicatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.predicates, "Predicates", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.redirectJSON)) {
            request.redirectJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.redirectJSON, "RedirectJSON", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.services)) {
            request.servicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.services, "Services", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directResponseJSONShrink)) {
            query.put("DirectResponseJSON", request.directResponseJSONShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainIdListJSON)) {
            query.put("DomainIdListJSON", request.domainIdListJSON);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWaf)) {
            query.put("EnableWaf", request.enableWaf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallback)) {
            query.put("Fallback", request.fallback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackServicesShrink)) {
            query.put("FallbackServices", request.fallbackServicesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policies)) {
            query.put("Policies", request.policies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predicatesShrink)) {
            query.put("Predicates", request.predicatesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectJSONShrink)) {
            query.put("RedirectJSON", request.redirectJSONShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeOrder)) {
            query.put("RouteOrder", request.routeOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            query.put("RouteType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicesShrink)) {
            query.put("Services", request.servicesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGatewayRoute"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewayRouteResponse());
    }

    /**
     * @summary Adds a gateway route.
     *
     * @param request AddGatewayRouteRequest
     * @return AddGatewayRouteResponse
     */
    public AddGatewayRouteResponse addGatewayRoute(AddGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGatewayRouteWithOptions(request, runtime);
    }

    /**
     * @summary Adds a service version.
     *
     * @param request AddGatewayServiceVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewayServiceVersionResponse
     */
    public AddGatewayServiceVersionResponse addGatewayServiceVersionWithOptions(AddGatewayServiceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGatewayServiceVersion"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewayServiceVersionResponse());
    }

    /**
     * @summary Adds a service version.
     *
     * @param request AddGatewayServiceVersionRequest
     * @return AddGatewayServiceVersionResponse
     */
    public AddGatewayServiceVersionResponse addGatewayServiceVersion(AddGatewayServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGatewayServiceVersionWithOptions(request, runtime);
    }

    /**
     * @summary Associates a Server Load Balancer (SLB) instance with a gateway.
     *
     * @param tmpReq AddGatewaySlbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGatewaySlbResponse
     */
    public AddGatewaySlbResponse addGatewaySlbWithOptions(AddGatewaySlbRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddGatewaySlbShrinkRequest request = new AddGatewaySlbShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.VServiceList)) {
            request.VServiceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.VServiceList, "VServiceList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpPort)) {
            query.put("HttpPort", request.httpPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsPort)) {
            query.put("HttpsPort", request.httpsPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpsVServerGroupId)) {
            query.put("HttpsVServerGroupId", request.httpsVServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceWeight)) {
            query.put("ServiceWeight", request.serviceWeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServerGroupId)) {
            query.put("VServerGroupId", request.VServerGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VServiceListShrink)) {
            query.put("VServiceList", request.VServiceListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGatewaySlb"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGatewaySlbResponse());
    }

    /**
     * @summary Associates a Server Load Balancer (SLB) instance with a gateway.
     *
     * @param request AddGatewaySlbRequest
     * @return AddGatewaySlbResponse
     */
    public AddGatewaySlbResponse addGatewaySlb(AddGatewaySlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGatewaySlbWithOptions(request, runtime);
    }

    /**
     * @summary Adds a migration task.
     *
     * @param request AddMigrationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMigrationTaskResponse
     */
    public AddMigrationTaskResponse addMigrationTaskWithOptions(AddMigrationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originInstanceAddress)) {
            query.put("OriginInstanceAddress", request.originInstanceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originInstanceName)) {
            query.put("OriginInstanceName", request.originInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originInstanceNamespace)) {
            query.put("OriginInstanceNamespace", request.originInstanceNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectDesc)) {
            query.put("ProjectDesc", request.projectDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetClusterName)) {
            query.put("TargetClusterName", request.targetClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetClusterUrl)) {
            query.put("TargetClusterUrl", request.targetClusterUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            query.put("TargetInstanceId", request.targetInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMigrationTask"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMigrationTaskResponse());
    }

    /**
     * @summary Adds a migration task.
     *
     * @param request AddMigrationTaskRequest
     * @return AddMigrationTaskResponse
     */
    public AddMigrationTaskResponse addMigrationTask(AddMigrationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMigrationTaskWithOptions(request, runtime);
    }

    /**
     * @summary Creates a mock rule.
     *
     * @param request AddMockRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMockRuleResponse
     */
    public AddMockRuleResponse addMockRuleWithOptions(AddMockRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerAppIds)) {
            query.put("ConsumerAppIds", request.consumerAppIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dubboMockItems)) {
            query.put("DubboMockItems", request.dubboMockItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraJson)) {
            query.put("ExtraJson", request.extraJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mockType)) {
            query.put("MockType", request.mockType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerAppId)) {
            query.put("ProviderAppId", request.providerAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerAppName)) {
            query.put("ProviderAppName", request.providerAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scMockItems)) {
            query.put("ScMockItems", request.scMockItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMockRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMockRuleResponse());
    }

    /**
     * @summary Creates a mock rule.
     *
     * @param request AddMockRuleRequest
     * @return AddMockRuleResponse
     */
    public AddMockRuleResponse addMockRule(AddMockRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMockRuleWithOptions(request, runtime);
    }

    /**
     * @summary Associates a certificate with a domain name of a gateway. You can specify a certificate that is hosted in Alibaba Cloud Security.
     *
     * @param request AddSSLCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSSLCertResponse
     */
    public AddSSLCertResponse addSSLCertWithOptions(AddSSLCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSSLCert"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSSLCertResponse());
    }

    /**
     * @summary Associates a certificate with a domain name of a gateway. You can specify a certificate that is hosted in Alibaba Cloud Security.
     *
     * @param request AddSSLCertRequest
     * @return AddSSLCertResponse
     */
    public AddSSLCertResponse addSSLCert(AddSSLCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSSLCertWithOptions(request, runtime);
    }

    /**
     * @summary Creates a security group rule for a gateway.
     *
     * @param request AddSecurityGroupRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSecurityGroupRuleResponse
     */
    public AddSecurityGroupRuleResponse addSecurityGroupRuleWithOptions(AddSecurityGroupRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRange)) {
            query.put("PortRange", request.portRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSecurityGroupRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSecurityGroupRuleResponse());
    }

    /**
     * @summary Creates a security group rule for a gateway.
     *
     * @param request AddSecurityGroupRuleRequest
     * @return AddSecurityGroupRuleResponse
     */
    public AddSecurityGroupRuleResponse addSecurityGroupRule(AddSecurityGroupRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSecurityGroupRuleWithOptions(request, runtime);
    }

    /**
     * @summary Adds a Nacos service source.
     *
     * @param tmpReq AddServiceSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddServiceSourceResponse
     */
    public AddServiceSourceResponse addServiceSourceWithOptions(AddServiceSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddServiceSourceShrinkRequest request = new AddServiceSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupList)) {
            request.groupListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupList, "GroupList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ingressOptionsRequest)) {
            request.ingressOptionsRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ingressOptionsRequest, "IngressOptionsRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pathList)) {
            request.pathListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pathList, "PathList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toAuthorizeSecurityGroups)) {
            request.toAuthorizeSecurityGroupsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toAuthorizeSecurityGroups, "ToAuthorizeSecurityGroups", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupListShrink)) {
            query.put("GroupList", request.groupListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressOptionsRequestShrink)) {
            query.put("IngressOptionsRequest", request.ingressOptionsRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathListShrink)) {
            query.put("PathList", request.pathListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toAuthorizeSecurityGroupsShrink)) {
            query.put("ToAuthorizeSecurityGroups", request.toAuthorizeSecurityGroupsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddServiceSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddServiceSourceResponse());
    }

    /**
     * @summary Adds a Nacos service source.
     *
     * @param request AddServiceSourceRequest
     * @return AddServiceSourceResponse
     */
    public AddServiceSourceResponse addServiceSource(AddServiceSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addServiceSourceWithOptions(request, runtime);
    }

    /**
     * @summary Publishes a route for a gateway.
     *
     * @param request ApplyGatewayRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyGatewayRouteResponse
     */
    public ApplyGatewayRouteResponse applyGatewayRouteWithOptions(ApplyGatewayRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyGatewayRoute"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyGatewayRouteResponse());
    }

    /**
     * @summary Publishes a route for a gateway.
     *
     * @param request ApplyGatewayRouteRequest
     * @return ApplyGatewayRouteResponse
     */
    public ApplyGatewayRouteResponse applyGatewayRoute(ApplyGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyGatewayRouteWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a tag-based routing rule.
     *
     * @param tmpReq ApplyTagPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyTagPoliciesResponse
     */
    public ApplyTagPoliciesResponse applyTagPoliciesWithOptions(ApplyTagPoliciesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyTagPoliciesShrinkRequest request = new ApplyTagPoliciesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            query.put("Rules", request.rulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyTagPolicies"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyTagPoliciesResponse());
    }

    /**
     * @summary Modifies a tag-based routing rule.
     *
     * @param request ApplyTagPoliciesRequest
     * @return ApplyTagPoliciesResponse
     */
    public ApplyTagPoliciesResponse applyTagPolicies(ApplyTagPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyTagPoliciesWithOptions(request, runtime);
    }

    /**
     * @summary 绑定流量防护行为
     *
     * @param request BindSentinelBlockFallbackDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindSentinelBlockFallbackDefinitionResponse
     */
    public BindSentinelBlockFallbackDefinitionResponse bindSentinelBlockFallbackDefinitionWithOptions(BindSentinelBlockFallbackDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackId)) {
            query.put("FallbackId", request.fallbackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindSentinelBlockFallbackDefinition"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindSentinelBlockFallbackDefinitionResponse());
    }

    /**
     * @summary 绑定流量防护行为
     *
     * @param request BindSentinelBlockFallbackDefinitionRequest
     * @return BindSentinelBlockFallbackDefinitionResponse
     */
    public BindSentinelBlockFallbackDefinitionResponse bindSentinelBlockFallbackDefinition(BindSentinelBlockFallbackDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindSentinelBlockFallbackDefinitionWithOptions(request, runtime);
    }

    /**
     * @summary Clones an existing Nacos configuration from a namespace to another namespace.
     *
     * @description mse-200-105
     *
     * @param request CloneNacosConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneNacosConfigResponse
     */
    public CloneNacosConfigResponse cloneNacosConfigWithOptions(CloneNacosConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originNamespaceId)) {
            query.put("OriginNamespaceId", request.originNamespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNamespaceId)) {
            query.put("TargetNamespaceId", request.targetNamespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneNacosConfigResponse());
    }

    /**
     * @summary Clones an existing Nacos configuration from a namespace to another namespace.
     *
     * @description mse-200-105
     *
     * @param request CloneNacosConfigRequest
     * @return CloneNacosConfigResponse
     */
    public CloneNacosConfigResponse cloneNacosConfig(CloneNacosConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloneNacosConfigWithOptions(request, runtime);
    }

    /**
     * @summary 从AHAS侧复制规则
     *
     * @param request CloneSentinelRuleFromAhasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloneSentinelRuleFromAhasResponse
     */
    public CloneSentinelRuleFromAhasResponse cloneSentinelRuleFromAhasWithOptions(CloneSentinelRuleFromAhasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ahasNamespace)) {
            query.put("AhasNamespace", request.ahasNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAHASPublicRegion)) {
            query.put("IsAHASPublicRegion", request.isAHASPublicRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloneSentinelRuleFromAhas"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloneSentinelRuleFromAhasResponse());
    }

    /**
     * @summary 从AHAS侧复制规则
     *
     * @param request CloneSentinelRuleFromAhasRequest
     * @return CloneSentinelRuleFromAhasResponse
     */
    public CloneSentinelRuleFromAhasResponse cloneSentinelRuleFromAhas(CloneSentinelRuleFromAhasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloneSentinelRuleFromAhasWithOptions(request, runtime);
    }

    /**
     * @summary Creates an application.
     *
     * @param request CreateApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sentinelEnable)) {
            query.put("SentinelEnable", request.sentinelEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchEnable)) {
            query.put("SwitchEnable", request.switchEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    /**
     * @summary Creates an application.
     *
     * @param request CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Creates a circuit breaking rule.
     *
     * @param request CreateCircuitBreakerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCircuitBreakerRuleResponse
     */
    public CreateCircuitBreakerRuleResponse createCircuitBreakerRuleWithOptions(CreateCircuitBreakerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.halfOpenBaseAmountPerStep)) {
            query.put("HalfOpenBaseAmountPerStep", request.halfOpenBaseAmountPerStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.halfOpenRecoveryStepNum)) {
            query.put("HalfOpenRecoveryStepNum", request.halfOpenRecoveryStepNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAllowedRtMs)) {
            query.put("MaxAllowedRtMs", request.maxAllowedRtMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRequestAmount)) {
            query.put("MinRequestAmount", request.minRequestAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryTimeoutMs)) {
            query.put("RetryTimeoutMs", request.retryTimeoutMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statIntervalMs)) {
            query.put("StatIntervalMs", request.statIntervalMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("Strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCircuitBreakerRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCircuitBreakerRuleResponse());
    }

    /**
     * @summary Creates a circuit breaking rule.
     *
     * @param request CreateCircuitBreakerRuleRequest
     * @return CreateCircuitBreakerRuleResponse
     */
    public CreateCircuitBreakerRuleResponse createCircuitBreakerRule(CreateCircuitBreakerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCircuitBreakerRuleWithOptions(request, runtime);
    }

    /**
     * @summary Creates a Microservices Engine (MSE) instance, such as an MSE ZooKeeper instance or an MSE Nacos instance.
     *
     * @description Before you call this API operation, you must make sure that you fully understand the billing methods and pricing of MSE.
     *
     * @param request CreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpecification)) {
            query.put("ClusterSpecification", request.clusterSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterVersion)) {
            query.put("ClusterVersion", request.clusterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionType)) {
            query.put("ConnectionType", request.connectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipEnabled)) {
            query.put("EipEnabled", request.eipEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCount)) {
            query.put("InstanceCount", request.instanceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseVersion)) {
            query.put("MseVersion", request.mseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netType)) {
            query.put("NetType", request.netType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateSlbSpecification)) {
            query.put("PrivateSlbSpecification", request.privateSlbSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubNetworkFlow)) {
            query.put("PubNetworkFlow", request.pubNetworkFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubSlbSpecification)) {
            query.put("PubSlbSpecification", request.pubSlbSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupType)) {
            query.put("SecurityGroupType", request.securityGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    /**
     * @summary Creates a Microservices Engine (MSE) instance, such as an MSE ZooKeeper instance or an MSE Nacos instance.
     *
     * @description Before you call this API operation, you must make sure that you fully understand the billing methods and pricing of MSE.
     *
     * @param request CreateClusterRequest
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    /**
     * @summary Creates a namespace in a Nacos instance.
     *
     * @param request CreateEngineNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEngineNamespaceResponse
     */
    public CreateEngineNamespaceResponse createEngineNamespaceWithOptions(CreateEngineNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCount)) {
            query.put("ServiceCount", request.serviceCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEngineNamespace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEngineNamespaceResponse());
    }

    /**
     * @summary Creates a namespace in a Nacos instance.
     *
     * @param request CreateEngineNamespaceRequest
     * @return CreateEngineNamespaceResponse
     */
    public CreateEngineNamespaceResponse createEngineNamespace(CreateEngineNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEngineNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a throttling rule.
     *
     * @param request CreateFlowRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlowRuleResponse
     */
    public CreateFlowRuleResponse createFlowRuleWithOptions(CreateFlowRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlBehavior)) {
            query.put("ControlBehavior", request.controlBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxQueueingTimeMs)) {
            query.put("MaxQueueingTimeMs", request.maxQueueingTimeMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlowRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowRuleResponse());
    }

    /**
     * @summary Creates a throttling rule.
     *
     * @param request CreateFlowRuleRequest
     * @return CreateFlowRuleResponse
     */
    public CreateFlowRuleResponse createFlowRule(CreateFlowRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlowRuleWithOptions(request, runtime);
    }

    /**
     * @summary 创建网关路由熔断规则
     *
     * @param request CreateGatewayCircuitBreakerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayCircuitBreakerRuleResponse
     */
    public CreateGatewayCircuitBreakerRuleResponse createGatewayCircuitBreakerRuleWithOptions(CreateGatewayCircuitBreakerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.behaviorType)) {
            query.put("BehaviorType", request.behaviorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyEncoding)) {
            query.put("BodyEncoding", request.bodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAllowedMs)) {
            query.put("MaxAllowedMs", request.maxAllowedMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRequestAmount)) {
            query.put("MinRequestAmount", request.minRequestAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryTimeoutSec)) {
            query.put("RecoveryTimeoutSec", request.recoveryTimeoutSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentBody)) {
            query.put("ResponseContentBody", request.responseContentBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRedirectUrl)) {
            query.put("ResponseRedirectUrl", request.responseRedirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseStatusCode)) {
            query.put("ResponseStatusCode", request.responseStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDurationSec)) {
            query.put("StatDurationSec", request.statDurationSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("Strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerRatio)) {
            query.put("TriggerRatio", request.triggerRatio);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayCircuitBreakerRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayCircuitBreakerRuleResponse());
    }

    /**
     * @summary 创建网关路由熔断规则
     *
     * @param request CreateGatewayCircuitBreakerRuleRequest
     * @return CreateGatewayCircuitBreakerRuleResponse
     */
    public CreateGatewayCircuitBreakerRuleResponse createGatewayCircuitBreakerRule(CreateGatewayCircuitBreakerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGatewayCircuitBreakerRuleWithOptions(request, runtime);
    }

    /**
     * @summary 创建网关路由流控规则
     *
     * @param request CreateGatewayFlowRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayFlowRuleResponse
     */
    public CreateGatewayFlowRuleResponse createGatewayFlowRuleWithOptions(CreateGatewayFlowRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.behaviorType)) {
            query.put("BehaviorType", request.behaviorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyEncoding)) {
            query.put("BodyEncoding", request.bodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentBody)) {
            query.put("ResponseContentBody", request.responseContentBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRedirectUrl)) {
            query.put("ResponseRedirectUrl", request.responseRedirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseStatusCode)) {
            query.put("ResponseStatusCode", request.responseStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayFlowRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayFlowRuleResponse());
    }

    /**
     * @summary 创建网关路由流控规则
     *
     * @param request CreateGatewayFlowRuleRequest
     * @return CreateGatewayFlowRuleResponse
     */
    public CreateGatewayFlowRuleResponse createGatewayFlowRule(CreateGatewayFlowRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGatewayFlowRuleWithOptions(request, runtime);
    }

    /**
     * @summary 创建网关路由隔离规则
     *
     * @param request CreateGatewayIsolationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGatewayIsolationRuleResponse
     */
    public CreateGatewayIsolationRuleResponse createGatewayIsolationRuleWithOptions(CreateGatewayIsolationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.behaviorType)) {
            query.put("BehaviorType", request.behaviorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyEncoding)) {
            query.put("BodyEncoding", request.bodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            query.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentBody)) {
            query.put("ResponseContentBody", request.responseContentBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRedirectUrl)) {
            query.put("ResponseRedirectUrl", request.responseRedirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseStatusCode)) {
            query.put("ResponseStatusCode", request.responseStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGatewayIsolationRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGatewayIsolationRuleResponse());
    }

    /**
     * @summary 创建网关路由隔离规则
     *
     * @param request CreateGatewayIsolationRuleRequest
     * @return CreateGatewayIsolationRuleResponse
     */
    public CreateGatewayIsolationRuleResponse createGatewayIsolationRule(CreateGatewayIsolationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGatewayIsolationRuleWithOptions(request, runtime);
    }

    /**
     * @summary 创建隔离规则
     *
     * @param request CreateIsolationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIsolationRuleResponse
     */
    public CreateIsolationRuleResponse createIsolationRuleWithOptions(CreateIsolationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIsolationRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIsolationRuleResponse());
    }

    /**
     * @summary 创建隔离规则
     *
     * @param request CreateIsolationRuleRequest
     * @return CreateIsolationRuleResponse
     */
    public CreateIsolationRuleResponse createIsolationRule(CreateIsolationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIsolationRuleWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI CreateMseServiceApplication is deprecated, please use mse::2019-05-31::CreateApplication instead.
     *
     * @summary Creates an application.
     *
     * @param request CreateMseServiceApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMseServiceApplicationResponse
     */
    // Deprecated
    public CreateMseServiceApplicationResponse createMseServiceApplicationWithOptions(CreateMseServiceApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            query.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseVersion)) {
            query.put("MseVersion", request.mseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sentinelEnable)) {
            query.put("SentinelEnable", request.sentinelEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchEnable)) {
            query.put("SwitchEnable", request.switchEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMseServiceApplication"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMseServiceApplicationResponse());
    }

    /**
     * @deprecated OpenAPI CreateMseServiceApplication is deprecated, please use mse::2019-05-31::CreateApplication instead.
     *
     * @summary Creates an application.
     *
     * @param request CreateMseServiceApplicationRequest
     * @return CreateMseServiceApplicationResponse
     */
    // Deprecated
    public CreateMseServiceApplicationResponse createMseServiceApplication(CreateMseServiceApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMseServiceApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Creates a Nacos configuration.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request CreateNacosConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNacosConfigResponse
     */
    public CreateNacosConfigResponse createNacosConfigWithOptions(CreateNacosConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.betaIps)) {
            query.put("BetaIps", request.betaIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNacosConfigResponse());
    }

    /**
     * @summary Creates a Nacos configuration.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request CreateNacosConfigRequest
     * @return CreateNacosConfigResponse
     */
    public CreateNacosConfigResponse createNacosConfig(CreateNacosConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNacosConfigWithOptions(request, runtime);
    }

    /**
     * @summary Creates a Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request CreateNacosInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNacosInstanceResponse
     */
    public CreateNacosInstanceResponse createNacosInstanceWithOptions(CreateNacosInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeral)) {
            query.put("Ephemeral", request.ephemeral);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("Metadata", request.metadata);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNacosInstance"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNacosInstanceResponse());
    }

    /**
     * @summary Creates a Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request CreateNacosInstanceRequest
     * @return CreateNacosInstanceResponse
     */
    public CreateNacosInstanceResponse createNacosInstance(CreateNacosInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNacosInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a Nacos service.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request CreateNacosServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNacosServiceResponse
     */
    public CreateNacosServiceResponse createNacosServiceWithOptions(CreateNacosServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeral)) {
            query.put("Ephemeral", request.ephemeral);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectThreshold)) {
            query.put("ProtectThreshold", request.protectThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNacosService"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNacosServiceResponse());
    }

    /**
     * @summary Creates a Nacos service.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request CreateNacosServiceRequest
     * @return CreateNacosServiceResponse
     */
    public CreateNacosServiceResponse createNacosService(CreateNacosServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNacosServiceWithOptions(request, runtime);
    }

    /**
     * @summary Creates or updates a lane for end-to-end canary release.
     *
     * @param tmpReq CreateOrUpdateSwimmingLaneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateSwimmingLaneResponse
     */
    public CreateOrUpdateSwimmingLaneResponse createOrUpdateSwimmingLaneWithOptions(CreateOrUpdateSwimmingLaneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrUpdateSwimmingLaneShrinkRequest request = new CreateOrUpdateSwimmingLaneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.gatewaySwimmingLaneRouteJson)) {
            request.gatewaySwimmingLaneRouteJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.gatewaySwimmingLaneRouteJson, "GatewaySwimmingLaneRouteJson", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRules)) {
            query.put("EnableRules", request.enableRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryRule)) {
            query.put("EntryRule", request.entryRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewaySwimmingLaneRouteJsonShrink)) {
            query.put("GatewaySwimmingLaneRouteJson", request.gatewaySwimmingLaneRouteJsonShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathIndependentPercentageEnable)) {
            query.put("PathIndependentPercentageEnable", request.pathIndependentPercentageEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entryRules)) {
            body.put("EntryRules", request.entryRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateSwimmingLane"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateSwimmingLaneResponse());
    }

    /**
     * @summary Creates or updates a lane for end-to-end canary release.
     *
     * @param request CreateOrUpdateSwimmingLaneRequest
     * @return CreateOrUpdateSwimmingLaneResponse
     */
    public CreateOrUpdateSwimmingLaneResponse createOrUpdateSwimmingLane(CreateOrUpdateSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateSwimmingLaneWithOptions(request, runtime);
    }

    /**
     * @summary Creates or updates a lane group for end-to-end canary release.
     *
     * @param tmpReq CreateOrUpdateSwimmingLaneGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateSwimmingLaneGroupResponse
     */
    public CreateOrUpdateSwimmingLaneGroupResponse createOrUpdateSwimmingLaneGroupWithOptions(CreateOrUpdateSwimmingLaneGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrUpdateSwimmingLaneGroupShrinkRequest request = new CreateOrUpdateSwimmingLaneGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.paths)) {
            request.pathsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.paths, "Paths", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.routeIds)) {
            request.routeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.routeIds, "RouteIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.canaryModel)) {
            query.put("CanaryModel", request.canaryModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbGrayEnable)) {
            query.put("DbGrayEnable", request.dbGrayEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryApp)) {
            query.put("EntryApp", request.entryApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageQueueFilterSide)) {
            query.put("MessageQueueFilterSide", request.messageQueueFilterSide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageQueueGrayEnable)) {
            query.put("MessageQueueGrayEnable", request.messageQueueGrayEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathsShrink)) {
            query.put("Paths", request.pathsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordCanaryDetail)) {
            query.put("RecordCanaryDetail", request.recordCanaryDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeIdsShrink)) {
            query.put("RouteIds", request.routeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateSwimmingLaneGroup"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateSwimmingLaneGroupResponse());
    }

    /**
     * @summary Creates or updates a lane group for end-to-end canary release.
     *
     * @param request CreateOrUpdateSwimmingLaneGroupRequest
     * @return CreateOrUpdateSwimmingLaneGroupResponse
     */
    public CreateOrUpdateSwimmingLaneGroupResponse createOrUpdateSwimmingLaneGroup(CreateOrUpdateSwimmingLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrUpdateSwimmingLaneGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates a znode.
     *
     * @param request CreateZnodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateZnodeResponse
     */
    public CreateZnodeResponse createZnodeWithOptions(CreateZnodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateZnode"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateZnodeResponse());
    }

    /**
     * @summary Creates a znode.
     *
     * @param request CreateZnodeRequest
     * @return CreateZnodeResponse
     */
    public CreateZnodeResponse createZnode(CreateZnodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createZnodeWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an authorized resource.
     *
     * @param request DeleteAuthResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAuthResourceResponse
     */
    public DeleteAuthResourceResponse deleteAuthResourceWithOptions(DeleteAuthResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthResource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthResourceResponse());
    }

    /**
     * @summary Deletes an authorized resource.
     *
     * @param request DeleteAuthResourceRequest
     * @return DeleteAuthResourceResponse
     */
    public DeleteAuthResourceResponse deleteAuthResource(DeleteAuthResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAuthResourceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes circuit breaking rules.
     *
     * @param tmpReq DeleteCircuitBreakerRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCircuitBreakerRulesResponse
     */
    public DeleteCircuitBreakerRulesResponse deleteCircuitBreakerRulesWithOptions(DeleteCircuitBreakerRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteCircuitBreakerRulesShrinkRequest request = new DeleteCircuitBreakerRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCircuitBreakerRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCircuitBreakerRulesResponse());
    }

    /**
     * @summary Deletes circuit breaking rules.
     *
     * @param request DeleteCircuitBreakerRulesRequest
     * @return DeleteCircuitBreakerRulesResponse
     */
    public DeleteCircuitBreakerRulesResponse deleteCircuitBreakerRules(DeleteCircuitBreakerRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCircuitBreakerRulesWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a Microservices Engine (MSE) instance.
     *
     * @param request DeleteClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    /**
     * @summary Deletes a Microservices Engine (MSE) instance.
     *
     * @param request DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a namespace from a Nacos instance.
     *
     * @param request DeleteEngineNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEngineNamespaceResponse
     */
    public DeleteEngineNamespaceResponse deleteEngineNamespaceWithOptions(DeleteEngineNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEngineNamespace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEngineNamespaceResponse());
    }

    /**
     * @summary Deletes a namespace from a Nacos instance.
     *
     * @param request DeleteEngineNamespaceRequest
     * @return DeleteEngineNamespaceResponse
     */
    public DeleteEngineNamespaceResponse deleteEngineNamespace(DeleteEngineNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEngineNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes throttling rules.
     *
     * @param tmpReq DeleteFlowRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlowRulesResponse
     */
    public DeleteFlowRulesResponse deleteFlowRulesWithOptions(DeleteFlowRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteFlowRulesShrinkRequest request = new DeleteFlowRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFlowRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlowRulesResponse());
    }

    /**
     * @summary Deletes throttling rules.
     *
     * @param request DeleteFlowRulesRequest
     * @return DeleteFlowRulesResponse
     */
    public DeleteFlowRulesResponse deleteFlowRules(DeleteFlowRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlowRulesWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a gateway.
     *
     * @param request DeleteGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGatewayWithOptions(DeleteGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteSlb)) {
            query.put("DeleteSlb", request.deleteSlb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGateway"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayResponse());
    }

    /**
     * @summary Deletes a gateway.
     *
     * @param request DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    public DeleteGatewayResponse deleteGateway(DeleteGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a consumer on which a gateway performs authentication operations.
     *
     * @param request DeleteGatewayAuthConsumerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayAuthConsumerResponse
     */
    public DeleteGatewayAuthConsumerResponse deleteGatewayAuthConsumerWithOptions(DeleteGatewayAuthConsumerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayAuthConsumer"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayAuthConsumerResponse());
    }

    /**
     * @summary Deletes a consumer on which a gateway performs authentication operations.
     *
     * @param request DeleteGatewayAuthConsumerRequest
     * @return DeleteGatewayAuthConsumerResponse
     */
    public DeleteGatewayAuthConsumerResponse deleteGatewayAuthConsumer(DeleteGatewayAuthConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayAuthConsumerWithOptions(request, runtime);
    }

    /**
     * @summary Deletes resource permissions from the consumer on which a gateway performs authentication operations.
     *
     * @param request DeleteGatewayAuthConsumerResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayAuthConsumerResourceResponse
     */
    public DeleteGatewayAuthConsumerResourceResponse deleteGatewayAuthConsumerResourceWithOptions(DeleteGatewayAuthConsumerResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idList)) {
            query.put("IdList", request.idList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayAuthConsumerResource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayAuthConsumerResourceResponse());
    }

    /**
     * @summary Deletes resource permissions from the consumer on which a gateway performs authentication operations.
     *
     * @param request DeleteGatewayAuthConsumerResourceRequest
     * @return DeleteGatewayAuthConsumerResourceResponse
     */
    public DeleteGatewayAuthConsumerResourceResponse deleteGatewayAuthConsumerResource(DeleteGatewayAuthConsumerResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayAuthConsumerResourceWithOptions(request, runtime);
    }

    /**
     * @summary 删除网关路由熔断规则
     *
     * @param request DeleteGatewayCircuitBreakerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayCircuitBreakerRuleResponse
     */
    public DeleteGatewayCircuitBreakerRuleResponse deleteGatewayCircuitBreakerRuleWithOptions(DeleteGatewayCircuitBreakerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayCircuitBreakerRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayCircuitBreakerRuleResponse());
    }

    /**
     * @summary 删除网关路由熔断规则
     *
     * @param request DeleteGatewayCircuitBreakerRuleRequest
     * @return DeleteGatewayCircuitBreakerRuleResponse
     */
    public DeleteGatewayCircuitBreakerRuleResponse deleteGatewayCircuitBreakerRule(DeleteGatewayCircuitBreakerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayCircuitBreakerRuleWithOptions(request, runtime);
    }

    /**
     * @summary Disassociates a domain name from a gateway.
     *
     * @param request DeleteGatewayDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayDomainResponse
     */
    public DeleteGatewayDomainResponse deleteGatewayDomainWithOptions(DeleteGatewayDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayDomain"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayDomainResponse());
    }

    /**
     * @summary Disassociates a domain name from a gateway.
     *
     * @param request DeleteGatewayDomainRequest
     * @return DeleteGatewayDomainResponse
     */
    public DeleteGatewayDomainResponse deleteGatewayDomain(DeleteGatewayDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayDomainWithOptions(request, runtime);
    }

    /**
     * @summary 删除网关路由流控规则
     *
     * @param request DeleteGatewayFlowRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayFlowRuleResponse
     */
    public DeleteGatewayFlowRuleResponse deleteGatewayFlowRuleWithOptions(DeleteGatewayFlowRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayFlowRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayFlowRuleResponse());
    }

    /**
     * @summary 删除网关路由流控规则
     *
     * @param request DeleteGatewayFlowRuleRequest
     * @return DeleteGatewayFlowRuleResponse
     */
    public DeleteGatewayFlowRuleResponse deleteGatewayFlowRule(DeleteGatewayFlowRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayFlowRuleWithOptions(request, runtime);
    }

    /**
     * @summary 删除网关路由隔离规则
     *
     * @param request DeleteGatewayIsolationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayIsolationRuleResponse
     */
    public DeleteGatewayIsolationRuleResponse deleteGatewayIsolationRuleWithOptions(DeleteGatewayIsolationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayIsolationRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayIsolationRuleResponse());
    }

    /**
     * @summary 删除网关路由隔离规则
     *
     * @param request DeleteGatewayIsolationRuleRequest
     * @return DeleteGatewayIsolationRuleResponse
     */
    public DeleteGatewayIsolationRuleResponse deleteGatewayIsolationRule(DeleteGatewayIsolationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayIsolationRuleWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a route from a gateway.
     *
     * @param request DeleteGatewayRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayRouteResponse
     */
    public DeleteGatewayRouteResponse deleteGatewayRouteWithOptions(DeleteGatewayRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayRoute"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayRouteResponse());
    }

    /**
     * @summary Deletes a route from a gateway.
     *
     * @param request DeleteGatewayRouteRequest
     * @return DeleteGatewayRouteResponse
     */
    public DeleteGatewayRouteResponse deleteGatewayRoute(DeleteGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayRouteWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a service from a gateway.
     *
     * @param request DeleteGatewayServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayServiceResponse
     */
    public DeleteGatewayServiceResponse deleteGatewayServiceWithOptions(DeleteGatewayServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayService"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayServiceResponse());
    }

    /**
     * @summary Deletes a service from a gateway.
     *
     * @param request DeleteGatewayServiceRequest
     * @return DeleteGatewayServiceResponse
     */
    public DeleteGatewayServiceResponse deleteGatewayService(DeleteGatewayServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayServiceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a service version from a gateway.
     *
     * @param request DeleteGatewayServiceVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewayServiceVersionResponse
     */
    public DeleteGatewayServiceVersionResponse deleteGatewayServiceVersionWithOptions(DeleteGatewayServiceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayServiceVersion"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayServiceVersionResponse());
    }

    /**
     * @summary Deletes a service version from a gateway.
     *
     * @param request DeleteGatewayServiceVersionRequest
     * @return DeleteGatewayServiceVersionResponse
     */
    public DeleteGatewayServiceVersionResponse deleteGatewayServiceVersion(DeleteGatewayServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewayServiceVersionWithOptions(request, runtime);
    }

    /**
     * @summary Deletes the Server Load Balancer (SLB) instance that is associated with a gateway.
     *
     * @param request DeleteGatewaySlbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGatewaySlbResponse
     */
    public DeleteGatewaySlbResponse deleteGatewaySlbWithOptions(DeleteGatewaySlbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteSlb)) {
            query.put("DeleteSlb", request.deleteSlb);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewaySlb"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewaySlbResponse());
    }

    /**
     * @summary Deletes the Server Load Balancer (SLB) instance that is associated with a gateway.
     *
     * @param request DeleteGatewaySlbRequest
     * @return DeleteGatewaySlbResponse
     */
    public DeleteGatewaySlbResponse deleteGatewaySlb(DeleteGatewaySlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGatewaySlbWithOptions(request, runtime);
    }

    /**
     * @summary 删除隔离规则
     *
     * @param tmpReq DeleteIsolationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIsolationRulesResponse
     */
    public DeleteIsolationRulesResponse deleteIsolationRulesWithOptions(DeleteIsolationRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteIsolationRulesShrinkRequest request = new DeleteIsolationRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIsolationRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIsolationRulesResponse());
    }

    /**
     * @summary 删除隔离规则
     *
     * @param request DeleteIsolationRulesRequest
     * @return DeleteIsolationRulesResponse
     */
    public DeleteIsolationRulesResponse deleteIsolationRules(DeleteIsolationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIsolationRulesWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a migration task.
     *
     * @param request DeleteMigrationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMigrationTaskResponse
     */
    public DeleteMigrationTaskResponse deleteMigrationTaskWithOptions(DeleteMigrationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMigrationTask"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMigrationTaskResponse());
    }

    /**
     * @summary Deletes a migration task.
     *
     * @param request DeleteMigrationTaskRequest
     * @return DeleteMigrationTaskResponse
     */
    public DeleteMigrationTaskResponse deleteMigrationTask(DeleteMigrationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMigrationTaskWithOptions(request, runtime);
    }

    /**
     * @summary 删除nacos指定配置
     *
     * @param request DeleteNacosConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNacosConfigResponse
     */
    public DeleteNacosConfigResponse deleteNacosConfigWithOptions(DeleteNacosConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beta)) {
            query.put("Beta", request.beta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNacosConfigResponse());
    }

    /**
     * @summary 删除nacos指定配置
     *
     * @param request DeleteNacosConfigRequest
     * @return DeleteNacosConfigResponse
     */
    public DeleteNacosConfigResponse deleteNacosConfig(DeleteNacosConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNacosConfigWithOptions(request, runtime);
    }

    /**
     * @summary Deletes multiple Nacos configurations at a time.
     *
     * @description >  The current API operation is not provided in Nacos SDK. For more information about the Nacos-SDK API, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request DeleteNacosConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNacosConfigsResponse
     */
    public DeleteNacosConfigsResponse deleteNacosConfigsWithOptions(DeleteNacosConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNacosConfigs"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNacosConfigsResponse());
    }

    /**
     * @summary Deletes multiple Nacos configurations at a time.
     *
     * @description >  The current API operation is not provided in Nacos SDK. For more information about the Nacos-SDK API, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request DeleteNacosConfigsRequest
     * @return DeleteNacosConfigsResponse
     */
    public DeleteNacosConfigsResponse deleteNacosConfigs(DeleteNacosConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNacosConfigsWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a persistent application instance from a Microservices Engine (MSE) Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request DeleteNacosInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNacosInstanceResponse
     */
    public DeleteNacosInstanceResponse deleteNacosInstanceWithOptions(DeleteNacosInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeral)) {
            query.put("Ephemeral", request.ephemeral);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNacosInstance"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNacosInstanceResponse());
    }

    /**
     * @summary Deletes a persistent application instance from a Microservices Engine (MSE) Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request DeleteNacosInstanceRequest
     * @return DeleteNacosInstanceResponse
     */
    public DeleteNacosInstanceResponse deleteNacosInstance(DeleteNacosInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNacosInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a Nacos service.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request DeleteNacosServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNacosServiceResponse
     */
    public DeleteNacosServiceResponse deleteNacosServiceWithOptions(DeleteNacosServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNacosService"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNacosServiceResponse());
    }

    /**
     * @summary Deletes a Nacos service.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request DeleteNacosServiceRequest
     * @return DeleteNacosServiceResponse
     */
    public DeleteNacosServiceResponse deleteNacosService(DeleteNacosServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNacosServiceWithOptions(request, runtime);
    }

    /**
     * @summary 删除MSE命名空间
     *
     * @param request DeleteNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNamespace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNamespaceResponse());
    }

    /**
     * @summary 删除MSE命名空间
     *
     * @param request DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a security group rule from a gateway.
     *
     * @param request DeleteSecurityGroupRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityGroupRuleResponse
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRuleWithOptions(DeleteSecurityGroupRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cascadingDelete)) {
            query.put("CascadingDelete", request.cascadingDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityGroupRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityGroupRuleResponse());
    }

    /**
     * @summary Deletes a security group rule from a gateway.
     *
     * @param request DeleteSecurityGroupRuleRequest
     * @return DeleteSecurityGroupRuleResponse
     */
    public DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(DeleteSecurityGroupRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityGroupRuleWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a gateway service source.
     *
     * @param request DeleteServiceSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceSourceResponse
     */
    public DeleteServiceSourceResponse deleteServiceSourceWithOptions(DeleteServiceSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceSourceResponse());
    }

    /**
     * @summary Deletes a gateway service source.
     *
     * @param request DeleteServiceSourceRequest
     * @return DeleteServiceSourceResponse
     */
    public DeleteServiceSourceResponse deleteServiceSource(DeleteServiceSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceSourceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a lane.
     *
     * @param request DeleteSwimmingLaneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSwimmingLaneResponse
     */
    public DeleteSwimmingLaneResponse deleteSwimmingLaneWithOptions(DeleteSwimmingLaneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSwimmingLane"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSwimmingLaneResponse());
    }

    /**
     * @summary Deletes a lane.
     *
     * @param request DeleteSwimmingLaneRequest
     * @return DeleteSwimmingLaneResponse
     */
    public DeleteSwimmingLaneResponse deleteSwimmingLane(DeleteSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSwimmingLaneWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a lane group.
     *
     * @param request DeleteSwimmingLaneGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSwimmingLaneGroupResponse
     */
    public DeleteSwimmingLaneGroupResponse deleteSwimmingLaneGroupWithOptions(DeleteSwimmingLaneGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSwimmingLaneGroup"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSwimmingLaneGroupResponse());
    }

    /**
     * @summary Deletes a lane group.
     *
     * @param request DeleteSwimmingLaneGroupRequest
     * @return DeleteSwimmingLaneGroupResponse
     */
    public DeleteSwimmingLaneGroupResponse deleteSwimmingLaneGroup(DeleteSwimmingLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSwimmingLaneGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a ZooKeeper node.
     *
     * @param request DeleteZnodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteZnodeResponse
     */
    public DeleteZnodeResponse deleteZnodeWithOptions(DeleteZnodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteZnode"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteZnodeResponse());
    }

    /**
     * @summary Deletes a ZooKeeper node.
     *
     * @param request DeleteZnodeRequest
     * @return DeleteZnodeResponse
     */
    public DeleteZnodeResponse deleteZnode(DeleteZnodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteZnodeWithOptions(request, runtime);
    }

    /**
     * @summary Exports specified Nacos configurations.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ExportNacosConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportNacosConfigResponse
     */
    public ExportNacosConfigResponse exportNacosConfigWithOptions(ExportNacosConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataIds)) {
            query.put("DataIds", request.dataIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportNacosConfigResponse());
    }

    /**
     * @summary Exports specified Nacos configurations.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ExportNacosConfigRequest
     * @return ExportNacosConfigResponse
     */
    public ExportNacosConfigResponse exportNacosConfig(ExportNacosConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportNacosConfigWithOptions(request, runtime);
    }

    /**
     * @summary Initiates a task to export ZooKeeper data.
     *
     * @description Only one task can run at a time.
     *
     * @param request ExportZookeeperDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportZookeeperDataResponse
     */
    public ExportZookeeperDataResponse exportZookeeperDataWithOptions(ExportZookeeperDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            query.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportZookeeperData"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportZookeeperDataResponse());
    }

    /**
     * @summary Initiates a task to export ZooKeeper data.
     *
     * @description Only one task can run at a time.
     *
     * @param request ExportZookeeperDataRequest
     * @return ExportZookeeperDataResponse
     */
    public ExportZookeeperDataResponse exportZookeeperData(ExportZookeeperDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportZookeeperDataWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the rules for graceful start and shutdown.
     *
     * @description You can call this operation to query the rules for graceful start and shutdown.
     *
     * @param request FetchLosslessRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchLosslessRuleListResponse
     */
    public FetchLosslessRuleListResponse fetchLosslessRuleListWithOptions(FetchLosslessRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchLosslessRuleList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FetchLosslessRuleListResponse());
    }

    /**
     * @summary Obtains the rules for graceful start and shutdown.
     *
     * @description You can call this operation to query the rules for graceful start and shutdown.
     *
     * @param request FetchLosslessRuleListRequest
     * @return FetchLosslessRuleListResponse
     */
    public FetchLosslessRuleListResponse fetchLosslessRuleList(FetchLosslessRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.fetchLosslessRuleListWithOptions(request, runtime);
    }

    /**
     * @summary Queries information about canary release for messaging of an application.
     *
     * @param request GetAppMessageQueueRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppMessageQueueRouteResponse
     */
    public GetAppMessageQueueRouteResponse getAppMessageQueueRouteWithOptions(GetAppMessageQueueRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppMessageQueueRoute"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppMessageQueueRouteResponse());
    }

    /**
     * @summary Queries information about canary release for messaging of an application.
     *
     * @param request GetAppMessageQueueRouteRequest
     * @return GetAppMessageQueueRouteResponse
     */
    public GetAppMessageQueueRouteResponse getAppMessageQueueRoute(GetAppMessageQueueRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppMessageQueueRouteWithOptions(request, runtime);
    }

    /**
     * @summary Queries the list of microservice application instances.
     *
     * @param request GetApplicationInstanceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationInstanceListResponse
     */
    public GetApplicationInstanceListResponse getApplicationInstanceListWithOptions(GetApplicationInstanceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationInstanceList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationInstanceListResponse());
    }

    /**
     * @summary Queries the list of microservice application instances.
     *
     * @param request GetApplicationInstanceListRequest
     * @return GetApplicationInstanceListResponse
     */
    public GetApplicationInstanceListResponse getApplicationInstanceList(GetApplicationInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationInstanceListWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the list of applications.
     *
     * @param request GetApplicationListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationListResponse
     */
    public GetApplicationListResponse getApplicationListWithOptions(GetApplicationListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sentinelEnable)) {
            query.put("SentinelEnable", request.sentinelEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchEnable)) {
            query.put("SwitchEnable", request.switchEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationListResponse());
    }

    /**
     * @summary Obtains the list of applications.
     *
     * @param request GetApplicationListRequest
     * @return GetApplicationListResponse
     */
    public GetApplicationListResponse getApplicationList(GetApplicationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the blacklist or whitelist of a gateway.
     *
     * @param request GetBlackWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBlackWhiteListResponse
     */
    public GetBlackWhiteListResponse getBlackWhiteListWithOptions(GetBlackWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isWhite)) {
            query.put("IsWhite", request.isWhite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBlackWhiteList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBlackWhiteListResponse());
    }

    /**
     * @summary Queries the blacklist or whitelist of a gateway.
     *
     * @param request GetBlackWhiteListRequest
     * @return GetBlackWhiteListResponse
     */
    public GetBlackWhiteListResponse getBlackWhiteList(GetBlackWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBlackWhiteListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the namespaces of a Nacos instance.
     *
     * @param request GetEngineNamepaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEngineNamepaceResponse
     */
    public GetEngineNamepaceResponse getEngineNamepaceWithOptions(GetEngineNamepaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEngineNamepace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEngineNamepaceResponse());
    }

    /**
     * @summary Queries the namespaces of a Nacos instance.
     *
     * @param request GetEngineNamepaceRequest
     * @return GetEngineNamepaceResponse
     */
    public GetEngineNamepaceResponse getEngineNamepace(GetEngineNamepaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEngineNamepaceWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the basic information about a gateway, such as the virtual private cloud (VPC) and vSwitch to which the gateway belongs.
     *
     * @param request GetGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayResponse
     */
    public GetGatewayResponse getGatewayWithOptions(GetGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGateway"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayResponse());
    }

    /**
     * @summary Obtains the basic information about a gateway, such as the virtual private cloud (VPC) and vSwitch to which the gateway belongs.
     *
     * @param request GetGatewayRequest
     * @return GetGatewayResponse
     */
    public GetGatewayResponse getGateway(GetGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGatewayWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of the consumer on which a gateway performs authentication operations.
     *
     * @param request GetGatewayAuthConsumerDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayAuthConsumerDetailResponse
     */
    public GetGatewayAuthConsumerDetailResponse getGatewayAuthConsumerDetailWithOptions(GetGatewayAuthConsumerDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayAuthConsumerDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayAuthConsumerDetailResponse());
    }

    /**
     * @summary Queries the details of the consumer on which a gateway performs authentication operations.
     *
     * @param request GetGatewayAuthConsumerDetailRequest
     * @return GetGatewayAuthConsumerDetailResponse
     */
    public GetGatewayAuthConsumerDetailResponse getGatewayAuthConsumerDetail(GetGatewayAuthConsumerDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGatewayAuthConsumerDetailWithOptions(request, runtime);
    }

    /**
     * @summary 查询网关认证详情
     *
     * @param request GetGatewayAuthDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayAuthDetailResponse
     */
    public GetGatewayAuthDetailResponse getGatewayAuthDetailWithOptions(GetGatewayAuthDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayAuthDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayAuthDetailResponse());
    }

    /**
     * @summary 查询网关认证详情
     *
     * @param request GetGatewayAuthDetailRequest
     * @return GetGatewayAuthDetailResponse
     */
    public GetGatewayAuthDetailResponse getGatewayAuthDetail(GetGatewayAuthDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGatewayAuthDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a domain name associated with a gateway.
     *
     * @param request GetGatewayDomainDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayDomainDetailResponse
     */
    public GetGatewayDomainDetailResponse getGatewayDomainDetailWithOptions(GetGatewayDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayDomainDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayDomainDetailResponse());
    }

    /**
     * @summary Queries the details of a domain name associated with a gateway.
     *
     * @param request GetGatewayDomainDetailRequest
     * @return GetGatewayDomainDetailResponse
     */
    public GetGatewayDomainDetailResponse getGatewayDomainDetail(GetGatewayDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGatewayDomainDetailWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the global parameters of a gateway.
     *
     * @param request GetGatewayOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayOptionResponse
     */
    public GetGatewayOptionResponse getGatewayOptionWithOptions(GetGatewayOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayOption"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayOptionResponse());
    }

    /**
     * @summary Obtains the global parameters of a gateway.
     *
     * @param request GetGatewayOptionRequest
     * @return GetGatewayOptionResponse
     */
    public GetGatewayOptionResponse getGatewayOption(GetGatewayOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGatewayOptionWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a route for a gateway.
     *
     * @param request GetGatewayRouteDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayRouteDetailResponse
     */
    public GetGatewayRouteDetailResponse getGatewayRouteDetailWithOptions(GetGatewayRouteDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayRouteDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayRouteDetailResponse());
    }

    /**
     * @summary Queries the details of a route for a gateway.
     *
     * @param request GetGatewayRouteDetailRequest
     * @return GetGatewayRouteDetailResponse
     */
    public GetGatewayRouteDetailResponse getGatewayRouteDetail(GetGatewayRouteDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGatewayRouteDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a service.
     *
     * @param request GetGatewayServiceDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayServiceDetailResponse
     */
    public GetGatewayServiceDetailResponse getGatewayServiceDetailWithOptions(GetGatewayServiceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayServiceDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayServiceDetailResponse());
    }

    /**
     * @summary Queries the details of a service.
     *
     * @param request GetGatewayServiceDetailRequest
     * @return GetGatewayServiceDetailResponse
     */
    public GetGatewayServiceDetailResponse getGatewayServiceDetail(GetGatewayServiceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGatewayServiceDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a Container Service for Kubernetes (ACK) cluster for which Microservices Governance is enabled.
     *
     * @param request GetGovernanceKubernetesClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGovernanceKubernetesClusterResponse
     */
    public GetGovernanceKubernetesClusterResponse getGovernanceKubernetesClusterWithOptions(GetGovernanceKubernetesClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGovernanceKubernetesCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGovernanceKubernetesClusterResponse());
    }

    /**
     * @summary Queries the information about a Container Service for Kubernetes (ACK) cluster for which Microservices Governance is enabled.
     *
     * @param request GetGovernanceKubernetesClusterRequest
     * @return GetGovernanceKubernetesClusterResponse
     */
    public GetGovernanceKubernetesClusterResponse getGovernanceKubernetesCluster(GetGovernanceKubernetesClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    /**
     * @summary Queries the maximum version number to which the current version can be upgraded.
     *
     * @param request GetImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageResponse
     */
    public GetImageResponse getImageWithOptions(GetImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionCode)) {
            query.put("VersionCode", request.versionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImage"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageResponse());
    }

    /**
     * @summary Queries the maximum version number to which the current version can be upgraded.
     *
     * @param request GetImageRequest
     * @return GetImageResponse
     */
    public GetImageResponse getImage(GetImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the URL that is used to upload a configuration file when you import the configuration file into a Microservices Engine (MSE) Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).\\n
     *
     * @param request GetImportFileUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImportFileUrlResponse
     */
    public GetImportFileUrlResponse getImportFileUrlWithOptions(GetImportFileUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImportFileUrl"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImportFileUrlResponse());
    }

    /**
     * @summary Obtains the URL that is used to upload a configuration file when you import the configuration file into a Microservices Engine (MSE) Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).\\n
     *
     * @param request GetImportFileUrlRequest
     * @return GetImportFileUrlResponse
     */
    public GetImportFileUrlResponse getImportFileUrl(GetImportFileUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImportFileUrlWithOptions(request, runtime);
    }

    /**
     * @summary Obtains sources of all Container Service for Kubernetes (ACK) services in a gateway.
     *
     * @param request GetKubernetesSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKubernetesSourceResponse
     */
    public GetKubernetesSourceResponse getKubernetesSourceWithOptions(GetKubernetesSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAll)) {
            query.put("IsAll", request.isAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKubernetesSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKubernetesSourceResponse());
    }

    /**
     * @summary Obtains sources of all Container Service for Kubernetes (ACK) services in a gateway.
     *
     * @param request GetKubernetesSourceRequest
     * @return GetKubernetesSourceResponse
     */
    public GetKubernetesSourceResponse getKubernetesSource(GetKubernetesSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getKubernetesSourceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the rules for graceful start and shutdown of an application.
     *
     * @description You can call this operation to query the rules for graceful start and shutdown of an application.
     * You can query the rules for graceful start and shutdown of an application preferentially by using the AppId parameter.
     * If the AppId parameter is left empty, you can use the RegionId, Namespace, and AppName parameters to query the rules for graceful start and shutdown of an application.
     *
     * @param request GetLosslessRuleByAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLosslessRuleByAppResponse
     */
    public GetLosslessRuleByAppResponse getLosslessRuleByAppWithOptions(GetLosslessRuleByAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLosslessRuleByApp"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLosslessRuleByAppResponse());
    }

    /**
     * @summary Queries the rules for graceful start and shutdown of an application.
     *
     * @description You can call this operation to query the rules for graceful start and shutdown of an application.
     * You can query the rules for graceful start and shutdown of an application preferentially by using the AppId parameter.
     * If the AppId parameter is left empty, you can use the RegionId, Namespace, and AppName parameters to query the rules for graceful start and shutdown of an application.
     *
     * @param request GetLosslessRuleByAppRequest
     * @return GetLosslessRuleByAppResponse
     */
    public GetLosslessRuleByAppResponse getLosslessRuleByApp(GetLosslessRuleByAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLosslessRuleByAppWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about the MSE feature switch.
     *
     * @param request GetMseFeatureSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMseFeatureSwitchResponse
     */
    public GetMseFeatureSwitchResponse getMseFeatureSwitchWithOptions(GetMseFeatureSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMseFeatureSwitch"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMseFeatureSwitchResponse());
    }

    /**
     * @summary Queries the information about the MSE feature switch.
     *
     * @param request GetMseFeatureSwitchRequest
     * @return GetMseFeatureSwitchResponse
     */
    public GetMseFeatureSwitchResponse getMseFeatureSwitch(GetMseFeatureSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMseFeatureSwitchWithOptions(request, runtime);
    }

    /**
     * @summary Queries the existing Microservices Engine (MSE) Nacos instances that are service sources of a gateway.
     *
     * @param request GetMseSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMseSourceResponse
     */
    public GetMseSourceResponse getMseSourceWithOptions(GetMseSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMseSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMseSourceResponse());
    }

    /**
     * @summary Queries the existing Microservices Engine (MSE) Nacos instances that are service sources of a gateway.
     *
     * @param request GetMseSourceRequest
     * @return GetMseSourceResponse
     */
    public GetMseSourceResponse getMseSource(GetMseSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMseSourceWithOptions(request, runtime);
    }

    /**
     * @summary Queries Nacos configurations.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request GetNacosConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNacosConfigResponse
     */
    public GetNacosConfigResponse getNacosConfigWithOptions(GetNacosConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beta)) {
            query.put("Beta", request.beta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNacosConfigResponse());
    }

    /**
     * @summary Queries Nacos configurations.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request GetNacosConfigRequest
     * @return GetNacosConfigResponse
     */
    public GetNacosConfigResponse getNacosConfig(GetNacosConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNacosConfigWithOptions(request, runtime);
    }

    /**
     * @summary Queries the historical details of Nacos configuration changes.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request GetNacosHistoryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNacosHistoryConfigResponse
     */
    public GetNacosHistoryConfigResponse getNacosHistoryConfigWithOptions(GetNacosHistoryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nid)) {
            query.put("Nid", request.nid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNacosHistoryConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNacosHistoryConfigResponse());
    }

    /**
     * @summary Queries the historical details of Nacos configuration changes.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request GetNacosHistoryConfigRequest
     * @return GetNacosHistoryConfigResponse
     */
    public GetNacosHistoryConfigResponse getNacosHistoryConfig(GetNacosHistoryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNacosHistoryConfigWithOptions(request, runtime);
    }

    /**
     * @summary Queries information about service governance.
     *
     * @description You can call this operation to query overview information about service governance.
     *
     * @param request GetOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOverviewResponse
     */
    public GetOverviewResponse getOverviewWithOptions(GetOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOverview"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOverviewResponse());
    }

    /**
     * @summary Queries information about service governance.
     *
     * @description You can call this operation to query overview information about service governance.
     *
     * @param request GetOverviewRequest
     * @return GetOverviewResponse
     */
    public GetOverviewResponse getOverview(GetOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOverviewWithOptions(request, runtime);
    }

    /**
     * @summary Obtains plug-in configurations.
     *
     * @param request GetPluginConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPluginConfigResponse
     */
    public GetPluginConfigResponse getPluginConfigWithOptions(GetPluginConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPluginConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPluginConfigResponse());
    }

    /**
     * @summary Obtains plug-in configurations.
     *
     * @param request GetPluginConfigRequest
     * @return GetPluginConfigResponse
     */
    public GetPluginConfigResponse getPluginConfig(GetPluginConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPluginConfigWithOptions(request, runtime);
    }

    /**
     * @summary Obtains plug-ins.
     *
     * @param request GetPluginsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPluginsResponse
     */
    public GetPluginsResponse getPluginsWithOptions(GetPluginsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableOnly)) {
            query.put("EnableOnly", request.enableOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPlugins"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPluginsResponse());
    }

    /**
     * @summary Obtains plug-ins.
     *
     * @param request GetPluginsRequest
     * @return GetPluginsResponse
     */
    public GetPluginsResponse getPlugins(GetPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPluginsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the services of an application.
     *
     * @param request GetServiceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceListResponse
     */
    public GetServiceListResponse getServiceListWithOptions(GetServiceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceListResponse());
    }

    /**
     * @summary Queries the services of an application.
     *
     * @param request GetServiceListRequest
     * @return GetServiceListResponse
     */
    public GetServiceListResponse getServiceList(GetServiceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the version of a microservices application.
     *
     * @param request GetServiceListPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceListPageResponse
     */
    public GetServiceListPageResponse getServiceListPageWithOptions(GetServiceListPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceListPage"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceListPageResponse());
    }

    /**
     * @summary Queries the version of a microservices application.
     *
     * @param request GetServiceListPageRequest
     * @return GetServiceListPageResponse
     */
    public GetServiceListPageResponse getServiceListPage(GetServiceListPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceListPageWithOptions(request, runtime);
    }

    /**
     * @summary Queries the list of listeners for the destination service.
     *
     * @param request GetServiceListenersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceListenersResponse
     */
    public GetServiceListenersResponse getServiceListenersWithOptions(GetServiceListenersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasIpCount)) {
            query.put("HasIpCount", request.hasIpCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceListeners"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceListenersResponse());
    }

    /**
     * @summary Queries the list of listeners for the destination service.
     *
     * @param request GetServiceListenersRequest
     * @return GetServiceListenersResponse
     */
    public GetServiceListenersResponse getServiceListeners(GetServiceListenersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceListenersWithOptions(request, runtime);
    }

    /**
     * @summary 获取服务接口列表
     *
     * @param request GetServiceMethodPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceMethodPageResponse
     */
    public GetServiceMethodPageResponse getServiceMethodPageWithOptions(GetServiceMethodPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodController)) {
            query.put("MethodController", request.methodController);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroup)) {
            query.put("ServiceGroup", request.serviceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceMethodPage"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceMethodPageResponse());
    }

    /**
     * @summary 获取服务接口列表
     *
     * @param request GetServiceMethodPageRequest
     * @return GetServiceMethodPageResponse
     */
    public GetServiceMethodPageResponse getServiceMethodPage(GetServiceMethodPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceMethodPageWithOptions(request, runtime);
    }

    /**
     * @summary Obtains all tags in the current lane group.
     *
     * @param request GetTagsBySwimmingLaneGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTagsBySwimmingLaneGroupIdResponse
     */
    public GetTagsBySwimmingLaneGroupIdResponse getTagsBySwimmingLaneGroupIdWithOptions(GetTagsBySwimmingLaneGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTagsBySwimmingLaneGroupId"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTagsBySwimmingLaneGroupIdResponse());
    }

    /**
     * @summary Obtains all tags in the current lane group.
     *
     * @param request GetTagsBySwimmingLaneGroupIdRequest
     * @return GetTagsBySwimmingLaneGroupIdResponse
     */
    public GetTagsBySwimmingLaneGroupIdResponse getTagsBySwimmingLaneGroupId(GetTagsBySwimmingLaneGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTagsBySwimmingLaneGroupIdWithOptions(request, runtime);
    }

    /**
     * @summary mse-200-105
     *
     * @param request GetZookeeperDataImportUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetZookeeperDataImportUrlResponse
     */
    public GetZookeeperDataImportUrlResponse getZookeeperDataImportUrlWithOptions(GetZookeeperDataImportUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetZookeeperDataImportUrl"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetZookeeperDataImportUrlResponse());
    }

    /**
     * @summary mse-200-105
     *
     * @param request GetZookeeperDataImportUrlRequest
     * @return GetZookeeperDataImportUrlResponse
     */
    public GetZookeeperDataImportUrlResponse getZookeeperDataImportUrl(GetZookeeperDataImportUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getZookeeperDataImportUrlWithOptions(request, runtime);
    }

    /**
     * @summary Imports Nacos configurations as a file.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ImportNacosConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportNacosConfigResponse
     */
    public ImportNacosConfigResponse importNacosConfigWithOptions(ImportNacosConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportNacosConfigResponse());
    }

    /**
     * @summary Imports Nacos configurations as a file.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ImportNacosConfigRequest
     * @return ImportNacosConfigResponse
     */
    public ImportNacosConfigResponse importNacosConfig(ImportNacosConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importNacosConfigWithOptions(request, runtime);
    }

    /**
     * @summary Imports services to a gateway.
     *
     * @param tmpReq ImportServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportServicesResponse
     */
    public ImportServicesResponse importServicesWithOptions(ImportServicesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportServicesShrinkRequest request = new ImportServicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceList)) {
            request.serviceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceList, "ServiceList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fcAlias)) {
            query.put("FcAlias", request.fcAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fcServiceName)) {
            query.put("FcServiceName", request.fcServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fcVersion)) {
            query.put("FcVersion", request.fcVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceListShrink)) {
            query.put("ServiceList", request.serviceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsSetting)) {
            query.put("TlsSetting", request.tlsSetting);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportServices"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportServicesResponse());
    }

    /**
     * @summary Imports services to a gateway.
     *
     * @param request ImportServicesRequest
     * @return ImportServicesResponse
     */
    public ImportServicesResponse importServices(ImportServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importServicesWithOptions(request, runtime);
    }

    /**
     * @summary Initiates a task to import data from a destination URL to a Microservices Engine (MSE) ZooKeeper instance.
     *
     * @description **Danger** This operation clears existing data. Exercise caution when you call this API operation.
     *
     * @param request ImportZookeeperDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportZookeeperDataResponse
     */
    public ImportZookeeperDataResponse importZookeeperDataWithOptions(ImportZookeeperDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportZookeeperData"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportZookeeperDataResponse());
    }

    /**
     * @summary Initiates a task to import data from a destination URL to a Microservices Engine (MSE) ZooKeeper instance.
     *
     * @description **Danger** This operation clears existing data. Exercise caution when you call this API operation.
     *
     * @param request ImportZookeeperDataRequest
     * @return ImportZookeeperDataResponse
     */
    public ImportZookeeperDataResponse importZookeeperData(ImportZookeeperDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importZookeeperDataWithOptions(request, runtime);
    }

    /**
     * @summary Queries application instances that are registered with a Microservices Engine (MSE) Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListAnsInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnsInstancesResponse
     */
    public ListAnsInstancesResponse listAnsInstancesWithOptions(ListAnsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnsInstances"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnsInstancesResponse());
    }

    /**
     * @summary Queries application instances that are registered with a Microservices Engine (MSE) Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListAnsInstancesRequest
     * @return ListAnsInstancesResponse
     */
    public ListAnsInstancesResponse listAnsInstances(ListAnsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAnsInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the clusters of a Nacos service.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListAnsServiceClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnsServiceClustersResponse
     */
    public ListAnsServiceClustersResponse listAnsServiceClustersWithOptions(ListAnsServiceClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnsServiceClusters"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnsServiceClustersResponse());
    }

    /**
     * @summary Queries the clusters of a Nacos service.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListAnsServiceClustersRequest
     * @return ListAnsServiceClustersResponse
     */
    public ListAnsServiceClustersResponse listAnsServiceClusters(ListAnsServiceClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAnsServiceClustersWithOptions(request, runtime);
    }

    /**
     * @summary Queries Nacos services.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListAnsServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnsServicesResponse
     */
    public ListAnsServicesResponse listAnsServicesWithOptions(ListAnsServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasIpCount)) {
            query.put("HasIpCount", request.hasIpCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnsServices"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnsServicesResponse());
    }

    /**
     * @summary Queries Nacos services.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListAnsServicesRequest
     * @return ListAnsServicesResponse
     */
    public ListAnsServicesResponse listAnsServices(ListAnsServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAnsServicesWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI ListAppBySwimmingLaneGroupTag is deprecated, please use mse::2019-05-31::ListAppBySwimmingLaneGroupTags instead.
     *
     * @summary Queries the applications in a lane group by tag.
     *
     * @param request ListAppBySwimmingLaneGroupTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppBySwimmingLaneGroupTagResponse
     */
    // Deprecated
    public ListAppBySwimmingLaneGroupTagResponse listAppBySwimmingLaneGroupTagWithOptions(ListAppBySwimmingLaneGroupTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppBySwimmingLaneGroupTag"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppBySwimmingLaneGroupTagResponse());
    }

    /**
     * @deprecated OpenAPI ListAppBySwimmingLaneGroupTag is deprecated, please use mse::2019-05-31::ListAppBySwimmingLaneGroupTags instead.
     *
     * @summary Queries the applications in a lane group by tag.
     *
     * @param request ListAppBySwimmingLaneGroupTagRequest
     * @return ListAppBySwimmingLaneGroupTagResponse
     */
    // Deprecated
    public ListAppBySwimmingLaneGroupTagResponse listAppBySwimmingLaneGroupTag(ListAppBySwimmingLaneGroupTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppBySwimmingLaneGroupTagWithOptions(request, runtime);
    }

    /**
     * @summary Lists applications by tag in a specified lane group.
     *
     * @param tmpReq ListAppBySwimmingLaneGroupTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppBySwimmingLaneGroupTagsResponse
     */
    public ListAppBySwimmingLaneGroupTagsResponse listAppBySwimmingLaneGroupTagsWithOptions(ListAppBySwimmingLaneGroupTagsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAppBySwimmingLaneGroupTagsShrinkRequest request = new ListAppBySwimmingLaneGroupTagsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppBySwimmingLaneGroupTags"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppBySwimmingLaneGroupTagsResponse());
    }

    /**
     * @summary Lists applications by tag in a specified lane group.
     *
     * @param request ListAppBySwimmingLaneGroupTagsRequest
     * @return ListAppBySwimmingLaneGroupTagsResponse
     */
    public ListAppBySwimmingLaneGroupTagsResponse listAppBySwimmingLaneGroupTags(ListAppBySwimmingLaneGroupTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppBySwimmingLaneGroupTagsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the routing rules of an application.
     *
     * @param request ListApplicationsWithTagRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsWithTagRulesResponse
     */
    public ListApplicationsWithTagRulesResponse listApplicationsWithTagRulesWithOptions(ListApplicationsWithTagRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsWithTagRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsWithTagRulesResponse());
    }

    /**
     * @summary Queries the routing rules of an application.
     *
     * @param request ListApplicationsWithTagRulesRequest
     * @return ListApplicationsWithTagRulesResponse
     */
    public ListApplicationsWithTagRulesResponse listApplicationsWithTagRules(ListApplicationsWithTagRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithTagRulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of service authentication rules.
     *
     * @param request ListAuthPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthPolicyResponse
     */
    public ListAuthPolicyResponse listAuthPolicyWithOptions(ListAuthPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthPolicy"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthPolicyResponse());
    }

    /**
     * @summary Queries a list of service authentication rules.
     *
     * @param request ListAuthPolicyRequest
     * @return ListAuthPolicyResponse
     */
    public ListAuthPolicyResponse listAuthPolicy(ListAuthPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of circuit breaking rules.
     *
     * @param request ListCircuitBreakerRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCircuitBreakerRulesResponse
     */
    public ListCircuitBreakerRulesResponse listCircuitBreakerRulesWithOptions(ListCircuitBreakerRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSearchKey)) {
            query.put("ResourceSearchKey", request.resourceSearchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCircuitBreakerRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCircuitBreakerRulesResponse());
    }

    /**
     * @summary Queries a list of circuit breaking rules.
     *
     * @param request ListCircuitBreakerRulesRequest
     * @return ListCircuitBreakerRulesResponse
     */
    public ListCircuitBreakerRulesResponse listCircuitBreakerRules(ListCircuitBreakerRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCircuitBreakerRulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries available cluster connection types.
     *
     * @param request ListClusterConnectionTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterConnectionTypesResponse
     */
    public ListClusterConnectionTypesResponse listClusterConnectionTypesWithOptions(ListClusterConnectionTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterConnectionTypes"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterConnectionTypesResponse());
    }

    /**
     * @summary Queries available cluster connection types.
     *
     * @param request ListClusterConnectionTypesRequest
     * @return ListClusterConnectionTypesResponse
     */
    public ListClusterConnectionTypesResponse listClusterConnectionTypes(ListClusterConnectionTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterConnectionTypesWithOptions(request, runtime);
    }

    /**
     * @summary Obtains information about historical health check tasks.
     *
     * @param request ListClusterHealthCheckTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterHealthCheckTaskResponse
     */
    public ListClusterHealthCheckTaskResponse listClusterHealthCheckTaskWithOptions(ListClusterHealthCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterHealthCheckTask"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterHealthCheckTaskResponse());
    }

    /**
     * @summary Obtains information about historical health check tasks.
     *
     * @param request ListClusterHealthCheckTaskRequest
     * @return ListClusterHealthCheckTaskResponse
     */
    public ListClusterHealthCheckTaskResponse listClusterHealthCheckTask(ListClusterHealthCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterHealthCheckTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries the engine types that can be activated.
     *
     * @param request ListClusterTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterTypesResponse
     */
    public ListClusterTypesResponse listClusterTypesWithOptions(ListClusterTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectType)) {
            query.put("ConnectType", request.connectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseVersion)) {
            query.put("MseVersion", request.mseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterTypes"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterTypesResponse());
    }

    /**
     * @summary Queries the engine types that can be activated.
     *
     * @param request ListClusterTypesRequest
     * @return ListClusterTypesResponse
     */
    public ListClusterTypesResponse listClusterTypes(ListClusterTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterTypesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about supported instance versions.
     *
     * @param request ListClusterVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterVersionsResponse
     */
    public ListClusterVersionsResponse listClusterVersionsWithOptions(ListClusterVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseVersion)) {
            query.put("MseVersion", request.mseVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterVersions"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterVersionsResponse());
    }

    /**
     * @summary Queries the information about supported instance versions.
     *
     * @param request ListClusterVersionsRequest
     * @return ListClusterVersionsResponse
     */
    public ListClusterVersionsResponse listClusterVersions(ListClusterVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterVersionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries Microservices Engine (MSE) instances.
     *
     * @param request ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterAliasName)) {
            query.put("ClusterAliasName", request.clusterAliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
     * @summary Queries Microservices Engine (MSE) instances.
     *
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the track data of a Nacos configuration center.
     *
     * @param request ListConfigTrackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigTrackResponse
     */
    public ListConfigTrackResponse listConfigTrackWithOptions(ListConfigTrackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigTrack"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigTrackResponse());
    }

    /**
     * @summary Obtains the track data of a Nacos configuration center.
     *
     * @param request ListConfigTrackRequest
     * @return ListConfigTrackResponse
     */
    public ListConfigTrackResponse listConfigTrack(ListConfigTrackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigTrackWithOptions(request, runtime);
    }

    /**
     * @summary Queries the namespaces of a Nacos instance.
     *
     * @param request ListEngineNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEngineNamespacesResponse
     */
    public ListEngineNamespacesResponse listEngineNamespacesWithOptions(ListEngineNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEngineNamespaces"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEngineNamespacesResponse());
    }

    /**
     * @summary Queries the namespaces of a Nacos instance.
     *
     * @param request ListEngineNamespacesRequest
     * @return ListEngineNamespacesResponse
     */
    public ListEngineNamespacesResponse listEngineNamespaces(ListEngineNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEngineNamespacesWithOptions(request, runtime);
    }

    /**
     * @summary Queries Eureka instances.
     *
     * @param request ListEurekaInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEurekaInstancesResponse
     */
    public ListEurekaInstancesResponse listEurekaInstancesWithOptions(ListEurekaInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEurekaInstances"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEurekaInstancesResponse());
    }

    /**
     * @summary Queries Eureka instances.
     *
     * @param request ListEurekaInstancesRequest
     * @return ListEurekaInstancesResponse
     */
    public ListEurekaInstancesResponse listEurekaInstances(ListEurekaInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEurekaInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries Eureka services.
     *
     * @param request ListEurekaServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEurekaServicesResponse
     */
    public ListEurekaServicesResponse listEurekaServicesWithOptions(ListEurekaServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEurekaServices"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEurekaServicesResponse());
    }

    /**
     * @summary Queries Eureka services.
     *
     * @param request ListEurekaServicesRequest
     * @return ListEurekaServicesResponse
     */
    public ListEurekaServicesResponse listEurekaServices(ListEurekaServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEurekaServicesWithOptions(request, runtime);
    }

    /**
     * @summary Lists historical data export tasks of a Microservices Engine (MSE) Zookeeper instance.
     *
     * @param request ListExportZookeeperDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExportZookeeperDataResponse
     */
    public ListExportZookeeperDataResponse listExportZookeeperDataWithOptions(ListExportZookeeperDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExportZookeeperData"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExportZookeeperDataResponse());
    }

    /**
     * @summary Lists historical data export tasks of a Microservices Engine (MSE) Zookeeper instance.
     *
     * @param request ListExportZookeeperDataRequest
     * @return ListExportZookeeperDataResponse
     */
    public ListExportZookeeperDataResponse listExportZookeeperData(ListExportZookeeperDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExportZookeeperDataWithOptions(request, runtime);
    }

    /**
     * @summary Obtains a list of throttling rules.
     *
     * @param request ListFlowRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlowRulesResponse
     */
    public ListFlowRulesResponse listFlowRulesWithOptions(ListFlowRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSearchKey)) {
            query.put("ResourceSearchKey", request.resourceSearchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlowRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowRulesResponse());
    }

    /**
     * @summary Obtains a list of throttling rules.
     *
     * @param request ListFlowRulesRequest
     * @return ListFlowRulesResponse
     */
    public ListFlowRulesResponse listFlowRules(ListFlowRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlowRulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of gateways.
     *
     * @param tmpReq ListGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayResponse
     */
    public ListGatewayResponse listGatewayWithOptions(ListGatewayRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGatewayShrinkRequest request = new ListGatewayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterParams)) {
            request.filterParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterParams, "FilterParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.descSort)) {
            query.put("DescSort", request.descSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParamsShrink)) {
            query.put("FilterParams", request.filterParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderItem)) {
            query.put("OrderItem", request.orderItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGateway"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayResponse());
    }

    /**
     * @summary Queries a list of gateways.
     *
     * @param request ListGatewayRequest
     * @return ListGatewayResponse
     */
    public ListGatewayResponse listGateway(ListGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayWithOptions(request, runtime);
    }

    /**
     * @summary Queries the list of consumers on which a gateway performs authentication operations.
     *
     * @param request ListGatewayAuthConsumerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayAuthConsumerResponse
     */
    public ListGatewayAuthConsumerResponse listGatewayAuthConsumerWithOptions(ListGatewayAuthConsumerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerStatus)) {
            query.put("ConsumerStatus", request.consumerStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayAuthConsumer"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayAuthConsumerResponse());
    }

    /**
     * @summary Queries the list of consumers on which a gateway performs authentication operations.
     *
     * @param request ListGatewayAuthConsumerRequest
     * @return ListGatewayAuthConsumerResponse
     */
    public ListGatewayAuthConsumerResponse listGatewayAuthConsumer(ListGatewayAuthConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayAuthConsumerWithOptions(request, runtime);
    }

    /**
     * @summary Queries the list of authorized resources for the consumer on which a gateway performs authentication operations.
     *
     * @param request ListGatewayAuthConsumerResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayAuthConsumerResourceResponse
     */
    public ListGatewayAuthConsumerResourceResponse listGatewayAuthConsumerResourceWithOptions(ListGatewayAuthConsumerResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceStatus)) {
            query.put("ResourceStatus", request.resourceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayAuthConsumerResource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayAuthConsumerResourceResponse());
    }

    /**
     * @summary Queries the list of authorized resources for the consumer on which a gateway performs authentication operations.
     *
     * @param request ListGatewayAuthConsumerResourceRequest
     * @return ListGatewayAuthConsumerResourceResponse
     */
    public ListGatewayAuthConsumerResourceResponse listGatewayAuthConsumerResource(ListGatewayAuthConsumerResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayAuthConsumerResourceWithOptions(request, runtime);
    }

    /**
     * @summary 查看网关路由熔断规则
     *
     * @param request ListGatewayCircuitBreakerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayCircuitBreakerRuleResponse
     */
    public ListGatewayCircuitBreakerRuleResponse listGatewayCircuitBreakerRuleWithOptions(ListGatewayCircuitBreakerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParams)) {
            query.put("FilterParams", request.filterParams);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayCircuitBreakerRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayCircuitBreakerRuleResponse());
    }

    /**
     * @summary 查看网关路由熔断规则
     *
     * @param request ListGatewayCircuitBreakerRuleRequest
     * @return ListGatewayCircuitBreakerRuleResponse
     */
    public ListGatewayCircuitBreakerRuleResponse listGatewayCircuitBreakerRule(ListGatewayCircuitBreakerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayCircuitBreakerRuleWithOptions(request, runtime);
    }

    /**
     * @summary Queries the domain names that are associated with a gateway.
     *
     * @param request ListGatewayDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayDomainResponse
     */
    public ListGatewayDomainResponse listGatewayDomainWithOptions(ListGatewayDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayDomain"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayDomainResponse());
    }

    /**
     * @summary Queries the domain names that are associated with a gateway.
     *
     * @param request ListGatewayDomainRequest
     * @return ListGatewayDomainResponse
     */
    public ListGatewayDomainResponse listGatewayDomain(ListGatewayDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayDomainWithOptions(request, runtime);
    }

    /**
     * @summary 查看网关路由流控规则
     *
     * @param request ListGatewayFlowRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayFlowRuleResponse
     */
    public ListGatewayFlowRuleResponse listGatewayFlowRuleWithOptions(ListGatewayFlowRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParams)) {
            query.put("FilterParams", request.filterParams);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayFlowRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayFlowRuleResponse());
    }

    /**
     * @summary 查看网关路由流控规则
     *
     * @param request ListGatewayFlowRuleRequest
     * @return ListGatewayFlowRuleResponse
     */
    public ListGatewayFlowRuleResponse listGatewayFlowRule(ListGatewayFlowRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayFlowRuleWithOptions(request, runtime);
    }

    /**
     * @summary 查看网关路由隔离规则
     *
     * @param request ListGatewayIsolationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayIsolationRuleResponse
     */
    public ListGatewayIsolationRuleResponse listGatewayIsolationRuleWithOptions(ListGatewayIsolationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParams)) {
            query.put("FilterParams", request.filterParams);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayIsolationRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayIsolationRuleResponse());
    }

    /**
     * @summary 查看网关路由隔离规则
     *
     * @param request ListGatewayIsolationRuleRequest
     * @return ListGatewayIsolationRuleResponse
     */
    public ListGatewayIsolationRuleResponse listGatewayIsolationRule(ListGatewayIsolationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayIsolationRuleWithOptions(request, runtime);
    }

    /**
     * @summary Queries the routes of a gateway.
     *
     * @param tmpReq ListGatewayRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayRouteResponse
     */
    public ListGatewayRouteResponse listGatewayRouteWithOptions(ListGatewayRouteRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGatewayRouteShrinkRequest request = new ListGatewayRouteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterParams)) {
            request.filterParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterParams, "FilterParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.descSort)) {
            query.put("DescSort", request.descSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParamsShrink)) {
            query.put("FilterParams", request.filterParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderItem)) {
            query.put("OrderItem", request.orderItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayRoute"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayRouteResponse());
    }

    /**
     * @summary Queries the routes of a gateway.
     *
     * @param request ListGatewayRouteRequest
     * @return ListGatewayRouteResponse
     */
    public ListGatewayRouteResponse listGatewayRoute(ListGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayRouteWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of routes for which authentication is enabled.
     *
     * @param request ListGatewayRouteOnAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayRouteOnAuthResponse
     */
    public ListGatewayRouteOnAuthResponse listGatewayRouteOnAuthWithOptions(ListGatewayRouteOnAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayRouteOnAuth"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayRouteOnAuthResponse());
    }

    /**
     * @summary Queries a list of routes for which authentication is enabled.
     *
     * @param request ListGatewayRouteOnAuthRequest
     * @return ListGatewayRouteOnAuthResponse
     */
    public ListGatewayRouteOnAuthResponse listGatewayRouteOnAuth(ListGatewayRouteOnAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayRouteOnAuthWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of services that are subscribed with a gateway.
     *
     * @param tmpReq ListGatewayServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewayServiceResponse
     */
    public ListGatewayServiceResponse listGatewayServiceWithOptions(ListGatewayServiceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGatewayServiceShrinkRequest request = new ListGatewayServiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterParams)) {
            request.filterParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterParams, "FilterParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.descSort)) {
            query.put("DescSort", request.descSort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParamsShrink)) {
            query.put("FilterParams", request.filterParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderItem)) {
            query.put("OrderItem", request.orderItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayService"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayServiceResponse());
    }

    /**
     * @summary Queries a list of services that are subscribed with a gateway.
     *
     * @param request ListGatewayServiceRequest
     * @return ListGatewayServiceResponse
     */
    public ListGatewayServiceResponse listGatewayService(ListGatewayServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewayServiceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the Server Load Balancer (SLB) instances that are associated with a gateway.
     *
     * @param request ListGatewaySlbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGatewaySlbResponse
     */
    public ListGatewaySlbResponse listGatewaySlbWithOptions(ListGatewaySlbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewaySlb"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewaySlbResponse());
    }

    /**
     * @summary Queries the Server Load Balancer (SLB) instances that are associated with a gateway.
     *
     * @param request ListGatewaySlbRequest
     * @return ListGatewaySlbResponse
     */
    public ListGatewaySlbResponse listGatewaySlb(ListGatewaySlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGatewaySlbWithOptions(request, runtime);
    }

    /**
     * @summary Displays the number of nodes that can be deployed for an instance.
     *
     * @param request ListInstanceCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceCountResponse
     */
    public ListInstanceCountResponse listInstanceCountWithOptions(ListInstanceCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseVersion)) {
            query.put("MseVersion", request.mseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceCount"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceCountResponse());
    }

    /**
     * @summary Displays the number of nodes that can be deployed for an instance.
     *
     * @param request ListInstanceCountRequest
     * @return ListInstanceCountResponse
     */
    public ListInstanceCountResponse listInstanceCount(ListInstanceCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceCountWithOptions(request, runtime);
    }

    /**
     * @summary 查询隔离规则
     *
     * @param request ListIsolationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIsolationRulesResponse
     */
    public ListIsolationRulesResponse listIsolationRulesWithOptions(ListIsolationRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSearchKey)) {
            query.put("ResourceSearchKey", request.resourceSearchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIsolationRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIsolationRulesResponse());
    }

    /**
     * @summary 查询隔离规则
     *
     * @param request ListIsolationRulesRequest
     * @return ListIsolationRulesResponse
     */
    public ListIsolationRulesResponse listIsolationRules(ListIsolationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIsolationRulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries listeners based on configuration information.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListListenersByConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListListenersByConfigResponse
     */
    public ListListenersByConfigResponse listListenersByConfigWithOptions(ListListenersByConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListenersByConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenersByConfigResponse());
    }

    /**
     * @summary Queries listeners based on configuration information.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListListenersByConfigRequest
     * @return ListListenersByConfigResponse
     */
    public ListListenersByConfigResponse listListenersByConfig(ListListenersByConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenersByConfigWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about listeners based on IP addresses.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListListenersByIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListListenersByIpResponse
     */
    public ListListenersByIpResponse listListenersByIpWithOptions(ListListenersByIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListenersByIp"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenersByIpResponse());
    }

    /**
     * @summary Queries the information about listeners based on IP addresses.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListListenersByIpRequest
     * @return ListListenersByIpResponse
     */
    public ListListenersByIpResponse listListenersByIp(ListListenersByIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenersByIpWithOptions(request, runtime);
    }

    /**
     * @summary Queries information about a migration task.
     *
     * @param request ListMigrationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMigrationTaskResponse
     */
    public ListMigrationTaskResponse listMigrationTaskWithOptions(ListMigrationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originInstanceName)) {
            query.put("OriginInstanceName", request.originInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMigrationTask"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMigrationTaskResponse());
    }

    /**
     * @summary Queries information about a migration task.
     *
     * @param request ListMigrationTaskRequest
     * @return ListMigrationTaskResponse
     */
    public ListMigrationTaskResponse listMigrationTask(ListMigrationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMigrationTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries Nacos configurations.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListNacosConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNacosConfigsResponse
     */
    public ListNacosConfigsResponse listNacosConfigsWithOptions(ListNacosConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNacosConfigs"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNacosConfigsResponse());
    }

    /**
     * @summary Queries Nacos configurations.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListNacosConfigsRequest
     * @return ListNacosConfigsResponse
     */
    public ListNacosConfigsResponse listNacosConfigs(ListNacosConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNacosConfigsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configuration history of a Microservices Engine (MSE) Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListNacosHistoryConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNacosHistoryConfigsResponse
     */
    public ListNacosHistoryConfigsResponse listNacosHistoryConfigsWithOptions(ListNacosHistoryConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNacosHistoryConfigs"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNacosHistoryConfigsResponse());
    }

    /**
     * @summary Queries the configuration history of a Microservices Engine (MSE) Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request ListNacosHistoryConfigsRequest
     * @return ListNacosHistoryConfigsResponse
     */
    public ListNacosHistoryConfigsResponse listNacosHistoryConfigs(ListNacosHistoryConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNacosHistoryConfigsWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the trajectory data of a Nacos registry.
     *
     * @param request ListNamingTrackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNamingTrackResponse
     */
    public ListNamingTrackResponse listNamingTrackWithOptions(ListNamingTrackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNamingTrack"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamingTrackResponse());
    }

    /**
     * @summary Obtains the trajectory data of a Nacos registry.
     *
     * @param request ListNamingTrackRequest
     * @return ListNamingTrackResponse
     */
    public ListNamingTrackResponse listNamingTrack(ListNamingTrackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamingTrackWithOptions(request, runtime);
    }

    /**
     * @summary Obtains a list of gateway certificates.
     *
     * @param request ListSSLCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSSLCertResponse
     */
    public ListSSLCertResponse listSSLCertWithOptions(ListSSLCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSSLCert"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSSLCertResponse());
    }

    /**
     * @summary Obtains a list of gateway certificates.
     *
     * @param request ListSSLCertRequest
     * @return ListSSLCertResponse
     */
    public ListSSLCertResponse listSSLCert(ListSSLCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSSLCertWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the information about security groups.
     *
     * @param request ListSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecurityGroupResponse
     */
    public ListSecurityGroupResponse listSecurityGroupWithOptions(ListSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecurityGroup"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityGroupResponse());
    }

    /**
     * @summary Obtains the information about security groups.
     *
     * @param request ListSecurityGroupRequest
     * @return ListSecurityGroupResponse
     */
    public ListSecurityGroupResponse listSecurityGroup(ListSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecurityGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries the security group rules of a gateway.
     *
     * @param request ListSecurityGroupRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecurityGroupRuleResponse
     */
    public ListSecurityGroupRuleResponse listSecurityGroupRuleWithOptions(ListSecurityGroupRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecurityGroupRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityGroupRuleResponse());
    }

    /**
     * @summary Queries the security group rules of a gateway.
     *
     * @param request ListSecurityGroupRuleRequest
     * @return ListSecurityGroupRuleResponse
     */
    public ListSecurityGroupRuleResponse listSecurityGroupRule(ListSecurityGroupRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecurityGroupRuleWithOptions(request, runtime);
    }

    /**
     * @summary 查询流量防护行为
     *
     * @param tmpReq ListSentinelBlockFallbackDefinitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSentinelBlockFallbackDefinitionsResponse
     */
    public ListSentinelBlockFallbackDefinitionsResponse listSentinelBlockFallbackDefinitionsWithOptions(ListSentinelBlockFallbackDefinitionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSentinelBlockFallbackDefinitionsShrinkRequest request = new ListSentinelBlockFallbackDefinitionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.classificationSet)) {
            request.classificationSetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.classificationSet, "ClassificationSet", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classificationSetShrink)) {
            query.put("ClassificationSet", request.classificationSetShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSentinelBlockFallbackDefinitions"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSentinelBlockFallbackDefinitionsResponse());
    }

    /**
     * @summary 查询流量防护行为
     *
     * @param request ListSentinelBlockFallbackDefinitionsRequest
     * @return ListSentinelBlockFallbackDefinitionsResponse
     */
    public ListSentinelBlockFallbackDefinitionsResponse listSentinelBlockFallbackDefinitions(ListSentinelBlockFallbackDefinitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSentinelBlockFallbackDefinitionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of associated sources.
     *
     * @param request ListServiceSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServiceSourceResponse
     */
    public ListServiceSourceResponse listServiceSourceWithOptions(ListServiceSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceSourceResponse());
    }

    /**
     * @summary Queries a list of associated sources.
     *
     * @param request ListServiceSourceRequest
     * @return ListServiceSourceResponse
     */
    public ListServiceSourceResponse listServiceSource(ListServiceSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServiceSourceWithOptions(request, runtime);
    }

    /**
     * @summary Queries tagged resources.
     *
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * @summary Queries tagged resources.
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the track data of a ZooKeeper instance.
     *
     * @param request ListZkTrackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListZkTrackResponse
     */
    public ListZkTrackResponse listZkTrackWithOptions(ListZkTrackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListZkTrack"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListZkTrackResponse());
    }

    /**
     * @summary Obtains the track data of a ZooKeeper instance.
     *
     * @param request ListZkTrackRequest
     * @return ListZkTrackResponse
     */
    public ListZkTrackResponse listZkTrack(ListZkTrackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listZkTrackWithOptions(request, runtime);
    }

    /**
     * @summary Queries the child nodes of a ZooKeeper node.
     *
     * @param request ListZnodeChildrenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListZnodeChildrenResponse
     */
    public ListZnodeChildrenResponse listZnodeChildrenWithOptions(ListZnodeChildrenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListZnodeChildren"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListZnodeChildrenResponse());
    }

    /**
     * @summary Queries the child nodes of a ZooKeeper node.
     *
     * @param request ListZnodeChildrenRequest
     * @return ListZnodeChildrenResponse
     */
    public ListZnodeChildrenResponse listZnodeChildren(ListZnodeChildrenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listZnodeChildrenWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the information about a cluster for which Microservice Governance is enabled.
     *
     * @param tmpReq ModifyGovernanceKubernetesClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGovernanceKubernetesClusterResponse
     */
    public ModifyGovernanceKubernetesClusterResponse modifyGovernanceKubernetesClusterWithOptions(ModifyGovernanceKubernetesClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyGovernanceKubernetesClusterShrinkRequest request = new ModifyGovernanceKubernetesClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaceInfos)) {
            request.namespaceInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaceInfos, "NamespaceInfos", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceInfosShrink)) {
            body.put("NamespaceInfos", request.namespaceInfosShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGovernanceKubernetesCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGovernanceKubernetesClusterResponse());
    }

    /**
     * @summary Modifies the information about a cluster for which Microservice Governance is enabled.
     *
     * @param request ModifyGovernanceKubernetesClusterRequest
     * @return ModifyGovernanceKubernetesClusterResponse
     */
    public ModifyGovernanceKubernetesClusterResponse modifyGovernanceKubernetesCluster(ModifyGovernanceKubernetesClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    /**
     * @summary Modifies configurations of the lossless online and offline feature.
     *
     * @param request ModifyLosslessRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLosslessRuleResponse
     */
    public ModifyLosslessRuleResponse modifyLosslessRuleWithOptions(ModifyLosslessRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aligned)) {
            query.put("Aligned", request.aligned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayTime)) {
            query.put("DelayTime", request.delayTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.funcType)) {
            query.put("FuncType", request.funcType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lossLessDetail)) {
            query.put("LossLessDetail", request.lossLessDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notice)) {
            query.put("Notice", request.notice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.related)) {
            query.put("Related", request.related);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warmupTime)) {
            query.put("WarmupTime", request.warmupTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLosslessRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLosslessRuleResponse());
    }

    /**
     * @summary Modifies configurations of the lossless online and offline feature.
     *
     * @param request ModifyLosslessRuleRequest
     * @return ModifyLosslessRuleResponse
     */
    public ModifyLosslessRuleResponse modifyLosslessRule(ModifyLosslessRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLosslessRuleWithOptions(request, runtime);
    }

    /**
     * @summary Unpublishes a route for a gateway.
     *
     * @param request OfflineGatewayRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineGatewayRouteResponse
     */
    public OfflineGatewayRouteResponse offlineGatewayRouteWithOptions(OfflineGatewayRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineGatewayRoute"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineGatewayRouteResponse());
    }

    /**
     * @summary Unpublishes a route for a gateway.
     *
     * @param request OfflineGatewayRouteRequest
     * @return OfflineGatewayRouteResponse
     */
    public OfflineGatewayRouteResponse offlineGatewayRoute(OfflineGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineGatewayRouteWithOptions(request, runtime);
    }

    /**
     * @summary Subscribes to the notification feature if a risk is detected during a health check.
     *
     * @param request OrderClusterHealthCheckRiskNoticeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OrderClusterHealthCheckRiskNoticeResponse
     */
    public OrderClusterHealthCheckRiskNoticeResponse orderClusterHealthCheckRiskNoticeWithOptions(OrderClusterHealthCheckRiskNoticeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mute)) {
            query.put("Mute", request.mute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeType)) {
            query.put("NoticeType", request.noticeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskCode)) {
            query.put("RiskCode", request.riskCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderClusterHealthCheckRiskNotice"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderClusterHealthCheckRiskNoticeResponse());
    }

    /**
     * @summary Subscribes to the notification feature if a risk is detected during a health check.
     *
     * @param request OrderClusterHealthCheckRiskNoticeRequest
     * @return OrderClusterHealthCheckRiskNoticeResponse
     */
    public OrderClusterHealthCheckRiskNoticeResponse orderClusterHealthCheckRiskNotice(OrderClusterHealthCheckRiskNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.orderClusterHealthCheckRiskNoticeWithOptions(request, runtime);
    }

    /**
     * @summary Queries all the microservices of a service source.
     *
     * @param request PullServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PullServicesResponse
     */
    public PullServicesResponse pullServicesWithOptions(PullServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PullServices"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PullServicesResponse());
    }

    /**
     * @summary Queries all the microservices of a service source.
     *
     * @param request PullServicesRequest
     * @return PullServicesResponse
     */
    public PullServicesResponse pullServices(PullServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pullServicesWithOptions(request, runtime);
    }

    /**
     * @summary Initiates a task to check risk evaluation for an instance.
     *
     * @param request PutClusterHealthCheckTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutClusterHealthCheckTaskResponse
     */
    public PutClusterHealthCheckTaskResponse putClusterHealthCheckTaskWithOptions(PutClusterHealthCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutClusterHealthCheckTask"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutClusterHealthCheckTaskResponse());
    }

    /**
     * @summary Initiates a task to check risk evaluation for an instance.
     *
     * @param request PutClusterHealthCheckTaskRequest
     * @return PutClusterHealthCheckTaskResponse
     */
    public PutClusterHealthCheckTaskResponse putClusterHealthCheckTask(PutClusterHealthCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putClusterHealthCheckTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries all the lanes in a lane group.
     *
     * @param request QueryAllSwimmingLaneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAllSwimmingLaneResponse
     */
    public QueryAllSwimmingLaneResponse queryAllSwimmingLaneWithOptions(QueryAllSwimmingLaneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllSwimmingLane"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllSwimmingLaneResponse());
    }

    /**
     * @summary Queries all the lanes in a lane group.
     *
     * @param request QueryAllSwimmingLaneRequest
     * @return QueryAllSwimmingLaneResponse
     */
    public QueryAllSwimmingLaneResponse queryAllSwimmingLane(QueryAllSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAllSwimmingLaneWithOptions(request, runtime);
    }

    /**
     * @summary Queries all lane groups.
     *
     * @param request QueryAllSwimmingLaneGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAllSwimmingLaneGroupResponse
     */
    public QueryAllSwimmingLaneGroupResponse queryAllSwimmingLaneGroupWithOptions(QueryAllSwimmingLaneGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllSwimmingLaneGroup"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllSwimmingLaneGroupResponse());
    }

    /**
     * @summary Queries all lane groups.
     *
     * @param request QueryAllSwimmingLaneGroupRequest
     * @return QueryAllSwimmingLaneGroupResponse
     */
    public QueryAllSwimmingLaneGroupResponse queryAllSwimmingLaneGroup(QueryAllSwimmingLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAllSwimmingLaneGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries information about regions.
     *
     * @param request QueryBusinessLocationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBusinessLocationsResponse
     */
    public QueryBusinessLocationsResponse queryBusinessLocationsWithOptions(QueryBusinessLocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBusinessLocations"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBusinessLocationsResponse());
    }

    /**
     * @summary Queries information about regions.
     *
     * @param request QueryBusinessLocationsRequest
     * @return QueryBusinessLocationsResponse
     */
    public QueryBusinessLocationsResponse queryBusinessLocations(QueryBusinessLocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBusinessLocationsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of an instance.
     *
     * @param request QueryClusterDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryClusterDetailResponse
     */
    public QueryClusterDetailResponse queryClusterDetailWithOptions(QueryClusterDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclSwitch)) {
            query.put("AclSwitch", request.aclSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClusterDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClusterDetailResponse());
    }

    /**
     * @summary Queries the details of an instance.
     *
     * @param request QueryClusterDetailRequest
     * @return QueryClusterDetailResponse
     */
    public QueryClusterDetailResponse queryClusterDetail(QueryClusterDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryClusterDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries disk specifications that are supported by an instance.
     *
     * @param request QueryClusterDiskSpecificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryClusterDiskSpecificationResponse
     */
    public QueryClusterDiskSpecificationResponse queryClusterDiskSpecificationWithOptions(QueryClusterDiskSpecificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClusterDiskSpecification"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClusterDiskSpecificationResponse());
    }

    /**
     * @summary Queries disk specifications that are supported by an instance.
     *
     * @param request QueryClusterDiskSpecificationRequest
     * @return QueryClusterDiskSpecificationResponse
     */
    public QueryClusterDiskSpecificationResponse queryClusterDiskSpecification(QueryClusterDiskSpecificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryClusterDiskSpecificationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the static information of an instance.
     *
     * @param request QueryClusterInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryClusterInfoResponse
     */
    public QueryClusterInfoResponse queryClusterInfoWithOptions(QueryClusterInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclSwitch)) {
            query.put("AclSwitch", request.aclSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClusterInfo"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClusterInfoResponse());
    }

    /**
     * @summary Queries the static information of an instance.
     *
     * @param request QueryClusterInfoRequest
     * @return QueryClusterInfoResponse
     */
    public QueryClusterInfoResponse queryClusterInfo(QueryClusterInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryClusterInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information of supported instance specifications.
     *
     * @param request QueryClusterSpecificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryClusterSpecificationResponse
     */
    public QueryClusterSpecificationResponse queryClusterSpecificationWithOptions(QueryClusterSpecificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectType)) {
            query.put("ConnectType", request.connectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseVersion)) {
            query.put("MseVersion", request.mseVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryClusterSpecification"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryClusterSpecificationResponse());
    }

    /**
     * @summary Queries the information of supported instance specifications.
     *
     * @param request QueryClusterSpecificationRequest
     * @return QueryClusterSpecificationResponse
     */
    public QueryClusterSpecificationResponse queryClusterSpecification(QueryClusterSpecificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryClusterSpecificationWithOptions(request, runtime);
    }

    /**
     * @summary Queries configuration information of an instance.
     *
     * @param request QueryConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConfigResponse
     */
    public QueryConfigResponse queryConfigWithOptions(QueryConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRunningConf)) {
            query.put("NeedRunningConf", request.needRunningConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConfigResponse());
    }

    /**
     * @summary Queries configuration information of an instance.
     *
     * @param request QueryConfigRequest
     * @return QueryConfigResponse
     */
    public QueryConfigResponse queryConfig(QueryConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConfigWithOptions(request, runtime);
    }

    /**
     * @summary Queries the regions supported by a gateway.
     *
     * @param request QueryGatewayRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGatewayRegionResponse
     */
    public QueryGatewayRegionResponse queryGatewayRegionWithOptions(QueryGatewayRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGatewayRegion"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGatewayRegionResponse());
    }

    /**
     * @summary Queries the regions supported by a gateway.
     *
     * @param request QueryGatewayRegionRequest
     * @return QueryGatewayRegionResponse
     */
    public QueryGatewayRegionResponse queryGatewayRegion(QueryGatewayRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGatewayRegionWithOptions(request, runtime);
    }

    /**
     * @summary Queries available gateway types.
     *
     * @param request QueryGatewayTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGatewayTypeResponse
     */
    public QueryGatewayTypeResponse queryGatewayTypeWithOptions(QueryGatewayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGatewayType"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGatewayTypeResponse());
    }

    /**
     * @summary Queries available gateway types.
     *
     * @param request QueryGatewayTypeRequest
     * @return QueryGatewayTypeResponse
     */
    public QueryGatewayTypeResponse queryGatewayType(QueryGatewayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGatewayTypeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the Kubernetes clusters for which Microservices Governance is activated.
     *
     * @param request QueryGovernanceKubernetesClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGovernanceKubernetesClusterResponse
     */
    public QueryGovernanceKubernetesClusterResponse queryGovernanceKubernetesClusterWithOptions(QueryGovernanceKubernetesClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGovernanceKubernetesCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGovernanceKubernetesClusterResponse());
    }

    /**
     * @summary Queries the Kubernetes clusters for which Microservices Governance is activated.
     *
     * @param request QueryGovernanceKubernetesClusterRequest
     * @return QueryGovernanceKubernetesClusterResponse
     */
    public QueryGovernanceKubernetesClusterResponse queryGovernanceKubernetesCluster(QueryGovernanceKubernetesClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    /**
     * @summary Queries the runtime data of a specified cluster.
     *
     * @param request QueryInstancesInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInstancesInfoResponse
     */
    public QueryInstancesInfoResponse queryInstancesInfoWithOptions(QueryInstancesInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstancesInfo"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstancesInfoResponse());
    }

    /**
     * @summary Queries the runtime data of a specified cluster.
     *
     * @param request QueryInstancesInfoRequest
     * @return QueryInstancesInfoResponse
     */
    public QueryInstancesInfoResponse queryInstancesInfo(QueryInstancesInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstancesInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries monitoring information.
     *
     * @param request QueryMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMonitorResponse
     */
    public QueryMonitorResponse queryMonitorWithOptions(QueryMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorType)) {
            query.put("MonitorType", request.monitorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.step)) {
            query.put("Step", request.step);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMonitor"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMonitorResponse());
    }

    /**
     * @summary Queries monitoring information.
     *
     * @param request QueryMonitorRequest
     * @return QueryMonitorResponse
     */
    public QueryMonitorResponse queryMonitor(QueryMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonitorWithOptions(request, runtime);
    }

    /**
     * @summary 查询MSE命名空间
     *
     * @param request QueryNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryNamespaceResponse
     */
    public QueryNamespaceResponse queryNamespaceWithOptions(QueryNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryNamespace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryNamespaceResponse());
    }

    /**
     * @summary 查询MSE命名空间
     *
     * @param request QueryNamespaceRequest
     * @return QueryNamespaceResponse
     */
    public QueryNamespaceResponse queryNamespace(QueryNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the type of a Server Load Balancer (SLB) instance.
     *
     * @param request QuerySlbSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySlbSpecResponse
     */
    public QuerySlbSpecResponse querySlbSpecWithOptions(QuerySlbSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySlbSpec"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySlbSpecResponse());
    }

    /**
     * @summary Queries the type of a Server Load Balancer (SLB) instance.
     *
     * @param request QuerySlbSpecRequest
     * @return QuerySlbSpecResponse
     */
    public QuerySlbSpecResponse querySlbSpec(QuerySlbSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySlbSpecWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a lane based on the lane ID.
     *
     * @param request QuerySwimmingLaneByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySwimmingLaneByIdResponse
     */
    public QuerySwimmingLaneByIdResponse querySwimmingLaneByIdWithOptions(QuerySwimmingLaneByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySwimmingLaneById"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySwimmingLaneByIdResponse());
    }

    /**
     * @summary Queries the information about a lane based on the lane ID.
     *
     * @param request QuerySwimmingLaneByIdRequest
     * @return QuerySwimmingLaneByIdResponse
     */
    public QuerySwimmingLaneByIdResponse querySwimmingLaneById(QuerySwimmingLaneByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySwimmingLaneByIdWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a ZooKeeper node.
     *
     * @param request QueryZnodeDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryZnodeDetailResponse
     */
    public QueryZnodeDetailResponse queryZnodeDetailWithOptions(QueryZnodeDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryZnodeDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryZnodeDetailResponse());
    }

    /**
     * @summary Queries the information about a ZooKeeper node.
     *
     * @param request QueryZnodeDetailRequest
     * @return QueryZnodeDetailResponse
     */
    public QueryZnodeDetailResponse queryZnodeDetail(QueryZnodeDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryZnodeDetailWithOptions(request, runtime);
    }

    /**
     * @summary 删除单个应用
     *
     * @param request RemoveApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveApplicationResponse
     */
    public RemoveApplicationResponse removeApplicationWithOptions(RemoveApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApplication"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveApplicationResponse());
    }

    /**
     * @summary 删除单个应用
     *
     * @param request RemoveApplicationRequest
     * @return RemoveApplicationResponse
     */
    public RemoveApplicationResponse removeApplication(RemoveApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeApplicationWithOptions(request, runtime);
    }

    /**
     * @param request RemoveAuthPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveAuthPolicyResponse
     */
    public RemoveAuthPolicyResponse removeAuthPolicyWithOptions(RemoveAuthPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAuthPolicy"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAuthPolicyResponse());
    }

    /**
     * @param request RemoveAuthPolicyRequest
     * @return RemoveAuthPolicyResponse
     */
    public RemoveAuthPolicyResponse removeAuthPolicy(RemoveAuthPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeAuthPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Restarts a registry.
     *
     * @param request RestartClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartClusterResponse
     */
    public RestartClusterResponse restartClusterWithOptions(RestartClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podNameList)) {
            query.put("PodNameList", request.podNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartClusterResponse());
    }

    /**
     * @summary Restarts a registry.
     *
     * @param request RestartClusterRequest
     * @return RestartClusterResponse
     */
    public RestartClusterResponse restartCluster(RestartClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartClusterWithOptions(request, runtime);
    }

    /**
     * @summary Retries a cluster.
     *
     * @param request RetryClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryClusterResponse
     */
    public RetryClusterResponse retryClusterWithOptions(RetryClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryClusterResponse());
    }

    /**
     * @summary Retries a cluster.
     *
     * @param request RetryClusterRequest
     * @return RetryClusterResponse
     */
    public RetryClusterResponse retryCluster(RetryClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryClusterWithOptions(request, runtime);
    }

    /**
     * @summary Queries an idle Server Load Balancer (SLB) instance that is associated with a gateway.
     *
     * @param request SelectGatewaySlbRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectGatewaySlbResponse
     */
    public SelectGatewaySlbResponse selectGatewaySlbWithOptions(SelectGatewaySlbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectGatewaySlb"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectGatewaySlbResponse());
    }

    /**
     * @summary Queries an idle Server Load Balancer (SLB) instance that is associated with a gateway.
     *
     * @param request SelectGatewaySlbRequest
     * @return SelectGatewaySlbResponse
     */
    public SelectGatewaySlbResponse selectGatewaySlb(SelectGatewaySlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.selectGatewaySlbWithOptions(request, runtime);
    }

    /**
     * @summary Tags a specified resource.
     *
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * @summary Tags a specified resource.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Untags resources.
     *
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * @summary Untags resources.
     *
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Modifies an IP address whitelist.
     *
     * @param request UpdateAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAclResponse
     */
    public UpdateAclResponse updateAclWithOptions(UpdateAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aclEntryList)) {
            query.put("AclEntryList", request.aclEntryList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAcl"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAclResponse());
    }

    /**
     * @summary Modifies an IP address whitelist.
     *
     * @param request UpdateAclRequest
     * @return UpdateAclResponse
     */
    public UpdateAclResponse updateAcl(UpdateAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAclWithOptions(request, runtime);
    }

    /**
     * @summary Updates a service authentication rule.
     *
     * @param request UpdateAuthPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthPolicyResponse
     */
    public UpdateAuthPolicyResponse updateAuthPolicyWithOptions(UpdateAuthPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authRule)) {
            query.put("AuthRule", request.authRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.k8sNamespace)) {
            query.put("K8sNamespace", request.k8sNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthPolicy"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthPolicyResponse());
    }

    /**
     * @summary Updates a service authentication rule.
     *
     * @param request UpdateAuthPolicyRequest
     * @return UpdateAuthPolicyResponse
     */
    public UpdateAuthPolicyResponse updateAuthPolicy(UpdateAuthPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the blacklist or whitelist of a gateway.
     *
     * @param request UpdateBlackWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBlackWhiteListResponse
     */
    public UpdateBlackWhiteListResponse updateBlackWhiteListWithOptions(UpdateBlackWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isWhite)) {
            query.put("IsWhite", request.isWhite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdJsonList)) {
            query.put("ResourceIdJsonList", request.resourceIdJsonList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBlackWhiteList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBlackWhiteListResponse());
    }

    /**
     * @summary Modifies the blacklist or whitelist of a gateway.
     *
     * @param request UpdateBlackWhiteListRequest
     * @return UpdateBlackWhiteListResponse
     */
    public UpdateBlackWhiteListResponse updateBlackWhiteList(UpdateBlackWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBlackWhiteListWithOptions(request, runtime);
    }

    /**
     * @summary Updates a circuit breaking rule.
     *
     * @param request UpdateCircuitBreakerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCircuitBreakerRuleResponse
     */
    public UpdateCircuitBreakerRuleResponse updateCircuitBreakerRuleWithOptions(UpdateCircuitBreakerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.halfOpenBaseAmountPerStep)) {
            query.put("HalfOpenBaseAmountPerStep", request.halfOpenBaseAmountPerStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.halfOpenRecoveryStepNum)) {
            query.put("HalfOpenRecoveryStepNum", request.halfOpenRecoveryStepNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAllowedRtMs)) {
            query.put("MaxAllowedRtMs", request.maxAllowedRtMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRequestAmount)) {
            query.put("MinRequestAmount", request.minRequestAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryTimeoutMs)) {
            query.put("RetryTimeoutMs", request.retryTimeoutMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statIntervalMs)) {
            query.put("StatIntervalMs", request.statIntervalMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("Strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCircuitBreakerRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCircuitBreakerRuleResponse());
    }

    /**
     * @summary Updates a circuit breaking rule.
     *
     * @param request UpdateCircuitBreakerRuleRequest
     * @return UpdateCircuitBreakerRuleResponse
     */
    public UpdateCircuitBreakerRuleResponse updateCircuitBreakerRule(UpdateCircuitBreakerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCircuitBreakerRuleWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the information about an instance.
     *
     * @param request UpdateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateClusterWithOptions(UpdateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterAliasName)) {
            query.put("ClusterAliasName", request.clusterAliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintenanceEndTime)) {
            query.put("MaintenanceEndTime", request.maintenanceEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintenanceStartTime)) {
            query.put("MaintenanceStartTime", request.maintenanceStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterResponse());
    }

    /**
     * @summary Modifies the information about an instance.
     *
     * @param request UpdateClusterRequest
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClusterWithOptions(request, runtime);
    }

    /**
     * @summary Updates the number or specifications of nodes in a pay-as-you-go Microservices Engine (MSE) instance.
     *
     * @description You can call this operation to update the number or specifications of nodes in a pay-as-you-go MSE instance. You are charged when you add nodes or upgrade node specifications. For more information, see [Pricing] (`~~1806469~~`).
     *
     * @param request UpdateClusterSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterSpecResponse
     */
    public UpdateClusterSpecResponse updateClusterSpecWithOptions(UpdateClusterSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpecification)) {
            query.put("ClusterSpecification", request.clusterSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCount)) {
            query.put("InstanceCount", request.instanceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseVersion)) {
            query.put("MseVersion", request.mseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubNetworkFlow)) {
            query.put("PubNetworkFlow", request.pubNetworkFlow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterSpec"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterSpecResponse());
    }

    /**
     * @summary Updates the number or specifications of nodes in a pay-as-you-go Microservices Engine (MSE) instance.
     *
     * @description You can call this operation to update the number or specifications of nodes in a pay-as-you-go MSE instance. You are charged when you add nodes or upgrade node specifications. For more information, see [Pricing] (`~~1806469~~`).
     *
     * @param request UpdateClusterSpecRequest
     * @return UpdateClusterSpecResponse
     */
    public UpdateClusterSpecResponse updateClusterSpec(UpdateClusterSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClusterSpecWithOptions(request, runtime);
    }

    /**
     * @summary Updates the configurations of an instance.
     *
     * @param request UpdateConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConfigResponse
     */
    public UpdateConfigResponse updateConfigWithOptions(UpdateConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autopurgePurgeInterval)) {
            query.put("AutopurgePurgeInterval", request.autopurgePurgeInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autopurgeSnapRetainCount)) {
            query.put("AutopurgeSnapRetainCount", request.autopurgeSnapRetainCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configAuthEnabled)) {
            query.put("ConfigAuthEnabled", request.configAuthEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configSecretEnabled)) {
            query.put("ConfigSecretEnabled", request.configSecretEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("ConfigType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consoleUIEnabled)) {
            query.put("ConsoleUIEnabled", request.consoleUIEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eurekaSupported)) {
            query.put("EurekaSupported", request.eurekaSupported);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendedTypesEnable)) {
            query.put("ExtendedTypesEnable", request.extendedTypesEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initLimit)) {
            query.put("InitLimit", request.initLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.juteMaxbuffer)) {
            query.put("JuteMaxbuffer", request.juteMaxbuffer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MCPEnabled)) {
            query.put("MCPEnabled", request.MCPEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxClientCnxns)) {
            query.put("MaxClientCnxns", request.maxClientCnxns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSessionTimeout)) {
            query.put("MaxSessionTimeout", request.maxSessionTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minSessionTimeout)) {
            query.put("MinSessionTimeout", request.minSessionTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namingAuthEnabled)) {
            query.put("NamingAuthEnabled", request.namingAuthEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passWord)) {
            query.put("PassWord", request.passWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotCount)) {
            query.put("SnapshotCount", request.snapshotCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncLimit)) {
            query.put("SyncLimit", request.syncLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TLSEnabled)) {
            query.put("TLSEnabled", request.TLSEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tickTime)) {
            query.put("TickTime", request.tickTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openSuperAcl)) {
            body.put("OpenSuperAcl", request.openSuperAcl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigResponse());
    }

    /**
     * @summary Updates the configurations of an instance.
     *
     * @param request UpdateConfigRequest
     * @return UpdateConfigResponse
     */
    public UpdateConfigResponse updateConfig(UpdateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigWithOptions(request, runtime);
    }

    /**
     * @summary Updates a namespace for the Nacos engine.
     *
     * @param request UpdateEngineNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEngineNamespaceResponse
     */
    public UpdateEngineNamespaceResponse updateEngineNamespaceWithOptions(UpdateEngineNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCount)) {
            query.put("ServiceCount", request.serviceCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEngineNamespace"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEngineNamespaceResponse());
    }

    /**
     * @summary Updates a namespace for the Nacos engine.
     *
     * @param request UpdateEngineNamespaceRequest
     * @return UpdateEngineNamespaceResponse
     */
    public UpdateEngineNamespaceResponse updateEngineNamespace(UpdateEngineNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEngineNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary Updates a throttling rule.
     *
     * @param request UpdateFlowRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlowRuleResponse
     */
    public UpdateFlowRuleResponse updateFlowRuleWithOptions(UpdateFlowRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlBehavior)) {
            query.put("ControlBehavior", request.controlBehavior);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxQueueingTimeMs)) {
            query.put("MaxQueueingTimeMs", request.maxQueueingTimeMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlowRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowRuleResponse());
    }

    /**
     * @summary Updates a throttling rule.
     *
     * @param request UpdateFlowRuleRequest
     * @return UpdateFlowRuleResponse
     */
    public UpdateFlowRuleResponse updateFlowRule(UpdateFlowRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlowRuleWithOptions(request, runtime);
    }

    /**
     * @summary Updates the consumer on which a gateway performs authentication operations.
     *
     * @param request UpdateGatewayAuthConsumerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayAuthConsumerResponse
     */
    public UpdateGatewayAuthConsumerResponse updateGatewayAuthConsumerWithOptions(UpdateGatewayAuthConsumerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeType)) {
            query.put("EncodeType", request.encodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jwks)) {
            query.put("Jwks", request.jwks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyName)) {
            query.put("KeyName", request.keyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyValue)) {
            query.put("KeyValue", request.keyValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenName)) {
            query.put("TokenName", request.tokenName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenPass)) {
            query.put("TokenPass", request.tokenPass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenPosition)) {
            query.put("TokenPosition", request.tokenPosition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenPrefix)) {
            query.put("TokenPrefix", request.tokenPrefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayAuthConsumer"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayAuthConsumerResponse());
    }

    /**
     * @summary Updates the consumer on which a gateway performs authentication operations.
     *
     * @param request UpdateGatewayAuthConsumerRequest
     * @return UpdateGatewayAuthConsumerResponse
     */
    public UpdateGatewayAuthConsumerResponse updateGatewayAuthConsumer(UpdateGatewayAuthConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayAuthConsumerWithOptions(request, runtime);
    }

    /**
     * @summary Updates a list of resources on which permissions are granted to a gateway authentication consumer.
     *
     * @param tmpReq UpdateGatewayAuthConsumerResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayAuthConsumerResourceResponse
     */
    public UpdateGatewayAuthConsumerResourceResponse updateGatewayAuthConsumerResourceWithOptions(UpdateGatewayAuthConsumerResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayAuthConsumerResourceShrinkRequest request = new UpdateGatewayAuthConsumerResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceList)) {
            request.resourceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceList, "ResourceList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceListShrink)) {
            query.put("ResourceList", request.resourceListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayAuthConsumerResource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayAuthConsumerResourceResponse());
    }

    /**
     * @summary Updates a list of resources on which permissions are granted to a gateway authentication consumer.
     *
     * @param request UpdateGatewayAuthConsumerResourceRequest
     * @return UpdateGatewayAuthConsumerResourceResponse
     */
    public UpdateGatewayAuthConsumerResourceResponse updateGatewayAuthConsumerResource(UpdateGatewayAuthConsumerResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayAuthConsumerResourceWithOptions(request, runtime);
    }

    /**
     * @summary Updates the resource authorization status for the consumer on which a gateway performs authentication operations.
     *
     * @param request UpdateGatewayAuthConsumerResourceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayAuthConsumerResourceStatusResponse
     */
    public UpdateGatewayAuthConsumerResourceStatusResponse updateGatewayAuthConsumerResourceStatusWithOptions(UpdateGatewayAuthConsumerResourceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerId)) {
            query.put("ConsumerId", request.consumerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idList)) {
            query.put("IdList", request.idList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceStatus)) {
            query.put("ResourceStatus", request.resourceStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayAuthConsumerResourceStatus"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayAuthConsumerResourceStatusResponse());
    }

    /**
     * @summary Updates the resource authorization status for the consumer on which a gateway performs authentication operations.
     *
     * @param request UpdateGatewayAuthConsumerResourceStatusRequest
     * @return UpdateGatewayAuthConsumerResourceStatusResponse
     */
    public UpdateGatewayAuthConsumerResourceStatusResponse updateGatewayAuthConsumerResourceStatus(UpdateGatewayAuthConsumerResourceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayAuthConsumerResourceStatusWithOptions(request, runtime);
    }

    /**
     * @summary Updates the status of the consumer on which a gateway performs authentication operations.
     *
     * @param request UpdateGatewayAuthConsumerStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayAuthConsumerStatusResponse
     */
    public UpdateGatewayAuthConsumerStatusResponse updateGatewayAuthConsumerStatusWithOptions(UpdateGatewayAuthConsumerStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerStatus)) {
            query.put("ConsumerStatus", request.consumerStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayAuthConsumerStatus"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayAuthConsumerStatusResponse());
    }

    /**
     * @summary Updates the status of the consumer on which a gateway performs authentication operations.
     *
     * @param request UpdateGatewayAuthConsumerStatusRequest
     * @return UpdateGatewayAuthConsumerStatusResponse
     */
    public UpdateGatewayAuthConsumerStatusResponse updateGatewayAuthConsumerStatus(UpdateGatewayAuthConsumerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayAuthConsumerStatusWithOptions(request, runtime);
    }

    /**
     * @summary 更新网关路由熔断规则
     *
     * @param request UpdateGatewayCircuitBreakerRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayCircuitBreakerRuleResponse
     */
    public UpdateGatewayCircuitBreakerRuleResponse updateGatewayCircuitBreakerRuleWithOptions(UpdateGatewayCircuitBreakerRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.behaviorType)) {
            query.put("BehaviorType", request.behaviorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyEncoding)) {
            query.put("BodyEncoding", request.bodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAllowedMs)) {
            query.put("MaxAllowedMs", request.maxAllowedMs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRequestAmount)) {
            query.put("MinRequestAmount", request.minRequestAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryTimeoutSec)) {
            query.put("RecoveryTimeoutSec", request.recoveryTimeoutSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentBody)) {
            query.put("ResponseContentBody", request.responseContentBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRedirectUrl)) {
            query.put("ResponseRedirectUrl", request.responseRedirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseStatusCode)) {
            query.put("ResponseStatusCode", request.responseStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDurationSec)) {
            query.put("StatDurationSec", request.statDurationSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            query.put("Strategy", request.strategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerRatio)) {
            query.put("TriggerRatio", request.triggerRatio);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayCircuitBreakerRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayCircuitBreakerRuleResponse());
    }

    /**
     * @summary 更新网关路由熔断规则
     *
     * @param request UpdateGatewayCircuitBreakerRuleRequest
     * @return UpdateGatewayCircuitBreakerRuleResponse
     */
    public UpdateGatewayCircuitBreakerRuleResponse updateGatewayCircuitBreakerRule(UpdateGatewayCircuitBreakerRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayCircuitBreakerRuleWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the information about the domain name associated with a gateway.
     *
     * @param request UpdateGatewayDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayDomainResponse
     */
    public UpdateGatewayDomainResponse updateGatewayDomainWithOptions(UpdateGatewayDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.http2)) {
            query.put("Http2", request.http2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mustHttps)) {
            query.put("MustHttps", request.mustHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsMax)) {
            query.put("TlsMax", request.tlsMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsMin)) {
            query.put("TlsMin", request.tlsMin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayDomain"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayDomainResponse());
    }

    /**
     * @summary Modifies the information about the domain name associated with a gateway.
     *
     * @param request UpdateGatewayDomainRequest
     * @return UpdateGatewayDomainResponse
     */
    public UpdateGatewayDomainResponse updateGatewayDomain(UpdateGatewayDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayDomainWithOptions(request, runtime);
    }

    /**
     * @summary 更新网关路由流控规则
     *
     * @param request UpdateGatewayFlowRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayFlowRuleResponse
     */
    public UpdateGatewayFlowRuleResponse updateGatewayFlowRuleWithOptions(UpdateGatewayFlowRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.behaviorType)) {
            query.put("BehaviorType", request.behaviorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyEncoding)) {
            query.put("BodyEncoding", request.bodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentBody)) {
            query.put("ResponseContentBody", request.responseContentBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRedirectUrl)) {
            query.put("ResponseRedirectUrl", request.responseRedirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseStatusCode)) {
            query.put("ResponseStatusCode", request.responseStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayFlowRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayFlowRuleResponse());
    }

    /**
     * @summary 更新网关路由流控规则
     *
     * @param request UpdateGatewayFlowRuleRequest
     * @return UpdateGatewayFlowRuleResponse
     */
    public UpdateGatewayFlowRuleResponse updateGatewayFlowRule(UpdateGatewayFlowRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayFlowRuleWithOptions(request, runtime);
    }

    /**
     * @summary 更新网关路由隔离规则
     *
     * @param request UpdateGatewayIsolationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayIsolationRuleResponse
     */
    public UpdateGatewayIsolationRuleResponse updateGatewayIsolationRuleWithOptions(UpdateGatewayIsolationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.behaviorType)) {
            query.put("BehaviorType", request.behaviorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyEncoding)) {
            query.put("BodyEncoding", request.bodyEncoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            query.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentBody)) {
            query.put("ResponseContentBody", request.responseContentBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseRedirectUrl)) {
            query.put("ResponseRedirectUrl", request.responseRedirectUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseStatusCode)) {
            query.put("ResponseStatusCode", request.responseStatusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeName)) {
            query.put("RouteName", request.routeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayIsolationRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayIsolationRuleResponse());
    }

    /**
     * @summary 更新网关路由隔离规则
     *
     * @param request UpdateGatewayIsolationRuleRequest
     * @return UpdateGatewayIsolationRuleResponse
     */
    public UpdateGatewayIsolationRuleResponse updateGatewayIsolationRule(UpdateGatewayIsolationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayIsolationRuleWithOptions(request, runtime);
    }

    /**
     * @summary Renames a gateway.
     *
     * @param request UpdateGatewayNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayNameResponse
     */
    public UpdateGatewayNameResponse updateGatewayNameWithOptions(UpdateGatewayNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayName"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayNameResponse());
    }

    /**
     * @summary Renames a gateway.
     *
     * @param request UpdateGatewayNameRequest
     * @return UpdateGatewayNameResponse
     */
    public UpdateGatewayNameResponse updateGatewayName(UpdateGatewayNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayNameWithOptions(request, runtime);
    }

    /**
     * @summary Updates the configurations of a gateway.
     *
     * @param tmpReq UpdateGatewayOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayOptionResponse
     */
    public UpdateGatewayOptionResponse updateGatewayOptionWithOptions(UpdateGatewayOptionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayOptionShrinkRequest request = new UpdateGatewayOptionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.gatewayOption)) {
            request.gatewayOptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.gatewayOption, "GatewayOption", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayOptionShrink)) {
            query.put("GatewayOption", request.gatewayOptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayOption"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayOptionResponse());
    }

    /**
     * @summary Updates the configurations of a gateway.
     *
     * @param request UpdateGatewayOptionRequest
     * @return UpdateGatewayOptionResponse
     */
    public UpdateGatewayOptionResponse updateGatewayOption(UpdateGatewayOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayOptionWithOptions(request, runtime);
    }

    /**
     * @summary Updates a route for a gateway.
     *
     * @param tmpReq UpdateGatewayRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteResponse
     */
    public UpdateGatewayRouteResponse updateGatewayRouteWithOptions(UpdateGatewayRouteRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayRouteShrinkRequest request = new UpdateGatewayRouteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.directResponseJSON)) {
            request.directResponseJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.directResponseJSON, "DirectResponseJSON", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fallbackServices)) {
            request.fallbackServicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fallbackServices, "FallbackServices", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.predicates)) {
            request.predicatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.predicates, "Predicates", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.redirectJSON)) {
            request.redirectJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.redirectJSON, "RedirectJSON", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.services)) {
            request.servicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.services, "Services", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directResponseJSONShrink)) {
            query.put("DirectResponseJSON", request.directResponseJSONShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainIdListJSON)) {
            query.put("DomainIdListJSON", request.domainIdListJSON);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWaf)) {
            query.put("EnableWaf", request.enableWaf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallback)) {
            query.put("Fallback", request.fallback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackServicesShrink)) {
            query.put("FallbackServices", request.fallbackServicesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predicatesShrink)) {
            query.put("Predicates", request.predicatesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectJSONShrink)) {
            query.put("RedirectJSON", request.redirectJSONShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeOrder)) {
            query.put("RouteOrder", request.routeOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicesShrink)) {
            query.put("Services", request.servicesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRoute"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteResponse());
    }

    /**
     * @summary Updates a route for a gateway.
     *
     * @param request UpdateGatewayRouteRequest
     * @return UpdateGatewayRouteResponse
     */
    public UpdateGatewayRouteResponse updateGatewayRoute(UpdateGatewayRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayRouteWithOptions(request, runtime);
    }

    /**
     * @summary Updates the authentication configurations of a route.
     *
     * @param tmpReq UpdateGatewayRouteAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteAuthResponse
     */
    public UpdateGatewayRouteAuthResponse updateGatewayRouteAuthWithOptions(UpdateGatewayRouteAuthRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayRouteAuthShrinkRequest request = new UpdateGatewayRouteAuthShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.authJSON)) {
            request.authJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.authJSON, "AuthJSON", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authJSONShrink)) {
            query.put("AuthJSON", request.authJSONShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRouteAuth"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteAuthResponse());
    }

    /**
     * @summary Updates the authentication configurations of a route.
     *
     * @param request UpdateGatewayRouteAuthRequest
     * @return UpdateGatewayRouteAuthResponse
     */
    public UpdateGatewayRouteAuthResponse updateGatewayRouteAuth(UpdateGatewayRouteAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayRouteAuthWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the cross-origin resource sharing (CORS) policy of a route.
     *
     * @param tmpReq UpdateGatewayRouteCORSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteCORSResponse
     */
    public UpdateGatewayRouteCORSResponse updateGatewayRouteCORSWithOptions(UpdateGatewayRouteCORSRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayRouteCORSShrinkRequest request = new UpdateGatewayRouteCORSShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.corsJSON)) {
            request.corsJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.corsJSON, "CorsJSON", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corsJSONShrink)) {
            query.put("CorsJSON", request.corsJSONShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRouteCORS"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteCORSResponse());
    }

    /**
     * @summary Modifies the cross-origin resource sharing (CORS) policy of a route.
     *
     * @param request UpdateGatewayRouteCORSRequest
     * @return UpdateGatewayRouteCORSResponse
     */
    public UpdateGatewayRouteCORSResponse updateGatewayRouteCORS(UpdateGatewayRouteCORSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayRouteCORSWithOptions(request, runtime);
    }

    /**
     * @summary Updates the rewrite policy of a route for a gateway.
     *
     * @param request UpdateGatewayRouteHTTPRewriteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteHTTPRewriteResponse
     */
    public UpdateGatewayRouteHTTPRewriteResponse updateGatewayRouteHTTPRewriteWithOptions(UpdateGatewayRouteHTTPRewriteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpRewriteJSON)) {
            query.put("HttpRewriteJSON", request.httpRewriteJSON);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRouteHTTPRewrite"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteHTTPRewriteResponse());
    }

    /**
     * @summary Updates the rewrite policy of a route for a gateway.
     *
     * @param request UpdateGatewayRouteHTTPRewriteRequest
     * @return UpdateGatewayRouteHTTPRewriteResponse
     */
    public UpdateGatewayRouteHTTPRewriteResponse updateGatewayRouteHTTPRewrite(UpdateGatewayRouteHTTPRewriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayRouteHTTPRewriteWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the header configuration policy of a route.
     *
     * @param request UpdateGatewayRouteHeaderOpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteHeaderOpResponse
     */
    public UpdateGatewayRouteHeaderOpResponse updateGatewayRouteHeaderOpWithOptions(UpdateGatewayRouteHeaderOpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headerOpJSON)) {
            query.put("HeaderOpJSON", request.headerOpJSON);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRouteHeaderOp"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteHeaderOpResponse());
    }

    /**
     * @summary Modifies the header configuration policy of a route.
     *
     * @param request UpdateGatewayRouteHeaderOpRequest
     * @return UpdateGatewayRouteHeaderOpResponse
     */
    public UpdateGatewayRouteHeaderOpResponse updateGatewayRouteHeaderOp(UpdateGatewayRouteHeaderOpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayRouteHeaderOpWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the retry policy of a route.
     *
     * @param tmpReq UpdateGatewayRouteRetryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteRetryResponse
     */
    public UpdateGatewayRouteRetryResponse updateGatewayRouteRetryWithOptions(UpdateGatewayRouteRetryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayRouteRetryShrinkRequest request = new UpdateGatewayRouteRetryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retryJSON)) {
            request.retryJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retryJSON, "RetryJSON", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryJSONShrink)) {
            query.put("RetryJSON", request.retryJSONShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRouteRetry"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteRetryResponse());
    }

    /**
     * @summary Modifies the retry policy of a route.
     *
     * @param request UpdateGatewayRouteRetryRequest
     * @return UpdateGatewayRouteRetryResponse
     */
    public UpdateGatewayRouteRetryResponse updateGatewayRouteRetry(UpdateGatewayRouteRetryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayRouteRetryWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the timeout policy of a route.
     *
     * @param tmpReq UpdateGatewayRouteTimeoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteTimeoutResponse
     */
    public UpdateGatewayRouteTimeoutResponse updateGatewayRouteTimeoutWithOptions(UpdateGatewayRouteTimeoutRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayRouteTimeoutShrinkRequest request = new UpdateGatewayRouteTimeoutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timeoutJSON)) {
            request.timeoutJSONShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timeoutJSON, "TimeoutJSON", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutJSONShrink)) {
            query.put("TimeoutJSON", request.timeoutJSONShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRouteTimeout"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteTimeoutResponse());
    }

    /**
     * @summary Modifies the timeout policy of a route.
     *
     * @param request UpdateGatewayRouteTimeoutRequest
     * @return UpdateGatewayRouteTimeoutResponse
     */
    public UpdateGatewayRouteTimeoutResponse updateGatewayRouteTimeout(UpdateGatewayRouteTimeoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayRouteTimeoutWithOptions(request, runtime);
    }

    /**
     * @summary 更新路由waf状态
     *
     * @param request UpdateGatewayRouteWafStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayRouteWafStatusResponse
     */
    public UpdateGatewayRouteWafStatusResponse updateGatewayRouteWafStatusWithOptions(UpdateGatewayRouteWafStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWaf)) {
            query.put("EnableWaf", request.enableWaf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeId)) {
            query.put("RouteId", request.routeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayRouteWafStatus"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayRouteWafStatusResponse());
    }

    /**
     * @summary 更新路由waf状态
     *
     * @param request UpdateGatewayRouteWafStatusRequest
     * @return UpdateGatewayRouteWafStatusResponse
     */
    public UpdateGatewayRouteWafStatusResponse updateGatewayRouteWafStatus(UpdateGatewayRouteWafStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayRouteWafStatusWithOptions(request, runtime);
    }

    /**
     * @summary Updates the health check policy of a specified service in a cloud-native gateway.
     *
     * @param tmpReq UpdateGatewayServiceCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayServiceCheckResponse
     */
    public UpdateGatewayServiceCheckResponse updateGatewayServiceCheckWithOptions(UpdateGatewayServiceCheckRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayServiceCheckShrinkRequest request = new UpdateGatewayServiceCheckShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.expectedStatuses)) {
            request.expectedStatusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.expectedStatuses, "ExpectedStatuses", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.check)) {
            query.put("Check", request.check);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedStatusesShrink)) {
            query.put("ExpectedStatuses", request.expectedStatusesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpHost)) {
            query.put("HttpHost", request.httpHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpPath)) {
            query.put("HttpPath", request.httpPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayServiceCheck"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayServiceCheckResponse());
    }

    /**
     * @summary Updates the health check policy of a specified service in a cloud-native gateway.
     *
     * @param request UpdateGatewayServiceCheckRequest
     * @return UpdateGatewayServiceCheckResponse
     */
    public UpdateGatewayServiceCheckResponse updateGatewayServiceCheck(UpdateGatewayServiceCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayServiceCheckWithOptions(request, runtime);
    }

    /**
     * @summary Updates the traffic policy of a service.
     *
     * @param tmpReq UpdateGatewayServiceTrafficPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayServiceTrafficPolicyResponse
     */
    public UpdateGatewayServiceTrafficPolicyResponse updateGatewayServiceTrafficPolicyWithOptions(UpdateGatewayServiceTrafficPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayServiceTrafficPolicyShrinkRequest request = new UpdateGatewayServiceTrafficPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.gatewayTrafficPolicy)) {
            request.gatewayTrafficPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.gatewayTrafficPolicy, "GatewayTrafficPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayTrafficPolicyShrink)) {
            query.put("GatewayTrafficPolicy", request.gatewayTrafficPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayServiceTrafficPolicy"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayServiceTrafficPolicyResponse());
    }

    /**
     * @summary Updates the traffic policy of a service.
     *
     * @param request UpdateGatewayServiceTrafficPolicyRequest
     * @return UpdateGatewayServiceTrafficPolicyResponse
     */
    public UpdateGatewayServiceTrafficPolicyResponse updateGatewayServiceTrafficPolicy(UpdateGatewayServiceTrafficPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayServiceTrafficPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the version of a service.
     *
     * @param request UpdateGatewayServiceVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayServiceVersionResponse
     */
    public UpdateGatewayServiceVersionResponse updateGatewayServiceVersionWithOptions(UpdateGatewayServiceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayServiceVersion"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayServiceVersionResponse());
    }

    /**
     * @summary Modifies the version of a service.
     *
     * @param request UpdateGatewayServiceVersionRequest
     * @return UpdateGatewayServiceVersionResponse
     */
    public UpdateGatewayServiceVersionResponse updateGatewayServiceVersion(UpdateGatewayServiceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayServiceVersionWithOptions(request, runtime);
    }

    /**
     * @summary Updates the number of nodes or the specifications of nodes in a pay-as-you-go or subscription cloud-native gateway.
     *
     * @description You can call this operation to update the number of nodes or the specifications of nodes in a pay-as-you-go or subscription cloud-native gateway. If you add nodes or increase the specifications, you will incur fees. For more information, see [Pricing](https://help.aliyun.com/document_detail/250950.html).
     *
     * @param request UpdateGatewaySpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewaySpecResponse
     */
    public UpdateGatewaySpecResponse updateGatewaySpecWithOptions(UpdateGatewaySpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replica)) {
            query.put("Replica", request.replica);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewaySpec"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewaySpecResponse());
    }

    /**
     * @summary Updates the number of nodes or the specifications of nodes in a pay-as-you-go or subscription cloud-native gateway.
     *
     * @description You can call this operation to update the number of nodes or the specifications of nodes in a pay-as-you-go or subscription cloud-native gateway. If you add nodes or increase the specifications, you will incur fees. For more information, see [Pricing](https://help.aliyun.com/document_detail/250950.html).
     *
     * @param request UpdateGatewaySpecRequest
     * @return UpdateGatewaySpecResponse
     */
    public UpdateGatewaySpecResponse updateGatewaySpec(UpdateGatewaySpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewaySpecWithOptions(request, runtime);
    }

    /**
     * @summary Updates the version number of the destination cluster.
     *
     * @param request UpdateImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionCode)) {
            query.put("VersionCode", request.versionCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImage"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageResponse());
    }

    /**
     * @summary Updates the version number of the destination cluster.
     *
     * @param request UpdateImageRequest
     * @return UpdateImageResponse
     */
    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }

    /**
     * @summary 更新隔离规则
     *
     * @param request UpdateIsolationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIsolationRuleResponse
     */
    public UpdateIsolationRuleResponse updateIsolationRuleWithOptions(UpdateIsolationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIsolationRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIsolationRuleResponse());
    }

    /**
     * @summary 更新隔离规则
     *
     * @param request UpdateIsolationRuleRequest
     * @return UpdateIsolationRuleResponse
     */
    public UpdateIsolationRuleResponse updateIsolationRule(UpdateIsolationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIsolationRuleWithOptions(request, runtime);
    }

    /**
     * @summary Updates the configuration of a canary release for messaging of an application.
     *
     * @param tmpReq UpdateMessageQueueRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMessageQueueRouteResponse
     */
    public UpdateMessageQueueRouteResponse updateMessageQueueRouteWithOptions(UpdateMessageQueueRouteRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMessageQueueRouteShrinkRequest request = new UpdateMessageQueueRouteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterSide)) {
            query.put("FilterSide", request.filterSide);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMessageQueueRoute"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMessageQueueRouteResponse());
    }

    /**
     * @summary Updates the configuration of a canary release for messaging of an application.
     *
     * @param request UpdateMessageQueueRouteRequest
     * @return UpdateMessageQueueRouteResponse
     */
    public UpdateMessageQueueRouteResponse updateMessageQueueRoute(UpdateMessageQueueRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMessageQueueRouteWithOptions(request, runtime);
    }

    /**
     * @summary Updates a migration task.
     *
     * @param request UpdateMigrationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMigrationTaskResponse
     */
    public UpdateMigrationTaskResponse updateMigrationTaskWithOptions(UpdateMigrationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originInstanceAddress)) {
            query.put("OriginInstanceAddress", request.originInstanceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originInstanceName)) {
            query.put("OriginInstanceName", request.originInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originInstanceNamespace)) {
            query.put("OriginInstanceNamespace", request.originInstanceNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectDesc)) {
            query.put("ProjectDesc", request.projectDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetClusterName)) {
            query.put("TargetClusterName", request.targetClusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetClusterUrl)) {
            query.put("TargetClusterUrl", request.targetClusterUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            query.put("TargetInstanceId", request.targetInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMigrationTask"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMigrationTaskResponse());
    }

    /**
     * @summary Updates a migration task.
     *
     * @param request UpdateMigrationTaskRequest
     * @return UpdateMigrationTaskResponse
     */
    public UpdateMigrationTaskResponse updateMigrationTask(UpdateMigrationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMigrationTaskWithOptions(request, runtime);
    }

    /**
     * @summary Updates the information about a Nacos cluster.
     *
     * @param request UpdateNacosClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNacosClusterResponse
     */
    public UpdateNacosClusterResponse updateNacosClusterWithOptions(UpdateNacosClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkPort)) {
            query.put("CheckPort", request.checkPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthChecker)) {
            query.put("HealthChecker", request.healthChecker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useInstancePortForCheck)) {
            query.put("UseInstancePortForCheck", request.useInstancePortForCheck);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNacosCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacosClusterResponse());
    }

    /**
     * @summary Updates the information about a Nacos cluster.
     *
     * @param request UpdateNacosClusterRequest
     * @return UpdateNacosClusterResponse
     */
    public UpdateNacosClusterResponse updateNacosCluster(UpdateNacosClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNacosClusterWithOptions(request, runtime);
    }

    /**
     * @summary Updates a Nacos configuration.
     *
     * @description >  The current API operation is not provided in Nacos SDK. For more information about Nacos SDK, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request UpdateNacosConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNacosConfigResponse
     */
    public UpdateNacosConfigResponse updateNacosConfigWithOptions(UpdateNacosConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.betaIps)) {
            query.put("BetaIps", request.betaIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataId)) {
            query.put("DataId", request.dataId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedDataKey)) {
            query.put("EncryptedDataKey", request.encryptedDataKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            query.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNacosConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacosConfigResponse());
    }

    /**
     * @summary Updates a Nacos configuration.
     *
     * @description >  The current API operation is not provided in Nacos SDK. For more information about Nacos SDK, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request UpdateNacosConfigRequest
     * @return UpdateNacosConfigResponse
     */
    public UpdateNacosConfigResponse updateNacosConfig(UpdateNacosConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNacosConfigWithOptions(request, runtime);
    }

    /**
     * @summary Updates the information about application instances that are registered with a Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request UpdateNacosInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNacosInstanceResponse
     */
    public UpdateNacosInstanceResponse updateNacosInstanceWithOptions(UpdateNacosInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeral)) {
            query.put("Ephemeral", request.ephemeral);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            query.put("Weight", request.weight);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("Metadata", request.metadata);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNacosInstance"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacosInstanceResponse());
    }

    /**
     * @summary Updates the information about application instances that are registered with a Nacos instance.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request UpdateNacosInstanceRequest
     * @return UpdateNacosInstanceResponse
     */
    public UpdateNacosInstanceResponse updateNacosInstance(UpdateNacosInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNacosInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Updates the information about a Nacos service.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request UpdateNacosServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNacosServiceResponse
     */
    public UpdateNacosServiceResponse updateNacosServiceWithOptions(UpdateNacosServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protectThreshold)) {
            query.put("ProtectThreshold", request.protectThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNacosService"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNacosServiceResponse());
    }

    /**
     * @summary Updates the information about a Nacos service.
     *
     * @description > The operation is not provided in Nacos SDKs. For information about Nacos SDKs, see the [official documentation](https://nacos.io/zh-cn/docs/sdk.html).
     *
     * @param request UpdateNacosServiceRequest
     * @return UpdateNacosServiceResponse
     */
    public UpdateNacosServiceResponse updateNacosService(UpdateNacosServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNacosServiceWithOptions(request, runtime);
    }

    /**
     * @summary Updates the configuration of a plug-in.
     *
     * @param request UpdatePluginConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePluginConfigResponse
     */
    public UpdatePluginConfigResponse updatePluginConfigWithOptions(UpdatePluginConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configLevel)) {
            query.put("ConfigLevel", request.configLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            query.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            query.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePluginConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePluginConfigResponse());
    }

    /**
     * @summary Updates the configuration of a plug-in.
     *
     * @param request UpdatePluginConfigRequest
     * @return UpdatePluginConfigResponse
     */
    public UpdatePluginConfigResponse updatePluginConfig(UpdatePluginConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePluginConfigWithOptions(request, runtime);
    }

    /**
     * @summary Updates a certificate.
     *
     * @param request UpdateSSLCertRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSSLCertResponse
     */
    public UpdateSSLCertResponse updateSSLCertWithOptions(UpdateSSLCertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIdentifier)) {
            query.put("CertIdentifier", request.certIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSSLCert"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSSLCertResponse());
    }

    /**
     * @summary Updates a certificate.
     *
     * @param request UpdateSSLCertRequest
     * @return UpdateSSLCertResponse
     */
    public UpdateSSLCertResponse updateSSLCert(UpdateSSLCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSSLCertWithOptions(request, runtime);
    }

    /**
     * @summary Modifies service sources of a cloud-native gateway. You can modify only Container Service for Kubernetes (ACK) service sources that contain configurations related to Ingress resource monitoring.
     *
     * @param tmpReq UpdateServiceSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServiceSourceResponse
     */
    public UpdateServiceSourceResponse updateServiceSourceWithOptions(UpdateServiceSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateServiceSourceShrinkRequest request = new UpdateServiceSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ingressOptionsRequest)) {
            request.ingressOptionsRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ingressOptionsRequest, "IngressOptionsRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pathList)) {
            request.pathListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pathList, "PathList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayId)) {
            query.put("GatewayId", request.gatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressOptionsRequestShrink)) {
            query.put("IngressOptionsRequest", request.ingressOptionsRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pathListShrink)) {
            query.put("PathList", request.pathListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceSourceResponse());
    }

    /**
     * @summary Modifies service sources of a cloud-native gateway. You can modify only Container Service for Kubernetes (ACK) service sources that contain configurations related to Ingress resource monitoring.
     *
     * @param request UpdateServiceSourceRequest
     * @return UpdateServiceSourceResponse
     */
    public UpdateServiceSourceResponse updateServiceSource(UpdateServiceSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceSourceWithOptions(request, runtime);
    }

    /**
     * @summary Updates the information about a ZooKeeper node.
     *
     * @param request UpdateZnodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateZnodeResponse
     */
    public UpdateZnodeResponse updateZnodeWithOptions(UpdateZnodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateZnode"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateZnodeResponse());
    }

    /**
     * @summary Updates the information about a ZooKeeper node.
     *
     * @param request UpdateZnodeRequest
     * @return UpdateZnodeResponse
     */
    public UpdateZnodeResponse updateZnode(UpdateZnodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateZnodeWithOptions(request, runtime);
    }

    /**
     * @summary Upgrades the version of a cluster.
     *
     * @param request UpgradeClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeClusterResponse
     */
    public UpgradeClusterResponse upgradeClusterWithOptions(UpgradeClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeVersion)) {
            query.put("UpgradeVersion", request.upgradeVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClusterResponse());
    }

    /**
     * @summary Upgrades the version of a cluster.
     *
     * @param request UpgradeClusterRequest
     * @return UpgradeClusterResponse
     */
    public UpgradeClusterResponse upgradeCluster(UpgradeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeClusterWithOptions(request, runtime);
    }
}

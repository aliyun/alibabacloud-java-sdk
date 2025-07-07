// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209;

import com.aliyun.tea.*;
import com.aliyun.accountcenter20241209.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("accountcenter", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>修改登录密码</p>
     * 
     * @param request EnterpriseAccountChangeLoginPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountChangeLoginPasswordResponse
     */
    public EnterpriseAccountChangeLoginPasswordResponse enterpriseAccountChangeLoginPasswordWithOptions(EnterpriseAccountChangeLoginPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptPassword)) {
            query.put("EncryptPassword", request.encryptPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountChangeLoginPassword"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountChangeLoginPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改登录密码</p>
     * 
     * @param request EnterpriseAccountChangeLoginPasswordRequest
     * @return EnterpriseAccountChangeLoginPasswordResponse
     */
    public EnterpriseAccountChangeLoginPasswordResponse enterpriseAccountChangeLoginPassword(EnterpriseAccountChangeLoginPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountChangeLoginPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改安全邮箱</p>
     * 
     * @param request EnterpriseAccountChangeSecurityEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountChangeSecurityEmailResponse
     */
    public EnterpriseAccountChangeSecurityEmailResponse enterpriseAccountChangeSecurityEmailWithOptions(EnterpriseAccountChangeSecurityEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEmail)) {
            query.put("SecurityEmail", request.securityEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountChangeSecurityEmail"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountChangeSecurityEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改安全邮箱</p>
     * 
     * @param request EnterpriseAccountChangeSecurityEmailRequest
     * @return EnterpriseAccountChangeSecurityEmailResponse
     */
    public EnterpriseAccountChangeSecurityEmailResponse enterpriseAccountChangeSecurityEmail(EnterpriseAccountChangeSecurityEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountChangeSecurityEmailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改成员账号安全手机号</p>
     * 
     * @param request EnterpriseAccountChangeSecurityMobileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountChangeSecurityMobileResponse
     */
    public EnterpriseAccountChangeSecurityMobileResponse enterpriseAccountChangeSecurityMobileWithOptions(EnterpriseAccountChangeSecurityMobileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newMobile)) {
            query.put("NewMobile", request.newMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationCode)) {
            query.put("VerificationCode", request.verificationCode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountChangeSecurityMobile"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountChangeSecurityMobileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改成员账号安全手机号</p>
     * 
     * @param request EnterpriseAccountChangeSecurityMobileRequest
     * @return EnterpriseAccountChangeSecurityMobileResponse
     */
    public EnterpriseAccountChangeSecurityMobileResponse enterpriseAccountChangeSecurityMobile(EnterpriseAccountChangeSecurityMobileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountChangeSecurityMobileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询纳管账号授权角色</p>
     * 
     * @param request EnterpriseAccountQueryAccountGrantedRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountQueryAccountGrantedRolesResponse
     */
    public EnterpriseAccountQueryAccountGrantedRolesResponse enterpriseAccountQueryAccountGrantedRolesWithOptions(EnterpriseAccountQueryAccountGrantedRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOpenApi)) {
            body.put("IsOpenApi", request.isOpenApi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            body.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCompleteInfo)) {
            body.put("ShowCompleteInfo", request.showCompleteInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountQueryAccountGrantedRoles"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountQueryAccountGrantedRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询纳管账号授权角色</p>
     * 
     * @param request EnterpriseAccountQueryAccountGrantedRolesRequest
     * @return EnterpriseAccountQueryAccountGrantedRolesResponse
     */
    public EnterpriseAccountQueryAccountGrantedRolesResponse enterpriseAccountQueryAccountGrantedRoles(EnterpriseAccountQueryAccountGrantedRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountQueryAccountGrantedRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询纳管账号信息</p>
     * 
     * @param request EnterpriseAccountQueryAccountsInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountQueryAccountsInfoResponse
     */
    public EnterpriseAccountQueryAccountsInfoResponse enterpriseAccountQueryAccountsInfoWithOptions(EnterpriseAccountQueryAccountsInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pksJson)) {
            query.put("PksJson", request.pksJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCompleteInfo)) {
            body.put("ShowCompleteInfo", request.showCompleteInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountQueryAccountsInfo"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountQueryAccountsInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询纳管账号信息</p>
     * 
     * @param request EnterpriseAccountQueryAccountsInfoRequest
     * @return EnterpriseAccountQueryAccountsInfoResponse
     */
    public EnterpriseAccountQueryAccountsInfoResponse enterpriseAccountQueryAccountsInfo(EnterpriseAccountQueryAccountsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountQueryAccountsInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询纳管账号登录设置</p>
     * 
     * @param request EnterpriseAccountQueryLoginSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountQueryLoginSettingsResponse
     */
    public EnterpriseAccountQueryLoginSettingsResponse enterpriseAccountQueryLoginSettingsWithOptions(EnterpriseAccountQueryLoginSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOpenApi)) {
            body.put("IsOpenApi", request.isOpenApi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            body.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCompleteInfo)) {
            body.put("ShowCompleteInfo", request.showCompleteInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountQueryLoginSettings"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountQueryLoginSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询纳管账号登录设置</p>
     * 
     * @param request EnterpriseAccountQueryLoginSettingsRequest
     * @return EnterpriseAccountQueryLoginSettingsResponse
     */
    public EnterpriseAccountQueryLoginSettingsResponse enterpriseAccountQueryLoginSettings(EnterpriseAccountQueryLoginSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountQueryLoginSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除mfa</p>
     * 
     * @param request EnterpriseAccountRemoveMfaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountRemoveMfaResponse
     */
    public EnterpriseAccountRemoveMfaResponse enterpriseAccountRemoveMfaWithOptions(EnterpriseAccountRemoveMfaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountRemoveMfa"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountRemoveMfaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除mfa</p>
     * 
     * @param request EnterpriseAccountRemoveMfaRequest
     * @return EnterpriseAccountRemoveMfaResponse
     */
    public EnterpriseAccountRemoveMfaResponse enterpriseAccountRemoveMfa(EnterpriseAccountRemoveMfaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountRemoveMfaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>脱离ea</p>
     * 
     * @param request EnterpriseAccountSeparateEaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountSeparateEaResponse
     */
    public EnterpriseAccountSeparateEaResponse enterpriseAccountSeparateEaWithOptions(EnterpriseAccountSeparateEaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountSeparateEa"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountSeparateEaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>脱离ea</p>
     * 
     * @param request EnterpriseAccountSeparateEaRequest
     * @return EnterpriseAccountSeparateEaResponse
     */
    public EnterpriseAccountSeparateEaResponse enterpriseAccountSeparateEa(EnterpriseAccountSeparateEaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountSeparateEaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新账号企业多账号中的别名</p>
     * 
     * @param request EnterpriseAccountUpdateAccountAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountUpdateAccountAliasResponse
     */
    public EnterpriseAccountUpdateAccountAliasResponse enterpriseAccountUpdateAccountAliasWithOptions(EnterpriseAccountUpdateAccountAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountUpdateAccountAlias"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountUpdateAccountAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新账号企业多账号中的别名</p>
     * 
     * @param request EnterpriseAccountUpdateAccountAliasRequest
     * @return EnterpriseAccountUpdateAccountAliasResponse
     */
    public EnterpriseAccountUpdateAccountAliasResponse enterpriseAccountUpdateAccountAlias(EnterpriseAccountUpdateAccountAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountUpdateAccountAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新账号授权</p>
     * 
     * @param request EnterpriseAccountUpdateAccountBizRoleGrantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountUpdateAccountBizRoleGrantResponse
     */
    public EnterpriseAccountUpdateAccountBizRoleGrantResponse enterpriseAccountUpdateAccountBizRoleGrantWithOptions(EnterpriseAccountUpdateAccountBizRoleGrantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleCodeListJson)) {
            query.put("BizRoleCodeListJson", request.bizRoleCodeListJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountUpdateAccountBizRoleGrant"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountUpdateAccountBizRoleGrantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新账号授权</p>
     * 
     * @param request EnterpriseAccountUpdateAccountBizRoleGrantRequest
     * @return EnterpriseAccountUpdateAccountBizRoleGrantResponse
     */
    public EnterpriseAccountUpdateAccountBizRoleGrantResponse enterpriseAccountUpdateAccountBizRoleGrant(EnterpriseAccountUpdateAccountBizRoleGrantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountUpdateAccountBizRoleGrantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置Ip掩码</p>
     * 
     * @param request EnterpriseAccountUpdateIpMaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountUpdateIpMaskResponse
     */
    public EnterpriseAccountUpdateIpMaskResponse enterpriseAccountUpdateIpMaskWithOptions(EnterpriseAccountUpdateIpMaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipMasksJson)) {
            query.put("IpMasksJson", request.ipMasksJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountUpdateIpMask"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountUpdateIpMaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置Ip掩码</p>
     * 
     * @param request EnterpriseAccountUpdateIpMaskRequest
     * @return EnterpriseAccountUpdateIpMaskResponse
     */
    public EnterpriseAccountUpdateIpMaskResponse enterpriseAccountUpdateIpMask(EnterpriseAccountUpdateIpMaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountUpdateIpMaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新操作风控</p>
     * 
     * @param request EnterpriseAccountUpdateOperateRiskControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountUpdateOperateRiskControlResponse
     */
    public EnterpriseAccountUpdateOperateRiskControlResponse enterpriseAccountUpdateOperateRiskControlWithOptions(EnterpriseAccountUpdateOperateRiskControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productLevel)) {
            query.put("ProductLevel", request.productLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateType)) {
            query.put("ValidateType", request.validateType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountUpdateOperateRiskControl"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountUpdateOperateRiskControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新操作风控</p>
     * 
     * @param request EnterpriseAccountUpdateOperateRiskControlRequest
     * @return EnterpriseAccountUpdateOperateRiskControlResponse
     */
    public EnterpriseAccountUpdateOperateRiskControlResponse enterpriseAccountUpdateOperateRiskControl(EnterpriseAccountUpdateOperateRiskControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountUpdateOperateRiskControlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改安全手机启用状态</p>
     * 
     * @param request EnterpriseAccountUpdateSecurityMobileLoginStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountUpdateSecurityMobileLoginStatusResponse
     */
    public EnterpriseAccountUpdateSecurityMobileLoginStatusResponse enterpriseAccountUpdateSecurityMobileLoginStatusWithOptions(EnterpriseAccountUpdateSecurityMobileLoginStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountUpdateSecurityMobileLoginStatus"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountUpdateSecurityMobileLoginStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改安全手机启用状态</p>
     * 
     * @param request EnterpriseAccountUpdateSecurityMobileLoginStatusRequest
     * @return EnterpriseAccountUpdateSecurityMobileLoginStatusResponse
     */
    public EnterpriseAccountUpdateSecurityMobileLoginStatusResponse enterpriseAccountUpdateSecurityMobileLoginStatus(EnterpriseAccountUpdateSecurityMobileLoginStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountUpdateSecurityMobileLoginStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新过期时间</p>
     * 
     * @param request EnterpriseAccountUpdateSessionExpireTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseAccountUpdateSessionExpireTimeResponse
     */
    public EnterpriseAccountUpdateSessionExpireTimeResponse enterpriseAccountUpdateSessionExpireTimeWithOptions(EnterpriseAccountUpdateSessionExpireTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pk)) {
            query.put("Pk", request.pk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionExpireTime)) {
            query.put("SessionExpireTime", request.sessionExpireTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseAccountUpdateSessionExpireTime"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseAccountUpdateSessionExpireTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新过期时间</p>
     * 
     * @param request EnterpriseAccountUpdateSessionExpireTimeRequest
     * @return EnterpriseAccountUpdateSessionExpireTimeResponse
     */
    public EnterpriseAccountUpdateSessionExpireTimeResponse enterpriseAccountUpdateSessionExpireTime(EnterpriseAccountUpdateSessionExpireTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseAccountUpdateSessionExpireTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>组织目录树查询</p>
     * 
     * @param request EnterpriseOrgQueryLoadTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseOrgQueryLoadTreeResponse
     */
    public EnterpriseOrgQueryLoadTreeResponse enterpriseOrgQueryLoadTreeWithOptions(EnterpriseOrgQueryLoadTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadOrgOnly)) {
            query.put("LoadOrgOnly", request.loadOrgOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseOrgQueryLoadTree"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseOrgQueryLoadTreeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>组织目录树查询</p>
     * 
     * @param request EnterpriseOrgQueryLoadTreeRequest
     * @return EnterpriseOrgQueryLoadTreeResponse
     */
    public EnterpriseOrgQueryLoadTreeResponse enterpriseOrgQueryLoadTree(EnterpriseOrgQueryLoadTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseOrgQueryLoadTreeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建成员账号</p>
     * 
     * @param request EnterpriseRegisterAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseRegisterAccountResponse
     */
    public EnterpriseRegisterAccountResponse enterpriseRegisterAccountWithOptions(EnterpriseRegisterAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptPassword)) {
            query.put("EncryptPassword", request.encryptPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginEmail)) {
            query.put("LoginEmail", request.loginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCompleteInfo)) {
            query.put("ShowCompleteInfo", request.showCompleteInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteNick)) {
            query.put("SiteNick", request.siteNick);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseRegisterAccount"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseRegisterAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建成员账号</p>
     * 
     * @param request EnterpriseRegisterAccountRequest
     * @return EnterpriseRegisterAccountResponse
     */
    public EnterpriseRegisterAccountResponse enterpriseRegisterAccount(EnterpriseRegisterAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseRegisterAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建业务角色</p>
     * 
     * @param request EnterpriseRoleCreateBizRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseRoleCreateBizRoleResponse
     */
    public EnterpriseRoleCreateBizRoleResponse enterpriseRoleCreateBizRoleWithOptions(EnterpriseRoleCreateBizRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizPermissionCodeListJson)) {
            query.put("BizPermissionCodeListJson", request.bizPermissionCodeListJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleDesc)) {
            query.put("BizRoleDesc", request.bizRoleDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleName)) {
            query.put("BizRoleName", request.bizRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseRoleCreateBizRole"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseRoleCreateBizRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建业务角色</p>
     * 
     * @param request EnterpriseRoleCreateBizRoleRequest
     * @return EnterpriseRoleCreateBizRoleResponse
     */
    public EnterpriseRoleCreateBizRoleResponse enterpriseRoleCreateBizRole(EnterpriseRoleCreateBizRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseRoleCreateBizRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除业务角色</p>
     * 
     * @param request EnterpriseRoleDeleteBizRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseRoleDeleteBizRoleResponse
     */
    public EnterpriseRoleDeleteBizRoleResponse enterpriseRoleDeleteBizRoleWithOptions(EnterpriseRoleDeleteBizRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleCode)) {
            query.put("BizRoleCode", request.bizRoleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseRoleDeleteBizRole"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseRoleDeleteBizRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除业务角色</p>
     * 
     * @param request EnterpriseRoleDeleteBizRoleRequest
     * @return EnterpriseRoleDeleteBizRoleResponse
     */
    public EnterpriseRoleDeleteBizRoleResponse enterpriseRoleDeleteBizRole(EnterpriseRoleDeleteBizRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseRoleDeleteBizRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>角色授权场景下分页查询账号</p>
     * 
     * @param request EnterpriseRoleQueryAccountForRoleGrantByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseRoleQueryAccountForRoleGrantByPageResponse
     */
    public EnterpriseRoleQueryAccountForRoleGrantByPageResponse enterpriseRoleQueryAccountForRoleGrantByPageWithOptions(EnterpriseRoleQueryAccountForRoleGrantByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleCode)) {
            query.put("BizRoleCode", request.bizRoleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCompleteInfo)) {
            query.put("ShowCompleteInfo", request.showCompleteInfo);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseRoleQueryAccountForRoleGrantByPage"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseRoleQueryAccountForRoleGrantByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>角色授权场景下分页查询账号</p>
     * 
     * @param request EnterpriseRoleQueryAccountForRoleGrantByPageRequest
     * @return EnterpriseRoleQueryAccountForRoleGrantByPageResponse
     */
    public EnterpriseRoleQueryAccountForRoleGrantByPageResponse enterpriseRoleQueryAccountForRoleGrantByPage(EnterpriseRoleQueryAccountForRoleGrantByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseRoleQueryAccountForRoleGrantByPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询业务角色</p>
     * 
     * @param request EnterpriseRoleQueryBizRoleByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseRoleQueryBizRoleByPageResponse
     */
    public EnterpriseRoleQueryBizRoleByPageResponse enterpriseRoleQueryBizRoleByPageWithOptions(EnterpriseRoleQueryBizRoleByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            query.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcType)) {
            query.put("SrcType", request.srcType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseRoleQueryBizRoleByPage"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseRoleQueryBizRoleByPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询业务角色</p>
     * 
     * @param request EnterpriseRoleQueryBizRoleByPageRequest
     * @return EnterpriseRoleQueryBizRoleByPageResponse
     */
    public EnterpriseRoleQueryBizRoleByPageResponse enterpriseRoleQueryBizRoleByPage(EnterpriseRoleQueryBizRoleByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseRoleQueryBizRoleByPageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询业务角色详情</p>
     * 
     * @param request EnterpriseRoleQueryBizRoleDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseRoleQueryBizRoleDetailResponse
     */
    public EnterpriseRoleQueryBizRoleDetailResponse enterpriseRoleQueryBizRoleDetailWithOptions(EnterpriseRoleQueryBizRoleDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleCode)) {
            query.put("BizRoleCode", request.bizRoleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseRoleQueryBizRoleDetail"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseRoleQueryBizRoleDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询业务角色详情</p>
     * 
     * @param request EnterpriseRoleQueryBizRoleDetailRequest
     * @return EnterpriseRoleQueryBizRoleDetailResponse
     */
    public EnterpriseRoleQueryBizRoleDetailResponse enterpriseRoleQueryBizRoleDetail(EnterpriseRoleQueryBizRoleDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseRoleQueryBizRoleDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新业务角色</p>
     * 
     * @param request EnterpriseRoleUpdateBizRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseRoleUpdateBizRoleResponse
     */
    public EnterpriseRoleUpdateBizRoleResponse enterpriseRoleUpdateBizRoleWithOptions(EnterpriseRoleUpdateBizRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizPermissionCodeListJson)) {
            query.put("BizPermissionCodeListJson", request.bizPermissionCodeListJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleCode)) {
            query.put("BizRoleCode", request.bizRoleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleDesc)) {
            query.put("BizRoleDesc", request.bizRoleDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRoleName)) {
            query.put("BizRoleName", request.bizRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseRoleUpdateBizRole"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseRoleUpdateBizRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新业务角色</p>
     * 
     * @param request EnterpriseRoleUpdateBizRoleRequest
     * @return EnterpriseRoleUpdateBizRoleResponse
     */
    public EnterpriseRoleUpdateBizRoleResponse enterpriseRoleUpdateBizRole(EnterpriseRoleUpdateBizRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseRoleUpdateBizRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>处理待办项</p>
     * 
     * @param request EnterpriseTodoDealAccountTodoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseTodoDealAccountTodoResponse
     */
    public EnterpriseTodoDealAccountTodoResponse enterpriseTodoDealAccountTodoWithOptions(EnterpriseTodoDealAccountTodoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.todoId)) {
            body.put("TodoId", request.todoId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseTodoDealAccountTodo"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseTodoDealAccountTodoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>处理待办项</p>
     * 
     * @param request EnterpriseTodoDealAccountTodoRequest
     * @return EnterpriseTodoDealAccountTodoResponse
     */
    public EnterpriseTodoDealAccountTodoResponse enterpriseTodoDealAccountTodo(EnterpriseTodoDealAccountTodoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseTodoDealAccountTodoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前登录用户处理的待办项列表</p>
     * 
     * @param request EnterpriseTodoQueryAccountTodoListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseTodoQueryAccountTodoListResponse
     */
    public EnterpriseTodoQueryAccountTodoListResponse enterpriseTodoQueryAccountTodoListWithOptions(EnterpriseTodoQueryAccountTodoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatePk)) {
            body.put("OperatePk", request.operatePk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCompleteInfo)) {
            body.put("ShowCompleteInfo", request.showCompleteInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.todoType)) {
            body.put("TodoType", request.todoType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseTodoQueryAccountTodoList"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseTodoQueryAccountTodoListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前登录用户处理的待办项列表</p>
     * 
     * @param request EnterpriseTodoQueryAccountTodoListRequest
     * @return EnterpriseTodoQueryAccountTodoListResponse
     */
    public EnterpriseTodoQueryAccountTodoListResponse enterpriseTodoQueryAccountTodoList(EnterpriseTodoQueryAccountTodoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseTodoQueryAccountTodoListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前登录用户发起的待办项列表</p>
     * 
     * @param request EnterpriseTodoQueryAccountTodoListByApplicantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseTodoQueryAccountTodoListByApplicantResponse
     */
    public EnterpriseTodoQueryAccountTodoListByApplicantResponse enterpriseTodoQueryAccountTodoListByApplicantWithOptions(EnterpriseTodoQueryAccountTodoListByApplicantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatePk)) {
            body.put("OperatePk", request.operatePk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedEcId)) {
            body.put("OrientedEcId", request.orientedEcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedLeId)) {
            body.put("OrientedLeId", request.orientedLeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orientedNbId)) {
            body.put("OrientedNbId", request.orientedNbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showCompleteInfo)) {
            body.put("ShowCompleteInfo", request.showCompleteInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.todoType)) {
            body.put("TodoType", request.todoType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseTodoQueryAccountTodoListByApplicant"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseTodoQueryAccountTodoListByApplicantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前登录用户发起的待办项列表</p>
     * 
     * @param request EnterpriseTodoQueryAccountTodoListByApplicantRequest
     * @return EnterpriseTodoQueryAccountTodoListByApplicantResponse
     */
    public EnterpriseTodoQueryAccountTodoListByApplicantResponse enterpriseTodoQueryAccountTodoListByApplicant(EnterpriseTodoQueryAccountTodoListByApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseTodoQueryAccountTodoListByApplicantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>管理员邀请纳管</p>
     * 
     * @param request EnterpriseUninvitedAdminInviteJoinEnterpriseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnterpriseUninvitedAdminInviteJoinEnterpriseResponse
     */
    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponse enterpriseUninvitedAdminInviteJoinEnterpriseWithOptions(EnterpriseUninvitedAdminInviteJoinEnterpriseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecId)) {
            query.put("EcId", request.ecId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptTicket)) {
            query.put("EncryptTicket", request.encryptTicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inviteePk)) {
            query.put("InviteePk", request.inviteePk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leId)) {
            query.put("LeId", request.leId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbId)) {
            query.put("NbId", request.nbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnterpriseUninvitedAdminInviteJoinEnterprise"),
            new TeaPair("version", "2024-12-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnterpriseUninvitedAdminInviteJoinEnterpriseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>管理员邀请纳管</p>
     * 
     * @param request EnterpriseUninvitedAdminInviteJoinEnterpriseRequest
     * @return EnterpriseUninvitedAdminInviteJoinEnterpriseResponse
     */
    public EnterpriseUninvitedAdminInviteJoinEnterpriseResponse enterpriseUninvitedAdminInviteJoinEnterprise(EnterpriseUninvitedAdminInviteJoinEnterpriseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enterpriseUninvitedAdminInviteJoinEnterpriseWithOptions(request, runtime);
    }
}

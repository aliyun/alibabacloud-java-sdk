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
}

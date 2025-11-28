// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707;

import com.aliyun.tea.*;
import com.aliyun.lto20210707.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("lto", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AddBaaSAntChainBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBaaSAntChainBizChainResponse
     */
    public AddBaaSAntChainBizChainResponse addBaaSAntChainBizChainWithOptions(AddBaaSAntChainBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSAntChainChainId)) {
            query.put("BaaSAntChainChainId", request.baaSAntChainChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baaSAntChainConsortiumId)) {
            query.put("BaaSAntChainConsortiumId", request.baaSAntChainConsortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caCert)) {
            query.put("CaCert", request.caCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caCertPassword)) {
            query.put("CaCertPassword", request.caCertPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientCert)) {
            query.put("ClientCert", request.clientCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientKey)) {
            query.put("ClientKey", request.clientKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientKeyPassword)) {
            query.put("ClientKeyPassword", request.clientKeyPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractTemplateIdList)) {
            query.put("ContractTemplateIdList", request.contractTemplateIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNameList)) {
            query.put("NodeNameList", request.nodeNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKey)) {
            query.put("UserKey", request.userKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userKeyPassword)) {
            query.put("UserKeyPassword", request.userKeyPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBaaSAntChainBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBaaSAntChainBizChainResponse());
    }

    /**
     * @param request AddBaaSAntChainBizChainRequest
     * @return AddBaaSAntChainBizChainResponse
     */
    public AddBaaSAntChainBizChainResponse addBaaSAntChainBizChain(AddBaaSAntChainBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBaaSAntChainBizChainWithOptions(request, runtime);
    }

    /**
     * @param request AddBaaSFabricBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBaaSFabricBizChainResponse
     */
    public AddBaaSFabricBizChainResponse addBaaSFabricBizChainWithOptions(AddBaaSFabricBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSFabricChannelId)) {
            query.put("BaaSFabricChannelId", request.baaSFabricChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baaSFabricConsortiumId)) {
            query.put("BaaSFabricConsortiumId", request.baaSFabricConsortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baaSFabricOrganizationId)) {
            query.put("BaaSFabricOrganizationId", request.baaSFabricOrganizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractTemplateIdList)) {
            query.put("ContractTemplateIdList", request.contractTemplateIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBaaSFabricBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBaaSFabricBizChainResponse());
    }

    /**
     * @param request AddBaaSFabricBizChainRequest
     * @return AddBaaSFabricBizChainResponse
     */
    public AddBaaSFabricBizChainResponse addBaaSFabricBizChain(AddBaaSFabricBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBaaSFabricBizChainWithOptions(request, runtime);
    }

    /**
     * @param request AddBsnFabricBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBsnFabricBizChainResponse
     */
    public AddBsnFabricBizChainResponse addBsnFabricBizChainWithOptions(AddBsnFabricBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeList)) {
            query.put("NodeList", request.nodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCode)) {
            query.put("UserCode", request.userCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBsnFabricBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBsnFabricBizChainResponse());
    }

    /**
     * @param request AddBsnFabricBizChainRequest
     * @return AddBsnFabricBizChainResponse
     */
    public AddBsnFabricBizChainResponse addBsnFabricBizChain(AddBsnFabricBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBsnFabricBizChainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加设备组</p>
     * 
     * @param request AddDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDeviceGroupResponse
     */
    public AddDeviceGroupResponse addDeviceGroupWithOptions(AddDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizedCount)) {
            query.put("AuthorizedCount", request.authorizedCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDeviceGroup"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDeviceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加设备组</p>
     * 
     * @param request AddDeviceGroupRequest
     * @return AddDeviceGroupResponse
     */
    public AddDeviceGroupResponse addDeviceGroup(AddDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加成员</p>
     * 
     * @param request AddMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMemberResponse
     */
    public AddMemberResponse addMemberWithOptions(AddMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizedCount)) {
            query.put("AuthorizedCount", request.authorizedCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedDeviceCount)) {
            query.put("AuthorizedDeviceCount", request.authorizedDeviceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactor)) {
            query.put("Contactor", request.contactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephony)) {
            query.put("Telephony", request.telephony);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMember"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加成员</p>
     * 
     * @param request AddMemberRequest
     * @return AddMemberResponse
     */
    public AddMemberResponse addMember(AddMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMemberWithOptions(request, runtime);
    }

    /**
     * @param request AddPrivacyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPrivacyRuleResponse
     */
    public AddPrivacyRuleResponse addPrivacyRuleWithOptions(AddPrivacyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algImpl)) {
            query.put("AlgImpl", request.algImpl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algType)) {
            query.put("AlgType", request.algType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPrivacyRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPrivacyRuleResponse());
    }

    /**
     * @param request AddPrivacyRuleRequest
     * @return AddPrivacyRuleResponse
     */
    public AddPrivacyRuleResponse addPrivacyRule(AddPrivacyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPrivacyRuleWithOptions(request, runtime);
    }

    /**
     * @param request AddRouteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRouteRuleResponse
     */
    public AddRouteRuleResponse addRouteRuleWithOptions(AddRouteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chainUpMode)) {
            query.put("ChainUpMode", request.chainUpMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractName)) {
            query.put("ContractName", request.contractName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractTemplateId)) {
            query.put("ContractTemplateId", request.contractTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            query.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRouteRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRouteRuleResponse());
    }

    /**
     * @param request AddRouteRuleRequest
     * @return AddRouteRuleResponse
     */
    public AddRouteRuleResponse addRouteRule(AddRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRouteRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>成员同意接入</p>
     * 
     * @param request AgreeMemberAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AgreeMemberAccessResponse
     */
    public AgreeMemberAccessResponse agreeMemberAccessWithOptions(AgreeMemberAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberAccountId)) {
            query.put("MemberAccountId", request.memberAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AgreeMemberAccess"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AgreeMemberAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>成员同意接入</p>
     * 
     * @param request AgreeMemberAccessRequest
     * @return AgreeMemberAccessResponse
     */
    public AgreeMemberAccessResponse agreeMemberAccess(AgreeMemberAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.agreeMemberAccessWithOptions(request, runtime);
    }

    /**
     * @param request AuthorizeBaaSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeBaaSResponse
     */
    public AuthorizeBaaSResponse authorizeBaaSWithOptions(AuthorizeBaaSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeBaaS"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeBaaSResponse());
    }

    /**
     * @param request AuthorizeBaaSRequest
     * @return AuthorizeBaaSResponse
     */
    public AuthorizeBaaSResponse authorizeBaaS(AuthorizeBaaSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeBaaSWithOptions(request, runtime);
    }

    /**
     * @param request AuthorizeDeviceGroupBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeDeviceGroupBizChainResponse
     */
    public AuthorizeDeviceGroupBizChainResponse authorizeDeviceGroupBizChainWithOptions(AuthorizeDeviceGroupBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainIdList)) {
            query.put("BizChainIdList", request.bizChainIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeDeviceGroupBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeDeviceGroupBizChainResponse());
    }

    /**
     * @param request AuthorizeDeviceGroupBizChainRequest
     * @return AuthorizeDeviceGroupBizChainResponse
     */
    public AuthorizeDeviceGroupBizChainResponse authorizeDeviceGroupBizChain(AuthorizeDeviceGroupBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeDeviceGroupBizChainWithOptions(request, runtime);
    }

    /**
     * @param request AuthorizeMemberBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeMemberBizChainResponse
     */
    public AuthorizeMemberBizChainResponse authorizeMemberBizChainWithOptions(AuthorizeMemberBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainInfo)) {
            query.put("BizChainInfo", request.bizChainInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeMemberBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeMemberBizChainResponse());
    }

    /**
     * @param request AuthorizeMemberBizChainRequest
     * @return AuthorizeMemberBizChainResponse
     */
    public AuthorizeMemberBizChainResponse authorizeMemberBizChain(AuthorizeMemberBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeMemberBizChainWithOptions(request, runtime);
    }

    /**
     * @param request DeletePrivacyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePrivacyRuleResponse
     */
    public DeletePrivacyRuleResponse deletePrivacyRuleWithOptions(DeletePrivacyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePrivacyRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePrivacyRuleResponse());
    }

    /**
     * @param request DeletePrivacyRuleRequest
     * @return DeletePrivacyRuleResponse
     */
    public DeletePrivacyRuleResponse deletePrivacyRule(DeletePrivacyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePrivacyRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteRouteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRouteRuleResponse
     */
    public DeleteRouteRuleResponse deleteRouteRuleWithOptions(DeleteRouteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            query.put("RouteRuleId", request.routeRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRouteRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRouteRuleResponse());
    }

    /**
     * @param request DeleteRouteRuleRequest
     * @return DeleteRouteRuleResponse
     */
    public DeleteRouteRuleResponse deleteRouteRule(DeleteRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRouteRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>成员拒绝接入</p>
     * 
     * @param request DeniedMemberAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeniedMemberAccessResponse
     */
    public DeniedMemberAccessResponse deniedMemberAccessWithOptions(DeniedMemberAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberAccountId)) {
            query.put("MemberAccountId", request.memberAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeniedMemberAccess"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeniedMemberAccessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>成员拒绝接入</p>
     * 
     * @param request DeniedMemberAccessRequest
     * @return DeniedMemberAccessResponse
     */
    public DeniedMemberAccessResponse deniedMemberAccess(DeniedMemberAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deniedMemberAccessWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAccountRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountRoleResponse
     */
    public DescribeAccountRoleResponse describeAccountRoleWithOptions(DescribeAccountRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountRole"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountRoleResponse());
    }

    /**
     * @param request DescribeAccountRoleRequest
     * @return DescribeAccountRoleResponse
     */
    public DescribeAccountRoleResponse describeAccountRole(DescribeAccountRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询管理方信息</p>
     * 
     * @param request DescribeAdminInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdminInfoResponse
     */
    public DescribeAdminInfoResponse describeAdminInfoWithOptions(DescribeAdminInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdminInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdminInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询管理方信息</p>
     * 
     * @param request DescribeAdminInfoRequest
     * @return DescribeAdminInfoResponse
     */
    public DescribeAdminInfoResponse describeAdminInfo(DescribeAdminInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdminInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBizChainStatInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBizChainStatInfoResponse
     */
    public DescribeBizChainStatInfoResponse describeBizChainStatInfoWithOptions(DescribeBizChainStatInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBizChainStatInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBizChainStatInfoResponse());
    }

    /**
     * @param request DescribeBizChainStatInfoRequest
     * @return DescribeBizChainStatInfoResponse
     */
    public DescribeBizChainStatInfoResponse describeBizChainStatInfo(DescribeBizChainStatInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBizChainStatInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览API信息</p>
     * 
     * @param request DescribeDashboardApiInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDashboardApiInfoResponse
     */
    public DescribeDashboardApiInfoResponse describeDashboardApiInfoWithOptions(DescribeDashboardApiInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDashboardApiInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDashboardApiInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览API信息</p>
     * 
     * @param request DescribeDashboardApiInfoRequest
     * @return DescribeDashboardApiInfoResponse
     */
    public DescribeDashboardApiInfoResponse describeDashboardApiInfo(DescribeDashboardApiInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDashboardApiInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览信息</p>
     * 
     * @param request DescribeDashboardBaseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDashboardBaseInfoResponse
     */
    public DescribeDashboardBaseInfoResponse describeDashboardBaseInfoWithOptions(DescribeDashboardBaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDashboardBaseInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDashboardBaseInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览信息</p>
     * 
     * @param request DescribeDashboardBaseInfoRequest
     * @return DescribeDashboardBaseInfoResponse
     */
    public DescribeDashboardBaseInfoResponse describeDashboardBaseInfo(DescribeDashboardBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDashboardBaseInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览设备信息</p>
     * 
     * @param request DescribeDashboardDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDashboardDeviceInfoResponse
     */
    public DescribeDashboardDeviceInfoResponse describeDashboardDeviceInfoWithOptions(DescribeDashboardDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDashboardDeviceInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDashboardDeviceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览设备信息</p>
     * 
     * @param request DescribeDashboardDeviceInfoRequest
     * @return DescribeDashboardDeviceInfoResponse
     */
    public DescribeDashboardDeviceInfoResponse describeDashboardDeviceInfo(DescribeDashboardDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDashboardDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览成员API信息</p>
     * 
     * @param request DescribeDashboardMemberApiInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDashboardMemberApiInfoResponse
     */
    public DescribeDashboardMemberApiInfoResponse describeDashboardMemberApiInfoWithOptions(DescribeDashboardMemberApiInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDashboardMemberApiInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDashboardMemberApiInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览成员API信息</p>
     * 
     * @param request DescribeDashboardMemberApiInfoRequest
     * @return DescribeDashboardMemberApiInfoResponse
     */
    public DescribeDashboardMemberApiInfoResponse describeDashboardMemberApiInfo(DescribeDashboardMemberApiInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDashboardMemberApiInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览成员设备信息</p>
     * 
     * @param request DescribeDashboardMemberDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDashboardMemberDeviceInfoResponse
     */
    public DescribeDashboardMemberDeviceInfoResponse describeDashboardMemberDeviceInfoWithOptions(DescribeDashboardMemberDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDashboardMemberDeviceInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDashboardMemberDeviceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询概览成员设备信息</p>
     * 
     * @param request DescribeDashboardMemberDeviceInfoRequest
     * @return DescribeDashboardMemberDeviceInfoResponse
     */
    public DescribeDashboardMemberDeviceInfoResponse describeDashboardMemberDeviceInfo(DescribeDashboardMemberDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDashboardMemberDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备信息</p>
     * 
     * @param request DescribeDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceInfoResponse
     */
    public DescribeDeviceInfoResponse describeDeviceInfoWithOptions(DescribeDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备信息</p>
     * 
     * @param request DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     */
    public DescribeDeviceInfoResponse describeDeviceInfo(DescribeDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘一体机统计信息</p>
     * 
     * @param request DescribeEdgeStatInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEdgeStatInfoResponse
     */
    public DescribeEdgeStatInfoResponse describeEdgeStatInfoWithOptions(DescribeEdgeStatInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.edgeDn)) {
            query.put("EdgeDn", request.edgeDn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgePk)) {
            query.put("EdgePk", request.edgePk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEdgeStatInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEdgeStatInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘一体机统计信息</p>
     * 
     * @param request DescribeEdgeStatInfoRequest
     * @return DescribeEdgeStatInfoResponse
     */
    public DescribeEdgeStatInfoResponse describeEdgeStatInfo(DescribeEdgeStatInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEdgeStatInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMemberBizChainStatInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMemberBizChainStatInfoResponse
     */
    public DescribeMemberBizChainStatInfoResponse describeMemberBizChainStatInfoWithOptions(DescribeMemberBizChainStatInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMemberBizChainStatInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMemberBizChainStatInfoResponse());
    }

    /**
     * @param request DescribeMemberBizChainStatInfoRequest
     * @return DescribeMemberBizChainStatInfoResponse
     */
    public DescribeMemberBizChainStatInfoResponse describeMemberBizChainStatInfo(DescribeMemberBizChainStatInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMemberBizChainStatInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询统计成员API信息</p>
     * 
     * @param request DescribeMemberStatInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMemberStatInfoResponse
     */
    public DescribeMemberStatInfoResponse describeMemberStatInfoWithOptions(DescribeMemberStatInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMemberStatInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMemberStatInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询统计成员API信息</p>
     * 
     * @param request DescribeMemberStatInfoRequest
     * @return DescribeMemberStatInfoResponse
     */
    public DescribeMemberStatInfoResponse describeMemberStatInfo(DescribeMemberStatInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMemberStatInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMemberTotalStatInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMemberTotalStatInfoResponse
     */
    public DescribeMemberTotalStatInfoResponse describeMemberTotalStatInfoWithOptions(DescribeMemberTotalStatInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMemberTotalStatInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMemberTotalStatInfoResponse());
    }

    /**
     * @param request DescribeMemberTotalStatInfoRequest
     * @return DescribeMemberTotalStatInfoResponse
     */
    public DescribeMemberTotalStatInfoResponse describeMemberTotalStatInfo(DescribeMemberTotalStatInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMemberTotalStatInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribePackgeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePackgeInfoResponse
     */
    public DescribePackgeInfoResponse describePackgeInfoWithOptions(DescribePackgeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePackgeInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePackgeInfoResponse());
    }

    /**
     * @param request DescribePackgeInfoRequest
     * @return DescribePackgeInfoResponse
     */
    public DescribePackgeInfoResponse describePackgeInfo(DescribePackgeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePackgeInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询统计设备信息</p>
     * 
     * @param request DescribeStatDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStatDeviceInfoResponse
     */
    public DescribeStatDeviceInfoResponse describeStatDeviceInfoWithOptions(DescribeStatDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStatDeviceInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStatDeviceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询统计设备信息</p>
     * 
     * @param request DescribeStatDeviceInfoRequest
     * @return DescribeStatDeviceInfoResponse
     */
    public DescribeStatDeviceInfoResponse describeStatDeviceInfo(DescribeStatDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStatDeviceInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询统计成员设备信息</p>
     * 
     * @param request DescribeStatMemberDeviceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStatMemberDeviceInfoResponse
     */
    public DescribeStatMemberDeviceInfoResponse describeStatMemberDeviceInfoWithOptions(DescribeStatMemberDeviceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStatMemberDeviceInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStatMemberDeviceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询统计成员设备信息</p>
     * 
     * @param request DescribeStatMemberDeviceInfoRequest
     * @return DescribeStatMemberDeviceInfoResponse
     */
    public DescribeStatMemberDeviceInfoResponse describeStatMemberDeviceInfo(DescribeStatMemberDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStatMemberDeviceInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTotalStatInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTotalStatInfoResponse
     */
    public DescribeTotalStatInfoResponse describeTotalStatInfoWithOptions(DescribeTotalStatInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTotalStatInfo"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTotalStatInfoResponse());
    }

    /**
     * @param request DescribeTotalStatInfoRequest
     * @return DescribeTotalStatInfoResponse
     */
    public DescribeTotalStatInfoResponse describeTotalStatInfo(DescribeTotalStatInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTotalStatInfoWithOptions(request, runtime);
    }

    /**
     * @param request DisableDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDeviceResponse
     */
    public DisableDeviceResponse disableDeviceWithOptions(DisableDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDevice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDeviceResponse());
    }

    /**
     * @param request DisableDeviceRequest
     * @return DisableDeviceResponse
     */
    public DisableDeviceResponse disableDevice(DisableDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDeviceWithOptions(request, runtime);
    }

    /**
     * @param request DisableDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDeviceGroupResponse
     */
    public DisableDeviceGroupResponse disableDeviceGroupWithOptions(DisableDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDeviceGroup"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDeviceGroupResponse());
    }

    /**
     * @param request DisableDeviceGroupRequest
     * @return DisableDeviceGroupResponse
     */
    public DisableDeviceGroupResponse disableDeviceGroup(DisableDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDeviceGroupWithOptions(request, runtime);
    }

    /**
     * @param request DownloadPrivacyKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadPrivacyKeyResponse
     */
    public DownloadPrivacyKeyResponse downloadPrivacyKeyWithOptions(DownloadPrivacyKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadPrivacyKey"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadPrivacyKeyResponse());
    }

    /**
     * @param request DownloadPrivacyKeyRequest
     * @return DownloadPrivacyKeyResponse
     */
    public DownloadPrivacyKeyResponse downloadPrivacyKey(DownloadPrivacyKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadPrivacyKeyWithOptions(request, runtime);
    }

    /**
     * @param request EnableDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDeviceResponse
     */
    public EnableDeviceResponse enableDeviceWithOptions(EnableDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDevice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDeviceResponse());
    }

    /**
     * @param request EnableDeviceRequest
     * @return EnableDeviceResponse
     */
    public EnableDeviceResponse enableDevice(EnableDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDeviceWithOptions(request, runtime);
    }

    /**
     * @param request EnableDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDeviceGroupResponse
     */
    public EnableDeviceGroupResponse enableDeviceGroupWithOptions(EnableDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDeviceGroup"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDeviceGroupResponse());
    }

    /**
     * @param request EnableDeviceGroupRequest
     * @return EnableDeviceGroupResponse
     */
    public EnableDeviceGroupResponse enableDeviceGroup(EnableDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDeviceGroupWithOptions(request, runtime);
    }

    /**
     * @param request FreezeMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FreezeMemberResponse
     */
    public FreezeMemberResponse freezeMemberWithOptions(FreezeMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FreezeMember"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FreezeMemberResponse());
    }

    /**
     * @param request FreezeMemberRequest
     * @return FreezeMemberResponse
     */
    public FreezeMemberResponse freezeMember(FreezeMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.freezeMemberWithOptions(request, runtime);
    }

    /**
     * @param request GetEdgeTotalDeviceCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEdgeTotalDeviceCountResponse
     */
    public GetEdgeTotalDeviceCountResponse getEdgeTotalDeviceCountWithOptions(GetEdgeTotalDeviceCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEdgeTotalDeviceCount"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEdgeTotalDeviceCountResponse());
    }

    /**
     * @param request GetEdgeTotalDeviceCountRequest
     * @return GetEdgeTotalDeviceCountResponse
     */
    public GetEdgeTotalDeviceCountResponse getEdgeTotalDeviceCount(GetEdgeTotalDeviceCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEdgeTotalDeviceCountWithOptions(request, runtime);
    }

    /**
     * @param request ListAllAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllAdminResponse
     */
    public ListAllAdminResponse listAllAdminWithOptions(ListAllAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllAdmin"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllAdminResponse());
    }

    /**
     * @param request ListAllAdminRequest
     * @return ListAllAdminResponse
     */
    public ListAllAdminResponse listAllAdmin(ListAllAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllAdminWithOptions(request, runtime);
    }

    /**
     * @param request ListAllBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllBizChainResponse
     */
    public ListAllBizChainResponse listAllBizChainWithOptions(ListAllBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllBizChainResponse());
    }

    /**
     * @param request ListAllBizChainRequest
     * @return ListAllBizChainResponse
     */
    public ListAllBizChainResponse listAllBizChain(ListAllBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllBizChainWithOptions(request, runtime);
    }

    /**
     * @param request ListAllBizChainContractRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllBizChainContractResponse
     */
    public ListAllBizChainContractResponse listAllBizChainContractWithOptions(ListAllBizChainContractRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllBizChainContract"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllBizChainContractResponse());
    }

    /**
     * @param request ListAllBizChainContractRequest
     * @return ListAllBizChainContractResponse
     */
    public ListAllBizChainContractResponse listAllBizChainContract(ListAllBizChainContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllBizChainContractWithOptions(request, runtime);
    }

    /**
     * @param request ListAllDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllDeviceGroupResponse
     */
    public ListAllDeviceGroupResponse listAllDeviceGroupWithOptions(ListAllDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllDeviceGroup"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllDeviceGroupResponse());
    }

    /**
     * @param request ListAllDeviceGroupRequest
     * @return ListAllDeviceGroupResponse
     */
    public ListAllDeviceGroupResponse listAllDeviceGroup(ListAllDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllDeviceGroupWithOptions(request, runtime);
    }

    /**
     * @param request ListAllMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllMemberResponse
     */
    public ListAllMemberResponse listAllMemberWithOptions(ListAllMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllMember"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllMemberResponse());
    }

    /**
     * @param request ListAllMemberRequest
     * @return ListAllMemberResponse
     */
    public ListAllMemberResponse listAllMember(ListAllMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllMemberWithOptions(request, runtime);
    }

    /**
     * @param request ListAllPrivacyAlgorithmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllPrivacyAlgorithmResponse
     */
    public ListAllPrivacyAlgorithmResponse listAllPrivacyAlgorithmWithOptions(ListAllPrivacyAlgorithmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllPrivacyAlgorithm"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllPrivacyAlgorithmResponse());
    }

    /**
     * @param request ListAllPrivacyAlgorithmRequest
     * @return ListAllPrivacyAlgorithmResponse
     */
    public ListAllPrivacyAlgorithmResponse listAllPrivacyAlgorithm(ListAllPrivacyAlgorithmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllPrivacyAlgorithmWithOptions(request, runtime);
    }

    /**
     * @param request ListAllPrivacyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllPrivacyRuleResponse
     */
    public ListAllPrivacyRuleResponse listAllPrivacyRuleWithOptions(ListAllPrivacyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllPrivacyRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllPrivacyRuleResponse());
    }

    /**
     * @param request ListAllPrivacyRuleRequest
     * @return ListAllPrivacyRuleResponse
     */
    public ListAllPrivacyRuleResponse listAllPrivacyRule(ListAllPrivacyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllPrivacyRuleWithOptions(request, runtime);
    }

    /**
     * @param request ListAllProductKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllProductKeyResponse
     */
    public ListAllProductKeyResponse listAllProductKeyWithOptions(ListAllProductKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllProductKey"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllProductKeyResponse());
    }

    /**
     * @param request ListAllProductKeyRequest
     * @return ListAllProductKeyResponse
     */
    public ListAllProductKeyResponse listAllProductKey(ListAllProductKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllProductKeyWithOptions(request, runtime);
    }

    /**
     * @param request ListAllSystemContractRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllSystemContractResponse
     */
    public ListAllSystemContractResponse listAllSystemContractWithOptions(ListAllSystemContractRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockChainType)) {
            query.put("BlockChainType", request.blockChainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllSystemContract"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllSystemContractResponse());
    }

    /**
     * @param request ListAllSystemContractRequest
     * @return ListAllSystemContractResponse
     */
    public ListAllSystemContractResponse listAllSystemContract(ListAllSystemContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllSystemContractWithOptions(request, runtime);
    }

    /**
     * @param request ListBaaSAntChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaaSAntChainResponse
     */
    public ListBaaSAntChainResponse listBaaSAntChainWithOptions(ListBaaSAntChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSAntChainConsortiumId)) {
            query.put("BaaSAntChainConsortiumId", request.baaSAntChainConsortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaaSAntChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaaSAntChainResponse());
    }

    /**
     * @param request ListBaaSAntChainRequest
     * @return ListBaaSAntChainResponse
     */
    public ListBaaSAntChainResponse listBaaSAntChain(ListBaaSAntChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaaSAntChainWithOptions(request, runtime);
    }

    /**
     * @param request ListBaaSAntChainConsortiumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaaSAntChainConsortiumResponse
     */
    public ListBaaSAntChainConsortiumResponse listBaaSAntChainConsortiumWithOptions(ListBaaSAntChainConsortiumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaaSAntChainConsortium"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaaSAntChainConsortiumResponse());
    }

    /**
     * @param request ListBaaSAntChainConsortiumRequest
     * @return ListBaaSAntChainConsortiumResponse
     */
    public ListBaaSAntChainConsortiumResponse listBaaSAntChainConsortium(ListBaaSAntChainConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaaSAntChainConsortiumWithOptions(request, runtime);
    }

    /**
     * @param request ListBaaSAntChainPeerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaaSAntChainPeerResponse
     */
    public ListBaaSAntChainPeerResponse listBaaSAntChainPeerWithOptions(ListBaaSAntChainPeerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSAntChainChainId)) {
            query.put("BaaSAntChainChainId", request.baaSAntChainChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baaSAntChainConsortiumId)) {
            query.put("BaaSAntChainConsortiumId", request.baaSAntChainConsortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaaSAntChainPeer"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaaSAntChainPeerResponse());
    }

    /**
     * @param request ListBaaSAntChainPeerRequest
     * @return ListBaaSAntChainPeerResponse
     */
    public ListBaaSAntChainPeerResponse listBaaSAntChainPeer(ListBaaSAntChainPeerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaaSAntChainPeerWithOptions(request, runtime);
    }

    /**
     * @param request ListBaaSFabricChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaaSFabricChannelResponse
     */
    public ListBaaSFabricChannelResponse listBaaSFabricChannelWithOptions(ListBaaSFabricChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSFabricConsortiumId)) {
            query.put("BaaSFabricConsortiumId", request.baaSFabricConsortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaaSFabricChannel"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaaSFabricChannelResponse());
    }

    /**
     * @param request ListBaaSFabricChannelRequest
     * @return ListBaaSFabricChannelResponse
     */
    public ListBaaSFabricChannelResponse listBaaSFabricChannel(ListBaaSFabricChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaaSFabricChannelWithOptions(request, runtime);
    }

    /**
     * @param request ListBaaSFabricConsortiumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaaSFabricConsortiumResponse
     */
    public ListBaaSFabricConsortiumResponse listBaaSFabricConsortiumWithOptions(ListBaaSFabricConsortiumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaaSFabricConsortium"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaaSFabricConsortiumResponse());
    }

    /**
     * @param request ListBaaSFabricConsortiumRequest
     * @return ListBaaSFabricConsortiumResponse
     */
    public ListBaaSFabricConsortiumResponse listBaaSFabricConsortium(ListBaaSFabricConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaaSFabricConsortiumWithOptions(request, runtime);
    }

    /**
     * @param request ListBaaSFabricOrganizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBaaSFabricOrganizationResponse
     */
    public ListBaaSFabricOrganizationResponse listBaaSFabricOrganizationWithOptions(ListBaaSFabricOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSFabricChannelId)) {
            query.put("BaaSFabricChannelId", request.baaSFabricChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBaaSFabricOrganization"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBaaSFabricOrganizationResponse());
    }

    /**
     * @param request ListBaaSFabricOrganizationRequest
     * @return ListBaaSFabricOrganizationResponse
     */
    public ListBaaSFabricOrganizationResponse listBaaSFabricOrganization(ListBaaSFabricOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaaSFabricOrganizationWithOptions(request, runtime);
    }

    /**
     * @param request ListBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBizChainResponse
     */
    public ListBizChainResponse listBizChainWithOptions(ListBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBizChainResponse());
    }

    /**
     * @param request ListBizChainRequest
     * @return ListBizChainResponse
     */
    public ListBizChainResponse listBizChain(ListBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBizChainWithOptions(request, runtime);
    }

    /**
     * @param request ListBizChainDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBizChainDataResponse
     */
    public ListBizChainDataResponse listBizChainDataWithOptions(ListBizChainDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTDataDID)) {
            query.put("IoTDataDID", request.ioTDataDID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBizChainData"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBizChainDataResponse());
    }

    /**
     * @param request ListBizChainDataRequest
     * @return ListBizChainDataResponse
     */
    public ListBizChainDataResponse listBizChainData(ListBizChainDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBizChainDataWithOptions(request, runtime);
    }

    /**
     * @param request ListDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceResponse
     */
    public ListDeviceResponse listDeviceWithOptions(ListDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDevice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceResponse());
    }

    /**
     * @param request ListDeviceRequest
     * @return ListDeviceResponse
     */
    public ListDeviceResponse listDevice(ListDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备组列表</p>
     * 
     * @param request ListDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceGroupResponse
     */
    public ListDeviceGroupResponse listDeviceGroupWithOptions(ListDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceGroup"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备组列表</p>
     * 
     * @param request ListDeviceGroupRequest
     * @return ListDeviceGroupResponse
     */
    public ListDeviceGroupResponse listDeviceGroup(ListDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceGroupWithOptions(request, runtime);
    }

    /**
     * @param request ListDeviceGroupAuthorizedBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceGroupAuthorizedBizChainResponse
     */
    public ListDeviceGroupAuthorizedBizChainResponse listDeviceGroupAuthorizedBizChainWithOptions(ListDeviceGroupAuthorizedBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceGroupAuthorizedBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceGroupAuthorizedBizChainResponse());
    }

    /**
     * @param request ListDeviceGroupAuthorizedBizChainRequest
     * @return ListDeviceGroupAuthorizedBizChainResponse
     */
    public ListDeviceGroupAuthorizedBizChainResponse listDeviceGroupAuthorizedBizChain(ListDeviceGroupAuthorizedBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeviceGroupAuthorizedBizChainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘设备列表</p>
     * 
     * @param request ListEdgeDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeDeviceResponse
     */
    public ListEdgeDeviceResponse listEdgeDeviceWithOptions(ListEdgeDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeDevice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘设备列表</p>
     * 
     * @param request ListEdgeDeviceRequest
     * @return ListEdgeDeviceResponse
     */
    public ListEdgeDeviceResponse listEdgeDevice(ListEdgeDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘设备组列表</p>
     * 
     * @param request ListEdgeDeviceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeDeviceGroupResponse
     */
    public ListEdgeDeviceGroupResponse listEdgeDeviceGroupWithOptions(ListEdgeDeviceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeDeviceGroup"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeDeviceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询边缘设备组列表</p>
     * 
     * @param request ListEdgeDeviceGroupRequest
     * @return ListEdgeDeviceGroupResponse
     */
    public ListEdgeDeviceGroupResponse listEdgeDeviceGroup(ListEdgeDeviceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeDeviceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询成员列表</p>
     * 
     * @param request ListMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemberResponse
     */
    public ListMemberResponse listMemberWithOptions(ListMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactor)) {
            query.put("Contactor", request.contactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMember"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询成员列表</p>
     * 
     * @param request ListMemberRequest
     * @return ListMemberResponse
     */
    public ListMemberResponse listMember(ListMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询成员接入记录分页列表</p>
     * 
     * @param request ListMemberAccessRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemberAccessRecordResponse
     */
    public ListMemberAccessRecordResponse listMemberAccessRecordWithOptions(ListMemberAccessRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessStatus)) {
            query.put("AccessStatus", request.accessStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactor)) {
            query.put("Contactor", request.contactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemberAccessRecord"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemberAccessRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询成员接入记录分页列表</p>
     * 
     * @param request ListMemberAccessRecordRequest
     * @return ListMemberAccessRecordResponse
     */
    public ListMemberAccessRecordResponse listMemberAccessRecord(ListMemberAccessRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMemberAccessRecordWithOptions(request, runtime);
    }

    /**
     * @param request ListMemberAuthorizedBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMemberAuthorizedBizChainResponse
     */
    public ListMemberAuthorizedBizChainResponse listMemberAuthorizedBizChainWithOptions(ListMemberAuthorizedBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMemberAuthorizedBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMemberAuthorizedBizChainResponse());
    }

    /**
     * @param request ListMemberAuthorizedBizChainRequest
     * @return ListMemberAuthorizedBizChainResponse
     */
    public ListMemberAuthorizedBizChainResponse listMemberAuthorizedBizChain(ListMemberAuthorizedBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMemberAuthorizedBizChainWithOptions(request, runtime);
    }

    /**
     * @param request ListPrivacyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivacyRuleResponse
     */
    public ListPrivacyRuleResponse listPrivacyRuleWithOptions(ListPrivacyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivacyRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivacyRuleResponse());
    }

    /**
     * @param request ListPrivacyRuleRequest
     * @return ListPrivacyRuleResponse
     */
    public ListPrivacyRuleResponse listPrivacyRule(ListPrivacyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivacyRuleWithOptions(request, runtime);
    }

    /**
     * @param request ListPrivacyRuleSharedMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPrivacyRuleSharedMemberResponse
     */
    public ListPrivacyRuleSharedMemberResponse listPrivacyRuleSharedMemberWithOptions(ListPrivacyRuleSharedMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPrivacyRuleSharedMember"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPrivacyRuleSharedMemberResponse());
    }

    /**
     * @param request ListPrivacyRuleSharedMemberRequest
     * @return ListPrivacyRuleSharedMemberResponse
     */
    public ListPrivacyRuleSharedMemberResponse listPrivacyRuleSharedMember(ListPrivacyRuleSharedMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPrivacyRuleSharedMemberWithOptions(request, runtime);
    }

    /**
     * @param request ListRouteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRouteRuleResponse
     */
    public ListRouteRuleResponse listRouteRuleWithOptions(ListRouteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainName)) {
            query.put("BizChainName", request.bizChainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chainUpMode)) {
            query.put("ChainUpMode", request.chainUpMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupName)) {
            query.put("DeviceGroupName", request.deviceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRouteRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRouteRuleResponse());
    }

    /**
     * @param request ListRouteRuleRequest
     * @return ListRouteRuleResponse
     */
    public ListRouteRuleResponse listRouteRule(ListRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRouteRuleWithOptions(request, runtime);
    }

    /**
     * @param request QueryBlockchainDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBlockchainDataResponse
     */
    public QueryBlockchainDataResponse queryBlockchainDataWithOptions(QueryBlockchainDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractName)) {
            query.put("ContractName", request.contractName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            query.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDID)) {
            query.put("IotDataDID", request.iotDataDID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            query.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBlockchainData"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBlockchainDataResponse());
    }

    /**
     * @param request QueryBlockchainDataRequest
     * @return QueryBlockchainDataResponse
     */
    public QueryBlockchainDataResponse queryBlockchainData(QueryBlockchainDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBlockchainDataWithOptions(request, runtime);
    }

    /**
     * @param request QueryBlockchainMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBlockchainMetadataResponse
     */
    public QueryBlockchainMetadataResponse queryBlockchainMetadataWithOptions(QueryBlockchainMetadataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractName)) {
            query.put("ContractName", request.contractName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            query.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDID)) {
            query.put("IotDataDID", request.iotDataDID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionId)) {
            query.put("TransactionId", request.transactionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBlockchainMetadata"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBlockchainMetadataResponse());
    }

    /**
     * @param request QueryBlockchainMetadataRequest
     * @return QueryBlockchainMetadataResponse
     */
    public QueryBlockchainMetadataResponse queryBlockchainMetadata(QueryBlockchainMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBlockchainMetadataWithOptions(request, runtime);
    }

    /**
     * @param request SharePrivacyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SharePrivacyRuleResponse
     */
    public SharePrivacyRuleResponse sharePrivacyRuleWithOptions(SharePrivacyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberIdList)) {
            query.put("MemberIdList", request.memberIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SharePrivacyRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SharePrivacyRuleResponse());
    }

    /**
     * @param request SharePrivacyRuleRequest
     * @return SharePrivacyRuleResponse
     */
    public SharePrivacyRuleResponse sharePrivacyRule(SharePrivacyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sharePrivacyRuleWithOptions(request, runtime);
    }

    /**
     * @param request UnFreezeMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnFreezeMemberResponse
     */
    public UnFreezeMemberResponse unFreezeMemberWithOptions(UnFreezeMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnFreezeMember"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnFreezeMemberResponse());
    }

    /**
     * @param request UnFreezeMemberRequest
     * @return UnFreezeMemberResponse
     */
    public UnFreezeMemberResponse unFreezeMember(UnFreezeMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unFreezeMemberWithOptions(request, runtime);
    }

    /**
     * @param request UpdateBizChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBizChainResponse
     */
    public UpdateBizChainResponse updateBizChainWithOptions(UpdateBizChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBizChain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBizChainResponse());
    }

    /**
     * @param request UpdateBizChainRequest
     * @return UpdateBizChainResponse
     */
    public UpdateBizChainResponse updateBizChain(UpdateBizChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBizChainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改成员信息</p>
     * 
     * @param request UpdateMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMemberWithOptions(UpdateMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizedCount)) {
            query.put("AuthorizedCount", request.authorizedCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizedDeviceCount)) {
            query.put("AuthorizedDeviceCount", request.authorizedDeviceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactor)) {
            query.put("Contactor", request.contactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephony)) {
            query.put("Telephony", request.telephony);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMember"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改成员信息</p>
     * 
     * @param request UpdateMemberRequest
     * @return UpdateMemberResponse
     */
    public UpdateMemberResponse updateMember(UpdateMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMemberWithOptions(request, runtime);
    }

    /**
     * @param request UpdatePrivacyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePrivacyRuleResponse
     */
    public UpdatePrivacyRuleResponse updatePrivacyRuleWithOptions(UpdatePrivacyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algImpl)) {
            query.put("AlgImpl", request.algImpl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.algType)) {
            query.put("AlgType", request.algType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePrivacyRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePrivacyRuleResponse());
    }

    /**
     * @param request UpdatePrivacyRuleRequest
     * @return UpdatePrivacyRuleResponse
     */
    public UpdatePrivacyRuleResponse updatePrivacyRule(UpdatePrivacyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePrivacyRuleWithOptions(request, runtime);
    }

    /**
     * @param request UpdateRouteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRouteRuleResponse
     */
    public UpdateRouteRuleResponse updateRouteRuleWithOptions(UpdateRouteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractName)) {
            query.put("ContractName", request.contractName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractTemplateId)) {
            query.put("ContractTemplateId", request.contractTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            query.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            query.put("RouteRuleId", request.routeRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRouteRule"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRouteRuleResponse());
    }

    /**
     * @param request UpdateRouteRuleRequest
     * @return UpdateRouteRuleResponse
     */
    public UpdateRouteRuleResponse updateRouteRule(UpdateRouteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRouteRuleWithOptions(request, runtime);
    }

    /**
     * @param request UploadIoTDataToBlockchainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadIoTDataToBlockchainResponse
     */
    public UploadIoTDataToBlockchainResponse uploadIoTDataToBlockchainWithOptions(UploadIoTDataToBlockchainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.iotAuthType)) {
            query.put("IotAuthType", request.iotAuthType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDID)) {
            query.put("IotDataDID", request.iotDataDID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDigest)) {
            query.put("IotDataDigest", request.iotDataDigest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataToken)) {
            query.put("IotDataToken", request.iotDataToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotId)) {
            query.put("IotId", request.iotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdServiceProvider)) {
            query.put("IotIdServiceProvider", request.iotIdServiceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotIdSource)) {
            query.put("IotIdSource", request.iotIdSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plainData)) {
            query.put("PlainData", request.plainData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyData)) {
            query.put("PrivacyData", request.privacyData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadIoTDataToBlockchain"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadIoTDataToBlockchainResponse());
    }

    /**
     * @param request UploadIoTDataToBlockchainRequest
     * @return UploadIoTDataToBlockchainResponse
     */
    public UploadIoTDataToBlockchainResponse uploadIoTDataToBlockchain(UploadIoTDataToBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadIoTDataToBlockchainWithOptions(request, runtime);
    }
}

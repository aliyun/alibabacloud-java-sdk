// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707;

import com.aliyun.tea.*;
import com.aliyun.lto20210707.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public AddBaaSAntChainBizChainResponse addBaaSAntChainBizChainWithOptions(AddBaaSAntChainBizChainRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddBaaSAntChainBizChainResponse addBaaSAntChainBizChain(AddBaaSAntChainBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBaaSAntChainBizChainWithOptions(request, runtime);
    }

    public AddBaaSFabricBizChainResponse addBaaSFabricBizChainWithOptions(AddBaaSFabricBizChainRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddBaaSFabricBizChainResponse addBaaSFabricBizChain(AddBaaSFabricBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBaaSFabricBizChainWithOptions(request, runtime);
    }

    public AddBsnFabricBizChainResponse addBsnFabricBizChainWithOptions(AddBsnFabricBizChainRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCode)) {
            query.put("UserCode", request.userCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddBsnFabricBizChainResponse addBsnFabricBizChain(AddBsnFabricBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBsnFabricBizChainWithOptions(request, runtime);
    }

    public AddDeviceGroupResponse addDeviceGroupWithOptions(AddDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddDeviceGroupResponse addDeviceGroup(AddDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDeviceGroupWithOptions(request, runtime);
    }

    public AddMemberResponse addMemberWithOptions(AddMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizedCount)) {
            query.put("AuthorizedCount", request.authorizedCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactor)) {
            query.put("Contactor", request.contactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddMemberResponse addMember(AddMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMemberWithOptions(request, runtime);
    }

    public AddPrivacyRuleResponse addPrivacyRuleWithOptions(AddPrivacyRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddPrivacyRuleResponse addPrivacyRule(AddPrivacyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addPrivacyRuleWithOptions(request, runtime);
    }

    public AddRouteRuleResponse addRouteRuleWithOptions(AddRouteRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            query.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddRouteRuleResponse addRouteRule(AddRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRouteRuleWithOptions(request, runtime);
    }

    public AgreeMemberAccessResponse agreeMemberAccessWithOptions(AgreeMemberAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberAccountId)) {
            query.put("MemberAccountId", request.memberAccountId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AgreeMemberAccessResponse agreeMemberAccess(AgreeMemberAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.agreeMemberAccessWithOptions(request, runtime);
    }

    public AuthorizeBaaSResponse authorizeBaaSWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public AuthorizeBaaSResponse authorizeBaaS() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeBaaSWithOptions(runtime);
    }

    public AuthorizeDeviceGroupBizChainResponse authorizeDeviceGroupBizChainWithOptions(AuthorizeDeviceGroupBizChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainIdList)) {
            query.put("BizChainIdList", request.bizChainIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AuthorizeDeviceGroupBizChainResponse authorizeDeviceGroupBizChain(AuthorizeDeviceGroupBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeDeviceGroupBizChainWithOptions(request, runtime);
    }

    public AuthorizeMemberBizChainResponse authorizeMemberBizChainWithOptions(AuthorizeMemberBizChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainInfo)) {
            query.put("BizChainInfo", request.bizChainInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AuthorizeMemberBizChainResponse authorizeMemberBizChain(AuthorizeMemberBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.authorizeMemberBizChainWithOptions(request, runtime);
    }

    public DeletePrivacyRuleResponse deletePrivacyRuleWithOptions(DeletePrivacyRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeletePrivacyRuleResponse deletePrivacyRule(DeletePrivacyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePrivacyRuleWithOptions(request, runtime);
    }

    public DeleteRouteRuleResponse deleteRouteRuleWithOptions(DeleteRouteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            query.put("RouteRuleId", request.routeRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRouteRuleResponse deleteRouteRule(DeleteRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRouteRuleWithOptions(request, runtime);
    }

    public DeniedMemberAccessResponse deniedMemberAccessWithOptions(DeniedMemberAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberAccountId)) {
            query.put("MemberAccountId", request.memberAccountId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeniedMemberAccessResponse deniedMemberAccess(DeniedMemberAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deniedMemberAccessWithOptions(request, runtime);
    }

    public DescribeAccountRoleResponse describeAccountRoleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeAccountRoleResponse describeAccountRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountRoleWithOptions(runtime);
    }

    public DescribeBizChainStatInfoResponse describeBizChainStatInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeBizChainStatInfoResponse describeBizChainStatInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBizChainStatInfoWithOptions(runtime);
    }

    public DescribeMemberBizChainStatInfoResponse describeMemberBizChainStatInfoWithOptions(DescribeMemberBizChainStatInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeMemberBizChainStatInfoResponse describeMemberBizChainStatInfo(DescribeMemberBizChainStatInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMemberBizChainStatInfoWithOptions(request, runtime);
    }

    public DescribeMemberStatInfoResponse describeMemberStatInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeMemberStatInfoResponse describeMemberStatInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMemberStatInfoWithOptions(runtime);
    }

    public DescribeMemberTotalStatInfoResponse describeMemberTotalStatInfoWithOptions(DescribeMemberTotalStatInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeMemberTotalStatInfoResponse describeMemberTotalStatInfo(DescribeMemberTotalStatInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMemberTotalStatInfoWithOptions(request, runtime);
    }

    public DescribePackgeInfoResponse describePackgeInfoWithOptions(DescribePackgeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribePackgeInfoResponse describePackgeInfo(DescribePackgeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackgeInfoWithOptions(request, runtime);
    }

    public DescribeTotalStatInfoResponse describeTotalStatInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeTotalStatInfoResponse describeTotalStatInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTotalStatInfoWithOptions(runtime);
    }

    public DisableDeviceResponse disableDeviceWithOptions(DisableDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableDeviceResponse disableDevice(DisableDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDeviceWithOptions(request, runtime);
    }

    public DisableDeviceGroupResponse disableDeviceGroupWithOptions(DisableDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableDeviceGroupResponse disableDeviceGroup(DisableDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableDeviceGroupWithOptions(request, runtime);
    }

    public DownloadPrivacyKeyResponse downloadPrivacyKeyWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public DownloadPrivacyKeyResponse downloadPrivacyKey() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadPrivacyKeyWithOptions(runtime);
    }

    public EnableDeviceResponse enableDeviceWithOptions(EnableDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableDeviceResponse enableDevice(EnableDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDeviceWithOptions(request, runtime);
    }

    public EnableDeviceGroupResponse enableDeviceGroupWithOptions(EnableDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableDeviceGroupResponse enableDeviceGroup(EnableDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableDeviceGroupWithOptions(request, runtime);
    }

    public FreezeMemberResponse freezeMemberWithOptions(FreezeMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public FreezeMemberResponse freezeMember(FreezeMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.freezeMemberWithOptions(request, runtime);
    }

    public ListAllAdminResponse listAllAdminWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllAdminResponse listAllAdmin() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllAdminWithOptions(runtime);
    }

    public ListAllBizChainResponse listAllBizChainWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllBizChainResponse listAllBizChain() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllBizChainWithOptions(runtime);
    }

    public ListAllBizChainContractResponse listAllBizChainContractWithOptions(ListAllBizChainContractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllBizChainContractResponse listAllBizChainContract(ListAllBizChainContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllBizChainContractWithOptions(request, runtime);
    }

    public ListAllDeviceGroupResponse listAllDeviceGroupWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllDeviceGroupResponse listAllDeviceGroup() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllDeviceGroupWithOptions(runtime);
    }

    public ListAllMemberResponse listAllMemberWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllMemberResponse listAllMember() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllMemberWithOptions(runtime);
    }

    public ListAllPrivacyAlgorithmResponse listAllPrivacyAlgorithmWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllPrivacyAlgorithmResponse listAllPrivacyAlgorithm() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllPrivacyAlgorithmWithOptions(runtime);
    }

    public ListAllPrivacyRuleResponse listAllPrivacyRuleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllPrivacyRuleResponse listAllPrivacyRule() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllPrivacyRuleWithOptions(runtime);
    }

    public ListAllProductKeyResponse listAllProductKeyWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllProductKeyResponse listAllProductKey() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllProductKeyWithOptions(runtime);
    }

    public ListAllSystemContractResponse listAllSystemContractWithOptions(ListAllSystemContractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockChainType)) {
            query.put("BlockChainType", request.blockChainType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAllSystemContractResponse listAllSystemContract(ListAllSystemContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllSystemContractWithOptions(request, runtime);
    }

    public ListBaaSAntChainResponse listBaaSAntChainWithOptions(ListBaaSAntChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSAntChainConsortiumId)) {
            query.put("BaaSAntChainConsortiumId", request.baaSAntChainConsortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListBaaSAntChainResponse listBaaSAntChain(ListBaaSAntChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBaaSAntChainWithOptions(request, runtime);
    }

    public ListBaaSAntChainConsortiumResponse listBaaSAntChainConsortiumWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListBaaSAntChainConsortiumResponse listBaaSAntChainConsortium() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBaaSAntChainConsortiumWithOptions(runtime);
    }

    public ListBaaSAntChainPeerResponse listBaaSAntChainPeerWithOptions(ListBaaSAntChainPeerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSAntChainChainId)) {
            query.put("BaaSAntChainChainId", request.baaSAntChainChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.baaSAntChainConsortiumId)) {
            query.put("BaaSAntChainConsortiumId", request.baaSAntChainConsortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListBaaSAntChainPeerResponse listBaaSAntChainPeer(ListBaaSAntChainPeerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBaaSAntChainPeerWithOptions(request, runtime);
    }

    public ListBaaSFabricChannelResponse listBaaSFabricChannelWithOptions(ListBaaSFabricChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSFabricConsortiumId)) {
            query.put("BaaSFabricConsortiumId", request.baaSFabricConsortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListBaaSFabricChannelResponse listBaaSFabricChannel(ListBaaSFabricChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBaaSFabricChannelWithOptions(request, runtime);
    }

    public ListBaaSFabricConsortiumResponse listBaaSFabricConsortiumWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListBaaSFabricConsortiumResponse listBaaSFabricConsortium() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBaaSFabricConsortiumWithOptions(runtime);
    }

    public ListBaaSFabricOrganizationResponse listBaaSFabricOrganizationWithOptions(ListBaaSFabricOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.baaSFabricChannelId)) {
            query.put("BaaSFabricChannelId", request.baaSFabricChannelId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListBaaSFabricOrganizationResponse listBaaSFabricOrganization(ListBaaSFabricOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBaaSFabricOrganizationWithOptions(request, runtime);
    }

    public ListBizChainResponse listBizChainWithOptions(ListBizChainRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListBizChainResponse listBizChain(ListBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBizChainWithOptions(request, runtime);
    }

    public ListBizChainDataResponse listBizChainDataWithOptions(ListBizChainDataRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListBizChainDataResponse listBizChainData(ListBizChainDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBizChainDataWithOptions(request, runtime);
    }

    public ListDeviceResponse listDeviceWithOptions(ListDeviceRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListDeviceResponse listDevice(ListDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceWithOptions(request, runtime);
    }

    public ListDeviceGroupResponse listDeviceGroupWithOptions(ListDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListDeviceGroupResponse listDeviceGroup(ListDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceGroupWithOptions(request, runtime);
    }

    public ListDeviceGroupAuthorizedBizChainResponse listDeviceGroupAuthorizedBizChainWithOptions(ListDeviceGroupAuthorizedBizChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupId)) {
            query.put("DeviceGroupId", request.deviceGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListDeviceGroupAuthorizedBizChainResponse listDeviceGroupAuthorizedBizChain(ListDeviceGroupAuthorizedBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceGroupAuthorizedBizChainWithOptions(request, runtime);
    }

    public ListMemberResponse listMemberWithOptions(ListMemberRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListMemberResponse listMember(ListMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMemberWithOptions(request, runtime);
    }

    public ListMemberAccessRecordResponse listMemberAccessRecordWithOptions(ListMemberAccessRecordRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListMemberAccessRecordResponse listMemberAccessRecord(ListMemberAccessRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMemberAccessRecordWithOptions(request, runtime);
    }

    public ListMemberAuthorizedBizChainResponse listMemberAuthorizedBizChainWithOptions(ListMemberAuthorizedBizChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListMemberAuthorizedBizChainResponse listMemberAuthorizedBizChain(ListMemberAuthorizedBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMemberAuthorizedBizChainWithOptions(request, runtime);
    }

    public ListPrivacyRuleResponse listPrivacyRuleWithOptions(ListPrivacyRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListPrivacyRuleResponse listPrivacyRule(ListPrivacyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPrivacyRuleWithOptions(request, runtime);
    }

    public ListPrivacyRuleSharedMemberResponse listPrivacyRuleSharedMemberWithOptions(ListPrivacyRuleSharedMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListPrivacyRuleSharedMemberResponse listPrivacyRuleSharedMember(ListPrivacyRuleSharedMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPrivacyRuleSharedMemberWithOptions(request, runtime);
    }

    public ListRouteRuleResponse listRouteRuleWithOptions(ListRouteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainName)) {
            query.put("BizChainName", request.bizChainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceGroupName)) {
            query.put("DeviceGroupName", request.deviceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRouteRuleResponse listRouteRule(ListRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRouteRuleWithOptions(request, runtime);
    }

    public QueryBlockchainDataResponse queryBlockchainDataWithOptions(QueryBlockchainDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDID)) {
            query.put("IotDataDID", request.iotDataDID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryBlockchainDataResponse queryBlockchainData(QueryBlockchainDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBlockchainDataWithOptions(request, runtime);
    }

    public QueryBlockchainMetadataResponse queryBlockchainMetadataWithOptions(QueryBlockchainMetadataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iotDataDID)) {
            query.put("IotDataDID", request.iotDataDID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryBlockchainMetadataResponse queryBlockchainMetadata(QueryBlockchainMetadataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBlockchainMetadataWithOptions(request, runtime);
    }

    public SharePrivacyRuleResponse sharePrivacyRuleWithOptions(SharePrivacyRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberIdList)) {
            query.put("MemberIdList", request.memberIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privacyRuleId)) {
            query.put("PrivacyRuleId", request.privacyRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SharePrivacyRuleResponse sharePrivacyRule(SharePrivacyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sharePrivacyRuleWithOptions(request, runtime);
    }

    public UnFreezeMemberResponse unFreezeMemberWithOptions(UnFreezeMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UnFreezeMemberResponse unFreezeMember(UnFreezeMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unFreezeMemberWithOptions(request, runtime);
    }

    public UpdateBizChainResponse updateBizChainWithOptions(UpdateBizChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizChainId)) {
            query.put("BizChainId", request.bizChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateBizChainResponse updateBizChain(UpdateBizChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBizChainWithOptions(request, runtime);
    }

    public UpdateMemberResponse updateMemberWithOptions(UpdateMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizedCount)) {
            query.put("AuthorizedCount", request.authorizedCount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telephony)) {
            query.put("Telephony", request.telephony);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateMemberResponse updateMember(UpdateMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMemberWithOptions(request, runtime);
    }

    public UpdatePrivacyRuleResponse updatePrivacyRuleWithOptions(UpdatePrivacyRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdatePrivacyRuleResponse updatePrivacyRule(UpdatePrivacyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePrivacyRuleWithOptions(request, runtime);
    }

    public UpdateRouteRuleResponse updateRouteRuleWithOptions(UpdateRouteRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeRuleId)) {
            query.put("RouteRuleId", request.routeRuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRouteRuleResponse updateRouteRule(UpdateRouteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRouteRuleWithOptions(request, runtime);
    }

    public UploadIoTDataToBlockchainResponse uploadIoTDataToBlockchainWithOptions(UploadIoTDataToBlockchainRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UploadIoTDataToBlockchainResponse uploadIoTDataToBlockchain(UploadIoTDataToBlockchainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadIoTDataToBlockchainWithOptions(request, runtime);
    }
}

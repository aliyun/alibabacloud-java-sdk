// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531;

import com.aliyun.tea.*;
import com.aliyun.mse20190531.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
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

    public AddAuthResourceResponse addAuthResourceWithOptions(AddAuthResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authId)) {
            query.put("AuthId", request.authId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddAuthResourceResponse addAuthResource(AddAuthResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAuthResourceWithOptions(request, runtime);
    }

    public AddBlackWhiteListResponse addBlackWhiteListWithOptions(AddBlackWhiteListRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddBlackWhiteListResponse addBlackWhiteList(AddBlackWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addBlackWhiteListWithOptions(request, runtime);
    }

    public AddGatewayResponse addGatewayWithOptions(AddGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseSecurityGroup)) {
            query.put("EnterpriseSecurityGroup", request.enterpriseSecurityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbSpec)) {
            query.put("InternetSlbSpec", request.internetSlbSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replica)) {
            query.put("Replica", request.replica);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbSpec)) {
            query.put("SlbSpec", request.slbSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddGatewayResponse addGateway(AddGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGatewayWithOptions(request, runtime);
    }

    public AddGatewayDomainResponse addGatewayDomainWithOptions(AddGatewayDomainRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.mustHttps)) {
            query.put("MustHttps", request.mustHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddGatewayDomainResponse addGatewayDomain(AddGatewayDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGatewayDomainWithOptions(request, runtime);
    }

    public AddGatewayServiceVersionResponse addGatewayServiceVersionWithOptions(AddGatewayServiceVersionRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddGatewayServiceVersionResponse addGatewayServiceVersion(AddGatewayServiceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGatewayServiceVersionWithOptions(request, runtime);
    }

    public AddGatewaySlbResponse addGatewaySlbWithOptions(AddGatewaySlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddGatewaySlbResponse addGatewaySlb(AddGatewaySlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGatewaySlbWithOptions(request, runtime);
    }

    public AddMockRuleResponse addMockRuleWithOptions(AddMockRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddMockRuleResponse addMockRule(AddMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMockRuleWithOptions(request, runtime);
    }

    public AddSSLCertResponse addSSLCertWithOptions(AddSSLCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSSLCert"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSSLCertResponse());
    }

    public AddSSLCertResponse addSSLCert(AddSSLCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSSLCertWithOptions(request, runtime);
    }

    public AddServiceSourceResponse addServiceSourceWithOptions(AddServiceSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddServiceSourceResponse addServiceSource(AddServiceSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addServiceSourceWithOptions(request, runtime);
    }

    public CloneNacosConfigResponse cloneNacosConfigWithOptions(CloneNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CloneNacosConfigResponse cloneNacosConfig(CloneNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneNacosConfigWithOptions(request, runtime);
    }

    public CreateAlarmRuleResponse createAlarmRuleWithOptions(CreateAlarmRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAlarmRuleShrinkRequest request = new CreateAlarmRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertWay)) {
            request.alertWayShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertWay, "AlertWay", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactGroupIds)) {
            request.contactGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactGroupIds, "ContactGroupIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggregates)) {
            query.put("Aggregates", request.aggregates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmAliasName)) {
            query.put("AlarmAliasName", request.alarmAliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmItem)) {
            query.put("AlarmItem", request.alarmItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertWayShrink)) {
            query.put("AlertWay", request.alertWayShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupIdsShrink)) {
            query.put("ContactGroupIds", request.contactGroupIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.NValue)) {
            query.put("NValue", request.NValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlarmRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlarmRuleResponse());
    }

    public CreateAlarmRuleResponse createAlarmRule(CreateAlarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlarmRuleWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
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

        if (!com.aliyun.teautil.Common.isUnset(request.diskCapacity)) {
            query.put("DiskCapacity", request.diskCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCount)) {
            query.put("InstanceCount", request.instanceCount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateEngineNamespaceResponse createEngineNamespaceWithOptions(CreateEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCount)) {
            query.put("ServiceCount", request.serviceCount);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateEngineNamespaceResponse createEngineNamespace(CreateEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEngineNamespaceWithOptions(request, runtime);
    }

    public CreateNacosConfigResponse createNacosConfigWithOptions(CreateNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateNacosConfigResponse createNacosConfig(CreateNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNacosConfigWithOptions(request, runtime);
    }

    public CreateNacosInstanceResponse createNacosInstanceWithOptions(CreateNacosInstanceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateNacosInstanceResponse createNacosInstance(CreateNacosInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNacosInstanceWithOptions(request, runtime);
    }

    public CreateNacosServiceResponse createNacosServiceWithOptions(CreateNacosServiceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateNacosServiceResponse createNacosService(CreateNacosServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNacosServiceWithOptions(request, runtime);
    }

    public CreateOrUpdateSwimmingLaneResponse createOrUpdateSwimmingLaneWithOptions(CreateOrUpdateSwimmingLaneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.entryRules)) {
            query.put("EntryRules", request.entryRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtCreate)) {
            query.put("GmtCreate", request.gmtCreate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            query.put("GmtModified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseKey)) {
            query.put("LicenseKey", request.licenseKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateOrUpdateSwimmingLaneResponse createOrUpdateSwimmingLane(CreateOrUpdateSwimmingLaneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrUpdateSwimmingLaneWithOptions(request, runtime);
    }

    public CreateOrUpdateSwimmingLaneGroupResponse createOrUpdateSwimmingLaneGroupWithOptions(CreateOrUpdateSwimmingLaneGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryApp)) {
            query.put("EntryApp", request.entryApp);
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

        if (!com.aliyun.teautil.Common.isUnset(request.licenseKey)) {
            query.put("LicenseKey", request.licenseKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateOrUpdateSwimmingLaneGroupResponse createOrUpdateSwimmingLaneGroup(CreateOrUpdateSwimmingLaneGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrUpdateSwimmingLaneGroupWithOptions(request, runtime);
    }

    public CreateZnodeResponse createZnodeWithOptions(CreateZnodeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateZnodeResponse createZnode(CreateZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createZnodeWithOptions(request, runtime);
    }

    public DeleteAlarmRuleResponse deleteAlarmRuleWithOptions(DeleteAlarmRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmRuleId)) {
            query.put("AlarmRuleId", request.alarmRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlarmRule"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlarmRuleResponse());
    }

    public DeleteAlarmRuleResponse deleteAlarmRule(DeleteAlarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlarmRuleWithOptions(request, runtime);
    }

    public DeleteAuthResourceResponse deleteAuthResourceWithOptions(DeleteAuthResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthResource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthResourceResponse());
    }

    public DeleteAuthResourceResponse deleteAuthResource(DeleteAuthResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAuthResourceWithOptions(request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    public DeleteEngineNamespaceResponse deleteEngineNamespaceWithOptions(DeleteEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteEngineNamespaceResponse deleteEngineNamespace(DeleteEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEngineNamespaceWithOptions(request, runtime);
    }

    public DeleteGatewayResponse deleteGatewayWithOptions(DeleteGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGateway"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayResponse());
    }

    public DeleteGatewayResponse deleteGateway(DeleteGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayWithOptions(request, runtime);
    }

    public DeleteGatewayDomainResponse deleteGatewayDomainWithOptions(DeleteGatewayDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewayDomain"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewayDomainResponse());
    }

    public DeleteGatewayDomainResponse deleteGatewayDomain(DeleteGatewayDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayDomainWithOptions(request, runtime);
    }

    public DeleteGatewayServiceVersionResponse deleteGatewayServiceVersionWithOptions(DeleteGatewayServiceVersionRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteGatewayServiceVersionResponse deleteGatewayServiceVersion(DeleteGatewayServiceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewayServiceVersionWithOptions(request, runtime);
    }

    public DeleteGatewaySlbResponse deleteGatewaySlbWithOptions(DeleteGatewaySlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGatewaySlb"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGatewaySlbResponse());
    }

    public DeleteGatewaySlbResponse deleteGatewaySlb(DeleteGatewaySlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGatewaySlbWithOptions(request, runtime);
    }

    public DeleteNacosConfigResponse deleteNacosConfigWithOptions(DeleteNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteNacosConfigResponse deleteNacosConfig(DeleteNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosConfigWithOptions(request, runtime);
    }

    public DeleteNacosConfigsResponse deleteNacosConfigsWithOptions(DeleteNacosConfigsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteNacosConfigsResponse deleteNacosConfigs(DeleteNacosConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosConfigsWithOptions(request, runtime);
    }

    public DeleteNacosServiceResponse deleteNacosServiceWithOptions(DeleteNacosServiceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteNacosServiceResponse deleteNacosService(DeleteNacosServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosServiceWithOptions(request, runtime);
    }

    public DeleteServiceSourceResponse deleteServiceSourceWithOptions(DeleteServiceSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceSourceResponse());
    }

    public DeleteServiceSourceResponse deleteServiceSource(DeleteServiceSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceSourceWithOptions(request, runtime);
    }

    public DeleteSwimmingLaneResponse deleteSwimmingLaneWithOptions(DeleteSwimmingLaneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteSwimmingLaneResponse deleteSwimmingLane(DeleteSwimmingLaneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSwimmingLaneWithOptions(request, runtime);
    }

    public DeleteSwimmingLaneGroupResponse deleteSwimmingLaneGroupWithOptions(DeleteSwimmingLaneGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteSwimmingLaneGroupResponse deleteSwimmingLaneGroup(DeleteSwimmingLaneGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSwimmingLaneGroupWithOptions(request, runtime);
    }

    public DeleteZnodeResponse deleteZnodeWithOptions(DeleteZnodeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteZnodeResponse deleteZnode(DeleteZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteZnodeWithOptions(request, runtime);
    }

    public ExportNacosConfigResponse exportNacosConfigWithOptions(ExportNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ExportNacosConfigResponse exportNacosConfig(ExportNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportNacosConfigWithOptions(request, runtime);
    }

    public GetBlackWhiteListResponse getBlackWhiteListWithOptions(GetBlackWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBlackWhiteList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBlackWhiteListResponse());
    }

    public GetBlackWhiteListResponse getBlackWhiteList(GetBlackWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBlackWhiteListWithOptions(request, runtime);
    }

    public GetEngineNamepaceResponse getEngineNamepaceWithOptions(GetEngineNamepaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetEngineNamepaceResponse getEngineNamepace(GetEngineNamepaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEngineNamepaceWithOptions(request, runtime);
    }

    public GetGatewayResponse getGatewayWithOptions(GetGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGateway"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayResponse());
    }

    public GetGatewayResponse getGateway(GetGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayWithOptions(request, runtime);
    }

    public GetGatewayDomainDetailResponse getGatewayDomainDetailWithOptions(GetGatewayDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayDomainDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayDomainDetailResponse());
    }

    public GetGatewayDomainDetailResponse getGatewayDomainDetail(GetGatewayDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayDomainDetailWithOptions(request, runtime);
    }

    public GetGatewayOptionResponse getGatewayOptionWithOptions(GetGatewayOptionRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetGatewayOptionResponse getGatewayOption(GetGatewayOptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayOptionWithOptions(request, runtime);
    }

    public GetGatewayServiceDetailResponse getGatewayServiceDetailWithOptions(GetGatewayServiceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayServiceDetail"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayServiceDetailResponse());
    }

    public GetGatewayServiceDetailResponse getGatewayServiceDetail(GetGatewayServiceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayServiceDetailWithOptions(request, runtime);
    }

    public GetGovernanceKubernetesClusterResponse getGovernanceKubernetesClusterWithOptions(GetGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetGovernanceKubernetesClusterResponse getGovernanceKubernetesCluster(GetGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public GetGovernanceKubernetesClusterListResponse getGovernanceKubernetesClusterListWithOptions(GetGovernanceKubernetesClusterListRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGovernanceKubernetesClusterList"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGovernanceKubernetesClusterListResponse());
    }

    public GetGovernanceKubernetesClusterListResponse getGovernanceKubernetesClusterList(GetGovernanceKubernetesClusterListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGovernanceKubernetesClusterListWithOptions(request, runtime);
    }

    public GetImageResponse getImageWithOptions(GetImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionCode)) {
            query.put("VersionCode", request.versionCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetImageResponse getImage(GetImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageWithOptions(request, runtime);
    }

    public GetImportFileUrlResponse getImportFileUrlWithOptions(GetImportFileUrlRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetImportFileUrlResponse getImportFileUrl(GetImportFileUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImportFileUrlWithOptions(request, runtime);
    }

    public GetKubernetesSourceResponse getKubernetesSourceWithOptions(GetKubernetesSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKubernetesSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKubernetesSourceResponse());
    }

    public GetKubernetesSourceResponse getKubernetesSource(GetKubernetesSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getKubernetesSourceWithOptions(request, runtime);
    }

    public GetMseFeatureSwitchResponse getMseFeatureSwitchWithOptions(GetMseFeatureSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetMseFeatureSwitchResponse getMseFeatureSwitch(GetMseFeatureSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMseFeatureSwitchWithOptions(request, runtime);
    }

    public GetMseSourceResponse getMseSourceWithOptions(GetMseSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMseSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMseSourceResponse());
    }

    public GetMseSourceResponse getMseSource(GetMseSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMseSourceWithOptions(request, runtime);
    }

    public GetNacosConfigResponse getNacosConfigWithOptions(GetNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetNacosConfigResponse getNacosConfig(GetNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNacosConfigWithOptions(request, runtime);
    }

    public GetNacosHistoryConfigResponse getNacosHistoryConfigWithOptions(GetNacosHistoryConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetNacosHistoryConfigResponse getNacosHistoryConfig(GetNacosHistoryConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNacosHistoryConfigWithOptions(request, runtime);
    }

    public GetOverviewResponse getOverviewWithOptions(GetOverviewRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetOverviewResponse getOverview(GetOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOverviewWithOptions(request, runtime);
    }

    public GetTagsBySwimmingLaneGroupIdResponse getTagsBySwimmingLaneGroupIdWithOptions(GetTagsBySwimmingLaneGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetTagsBySwimmingLaneGroupIdResponse getTagsBySwimmingLaneGroupId(GetTagsBySwimmingLaneGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTagsBySwimmingLaneGroupIdWithOptions(request, runtime);
    }

    public ImportNacosConfigResponse importNacosConfigWithOptions(ImportNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ImportNacosConfigResponse importNacosConfig(ImportNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importNacosConfigWithOptions(request, runtime);
    }

    public ImportServicesResponse importServicesWithOptions(ImportServicesRequest tmpReq, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceListShrink)) {
            query.put("ServiceList", request.serviceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ImportServicesResponse importServices(ImportServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importServicesWithOptions(request, runtime);
    }

    public ListAlarmContactGroupsResponse listAlarmContactGroupsWithOptions(ListAlarmContactGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmContactGroups"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmContactGroupsResponse());
    }

    public ListAlarmContactGroupsResponse listAlarmContactGroups(ListAlarmContactGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmContactGroupsWithOptions(request, runtime);
    }

    public ListAlarmHistoriesResponse listAlarmHistoriesWithOptions(ListAlarmHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmHistories"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmHistoriesResponse());
    }

    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmHistoriesWithOptions(request, runtime);
    }

    public ListAlarmItemsResponse listAlarmItemsWithOptions(ListAlarmItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmItems"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmItemsResponse());
    }

    public ListAlarmItemsResponse listAlarmItems(ListAlarmItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmItemsWithOptions(request, runtime);
    }

    public ListAlarmRulesResponse listAlarmRulesWithOptions(ListAlarmRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmRules"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmRulesResponse());
    }

    public ListAlarmRulesResponse listAlarmRules(ListAlarmRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmRulesWithOptions(request, runtime);
    }

    public ListAnsInstancesResponse listAnsInstancesWithOptions(ListAnsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAnsInstancesResponse listAnsInstances(ListAnsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsInstancesWithOptions(request, runtime);
    }

    public ListAnsServiceClustersResponse listAnsServiceClustersWithOptions(ListAnsServiceClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnsServiceClusters"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnsServiceClustersResponse());
    }

    public ListAnsServiceClustersResponse listAnsServiceClusters(ListAnsServiceClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsServiceClustersWithOptions(request, runtime);
    }

    public ListAnsServicesResponse listAnsServicesWithOptions(ListAnsServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnsServices"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAnsServicesResponse());
    }

    public ListAnsServicesResponse listAnsServices(ListAnsServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsServicesWithOptions(request, runtime);
    }

    public ListAppBySwimmingLaneGroupTagResponse listAppBySwimmingLaneGroupTagWithOptions(ListAppBySwimmingLaneGroupTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAppBySwimmingLaneGroupTagResponse listAppBySwimmingLaneGroupTag(ListAppBySwimmingLaneGroupTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppBySwimmingLaneGroupTagWithOptions(request, runtime);
    }

    public ListClusterConnectionTypesResponse listClusterConnectionTypesWithOptions(ListClusterConnectionTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListClusterConnectionTypesResponse listClusterConnectionTypes(ListClusterConnectionTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterConnectionTypesWithOptions(request, runtime);
    }

    public ListClusterTypesResponse listClusterTypesWithOptions(ListClusterTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectType)) {
            query.put("ConnectType", request.connectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListClusterTypesResponse listClusterTypes(ListClusterTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterTypesWithOptions(request, runtime);
    }

    public ListClusterVersionsResponse listClusterVersionsWithOptions(ListClusterVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListClusterVersionsResponse listClusterVersions(ListClusterVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterVersionsWithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    public ListEngineNamespacesResponse listEngineNamespacesWithOptions(ListEngineNamespacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEngineNamespaces"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEngineNamespacesResponse());
    }

    public ListEngineNamespacesResponse listEngineNamespaces(ListEngineNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEngineNamespacesWithOptions(request, runtime);
    }

    public ListEurekaInstancesResponse listEurekaInstancesWithOptions(ListEurekaInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListEurekaInstancesResponse listEurekaInstances(ListEurekaInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEurekaInstancesWithOptions(request, runtime);
    }

    public ListEurekaServicesResponse listEurekaServicesWithOptions(ListEurekaServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListEurekaServicesResponse listEurekaServices(ListEurekaServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEurekaServicesWithOptions(request, runtime);
    }

    public ListGatewayResponse listGatewayWithOptions(ListGatewayRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGatewayShrinkRequest request = new ListGatewayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.filterParams))) {
            request.filterParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.filterParams), "FilterParams", "json");
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListGatewayResponse listGateway(ListGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGatewayWithOptions(request, runtime);
    }

    public ListGatewayDomainResponse listGatewayDomainWithOptions(ListGatewayDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewayDomain"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewayDomainResponse());
    }

    public ListGatewayDomainResponse listGatewayDomain(ListGatewayDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGatewayDomainWithOptions(request, runtime);
    }

    public ListGatewayServiceResponse listGatewayServiceWithOptions(ListGatewayServiceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGatewayServiceShrinkRequest request = new ListGatewayServiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.filterParams))) {
            request.filterParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.filterParams), "FilterParams", "json");
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListGatewayServiceResponse listGatewayService(ListGatewayServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGatewayServiceWithOptions(request, runtime);
    }

    public ListGatewaySlbResponse listGatewaySlbWithOptions(ListGatewaySlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGatewaySlb"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGatewaySlbResponse());
    }

    public ListGatewaySlbResponse listGatewaySlb(ListGatewaySlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGatewaySlbWithOptions(request, runtime);
    }

    public ListListenersByConfigResponse listListenersByConfigWithOptions(ListListenersByConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListListenersByConfigResponse listListenersByConfig(ListListenersByConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersByConfigWithOptions(request, runtime);
    }

    public ListListenersByIpResponse listListenersByIpWithOptions(ListListenersByIpRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListListenersByIpResponse listListenersByIp(ListListenersByIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersByIpWithOptions(request, runtime);
    }

    public ListNacosConfigsResponse listNacosConfigsWithOptions(ListNacosConfigsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListNacosConfigsResponse listNacosConfigs(ListNacosConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNacosConfigsWithOptions(request, runtime);
    }

    public ListNacosHistoryConfigsResponse listNacosHistoryConfigsWithOptions(ListNacosHistoryConfigsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListNacosHistoryConfigsResponse listNacosHistoryConfigs(ListNacosHistoryConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNacosHistoryConfigsWithOptions(request, runtime);
    }

    public ListSSLCertResponse listSSLCertWithOptions(ListSSLCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSSLCert"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSSLCertResponse());
    }

    public ListSSLCertResponse listSSLCert(ListSSLCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSSLCertWithOptions(request, runtime);
    }

    public ListServiceSourceResponse listServiceSourceWithOptions(ListServiceSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceSource"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceSourceResponse());
    }

    public ListServiceSourceResponse listServiceSource(ListServiceSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceSourceWithOptions(request, runtime);
    }

    public ListZnodeChildrenResponse listZnodeChildrenWithOptions(ListZnodeChildrenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListZnodeChildren"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListZnodeChildrenResponse());
    }

    public ListZnodeChildrenResponse listZnodeChildren(ListZnodeChildrenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listZnodeChildrenWithOptions(request, runtime);
    }

    public ModifyGovernanceKubernetesClusterResponse modifyGovernanceKubernetesClusterWithOptions(ModifyGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceInfos)) {
            query.put("NamespaceInfos", request.namespaceInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyGovernanceKubernetesClusterResponse modifyGovernanceKubernetesCluster(ModifyGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public PullServicesResponse pullServicesWithOptions(PullServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PullServices"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PullServicesResponse());
    }

    public PullServicesResponse pullServices(PullServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pullServicesWithOptions(request, runtime);
    }

    public QueryAllSwimmingLaneResponse queryAllSwimmingLaneWithOptions(QueryAllSwimmingLaneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAllSwimmingLaneResponse queryAllSwimmingLane(QueryAllSwimmingLaneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAllSwimmingLaneWithOptions(request, runtime);
    }

    public QueryAllSwimmingLaneGroupResponse queryAllSwimmingLaneGroupWithOptions(QueryAllSwimmingLaneGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryAllSwimmingLaneGroupResponse queryAllSwimmingLaneGroup(QueryAllSwimmingLaneGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAllSwimmingLaneGroupWithOptions(request, runtime);
    }

    public QueryBusinessLocationsResponse queryBusinessLocationsWithOptions(QueryBusinessLocationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryBusinessLocationsResponse queryBusinessLocations(QueryBusinessLocationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBusinessLocationsWithOptions(request, runtime);
    }

    public QueryClusterDetailResponse queryClusterDetailWithOptions(QueryClusterDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryClusterDetailResponse queryClusterDetail(QueryClusterDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterDetailWithOptions(request, runtime);
    }

    public QueryClusterDiskSpecificationResponse queryClusterDiskSpecificationWithOptions(QueryClusterDiskSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("ClusterType", request.clusterType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryClusterDiskSpecificationResponse queryClusterDiskSpecification(QueryClusterDiskSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterDiskSpecificationWithOptions(request, runtime);
    }

    public QueryClusterSpecificationResponse queryClusterSpecificationWithOptions(QueryClusterSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectType)) {
            query.put("ConnectType", request.connectType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryClusterSpecificationResponse queryClusterSpecification(QueryClusterSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterSpecificationWithOptions(request, runtime);
    }

    public QueryConfigResponse queryConfigWithOptions(QueryConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConfig"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConfigResponse());
    }

    public QueryConfigResponse queryConfig(QueryConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConfigWithOptions(request, runtime);
    }

    public QueryGatewayRegionResponse queryGatewayRegionWithOptions(QueryGatewayRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGatewayRegion"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGatewayRegionResponse());
    }

    public QueryGatewayRegionResponse queryGatewayRegion(QueryGatewayRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGatewayRegionWithOptions(request, runtime);
    }

    public QueryGatewayTypeResponse queryGatewayTypeWithOptions(QueryGatewayTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGatewayType"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGatewayTypeResponse());
    }

    public QueryGatewayTypeResponse queryGatewayType(QueryGatewayTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGatewayTypeWithOptions(request, runtime);
    }

    public QueryGovernanceKubernetesClusterResponse queryGovernanceKubernetesClusterWithOptions(QueryGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryGovernanceKubernetesClusterResponse queryGovernanceKubernetesCluster(QueryGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public QueryMonitorResponse queryMonitorWithOptions(QueryMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMonitor"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMonitorResponse());
    }

    public QueryMonitorResponse queryMonitor(QueryMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonitorWithOptions(request, runtime);
    }

    public QuerySlbSpecResponse querySlbSpecWithOptions(QuerySlbSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QuerySlbSpecResponse querySlbSpec(QuerySlbSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySlbSpecWithOptions(request, runtime);
    }

    public QuerySwimmingLaneByIdResponse querySwimmingLaneByIdWithOptions(QuerySwimmingLaneByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QuerySwimmingLaneByIdResponse querySwimmingLaneById(QuerySwimmingLaneByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySwimmingLaneByIdWithOptions(request, runtime);
    }

    public QueryZnodeDetailResponse queryZnodeDetailWithOptions(QueryZnodeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public QueryZnodeDetailResponse queryZnodeDetail(QueryZnodeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryZnodeDetailWithOptions(request, runtime);
    }

    public RestartClusterResponse restartClusterWithOptions(RestartClusterRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RestartClusterResponse restartCluster(RestartClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartClusterWithOptions(request, runtime);
    }

    public RetryClusterResponse retryClusterWithOptions(RetryClusterRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RetryClusterResponse retryCluster(RetryClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryClusterWithOptions(request, runtime);
    }

    public ScalingClusterResponse scalingClusterWithOptions(ScalingClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpecification)) {
            query.put("ClusterSpecification", request.clusterSpecification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceCount)) {
            query.put("InstanceCount", request.instanceCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryCapacity)) {
            query.put("MemoryCapacity", request.memoryCapacity);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScalingCluster"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScalingClusterResponse());
    }

    public ScalingClusterResponse scalingCluster(ScalingClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scalingClusterWithOptions(request, runtime);
    }

    public SelectGatewaySlbResponse selectGatewaySlbWithOptions(SelectGatewaySlbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectGatewaySlb"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectGatewaySlbResponse());
    }

    public SelectGatewaySlbResponse selectGatewaySlb(SelectGatewaySlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.selectGatewaySlbWithOptions(request, runtime);
    }

    public UpdateAclResponse updateAclWithOptions(UpdateAclRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateAclResponse updateAcl(UpdateAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAclWithOptions(request, runtime);
    }

    public UpdateBlackWhiteListResponse updateBlackWhiteListWithOptions(UpdateBlackWhiteListRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateBlackWhiteListResponse updateBlackWhiteList(UpdateBlackWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateBlackWhiteListWithOptions(request, runtime);
    }

    public UpdateClusterResponse updateClusterWithOptions(UpdateClusterRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClusterWithOptions(request, runtime);
    }

    public UpdateConfigResponse updateConfigWithOptions(UpdateConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.passWord)) {
            query.put("PassWord", request.passWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestPars)) {
            query.put("RequestPars", request.requestPars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncLimit)) {
            query.put("SyncLimit", request.syncLimit);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateConfigResponse updateConfig(UpdateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigWithOptions(request, runtime);
    }

    public UpdateEngineNamespaceResponse updateEngineNamespaceWithOptions(UpdateEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateEngineNamespaceResponse updateEngineNamespace(UpdateEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEngineNamespaceWithOptions(request, runtime);
    }

    public UpdateGatewayDomainResponse updateGatewayDomainWithOptions(UpdateGatewayDomainRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mustHttps)) {
            query.put("MustHttps", request.mustHttps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateGatewayDomainResponse updateGatewayDomain(UpdateGatewayDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayDomainWithOptions(request, runtime);
    }

    public UpdateGatewayNameResponse updateGatewayNameWithOptions(UpdateGatewayNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayName"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayNameResponse());
    }

    public UpdateGatewayNameResponse updateGatewayName(UpdateGatewayNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayNameWithOptions(request, runtime);
    }

    public UpdateGatewayOptionResponse updateGatewayOptionWithOptions(UpdateGatewayOptionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateGatewayOptionShrinkRequest request = new UpdateGatewayOptionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.gatewayOption))) {
            request.gatewayOptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.gatewayOption), "GatewayOption", "json");
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateGatewayOptionResponse updateGatewayOption(UpdateGatewayOptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayOptionWithOptions(request, runtime);
    }

    public UpdateGatewayRouteHTTPRewriteResponse updateGatewayRouteHTTPRewriteWithOptions(UpdateGatewayRouteHTTPRewriteRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateGatewayRouteHTTPRewriteResponse updateGatewayRouteHTTPRewrite(UpdateGatewayRouteHTTPRewriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayRouteHTTPRewriteWithOptions(request, runtime);
    }

    public UpdateGatewayServiceVersionResponse updateGatewayServiceVersionWithOptions(UpdateGatewayServiceVersionRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateGatewayServiceVersionResponse updateGatewayServiceVersion(UpdateGatewayServiceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayServiceVersionWithOptions(request, runtime);
    }

    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }

    public UpdateNacosClusterResponse updateNacosClusterWithOptions(UpdateNacosClusterRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateNacosClusterResponse updateNacosCluster(UpdateNacosClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNacosClusterWithOptions(request, runtime);
    }

    public UpdateNacosConfigResponse updateNacosConfigWithOptions(UpdateNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateNacosConfigResponse updateNacosConfig(UpdateNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNacosConfigWithOptions(request, runtime);
    }

    public UpdateNacosInstanceResponse updateNacosInstanceWithOptions(UpdateNacosInstanceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateNacosInstanceResponse updateNacosInstance(UpdateNacosInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNacosInstanceWithOptions(request, runtime);
    }

    public UpdateNacosServiceResponse updateNacosServiceWithOptions(UpdateNacosServiceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateNacosServiceResponse updateNacosService(UpdateNacosServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNacosServiceWithOptions(request, runtime);
    }

    public UpdateSSLCertResponse updateSSLCertWithOptions(UpdateSSLCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSSLCert"),
            new TeaPair("version", "2019-05-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSSLCertResponse());
    }

    public UpdateSSLCertResponse updateSSLCert(UpdateSSLCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSSLCertWithOptions(request, runtime);
    }

    public UpdateZnodeResponse updateZnodeWithOptions(UpdateZnodeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateZnodeResponse updateZnode(UpdateZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateZnodeWithOptions(request, runtime);
    }

    public UpgradeClusterResponse upgradeClusterWithOptions(UpgradeClusterRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpgradeClusterResponse upgradeCluster(UpgradeClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeClusterWithOptions(request, runtime);
    }
}

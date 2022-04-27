// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825;

import com.aliyun.tea.*;
import com.aliyun.cmn20200825.models.*;
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
        this._endpoint = this.getEndpoint("cmn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ApplyIPResponse applyIPWithOptions(ApplyIPRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyIPShrinkRequest request = new ApplyIPShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceResourceIds)) {
            request.deviceResourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceResourceIds, "DeviceResourceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessTypeId)) {
            query.put("BusinessTypeId", request.businessTypeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessTypeParams)) {
            query.put("BusinessTypeParams", request.businessTypeParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResourceId)) {
            query.put("DeviceResourceId", request.deviceResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResourceIdsShrink)) {
            query.put("DeviceResourceIds", request.deviceResourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipType)) {
            query.put("IpType", request.ipType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loopbackPort)) {
            query.put("LoopbackPort", request.loopbackPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLocation)) {
            query.put("NetLocation", request.netLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setupProjectId)) {
            query.put("SetupProjectId", request.setupProjectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyIP"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyIPResponse());
    }

    public ApplyIPResponse applyIP(ApplyIPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyIPWithOptions(request, runtime);
    }

    public AutoDutyResponse autoDutyWithOptions(AutoDutyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dutyBatch)) {
            body.put("DutyBatch", request.dutyBatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dutyName)) {
            body.put("DutyName", request.dutyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AutoDuty"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AutoDutyResponse());
    }

    public AutoDutyResponse autoDuty(AutoDutyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.autoDutyWithOptions(request, runtime);
    }

    public CloseEventResponse closeEventWithOptions(CloseEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            body.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventObjectId)) {
            body.put("EventObjectId", request.eventObjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            body.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseEvent"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseEventResponse());
    }

    public CloseEventResponse closeEvent(CloseEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeEventWithOptions(request, runtime);
    }

    public CreateConfigurationSpecificationResponse createConfigurationSpecificationWithOptions(CreateConfigurationSpecificationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateConfigurationSpecificationShrinkRequest request = new CreateConfigurationSpecificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedVariate)) {
            request.relatedVariateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedVariate, "RelatedVariate", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architecture)) {
            body.put("Architecture", request.architecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedVariateShrink)) {
            body.put("RelatedVariate", request.relatedVariateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificationContent)) {
            body.put("SpecificationContent", request.specificationContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificationName)) {
            body.put("SpecificationName", request.specificationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfigurationSpecification"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigurationSpecificationResponse());
    }

    public CreateConfigurationSpecificationResponse createConfigurationSpecification(CreateConfigurationSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConfigurationSpecificationWithOptions(request, runtime);
    }

    public CreateConfigurationVariateResponse createConfigurationVariateWithOptions(CreateConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatFunction)) {
            body.put("FormatFunction", request.formatFunction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variateName)) {
            body.put("VariateName", request.variateName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfigurationVariate"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigurationVariateResponse());
    }

    public CreateConfigurationVariateResponse createConfigurationVariate(CreateConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConfigurationVariateWithOptions(request, runtime);
    }

    public CreateDedicatedLineResponse createDedicatedLineWithOptions(CreateDedicatedLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            body.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contact)) {
            body.put("Contact", request.contact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedLineGateway)) {
            body.put("DedicatedLineGateway", request.dedicatedLineGateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedLineIp)) {
            body.put("DedicatedLineIp", request.dedicatedLineIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedLineRole)) {
            body.put("DedicatedLineRole", request.dedicatedLineRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicePort)) {
            body.put("DevicePort", request.devicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            body.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceId)) {
            body.put("PhysicalSpaceId", request.physicalSpaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDedicatedLine"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDedicatedLineResponse());
    }

    public CreateDedicatedLineResponse createDedicatedLine(CreateDedicatedLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedLineWithOptions(request, runtime);
    }

    public CreateDeviceResponse createDeviceWithOptions(CreateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFormId)) {
            body.put("DeviceFormId", request.deviceFormId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePassword)) {
            body.put("EnablePassword", request.enablePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extAttributes)) {
            body.put("ExtAttributes", request.extAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            body.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("LoginPassword", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginType)) {
            body.put("LoginType", request.loginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginUsername)) {
            body.put("LoginUsername", request.loginUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            body.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceId)) {
            body.put("PhysicalSpaceId", request.physicalSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityDomain)) {
            body.put("SecurityDomain", request.securityDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatus)) {
            body.put("ServiceStatus", request.serviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            body.put("Sn", request.sn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAccountType)) {
            body.put("SnmpAccountType", request.snmpAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAccountVersion)) {
            body.put("SnmpAccountVersion", request.snmpAccountVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAuthPassphrase)) {
            body.put("SnmpAuthPassphrase", request.snmpAuthPassphrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAuthProtocol)) {
            body.put("SnmpAuthProtocol", request.snmpAuthProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpCommunity)) {
            body.put("SnmpCommunity", request.snmpCommunity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpPrivacyPassphrase)) {
            body.put("SnmpPrivacyPassphrase", request.snmpPrivacyPassphrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpPrivacyProtocol)) {
            body.put("SnmpPrivacyProtocol", request.snmpPrivacyProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpSecurityLevel)) {
            body.put("SnmpSecurityLevel", request.snmpSecurityLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpUsername)) {
            body.put("SnmpUsername", request.snmpUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDevice"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceResponse());
    }

    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    public CreateDeviceFormResponse createDeviceFormWithOptions(CreateDeviceFormRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountConfig)) {
            body.put("AccountConfig", request.accountConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configCompare)) {
            body.put("ConfigCompare", request.configCompare);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailDisplay)) {
            body.put("DetailDisplay", request.detailDisplay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFormName)) {
            body.put("DeviceFormName", request.deviceFormName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedDeviceFormId)) {
            body.put("RelatedDeviceFormId", request.relatedDeviceFormId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUse)) {
            body.put("ResourceUse", request.resourceUse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.script)) {
            body.put("Script", request.script);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueKey)) {
            body.put("UniqueKey", request.uniqueKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeviceForm"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceFormResponse());
    }

    public CreateDeviceFormResponse createDeviceForm(CreateDeviceFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceFormWithOptions(request, runtime);
    }

    public CreateDevicePropertyResponse createDevicePropertyWithOptions(CreateDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFormId)) {
            body.put("DeviceFormId", request.deviceFormId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyContent)) {
            body.put("PropertyContent", request.propertyContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyFormat)) {
            body.put("PropertyFormat", request.propertyFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyKey)) {
            body.put("PropertyKey", request.propertyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyName)) {
            body.put("PropertyName", request.propertyName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeviceProperty"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDevicePropertyResponse());
    }

    public CreateDevicePropertyResponse createDeviceProperty(CreateDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevicePropertyWithOptions(request, runtime);
    }

    public CreateDevicesResponse createDevicesWithOptions(CreateDevicesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDevicesShrinkRequest request = new CreateDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceParamModelList)) {
            request.deviceParamModelListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceParamModelList, "DeviceParamModelList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFormId)) {
            body.put("DeviceFormId", request.deviceFormId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceParamModelListShrink)) {
            body.put("DeviceParamModelList", request.deviceParamModelListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDevices"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDevicesResponse());
    }

    public CreateDevicesResponse createDevices(CreateDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevicesWithOptions(request, runtime);
    }

    public CreateEventDefinitionResponse createEventDefinitionWithOptions(CreateEventDefinitionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            body.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            body.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventDefinition"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventDefinitionResponse());
    }

    public CreateEventDefinitionResponse createEventDefinition(CreateEventDefinitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEventDefinitionWithOptions(request, runtime);
    }

    public CreateLinkJobResponse createLinkJobWithOptions(CreateLinkJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoConfirm)) {
            body.put("AutoConfirm", request.autoConfirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.doubleConvertStrategy)) {
            body.put("DoubleConvertStrategy", request.doubleConvertStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.singleStrategy)) {
            body.put("SingleStrategy", request.singleStrategy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLinkJob"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLinkJobResponse());
    }

    public CreateLinkJobResponse createLinkJob(CreateLinkJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLinkJobWithOptions(request, runtime);
    }

    public CreateMonitorItemResponse createMonitorItemWithOptions(CreateMonitorItemRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMonitorItemShrinkRequest request = new CreateMonitorItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alarmRuleList)) {
            request.alarmRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alarmRuleList, "AlarmRuleList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmRuleListShrink)) {
            body.put("AlarmRuleList", request.alarmRuleListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.analysisCode)) {
            body.put("AnalysisCode", request.analysisCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionType)) {
            body.put("CollectionType", request.collectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataItem)) {
            body.put("DataItem", request.dataItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceForm)) {
            body.put("DeviceForm", request.deviceForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effective)) {
            body.put("Effective", request.effective);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execInterval)) {
            body.put("ExecInterval", request.execInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorItemDescription)) {
            body.put("MonitorItemDescription", request.monitorItemDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorItemName)) {
            body.put("MonitorItemName", request.monitorItemName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityDomain)) {
            body.put("SecurityDomain", request.securityDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorItem"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorItemResponse());
    }

    public CreateMonitorItemResponse createMonitorItem(CreateMonitorItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitorItemWithOptions(request, runtime);
    }

    public CreateOsVersionResponse createOsVersionWithOptions(CreateOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            body.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osVersion)) {
            body.put("OsVersion", request.osVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOsVersion"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOsVersionResponse());
    }

    public CreateOsVersionResponse createOsVersion(CreateOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOsVersionWithOptions(request, runtime);
    }

    public CreatePhysicalSpaceResponse createPhysicalSpaceWithOptions(CreatePhysicalSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            body.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUid)) {
            body.put("ParentUid", request.parentUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceName)) {
            body.put("PhysicalSpaceName", request.physicalSpaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            body.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceAbbreviation)) {
            body.put("SpaceAbbreviation", request.spaceAbbreviation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            body.put("SpaceType", request.spaceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePhysicalSpace"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePhysicalSpaceResponse());
    }

    public CreatePhysicalSpaceResponse createPhysicalSpace(CreatePhysicalSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPhysicalSpaceWithOptions(request, runtime);
    }

    public CreateRealtimeTaskResponse createRealtimeTaskWithOptions(CreateRealtimeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.script)) {
            body.put("Script", request.script);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRealtimeTask"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRealtimeTaskResponse());
    }

    public CreateRealtimeTaskResponse createRealtimeTask(CreateRealtimeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRealtimeTaskWithOptions(request, runtime);
    }

    public CreateResourceInformationResponse createResourceInformationWithOptions(CreateResourceInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architectureId)) {
            body.put("ArchitectureId", request.architectureId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.information)) {
            bodyFlat.put("Information", request.information);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAttribute)) {
            body.put("ResourceAttribute", request.resourceAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceInformation"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceInformationResponse());
    }

    public CreateResourceInformationResponse createResourceInformation(CreateResourceInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceInformationWithOptions(request, runtime);
    }

    public CreateSetupProjectResponse createSetupProjectWithOptions(CreateSetupProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryTime)) {
            body.put("DeliveryTime", request.deliveryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            body.put("SpaceId", request.spaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSetupProject"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSetupProjectResponse());
    }

    public CreateSetupProjectResponse createSetupProject(CreateSetupProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSetupProjectWithOptions(request, runtime);
    }

    public CreateSpaceModelResponse createSpaceModelWithOptions(CreateSpaceModelRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSpaceModelShrinkRequest request = new CreateSpaceModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            body.put("SpaceType", request.spaceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSpaceModel"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSpaceModelResponse());
    }

    public CreateSpaceModelResponse createSpaceModel(CreateSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSpaceModelWithOptions(request, runtime);
    }

    public CreateTaskResponse createTaskWithOptions(CreateTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTaskWithOptions(request, runtime);
    }

    public CreateTimePeriodResponse createTimePeriodWithOptions(CreateTimePeriodRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expression)) {
            body.put("Expression", request.expression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePeriodDescription)) {
            body.put("TimePeriodDescription", request.timePeriodDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePeriodName)) {
            body.put("TimePeriodName", request.timePeriodName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTimePeriod"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTimePeriodResponse());
    }

    public CreateTimePeriodResponse createTimePeriod(CreateTimePeriodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTimePeriodWithOptions(request, runtime);
    }

    public CreateWorkOrderResponse createWorkOrderWithOptions(CreateWorkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmHappenTime)) {
            body.put("AlarmHappenTime", request.alarmHappenTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmRecoverTime)) {
            body.put("AlarmRecoverTime", request.alarmRecoverTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmRelated)) {
            body.put("AlarmRelated", request.alarmRelated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            body.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.circuitId)) {
            body.put("CircuitId", request.circuitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.circuitName)) {
            body.put("CircuitName", request.circuitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.circuitType)) {
            body.put("CircuitType", request.circuitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIp)) {
            body.put("DeviceIp", request.deviceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIpA)) {
            body.put("DeviceIpA", request.deviceIpA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIpB)) {
            body.put("DeviceIpB", request.deviceIpB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModelA)) {
            body.put("DeviceModelA", request.deviceModelA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModelB)) {
            body.put("DeviceModelB", request.deviceModelB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceNameA)) {
            body.put("DeviceNameA", request.deviceNameA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceNameB)) {
            body.put("DeviceNameB", request.deviceNameB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicePortA)) {
            body.put("DevicePortA", request.devicePortA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicePortB)) {
            body.put("DevicePortB", request.devicePortB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnA)) {
            body.put("DeviceSnA", request.deviceSnA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnB)) {
            body.put("DeviceSnB", request.deviceSnB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceVendor)) {
            body.put("DeviceVendor", request.deviceVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceVendorA)) {
            body.put("DeviceVendorA", request.deviceVendorA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceVendorB)) {
            body.put("DeviceVendorB", request.deviceVendorB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emergencyDegree)) {
            body.put("EmergencyDegree", request.emergencyDegree);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.impactBusiness)) {
            body.put("ImpactBusiness", request.impactBusiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentDescription)) {
            body.put("IncidentDescription", request.incidentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentSubType)) {
            body.put("IncidentSubType", request.incidentSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentType)) {
            body.put("IncidentType", request.incidentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liableMan)) {
            body.put("LiableMan", request.liableMan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkMan)) {
            body.put("LinkMan", request.linkMan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalSubjectAlarm)) {
            body.put("OriginalSubjectAlarm", request.originalSubjectAlarm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processLimited)) {
            body.put("ProcessLimited", request.processLimited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processMan)) {
            body.put("ProcessMan", request.processMan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processManId)) {
            body.put("ProcessManId", request.processManId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroups)) {
            body.put("SkillGroups", request.skillGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderSource)) {
            body.put("WorkOrderSource", request.workOrderSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderStep)) {
            body.put("WorkOrderStep", request.workOrderStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderTitle)) {
            body.put("WorkOrderTitle", request.workOrderTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderType)) {
            body.put("WorkOrderType", request.workOrderType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkOrder"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkOrderResponse());
    }

    public CreateWorkOrderResponse createWorkOrder(CreateWorkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWorkOrderWithOptions(request, runtime);
    }

    public DeleteConfigurationSpecificationResponse deleteConfigurationSpecificationWithOptions(DeleteConfigurationSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configurationSpecificationId)) {
            body.put("ConfigurationSpecificationId", request.configurationSpecificationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigurationSpecification"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigurationSpecificationResponse());
    }

    public DeleteConfigurationSpecificationResponse deleteConfigurationSpecification(DeleteConfigurationSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConfigurationSpecificationWithOptions(request, runtime);
    }

    public DeleteConfigurationVariateResponse deleteConfigurationVariateWithOptions(DeleteConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configurationVariateId)) {
            body.put("ConfigurationVariateId", request.configurationVariateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigurationVariate"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigurationVariateResponse());
    }

    public DeleteConfigurationVariateResponse deleteConfigurationVariate(DeleteConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConfigurationVariateWithOptions(request, runtime);
    }

    public DeleteDedicatedLineResponse deleteDedicatedLineWithOptions(DeleteDedicatedLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedLineId)) {
            body.put("DedicatedLineId", request.dedicatedLineId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDedicatedLine"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDedicatedLineResponse());
    }

    public DeleteDedicatedLineResponse deleteDedicatedLine(DeleteDedicatedLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedLineWithOptions(request, runtime);
    }

    public DeleteDeliveryArchVersionResponse deleteDeliveryArchVersionWithOptions(DeleteDeliveryArchVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryArchVersionId)) {
            body.put("DeliveryArchVersionId", request.deliveryArchVersionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeliveryArchVersion"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeliveryArchVersionResponse());
    }

    public DeleteDeliveryArchVersionResponse deleteDeliveryArchVersion(DeleteDeliveryArchVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeliveryArchVersionWithOptions(request, runtime);
    }

    public DeleteDeliveryProjectResponse deleteDeliveryProjectWithOptions(DeleteDeliveryProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryProjectId)) {
            body.put("DeliveryProjectId", request.deliveryProjectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeliveryProject"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeliveryProjectResponse());
    }

    public DeleteDeliveryProjectResponse deleteDeliveryProject(DeleteDeliveryProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeliveryProjectWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevice"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public DeleteDeviceFormResponse deleteDeviceFormWithOptions(DeleteDeviceFormRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceFormId)) {
            body.put("DeviceFormId", request.deviceFormId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceForm"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceFormResponse());
    }

    public DeleteDeviceFormResponse deleteDeviceForm(DeleteDeviceFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceFormWithOptions(request, runtime);
    }

    public DeleteDevicePropertyResponse deleteDevicePropertyWithOptions(DeleteDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devicePropertyId)) {
            body.put("DevicePropertyId", request.devicePropertyId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceProperty"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDevicePropertyResponse());
    }

    public DeleteDevicePropertyResponse deleteDeviceProperty(DeleteDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevicePropertyWithOptions(request, runtime);
    }

    public DeleteDeviceResourceResponse deleteDeviceResourceWithOptions(DeleteDeviceResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceResourceId)) {
            query.put("DeviceResourceId", request.deviceResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceResource"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceResourceResponse());
    }

    public DeleteDeviceResourceResponse deleteDeviceResource(DeleteDeviceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceResourceWithOptions(request, runtime);
    }

    public DeleteDevicesResponse deleteDevicesWithOptions(DeleteDevicesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDevicesShrinkRequest request = new DeleteDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceIds)) {
            request.deviceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceIds, "DeviceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdsShrink)) {
            body.put("DeviceIds", request.deviceIdsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevices"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDevicesResponse());
    }

    public DeleteDevicesResponse deleteDevices(DeleteDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevicesWithOptions(request, runtime);
    }

    public DeleteEventDefinitionResponse deleteEventDefinitionWithOptions(DeleteEventDefinitionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventDefinition"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventDefinitionResponse());
    }

    public DeleteEventDefinitionResponse deleteEventDefinition(DeleteEventDefinitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventDefinitionWithOptions(request, runtime);
    }

    public DeleteInspectionTaskResponse deleteInspectionTaskWithOptions(DeleteInspectionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInspectionTask"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInspectionTaskResponse());
    }

    public DeleteInspectionTaskResponse deleteInspectionTask(DeleteInspectionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInspectionTaskWithOptions(request, runtime);
    }

    public DeleteOsVersionResponse deleteOsVersionWithOptions(DeleteOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osVersionId)) {
            body.put("OsVersionId", request.osVersionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOsVersion"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOsVersionResponse());
    }

    public DeleteOsVersionResponse deleteOsVersion(DeleteOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOsVersionWithOptions(request, runtime);
    }

    public DeletePhysicalSpaceResponse deletePhysicalSpaceWithOptions(DeletePhysicalSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceId)) {
            body.put("PhysicalSpaceId", request.physicalSpaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePhysicalSpace"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePhysicalSpaceResponse());
    }

    public DeletePhysicalSpaceResponse deletePhysicalSpace(DeletePhysicalSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePhysicalSpaceWithOptions(request, runtime);
    }

    public DeleteResourceInformationResponse deleteResourceInformationWithOptions(DeleteResourceInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceInformationId)) {
            body.put("ResourceInformationId", request.resourceInformationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceInformation"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceInformationResponse());
    }

    public DeleteResourceInformationResponse deleteResourceInformation(DeleteResourceInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteResourceInformationWithOptions(request, runtime);
    }

    public DeleteSetupProjectResponse deleteSetupProjectWithOptions(DeleteSetupProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.setupProjectId)) {
            body.put("SetupProjectId", request.setupProjectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSetupProject"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSetupProjectResponse());
    }

    public DeleteSetupProjectResponse deleteSetupProject(DeleteSetupProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSetupProjectWithOptions(request, runtime);
    }

    public DeleteSpaceModelResponse deleteSpaceModelWithOptions(DeleteSpaceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceModelId)) {
            query.put("SpaceModelId", request.spaceModelId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSpaceModel"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSpaceModelResponse());
    }

    public DeleteSpaceModelResponse deleteSpaceModel(DeleteSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpaceModelWithOptions(request, runtime);
    }

    public DeleteWorkOrderResponse deleteWorkOrderWithOptions(DeleteWorkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workOrderId)) {
            body.put("WorkOrderId", request.workOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkOrder"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkOrderResponse());
    }

    public DeleteWorkOrderResponse deleteWorkOrder(DeleteWorkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWorkOrderWithOptions(request, runtime);
    }

    public DisableNotificationResponse disableNotificationWithOptions(DisableNotificationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DisableNotificationShrinkRequest request = new DisableNotificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.list)) {
            request.listShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.list, "List", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expiryTime)) {
            body.put("ExpiryTime", request.expiryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listShrink)) {
            body.put("List", request.listShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableNotification"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableNotificationResponse());
    }

    public DisableNotificationResponse disableNotification(DisableNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableNotificationWithOptions(request, runtime);
    }

    public DownloadDeviceResourceResponse downloadDeviceResourceWithOptions(DownloadDeviceResourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DownloadDeviceResourceShrinkRequest request = new DownloadDeviceResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceResourceIds)) {
            request.deviceResourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceResourceIds, "DeviceResourceIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadDeviceResource"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadDeviceResourceResponse());
    }

    public DownloadDeviceResourceResponse downloadDeviceResource(DownloadDeviceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadDeviceResourceWithOptions(request, runtime);
    }

    public EnableNotificationResponse enableNotificationWithOptions(EnableNotificationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnableNotificationShrinkRequest request = new EnableNotificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.list)) {
            request.listShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.list, "List", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listShrink)) {
            body.put("List", request.listShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableNotification"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableNotificationResponse());
    }

    public EnableNotificationResponse enableNotification(EnableNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableNotificationWithOptions(request, runtime);
    }

    public GetAlarmStatusResponse getAlarmStatusWithOptions(GetAlarmStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlarmStatus"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlarmStatusResponse());
    }

    public GetAlarmStatusResponse getAlarmStatus(GetAlarmStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlarmStatusWithOptions(request, runtime);
    }

    public GetConfigurationSpecificationResponse getConfigurationSpecificationWithOptions(GetConfigurationSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigurationSpecification"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigurationSpecificationResponse());
    }

    public GetConfigurationSpecificationResponse getConfigurationSpecification(GetConfigurationSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigurationSpecificationWithOptions(request, runtime);
    }

    public GetConfigurationVariateResponse getConfigurationVariateWithOptions(GetConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigurationVariate"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigurationVariateResponse());
    }

    public GetConfigurationVariateResponse getConfigurationVariate(GetConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigurationVariateWithOptions(request, runtime);
    }

    public GetDedicatedLineResponse getDedicatedLineWithOptions(GetDedicatedLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDedicatedLine"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDedicatedLineResponse());
    }

    public GetDedicatedLineResponse getDedicatedLine(GetDedicatedLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDedicatedLineWithOptions(request, runtime);
    }

    public GetDeviceResponse getDeviceWithOptions(GetDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDevice"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceResponse());
    }

    public GetDeviceResponse getDevice(GetDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceWithOptions(request, runtime);
    }

    public GetDeviceConfigResponse getDeviceConfigWithOptions(GetDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceConfig"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceConfigResponse());
    }

    public GetDeviceConfigResponse getDeviceConfig(GetDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceConfigWithOptions(request, runtime);
    }

    public GetDeviceConfigDateResponse getDeviceConfigDateWithOptions(GetDeviceConfigDateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceConfigDate"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceConfigDateResponse());
    }

    public GetDeviceConfigDateResponse getDeviceConfigDate(GetDeviceConfigDateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceConfigDateWithOptions(request, runtime);
    }

    public GetDeviceConfigDiffResponse getDeviceConfigDiffWithOptions(GetDeviceConfigDiffRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceConfigDiff"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceConfigDiffResponse());
    }

    public GetDeviceConfigDiffResponse getDeviceConfigDiff(GetDeviceConfigDiffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceConfigDiffWithOptions(request, runtime);
    }

    public GetDeviceFormResponse getDeviceFormWithOptions(GetDeviceFormRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceForm"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceFormResponse());
    }

    public GetDeviceFormResponse getDeviceForm(GetDeviceFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceFormWithOptions(request, runtime);
    }

    public GetDeviceOpLogResponse getDeviceOpLogWithOptions(GetDeviceOpLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceOpLog"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceOpLogResponse());
    }

    public GetDeviceOpLogResponse getDeviceOpLog(GetDeviceOpLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceOpLogWithOptions(request, runtime);
    }

    public GetDevicePropertyResponse getDevicePropertyWithOptions(GetDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceProperty"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDevicePropertyResponse());
    }

    public GetDevicePropertyResponse getDeviceProperty(GetDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDevicePropertyWithOptions(request, runtime);
    }

    public GetDeviceResourceResponse getDeviceResourceWithOptions(GetDeviceResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceResource"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceResourceResponse());
    }

    public GetDeviceResourceResponse getDeviceResource(GetDeviceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceResourceWithOptions(request, runtime);
    }

    public GetInspectionTaskResponse getInspectionTaskWithOptions(GetInspectionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInspectionTask"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInspectionTaskResponse());
    }

    public GetInspectionTaskResponse getInspectionTask(GetInspectionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInspectionTaskWithOptions(request, runtime);
    }

    public GetMonitorItemResponse getMonitorItemWithOptions(GetMonitorItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonitorItem"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonitorItemResponse());
    }

    public GetMonitorItemResponse getMonitorItem(GetMonitorItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMonitorItemWithOptions(request, runtime);
    }

    public GetOsDownloadPathResponse getOsDownloadPathWithOptions(GetOsDownloadPathRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOsDownloadPath"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOsDownloadPathResponse());
    }

    public GetOsDownloadPathResponse getOsDownloadPath(GetOsDownloadPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOsDownloadPathWithOptions(request, runtime);
    }

    public GetOsVersionResponse getOsVersionWithOptions(GetOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOsVersion"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOsVersionResponse());
    }

    public GetOsVersionResponse getOsVersion(GetOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOsVersionWithOptions(request, runtime);
    }

    public GetOssPolicyResponse getOssPolicyWithOptions(GetOssPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssPolicy"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssPolicyResponse());
    }

    public GetOssPolicyResponse getOssPolicy(GetOssPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOssPolicyWithOptions(request, runtime);
    }

    public GetPhysicalSpaceResponse getPhysicalSpaceWithOptions(GetPhysicalSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalSpace"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalSpaceResponse());
    }

    public GetPhysicalSpaceResponse getPhysicalSpace(GetPhysicalSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhysicalSpaceWithOptions(request, runtime);
    }

    public GetPhysicalSpaceTopoResponse getPhysicalSpaceTopoWithOptions(GetPhysicalSpaceTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceId)) {
            query.put("PhysicalSpaceId", request.physicalSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topoType)) {
            query.put("TopoType", request.topoType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalSpaceTopo"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalSpaceTopoResponse());
    }

    public GetPhysicalSpaceTopoResponse getPhysicalSpaceTopo(GetPhysicalSpaceTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhysicalSpaceTopoWithOptions(request, runtime);
    }

    public GetRealtimeTaskResponse getRealtimeTaskWithOptions(GetRealtimeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeTask"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeTaskResponse());
    }

    public GetRealtimeTaskResponse getRealtimeTask(GetRealtimeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRealtimeTaskWithOptions(request, runtime);
    }

    public GetScheduleWorkerResponse getScheduleWorkerWithOptions(GetScheduleWorkerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduleWorker"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduleWorkerResponse());
    }

    public GetScheduleWorkerResponse getScheduleWorker(GetScheduleWorkerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScheduleWorkerWithOptions(request, runtime);
    }

    public GetSetupProjectResponse getSetupProjectWithOptions(GetSetupProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSetupProject"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSetupProjectResponse());
    }

    public GetSetupProjectResponse getSetupProject(GetSetupProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSetupProjectWithOptions(request, runtime);
    }

    public GetSpaceModelResponse getSpaceModelWithOptions(GetSpaceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpaceModel"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpaceModelResponse());
    }

    public GetSpaceModelResponse getSpaceModel(GetSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpaceModelWithOptions(request, runtime);
    }

    public GetSpaceModelInstanceResponse getSpaceModelInstanceWithOptions(GetSpaceModelInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpaceModelInstance"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpaceModelInstanceResponse());
    }

    public GetSpaceModelInstanceResponse getSpaceModelInstance(GetSpaceModelInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpaceModelInstanceWithOptions(request, runtime);
    }

    public GetSpaceModelSortResponse getSpaceModelSortWithOptions(GetSpaceModelSortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpaceModelSort"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpaceModelSortResponse());
    }

    public GetSpaceModelSortResponse getSpaceModelSort(GetSpaceModelSortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpaceModelSortWithOptions(request, runtime);
    }

    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    public GetWorkOrderResponse getWorkOrderWithOptions(GetWorkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkOrder"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkOrderResponse());
    }

    public GetWorkOrderResponse getWorkOrder(GetWorkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWorkOrderWithOptions(request, runtime);
    }

    public ListAlarmStatusResponse listAlarmStatusWithOptions(ListAlarmStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmStatus"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmStatusResponse());
    }

    public ListAlarmStatusResponse listAlarmStatus(ListAlarmStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmStatusWithOptions(request, runtime);
    }

    public ListAlarmStatusHistoriesResponse listAlarmStatusHistoriesWithOptions(ListAlarmStatusHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmStatusHistories"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmStatusHistoriesResponse());
    }

    public ListAlarmStatusHistoriesResponse listAlarmStatusHistories(ListAlarmStatusHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmStatusHistoriesWithOptions(request, runtime);
    }

    public ListAlarmStatusStatisticsResponse listAlarmStatusStatisticsWithOptions(ListAlarmStatusStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmStatusStatistics"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmStatusStatisticsResponse());
    }

    public ListAlarmStatusStatisticsResponse listAlarmStatusStatistics(ListAlarmStatusStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmStatusStatisticsWithOptions(request, runtime);
    }

    public ListArchitectureAttributeResponse listArchitectureAttributeWithOptions(ListArchitectureAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArchitectureAttribute"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArchitectureAttributeResponse());
    }

    public ListArchitectureAttributeResponse listArchitectureAttribute(ListArchitectureAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listArchitectureAttributeWithOptions(request, runtime);
    }

    public ListConfigurationSpecificationsResponse listConfigurationSpecificationsWithOptions(ListConfigurationSpecificationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigurationSpecifications"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigurationSpecificationsResponse());
    }

    public ListConfigurationSpecificationsResponse listConfigurationSpecifications(ListConfigurationSpecificationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigurationSpecificationsWithOptions(request, runtime);
    }

    public ListConfigurationVariateResponse listConfigurationVariateWithOptions(ListConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigurationVariate"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigurationVariateResponse());
    }

    public ListConfigurationVariateResponse listConfigurationVariate(ListConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigurationVariateWithOptions(request, runtime);
    }

    public ListConnectionPoliciesResponse listConnectionPoliciesWithOptions(ListConnectionPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architectureIterationId)) {
            body.put("ArchitectureIterationId", request.architectureIterationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPolicyId)) {
            body.put("ConnectionPolicyId", request.connectionPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downlinkArchitectureDeviceId)) {
            body.put("DownlinkArchitectureDeviceId", request.downlinkArchitectureDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downlinkArchitectureModuleId)) {
            body.put("DownlinkArchitectureModuleId", request.downlinkArchitectureModuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uplinkArchitectureDeviceId)) {
            body.put("UplinkArchitectureDeviceId", request.uplinkArchitectureDeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uplinkArchitectureModuleId)) {
            body.put("UplinkArchitectureModuleId", request.uplinkArchitectureModuleId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnectionPolicies"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionPoliciesResponse());
    }

    public ListConnectionPoliciesResponse listConnectionPolicies(ListConnectionPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectionPoliciesWithOptions(request, runtime);
    }

    public ListDedicatedLinesResponse listDedicatedLinesWithOptions(ListDedicatedLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDedicatedLines"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDedicatedLinesResponse());
    }

    public ListDedicatedLinesResponse listDedicatedLines(ListDedicatedLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDedicatedLinesWithOptions(request, runtime);
    }

    public ListDeviceFormsResponse listDeviceFormsWithOptions(ListDeviceFormsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceForms"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceFormsResponse());
    }

    public ListDeviceFormsResponse listDeviceForms(ListDeviceFormsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceFormsWithOptions(request, runtime);
    }

    public ListDevicePropertiesResponse listDevicePropertiesWithOptions(ListDevicePropertiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceProperties"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDevicePropertiesResponse());
    }

    public ListDevicePropertiesResponse listDeviceProperties(ListDevicePropertiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevicePropertiesWithOptions(request, runtime);
    }

    public ListDeviceResourcesResponse listDeviceResourcesWithOptions(ListDeviceResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceResources"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceResourcesResponse());
    }

    public ListDeviceResourcesResponse listDeviceResources(ListDeviceResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceResourcesWithOptions(request, runtime);
    }

    public ListDeviceValuesResponse listDeviceValuesWithOptions(ListDeviceValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceValues"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceValuesResponse());
    }

    public ListDeviceValuesResponse listDeviceValues(ListDeviceValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceValuesWithOptions(request, runtime);
    }

    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDevicesShrinkRequest request = new ListDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceIds)) {
            request.deviceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceIds, "DeviceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hostName)) {
            request.hostNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hostName, "HostName", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ip)) {
            request.ipShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ip, "Ip", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mac)) {
            request.macShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mac, "Mac", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.model)) {
            request.modelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.model, "Model", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.physicalSpaceIds)) {
            request.physicalSpaceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.physicalSpaceIds, "PhysicalSpaceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.securityDomain)) {
            request.securityDomainShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.securityDomain, "SecurityDomain", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceStatus)) {
            request.serviceStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceStatus, "ServiceStatus", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sn)) {
            request.snShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sn, "Sn", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vendor)) {
            request.vendorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vendor, "Vendor", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceFormId)) {
            query.put("DeviceFormId", request.deviceFormId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFormName)) {
            query.put("DeviceFormName", request.deviceFormName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdsShrink)) {
            query.put("DeviceIds", request.deviceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extAttributes)) {
            query.put("ExtAttributes", request.extAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostNameShrink)) {
            query.put("HostName", request.hostNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipShrink)) {
            query.put("Ip", request.ipShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.macShrink)) {
            query.put("Mac", request.macShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelShrink)) {
            query.put("Model", request.modelShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceId)) {
            query.put("PhysicalSpaceId", request.physicalSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceIdsShrink)) {
            query.put("PhysicalSpaceIds", request.physicalSpaceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityDomainShrink)) {
            query.put("SecurityDomain", request.securityDomainShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatusShrink)) {
            query.put("ServiceStatus", request.serviceStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snShrink)) {
            query.put("Sn", request.snShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorShrink)) {
            query.put("Vendor", request.vendorShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDevices"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDevicesResponse());
    }

    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    public ListEventDefinitionsResponse listEventDefinitionsWithOptions(ListEventDefinitionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEventDefinitions"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventDefinitionsResponse());
    }

    public ListEventDefinitionsResponse listEventDefinitions(ListEventDefinitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEventDefinitionsWithOptions(request, runtime);
    }

    public ListEventsResponse listEventsWithOptions(ListEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEvents"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventsResponse());
    }

    public ListEventsResponse listEvents(ListEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEventsWithOptions(request, runtime);
    }

    public ListInspectionDevicesResponse listInspectionDevicesWithOptions(ListInspectionDevicesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInspectionDevicesShrinkRequest request = new ListInspectionDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.model)) {
            request.modelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.model, "Model", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInspectionDevices"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInspectionDevicesResponse());
    }

    public ListInspectionDevicesResponse listInspectionDevices(ListInspectionDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInspectionDevicesWithOptions(request, runtime);
    }

    public ListInspectionTaskReportsResponse listInspectionTaskReportsWithOptions(ListInspectionTaskReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInspectionTaskReports"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInspectionTaskReportsResponse());
    }

    public ListInspectionTaskReportsResponse listInspectionTaskReports(ListInspectionTaskReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInspectionTaskReportsWithOptions(request, runtime);
    }

    public ListInspectionTasksResponse listInspectionTasksWithOptions(ListInspectionTasksRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInspectionTasksShrinkRequest request = new ListInspectionTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alarmStatus)) {
            request.alarmStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alarmStatus, "AlarmStatus", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInspectionTasks"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInspectionTasksResponse());
    }

    public ListInspectionTasksResponse listInspectionTasks(ListInspectionTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInspectionTasksWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(runtime);
    }

    public ListIpBlocksResponse listIpBlocksWithOptions(ListIpBlocksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIpBlocks"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIpBlocksResponse());
    }

    public ListIpBlocksResponse listIpBlocks(ListIpBlocksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpBlocksWithOptions(request, runtime);
    }

    public ListLinksResponse listLinksWithOptions(ListLinksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLinks"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLinksResponse());
    }

    public ListLinksResponse listLinks(ListLinksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLinksWithOptions(request, runtime);
    }

    public ListLogsResponse listLogsWithOptions(ListLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogs"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogsResponse());
    }

    public ListLogsResponse listLogs(ListLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLogsWithOptions(request, runtime);
    }

    public ListMonitorDataResponse listMonitorDataWithOptions(ListMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMonitorData"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMonitorDataResponse());
    }

    public ListMonitorDataResponse listMonitorData(ListMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMonitorDataWithOptions(request, runtime);
    }

    public ListNotificationHistoriesResponse listNotificationHistoriesWithOptions(ListNotificationHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNotificationHistories"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNotificationHistoriesResponse());
    }

    public ListNotificationHistoriesResponse listNotificationHistories(ListNotificationHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNotificationHistoriesWithOptions(request, runtime);
    }

    public ListOsVersionsResponse listOsVersionsWithOptions(ListOsVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOsVersions"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOsVersionsResponse());
    }

    public ListOsVersionsResponse listOsVersions(ListOsVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOsVersionsWithOptions(request, runtime);
    }

    public ListPhysicalSpacesResponse listPhysicalSpacesWithOptions(ListPhysicalSpacesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPhysicalSpacesShrinkRequest request = new ListPhysicalSpacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.physicalSpaceIds)) {
            request.physicalSpaceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.physicalSpaceIds, "PhysicalSpaceIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPhysicalSpaces"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPhysicalSpacesResponse());
    }

    public ListPhysicalSpacesResponse listPhysicalSpaces(ListPhysicalSpacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhysicalSpacesWithOptions(request, runtime);
    }

    public ListRegionsResponse listRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    public ListRegionsResponse listRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    public ListResourceInformationsResponse listResourceInformationsWithOptions(ListResourceInformationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceInformations"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceInformationsResponse());
    }

    public ListResourceInformationsResponse listResourceInformations(ListResourceInformationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceInformationsWithOptions(request, runtime);
    }

    public ListResourceInstancesResponse listResourceInstancesWithOptions(ListResourceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceInstances"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceInstancesResponse());
    }

    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceInstancesWithOptions(request, runtime);
    }

    public ListResourceTypesResponse listResourceTypesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceTypes"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceTypesResponse());
    }

    public ListResourceTypesResponse listResourceTypes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceTypesWithOptions(runtime);
    }

    public ListSetupProjectsResponse listSetupProjectsWithOptions(ListSetupProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSetupProjects"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSetupProjectsResponse());
    }

    public ListSetupProjectsResponse listSetupProjects(ListSetupProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSetupProjectsWithOptions(request, runtime);
    }

    public ListSpaceModelsResponse listSpaceModelsWithOptions(ListSpaceModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSpaceModels"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSpaceModelsResponse());
    }

    public ListSpaceModelsResponse listSpaceModels(ListSpaceModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSpaceModelsWithOptions(request, runtime);
    }

    public ListTasksHistoriesResponse listTasksHistoriesWithOptions(ListTasksHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasksHistories"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksHistoriesResponse());
    }

    public ListTasksHistoriesResponse listTasksHistories(ListTasksHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTasksHistoriesWithOptions(request, runtime);
    }

    public ListTreePhysicalSpacesResponse listTreePhysicalSpacesWithOptions(ListTreePhysicalSpacesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTreePhysicalSpacesShrinkRequest request = new ListTreePhysicalSpacesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.physicalSpaceIds)) {
            request.physicalSpaceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.physicalSpaceIds, "PhysicalSpaceIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTreePhysicalSpaces"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTreePhysicalSpacesResponse());
    }

    public ListTreePhysicalSpacesResponse listTreePhysicalSpaces(ListTreePhysicalSpacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTreePhysicalSpacesWithOptions(request, runtime);
    }

    public ListWorkOrdersResponse listWorkOrdersWithOptions(ListWorkOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnA)) {
            body.put("DeviceSnA", request.deviceSnA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderSource)) {
            body.put("WorkOrderSource", request.workOrderSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderStep)) {
            body.put("WorkOrderStep", request.workOrderStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderTitle)) {
            body.put("WorkOrderTitle", request.workOrderTitle);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkOrders"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkOrdersResponse());
    }

    public ListWorkOrdersResponse listWorkOrders(ListWorkOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWorkOrdersWithOptions(request, runtime);
    }

    public LockSpaceModelResponse lockSpaceModelWithOptions(LockSpaceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceModelId)) {
            query.put("SpaceModelId", request.spaceModelId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockSpaceModel"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockSpaceModelResponse());
    }

    public LockSpaceModelResponse lockSpaceModel(LockSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockSpaceModelWithOptions(request, runtime);
    }

    public ReleaseIPResponse releaseIPWithOptions(ReleaseIPRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReleaseIPShrinkRequest request = new ReleaseIPShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceResourceIds)) {
            request.deviceResourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceResourceIds, "DeviceResourceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceResourceId)) {
            query.put("DeviceResourceId", request.deviceResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResourceIdsShrink)) {
            query.put("DeviceResourceIds", request.deviceResourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipType)) {
            query.put("IpType", request.ipType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setupProjectId)) {
            query.put("SetupProjectId", request.setupProjectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseIP"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseIPResponse());
    }

    public ReleaseIPResponse releaseIP(ReleaseIPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseIPWithOptions(request, runtime);
    }

    public RemarkWorkOrderResponse remarkWorkOrderWithOptions(RemarkWorkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderId)) {
            body.put("WorkOrderId", request.workOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemarkWorkOrder"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemarkWorkOrderResponse());
    }

    public RemarkWorkOrderResponse remarkWorkOrder(RemarkWorkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.remarkWorkOrderWithOptions(request, runtime);
    }

    public RetryTasksResponse retryTasksWithOptions(RetryTasksRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetryTasksShrinkRequest request = new RetryTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retryTasks)) {
            request.retryTasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retryTasks, "RetryTasks", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryTasks"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryTasksResponse());
    }

    public RetryTasksResponse retryTasks(RetryTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryTasksWithOptions(request, runtime);
    }

    public UpdateConfigurationSpecificationResponse updateConfigurationSpecificationWithOptions(UpdateConfigurationSpecificationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConfigurationSpecificationShrinkRequest request = new UpdateConfigurationSpecificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedVariate)) {
            request.relatedVariateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedVariate, "RelatedVariate", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architecture)) {
            body.put("Architecture", request.architecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationSpecificationId)) {
            body.put("ConfigurationSpecificationId", request.configurationSpecificationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedVariateShrink)) {
            body.put("RelatedVariate", request.relatedVariateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificationContent)) {
            body.put("SpecificationContent", request.specificationContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specificationName)) {
            body.put("SpecificationName", request.specificationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfigurationSpecification"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigurationSpecificationResponse());
    }

    public UpdateConfigurationSpecificationResponse updateConfigurationSpecification(UpdateConfigurationSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigurationSpecificationWithOptions(request, runtime);
    }

    public UpdateConfigurationVariateResponse updateConfigurationVariateWithOptions(UpdateConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationVariateId)) {
            body.put("ConfigurationVariateId", request.configurationVariateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formatFunction)) {
            body.put("FormatFunction", request.formatFunction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variateName)) {
            body.put("VariateName", request.variateName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfigurationVariate"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigurationVariateResponse());
    }

    public UpdateConfigurationVariateResponse updateConfigurationVariate(UpdateConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigurationVariateWithOptions(request, runtime);
    }

    public UpdateDedicatedLineResponse updateDedicatedLineWithOptions(UpdateDedicatedLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            body.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contact)) {
            body.put("Contact", request.contact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedLineGateway)) {
            body.put("DedicatedLineGateway", request.dedicatedLineGateway);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedLineId)) {
            body.put("DedicatedLineId", request.dedicatedLineId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedLineIp)) {
            body.put("DedicatedLineIp", request.dedicatedLineIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedLineRole)) {
            body.put("DedicatedLineRole", request.dedicatedLineRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicePort)) {
            body.put("DevicePort", request.devicePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            body.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDedicatedLine"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDedicatedLineResponse());
    }

    public UpdateDedicatedLineResponse updateDedicatedLine(UpdateDedicatedLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDedicatedLineWithOptions(request, runtime);
    }

    public UpdateDeviceResponse updateDeviceWithOptions(UpdateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            body.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePassword)) {
            body.put("EnablePassword", request.enablePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extAttributes)) {
            body.put("ExtAttributes", request.extAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            body.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("LoginPassword", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginType)) {
            body.put("LoginType", request.loginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginUsername)) {
            body.put("LoginUsername", request.loginUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mac)) {
            body.put("Mac", request.mac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceId)) {
            body.put("PhysicalSpaceId", request.physicalSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityDomain)) {
            body.put("SecurityDomain", request.securityDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatus)) {
            body.put("ServiceStatus", request.serviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sn)) {
            body.put("Sn", request.sn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAccountType)) {
            body.put("SnmpAccountType", request.snmpAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAccountVersion)) {
            body.put("SnmpAccountVersion", request.snmpAccountVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAuthPassphrase)) {
            body.put("SnmpAuthPassphrase", request.snmpAuthPassphrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAuthProtocol)) {
            body.put("SnmpAuthProtocol", request.snmpAuthProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpCommunity)) {
            body.put("SnmpCommunity", request.snmpCommunity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpPrivacyPassphrase)) {
            body.put("SnmpPrivacyPassphrase", request.snmpPrivacyPassphrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpPrivacyProtocol)) {
            body.put("SnmpPrivacyProtocol", request.snmpPrivacyProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpSecurityLevel)) {
            body.put("SnmpSecurityLevel", request.snmpSecurityLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpUsername)) {
            body.put("SnmpUsername", request.snmpUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDevice"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceResponse());
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceWithOptions(request, runtime);
    }

    public UpdateDeviceFormResponse updateDeviceFormWithOptions(UpdateDeviceFormRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDeviceFormShrinkRequest request = new UpdateDeviceFormShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributeList)) {
            request.attributeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributeList, "AttributeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountConfig)) {
            body.put("AccountConfig", request.accountConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeListShrink)) {
            body.put("AttributeList", request.attributeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configCompare)) {
            body.put("ConfigCompare", request.configCompare);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailDisplay)) {
            body.put("DetailDisplay", request.detailDisplay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceFormId)) {
            body.put("DeviceFormId", request.deviceFormId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedDeviceFormId)) {
            body.put("RelatedDeviceFormId", request.relatedDeviceFormId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.script)) {
            body.put("Script", request.script);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceForm"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceFormResponse());
    }

    public UpdateDeviceFormResponse updateDeviceForm(UpdateDeviceFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceFormWithOptions(request, runtime);
    }

    public UpdateDevicePropertyResponse updateDevicePropertyWithOptions(UpdateDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.devicePropertyId)) {
            body.put("DevicePropertyId", request.devicePropertyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyContent)) {
            body.put("PropertyContent", request.propertyContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyFormat)) {
            body.put("PropertyFormat", request.propertyFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyName)) {
            body.put("PropertyName", request.propertyName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceProperty"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDevicePropertyResponse());
    }

    public UpdateDevicePropertyResponse updateDeviceProperty(UpdateDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDevicePropertyWithOptions(request, runtime);
    }

    public UpdateDeviceResourceResponse updateDeviceResourceWithOptions(UpdateDeviceResourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDeviceResourceShrinkRequest request = new UpdateDeviceResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceResourceIds)) {
            request.deviceResourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceResourceIds, "DeviceResourceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResourceId)) {
            body.put("DeviceResourceId", request.deviceResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceResourceIdsShrink)) {
            body.put("DeviceResourceIds", request.deviceResourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setupProjectId)) {
            body.put("SetupProjectId", request.setupProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateType)) {
            body.put("UpdateType", request.updateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceResource"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceResourceResponse());
    }

    public UpdateDeviceResourceResponse updateDeviceResource(UpdateDeviceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceResourceWithOptions(request, runtime);
    }

    public UpdateDevicesResponse updateDevicesWithOptions(UpdateDevicesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDevicesShrinkRequest request = new UpdateDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceIds)) {
            request.deviceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceIds, "DeviceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceIdsShrink)) {
            body.put("DeviceIds", request.deviceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePassword)) {
            body.put("EnablePassword", request.enablePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPassword)) {
            body.put("LoginPassword", request.loginPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginType)) {
            body.put("LoginType", request.loginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginUsername)) {
            body.put("LoginUsername", request.loginUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceId)) {
            body.put("PhysicalSpaceId", request.physicalSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceName)) {
            body.put("PhysicalSpaceName", request.physicalSpaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceStatus)) {
            body.put("ServiceStatus", request.serviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAccountType)) {
            body.put("SnmpAccountType", request.snmpAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAccountVersion)) {
            body.put("SnmpAccountVersion", request.snmpAccountVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAuthPassphrase)) {
            body.put("SnmpAuthPassphrase", request.snmpAuthPassphrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpAuthProtocol)) {
            body.put("SnmpAuthProtocol", request.snmpAuthProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpCommunity)) {
            body.put("SnmpCommunity", request.snmpCommunity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpPrivacyPassphrase)) {
            body.put("SnmpPrivacyPassphrase", request.snmpPrivacyPassphrase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpPrivacyProtocol)) {
            body.put("SnmpPrivacyProtocol", request.snmpPrivacyProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpSecurityLevel)) {
            body.put("SnmpSecurityLevel", request.snmpSecurityLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snmpUsername)) {
            body.put("SnmpUsername", request.snmpUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDevices"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDevicesResponse());
    }

    public UpdateDevicesResponse updateDevices(UpdateDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDevicesWithOptions(request, runtime);
    }

    public UpdateEventDefinitionResponse updateEventDefinitionWithOptions(UpdateEventDefinitionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            body.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            body.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            body.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventDefinition"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventDefinitionResponse());
    }

    public UpdateEventDefinitionResponse updateEventDefinition(UpdateEventDefinitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEventDefinitionWithOptions(request, runtime);
    }

    public UpdateInformationKeyActionResponse updateInformationKeyActionWithOptions(UpdateInformationKeyActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyAction)) {
            query.put("KeyAction", request.keyAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInformationId)) {
            query.put("ResourceInformationId", request.resourceInformationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setupProjectId)) {
            query.put("SetupProjectId", request.setupProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInformationKeyAction"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInformationKeyActionResponse());
    }

    public UpdateInformationKeyActionResponse updateInformationKeyAction(UpdateInformationKeyActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInformationKeyActionWithOptions(request, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    public UpdateOsVersionResponse updateOsVersionWithOptions(UpdateOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osVersion)) {
            body.put("OsVersion", request.osVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osVersionId)) {
            body.put("OsVersionId", request.osVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            body.put("Vendor", request.vendor);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOsVersion"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOsVersionResponse());
    }

    public UpdateOsVersionResponse updateOsVersion(UpdateOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOsVersionWithOptions(request, runtime);
    }

    public UpdatePhysicalSpaceResponse updatePhysicalSpaceWithOptions(UpdatePhysicalSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            body.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUid)) {
            body.put("ParentUid", request.parentUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceId)) {
            body.put("PhysicalSpaceId", request.physicalSpaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.physicalSpaceName)) {
            body.put("PhysicalSpaceName", request.physicalSpaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            body.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceAbbreviation)) {
            body.put("SpaceAbbreviation", request.spaceAbbreviation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            body.put("SpaceType", request.spaceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePhysicalSpace"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePhysicalSpaceResponse());
    }

    public UpdatePhysicalSpaceResponse updatePhysicalSpace(UpdatePhysicalSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePhysicalSpaceWithOptions(request, runtime);
    }

    public UpdateProjectProgressResponse updateProjectProgressWithOptions(UpdateProjectProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.progress)) {
            body.put("Progress", request.progress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setupProjectId)) {
            body.put("SetupProjectId", request.setupProjectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectProgress"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectProgressResponse());
    }

    public UpdateProjectProgressResponse updateProjectProgress(UpdateProjectProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProjectProgressWithOptions(request, runtime);
    }

    public UpdateResourceInformationResponse updateResourceInformationWithOptions(UpdateResourceInformationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateResourceInformationShrinkRequest request = new UpdateResourceInformationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.information)) {
            request.informationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.information, "Information", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.informationShrink)) {
            body.put("Information", request.informationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAttribute)) {
            body.put("ResourceAttribute", request.resourceAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInformationId)) {
            body.put("ResourceInformationId", request.resourceInformationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceInformation"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceInformationResponse());
    }

    public UpdateResourceInformationResponse updateResourceInformation(UpdateResourceInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceInformationWithOptions(request, runtime);
    }

    public UpdateResourceInstanceResponse updateResourceInstanceWithOptions(UpdateResourceInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateResourceInstanceShrinkRequest request = new UpdateResourceInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceInformation)) {
            request.resourceInformationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceInformation, "ResourceInformation", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInformationShrink)) {
            query.put("ResourceInformation", request.resourceInformationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInformationId)) {
            query.put("ResourceInformationId", request.resourceInformationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setupProjectId)) {
            query.put("SetupProjectId", request.setupProjectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceInstance"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceInstanceResponse());
    }

    public UpdateResourceInstanceResponse updateResourceInstance(UpdateResourceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceInstanceWithOptions(request, runtime);
    }

    public UpdateSetupProjectResponse updateSetupProjectWithOptions(UpdateSetupProjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSetupProjectShrinkRequest request = new UpdateSetupProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packages)) {
            request.packagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packages, "Packages", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.architectureId)) {
            body.put("ArchitectureId", request.architectureId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryTime)) {
            body.put("DeliveryTime", request.deliveryTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            body.put("Nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packagesShrink)) {
            body.put("Packages", request.packagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setupProjectId)) {
            body.put("SetupProjectId", request.setupProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            body.put("SpaceId", request.spaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSetupProject"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSetupProjectResponse());
    }

    public UpdateSetupProjectResponse updateSetupProject(UpdateSetupProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSetupProjectWithOptions(request, runtime);
    }

    public UpdateSpaceModelResponse updateSpaceModelWithOptions(UpdateSpaceModelRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSpaceModelShrinkRequest request = new UpdateSpaceModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortShrink)) {
            body.put("Sort", request.sortShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceModelId)) {
            body.put("SpaceModelId", request.spaceModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceType)) {
            body.put("SpaceType", request.spaceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSpaceModel"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSpaceModelResponse());
    }

    public UpdateSpaceModelResponse updateSpaceModel(UpdateSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpaceModelWithOptions(request, runtime);
    }

    public UpdateSpaceModelInstanceResponse updateSpaceModelInstanceWithOptions(UpdateSpaceModelInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("Instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            query.put("SpaceId", request.spaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSpaceModelInstance"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSpaceModelInstanceResponse());
    }

    public UpdateSpaceModelInstanceResponse updateSpaceModelInstance(UpdateSpaceModelInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpaceModelInstanceWithOptions(request, runtime);
    }

    public UpdateWorkOrderResponse updateWorkOrderWithOptions(UpdateWorkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmHappenTime)) {
            body.put("AlarmHappenTime", request.alarmHappenTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmRecoverTime)) {
            body.put("AlarmRecoverTime", request.alarmRecoverTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmRelated)) {
            body.put("AlarmRelated", request.alarmRelated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.area)) {
            body.put("Area", request.area);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.circuitId)) {
            body.put("CircuitId", request.circuitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.circuitName)) {
            body.put("CircuitName", request.circuitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.circuitType)) {
            body.put("CircuitType", request.circuitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIp)) {
            body.put("DeviceIp", request.deviceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIpA)) {
            body.put("DeviceIpA", request.deviceIpA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceIpB)) {
            body.put("DeviceIpB", request.deviceIpB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModelA)) {
            body.put("DeviceModelA", request.deviceModelA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModelB)) {
            body.put("DeviceModelB", request.deviceModelB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceNameA)) {
            body.put("DeviceNameA", request.deviceNameA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceNameB)) {
            body.put("DeviceNameB", request.deviceNameB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicePortA)) {
            body.put("DevicePortA", request.devicePortA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devicePortB)) {
            body.put("DevicePortB", request.devicePortB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnA)) {
            body.put("DeviceSnA", request.deviceSnA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceSnB)) {
            body.put("DeviceSnB", request.deviceSnB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceVendor)) {
            body.put("DeviceVendor", request.deviceVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceVendorA)) {
            body.put("DeviceVendorA", request.deviceVendorA);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceVendorB)) {
            body.put("DeviceVendorB", request.deviceVendorB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emergencyDegree)) {
            body.put("EmergencyDegree", request.emergencyDegree);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("Extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hangFileName)) {
            body.put("HangFileName", request.hangFileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hangFilePath)) {
            body.put("HangFilePath", request.hangFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hangReason)) {
            body.put("HangReason", request.hangReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.impactBusiness)) {
            body.put("ImpactBusiness", request.impactBusiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentDescription)) {
            body.put("IncidentDescription", request.incidentDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentSubType)) {
            body.put("IncidentSubType", request.incidentSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidentType)) {
            body.put("IncidentType", request.incidentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liableMan)) {
            body.put("LiableMan", request.liableMan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.linkMan)) {
            body.put("LinkMan", request.linkMan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalSubjectAlarm)) {
            body.put("OriginalSubjectAlarm", request.originalSubjectAlarm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processLimited)) {
            body.put("ProcessLimited", request.processLimited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processMan)) {
            body.put("ProcessMan", request.processMan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processManId)) {
            body.put("ProcessManId", request.processManId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processResult)) {
            body.put("ProcessResult", request.processResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillGroups)) {
            body.put("SkillGroups", request.skillGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderId)) {
            body.put("WorkOrderId", request.workOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderSource)) {
            body.put("WorkOrderSource", request.workOrderSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderStep)) {
            body.put("WorkOrderStep", request.workOrderStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderTitle)) {
            body.put("WorkOrderTitle", request.workOrderTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workOrderType)) {
            body.put("WorkOrderType", request.workOrderType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkOrder"),
            new TeaPair("version", "2020-08-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkOrderResponse());
    }

    public UpdateWorkOrderResponse updateWorkOrder(UpdateWorkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateWorkOrderWithOptions(request, runtime);
    }
}

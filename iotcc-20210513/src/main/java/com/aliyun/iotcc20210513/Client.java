// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513;

import com.aliyun.tea.*;
import com.aliyun.iotcc20210513.models.*;
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
        this._endpoint = this.getEndpoint("iotcc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddCidrToConnectionPoolResponse addCidrToConnectionPoolWithOptions(AddCidrToConnectionPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Cidrs", request.cidrs);
        query.put("ClientToken", request.clientToken);
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCidrToConnectionPool"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCidrToConnectionPoolResponse());
    }

    public AddCidrToConnectionPoolResponse addCidrToConnectionPool(AddCidrToConnectionPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCidrToConnectionPoolWithOptions(request, runtime);
    }

    public AddIoTCloudConnectorToGroupResponse addIoTCloudConnectorToGroupWithOptions(AddIoTCloudConnectorToGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddIoTCloudConnectorToGroup"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddIoTCloudConnectorToGroupResponse());
    }

    public AddIoTCloudConnectorToGroupResponse addIoTCloudConnectorToGroup(AddIoTCloudConnectorToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIoTCloudConnectorToGroupWithOptions(request, runtime);
    }

    public AssociateIpWithConnectionPoolResponse associateIpWithConnectionPoolWithOptions(AssociateIpWithConnectionPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("Ips", request.ips);
        query.put("IpsFilePath", request.ipsFilePath);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateIpWithConnectionPool"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateIpWithConnectionPoolResponse());
    }

    public AssociateIpWithConnectionPoolResponse associateIpWithConnectionPool(AssociateIpWithConnectionPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateIpWithConnectionPoolWithOptions(request, runtime);
    }

    public AssociateVSwitchWithIoTCloudConnectorResponse associateVSwitchWithIoTCloudConnectorWithOptions(AssociateVSwitchWithIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        query.put("VSwitchList", request.vSwitchList);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateVSwitchWithIoTCloudConnector"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateVSwitchWithIoTCloudConnectorResponse());
    }

    public AssociateVSwitchWithIoTCloudConnectorResponse associateVSwitchWithIoTCloudConnector(AssociateVSwitchWithIoTCloudConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateVSwitchWithIoTCloudConnectorWithOptions(request, runtime);
    }

    public CreateAuthorizationRuleResponse createAuthorizationRuleWithOptions(CreateAuthorizationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizationRuleDescription", request.authorizationRuleDescription);
        query.put("AuthorizationRuleName", request.authorizationRuleName);
        query.put("ClientToken", request.clientToken);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("Policy", request.policy);
        query.put("RegionId", request.regionId);
        query.put("SourceCidrs", request.sourceCidrs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthorizationRule"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthorizationRuleResponse());
    }

    public CreateAuthorizationRuleResponse createAuthorizationRule(CreateAuthorizationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAuthorizationRuleWithOptions(request, runtime);
    }

    public CreateConnectionPoolResponse createConnectionPoolWithOptions(CreateConnectionPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Cidrs", request.cidrs);
        query.put("ClientToken", request.clientToken);
        query.put("ConnectionPoolDescription", request.connectionPoolDescription);
        query.put("ConnectionPoolName", request.connectionPoolName);
        query.put("Count", request.count);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConnectionPool"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConnectionPoolResponse());
    }

    public CreateConnectionPoolResponse createConnectionPool(CreateConnectionPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConnectionPoolWithOptions(request, runtime);
    }

    public CreateGroupAuthorizationRuleResponse createGroupAuthorizationRuleWithOptions(CreateGroupAuthorizationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizationRuleDescription", request.authorizationRuleDescription);
        query.put("AuthorizationRuleName", request.authorizationRuleName);
        query.put("ClientToken", request.clientToken);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        query.put("Policy", request.policy);
        query.put("RegionId", request.regionId);
        query.put("SourceCidrs", request.sourceCidrs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupAuthorizationRule"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupAuthorizationRuleResponse());
    }

    public CreateGroupAuthorizationRuleResponse createGroupAuthorizationRule(CreateGroupAuthorizationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupAuthorizationRuleWithOptions(request, runtime);
    }

    public CreateIoTCloudConnectorResponse createIoTCloudConnectorWithOptions(CreateIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("APN", request.APN);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("ISP", request.ISP);
        query.put("IoTCloudConnectorDescription", request.ioTCloudConnectorDescription);
        query.put("IoTCloudConnectorName", request.ioTCloudConnectorName);
        query.put("RegionId", request.regionId);
        query.put("ResourceUid", request.resourceUid);
        query.put("WildcardDomainEnabled", request.wildcardDomainEnabled);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIoTCloudConnector"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIoTCloudConnectorResponse());
    }

    public CreateIoTCloudConnectorResponse createIoTCloudConnector(CreateIoTCloudConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIoTCloudConnectorWithOptions(request, runtime);
    }

    public CreateIoTCloudConnectorGroupResponse createIoTCloudConnectorGroupWithOptions(CreateIoTCloudConnectorGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("DryRun", request.dryRun);
        query.put("Name", request.name);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIoTCloudConnectorGroup"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIoTCloudConnectorGroupResponse());
    }

    public CreateIoTCloudConnectorGroupResponse createIoTCloudConnectorGroup(CreateIoTCloudConnectorGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIoTCloudConnectorGroupWithOptions(request, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        query.put("ServiceDescription", request.serviceDescription);
        query.put("ServiceName", request.serviceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateService"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceResponse());
    }

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceWithOptions(request, runtime);
    }

    public CreateServiceEntryResponse createServiceEntryWithOptions(CreateServiceEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        query.put("ServiceEntryDescription", request.serviceEntryDescription);
        query.put("ServiceEntryName", request.serviceEntryName);
        query.put("ServiceId", request.serviceId);
        query.put("Target", request.target);
        query.put("TargetType", request.targetType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceEntry"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceEntryResponse());
    }

    public CreateServiceEntryResponse createServiceEntry(CreateServiceEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceEntryWithOptions(request, runtime);
    }

    public DeleteAuthorizationRuleResponse deleteAuthorizationRuleWithOptions(DeleteAuthorizationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizationRuleId", request.authorizationRuleId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthorizationRule"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthorizationRuleResponse());
    }

    public DeleteAuthorizationRuleResponse deleteAuthorizationRule(DeleteAuthorizationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAuthorizationRuleWithOptions(request, runtime);
    }

    public DeleteConnectionPoolResponse deleteConnectionPoolWithOptions(DeleteConnectionPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConnectionPool"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConnectionPoolResponse());
    }

    public DeleteConnectionPoolResponse deleteConnectionPool(DeleteConnectionPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConnectionPoolWithOptions(request, runtime);
    }

    public DeleteGroupAuthorizationRuleResponse deleteGroupAuthorizationRuleWithOptions(DeleteGroupAuthorizationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizationRuleId", request.authorizationRuleId);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroupAuthorizationRule"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupAuthorizationRuleResponse());
    }

    public DeleteGroupAuthorizationRuleResponse deleteGroupAuthorizationRule(DeleteGroupAuthorizationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupAuthorizationRuleWithOptions(request, runtime);
    }

    public DeleteIoTCloudConnectorResponse deleteIoTCloudConnectorWithOptions(DeleteIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIoTCloudConnector"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIoTCloudConnectorResponse());
    }

    public DeleteIoTCloudConnectorResponse deleteIoTCloudConnector(DeleteIoTCloudConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIoTCloudConnectorWithOptions(request, runtime);
    }

    public DeleteIoTCloudConnectorGroupResponse deleteIoTCloudConnectorGroupWithOptions(DeleteIoTCloudConnectorGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIoTCloudConnectorGroup"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIoTCloudConnectorGroupResponse());
    }

    public DeleteIoTCloudConnectorGroupResponse deleteIoTCloudConnectorGroup(DeleteIoTCloudConnectorGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIoTCloudConnectorGroupWithOptions(request, runtime);
    }

    public DeleteServiceResponse deleteServiceWithOptions(DeleteServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        query.put("ServiceId", request.serviceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteService"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceResponse deleteService(DeleteServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceWithOptions(request, runtime);
    }

    public DeleteServiceEntryResponse deleteServiceEntryWithOptions(DeleteServiceEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        query.put("ServiceEntryId", request.serviceEntryId);
        query.put("ServiceId", request.serviceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceEntry"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceEntryResponse());
    }

    public DeleteServiceEntryResponse deleteServiceEntry(DeleteServiceEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceEntryWithOptions(request, runtime);
    }

    public DisableIoTCloudConnectorAccessLogResponse disableIoTCloudConnectorAccessLogWithOptions(DisableIoTCloudConnectorAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableIoTCloudConnectorAccessLog"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableIoTCloudConnectorAccessLogResponse());
    }

    public DisableIoTCloudConnectorAccessLogResponse disableIoTCloudConnectorAccessLog(DisableIoTCloudConnectorAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableIoTCloudConnectorAccessLogWithOptions(request, runtime);
    }

    public DissociateIpFromConnectionPoolResponse dissociateIpFromConnectionPoolWithOptions(DissociateIpFromConnectionPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("Ips", request.ips);
        query.put("IpsFilePath", request.ipsFilePath);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateIpFromConnectionPool"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateIpFromConnectionPoolResponse());
    }

    public DissociateIpFromConnectionPoolResponse dissociateIpFromConnectionPool(DissociateIpFromConnectionPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateIpFromConnectionPoolWithOptions(request, runtime);
    }

    public DissociateVSwitchFromIoTCloudConnectorResponse dissociateVSwitchFromIoTCloudConnectorWithOptions(DissociateVSwitchFromIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DissociateVSwitchFromIoTCloudConnector"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DissociateVSwitchFromIoTCloudConnectorResponse());
    }

    public DissociateVSwitchFromIoTCloudConnectorResponse dissociateVSwitchFromIoTCloudConnector(DissociateVSwitchFromIoTCloudConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateVSwitchFromIoTCloudConnectorWithOptions(request, runtime);
    }

    public EnableIoTCloudConnectorAccessLogResponse enableIoTCloudConnectorAccessLogWithOptions(EnableIoTCloudConnectorAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessLogSlsLogStore", request.accessLogSlsLogStore);
        query.put("AccessLogSlsProject", request.accessLogSlsProject);
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableIoTCloudConnectorAccessLog"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableIoTCloudConnectorAccessLogResponse());
    }

    public EnableIoTCloudConnectorAccessLogResponse enableIoTCloudConnectorAccessLog(EnableIoTCloudConnectorAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableIoTCloudConnectorAccessLogWithOptions(request, runtime);
    }

    public GetConnectionPoolIpOperationResultResponse getConnectionPoolIpOperationResultWithOptions(GetConnectionPoolIpOperationResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("QueryRequestId", request.queryRequestId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnectionPoolIpOperationResult"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectionPoolIpOperationResultResponse());
    }

    public GetConnectionPoolIpOperationResultResponse getConnectionPoolIpOperationResult(GetConnectionPoolIpOperationResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConnectionPoolIpOperationResultWithOptions(request, runtime);
    }

    public GetIoTCloudConnectorAccessLogResponse getIoTCloudConnectorAccessLogWithOptions(GetIoTCloudConnectorAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIoTCloudConnectorAccessLog"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIoTCloudConnectorAccessLogResponse());
    }

    public GetIoTCloudConnectorAccessLogResponse getIoTCloudConnectorAccessLog(GetIoTCloudConnectorAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIoTCloudConnectorAccessLogWithOptions(request, runtime);
    }

    public GetStsInfoAndOssPathResponse getStsInfoAndOssPathWithOptions(GetStsInfoAndOssPathRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("DryRun", request.dryRun);
        query.put("FileName", request.fileName);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStsInfoAndOssPath"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStsInfoAndOssPathResponse());
    }

    public GetStsInfoAndOssPathResponse getStsInfoAndOssPath(GetStsInfoAndOssPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStsInfoAndOssPathWithOptions(request, runtime);
    }

    public GrantVirtualBorderRouterResponse grantVirtualBorderRouterWithOptions(GrantVirtualBorderRouterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        query.put("VirtualBorderRouterId", request.virtualBorderRouterId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantVirtualBorderRouter"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantVirtualBorderRouterResponse());
    }

    public GrantVirtualBorderRouterResponse grantVirtualBorderRouter(GrantVirtualBorderRouterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantVirtualBorderRouterWithOptions(request, runtime);
    }

    public ListAPNsResponse listAPNsWithOptions(ListAPNsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("APN", request.APN);
        query.put("ISP", request.ISP);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAPNs"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAPNsResponse());
    }

    public ListAPNsResponse listAPNs(ListAPNsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAPNsWithOptions(request, runtime);
    }

    public ListAuthorizationRulesResponse listAuthorizationRulesWithOptions(ListAuthorizationRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizationRuleIds", request.authorizationRuleIds);
        query.put("AuthorizationRuleName", request.authorizationRuleName);
        query.put("AuthorizationRuleStatus", request.authorizationRuleStatus);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Policy", request.policy);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizationRules"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationRulesResponse());
    }

    public ListAuthorizationRulesResponse listAuthorizationRules(ListAuthorizationRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthorizationRulesWithOptions(request, runtime);
    }

    public ListConnectionPoolAllIpsResponse listConnectionPoolAllIpsWithOptions(ListConnectionPoolAllIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("Ip", request.ip);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnectionPoolAllIps"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionPoolAllIpsResponse());
    }

    public ListConnectionPoolAllIpsResponse listConnectionPoolAllIps(ListConnectionPoolAllIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectionPoolAllIpsWithOptions(request, runtime);
    }

    public ListConnectionPoolIpsResponse listConnectionPoolIpsWithOptions(ListConnectionPoolIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("Ip", request.ip);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnectionPoolIps"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionPoolIpsResponse());
    }

    public ListConnectionPoolIpsResponse listConnectionPoolIps(ListConnectionPoolIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectionPoolIpsWithOptions(request, runtime);
    }

    public ListConnectionPoolsResponse listConnectionPoolsWithOptions(ListConnectionPoolsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ConnectionPoolIds", request.connectionPoolIds);
        query.put("ConnectionPoolName", request.connectionPoolName);
        query.put("ConnectionPoolStatus", request.connectionPoolStatus);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConnectionPools"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConnectionPoolsResponse());
    }

    public ListConnectionPoolsResponse listConnectionPools(ListConnectionPoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectionPoolsWithOptions(request, runtime);
    }

    public ListGroupAuthorizationRulesResponse listGroupAuthorizationRulesWithOptions(ListGroupAuthorizationRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizationRuleIds", request.authorizationRuleIds);
        query.put("AuthorizationRuleName", request.authorizationRuleName);
        query.put("AuthorizationRuleStatus", request.authorizationRuleStatus);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("Policy", request.policy);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupAuthorizationRules"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupAuthorizationRulesResponse());
    }

    public ListGroupAuthorizationRulesResponse listGroupAuthorizationRules(ListGroupAuthorizationRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupAuthorizationRulesWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorAvailableZonesResponse listIoTCloudConnectorAvailableZonesWithOptions(ListIoTCloudConnectorAvailableZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIoTCloudConnectorAvailableZones"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIoTCloudConnectorAvailableZonesResponse());
    }

    public ListIoTCloudConnectorAvailableZonesResponse listIoTCloudConnectorAvailableZones(ListIoTCloudConnectorAvailableZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIoTCloudConnectorAvailableZonesWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorGroupsResponse listIoTCloudConnectorGroupsWithOptions(ListIoTCloudConnectorGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IoTCloudConnectorGroupIds", request.ioTCloudConnectorGroupIds);
        query.put("IoTCloudConnectorGroupName", request.ioTCloudConnectorGroupName);
        query.put("IoTCloudConnectorGroupStatus", request.ioTCloudConnectorGroupStatus);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIoTCloudConnectorGroups"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIoTCloudConnectorGroupsResponse());
    }

    public ListIoTCloudConnectorGroupsResponse listIoTCloudConnectorGroups(ListIoTCloudConnectorGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIoTCloudConnectorGroupsWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorsResponse listIoTCloudConnectorsWithOptions(ListIoTCloudConnectorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("APN", request.APN);
        query.put("ISP", request.ISP);
        query.put("IoTCloudConnectorIds", request.ioTCloudConnectorIds);
        query.put("IoTCloudConnectorName", request.ioTCloudConnectorName);
        query.put("IoTCloudConnectorStatus", request.ioTCloudConnectorStatus);
        query.put("IsInGroup", request.isInGroup);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("VpcId", request.vpcId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIoTCloudConnectors"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIoTCloudConnectorsResponse());
    }

    public ListIoTCloudConnectorsResponse listIoTCloudConnectors(ListIoTCloudConnectorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIoTCloudConnectorsWithOptions(request, runtime);
    }

    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AcceptLanguage", request.acceptLanguage);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    public ListServiceResponse listServiceWithOptions(ListServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("ResourceStatuses", request.resourceStatuses);
        query.put("ServiceIds", request.serviceIds);
        query.put("ServiceNames", request.serviceNames);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListService"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceResponse());
    }

    public ListServiceResponse listService(ListServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceWithOptions(request, runtime);
    }

    public ListServiceEntriesResponse listServiceEntriesWithOptions(ListServiceEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RegionId", request.regionId);
        query.put("ServiceEntryIds", request.serviceEntryIds);
        query.put("ServiceEntryName", request.serviceEntryName);
        query.put("ServiceEntryStatus", request.serviceEntryStatus);
        query.put("ServiceId", request.serviceId);
        query.put("Target", request.target);
        query.put("TargetType", request.targetType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServiceEntries"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServiceEntriesResponse());
    }

    public ListServiceEntriesResponse listServiceEntries(ListServiceEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceEntriesWithOptions(request, runtime);
    }

    public OpenIoTCloudConnectorServiceResponse openIoTCloudConnectorServiceWithOptions(OpenIoTCloudConnectorServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenIoTCloudConnectorService"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenIoTCloudConnectorServiceResponse());
    }

    public OpenIoTCloudConnectorServiceResponse openIoTCloudConnectorService(OpenIoTCloudConnectorServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openIoTCloudConnectorServiceWithOptions(request, runtime);
    }

    public RemoveIoTCloudConnectorFromGroupResponse removeIoTCloudConnectorFromGroupWithOptions(RemoveIoTCloudConnectorFromGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveIoTCloudConnectorFromGroup"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveIoTCloudConnectorFromGroupResponse());
    }

    public RemoveIoTCloudConnectorFromGroupResponse removeIoTCloudConnectorFromGroup(RemoveIoTCloudConnectorFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeIoTCloudConnectorFromGroupWithOptions(request, runtime);
    }

    public UpdateAuthorizationRuleAttributeResponse updateAuthorizationRuleAttributeWithOptions(UpdateAuthorizationRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizationRuleDescription", request.authorizationRuleDescription);
        query.put("AuthorizationRuleId", request.authorizationRuleId);
        query.put("AuthorizationRuleName", request.authorizationRuleName);
        query.put("ClientToken", request.clientToken);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("Policy", request.policy);
        query.put("RegionId", request.regionId);
        query.put("SourceCidrs", request.sourceCidrs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationRuleAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationRuleAttributeResponse());
    }

    public UpdateAuthorizationRuleAttributeResponse updateAuthorizationRuleAttribute(UpdateAuthorizationRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAuthorizationRuleAttributeWithOptions(request, runtime);
    }

    public UpdateConnectionPoolAttributeResponse updateConnectionPoolAttributeWithOptions(UpdateConnectionPoolAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Cidrs", request.cidrs);
        query.put("ClientToken", request.clientToken);
        query.put("ConnectionPoolDescription", request.connectionPoolDescription);
        query.put("ConnectionPoolId", request.connectionPoolId);
        query.put("ConnectionPoolName", request.connectionPoolName);
        query.put("Count", request.count);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConnectionPoolAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConnectionPoolAttributeResponse());
    }

    public UpdateConnectionPoolAttributeResponse updateConnectionPoolAttribute(UpdateConnectionPoolAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConnectionPoolAttributeWithOptions(request, runtime);
    }

    public UpdateGroupAuthorizationRuleAttributeResponse updateGroupAuthorizationRuleAttributeWithOptions(UpdateGroupAuthorizationRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuthorizationRuleDescription", request.authorizationRuleDescription);
        query.put("AuthorizationRuleId", request.authorizationRuleId);
        query.put("AuthorizationRuleName", request.authorizationRuleName);
        query.put("ClientToken", request.clientToken);
        query.put("Destination", request.destination);
        query.put("DestinationType", request.destinationType);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        query.put("Policy", request.policy);
        query.put("RegionId", request.regionId);
        query.put("SourceCidrs", request.sourceCidrs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupAuthorizationRuleAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupAuthorizationRuleAttributeResponse());
    }

    public UpdateGroupAuthorizationRuleAttributeResponse updateGroupAuthorizationRuleAttribute(UpdateGroupAuthorizationRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupAuthorizationRuleAttributeWithOptions(request, runtime);
    }

    public UpdateIoTCloudConnectorAttributeResponse updateIoTCloudConnectorAttributeWithOptions(UpdateIoTCloudConnectorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorDescription", request.ioTCloudConnectorDescription);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("IoTCloudConnectorName", request.ioTCloudConnectorName);
        query.put("RegionId", request.regionId);
        query.put("WildcardDomainEnabled", request.wildcardDomainEnabled);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIoTCloudConnectorAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIoTCloudConnectorAttributeResponse());
    }

    public UpdateIoTCloudConnectorAttributeResponse updateIoTCloudConnectorAttribute(UpdateIoTCloudConnectorAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIoTCloudConnectorAttributeWithOptions(request, runtime);
    }

    public UpdateIoTCloudConnectorGroupAttributeResponse updateIoTCloudConnectorGroupAttributeWithOptions(UpdateIoTCloudConnectorGroupAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Description", request.description);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        query.put("Name", request.name);
        query.put("RegionId", request.regionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIoTCloudConnectorGroupAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIoTCloudConnectorGroupAttributeResponse());
    }

    public UpdateIoTCloudConnectorGroupAttributeResponse updateIoTCloudConnectorGroupAttribute(UpdateIoTCloudConnectorGroupAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIoTCloudConnectorGroupAttributeWithOptions(request, runtime);
    }

    public UpdateServiceAttributeResponse updateServiceAttributeWithOptions(UpdateServiceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        query.put("ServiceDescription", request.serviceDescription);
        query.put("ServiceId", request.serviceId);
        query.put("ServiceName", request.serviceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceAttributeResponse());
    }

    public UpdateServiceAttributeResponse updateServiceAttribute(UpdateServiceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServiceAttributeWithOptions(request, runtime);
    }

    public UpdateServiceEntryAttributeResponse updateServiceEntryAttributeWithOptions(UpdateServiceEntryAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("DryRun", request.dryRun);
        query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        query.put("RegionId", request.regionId);
        query.put("ServiceEntryDescription", request.serviceEntryDescription);
        query.put("ServiceEntryId", request.serviceEntryId);
        query.put("ServiceEntryName", request.serviceEntryName);
        query.put("ServiceId", request.serviceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServiceEntryAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServiceEntryAttributeResponse());
    }

    public UpdateServiceEntryAttributeResponse updateServiceEntryAttribute(UpdateServiceEntryAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServiceEntryAttributeWithOptions(request, runtime);
    }
}

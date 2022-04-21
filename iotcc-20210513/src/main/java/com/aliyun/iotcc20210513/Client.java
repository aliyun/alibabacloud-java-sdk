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
        if (!com.aliyun.teautil.Common.isUnset(request.cidrs)) {
            query.put("Cidrs", request.cidrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ips)) {
            query.put("Ips", request.ips);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipsFilePath)) {
            query.put("IpsFilePath", request.ipsFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchList)) {
            query.put("VSwitchList", request.vSwitchList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleDescription)) {
            query.put("AuthorizationRuleDescription", request.authorizationRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleName)) {
            query.put("AuthorizationRuleName", request.authorizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrs)) {
            query.put("SourceCidrs", request.sourceCidrs);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.cidrs)) {
            query.put("Cidrs", request.cidrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolDescription)) {
            query.put("ConnectionPoolDescription", request.connectionPoolDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolName)) {
            query.put("ConnectionPoolName", request.connectionPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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

    public CreateDNSServiceRuleResponse createDNSServiceRuleWithOptions(CreateDNSServiceRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleDescription)) {
            query.put("DNSServiceRuleDescription", request.DNSServiceRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleName)) {
            query.put("DNSServiceRuleName", request.DNSServiceRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDNSServiceRule"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDNSServiceRuleResponse());
    }

    public CreateDNSServiceRuleResponse createDNSServiceRule(CreateDNSServiceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDNSServiceRuleWithOptions(request, runtime);
    }

    public CreateGroupAuthorizationRuleResponse createGroupAuthorizationRuleWithOptions(CreateGroupAuthorizationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleDescription)) {
            query.put("AuthorizationRuleDescription", request.authorizationRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleName)) {
            query.put("AuthorizationRuleName", request.authorizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrs)) {
            query.put("SourceCidrs", request.sourceCidrs);
        }

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

    public CreateGroupDNSServiceRuleResponse createGroupDNSServiceRuleWithOptions(CreateGroupDNSServiceRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleDescription)) {
            query.put("DNSServiceRuleDescription", request.DNSServiceRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleName)) {
            query.put("DNSServiceRuleName", request.DNSServiceRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupDNSServiceRule"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupDNSServiceRuleResponse());
    }

    public CreateGroupDNSServiceRuleResponse createGroupDNSServiceRule(CreateGroupDNSServiceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupDNSServiceRuleWithOptions(request, runtime);
    }

    public CreateIoTCloudConnectorResponse createIoTCloudConnectorWithOptions(CreateIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APN)) {
            query.put("APN", request.APN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ISP)) {
            query.put("ISP", request.ISP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorDescription)) {
            query.put("IoTCloudConnectorDescription", request.ioTCloudConnectorDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorName)) {
            query.put("IoTCloudConnectorName", request.ioTCloudConnectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wildcardDomainEnabled)) {
            query.put("WildcardDomainEnabled", request.wildcardDomainEnabled);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            query.put("ServiceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryDescription)) {
            query.put("ServiceEntryDescription", request.serviceEntryDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryName)) {
            query.put("ServiceEntryName", request.serviceEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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

    public DeleteDNSServiceRuleResponse deleteDNSServiceRuleWithOptions(DeleteDNSServiceRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleId)) {
            query.put("DNSServiceRuleId", request.DNSServiceRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDNSServiceRule"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDNSServiceRuleResponse());
    }

    public DeleteDNSServiceRuleResponse deleteDNSServiceRule(DeleteDNSServiceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDNSServiceRuleWithOptions(request, runtime);
    }

    public DeleteGroupAuthorizationRuleResponse deleteGroupAuthorizationRuleWithOptions(DeleteGroupAuthorizationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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

    public DeleteGroupDNSServiceRuleResponse deleteGroupDNSServiceRuleWithOptions(DeleteGroupDNSServiceRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleId)) {
            query.put("DNSServiceRuleId", request.DNSServiceRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroupDNSServiceRule"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupDNSServiceRuleResponse());
    }

    public DeleteGroupDNSServiceRuleResponse deleteGroupDNSServiceRule(DeleteGroupDNSServiceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupDNSServiceRuleWithOptions(request, runtime);
    }

    public DeleteIoTCloudConnectorResponse deleteIoTCloudConnectorWithOptions(DeleteIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryId)) {
            query.put("ServiceEntryId", request.serviceEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ips)) {
            query.put("Ips", request.ips);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipsFilePath)) {
            query.put("IpsFilePath", request.ipsFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.accessLogSlsLogStore)) {
            query.put("AccessLogSlsLogStore", request.accessLogSlsLogStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessLogSlsProject)) {
            query.put("AccessLogSlsProject", request.accessLogSlsProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRequestId)) {
            query.put("QueryRequestId", request.queryRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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

    public GetDiagnoseResultForSingleCardResponse getDiagnoseResultForSingleCardWithOptions(GetDiagnoseResultForSingleCardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagnoseTaskId)) {
            query.put("DiagnoseTaskId", request.diagnoseTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiagnoseResultForSingleCard"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiagnoseResultForSingleCardResponse());
    }

    public GetDiagnoseResultForSingleCardResponse getDiagnoseResultForSingleCard(GetDiagnoseResultForSingleCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDiagnoseResultForSingleCardWithOptions(request, runtime);
    }

    public GetIoTCloudConnectorAccessLogResponse getIoTCloudConnectorAccessLogWithOptions(GetIoTCloudConnectorAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualBorderRouterId)) {
            query.put("VirtualBorderRouterId", request.virtualBorderRouterId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.APN)) {
            query.put("APN", request.APN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ISP)) {
            query.put("ISP", request.ISP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleIds)) {
            query.put("AuthorizationRuleIds", request.authorizationRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleName)) {
            query.put("AuthorizationRuleName", request.authorizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleStatus)) {
            query.put("AuthorizationRuleStatus", request.authorizationRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleType)) {
            query.put("AuthorizationRuleType", request.authorizationRuleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolIds)) {
            query.put("ConnectionPoolIds", request.connectionPoolIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolName)) {
            query.put("ConnectionPoolName", request.connectionPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolStatus)) {
            query.put("ConnectionPoolStatus", request.connectionPoolStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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

    public ListDNSServiceRulesResponse listDNSServiceRulesWithOptions(ListDNSServiceRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleIds)) {
            query.put("DNSServiceRuleIds", request.DNSServiceRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleName)) {
            query.put("DNSServiceRuleName", request.DNSServiceRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleStatus)) {
            query.put("DNSServiceRuleStatus", request.DNSServiceRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDNSServiceRules"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDNSServiceRulesResponse());
    }

    public ListDNSServiceRulesResponse listDNSServiceRules(ListDNSServiceRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDNSServiceRulesWithOptions(request, runtime);
    }

    public ListDiagnoseInfoForSingleCardResponse listDiagnoseInfoForSingleCardWithOptions(ListDiagnoseInfoForSingleCardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnoseInfoForSingleCard"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnoseInfoForSingleCardResponse());
    }

    public ListDiagnoseInfoForSingleCardResponse listDiagnoseInfoForSingleCard(ListDiagnoseInfoForSingleCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDiagnoseInfoForSingleCardWithOptions(request, runtime);
    }

    public ListGroupAuthorizationRulesResponse listGroupAuthorizationRulesWithOptions(ListGroupAuthorizationRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleIds)) {
            query.put("AuthorizationRuleIds", request.authorizationRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleName)) {
            query.put("AuthorizationRuleName", request.authorizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleStatus)) {
            query.put("AuthorizationRuleStatus", request.authorizationRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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

    public ListGroupDNSServiceRulesResponse listGroupDNSServiceRulesWithOptions(ListGroupDNSServiceRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleIds)) {
            query.put("DNSServiceRuleIds", request.DNSServiceRuleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleName)) {
            query.put("DNSServiceRuleName", request.DNSServiceRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleStatus)) {
            query.put("DNSServiceRuleStatus", request.DNSServiceRuleStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupDNSServiceRules"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupDNSServiceRulesResponse());
    }

    public ListGroupDNSServiceRulesResponse listGroupDNSServiceRules(ListGroupDNSServiceRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupDNSServiceRulesWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorAccessSessionLogsResponse listIoTCloudConnectorAccessSessionLogsWithOptions(ListIoTCloudConnectorAccessSessionLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinations)) {
            query.put("Destinations", request.destinations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIps)) {
            query.put("SourceIps", request.sourceIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIoTCloudConnectorAccessSessionLogs"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIoTCloudConnectorAccessSessionLogsResponse());
    }

    public ListIoTCloudConnectorAccessSessionLogsResponse listIoTCloudConnectorAccessSessionLogs(ListIoTCloudConnectorAccessSessionLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIoTCloudConnectorAccessSessionLogsWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorAvailableZonesResponse listIoTCloudConnectorAvailableZonesWithOptions(ListIoTCloudConnectorAvailableZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupIds)) {
            query.put("IoTCloudConnectorGroupIds", request.ioTCloudConnectorGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupName)) {
            query.put("IoTCloudConnectorGroupName", request.ioTCloudConnectorGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupStatus)) {
            query.put("IoTCloudConnectorGroupStatus", request.ioTCloudConnectorGroupStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.APN)) {
            query.put("APN", request.APN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ISP)) {
            query.put("ISP", request.ISP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorIds)) {
            query.put("IoTCloudConnectorIds", request.ioTCloudConnectorIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorName)) {
            query.put("IoTCloudConnectorName", request.ioTCloudConnectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorStatus)) {
            query.put("IoTCloudConnectorStatus", request.ioTCloudConnectorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isInGroup)) {
            query.put("IsInGroup", request.isInGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceStatuses)) {
            query.put("ResourceStatuses", request.resourceStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIds)) {
            query.put("ServiceIds", request.serviceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceNames)) {
            query.put("ServiceNames", request.serviceNames);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryIds)) {
            query.put("ServiceEntryIds", request.serviceEntryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryName)) {
            query.put("ServiceEntryName", request.serviceEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryStatus)) {
            query.put("ServiceEntryStatus", request.serviceEntryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

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

    public MoveAuthorizationRuleToDNSServiceResponse moveAuthorizationRuleToDNSServiceWithOptions(MoveAuthorizationRuleToDNSServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveAuthorizationRuleToDNSService"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveAuthorizationRuleToDNSServiceResponse());
    }

    public MoveAuthorizationRuleToDNSServiceResponse moveAuthorizationRuleToDNSService(MoveAuthorizationRuleToDNSServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveAuthorizationRuleToDNSServiceWithOptions(request, runtime);
    }

    public MoveGroupAuthorizationRuleToDNSServiceResponse moveGroupAuthorizationRuleToDNSServiceWithOptions(MoveGroupAuthorizationRuleToDNSServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveGroupAuthorizationRuleToDNSService"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveGroupAuthorizationRuleToDNSServiceResponse());
    }

    public MoveGroupAuthorizationRuleToDNSServiceResponse moveGroupAuthorizationRuleToDNSService(MoveGroupAuthorizationRuleToDNSServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveGroupAuthorizationRuleToDNSServiceWithOptions(request, runtime);
    }

    public OpenIoTCloudConnectorServiceResponse openIoTCloudConnectorServiceWithOptions(OpenIoTCloudConnectorServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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

    public SubmitDiagnoseTaskForSingleCardResponse submitDiagnoseTaskForSingleCardWithOptions(SubmitDiagnoseTaskForSingleCardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDiagnoseTaskForSingleCard"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDiagnoseTaskForSingleCardResponse());
    }

    public SubmitDiagnoseTaskForSingleCardResponse submitDiagnoseTaskForSingleCard(SubmitDiagnoseTaskForSingleCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitDiagnoseTaskForSingleCardWithOptions(request, runtime);
    }

    public UpdateAuthorizationRuleAttributeResponse updateAuthorizationRuleAttributeWithOptions(UpdateAuthorizationRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleDescription)) {
            query.put("AuthorizationRuleDescription", request.authorizationRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleName)) {
            query.put("AuthorizationRuleName", request.authorizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrs)) {
            query.put("SourceCidrs", request.sourceCidrs);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.cidrs)) {
            query.put("Cidrs", request.cidrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolDescription)) {
            query.put("ConnectionPoolDescription", request.connectionPoolDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolId)) {
            query.put("ConnectionPoolId", request.connectionPoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionPoolName)) {
            query.put("ConnectionPoolName", request.connectionPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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

    public UpdateDNSServiceRuleAttributeResponse updateDNSServiceRuleAttributeWithOptions(UpdateDNSServiceRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleDescription)) {
            query.put("DNSServiceRuleDescription", request.DNSServiceRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleId)) {
            query.put("DNSServiceRuleId", request.DNSServiceRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleName)) {
            query.put("DNSServiceRuleName", request.DNSServiceRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDNSServiceRuleAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDNSServiceRuleAttributeResponse());
    }

    public UpdateDNSServiceRuleAttributeResponse updateDNSServiceRuleAttribute(UpdateDNSServiceRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDNSServiceRuleAttributeWithOptions(request, runtime);
    }

    public UpdateGroupAuthorizationRuleAttributeResponse updateGroupAuthorizationRuleAttributeWithOptions(UpdateGroupAuthorizationRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleDescription)) {
            query.put("AuthorizationRuleDescription", request.authorizationRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleName)) {
            query.put("AuthorizationRuleName", request.authorizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrs)) {
            query.put("SourceCidrs", request.sourceCidrs);
        }

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

    public UpdateGroupDNSServiceRuleAttributeResponse updateGroupDNSServiceRuleAttributeWithOptions(UpdateGroupDNSServiceRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleDescription)) {
            query.put("DNSServiceRuleDescription", request.DNSServiceRuleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleId)) {
            query.put("DNSServiceRuleId", request.DNSServiceRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DNSServiceRuleName)) {
            query.put("DNSServiceRuleName", request.DNSServiceRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupDNSServiceRuleAttribute"),
            new TeaPair("version", "2021-05-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupDNSServiceRuleAttributeResponse());
    }

    public UpdateGroupDNSServiceRuleAttributeResponse updateGroupDNSServiceRuleAttribute(UpdateGroupDNSServiceRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupDNSServiceRuleAttributeWithOptions(request, runtime);
    }

    public UpdateIoTCloudConnectorAttributeResponse updateIoTCloudConnectorAttributeWithOptions(UpdateIoTCloudConnectorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorDescription)) {
            query.put("IoTCloudConnectorDescription", request.ioTCloudConnectorDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorName)) {
            query.put("IoTCloudConnectorName", request.ioTCloudConnectorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wildcardDomainEnabled)) {
            query.put("WildcardDomainEnabled", request.wildcardDomainEnabled);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorGroupId)) {
            query.put("IoTCloudConnectorGroupId", request.ioTCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            query.put("ServiceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ioTCloudConnectorId)) {
            query.put("IoTCloudConnectorId", request.ioTCloudConnectorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryDescription)) {
            query.put("ServiceEntryDescription", request.serviceEntryDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryId)) {
            query.put("ServiceEntryId", request.serviceEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceEntryName)) {
            query.put("ServiceEntryName", request.serviceEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

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

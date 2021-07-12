// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513;

import com.aliyun.tea.*;
import com.aliyun.iotcc20210513.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
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

    public DeleteServiceResponse deleteServiceWithOptions(DeleteServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteService", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServiceResponse());
    }

    public DeleteServiceResponse deleteService(DeleteServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceWithOptions(request, runtime);
    }

    public DeleteServiceEntryResponse deleteServiceEntryWithOptions(DeleteServiceEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteServiceEntry", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServiceEntryResponse());
    }

    public DeleteServiceEntryResponse deleteServiceEntry(DeleteServiceEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceEntryWithOptions(request, runtime);
    }

    public UpdateServiceEntryAttributeResponse updateServiceEntryAttributeWithOptions(UpdateServiceEntryAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateServiceEntryAttribute", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateServiceEntryAttributeResponse());
    }

    public UpdateServiceEntryAttributeResponse updateServiceEntryAttribute(UpdateServiceEntryAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServiceEntryAttributeWithOptions(request, runtime);
    }

    public UpdateServiceAttributeResponse updateServiceAttributeWithOptions(UpdateServiceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateServiceAttribute", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateServiceAttributeResponse());
    }

    public UpdateServiceAttributeResponse updateServiceAttribute(UpdateServiceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServiceAttributeWithOptions(request, runtime);
    }

    public ListAuthorizationRulesResponse listAuthorizationRulesWithOptions(ListAuthorizationRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAuthorizationRules", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListAuthorizationRulesResponse());
    }

    public ListAuthorizationRulesResponse listAuthorizationRules(ListAuthorizationRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthorizationRulesWithOptions(request, runtime);
    }

    public ListServiceResponse listServiceWithOptions(ListServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListService", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListServiceResponse());
    }

    public ListServiceResponse listService(ListServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceWithOptions(request, runtime);
    }

    public AssociateVSwitchWithIoTCloudConnectorResponse associateVSwitchWithIoTCloudConnectorWithOptions(AssociateVSwitchWithIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateVSwitchWithIoTCloudConnector", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateVSwitchWithIoTCloudConnectorResponse());
    }

    public AssociateVSwitchWithIoTCloudConnectorResponse associateVSwitchWithIoTCloudConnector(AssociateVSwitchWithIoTCloudConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateVSwitchWithIoTCloudConnectorWithOptions(request, runtime);
    }

    public ListConnectionPoolsResponse listConnectionPoolsWithOptions(ListConnectionPoolsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConnectionPools", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListConnectionPoolsResponse());
    }

    public ListConnectionPoolsResponse listConnectionPools(ListConnectionPoolsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectionPoolsWithOptions(request, runtime);
    }

    public UpdateConnectionPoolAttributeResponse updateConnectionPoolAttributeWithOptions(UpdateConnectionPoolAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConnectionPoolAttribute", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConnectionPoolAttributeResponse());
    }

    public UpdateConnectionPoolAttributeResponse updateConnectionPoolAttribute(UpdateConnectionPoolAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConnectionPoolAttributeWithOptions(request, runtime);
    }

    public DisableIoTCloudConnectorAccessLogResponse disableIoTCloudConnectorAccessLogWithOptions(DisableIoTCloudConnectorAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableIoTCloudConnectorAccessLog", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new DisableIoTCloudConnectorAccessLogResponse());
    }

    public DisableIoTCloudConnectorAccessLogResponse disableIoTCloudConnectorAccessLog(DisableIoTCloudConnectorAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableIoTCloudConnectorAccessLogWithOptions(request, runtime);
    }

    public CreateConnectionPoolResponse createConnectionPoolWithOptions(CreateConnectionPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConnectionPool", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConnectionPoolResponse());
    }

    public CreateConnectionPoolResponse createConnectionPool(CreateConnectionPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConnectionPoolWithOptions(request, runtime);
    }

    public CreateAuthorizationRuleResponse createAuthorizationRuleWithOptions(CreateAuthorizationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAuthorizationRule", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAuthorizationRuleResponse());
    }

    public CreateAuthorizationRuleResponse createAuthorizationRule(CreateAuthorizationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAuthorizationRuleWithOptions(request, runtime);
    }

    public UpdateIoTCloudConnectorAttributeResponse updateIoTCloudConnectorAttributeWithOptions(UpdateIoTCloudConnectorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIoTCloudConnectorAttribute", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIoTCloudConnectorAttributeResponse());
    }

    public UpdateIoTCloudConnectorAttributeResponse updateIoTCloudConnectorAttribute(UpdateIoTCloudConnectorAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIoTCloudConnectorAttributeWithOptions(request, runtime);
    }

    public DeleteIoTCloudConnectorResponse deleteIoTCloudConnectorWithOptions(DeleteIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIoTCloudConnector", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIoTCloudConnectorResponse());
    }

    public DeleteIoTCloudConnectorResponse deleteIoTCloudConnector(DeleteIoTCloudConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIoTCloudConnectorWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorAvailableZonesResponse listIoTCloudConnectorAvailableZonesWithOptions(ListIoTCloudConnectorAvailableZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIoTCloudConnectorAvailableZones", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListIoTCloudConnectorAvailableZonesResponse());
    }

    public ListIoTCloudConnectorAvailableZonesResponse listIoTCloudConnectorAvailableZones(ListIoTCloudConnectorAvailableZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIoTCloudConnectorAvailableZonesWithOptions(request, runtime);
    }

    public GetIoTCloudConnectorAccessLogResponse getIoTCloudConnectorAccessLogWithOptions(GetIoTCloudConnectorAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIoTCloudConnectorAccessLog", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetIoTCloudConnectorAccessLogResponse());
    }

    public GetIoTCloudConnectorAccessLogResponse getIoTCloudConnectorAccessLog(GetIoTCloudConnectorAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIoTCloudConnectorAccessLogWithOptions(request, runtime);
    }

    public DeleteAuthorizationRuleResponse deleteAuthorizationRuleWithOptions(DeleteAuthorizationRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAuthorizationRule", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAuthorizationRuleResponse());
    }

    public DeleteAuthorizationRuleResponse deleteAuthorizationRule(DeleteAuthorizationRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAuthorizationRuleWithOptions(request, runtime);
    }

    public DeleteConnectionPoolResponse deleteConnectionPoolWithOptions(DeleteConnectionPoolRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConnectionPool", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConnectionPoolResponse());
    }

    public DeleteConnectionPoolResponse deleteConnectionPool(DeleteConnectionPoolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConnectionPoolWithOptions(request, runtime);
    }

    public DissociateVSwitchFromIoTCloudConnectorResponse dissociateVSwitchFromIoTCloudConnectorWithOptions(DissociateVSwitchFromIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DissociateVSwitchFromIoTCloudConnector", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new DissociateVSwitchFromIoTCloudConnectorResponse());
    }

    public DissociateVSwitchFromIoTCloudConnectorResponse dissociateVSwitchFromIoTCloudConnector(DissociateVSwitchFromIoTCloudConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateVSwitchFromIoTCloudConnectorWithOptions(request, runtime);
    }

    public EnableIoTCloudConnectorAccessLogResponse enableIoTCloudConnectorAccessLogWithOptions(EnableIoTCloudConnectorAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableIoTCloudConnectorAccessLog", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new EnableIoTCloudConnectorAccessLogResponse());
    }

    public EnableIoTCloudConnectorAccessLogResponse enableIoTCloudConnectorAccessLog(EnableIoTCloudConnectorAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableIoTCloudConnectorAccessLogWithOptions(request, runtime);
    }

    public ListServiceEntriesResponse listServiceEntriesWithOptions(ListServiceEntriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListServiceEntries", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListServiceEntriesResponse());
    }

    public ListServiceEntriesResponse listServiceEntries(ListServiceEntriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServiceEntriesWithOptions(request, runtime);
    }

    public CreateServiceResponse createServiceWithOptions(CreateServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateService", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceResponse());
    }

    public CreateServiceResponse createService(CreateServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceWithOptions(request, runtime);
    }

    public ListIoTCloudConnectorsResponse listIoTCloudConnectorsWithOptions(ListIoTCloudConnectorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIoTCloudConnectors", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListIoTCloudConnectorsResponse());
    }

    public ListIoTCloudConnectorsResponse listIoTCloudConnectors(ListIoTCloudConnectorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIoTCloudConnectorsWithOptions(request, runtime);
    }

    public CreateIoTCloudConnectorResponse createIoTCloudConnectorWithOptions(CreateIoTCloudConnectorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIoTCloudConnector", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIoTCloudConnectorResponse());
    }

    public CreateIoTCloudConnectorResponse createIoTCloudConnector(CreateIoTCloudConnectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIoTCloudConnectorWithOptions(request, runtime);
    }

    public UpdateAuthorizationRuleAttributeResponse updateAuthorizationRuleAttributeWithOptions(UpdateAuthorizationRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAuthorizationRuleAttribute", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAuthorizationRuleAttributeResponse());
    }

    public UpdateAuthorizationRuleAttributeResponse updateAuthorizationRuleAttribute(UpdateAuthorizationRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAuthorizationRuleAttributeWithOptions(request, runtime);
    }

    public CreateServiceEntryResponse createServiceEntryWithOptions(CreateServiceEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceEntry", "2021-05-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceEntryResponse());
    }

    public CreateServiceEntryResponse createServiceEntry(CreateServiceEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceEntryWithOptions(request, runtime);
    }
}

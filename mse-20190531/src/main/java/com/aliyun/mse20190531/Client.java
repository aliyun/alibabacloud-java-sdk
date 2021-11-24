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

    public AddMockRuleResponse addMockRuleWithOptions(AddMockRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMockRule", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddMockRuleResponse());
    }

    public AddMockRuleResponse addMockRule(AddMockRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMockRuleWithOptions(request, runtime);
    }

    public AddServiceSourceResponse addServiceSourceWithOptions(AddServiceSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddServiceSource", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddServiceSourceResponse());
    }

    public AddServiceSourceResponse addServiceSource(AddServiceSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addServiceSourceWithOptions(request, runtime);
    }

    public CloneNacosConfigResponse cloneNacosConfigWithOptions(CloneNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneNacosConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new CloneNacosConfigResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAlarmRule", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAlarmRuleResponse());
    }

    public CreateAlarmRuleResponse createAlarmRule(CreateAlarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlarmRuleWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApplication", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateApplicationResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateClusterResponse());
    }

    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    public CreateEngineNamespaceResponse createEngineNamespaceWithOptions(CreateEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEngineNamespace", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEngineNamespaceResponse());
    }

    public CreateEngineNamespaceResponse createEngineNamespace(CreateEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEngineNamespaceWithOptions(request, runtime);
    }

    public CreateGovernanceKubernetesClusterResponse createGovernanceKubernetesClusterWithOptions(CreateGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGovernanceKubernetesCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGovernanceKubernetesClusterResponse());
    }

    public CreateGovernanceKubernetesClusterResponse createGovernanceKubernetesCluster(CreateGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public CreateNacosConfigResponse createNacosConfigWithOptions(CreateNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNacosConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNacosConfigResponse());
    }

    public CreateNacosConfigResponse createNacosConfig(CreateNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNacosConfigWithOptions(request, runtime);
    }

    public CreateZnodeResponse createZnodeWithOptions(CreateZnodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateZnode", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateZnodeResponse());
    }

    public CreateZnodeResponse createZnode(CreateZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createZnodeWithOptions(request, runtime);
    }

    public DeleteAlarmRuleResponse deleteAlarmRuleWithOptions(DeleteAlarmRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlarmRule", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlarmRuleResponse());
    }

    public DeleteAlarmRuleResponse deleteAlarmRule(DeleteAlarmRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlarmRuleWithOptions(request, runtime);
    }

    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteClusterResponse());
    }

    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    public DeleteEngineNamespaceResponse deleteEngineNamespaceWithOptions(DeleteEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEngineNamespace", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEngineNamespaceResponse());
    }

    public DeleteEngineNamespaceResponse deleteEngineNamespace(DeleteEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEngineNamespaceWithOptions(request, runtime);
    }

    public DeleteNacosConfigResponse deleteNacosConfigWithOptions(DeleteNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNacosConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNacosConfigResponse());
    }

    public DeleteNacosConfigResponse deleteNacosConfig(DeleteNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosConfigWithOptions(request, runtime);
    }

    public DeleteNacosConfigsResponse deleteNacosConfigsWithOptions(DeleteNacosConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNacosConfigs", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNacosConfigsResponse());
    }

    public DeleteNacosConfigsResponse deleteNacosConfigs(DeleteNacosConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosConfigsWithOptions(request, runtime);
    }

    public DeleteNacosServiceResponse deleteNacosServiceWithOptions(DeleteNacosServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNacosService", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNacosServiceResponse());
    }

    public DeleteNacosServiceResponse deleteNacosService(DeleteNacosServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNacosServiceWithOptions(request, runtime);
    }

    public DeleteZnodeResponse deleteZnodeWithOptions(DeleteZnodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteZnode", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteZnodeResponse());
    }

    public DeleteZnodeResponse deleteZnode(DeleteZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteZnodeWithOptions(request, runtime);
    }

    public ExportNacosConfigResponse exportNacosConfigWithOptions(ExportNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportNacosConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ExportNacosConfigResponse());
    }

    public ExportNacosConfigResponse exportNacosConfig(ExportNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportNacosConfigWithOptions(request, runtime);
    }

    public GetEngineNamepaceResponse getEngineNamepaceWithOptions(GetEngineNamepaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEngineNamepace", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetEngineNamepaceResponse());
    }

    public GetEngineNamepaceResponse getEngineNamepace(GetEngineNamepaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEngineNamepaceWithOptions(request, runtime);
    }

    public GetGatewayResponse getGatewayWithOptions(GetGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGateway", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new GetGatewayResponse());
    }

    public GetGatewayResponse getGateway(GetGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayWithOptions(request, runtime);
    }

    public GetGatewayOptionResponse getGatewayOptionWithOptions(GetGatewayOptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGatewayOption", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetGatewayOptionResponse());
    }

    public GetGatewayOptionResponse getGatewayOption(GetGatewayOptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayOptionWithOptions(request, runtime);
    }

    public GetGovernanceKubernetesClusterResponse getGovernanceKubernetesClusterWithOptions(GetGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGovernanceKubernetesCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetGovernanceKubernetesClusterResponse());
    }

    public GetGovernanceKubernetesClusterResponse getGovernanceKubernetesCluster(GetGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public GetGovernanceKubernetesClusterListResponse getGovernanceKubernetesClusterListWithOptions(GetGovernanceKubernetesClusterListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGovernanceKubernetesClusterList", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetGovernanceKubernetesClusterListResponse());
    }

    public GetGovernanceKubernetesClusterListResponse getGovernanceKubernetesClusterList(GetGovernanceKubernetesClusterListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGovernanceKubernetesClusterListWithOptions(request, runtime);
    }

    public GetImageResponse getImageWithOptions(GetImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImage", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetImageResponse());
    }

    public GetImageResponse getImage(GetImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImageWithOptions(request, runtime);
    }

    public GetImportFileUrlResponse getImportFileUrlWithOptions(GetImportFileUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetImportFileUrl", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetImportFileUrlResponse());
    }

    public GetImportFileUrlResponse getImportFileUrl(GetImportFileUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImportFileUrlWithOptions(request, runtime);
    }

    public GetMseFeatureSwitchResponse getMseFeatureSwitchWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetMseFeatureSwitch", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetMseFeatureSwitchResponse());
    }

    public GetMseFeatureSwitchResponse getMseFeatureSwitch() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMseFeatureSwitchWithOptions(runtime);
    }

    public GetNacosConfigResponse getNacosConfigWithOptions(GetNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNacosConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetNacosConfigResponse());
    }

    public GetNacosConfigResponse getNacosConfig(GetNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNacosConfigWithOptions(request, runtime);
    }

    public GetNacosHistoryConfigResponse getNacosHistoryConfigWithOptions(GetNacosHistoryConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNacosHistoryConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetNacosHistoryConfigResponse());
    }

    public GetNacosHistoryConfigResponse getNacosHistoryConfig(GetNacosHistoryConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNacosHistoryConfigWithOptions(request, runtime);
    }

    public GetOverviewResponse getOverviewWithOptions(GetOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOverview", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetOverviewResponse());
    }

    public GetOverviewResponse getOverview(GetOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOverviewWithOptions(request, runtime);
    }

    public ImportNacosConfigResponse importNacosConfigWithOptions(ImportNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportNacosConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ImportNacosConfigResponse());
    }

    public ImportNacosConfigResponse importNacosConfig(ImportNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importNacosConfigWithOptions(request, runtime);
    }

    public ListAlarmContactGroupsResponse listAlarmContactGroupsWithOptions(ListAlarmContactGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlarmContactGroups", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListAlarmContactGroupsResponse());
    }

    public ListAlarmContactGroupsResponse listAlarmContactGroups(ListAlarmContactGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmContactGroupsWithOptions(request, runtime);
    }

    public ListAlarmHistoriesResponse listAlarmHistoriesWithOptions(ListAlarmHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlarmHistories", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListAlarmHistoriesResponse());
    }

    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmHistoriesWithOptions(request, runtime);
    }

    public ListAlarmItemsResponse listAlarmItemsWithOptions(ListAlarmItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlarmItems", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListAlarmItemsResponse());
    }

    public ListAlarmItemsResponse listAlarmItems(ListAlarmItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmItemsWithOptions(request, runtime);
    }

    public ListAlarmRulesResponse listAlarmRulesWithOptions(ListAlarmRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlarmRules", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListAlarmRulesResponse());
    }

    public ListAlarmRulesResponse listAlarmRules(ListAlarmRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmRulesWithOptions(request, runtime);
    }

    public ListAnsInstancesResponse listAnsInstancesWithOptions(ListAnsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAnsInstances", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListAnsInstancesResponse());
    }

    public ListAnsInstancesResponse listAnsInstances(ListAnsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsInstancesWithOptions(request, runtime);
    }

    public ListAnsServiceClustersResponse listAnsServiceClustersWithOptions(ListAnsServiceClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAnsServiceClusters", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListAnsServiceClustersResponse());
    }

    public ListAnsServiceClustersResponse listAnsServiceClusters(ListAnsServiceClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsServiceClustersWithOptions(request, runtime);
    }

    public ListAnsServicesResponse listAnsServicesWithOptions(ListAnsServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAnsServices", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListAnsServicesResponse());
    }

    public ListAnsServicesResponse listAnsServices(ListAnsServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnsServicesWithOptions(request, runtime);
    }

    public ListClusterConnectionTypesResponse listClusterConnectionTypesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListClusterConnectionTypes", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterConnectionTypesResponse());
    }

    public ListClusterConnectionTypesResponse listClusterConnectionTypes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterConnectionTypesWithOptions(runtime);
    }

    public ListClusterTypesResponse listClusterTypesWithOptions(ListClusterTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterTypes", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterTypesResponse());
    }

    public ListClusterTypesResponse listClusterTypes(ListClusterTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterTypesWithOptions(request, runtime);
    }

    public ListClusterVersionsResponse listClusterVersionsWithOptions(ListClusterVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterVersions", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterVersionsResponse());
    }

    public ListClusterVersionsResponse listClusterVersions(ListClusterVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterVersionsWithOptions(request, runtime);
    }

    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusters", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListClustersResponse());
    }

    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    public ListEngineNamespacesResponse listEngineNamespacesWithOptions(ListEngineNamespacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEngineNamespaces", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListEngineNamespacesResponse());
    }

    public ListEngineNamespacesResponse listEngineNamespaces(ListEngineNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEngineNamespacesWithOptions(request, runtime);
    }

    public ListEurekaInstancesResponse listEurekaInstancesWithOptions(ListEurekaInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEurekaInstances", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListEurekaInstancesResponse());
    }

    public ListEurekaInstancesResponse listEurekaInstances(ListEurekaInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEurekaInstancesWithOptions(request, runtime);
    }

    public ListEurekaServicesResponse listEurekaServicesWithOptions(ListEurekaServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEurekaServices", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListEurekaServicesResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGateway", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListGatewayResponse());
    }

    public ListGatewayResponse listGateway(ListGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGatewayWithOptions(request, runtime);
    }

    public ListListenersByConfigResponse listListenersByConfigWithOptions(ListListenersByConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListListenersByConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListListenersByConfigResponse());
    }

    public ListListenersByConfigResponse listListenersByConfig(ListListenersByConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersByConfigWithOptions(request, runtime);
    }

    public ListListenersByIpResponse listListenersByIpWithOptions(ListListenersByIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListListenersByIp", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListListenersByIpResponse());
    }

    public ListListenersByIpResponse listListenersByIp(ListListenersByIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listListenersByIpWithOptions(request, runtime);
    }

    public ListNacosConfigsResponse listNacosConfigsWithOptions(ListNacosConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNacosConfigs", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListNacosConfigsResponse());
    }

    public ListNacosConfigsResponse listNacosConfigs(ListNacosConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNacosConfigsWithOptions(request, runtime);
    }

    public ListNacosHistoryConfigsResponse listNacosHistoryConfigsWithOptions(ListNacosHistoryConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNacosHistoryConfigs", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListNacosHistoryConfigsResponse());
    }

    public ListNacosHistoryConfigsResponse listNacosHistoryConfigs(ListNacosHistoryConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNacosHistoryConfigsWithOptions(request, runtime);
    }

    public ListZnodeChildrenResponse listZnodeChildrenWithOptions(ListZnodeChildrenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListZnodeChildren", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new ListZnodeChildrenResponse());
    }

    public ListZnodeChildrenResponse listZnodeChildren(ListZnodeChildrenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listZnodeChildrenWithOptions(request, runtime);
    }

    public ModifyGovernanceKubernetesClusterResponse modifyGovernanceKubernetesClusterWithOptions(ModifyGovernanceKubernetesClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyGovernanceKubernetesCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyGovernanceKubernetesClusterResponse());
    }

    public ModifyGovernanceKubernetesClusterResponse modifyGovernanceKubernetesCluster(ModifyGovernanceKubernetesClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGovernanceKubernetesClusterWithOptions(request, runtime);
    }

    public QueryBusinessLocationsResponse queryBusinessLocationsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryBusinessLocations", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new QueryBusinessLocationsResponse());
    }

    public QueryBusinessLocationsResponse queryBusinessLocations() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBusinessLocationsWithOptions(runtime);
    }

    public QueryClusterDetailResponse queryClusterDetailWithOptions(QueryClusterDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryClusterDetail", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new QueryClusterDetailResponse());
    }

    public QueryClusterDetailResponse queryClusterDetail(QueryClusterDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterDetailWithOptions(request, runtime);
    }

    public QueryClusterDiskSpecificationResponse queryClusterDiskSpecificationWithOptions(QueryClusterDiskSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryClusterDiskSpecification", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new QueryClusterDiskSpecificationResponse());
    }

    public QueryClusterDiskSpecificationResponse queryClusterDiskSpecification(QueryClusterDiskSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterDiskSpecificationWithOptions(request, runtime);
    }

    public QueryClusterSpecificationResponse queryClusterSpecificationWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryClusterSpecification", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new QueryClusterSpecificationResponse());
    }

    public QueryClusterSpecificationResponse queryClusterSpecification() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryClusterSpecificationWithOptions(runtime);
    }

    public QueryConfigResponse queryConfigWithOptions(QueryConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryConfig", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new QueryConfigResponse());
    }

    public QueryConfigResponse queryConfig(QueryConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConfigWithOptions(request, runtime);
    }

    public QueryGatewayRegionResponse queryGatewayRegionWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryGatewayRegion", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new QueryGatewayRegionResponse());
    }

    public QueryGatewayRegionResponse queryGatewayRegion() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGatewayRegionWithOptions(runtime);
    }

    public QueryGatewayTypeResponse queryGatewayTypeWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryGatewayType", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new QueryGatewayTypeResponse());
    }

    public QueryGatewayTypeResponse queryGatewayType() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGatewayTypeWithOptions(runtime);
    }

    public QueryMonitorResponse queryMonitorWithOptions(QueryMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMonitor", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new QueryMonitorResponse());
    }

    public QueryMonitorResponse queryMonitor(QueryMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonitorWithOptions(request, runtime);
    }

    public QuerySlbSpecResponse querySlbSpecWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QuerySlbSpec", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new QuerySlbSpecResponse());
    }

    public QuerySlbSpecResponse querySlbSpec() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySlbSpecWithOptions(runtime);
    }

    public QueryZnodeDetailResponse queryZnodeDetailWithOptions(QueryZnodeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryZnodeDetail", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new QueryZnodeDetailResponse());
    }

    public QueryZnodeDetailResponse queryZnodeDetail(QueryZnodeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryZnodeDetailWithOptions(request, runtime);
    }

    public RestartClusterResponse restartClusterWithOptions(RestartClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new RestartClusterResponse());
    }

    public RestartClusterResponse restartCluster(RestartClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartClusterWithOptions(request, runtime);
    }

    public RetryClusterResponse retryClusterWithOptions(RetryClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RetryCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new RetryClusterResponse());
    }

    public RetryClusterResponse retryCluster(RetryClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryClusterWithOptions(request, runtime);
    }

    public ScalingClusterResponse scalingClusterWithOptions(ScalingClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScalingCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new ScalingClusterResponse());
    }

    public ScalingClusterResponse scalingCluster(ScalingClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scalingClusterWithOptions(request, runtime);
    }

    public UpdateAclResponse updateAclWithOptions(UpdateAclRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAcl", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAclResponse());
    }

    public UpdateAclResponse updateAcl(UpdateAclRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAclWithOptions(request, runtime);
    }

    public UpdateClusterResponse updateClusterWithOptions(UpdateClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateClusterResponse());
    }

    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateClusterWithOptions(request, runtime);
    }

    public UpdateConfigResponse updateConfigWithOptions(UpdateConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConfigResponse());
    }

    public UpdateConfigResponse updateConfig(UpdateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigWithOptions(request, runtime);
    }

    public UpdateEngineNamespaceResponse updateEngineNamespaceWithOptions(UpdateEngineNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEngineNamespace", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEngineNamespaceResponse());
    }

    public UpdateEngineNamespaceResponse updateEngineNamespace(UpdateEngineNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEngineNamespaceWithOptions(request, runtime);
    }

    public UpdateGatewayNameResponse updateGatewayNameWithOptions(UpdateGatewayNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGatewayName", "2019-05-31", "HTTPS", "GET", "AK", "json", req, runtime), new UpdateGatewayNameResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGatewayOption", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGatewayOptionResponse());
    }

    public UpdateGatewayOptionResponse updateGatewayOption(UpdateGatewayOptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayOptionWithOptions(request, runtime);
    }

    public UpdateGatewayRouteHTTPRewriteResponse updateGatewayRouteHTTPRewriteWithOptions(UpdateGatewayRouteHTTPRewriteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGatewayRouteHTTPRewrite", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGatewayRouteHTTPRewriteResponse());
    }

    public UpdateGatewayRouteHTTPRewriteResponse updateGatewayRouteHTTPRewrite(UpdateGatewayRouteHTTPRewriteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGatewayRouteHTTPRewriteWithOptions(request, runtime);
    }

    public UpdateImageResponse updateImageWithOptions(UpdateImageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateImage", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateImageResponse());
    }

    public UpdateImageResponse updateImage(UpdateImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateImageWithOptions(request, runtime);
    }

    public UpdateNacosConfigResponse updateNacosConfigWithOptions(UpdateNacosConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateNacosConfig", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateNacosConfigResponse());
    }

    public UpdateNacosConfigResponse updateNacosConfig(UpdateNacosConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNacosConfigWithOptions(request, runtime);
    }

    public UpdateNacosInstanceResponse updateNacosInstanceWithOptions(UpdateNacosInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateNacosInstance", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateNacosInstanceResponse());
    }

    public UpdateNacosInstanceResponse updateNacosInstance(UpdateNacosInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNacosInstanceWithOptions(request, runtime);
    }

    public UpdateZnodeResponse updateZnodeWithOptions(UpdateZnodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateZnode", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateZnodeResponse());
    }

    public UpdateZnodeResponse updateZnode(UpdateZnodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateZnodeWithOptions(request, runtime);
    }

    public UpgradeClusterResponse upgradeClusterWithOptions(UpgradeClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeCluster", "2019-05-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeClusterResponse());
    }

    public UpgradeClusterResponse upgradeCluster(UpgradeClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeClusterWithOptions(request, runtime);
    }
}

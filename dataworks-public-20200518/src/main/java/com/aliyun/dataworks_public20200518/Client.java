// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518;

import com.aliyun.tea.*;
import com.aliyun.dataworks_public20200518.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "dataworks.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "dataworks.ap-south-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dataworks.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dataworks.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dataworks.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dataworks.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dataworks.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dataworks.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dataworks.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dataworks.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dataworks.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dataworks.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dataworks.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dataworks.aliyuncs.com"),
            new TeaPair("eu-central-1", "dataworks.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dataworks.eu-west-1.aliyuncs.com"),
            new TeaPair("me-east-1", "dataworks.me-east-1.aliyuncs.com"),
            new TeaPair("us-east-1", "dataworks.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dataworks.us-west-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dataworks.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dataworks-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListCalcEnginesResponse listCalcEnginesWithOptions(ListCalcEnginesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListCalcEngines", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListCalcEnginesResponse());
    }

    public ListCalcEnginesResponse listCalcEngines(ListCalcEnginesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCalcEnginesWithOptions(request, runtime);
    }

    public ListConnectionsResponse listConnectionsWithOptions(ListConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListConnections", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new ListConnectionsResponse());
    }

    public ListConnectionsResponse listConnections(ListConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConnectionsWithOptions(request, runtime);
    }

    public UpdateConnectionResponse updateConnectionWithOptions(UpdateConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateConnection", "HTTPS", "PUT", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateConnectionResponse());
    }

    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConnectionWithOptions(request, runtime);
    }

    public DeleteConnectionResponse deleteConnectionWithOptions(DeleteConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteConnection", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteConnectionResponse());
    }

    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConnectionWithOptions(request, runtime);
    }

    public GetProjectDetailResponse getProjectDetailWithOptions(GetProjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetProjectDetail", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetProjectDetailResponse());
    }

    public GetProjectDetailResponse getProjectDetail(GetProjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectDetailWithOptions(request, runtime);
    }

    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListResourceGroups", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListResourceGroupsResponse());
    }

    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupsWithOptions(request, runtime);
    }

    public CreateConnectionResponse createConnectionWithOptions(CreateConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateConnection", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateConnectionResponse());
    }

    public CreateConnectionResponse createConnection(CreateConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConnectionWithOptions(request, runtime);
    }

    public GetDataServiceApplicationResponse getDataServiceApplicationWithOptions(GetDataServiceApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataServiceApplication", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDataServiceApplicationResponse());
    }

    public GetDataServiceApplicationResponse getDataServiceApplication(GetDataServiceApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApplicationWithOptions(request, runtime);
    }

    public ListDataServiceApplicationsResponse listDataServiceApplicationsWithOptions(ListDataServiceApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceApplications", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceApplicationsResponse());
    }

    public ListDataServiceApplicationsResponse listDataServiceApplications(ListDataServiceApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApplicationsWithOptions(request, runtime);
    }

    public GetNodeOnBaselineResponse getNodeOnBaselineWithOptions(GetNodeOnBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNodeOnBaseline", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeOnBaselineResponse());
    }

    public GetNodeOnBaselineResponse getNodeOnBaseline(GetNodeOnBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeOnBaselineWithOptions(request, runtime);
    }

    public ListBaselineConfigsResponse listBaselineConfigsWithOptions(ListBaselineConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBaselineConfigs", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListBaselineConfigsResponse());
    }

    public ListBaselineConfigsResponse listBaselineConfigs(ListBaselineConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineConfigsWithOptions(request, runtime);
    }

    public GetMetaTableChangeLogResponse getMetaTableChangeLogWithOptions(GetMetaTableChangeLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableChangeLog", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTableChangeLogResponse());
    }

    public GetMetaTableChangeLogResponse getMetaTableChangeLog(GetMetaTableChangeLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableChangeLogWithOptions(request, runtime);
    }

    public GetMetaTableOutputResponse getMetaTableOutputWithOptions(GetMetaTableOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableOutput", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTableOutputResponse());
    }

    public GetMetaTableOutputResponse getMetaTableOutput(GetMetaTableOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableOutputWithOptions(request, runtime);
    }

    public GetMetaTablePartitionResponse getMetaTablePartitionWithOptions(GetMetaTablePartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTablePartition", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTablePartitionResponse());
    }

    public GetMetaTablePartitionResponse getMetaTablePartition(GetMetaTablePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTablePartitionWithOptions(request, runtime);
    }

    public GetMetaTableFullInfoResponse getMetaTableFullInfoWithOptions(GetMetaTableFullInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableFullInfo", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaTableFullInfoResponse());
    }

    public GetMetaTableFullInfoResponse getMetaTableFullInfo(GetMetaTableFullInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableFullInfoWithOptions(request, runtime);
    }

    public GetFileVersionResponse getFileVersionWithOptions(GetFileVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFileVersion", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetFileVersionResponse());
    }

    public GetFileVersionResponse getFileVersion(GetFileVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileVersionWithOptions(request, runtime);
    }

    public GetMetaTableBasicInfoResponse getMetaTableBasicInfoWithOptions(GetMetaTableBasicInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableBasicInfo", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaTableBasicInfoResponse());
    }

    public GetMetaTableBasicInfoResponse getMetaTableBasicInfo(GetMetaTableBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableBasicInfoWithOptions(request, runtime);
    }

    public GetMetaTableColumnResponse getMetaTableColumnWithOptions(GetMetaTableColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableColumn", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaTableColumnResponse());
    }

    public GetMetaTableColumnResponse getMetaTableColumn(GetMetaTableColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableColumnWithOptions(request, runtime);
    }

    public GetMetaDBInfoResponse getMetaDBInfoWithOptions(GetMetaDBInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaDBInfo", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaDBInfoResponse());
    }

    public GetMetaDBInfoResponse getMetaDBInfo(GetMetaDBInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBInfoWithOptions(request, runtime);
    }

    public GetMetaCategoryResponse getMetaCategoryWithOptions(GetMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaCategoryResponse());
    }

    public GetMetaCategoryResponse getMetaCategory(GetMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaCategoryWithOptions(request, runtime);
    }

    public ListAlertMessagesResponse listAlertMessagesWithOptions(ListAlertMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAlertMessages", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListAlertMessagesResponse());
    }

    public ListAlertMessagesResponse listAlertMessages(ListAlertMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlertMessagesWithOptions(request, runtime);
    }

    public GetBaselineConfigResponse getBaselineConfigWithOptions(GetBaselineConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBaselineConfig", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetBaselineConfigResponse());
    }

    public GetBaselineConfigResponse getBaselineConfig(GetBaselineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineConfigWithOptions(request, runtime);
    }

    public SearchMetaTablesResponse searchMetaTablesWithOptions(SearchMetaTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchMetaTables", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SearchMetaTablesResponse());
    }

    public SearchMetaTablesResponse searchMetaTables(SearchMetaTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMetaTablesWithOptions(request, runtime);
    }

    public CreateNodeTestResponse createNodeTestWithOptions(CreateNodeTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNodeTest", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateNodeTestResponse());
    }

    public CreateNodeTestResponse createNodeTest(CreateNodeTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeTestWithOptions(request, runtime);
    }

    public GetMetaTableListByCategoryResponse getMetaTableListByCategoryWithOptions(GetMetaTableListByCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableListByCategory", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new GetMetaTableListByCategoryResponse());
    }

    public GetMetaTableListByCategoryResponse getMetaTableListByCategory(GetMetaTableListByCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableListByCategoryWithOptions(request, runtime);
    }

    public DeleteMetaCategoryResponse deleteMetaCategoryWithOptions(DeleteMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMetaCategory", "HTTPS", "GET", "2020-05-18", "AK", TeaModel.buildMap(request), null, runtime), new DeleteMetaCategoryResponse());
    }

    public DeleteMetaCategoryResponse deleteMetaCategory(DeleteMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetaCategoryWithOptions(request, runtime);
    }

    public UpdateMetaCategoryResponse updateMetaCategoryWithOptions(UpdateMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateMetaCategoryResponse());
    }

    public UpdateMetaCategoryResponse updateMetaCategory(UpdateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMetaCategoryWithOptions(request, runtime);
    }

    public CreateNodeComplementResponse createNodeComplementWithOptions(CreateNodeComplementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateNodeComplement", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateNodeComplementResponse());
    }

    public CreateNodeComplementResponse createNodeComplement(CreateNodeComplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodeComplementWithOptions(request, runtime);
    }

    public ListTopicsResponse listTopicsWithOptions(ListTopicsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTopics", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListTopicsResponse());
    }

    public ListTopicsResponse listTopics(ListTopicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTopicsWithOptions(request, runtime);
    }

    public ListFileVersionsResponse listFileVersionsWithOptions(ListFileVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFileVersions", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListFileVersionsResponse());
    }

    public ListFileVersionsResponse listFileVersions(ListFileVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileVersionsWithOptions(request, runtime);
    }

    public CreateMetaCategoryResponse createMetaCategoryWithOptions(CreateMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateMetaCategoryResponse());
    }

    public CreateMetaCategoryResponse createMetaCategory(CreateMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetaCategoryWithOptions(request, runtime);
    }

    public ListNodeIOResponse listNodeIOWithOptions(ListNodeIORequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListNodeIO", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListNodeIOResponse());
    }

    public ListNodeIOResponse listNodeIO(ListNodeIORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeIOWithOptions(request, runtime);
    }

    public GetTopicInfluenceResponse getTopicInfluenceWithOptions(GetTopicInfluenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTopicInfluence", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetTopicInfluenceResponse());
    }

    public GetTopicInfluenceResponse getTopicInfluence(GetTopicInfluenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicInfluenceWithOptions(request, runtime);
    }

    public GetTopicResponse getTopicWithOptions(GetTopicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTopic", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetTopicResponse());
    }

    public GetTopicResponse getTopic(GetTopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTopicWithOptions(request, runtime);
    }

    public DeleteFromMetaCategoryResponse deleteFromMetaCategoryWithOptions(DeleteFromMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFromMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFromMetaCategoryResponse());
    }

    public DeleteFromMetaCategoryResponse deleteFromMetaCategory(DeleteFromMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFromMetaCategoryWithOptions(request, runtime);
    }

    public GetNodeResponse getNodeWithOptions(GetNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeResponse());
    }

    public GetNodeResponse getNode(GetNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeWithOptions(request, runtime);
    }

    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListNodes", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListNodesResponse());
    }

    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    public GetNodeCodeResponse getNodeCodeWithOptions(GetNodeCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNodeCode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetNodeCodeResponse());
    }

    public GetNodeCodeResponse getNodeCode(GetNodeCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeCodeWithOptions(request, runtime);
    }

    public EstablishRelationTableToBusinessResponse establishRelationTableToBusinessWithOptions(EstablishRelationTableToBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EstablishRelationTableToBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new EstablishRelationTableToBusinessResponse());
    }

    public EstablishRelationTableToBusinessResponse establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.establishRelationTableToBusinessWithOptions(request, runtime);
    }

    public UpdateDataServiceApiResponse updateDataServiceApiWithOptions(UpdateDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDataServiceApiResponse());
    }

    public UpdateDataServiceApiResponse updateDataServiceApi(UpdateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataServiceApiWithOptions(request, runtime);
    }

    public UpdateUdfFileResponse updateUdfFileWithOptions(UpdateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateUdfFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateUdfFileResponse());
    }

    public UpdateUdfFileResponse updateUdfFile(UpdateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUdfFileWithOptions(request, runtime);
    }

    public CreateUdfFileResponse createUdfFileWithOptions(CreateUdfFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUdfFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateUdfFileResponse());
    }

    public CreateUdfFileResponse createUdfFile(CreateUdfFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUdfFileWithOptions(request, runtime);
    }

    public ListFilesResponse listFilesWithOptions(ListFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFiles", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListFilesResponse());
    }

    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApisWithOptions(ListDataServiceAuthorizedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceAuthorizedApis", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceAuthorizedApisResponse());
    }

    public ListDataServiceAuthorizedApisResponse listDataServiceAuthorizedApis(ListDataServiceAuthorizedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceAuthorizedApisWithOptions(request, runtime);
    }

    public UpdateFileResponse updateFileWithOptions(UpdateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateFileResponse());
    }

    public UpdateFileResponse updateFile(UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileWithOptions(request, runtime);
    }

    public DeleteFolderResponse deleteFolderWithOptions(DeleteFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFolderResponse());
    }

    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFolderWithOptions(request, runtime);
    }

    public ListFoldersResponse listFoldersWithOptions(ListFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFolders", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListFoldersResponse());
    }

    public ListFoldersResponse listFolders(ListFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFoldersWithOptions(request, runtime);
    }

    public CheckMetaPartitionResponse checkMetaPartitionWithOptions(CheckMetaPartitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckMetaPartition", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CheckMetaPartitionResponse());
    }

    public CheckMetaPartitionResponse checkMetaPartition(CheckMetaPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaPartitionWithOptions(request, runtime);
    }

    public UpdateFolderResponse updateFolderWithOptions(UpdateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateFolderResponse());
    }

    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    public DeleteRemindResponse deleteRemindWithOptions(DeleteRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRemind", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRemindResponse());
    }

    public DeleteRemindResponse deleteRemind(DeleteRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRemindWithOptions(request, runtime);
    }

    public AddToMetaCategoryResponse addToMetaCategoryWithOptions(AddToMetaCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddToMetaCategory", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new AddToMetaCategoryResponse());
    }

    public AddToMetaCategoryResponse addToMetaCategory(AddToMetaCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addToMetaCategoryWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListInstances", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public SetSuccessInstanceResponse setSuccessInstanceWithOptions(SetSuccessInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetSuccessInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SetSuccessInstanceResponse());
    }

    public SetSuccessInstanceResponse setSuccessInstance(SetSuccessInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSuccessInstanceWithOptions(request, runtime);
    }

    public CreateFileResponse createFileWithOptions(CreateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateFileResponse());
    }

    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new StopInstanceResponse());
    }

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    public ResumeInstanceResponse resumeInstanceWithOptions(ResumeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResumeInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ResumeInstanceResponse());
    }

    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstanceWithOptions(request, runtime);
    }

    public SuspendInstanceResponse suspendInstanceWithOptions(SuspendInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SuspendInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SuspendInstanceResponse());
    }

    public SuspendInstanceResponse suspendInstance(SuspendInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendInstanceWithOptions(request, runtime);
    }

    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestartInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new RestartInstanceResponse());
    }

    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthoritiesWithOptions(ListDataServiceApiAuthoritiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceApiAuthorities", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceApiAuthoritiesResponse());
    }

    public ListDataServiceApiAuthoritiesResponse listDataServiceApiAuthorities(ListDataServiceApiAuthoritiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApiAuthoritiesWithOptions(request, runtime);
    }

    public ListDataServicePublishedApisResponse listDataServicePublishedApisWithOptions(ListDataServicePublishedApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServicePublishedApis", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServicePublishedApisResponse());
    }

    public ListDataServicePublishedApisResponse listDataServicePublishedApis(ListDataServicePublishedApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServicePublishedApisWithOptions(request, runtime);
    }

    public GetInstanceLogResponse getInstanceLogWithOptions(GetInstanceLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstanceLog", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceLogResponse());
    }

    public GetInstanceLogResponse getInstanceLog(GetInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceLogWithOptions(request, runtime);
    }

    public CreateFolderResponse createFolderWithOptions(CreateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateFolderResponse());
    }

    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    public GetBusinessResponse getBusinessWithOptions(GetBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetBusinessResponse());
    }

    public GetBusinessResponse getBusiness(GetBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBusinessWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetInstance", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetFileResponse getFileWithOptions(GetFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetFileResponse());
    }

    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileWithOptions(request, runtime);
    }

    public ListBusinessResponse listBusinessWithOptions(ListBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListBusinessResponse());
    }

    public ListBusinessResponse listBusiness(ListBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBusinessWithOptions(request, runtime);
    }

    public GetMetaDBTableListResponse getMetaDBTableListWithOptions(GetMetaDBTableListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaDBTableList", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaDBTableListResponse());
    }

    public GetMetaDBTableListResponse getMetaDBTableList(GetMetaDBTableListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaDBTableListWithOptions(request, runtime);
    }

    public CheckMetaTableResponse checkMetaTableWithOptions(CheckMetaTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckMetaTable", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CheckMetaTableResponse());
    }

    public CheckMetaTableResponse checkMetaTable(CheckMetaTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMetaTableWithOptions(request, runtime);
    }

    public GetFolderResponse getFolderWithOptions(GetFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFolder", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetFolderResponse());
    }

    public GetFolderResponse getFolder(GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFolderWithOptions(request, runtime);
    }

    public DeployFileResponse deployFileWithOptions(DeployFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeployFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeployFileResponse());
    }

    public DeployFileResponse deployFile(DeployFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployFileWithOptions(request, runtime);
    }

    public DeleteBusinessResponse deleteBusinessWithOptions(DeleteBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteBusinessResponse());
    }

    public DeleteBusinessResponse deleteBusiness(DeleteBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBusinessWithOptions(request, runtime);
    }

    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFileResponse());
    }

    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    public ListQualityRulesResponse listQualityRulesWithOptions(ListQualityRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListQualityRules", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListQualityRulesResponse());
    }

    public ListQualityRulesResponse listQualityRules(ListQualityRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQualityRulesWithOptions(request, runtime);
    }

    public CreateRemindResponse createRemindWithOptions(CreateRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRemind", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateRemindResponse());
    }

    public CreateRemindResponse createRemind(CreateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRemindWithOptions(request, runtime);
    }

    public GetQualityRuleResponse getQualityRuleWithOptions(GetQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetQualityRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetQualityRuleResponse());
    }

    public GetQualityRuleResponse getQualityRule(GetQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityRuleWithOptions(request, runtime);
    }

    public GetDeploymentResponse getDeploymentWithOptions(GetDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDeployment", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDeploymentResponse());
    }

    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeploymentWithOptions(request, runtime);
    }

    public UpdateRemindResponse updateRemindWithOptions(UpdateRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRemind", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateRemindResponse());
    }

    public UpdateRemindResponse updateRemind(UpdateRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRemindWithOptions(request, runtime);
    }

    public GetMetaColumnLineageResponse getMetaColumnLineageWithOptions(GetMetaColumnLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaColumnLineage", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaColumnLineageResponse());
    }

    public GetMetaColumnLineageResponse getMetaColumnLineage(GetMetaColumnLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaColumnLineageWithOptions(request, runtime);
    }

    public UpdateBusinessResponse updateBusinessWithOptions(UpdateBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateBusiness", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateBusinessResponse());
    }

    public UpdateBusinessResponse updateBusiness(UpdateBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBusinessWithOptions(request, runtime);
    }

    public UpdateQualityRuleResponse updateQualityRuleWithOptions(UpdateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateQualityRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateQualityRuleResponse());
    }

    public UpdateQualityRuleResponse updateQualityRule(UpdateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityRuleWithOptions(request, runtime);
    }

    public DeleteQualityRuleResponse deleteQualityRuleWithOptions(DeleteQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteQualityRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteQualityRuleResponse());
    }

    public DeleteQualityRuleResponse deleteQualityRule(DeleteQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRuleWithOptions(request, runtime);
    }

    public SubmitFileResponse submitFileWithOptions(SubmitFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitFile", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new SubmitFileResponse());
    }

    public SubmitFileResponse submitFile(SubmitFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFileWithOptions(request, runtime);
    }

    public GetDataServiceApiResponse getDataServiceApiWithOptions(GetDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDataServiceApiResponse());
    }

    public GetDataServiceApiResponse getDataServiceApi(GetDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServiceApiWithOptions(request, runtime);
    }

    public ListDataServiceApisResponse listDataServiceApisWithOptions(ListDataServiceApisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDataServiceApis", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListDataServiceApisResponse());
    }

    public ListDataServiceApisResponse listDataServiceApis(ListDataServiceApisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataServiceApisWithOptions(request, runtime);
    }

    public GetDataServicePublishedApiResponse getDataServicePublishedApiWithOptions(GetDataServicePublishedApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataServicePublishedApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetDataServicePublishedApiResponse());
    }

    public GetDataServicePublishedApiResponse getDataServicePublishedApi(GetDataServicePublishedApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataServicePublishedApiWithOptions(request, runtime);
    }

    public GetBaselineKeyPathResponse getBaselineKeyPathWithOptions(GetBaselineKeyPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBaselineKeyPath", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetBaselineKeyPathResponse());
    }

    public GetBaselineKeyPathResponse getBaselineKeyPath(GetBaselineKeyPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineKeyPathWithOptions(request, runtime);
    }

    public GetRemindResponse getRemindWithOptions(GetRemindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRemind", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetRemindResponse());
    }

    public GetRemindResponse getRemind(GetRemindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRemindWithOptions(request, runtime);
    }

    public GetMetaTableIntroWikiResponse getMetaTableIntroWikiWithOptions(GetMetaTableIntroWikiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableIntroWiki", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTableIntroWikiResponse());
    }

    public GetMetaTableIntroWikiResponse getMetaTableIntroWiki(GetMetaTableIntroWikiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableIntroWikiWithOptions(request, runtime);
    }

    public GetBaselineStatusResponse getBaselineStatusWithOptions(GetBaselineStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBaselineStatus", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetBaselineStatusResponse());
    }

    public GetBaselineStatusResponse getBaselineStatus(GetBaselineStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBaselineStatusWithOptions(request, runtime);
    }

    public DeleteDataServiceApiResponse deleteDataServiceApiWithOptions(DeleteDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDataServiceApiResponse());
    }

    public DeleteDataServiceApiResponse deleteDataServiceApi(DeleteDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataServiceApiWithOptions(request, runtime);
    }

    public PublishDataServiceApiResponse publishDataServiceApiWithOptions(PublishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PublishDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new PublishDataServiceApiResponse());
    }

    public PublishDataServiceApiResponse publishDataServiceApi(PublishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishDataServiceApiWithOptions(request, runtime);
    }

    public GetMetaTableLineageResponse getMetaTableLineageWithOptions(GetMetaTableLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMetaTableLineage", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetMetaTableLineageResponse());
    }

    public GetMetaTableLineageResponse getMetaTableLineage(GetMetaTableLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableLineageWithOptions(request, runtime);
    }

    public ListBaselineStatusesResponse listBaselineStatusesWithOptions(ListBaselineStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBaselineStatuses", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListBaselineStatusesResponse());
    }

    public ListBaselineStatusesResponse listBaselineStatuses(ListBaselineStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBaselineStatusesWithOptions(request, runtime);
    }

    public ListRemindsResponse listRemindsWithOptions(ListRemindsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListReminds", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new ListRemindsResponse());
    }

    public ListRemindsResponse listReminds(ListRemindsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemindsWithOptions(request, runtime);
    }

    public DeleteQualityEntityResponse deleteQualityEntityWithOptions(DeleteQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteQualityEntity", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteQualityEntityResponse());
    }

    public DeleteQualityEntityResponse deleteQualityEntity(DeleteQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityEntityWithOptions(request, runtime);
    }

    public CreateQualityFollowerResponse createQualityFollowerWithOptions(CreateQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateQualityFollower", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateQualityFollowerResponse());
    }

    public CreateQualityFollowerResponse createQualityFollower(CreateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityFollowerWithOptions(request, runtime);
    }

    public CreateDataServiceApiResponse createDataServiceApiWithOptions(CreateDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateDataServiceApiResponse());
    }

    public CreateDataServiceApiResponse createDataServiceApi(CreateDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataServiceApiWithOptions(request, runtime);
    }

    public AbolishDataServiceApiResponse abolishDataServiceApiWithOptions(AbolishDataServiceApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AbolishDataServiceApi", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new AbolishDataServiceApiResponse());
    }

    public AbolishDataServiceApiResponse abolishDataServiceApi(AbolishDataServiceApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.abolishDataServiceApiWithOptions(request, runtime);
    }

    public GetQualityEntityResponse getQualityEntityWithOptions(GetQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetQualityEntity", "HTTP", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetQualityEntityResponse());
    }

    public GetQualityEntityResponse getQualityEntity(GetQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityEntityWithOptions(request, runtime);
    }

    public GetQualityFollowerResponse getQualityFollowerWithOptions(GetQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetQualityFollower", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new GetQualityFollowerResponse());
    }

    public GetQualityFollowerResponse getQualityFollower(GetQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQualityFollowerWithOptions(request, runtime);
    }

    public DeleteQualityFollowerResponse deleteQualityFollowerWithOptions(DeleteQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteQualityFollower", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteQualityFollowerResponse());
    }

    public DeleteQualityFollowerResponse deleteQualityFollower(DeleteQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityFollowerWithOptions(request, runtime);
    }

    public CreateQualityEntityResponse createQualityEntityWithOptions(CreateQualityEntityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateQualityEntity", "HTTP", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateQualityEntityResponse());
    }

    public CreateQualityEntityResponse createQualityEntity(CreateQualityEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityEntityWithOptions(request, runtime);
    }

    public CreateQualityRuleResponse createQualityRuleWithOptions(CreateQualityRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateQualityRule", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateQualityRuleResponse());
    }

    public CreateQualityRuleResponse createQualityRule(CreateQualityRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRuleWithOptions(request, runtime);
    }

    public UpdateQualityFollowerResponse updateQualityFollowerWithOptions(UpdateQualityFollowerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateQualityFollower", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new UpdateQualityFollowerResponse());
    }

    public UpdateQualityFollowerResponse updateQualityFollower(UpdateQualityFollowerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQualityFollowerWithOptions(request, runtime);
    }

    public CreateQualityRelativeNodeResponse createQualityRelativeNodeWithOptions(CreateQualityRelativeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateQualityRelativeNode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new CreateQualityRelativeNodeResponse());
    }

    public CreateQualityRelativeNodeResponse createQualityRelativeNode(CreateQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQualityRelativeNodeWithOptions(request, runtime);
    }

    public DeleteQualityRelativeNodeResponse deleteQualityRelativeNodeWithOptions(DeleteQualityRelativeNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteQualityRelativeNode", "HTTPS", "POST", "2020-05-18", "AK", null, TeaModel.buildMap(request), runtime), new DeleteQualityRelativeNodeResponse());
    }

    public DeleteQualityRelativeNodeResponse deleteQualityRelativeNode(DeleteQualityRelativeNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQualityRelativeNodeWithOptions(request, runtime);
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
}

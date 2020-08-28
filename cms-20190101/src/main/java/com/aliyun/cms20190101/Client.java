// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101;

import com.aliyun.tea.*;
import com.aliyun.cms20190101.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeExporterOutputListResponse describeExporterOutputListWithOptions(DescribeExporterOutputListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeExporterOutputList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeExporterOutputListResponse());
    }

    public DescribeExporterOutputListResponse describeExporterOutputList(DescribeExporterOutputListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExporterOutputListWithOptions(request, runtime);
    }

    public DeleteExporterOutputResponse deleteExporterOutputWithOptions(DeleteExporterOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteExporterOutput", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteExporterOutputResponse());
    }

    public DeleteExporterOutputResponse deleteExporterOutput(DeleteExporterOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExporterOutputWithOptions(request, runtime);
    }

    public PutExporterOutputResponse putExporterOutputWithOptions(PutExporterOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutExporterOutput", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutExporterOutputResponse());
    }

    public PutExporterOutputResponse putExporterOutput(PutExporterOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putExporterOutputWithOptions(request, runtime);
    }

    public DescribeFolderListResponse describeFolderListWithOptions(DescribeFolderListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeFolderList", "HTTPS", "GET", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeFolderListResponse());
    }

    public DescribeFolderListResponse describeFolderList(DescribeFolderListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFolderListWithOptions(request, runtime);
    }

    public DeleteExporterRuleResponse deleteExporterRuleWithOptions(DeleteExporterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteExporterRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteExporterRuleResponse());
    }

    public DeleteExporterRuleResponse deleteExporterRule(DeleteExporterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExporterRuleWithOptions(request, runtime);
    }

    public DescribeExporterRuleListResponse describeExporterRuleListWithOptions(DescribeExporterRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeExporterRuleList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeExporterRuleListResponse());
    }

    public DescribeExporterRuleListResponse describeExporterRuleList(DescribeExporterRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExporterRuleListWithOptions(request, runtime);
    }

    public PutExporterRuleResponse putExporterRuleWithOptions(PutExporterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutExporterRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutExporterRuleResponse());
    }

    public PutExporterRuleResponse putExporterRule(PutExporterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putExporterRuleWithOptions(request, runtime);
    }

    public DescribeDynamicTagRuleListResponse describeDynamicTagRuleListWithOptions(DescribeDynamicTagRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDynamicTagRuleList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDynamicTagRuleListResponse());
    }

    public DescribeDynamicTagRuleListResponse describeDynamicTagRuleList(DescribeDynamicTagRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDynamicTagRuleListWithOptions(request, runtime);
    }

    public DescribeProductResourceTagKeyListResponse describeProductResourceTagKeyListWithOptions(DescribeProductResourceTagKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeProductResourceTagKeyList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeProductResourceTagKeyListResponse());
    }

    public DescribeProductResourceTagKeyListResponse describeProductResourceTagKeyList(DescribeProductResourceTagKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductResourceTagKeyListWithOptions(request, runtime);
    }

    public CreateDynamicTagGroupResponse createDynamicTagGroupWithOptions(CreateDynamicTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDynamicTagGroup", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateDynamicTagGroupResponse());
    }

    public CreateDynamicTagGroupResponse createDynamicTagGroup(CreateDynamicTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDynamicTagGroupWithOptions(request, runtime);
    }

    public DeleteDynamicTagGroupResponse deleteDynamicTagGroupWithOptions(DeleteDynamicTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDynamicTagGroup", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDynamicTagGroupResponse());
    }

    public DeleteDynamicTagGroupResponse deleteDynamicTagGroup(DeleteDynamicTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDynamicTagGroupWithOptions(request, runtime);
    }

    public ModifyGroupMonitoringAgentProcessResponse modifyGroupMonitoringAgentProcessWithOptions(ModifyGroupMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyGroupMonitoringAgentProcess", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyGroupMonitoringAgentProcessResponse());
    }

    public ModifyGroupMonitoringAgentProcessResponse modifyGroupMonitoringAgentProcess(ModifyGroupMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    public DeleteGroupMonitoringAgentProcessResponse deleteGroupMonitoringAgentProcessWithOptions(DeleteGroupMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGroupMonitoringAgentProcess", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGroupMonitoringAgentProcessResponse());
    }

    public DeleteGroupMonitoringAgentProcessResponse deleteGroupMonitoringAgentProcess(DeleteGroupMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    public CreateGroupMonitoringAgentProcessResponse createGroupMonitoringAgentProcessWithOptions(CreateGroupMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGroupMonitoringAgentProcess", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateGroupMonitoringAgentProcessResponse());
    }

    public CreateGroupMonitoringAgentProcessResponse createGroupMonitoringAgentProcess(CreateGroupMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    public DescribeTagKeyListResponse describeTagKeyListWithOptions(DescribeTagKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTagKeyList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTagKeyListResponse());
    }

    public DescribeTagKeyListResponse describeTagKeyList(DescribeTagKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagKeyListWithOptions(request, runtime);
    }

    public DescribeTagValueListResponse describeTagValueListWithOptions(DescribeTagValueListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTagValueList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTagValueListResponse());
    }

    public DescribeTagValueListResponse describeTagValueList(DescribeTagValueListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagValueListWithOptions(request, runtime);
    }

    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveTags", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new RemoveTagsResponse());
    }

    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddTags", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new AddTagsResponse());
    }

    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    public DescribeGroupMonitoringAgentProcessResponse describeGroupMonitoringAgentProcessWithOptions(DescribeGroupMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGroupMonitoringAgentProcess", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGroupMonitoringAgentProcessResponse());
    }

    public DescribeGroupMonitoringAgentProcessResponse describeGroupMonitoringAgentProcess(DescribeGroupMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    public PutResourceMetricRulesResponse putResourceMetricRulesWithOptions(PutResourceMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutResourceMetricRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutResourceMetricRulesResponse());
    }

    public PutResourceMetricRulesResponse putResourceMetricRules(PutResourceMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putResourceMetricRulesWithOptions(request, runtime);
    }

    public CreateMetricRuleResourcesResponse createMetricRuleResourcesWithOptions(CreateMetricRuleResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMetricRuleResources", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateMetricRuleResourcesResponse());
    }

    public CreateMetricRuleResourcesResponse createMetricRuleResources(CreateMetricRuleResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetricRuleResourcesWithOptions(request, runtime);
    }

    public DeleteMetricRuleResourcesResponse deleteMetricRuleResourcesWithOptions(DeleteMetricRuleResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMetricRuleResources", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMetricRuleResourcesResponse());
    }

    public DeleteMetricRuleResourcesResponse deleteMetricRuleResources(DeleteMetricRuleResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRuleResourcesWithOptions(request, runtime);
    }

    public DeleteMetricRuleTargetsResponse deleteMetricRuleTargetsWithOptions(DeleteMetricRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMetricRuleTargets", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMetricRuleTargetsResponse());
    }

    public DeleteMetricRuleTargetsResponse deleteMetricRuleTargets(DeleteMetricRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRuleTargetsWithOptions(request, runtime);
    }

    public PutMetricRuleTargetsResponse putMetricRuleTargetsWithOptions(PutMetricRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutMetricRuleTargets", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutMetricRuleTargetsResponse());
    }

    public PutMetricRuleTargetsResponse putMetricRuleTargets(PutMetricRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMetricRuleTargetsWithOptions(request, runtime);
    }

    public DescribeMetricRuleTargetsResponse describeMetricRuleTargetsWithOptions(DescribeMetricRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricRuleTargets", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricRuleTargetsResponse());
    }

    public DescribeMetricRuleTargetsResponse describeMetricRuleTargets(DescribeMetricRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleTargetsWithOptions(request, runtime);
    }

    public ModifyMonitorGroupInstancesResponse modifyMonitorGroupInstancesWithOptions(ModifyMonitorGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyMonitorGroupInstances", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyMonitorGroupInstancesResponse());
    }

    public ModifyMonitorGroupInstancesResponse modifyMonitorGroupInstances(ModifyMonitorGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMonitorGroupInstancesWithOptions(request, runtime);
    }

    public DescribeMonitoringAgentStatusesResponse describeMonitoringAgentStatusesWithOptions(DescribeMonitoringAgentStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitoringAgentStatuses", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitoringAgentStatusesResponse());
    }

    public DescribeMonitoringAgentStatusesResponse describeMonitoringAgentStatuses(DescribeMonitoringAgentStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentStatusesWithOptions(request, runtime);
    }

    public CreateMonitorAgentProcessResponse createMonitorAgentProcessWithOptions(CreateMonitorAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMonitorAgentProcess", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateMonitorAgentProcessResponse());
    }

    public CreateMonitorAgentProcessResponse createMonitorAgentProcess(CreateMonitorAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorAgentProcessWithOptions(request, runtime);
    }

    public DescribeAlertHistoryListResponse describeAlertHistoryListWithOptions(DescribeAlertHistoryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAlertHistoryList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAlertHistoryListResponse());
    }

    public DescribeAlertHistoryListResponse describeAlertHistoryList(DescribeAlertHistoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertHistoryListWithOptions(request, runtime);
    }

    public DescribeAlertingMetricRuleResourcesResponse describeAlertingMetricRuleResourcesWithOptions(DescribeAlertingMetricRuleResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAlertingMetricRuleResources", "HTTPS", "GET", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAlertingMetricRuleResourcesResponse());
    }

    public DescribeAlertingMetricRuleResourcesResponse describeAlertingMetricRuleResources(DescribeAlertingMetricRuleResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertingMetricRuleResourcesWithOptions(request, runtime);
    }

    public DisableActiveMetricRuleResponse disableActiveMetricRuleWithOptions(DisableActiveMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableActiveMetricRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DisableActiveMetricRuleResponse());
    }

    public DisableActiveMetricRuleResponse disableActiveMetricRule(DisableActiveMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableActiveMetricRuleWithOptions(request, runtime);
    }

    public DescribeActiveMetricRuleListResponse describeActiveMetricRuleListWithOptions(DescribeActiveMetricRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeActiveMetricRuleList", "HTTPS", "GET", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeActiveMetricRuleListResponse());
    }

    public DescribeActiveMetricRuleListResponse describeActiveMetricRuleList(DescribeActiveMetricRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveMetricRuleListWithOptions(request, runtime);
    }

    public DescribeProductsOfActiveMetricRuleResponse describeProductsOfActiveMetricRuleWithOptions(DescribeProductsOfActiveMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeProductsOfActiveMetricRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeProductsOfActiveMetricRuleResponse());
    }

    public DescribeProductsOfActiveMetricRuleResponse describeProductsOfActiveMetricRule(DescribeProductsOfActiveMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductsOfActiveMetricRuleWithOptions(request, runtime);
    }

    public EnableActiveMetricRuleResponse enableActiveMetricRuleWithOptions(EnableActiveMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableActiveMetricRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new EnableActiveMetricRuleResponse());
    }

    public EnableActiveMetricRuleResponse enableActiveMetricRule(EnableActiveMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableActiveMetricRuleWithOptions(request, runtime);
    }

    public DescribeMonitorGroupInstanceAttributeResponse describeMonitorGroupInstanceAttributeWithOptions(DescribeMonitorGroupInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitorGroupInstanceAttribute", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitorGroupInstanceAttributeResponse());
    }

    public DescribeMonitorGroupInstanceAttributeResponse describeMonitorGroupInstanceAttribute(DescribeMonitorGroupInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeMonitorGroupNotifyPolicyListResponse describeMonitorGroupNotifyPolicyListWithOptions(DescribeMonitorGroupNotifyPolicyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitorGroupNotifyPolicyList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitorGroupNotifyPolicyListResponse());
    }

    public DescribeMonitorGroupNotifyPolicyListResponse describeMonitorGroupNotifyPolicyList(DescribeMonitorGroupNotifyPolicyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupNotifyPolicyListWithOptions(request, runtime);
    }

    public DeleteMonitorGroupResponse deleteMonitorGroupWithOptions(DeleteMonitorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMonitorGroup", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMonitorGroupResponse());
    }

    public DeleteMonitorGroupResponse deleteMonitorGroup(DeleteMonitorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupWithOptions(request, runtime);
    }

    public CreateMonitorGroupResponse createMonitorGroupWithOptions(CreateMonitorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMonitorGroup", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateMonitorGroupResponse());
    }

    public CreateMonitorGroupResponse createMonitorGroup(CreateMonitorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorGroupWithOptions(request, runtime);
    }

    public DescribeMonitorGroupsResponse describeMonitorGroupsWithOptions(DescribeMonitorGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitorGroups", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitorGroupsResponse());
    }

    public DescribeMonitorGroupsResponse describeMonitorGroups(DescribeMonitorGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupsWithOptions(request, runtime);
    }

    public DeleteMonitorGroupNotifyPolicyResponse deleteMonitorGroupNotifyPolicyWithOptions(DeleteMonitorGroupNotifyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMonitorGroupNotifyPolicy", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMonitorGroupNotifyPolicyResponse());
    }

    public DeleteMonitorGroupNotifyPolicyResponse deleteMonitorGroupNotifyPolicy(DeleteMonitorGroupNotifyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupNotifyPolicyWithOptions(request, runtime);
    }

    public DescribeMonitorGroupDynamicRulesResponse describeMonitorGroupDynamicRulesWithOptions(DescribeMonitorGroupDynamicRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitorGroupDynamicRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitorGroupDynamicRulesResponse());
    }

    public DescribeMonitorGroupDynamicRulesResponse describeMonitorGroupDynamicRules(DescribeMonitorGroupDynamicRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupDynamicRulesWithOptions(request, runtime);
    }

    public CreateMonitorGroupInstancesResponse createMonitorGroupInstancesWithOptions(CreateMonitorGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMonitorGroupInstances", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateMonitorGroupInstancesResponse());
    }

    public CreateMonitorGroupInstancesResponse createMonitorGroupInstances(CreateMonitorGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorGroupInstancesWithOptions(request, runtime);
    }

    public CreateMonitorGroupNotifyPolicyResponse createMonitorGroupNotifyPolicyWithOptions(CreateMonitorGroupNotifyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMonitorGroupNotifyPolicy", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateMonitorGroupNotifyPolicyResponse());
    }

    public CreateMonitorGroupNotifyPolicyResponse createMonitorGroupNotifyPolicy(CreateMonitorGroupNotifyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorGroupNotifyPolicyWithOptions(request, runtime);
    }

    public DeleteMonitorGroupInstancesResponse deleteMonitorGroupInstancesWithOptions(DeleteMonitorGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMonitorGroupInstances", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMonitorGroupInstancesResponse());
    }

    public DeleteMonitorGroupInstancesResponse deleteMonitorGroupInstances(DeleteMonitorGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupInstancesWithOptions(request, runtime);
    }

    public DeleteMonitorGroupDynamicRuleResponse deleteMonitorGroupDynamicRuleWithOptions(DeleteMonitorGroupDynamicRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMonitorGroupDynamicRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMonitorGroupDynamicRuleResponse());
    }

    public DeleteMonitorGroupDynamicRuleResponse deleteMonitorGroupDynamicRule(DeleteMonitorGroupDynamicRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupDynamicRuleWithOptions(request, runtime);
    }

    public PutMonitorGroupDynamicRuleResponse putMonitorGroupDynamicRuleWithOptions(PutMonitorGroupDynamicRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutMonitorGroupDynamicRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutMonitorGroupDynamicRuleResponse());
    }

    public PutMonitorGroupDynamicRuleResponse putMonitorGroupDynamicRule(PutMonitorGroupDynamicRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMonitorGroupDynamicRuleWithOptions(request, runtime);
    }

    public DescribeMonitorGroupInstancesResponse describeMonitorGroupInstancesWithOptions(DescribeMonitorGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitorGroupInstances", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitorGroupInstancesResponse());
    }

    public DescribeMonitorGroupInstancesResponse describeMonitorGroupInstances(DescribeMonitorGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupInstancesWithOptions(request, runtime);
    }

    public DescribeMonitorGroupCategoriesResponse describeMonitorGroupCategoriesWithOptions(DescribeMonitorGroupCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitorGroupCategories", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitorGroupCategoriesResponse());
    }

    public DescribeMonitorGroupCategoriesResponse describeMonitorGroupCategories(DescribeMonitorGroupCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupCategoriesWithOptions(request, runtime);
    }

    public ModifyMonitorGroupResponse modifyMonitorGroupWithOptions(ModifyMonitorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyMonitorGroup", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyMonitorGroupResponse());
    }

    public ModifyMonitorGroupResponse modifyMonitorGroup(ModifyMonitorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMonitorGroupWithOptions(request, runtime);
    }

    public DescribeMetricRuleListResponse describeMetricRuleListWithOptions(DescribeMetricRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricRuleList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricRuleListResponse());
    }

    public DescribeMetricRuleListResponse describeMetricRuleList(DescribeMetricRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleListWithOptions(request, runtime);
    }

    public PutResourceMetricRuleResponse putResourceMetricRuleWithOptions(PutResourceMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutResourceMetricRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutResourceMetricRuleResponse());
    }

    public PutResourceMetricRuleResponse putResourceMetricRule(PutResourceMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putResourceMetricRuleWithOptions(request, runtime);
    }

    public PutGroupMetricRuleResponse putGroupMetricRuleWithOptions(PutGroupMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutGroupMetricRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutGroupMetricRuleResponse());
    }

    public PutGroupMetricRuleResponse putGroupMetricRule(PutGroupMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putGroupMetricRuleWithOptions(request, runtime);
    }

    public EnableMetricRulesResponse enableMetricRulesWithOptions(EnableMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableMetricRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new EnableMetricRulesResponse());
    }

    public EnableMetricRulesResponse enableMetricRules(EnableMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableMetricRulesWithOptions(request, runtime);
    }

    public DescribeMetricRuleCountResponse describeMetricRuleCountWithOptions(DescribeMetricRuleCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricRuleCount", "HTTPS", "GET", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricRuleCountResponse());
    }

    public DescribeMetricRuleCountResponse describeMetricRuleCount(DescribeMetricRuleCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleCountWithOptions(request, runtime);
    }

    public CreateGroupMetricRulesResponse createGroupMetricRulesWithOptions(CreateGroupMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGroupMetricRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateGroupMetricRulesResponse());
    }

    public CreateGroupMetricRulesResponse createGroupMetricRules(CreateGroupMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupMetricRulesWithOptions(request, runtime);
    }

    public DisableMetricRulesResponse disableMetricRulesWithOptions(DisableMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableMetricRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DisableMetricRulesResponse());
    }

    public DisableMetricRulesResponse disableMetricRules(DisableMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableMetricRulesWithOptions(request, runtime);
    }

    public DeleteMetricRulesResponse deleteMetricRulesWithOptions(DeleteMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMetricRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMetricRulesResponse());
    }

    public DeleteMetricRulesResponse deleteMetricRules(DeleteMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRulesWithOptions(request, runtime);
    }

    public ModifyMetricRuleTemplateResponse modifyMetricRuleTemplateWithOptions(ModifyMetricRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyMetricRuleTemplate", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyMetricRuleTemplateResponse());
    }

    public ModifyMetricRuleTemplateResponse modifyMetricRuleTemplate(ModifyMetricRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMetricRuleTemplateWithOptions(request, runtime);
    }

    public ApplyMetricRuleTemplateResponse applyMetricRuleTemplateWithOptions(ApplyMetricRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ApplyMetricRuleTemplate", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new ApplyMetricRuleTemplateResponse());
    }

    public ApplyMetricRuleTemplateResponse applyMetricRuleTemplate(ApplyMetricRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyMetricRuleTemplateWithOptions(request, runtime);
    }

    public DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttributeWithOptions(DescribeMetricRuleTemplateAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricRuleTemplateAttribute", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricRuleTemplateAttributeResponse());
    }

    public DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttribute(DescribeMetricRuleTemplateAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleTemplateAttributeWithOptions(request, runtime);
    }

    public CreateMetricRuleTemplateResponse createMetricRuleTemplateWithOptions(CreateMetricRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMetricRuleTemplate", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateMetricRuleTemplateResponse());
    }

    public CreateMetricRuleTemplateResponse createMetricRuleTemplate(CreateMetricRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetricRuleTemplateWithOptions(request, runtime);
    }

    public DeleteMetricRuleTemplateResponse deleteMetricRuleTemplateWithOptions(DeleteMetricRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMetricRuleTemplate", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMetricRuleTemplateResponse());
    }

    public DeleteMetricRuleTemplateResponse deleteMetricRuleTemplate(DeleteMetricRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRuleTemplateWithOptions(request, runtime);
    }

    public DescribeMetricRuleTemplateListResponse describeMetricRuleTemplateListWithOptions(DescribeMetricRuleTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricRuleTemplateList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricRuleTemplateListResponse());
    }

    public DescribeMetricRuleTemplateListResponse describeMetricRuleTemplateList(DescribeMetricRuleTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleTemplateListWithOptions(request, runtime);
    }

    public PutCustomEventResponse putCustomEventWithOptions(PutCustomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutCustomEvent", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutCustomEventResponse());
    }

    public PutCustomEventResponse putCustomEvent(PutCustomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putCustomEventWithOptions(request, runtime);
    }

    public DescribeCustomEventCountResponse describeCustomEventCountWithOptions(DescribeCustomEventCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCustomEventCount", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomEventCountResponse());
    }

    public DescribeCustomEventCountResponse describeCustomEventCount(DescribeCustomEventCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomEventCountWithOptions(request, runtime);
    }

    public DescribeCustomEventAttributeResponse describeCustomEventAttributeWithOptions(DescribeCustomEventAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCustomEventAttribute", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomEventAttributeResponse());
    }

    public DescribeCustomEventAttributeResponse describeCustomEventAttribute(DescribeCustomEventAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomEventAttributeWithOptions(request, runtime);
    }

    public DescribeCustomEventHistogramResponse describeCustomEventHistogramWithOptions(DescribeCustomEventHistogramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCustomEventHistogram", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomEventHistogramResponse());
    }

    public DescribeCustomEventHistogramResponse describeCustomEventHistogram(DescribeCustomEventHistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomEventHistogramWithOptions(request, runtime);
    }

    public DeleteCustomMetricResponse deleteCustomMetricWithOptions(DeleteCustomMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCustomMetric", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCustomMetricResponse());
    }

    public DeleteCustomMetricResponse deleteCustomMetric(DeleteCustomMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomMetricWithOptions(request, runtime);
    }

    public DescribeCustomMetricListResponse describeCustomMetricListWithOptions(DescribeCustomMetricListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCustomMetricList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomMetricListResponse());
    }

    public DescribeCustomMetricListResponse describeCustomMetricList(DescribeCustomMetricListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomMetricListWithOptions(request, runtime);
    }

    public PutCustomMetricResponse putCustomMetricWithOptions(PutCustomMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutCustomMetric", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutCustomMetricResponse());
    }

    public PutCustomMetricResponse putCustomMetric(PutCustomMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putCustomMetricWithOptions(request, runtime);
    }

    public DescribeEventRuleAttributeResponse describeEventRuleAttributeWithOptions(DescribeEventRuleAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEventRuleAttribute", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEventRuleAttributeResponse());
    }

    public DescribeEventRuleAttributeResponse describeEventRuleAttribute(DescribeEventRuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventRuleAttributeWithOptions(request, runtime);
    }

    public DeleteContactGroupResponse deleteContactGroupWithOptions(DeleteContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteContactGroup", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteContactGroupResponse());
    }

    public DeleteContactGroupResponse deleteContactGroup(DeleteContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactGroupWithOptions(request, runtime);
    }

    public DescribeContactListResponse describeContactListWithOptions(DescribeContactListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeContactList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeContactListResponse());
    }

    public DescribeContactListResponse describeContactList(DescribeContactListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContactListWithOptions(request, runtime);
    }

    public DescribeContactListByContactGroupResponse describeContactListByContactGroupWithOptions(DescribeContactListByContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeContactListByContactGroup", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeContactListByContactGroupResponse());
    }

    public DescribeContactListByContactGroupResponse describeContactListByContactGroup(DescribeContactListByContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContactListByContactGroupWithOptions(request, runtime);
    }

    public DeleteContactResponse deleteContactWithOptions(DeleteContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteContact", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteContactResponse());
    }

    public DeleteContactResponse deleteContact(DeleteContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactWithOptions(request, runtime);
    }

    public PutContactGroupResponse putContactGroupWithOptions(PutContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutContactGroup", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutContactGroupResponse());
    }

    public PutContactGroupResponse putContactGroup(PutContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putContactGroupWithOptions(request, runtime);
    }

    public PutContactResponse putContactWithOptions(PutContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutContact", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutContactResponse());
    }

    public PutContactResponse putContact(PutContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putContactWithOptions(request, runtime);
    }

    public DescribeContactGroupListResponse describeContactGroupListWithOptions(DescribeContactGroupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeContactGroupList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeContactGroupListResponse());
    }

    public DescribeContactGroupListResponse describeContactGroupList(DescribeContactGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContactGroupListWithOptions(request, runtime);
    }

    public PutEventRuleTargetsResponse putEventRuleTargetsWithOptions(PutEventRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutEventRuleTargets", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutEventRuleTargetsResponse());
    }

    public PutEventRuleTargetsResponse putEventRuleTargets(PutEventRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEventRuleTargetsWithOptions(request, runtime);
    }

    public DeleteEventRuleTargetsResponse deleteEventRuleTargetsWithOptions(DeleteEventRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEventRuleTargets", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEventRuleTargetsResponse());
    }

    public DeleteEventRuleTargetsResponse deleteEventRuleTargets(DeleteEventRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRuleTargetsWithOptions(request, runtime);
    }

    public DisableEventRulesResponse disableEventRulesWithOptions(DisableEventRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableEventRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DisableEventRulesResponse());
    }

    public DisableEventRulesResponse disableEventRules(DisableEventRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableEventRulesWithOptions(request, runtime);
    }

    public DescribeEventRuleTargetListResponse describeEventRuleTargetListWithOptions(DescribeEventRuleTargetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEventRuleTargetList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEventRuleTargetListResponse());
    }

    public DescribeEventRuleTargetListResponse describeEventRuleTargetList(DescribeEventRuleTargetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventRuleTargetListWithOptions(request, runtime);
    }

    public DeleteEventRulesResponse deleteEventRulesWithOptions(DeleteEventRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEventRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEventRulesResponse());
    }

    public DeleteEventRulesResponse deleteEventRules(DeleteEventRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRulesWithOptions(request, runtime);
    }

    public EnableEventRulesResponse enableEventRulesWithOptions(EnableEventRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableEventRules", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new EnableEventRulesResponse());
    }

    public EnableEventRulesResponse enableEventRules(EnableEventRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableEventRulesWithOptions(request, runtime);
    }

    public PutEventRuleResponse putEventRuleWithOptions(PutEventRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutEventRule", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutEventRuleResponse());
    }

    public PutEventRuleResponse putEventRule(PutEventRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEventRuleWithOptions(request, runtime);
    }

    public DescribeEventRuleListResponse describeEventRuleListWithOptions(DescribeEventRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEventRuleList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEventRuleListResponse());
    }

    public DescribeEventRuleListResponse describeEventRuleList(DescribeEventRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventRuleListWithOptions(request, runtime);
    }

    public DescribeSystemEventAttributeResponse describeSystemEventAttributeWithOptions(DescribeSystemEventAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSystemEventAttribute", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSystemEventAttributeResponse());
    }

    public DescribeSystemEventAttributeResponse describeSystemEventAttribute(DescribeSystemEventAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemEventAttributeWithOptions(request, runtime);
    }

    public DescribeSystemEventHistogramResponse describeSystemEventHistogramWithOptions(DescribeSystemEventHistogramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSystemEventHistogram", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSystemEventHistogramResponse());
    }

    public DescribeSystemEventHistogramResponse describeSystemEventHistogram(DescribeSystemEventHistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemEventHistogramWithOptions(request, runtime);
    }

    public DescribeSystemEventCountResponse describeSystemEventCountWithOptions(DescribeSystemEventCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSystemEventCount", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSystemEventCountResponse());
    }

    public DescribeSystemEventCountResponse describeSystemEventCount(DescribeSystemEventCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemEventCountWithOptions(request, runtime);
    }

    public DescribeSystemEventMetaListResponse describeSystemEventMetaListWithOptions(DescribeSystemEventMetaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSystemEventMetaList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSystemEventMetaListResponse());
    }

    public DescribeSystemEventMetaListResponse describeSystemEventMetaList(DescribeSystemEventMetaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemEventMetaListWithOptions(request, runtime);
    }

    public DescribeMonitoringAgentProcessesResponse describeMonitoringAgentProcessesWithOptions(DescribeMonitoringAgentProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitoringAgentProcesses", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitoringAgentProcessesResponse());
    }

    public DescribeMonitoringAgentProcessesResponse describeMonitoringAgentProcesses(DescribeMonitoringAgentProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentProcessesWithOptions(request, runtime);
    }

    public UninstallMonitoringAgentResponse uninstallMonitoringAgentWithOptions(UninstallMonitoringAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UninstallMonitoringAgent", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new UninstallMonitoringAgentResponse());
    }

    public UninstallMonitoringAgentResponse uninstallMonitoringAgent(UninstallMonitoringAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallMonitoringAgentWithOptions(request, runtime);
    }

    public DescribeMonitoringAgentAccessKeyResponse describeMonitoringAgentAccessKeyWithOptions(DescribeMonitoringAgentAccessKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitoringAgentAccessKey", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitoringAgentAccessKeyResponse());
    }

    public DescribeMonitoringAgentAccessKeyResponse describeMonitoringAgentAccessKey(DescribeMonitoringAgentAccessKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentAccessKeyWithOptions(request, runtime);
    }

    public InstallMonitoringAgentResponse installMonitoringAgentWithOptions(InstallMonitoringAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InstallMonitoringAgent", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new InstallMonitoringAgentResponse());
    }

    public InstallMonitoringAgentResponse installMonitoringAgent(InstallMonitoringAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installMonitoringAgentWithOptions(request, runtime);
    }

    public SendDryRunSystemEventResponse sendDryRunSystemEventWithOptions(SendDryRunSystemEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SendDryRunSystemEvent", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new SendDryRunSystemEventResponse());
    }

    public SendDryRunSystemEventResponse sendDryRunSystemEvent(SendDryRunSystemEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendDryRunSystemEventWithOptions(request, runtime);
    }

    public CreateMonitoringAgentProcessResponse createMonitoringAgentProcessWithOptions(CreateMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMonitoringAgentProcess", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateMonitoringAgentProcessResponse());
    }

    public CreateMonitoringAgentProcessResponse createMonitoringAgentProcess(CreateMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitoringAgentProcessWithOptions(request, runtime);
    }

    public DescribeMonitoringAgentConfigResponse describeMonitoringAgentConfigWithOptions(DescribeMonitoringAgentConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitoringAgentConfig", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitoringAgentConfigResponse());
    }

    public DescribeMonitoringAgentConfigResponse describeMonitoringAgentConfig(DescribeMonitoringAgentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentConfigWithOptions(request, runtime);
    }

    public DeleteMonitoringAgentProcessResponse deleteMonitoringAgentProcessWithOptions(DeleteMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteMonitoringAgentProcess", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteMonitoringAgentProcessResponse());
    }

    public DeleteMonitoringAgentProcessResponse deleteMonitoringAgentProcess(DeleteMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitoringAgentProcessWithOptions(request, runtime);
    }

    public DescribeMonitoringAgentHostsResponse describeMonitoringAgentHostsWithOptions(DescribeMonitoringAgentHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitoringAgentHosts", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitoringAgentHostsResponse());
    }

    public DescribeMonitoringAgentHostsResponse describeMonitoringAgentHosts(DescribeMonitoringAgentHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentHostsWithOptions(request, runtime);
    }

    public DescribeSiteMonitorDataResponse describeSiteMonitorDataWithOptions(DescribeSiteMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSiteMonitorData", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSiteMonitorDataResponse());
    }

    public DescribeSiteMonitorDataResponse describeSiteMonitorData(DescribeSiteMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorDataWithOptions(request, runtime);
    }

    public ModifySiteMonitorResponse modifySiteMonitorWithOptions(ModifySiteMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifySiteMonitor", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifySiteMonitorResponse());
    }

    public ModifySiteMonitorResponse modifySiteMonitor(ModifySiteMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySiteMonitorWithOptions(request, runtime);
    }

    public DescribeSiteMonitorISPCityListResponse describeSiteMonitorISPCityListWithOptions(DescribeSiteMonitorISPCityListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSiteMonitorISPCityList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSiteMonitorISPCityListResponse());
    }

    public DescribeSiteMonitorISPCityListResponse describeSiteMonitorISPCityList(DescribeSiteMonitorISPCityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorISPCityListWithOptions(request, runtime);
    }

    public DescribeSiteMonitorQuotaResponse describeSiteMonitorQuotaWithOptions(DescribeSiteMonitorQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSiteMonitorQuota", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSiteMonitorQuotaResponse());
    }

    public DescribeSiteMonitorQuotaResponse describeSiteMonitorQuota(DescribeSiteMonitorQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorQuotaWithOptions(request, runtime);
    }

    public DescribeSiteMonitorStatisticsResponse describeSiteMonitorStatisticsWithOptions(DescribeSiteMonitorStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSiteMonitorStatistics", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSiteMonitorStatisticsResponse());
    }

    public DescribeSiteMonitorStatisticsResponse describeSiteMonitorStatistics(DescribeSiteMonitorStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorStatisticsWithOptions(request, runtime);
    }

    public EnableSiteMonitorsResponse enableSiteMonitorsWithOptions(EnableSiteMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableSiteMonitors", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new EnableSiteMonitorsResponse());
    }

    public EnableSiteMonitorsResponse enableSiteMonitors(EnableSiteMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSiteMonitorsWithOptions(request, runtime);
    }

    public DescribeSiteMonitorAttributeResponse describeSiteMonitorAttributeWithOptions(DescribeSiteMonitorAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSiteMonitorAttribute", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSiteMonitorAttributeResponse());
    }

    public DescribeSiteMonitorAttributeResponse describeSiteMonitorAttribute(DescribeSiteMonitorAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorAttributeWithOptions(request, runtime);
    }

    public DescribeSiteMonitorListResponse describeSiteMonitorListWithOptions(DescribeSiteMonitorListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSiteMonitorList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSiteMonitorListResponse());
    }

    public DescribeSiteMonitorListResponse describeSiteMonitorList(DescribeSiteMonitorListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorListWithOptions(request, runtime);
    }

    public DeleteSiteMonitorsResponse deleteSiteMonitorsWithOptions(DeleteSiteMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSiteMonitors", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSiteMonitorsResponse());
    }

    public DeleteSiteMonitorsResponse deleteSiteMonitors(DeleteSiteMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSiteMonitorsWithOptions(request, runtime);
    }

    public DisableSiteMonitorsResponse disableSiteMonitorsWithOptions(DisableSiteMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableSiteMonitors", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DisableSiteMonitorsResponse());
    }

    public DisableSiteMonitorsResponse disableSiteMonitors(DisableSiteMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSiteMonitorsWithOptions(request, runtime);
    }

    public CreateSiteMonitorResponse createSiteMonitorWithOptions(CreateSiteMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSiteMonitor", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateSiteMonitorResponse());
    }

    public CreateSiteMonitorResponse createSiteMonitor(CreateSiteMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSiteMonitorWithOptions(request, runtime);
    }

    public DescribeProjectMetaResponse describeProjectMetaWithOptions(DescribeProjectMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeProjectMeta", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeProjectMetaResponse());
    }

    public DescribeProjectMetaResponse describeProjectMeta(DescribeProjectMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectMetaWithOptions(request, runtime);
    }

    public DescribeMetricListResponse describeMetricListWithOptions(DescribeMetricListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricListResponse());
    }

    public DescribeMetricListResponse describeMetricList(DescribeMetricListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricListWithOptions(request, runtime);
    }

    public DescribeMetricMetaListResponse describeMetricMetaListWithOptions(DescribeMetricMetaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricMetaList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricMetaListResponse());
    }

    public DescribeMetricMetaListResponse describeMetricMetaList(DescribeMetricMetaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricMetaListWithOptions(request, runtime);
    }

    public DescribeMetricTopResponse describeMetricTopWithOptions(DescribeMetricTopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricTop", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricTopResponse());
    }

    public DescribeMetricTopResponse describeMetricTop(DescribeMetricTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricTopWithOptions(request, runtime);
    }

    public DescribeMetricDataResponse describeMetricDataWithOptions(DescribeMetricDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricData", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricDataResponse());
    }

    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricDataWithOptions(request, runtime);
    }

    public DescribeMetricLastResponse describeMetricLastWithOptions(DescribeMetricLastRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMetricLast", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMetricLastResponse());
    }

    public DescribeMetricLastResponse describeMetricLast(DescribeMetricLastRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricLastWithOptions(request, runtime);
    }

    public EnableHostAvailabilityResponse enableHostAvailabilityWithOptions(EnableHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableHostAvailability", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new EnableHostAvailabilityResponse());
    }

    public EnableHostAvailabilityResponse enableHostAvailability(EnableHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableHostAvailabilityWithOptions(request, runtime);
    }

    public ModifyHostAvailabilityResponse modifyHostAvailabilityWithOptions(ModifyHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyHostAvailability", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new ModifyHostAvailabilityResponse());
    }

    public ModifyHostAvailabilityResponse modifyHostAvailability(ModifyHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostAvailabilityWithOptions(request, runtime);
    }

    public DisableHostAvailabilityResponse disableHostAvailabilityWithOptions(DisableHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableHostAvailability", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DisableHostAvailabilityResponse());
    }

    public DisableHostAvailabilityResponse disableHostAvailability(DisableHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableHostAvailabilityWithOptions(request, runtime);
    }

    public DescribeUnhealthyHostAvailabilityResponse describeUnhealthyHostAvailabilityWithOptions(DescribeUnhealthyHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUnhealthyHostAvailability", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeUnhealthyHostAvailabilityResponse());
    }

    public DescribeUnhealthyHostAvailabilityResponse describeUnhealthyHostAvailability(DescribeUnhealthyHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUnhealthyHostAvailabilityWithOptions(request, runtime);
    }

    public CreateHostAvailabilityResponse createHostAvailabilityWithOptions(CreateHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateHostAvailability", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new CreateHostAvailabilityResponse());
    }

    public CreateHostAvailabilityResponse createHostAvailability(CreateHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHostAvailabilityWithOptions(request, runtime);
    }

    public DescribeHostAvailabilityListResponse describeHostAvailabilityListWithOptions(DescribeHostAvailabilityListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHostAvailabilityList", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHostAvailabilityListResponse());
    }

    public DescribeHostAvailabilityListResponse describeHostAvailabilityList(DescribeHostAvailabilityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHostAvailabilityListWithOptions(request, runtime);
    }

    public DeleteHostAvailabilityResponse deleteHostAvailabilityWithOptions(DeleteHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteHostAvailability", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DeleteHostAvailabilityResponse());
    }

    public DeleteHostAvailabilityResponse deleteHostAvailability(DeleteHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHostAvailabilityWithOptions(request, runtime);
    }

    public DescribeMonitoringConfigResponse describeMonitoringConfigWithOptions(DescribeMonitoringConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMonitoringConfig", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMonitoringConfigResponse());
    }

    public DescribeMonitoringConfigResponse describeMonitoringConfig(DescribeMonitoringConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringConfigWithOptions(request, runtime);
    }

    public PutMonitoringConfigResponse putMonitoringConfigWithOptions(PutMonitoringConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutMonitoringConfig", "HTTPS", "POST", "2019-01-01", "AK", null, TeaModel.buildMap(request), runtime), new PutMonitoringConfigResponse());
    }

    public PutMonitoringConfigResponse putMonitoringConfig(PutMonitoringConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMonitoringConfigWithOptions(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}

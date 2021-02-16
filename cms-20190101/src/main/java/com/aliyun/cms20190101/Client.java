// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101;

import com.aliyun.tea.*;
import com.aliyun.cms20190101.models.*;
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
        this._endpoint = this.getEndpoint("cms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddTags", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddTagsResponse());
    }

    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    public ApplyMetricRuleTemplateResponse applyMetricRuleTemplateWithOptions(ApplyMetricRuleTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyMetricRuleTemplate", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyMetricRuleTemplateResponse());
    }

    public ApplyMetricRuleTemplateResponse applyMetricRuleTemplate(ApplyMetricRuleTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyMetricRuleTemplateWithOptions(request, runtime);
    }

    public CreateCmsCallNumOrderResponse createCmsCallNumOrderWithOptions(CreateCmsCallNumOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCmsCallNumOrder", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCmsCallNumOrderResponse());
    }

    public CreateCmsCallNumOrderResponse createCmsCallNumOrder(CreateCmsCallNumOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCmsCallNumOrderWithOptions(request, runtime);
    }

    public CreateCmsOrderResponse createCmsOrderWithOptions(CreateCmsOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCmsOrder", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCmsOrderResponse());
    }

    public CreateCmsOrderResponse createCmsOrder(CreateCmsOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCmsOrderWithOptions(request, runtime);
    }

    public CreateCmsSmspackageOrderResponse createCmsSmspackageOrderWithOptions(CreateCmsSmspackageOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCmsSmspackageOrder", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCmsSmspackageOrderResponse());
    }

    public CreateCmsSmspackageOrderResponse createCmsSmspackageOrder(CreateCmsSmspackageOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCmsSmspackageOrderWithOptions(request, runtime);
    }

    public CreateDynamicTagGroupResponse createDynamicTagGroupWithOptions(CreateDynamicTagGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDynamicTagGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDynamicTagGroupResponse());
    }

    public CreateDynamicTagGroupResponse createDynamicTagGroup(CreateDynamicTagGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDynamicTagGroupWithOptions(request, runtime);
    }

    public CreateGroupMetricRulesResponse createGroupMetricRulesWithOptions(CreateGroupMetricRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGroupMetricRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGroupMetricRulesResponse());
    }

    public CreateGroupMetricRulesResponse createGroupMetricRules(CreateGroupMetricRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupMetricRulesWithOptions(request, runtime);
    }

    public CreateGroupMonitoringAgentProcessResponse createGroupMonitoringAgentProcessWithOptions(CreateGroupMonitoringAgentProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGroupMonitoringAgentProcess", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGroupMonitoringAgentProcessResponse());
    }

    public CreateGroupMonitoringAgentProcessResponse createGroupMonitoringAgentProcess(CreateGroupMonitoringAgentProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    public CreateHostAvailabilityResponse createHostAvailabilityWithOptions(CreateHostAvailabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateHostAvailability", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateHostAvailabilityResponse());
    }

    public CreateHostAvailabilityResponse createHostAvailability(CreateHostAvailabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createHostAvailabilityWithOptions(request, runtime);
    }

    public CreateMetricRuleResourcesResponse createMetricRuleResourcesWithOptions(CreateMetricRuleResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMetricRuleResources", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMetricRuleResourcesResponse());
    }

    public CreateMetricRuleResourcesResponse createMetricRuleResources(CreateMetricRuleResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMetricRuleResourcesWithOptions(request, runtime);
    }

    public CreateMetricRuleTemplateResponse createMetricRuleTemplateWithOptions(CreateMetricRuleTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMetricRuleTemplate", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMetricRuleTemplateResponse());
    }

    public CreateMetricRuleTemplateResponse createMetricRuleTemplate(CreateMetricRuleTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMetricRuleTemplateWithOptions(request, runtime);
    }

    public CreateMonitorAgentProcessResponse createMonitorAgentProcessWithOptions(CreateMonitorAgentProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMonitorAgentProcess", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMonitorAgentProcessResponse());
    }

    public CreateMonitorAgentProcessResponse createMonitorAgentProcess(CreateMonitorAgentProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitorAgentProcessWithOptions(request, runtime);
    }

    public CreateMonitorGroupResponse createMonitorGroupWithOptions(CreateMonitorGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMonitorGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMonitorGroupResponse());
    }

    public CreateMonitorGroupResponse createMonitorGroup(CreateMonitorGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitorGroupWithOptions(request, runtime);
    }

    public CreateMonitorGroupByResourceGroupIdResponse createMonitorGroupByResourceGroupIdWithOptions(CreateMonitorGroupByResourceGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMonitorGroupByResourceGroupId", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMonitorGroupByResourceGroupIdResponse());
    }

    public CreateMonitorGroupByResourceGroupIdResponse createMonitorGroupByResourceGroupId(CreateMonitorGroupByResourceGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitorGroupByResourceGroupIdWithOptions(request, runtime);
    }

    public CreateMonitorGroupInstancesResponse createMonitorGroupInstancesWithOptions(CreateMonitorGroupInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMonitorGroupInstances", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMonitorGroupInstancesResponse());
    }

    public CreateMonitorGroupInstancesResponse createMonitorGroupInstances(CreateMonitorGroupInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitorGroupInstancesWithOptions(request, runtime);
    }

    public CreateMonitorGroupNotifyPolicyResponse createMonitorGroupNotifyPolicyWithOptions(CreateMonitorGroupNotifyPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMonitorGroupNotifyPolicy", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMonitorGroupNotifyPolicyResponse());
    }

    public CreateMonitorGroupNotifyPolicyResponse createMonitorGroupNotifyPolicy(CreateMonitorGroupNotifyPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitorGroupNotifyPolicyWithOptions(request, runtime);
    }

    public CreateMonitoringAgentProcessResponse createMonitoringAgentProcessWithOptions(CreateMonitoringAgentProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMonitoringAgentProcess", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMonitoringAgentProcessResponse());
    }

    public CreateMonitoringAgentProcessResponse createMonitoringAgentProcess(CreateMonitoringAgentProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitoringAgentProcessWithOptions(request, runtime);
    }

    public CreateSiteMonitorResponse createSiteMonitorWithOptions(CreateSiteMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSiteMonitor", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSiteMonitorResponse());
    }

    public CreateSiteMonitorResponse createSiteMonitor(CreateSiteMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSiteMonitorWithOptions(request, runtime);
    }

    public DeleteContactResponse deleteContactWithOptions(DeleteContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteContact", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteContactResponse());
    }

    public DeleteContactResponse deleteContact(DeleteContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteContactWithOptions(request, runtime);
    }

    public DeleteContactGroupResponse deleteContactGroupWithOptions(DeleteContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteContactGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteContactGroupResponse());
    }

    public DeleteContactGroupResponse deleteContactGroup(DeleteContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteContactGroupWithOptions(request, runtime);
    }

    public DeleteCustomMetricResponse deleteCustomMetricWithOptions(DeleteCustomMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCustomMetric", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCustomMetricResponse());
    }

    public DeleteCustomMetricResponse deleteCustomMetric(DeleteCustomMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomMetricWithOptions(request, runtime);
    }

    public DeleteDynamicTagGroupResponse deleteDynamicTagGroupWithOptions(DeleteDynamicTagGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDynamicTagGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDynamicTagGroupResponse());
    }

    public DeleteDynamicTagGroupResponse deleteDynamicTagGroup(DeleteDynamicTagGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDynamicTagGroupWithOptions(request, runtime);
    }

    public DeleteEventRulesResponse deleteEventRulesWithOptions(DeleteEventRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEventRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEventRulesResponse());
    }

    public DeleteEventRulesResponse deleteEventRules(DeleteEventRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventRulesWithOptions(request, runtime);
    }

    public DeleteEventRuleTargetsResponse deleteEventRuleTargetsWithOptions(DeleteEventRuleTargetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEventRuleTargets", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEventRuleTargetsResponse());
    }

    public DeleteEventRuleTargetsResponse deleteEventRuleTargets(DeleteEventRuleTargetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventRuleTargetsWithOptions(request, runtime);
    }

    public DeleteExporterOutputResponse deleteExporterOutputWithOptions(DeleteExporterOutputRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteExporterOutput", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteExporterOutputResponse());
    }

    public DeleteExporterOutputResponse deleteExporterOutput(DeleteExporterOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExporterOutputWithOptions(request, runtime);
    }

    public DeleteExporterRuleResponse deleteExporterRuleWithOptions(DeleteExporterRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteExporterRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteExporterRuleResponse());
    }

    public DeleteExporterRuleResponse deleteExporterRule(DeleteExporterRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteExporterRuleWithOptions(request, runtime);
    }

    public DeleteGroupMonitoringAgentProcessResponse deleteGroupMonitoringAgentProcessWithOptions(DeleteGroupMonitoringAgentProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGroupMonitoringAgentProcess", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGroupMonitoringAgentProcessResponse());
    }

    public DeleteGroupMonitoringAgentProcessResponse deleteGroupMonitoringAgentProcess(DeleteGroupMonitoringAgentProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    public DeleteHostAvailabilityResponse deleteHostAvailabilityWithOptions(DeleteHostAvailabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteHostAvailability", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteHostAvailabilityResponse());
    }

    public DeleteHostAvailabilityResponse deleteHostAvailability(DeleteHostAvailabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteHostAvailabilityWithOptions(request, runtime);
    }

    public DeleteLogMonitorResponse deleteLogMonitorWithOptions(DeleteLogMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLogMonitor", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLogMonitorResponse());
    }

    public DeleteLogMonitorResponse deleteLogMonitor(DeleteLogMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLogMonitorWithOptions(request, runtime);
    }

    public DeleteMetricRuleResourcesResponse deleteMetricRuleResourcesWithOptions(DeleteMetricRuleResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMetricRuleResources", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMetricRuleResourcesResponse());
    }

    public DeleteMetricRuleResourcesResponse deleteMetricRuleResources(DeleteMetricRuleResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMetricRuleResourcesWithOptions(request, runtime);
    }

    public DeleteMetricRulesResponse deleteMetricRulesWithOptions(DeleteMetricRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMetricRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMetricRulesResponse());
    }

    public DeleteMetricRulesResponse deleteMetricRules(DeleteMetricRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMetricRulesWithOptions(request, runtime);
    }

    public DeleteMetricRuleTargetsResponse deleteMetricRuleTargetsWithOptions(DeleteMetricRuleTargetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMetricRuleTargets", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMetricRuleTargetsResponse());
    }

    public DeleteMetricRuleTargetsResponse deleteMetricRuleTargets(DeleteMetricRuleTargetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMetricRuleTargetsWithOptions(request, runtime);
    }

    public DeleteMetricRuleTemplateResponse deleteMetricRuleTemplateWithOptions(DeleteMetricRuleTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMetricRuleTemplate", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMetricRuleTemplateResponse());
    }

    public DeleteMetricRuleTemplateResponse deleteMetricRuleTemplate(DeleteMetricRuleTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMetricRuleTemplateWithOptions(request, runtime);
    }

    public DeleteMonitorGroupResponse deleteMonitorGroupWithOptions(DeleteMonitorGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMonitorGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMonitorGroupResponse());
    }

    public DeleteMonitorGroupResponse deleteMonitorGroup(DeleteMonitorGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMonitorGroupWithOptions(request, runtime);
    }

    public DeleteMonitorGroupDynamicRuleResponse deleteMonitorGroupDynamicRuleWithOptions(DeleteMonitorGroupDynamicRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMonitorGroupDynamicRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMonitorGroupDynamicRuleResponse());
    }

    public DeleteMonitorGroupDynamicRuleResponse deleteMonitorGroupDynamicRule(DeleteMonitorGroupDynamicRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMonitorGroupDynamicRuleWithOptions(request, runtime);
    }

    public DeleteMonitorGroupInstancesResponse deleteMonitorGroupInstancesWithOptions(DeleteMonitorGroupInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMonitorGroupInstances", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMonitorGroupInstancesResponse());
    }

    public DeleteMonitorGroupInstancesResponse deleteMonitorGroupInstances(DeleteMonitorGroupInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMonitorGroupInstancesWithOptions(request, runtime);
    }

    public DeleteMonitorGroupNotifyPolicyResponse deleteMonitorGroupNotifyPolicyWithOptions(DeleteMonitorGroupNotifyPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMonitorGroupNotifyPolicy", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMonitorGroupNotifyPolicyResponse());
    }

    public DeleteMonitorGroupNotifyPolicyResponse deleteMonitorGroupNotifyPolicy(DeleteMonitorGroupNotifyPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMonitorGroupNotifyPolicyWithOptions(request, runtime);
    }

    public DeleteMonitoringAgentProcessResponse deleteMonitoringAgentProcessWithOptions(DeleteMonitoringAgentProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMonitoringAgentProcess", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMonitoringAgentProcessResponse());
    }

    public DeleteMonitoringAgentProcessResponse deleteMonitoringAgentProcess(DeleteMonitoringAgentProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMonitoringAgentProcessWithOptions(request, runtime);
    }

    public DeleteSiteMonitorsResponse deleteSiteMonitorsWithOptions(DeleteSiteMonitorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSiteMonitors", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSiteMonitorsResponse());
    }

    public DeleteSiteMonitorsResponse deleteSiteMonitors(DeleteSiteMonitorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSiteMonitorsWithOptions(request, runtime);
    }

    public DescribeActiveMetricRuleListResponse describeActiveMetricRuleListWithOptions(DescribeActiveMetricRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeActiveMetricRuleList", "2019-01-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeActiveMetricRuleListResponse());
    }

    public DescribeActiveMetricRuleListResponse describeActiveMetricRuleList(DescribeActiveMetricRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeActiveMetricRuleListWithOptions(request, runtime);
    }

    public DescribeAlertHistoryListResponse describeAlertHistoryListWithOptions(DescribeAlertHistoryListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertHistoryList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertHistoryListResponse());
    }

    public DescribeAlertHistoryListResponse describeAlertHistoryList(DescribeAlertHistoryListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertHistoryListWithOptions(request, runtime);
    }

    public DescribeAlertLogCountResponse describeAlertLogCountWithOptions(DescribeAlertLogCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertLogCount", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertLogCountResponse());
    }

    public DescribeAlertLogCountResponse describeAlertLogCount(DescribeAlertLogCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertLogCountWithOptions(request, runtime);
    }

    public DescribeAlertLogHistogramResponse describeAlertLogHistogramWithOptions(DescribeAlertLogHistogramRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertLogHistogram", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertLogHistogramResponse());
    }

    public DescribeAlertLogHistogramResponse describeAlertLogHistogram(DescribeAlertLogHistogramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertLogHistogramWithOptions(request, runtime);
    }

    public DescribeAlertLogListResponse describeAlertLogListWithOptions(DescribeAlertLogListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlertLogList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlertLogListResponse());
    }

    public DescribeAlertLogListResponse describeAlertLogList(DescribeAlertLogListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlertLogListWithOptions(request, runtime);
    }

    public DescribeContactGroupListResponse describeContactGroupListWithOptions(DescribeContactGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContactGroupList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContactGroupListResponse());
    }

    public DescribeContactGroupListResponse describeContactGroupList(DescribeContactGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContactGroupListWithOptions(request, runtime);
    }

    public DescribeContactListResponse describeContactListWithOptions(DescribeContactListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContactList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContactListResponse());
    }

    public DescribeContactListResponse describeContactList(DescribeContactListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContactListWithOptions(request, runtime);
    }

    public DescribeContactListByContactGroupResponse describeContactListByContactGroupWithOptions(DescribeContactListByContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContactListByContactGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContactListByContactGroupResponse());
    }

    public DescribeContactListByContactGroupResponse describeContactListByContactGroup(DescribeContactListByContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContactListByContactGroupWithOptions(request, runtime);
    }

    public DescribeCustomEventAttributeResponse describeCustomEventAttributeWithOptions(DescribeCustomEventAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomEventAttribute", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomEventAttributeResponse());
    }

    public DescribeCustomEventAttributeResponse describeCustomEventAttribute(DescribeCustomEventAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomEventAttributeWithOptions(request, runtime);
    }

    public DescribeCustomEventCountResponse describeCustomEventCountWithOptions(DescribeCustomEventCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomEventCount", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomEventCountResponse());
    }

    public DescribeCustomEventCountResponse describeCustomEventCount(DescribeCustomEventCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomEventCountWithOptions(request, runtime);
    }

    public DescribeCustomEventHistogramResponse describeCustomEventHistogramWithOptions(DescribeCustomEventHistogramRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomEventHistogram", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomEventHistogramResponse());
    }

    public DescribeCustomEventHistogramResponse describeCustomEventHistogram(DescribeCustomEventHistogramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomEventHistogramWithOptions(request, runtime);
    }

    public DescribeCustomMetricListResponse describeCustomMetricListWithOptions(DescribeCustomMetricListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomMetricList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomMetricListResponse());
    }

    public DescribeCustomMetricListResponse describeCustomMetricList(DescribeCustomMetricListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomMetricListWithOptions(request, runtime);
    }

    public DescribeDynamicTagRuleListResponse describeDynamicTagRuleListWithOptions(DescribeDynamicTagRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDynamicTagRuleList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDynamicTagRuleListResponse());
    }

    public DescribeDynamicTagRuleListResponse describeDynamicTagRuleList(DescribeDynamicTagRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDynamicTagRuleListWithOptions(request, runtime);
    }

    public DescribeEventRuleAttributeResponse describeEventRuleAttributeWithOptions(DescribeEventRuleAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEventRuleAttribute", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEventRuleAttributeResponse());
    }

    public DescribeEventRuleAttributeResponse describeEventRuleAttribute(DescribeEventRuleAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventRuleAttributeWithOptions(request, runtime);
    }

    public DescribeEventRuleListResponse describeEventRuleListWithOptions(DescribeEventRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEventRuleList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEventRuleListResponse());
    }

    public DescribeEventRuleListResponse describeEventRuleList(DescribeEventRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventRuleListWithOptions(request, runtime);
    }

    public DescribeEventRuleTargetListResponse describeEventRuleTargetListWithOptions(DescribeEventRuleTargetListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEventRuleTargetList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEventRuleTargetListResponse());
    }

    public DescribeEventRuleTargetListResponse describeEventRuleTargetList(DescribeEventRuleTargetListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventRuleTargetListWithOptions(request, runtime);
    }

    public DescribeExporterOutputListResponse describeExporterOutputListWithOptions(DescribeExporterOutputListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExporterOutputList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExporterOutputListResponse());
    }

    public DescribeExporterOutputListResponse describeExporterOutputList(DescribeExporterOutputListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExporterOutputListWithOptions(request, runtime);
    }

    public DescribeExporterRuleListResponse describeExporterRuleListWithOptions(DescribeExporterRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExporterRuleList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExporterRuleListResponse());
    }

    public DescribeExporterRuleListResponse describeExporterRuleList(DescribeExporterRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExporterRuleListWithOptions(request, runtime);
    }

    public DescribeGroupMonitoringAgentProcessResponse describeGroupMonitoringAgentProcessWithOptions(DescribeGroupMonitoringAgentProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupMonitoringAgentProcess", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupMonitoringAgentProcessResponse());
    }

    public DescribeGroupMonitoringAgentProcessResponse describeGroupMonitoringAgentProcess(DescribeGroupMonitoringAgentProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    public DescribeHostAvailabilityListResponse describeHostAvailabilityListWithOptions(DescribeHostAvailabilityListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHostAvailabilityList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHostAvailabilityListResponse());
    }

    public DescribeHostAvailabilityListResponse describeHostAvailabilityList(DescribeHostAvailabilityListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHostAvailabilityListWithOptions(request, runtime);
    }

    public DescribeLogMonitorAttributeResponse describeLogMonitorAttributeWithOptions(DescribeLogMonitorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogMonitorAttribute", "2019-01-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeLogMonitorAttributeResponse());
    }

    public DescribeLogMonitorAttributeResponse describeLogMonitorAttribute(DescribeLogMonitorAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogMonitorAttributeWithOptions(request, runtime);
    }

    public DescribeLogMonitorListResponse describeLogMonitorListWithOptions(DescribeLogMonitorListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogMonitorList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogMonitorListResponse());
    }

    public DescribeLogMonitorListResponse describeLogMonitorList(DescribeLogMonitorListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogMonitorListWithOptions(request, runtime);
    }

    public DescribeMetricDataResponse describeMetricDataWithOptions(DescribeMetricDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricData", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricDataResponse());
    }

    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricDataWithOptions(request, runtime);
    }

    public DescribeMetricLastResponse describeMetricLastWithOptions(DescribeMetricLastRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricLast", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricLastResponse());
    }

    public DescribeMetricLastResponse describeMetricLast(DescribeMetricLastRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricLastWithOptions(request, runtime);
    }

    public DescribeMetricListResponse describeMetricListWithOptions(DescribeMetricListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricListResponse());
    }

    public DescribeMetricListResponse describeMetricList(DescribeMetricListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricListWithOptions(request, runtime);
    }

    public DescribeMetricMetaListResponse describeMetricMetaListWithOptions(DescribeMetricMetaListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricMetaList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricMetaListResponse());
    }

    public DescribeMetricMetaListResponse describeMetricMetaList(DescribeMetricMetaListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricMetaListWithOptions(request, runtime);
    }

    public DescribeMetricRuleCountResponse describeMetricRuleCountWithOptions(DescribeMetricRuleCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricRuleCount", "2019-01-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeMetricRuleCountResponse());
    }

    public DescribeMetricRuleCountResponse describeMetricRuleCount(DescribeMetricRuleCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricRuleCountWithOptions(request, runtime);
    }

    public DescribeMetricRuleListResponse describeMetricRuleListWithOptions(DescribeMetricRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricRuleList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricRuleListResponse());
    }

    public DescribeMetricRuleListResponse describeMetricRuleList(DescribeMetricRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricRuleListWithOptions(request, runtime);
    }

    public DescribeMetricRuleTargetsResponse describeMetricRuleTargetsWithOptions(DescribeMetricRuleTargetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricRuleTargets", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricRuleTargetsResponse());
    }

    public DescribeMetricRuleTargetsResponse describeMetricRuleTargets(DescribeMetricRuleTargetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricRuleTargetsWithOptions(request, runtime);
    }

    public DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttributeWithOptions(DescribeMetricRuleTemplateAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricRuleTemplateAttribute", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricRuleTemplateAttributeResponse());
    }

    public DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttribute(DescribeMetricRuleTemplateAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricRuleTemplateAttributeWithOptions(request, runtime);
    }

    public DescribeMetricRuleTemplateListResponse describeMetricRuleTemplateListWithOptions(DescribeMetricRuleTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricRuleTemplateList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricRuleTemplateListResponse());
    }

    public DescribeMetricRuleTemplateListResponse describeMetricRuleTemplateList(DescribeMetricRuleTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricRuleTemplateListWithOptions(request, runtime);
    }

    public DescribeMetricTopResponse describeMetricTopWithOptions(DescribeMetricTopRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMetricTop", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMetricTopResponse());
    }

    public DescribeMetricTopResponse describeMetricTop(DescribeMetricTopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMetricTopWithOptions(request, runtime);
    }

    public DescribeMonitorGroupCategoriesResponse describeMonitorGroupCategoriesWithOptions(DescribeMonitorGroupCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitorGroupCategories", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitorGroupCategoriesResponse());
    }

    public DescribeMonitorGroupCategoriesResponse describeMonitorGroupCategories(DescribeMonitorGroupCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitorGroupCategoriesWithOptions(request, runtime);
    }

    public DescribeMonitorGroupDynamicRulesResponse describeMonitorGroupDynamicRulesWithOptions(DescribeMonitorGroupDynamicRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitorGroupDynamicRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitorGroupDynamicRulesResponse());
    }

    public DescribeMonitorGroupDynamicRulesResponse describeMonitorGroupDynamicRules(DescribeMonitorGroupDynamicRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitorGroupDynamicRulesWithOptions(request, runtime);
    }

    public DescribeMonitorGroupInstanceAttributeResponse describeMonitorGroupInstanceAttributeWithOptions(DescribeMonitorGroupInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitorGroupInstanceAttribute", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitorGroupInstanceAttributeResponse());
    }

    public DescribeMonitorGroupInstanceAttributeResponse describeMonitorGroupInstanceAttribute(DescribeMonitorGroupInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitorGroupInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeMonitorGroupInstancesResponse describeMonitorGroupInstancesWithOptions(DescribeMonitorGroupInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitorGroupInstances", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitorGroupInstancesResponse());
    }

    public DescribeMonitorGroupInstancesResponse describeMonitorGroupInstances(DescribeMonitorGroupInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitorGroupInstancesWithOptions(request, runtime);
    }

    public DescribeMonitorGroupNotifyPolicyListResponse describeMonitorGroupNotifyPolicyListWithOptions(DescribeMonitorGroupNotifyPolicyListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitorGroupNotifyPolicyList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitorGroupNotifyPolicyListResponse());
    }

    public DescribeMonitorGroupNotifyPolicyListResponse describeMonitorGroupNotifyPolicyList(DescribeMonitorGroupNotifyPolicyListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitorGroupNotifyPolicyListWithOptions(request, runtime);
    }

    public DescribeMonitorGroupsResponse describeMonitorGroupsWithOptions(DescribeMonitorGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitorGroups", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitorGroupsResponse());
    }

    public DescribeMonitorGroupsResponse describeMonitorGroups(DescribeMonitorGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitorGroupsWithOptions(request, runtime);
    }

    public DescribeMonitoringAgentAccessKeyResponse describeMonitoringAgentAccessKeyWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitoringAgentAccessKey", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitoringAgentAccessKeyResponse());
    }

    public DescribeMonitoringAgentAccessKeyResponse describeMonitoringAgentAccessKey() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitoringAgentAccessKeyWithOptions(runtime);
    }

    public DescribeMonitoringAgentConfigResponse describeMonitoringAgentConfigWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitoringAgentConfig", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitoringAgentConfigResponse());
    }

    public DescribeMonitoringAgentConfigResponse describeMonitoringAgentConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitoringAgentConfigWithOptions(runtime);
    }

    public DescribeMonitoringAgentHostsResponse describeMonitoringAgentHostsWithOptions(DescribeMonitoringAgentHostsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitoringAgentHosts", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitoringAgentHostsResponse());
    }

    public DescribeMonitoringAgentHostsResponse describeMonitoringAgentHosts(DescribeMonitoringAgentHostsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitoringAgentHostsWithOptions(request, runtime);
    }

    public DescribeMonitoringAgentProcessesResponse describeMonitoringAgentProcessesWithOptions(DescribeMonitoringAgentProcessesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitoringAgentProcesses", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitoringAgentProcessesResponse());
    }

    public DescribeMonitoringAgentProcessesResponse describeMonitoringAgentProcesses(DescribeMonitoringAgentProcessesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitoringAgentProcessesWithOptions(request, runtime);
    }

    public DescribeMonitoringAgentStatusesResponse describeMonitoringAgentStatusesWithOptions(DescribeMonitoringAgentStatusesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitoringAgentStatuses", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitoringAgentStatusesResponse());
    }

    public DescribeMonitoringAgentStatusesResponse describeMonitoringAgentStatuses(DescribeMonitoringAgentStatusesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitoringAgentStatusesWithOptions(request, runtime);
    }

    public DescribeMonitoringConfigResponse describeMonitoringConfigWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitoringConfig", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitoringConfigResponse());
    }

    public DescribeMonitoringConfigResponse describeMonitoringConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitoringConfigWithOptions(runtime);
    }

    public DescribeMonitorResourceQuotaAttributeResponse describeMonitorResourceQuotaAttributeWithOptions(DescribeMonitorResourceQuotaAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMonitorResourceQuotaAttribute", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMonitorResourceQuotaAttributeResponse());
    }

    public DescribeMonitorResourceQuotaAttributeResponse describeMonitorResourceQuotaAttribute(DescribeMonitorResourceQuotaAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMonitorResourceQuotaAttributeWithOptions(request, runtime);
    }

    public DescribeProductResourceTagKeyListResponse describeProductResourceTagKeyListWithOptions(DescribeProductResourceTagKeyListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProductResourceTagKeyList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProductResourceTagKeyListResponse());
    }

    public DescribeProductResourceTagKeyListResponse describeProductResourceTagKeyList(DescribeProductResourceTagKeyListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProductResourceTagKeyListWithOptions(request, runtime);
    }

    public DescribeProductsOfActiveMetricRuleResponse describeProductsOfActiveMetricRuleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeProductsOfActiveMetricRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProductsOfActiveMetricRuleResponse());
    }

    public DescribeProductsOfActiveMetricRuleResponse describeProductsOfActiveMetricRule() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProductsOfActiveMetricRuleWithOptions(runtime);
    }

    public DescribeProjectMetaResponse describeProjectMetaWithOptions(DescribeProjectMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProjectMeta", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProjectMetaResponse());
    }

    public DescribeProjectMetaResponse describeProjectMeta(DescribeProjectMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProjectMetaWithOptions(request, runtime);
    }

    public DescribeSiteMonitorAttributeResponse describeSiteMonitorAttributeWithOptions(DescribeSiteMonitorAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSiteMonitorAttribute", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSiteMonitorAttributeResponse());
    }

    public DescribeSiteMonitorAttributeResponse describeSiteMonitorAttribute(DescribeSiteMonitorAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSiteMonitorAttributeWithOptions(request, runtime);
    }

    public DescribeSiteMonitorDataResponse describeSiteMonitorDataWithOptions(DescribeSiteMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSiteMonitorData", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSiteMonitorDataResponse());
    }

    public DescribeSiteMonitorDataResponse describeSiteMonitorData(DescribeSiteMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSiteMonitorDataWithOptions(request, runtime);
    }

    public DescribeSiteMonitorListResponse describeSiteMonitorListWithOptions(DescribeSiteMonitorListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSiteMonitorList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSiteMonitorListResponse());
    }

    public DescribeSiteMonitorListResponse describeSiteMonitorList(DescribeSiteMonitorListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSiteMonitorListWithOptions(request, runtime);
    }

    public DescribeSiteMonitorQuotaResponse describeSiteMonitorQuotaWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeSiteMonitorQuota", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSiteMonitorQuotaResponse());
    }

    public DescribeSiteMonitorQuotaResponse describeSiteMonitorQuota() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSiteMonitorQuotaWithOptions(runtime);
    }

    public DescribeSiteMonitorStatisticsResponse describeSiteMonitorStatisticsWithOptions(DescribeSiteMonitorStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSiteMonitorStatistics", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSiteMonitorStatisticsResponse());
    }

    public DescribeSiteMonitorStatisticsResponse describeSiteMonitorStatistics(DescribeSiteMonitorStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSiteMonitorStatisticsWithOptions(request, runtime);
    }

    public DescribeSystemEventAttributeResponse describeSystemEventAttributeWithOptions(DescribeSystemEventAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSystemEventAttribute", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSystemEventAttributeResponse());
    }

    public DescribeSystemEventAttributeResponse describeSystemEventAttribute(DescribeSystemEventAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSystemEventAttributeWithOptions(request, runtime);
    }

    public DescribeSystemEventCountResponse describeSystemEventCountWithOptions(DescribeSystemEventCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSystemEventCount", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSystemEventCountResponse());
    }

    public DescribeSystemEventCountResponse describeSystemEventCount(DescribeSystemEventCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSystemEventCountWithOptions(request, runtime);
    }

    public DescribeSystemEventHistogramResponse describeSystemEventHistogramWithOptions(DescribeSystemEventHistogramRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSystemEventHistogram", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSystemEventHistogramResponse());
    }

    public DescribeSystemEventHistogramResponse describeSystemEventHistogram(DescribeSystemEventHistogramRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSystemEventHistogramWithOptions(request, runtime);
    }

    public DescribeTagKeyListResponse describeTagKeyListWithOptions(DescribeTagKeyListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTagKeyList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagKeyListResponse());
    }

    public DescribeTagKeyListResponse describeTagKeyList(DescribeTagKeyListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagKeyListWithOptions(request, runtime);
    }

    public DescribeTagValueListResponse describeTagValueListWithOptions(DescribeTagValueListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTagValueList", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTagValueListResponse());
    }

    public DescribeTagValueListResponse describeTagValueList(DescribeTagValueListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTagValueListWithOptions(request, runtime);
    }

    public DescribeUnhealthyHostAvailabilityResponse describeUnhealthyHostAvailabilityWithOptions(DescribeUnhealthyHostAvailabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUnhealthyHostAvailability", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUnhealthyHostAvailabilityResponse());
    }

    public DescribeUnhealthyHostAvailabilityResponse describeUnhealthyHostAvailability(DescribeUnhealthyHostAvailabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUnhealthyHostAvailabilityWithOptions(request, runtime);
    }

    public DisableActiveMetricRuleResponse disableActiveMetricRuleWithOptions(DisableActiveMetricRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableActiveMetricRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableActiveMetricRuleResponse());
    }

    public DisableActiveMetricRuleResponse disableActiveMetricRule(DisableActiveMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableActiveMetricRuleWithOptions(request, runtime);
    }

    public DisableEventRulesResponse disableEventRulesWithOptions(DisableEventRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableEventRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableEventRulesResponse());
    }

    public DisableEventRulesResponse disableEventRules(DisableEventRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableEventRulesWithOptions(request, runtime);
    }

    public DisableHostAvailabilityResponse disableHostAvailabilityWithOptions(DisableHostAvailabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableHostAvailability", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableHostAvailabilityResponse());
    }

    public DisableHostAvailabilityResponse disableHostAvailability(DisableHostAvailabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableHostAvailabilityWithOptions(request, runtime);
    }

    public DisableMetricRulesResponse disableMetricRulesWithOptions(DisableMetricRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableMetricRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableMetricRulesResponse());
    }

    public DisableMetricRulesResponse disableMetricRules(DisableMetricRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableMetricRulesWithOptions(request, runtime);
    }

    public DisableSiteMonitorsResponse disableSiteMonitorsWithOptions(DisableSiteMonitorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableSiteMonitors", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSiteMonitorsResponse());
    }

    public DisableSiteMonitorsResponse disableSiteMonitors(DisableSiteMonitorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSiteMonitorsWithOptions(request, runtime);
    }

    public EnableActiveMetricRuleResponse enableActiveMetricRuleWithOptions(EnableActiveMetricRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableActiveMetricRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableActiveMetricRuleResponse());
    }

    public EnableActiveMetricRuleResponse enableActiveMetricRule(EnableActiveMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableActiveMetricRuleWithOptions(request, runtime);
    }

    public EnableEventRulesResponse enableEventRulesWithOptions(EnableEventRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableEventRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableEventRulesResponse());
    }

    public EnableEventRulesResponse enableEventRules(EnableEventRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableEventRulesWithOptions(request, runtime);
    }

    public EnableHostAvailabilityResponse enableHostAvailabilityWithOptions(EnableHostAvailabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableHostAvailability", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableHostAvailabilityResponse());
    }

    public EnableHostAvailabilityResponse enableHostAvailability(EnableHostAvailabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableHostAvailabilityWithOptions(request, runtime);
    }

    public EnableMetricRulesResponse enableMetricRulesWithOptions(EnableMetricRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableMetricRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableMetricRulesResponse());
    }

    public EnableMetricRulesResponse enableMetricRules(EnableMetricRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableMetricRulesWithOptions(request, runtime);
    }

    public EnableSiteMonitorsResponse enableSiteMonitorsWithOptions(EnableSiteMonitorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableSiteMonitors", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSiteMonitorsResponse());
    }

    public EnableSiteMonitorsResponse enableSiteMonitors(EnableSiteMonitorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSiteMonitorsWithOptions(request, runtime);
    }

    public InstallMonitoringAgentResponse installMonitoringAgentWithOptions(InstallMonitoringAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallMonitoringAgent", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new InstallMonitoringAgentResponse());
    }

    public InstallMonitoringAgentResponse installMonitoringAgent(InstallMonitoringAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installMonitoringAgentWithOptions(request, runtime);
    }

    public ModifyGroupMonitoringAgentProcessResponse modifyGroupMonitoringAgentProcessWithOptions(ModifyGroupMonitoringAgentProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyGroupMonitoringAgentProcess", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyGroupMonitoringAgentProcessResponse());
    }

    public ModifyGroupMonitoringAgentProcessResponse modifyGroupMonitoringAgentProcess(ModifyGroupMonitoringAgentProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    public ModifyHostAvailabilityResponse modifyHostAvailabilityWithOptions(ModifyHostAvailabilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHostAvailability", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHostAvailabilityResponse());
    }

    public ModifyHostAvailabilityResponse modifyHostAvailability(ModifyHostAvailabilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHostAvailabilityWithOptions(request, runtime);
    }

    public ModifyHostInfoResponse modifyHostInfoWithOptions(ModifyHostInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyHostInfo", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyHostInfoResponse());
    }

    public ModifyHostInfoResponse modifyHostInfo(ModifyHostInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyHostInfoWithOptions(request, runtime);
    }

    public ModifyMetricRuleTemplateResponse modifyMetricRuleTemplateWithOptions(ModifyMetricRuleTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMetricRuleTemplate", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMetricRuleTemplateResponse());
    }

    public ModifyMetricRuleTemplateResponse modifyMetricRuleTemplate(ModifyMetricRuleTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMetricRuleTemplateWithOptions(request, runtime);
    }

    public ModifyMonitorGroupResponse modifyMonitorGroupWithOptions(ModifyMonitorGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMonitorGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMonitorGroupResponse());
    }

    public ModifyMonitorGroupResponse modifyMonitorGroup(ModifyMonitorGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMonitorGroupWithOptions(request, runtime);
    }

    public ModifyMonitorGroupInstancesResponse modifyMonitorGroupInstancesWithOptions(ModifyMonitorGroupInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMonitorGroupInstances", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMonitorGroupInstancesResponse());
    }

    public ModifyMonitorGroupInstancesResponse modifyMonitorGroupInstances(ModifyMonitorGroupInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMonitorGroupInstancesWithOptions(request, runtime);
    }

    public ModifySiteMonitorResponse modifySiteMonitorWithOptions(ModifySiteMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySiteMonitor", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySiteMonitorResponse());
    }

    public ModifySiteMonitorResponse modifySiteMonitor(ModifySiteMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySiteMonitorWithOptions(request, runtime);
    }

    public OpenCmsServiceResponse openCmsServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OpenCmsService", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new OpenCmsServiceResponse());
    }

    public OpenCmsServiceResponse openCmsService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openCmsServiceWithOptions(runtime);
    }

    public PutContactResponse putContactWithOptions(PutContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutContact", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutContactResponse());
    }

    public PutContactResponse putContact(PutContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putContactWithOptions(request, runtime);
    }

    public PutContactGroupResponse putContactGroupWithOptions(PutContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutContactGroup", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutContactGroupResponse());
    }

    public PutContactGroupResponse putContactGroup(PutContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putContactGroupWithOptions(request, runtime);
    }

    public PutCustomEventResponse putCustomEventWithOptions(PutCustomEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutCustomEvent", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutCustomEventResponse());
    }

    public PutCustomEventResponse putCustomEvent(PutCustomEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putCustomEventWithOptions(request, runtime);
    }

    public PutCustomEventRuleResponse putCustomEventRuleWithOptions(PutCustomEventRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutCustomEventRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutCustomEventRuleResponse());
    }

    public PutCustomEventRuleResponse putCustomEventRule(PutCustomEventRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putCustomEventRuleWithOptions(request, runtime);
    }

    public PutCustomMetricResponse putCustomMetricWithOptions(PutCustomMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutCustomMetric", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutCustomMetricResponse());
    }

    public PutCustomMetricResponse putCustomMetric(PutCustomMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putCustomMetricWithOptions(request, runtime);
    }

    public PutCustomMetricRuleResponse putCustomMetricRuleWithOptions(PutCustomMetricRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutCustomMetricRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutCustomMetricRuleResponse());
    }

    public PutCustomMetricRuleResponse putCustomMetricRule(PutCustomMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putCustomMetricRuleWithOptions(request, runtime);
    }

    public PutEventRuleResponse putEventRuleWithOptions(PutEventRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutEventRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutEventRuleResponse());
    }

    public PutEventRuleResponse putEventRule(PutEventRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putEventRuleWithOptions(request, runtime);
    }

    public PutEventRuleTargetsResponse putEventRuleTargetsWithOptions(PutEventRuleTargetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutEventRuleTargets", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutEventRuleTargetsResponse());
    }

    public PutEventRuleTargetsResponse putEventRuleTargets(PutEventRuleTargetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putEventRuleTargetsWithOptions(request, runtime);
    }

    public PutExporterOutputResponse putExporterOutputWithOptions(PutExporterOutputRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutExporterOutput", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutExporterOutputResponse());
    }

    public PutExporterOutputResponse putExporterOutput(PutExporterOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putExporterOutputWithOptions(request, runtime);
    }

    public PutExporterRuleResponse putExporterRuleWithOptions(PutExporterRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutExporterRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutExporterRuleResponse());
    }

    public PutExporterRuleResponse putExporterRule(PutExporterRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putExporterRuleWithOptions(request, runtime);
    }

    public PutGroupMetricRuleResponse putGroupMetricRuleWithOptions(PutGroupMetricRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutGroupMetricRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutGroupMetricRuleResponse());
    }

    public PutGroupMetricRuleResponse putGroupMetricRule(PutGroupMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putGroupMetricRuleWithOptions(request, runtime);
    }

    public PutLogMonitorResponse putLogMonitorWithOptions(PutLogMonitorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutLogMonitor", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutLogMonitorResponse());
    }

    public PutLogMonitorResponse putLogMonitor(PutLogMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putLogMonitorWithOptions(request, runtime);
    }

    public PutMetricRuleTargetsResponse putMetricRuleTargetsWithOptions(PutMetricRuleTargetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutMetricRuleTargets", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutMetricRuleTargetsResponse());
    }

    public PutMetricRuleTargetsResponse putMetricRuleTargets(PutMetricRuleTargetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putMetricRuleTargetsWithOptions(request, runtime);
    }

    public PutMonitorGroupDynamicRuleResponse putMonitorGroupDynamicRuleWithOptions(PutMonitorGroupDynamicRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutMonitorGroupDynamicRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutMonitorGroupDynamicRuleResponse());
    }

    public PutMonitorGroupDynamicRuleResponse putMonitorGroupDynamicRule(PutMonitorGroupDynamicRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putMonitorGroupDynamicRuleWithOptions(request, runtime);
    }

    public PutMonitoringConfigResponse putMonitoringConfigWithOptions(PutMonitoringConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutMonitoringConfig", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutMonitoringConfigResponse());
    }

    public PutMonitoringConfigResponse putMonitoringConfig(PutMonitoringConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putMonitoringConfigWithOptions(request, runtime);
    }

    public PutResourceMetricRuleResponse putResourceMetricRuleWithOptions(PutResourceMetricRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutResourceMetricRule", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutResourceMetricRuleResponse());
    }

    public PutResourceMetricRuleResponse putResourceMetricRule(PutResourceMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putResourceMetricRuleWithOptions(request, runtime);
    }

    public PutResourceMetricRulesResponse putResourceMetricRulesWithOptions(PutResourceMetricRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutResourceMetricRules", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new PutResourceMetricRulesResponse());
    }

    public PutResourceMetricRulesResponse putResourceMetricRules(PutResourceMetricRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putResourceMetricRulesWithOptions(request, runtime);
    }

    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveTags", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveTagsResponse());
    }

    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    public SendDryRunSystemEventResponse sendDryRunSystemEventWithOptions(SendDryRunSystemEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendDryRunSystemEvent", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new SendDryRunSystemEventResponse());
    }

    public SendDryRunSystemEventResponse sendDryRunSystemEvent(SendDryRunSystemEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendDryRunSystemEventWithOptions(request, runtime);
    }

    public UninstallMonitoringAgentResponse uninstallMonitoringAgentWithOptions(UninstallMonitoringAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UninstallMonitoringAgent", "2019-01-01", "HTTPS", "POST", "AK", "json", req, runtime), new UninstallMonitoringAgentResponse());
    }

    public UninstallMonitoringAgentResponse uninstallMonitoringAgent(UninstallMonitoringAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallMonitoringAgentWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101;

import com.aliyun.tea.*;
import com.aliyun.cms20190101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add a tag to an application group whose ID is <code>7301****</code>. In this example, the key of the tag is <code>key1</code> and the value of the tag is <code>value1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to an application group.</p>
     * 
     * @param request AddTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTagsResponse
     */
    public AddTagsResponse addTagsWithOptions(AddTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTags"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTagsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add a tag to an application group whose ID is <code>7301****</code>. In this example, the key of the tag is <code>key1</code> and the value of the tag is <code>value1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to an application group.</p>
     * 
     * @param request AddTagsRequest
     * @return AddTagsResponse
     */
    public AddTagsResponse addTags(AddTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the <code>700****</code> alert template is applied to the <code>123456</code> application group. For the generated alert rule, the ID is <code>applyTemplate8ab74c6b-9f27-47ab-8841-de01dc08****</code>, and the name is <code>test123</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies an alert template to an application group to generate an alert rule.</p>
     * 
     * @param request ApplyMetricRuleTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyMetricRuleTemplateResponse
     */
    public ApplyMetricRuleTemplateResponse applyMetricRuleTemplateWithOptions(ApplyMetricRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appendMode)) {
            query.put("AppendMode", request.appendMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyMode)) {
            query.put("ApplyMode", request.applyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableEndTime)) {
            query.put("EnableEndTime", request.enableEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStartTime)) {
            query.put("EnableStartTime", request.enableStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyLevel)) {
            query.put("NotifyLevel", request.notifyLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            query.put("TemplateIds", request.templateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhook)) {
            query.put("Webhook", request.webhook);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyMetricRuleTemplate"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyMetricRuleTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, the <code>700****</code> alert template is applied to the <code>123456</code> application group. For the generated alert rule, the ID is <code>applyTemplate8ab74c6b-9f27-47ab-8841-de01dc08****</code>, and the name is <code>test123</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies an alert template to an application group to generate an alert rule.</p>
     * 
     * @param request ApplyMetricRuleTemplateRequest
     * @return ApplyMetricRuleTemplateResponse
     */
    public ApplyMetricRuleTemplateResponse applyMetricRuleTemplate(ApplyMetricRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyMetricRuleTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a site monitoring task named <code>HangZhou_ECS1</code>. The URL that is monitored by the task is <code>https://www.aliyun.com</code> and the type of the task is <code>HTTP</code>. The returned result shows that the site monitoring task is created. The name of the site monitoring task is <code>HangZhou_ECS1</code> and the task ID is <code>679fbe4f-b80b-4706-91b2-5427b43e****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates site monitoring tasks.</p>
     * 
     * @param request BatchCreateInstantSiteMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateInstantSiteMonitorResponse
     */
    public BatchCreateInstantSiteMonitorResponse batchCreateInstantSiteMonitorWithOptions(BatchCreateInstantSiteMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskList)) {
            query.put("TaskList", request.taskList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateInstantSiteMonitor"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateInstantSiteMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a site monitoring task named <code>HangZhou_ECS1</code>. The URL that is monitored by the task is <code>https://www.aliyun.com</code> and the type of the task is <code>HTTP</code>. The returned result shows that the site monitoring task is created. The name of the site monitoring task is <code>HangZhou_ECS1</code> and the task ID is <code>679fbe4f-b80b-4706-91b2-5427b43e****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates site monitoring tasks.</p>
     * 
     * @param request BatchCreateInstantSiteMonitorRequest
     * @return BatchCreateInstantSiteMonitorResponse
     */
    public BatchCreateInstantSiteMonitorResponse batchCreateInstantSiteMonitor(BatchCreateInstantSiteMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateInstantSiteMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The <code>Cursor</code> information is returned by calling the <a href="https://help.aliyun.com/document_detail/2330730.html">Cursor</a> operation.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to export the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The <code>Cursor</code> information is specified. A maximum of 1,000 data entries can be returned in each response.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports the monitoring data that is defined in the Cursor operation.</p>
     * 
     * @param tmpReq BatchExportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchExportResponse
     */
    public BatchExportResponse batchExportWithOptions(BatchExportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchExportShrinkRequest request = new BatchExportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.measurements)) {
            request.measurementsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.measurements, "Measurements", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            body.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            body.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.measurementsShrink)) {
            body.put("Measurements", request.measurementsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchExport"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchExportResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The <code>Cursor</code> information is returned by calling the <a href="https://help.aliyun.com/document_detail/2330730.html">Cursor</a> operation.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to export the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The <code>Cursor</code> information is specified. A maximum of 1,000 data entries can be returned in each response.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports the monitoring data that is defined in the Cursor operation.</p>
     * 
     * @param request BatchExportRequest
     * @return BatchExportResponse
     */
    public BatchExportResponse batchExport(BatchExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchExportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is available for Elastic Compute Service (ECS), ApsaraDB RDS, and Server Load Balancer (SLB).
     * This topic provides an example to show how to create an application group for resources whose tag key is <code>ecs_instance</code>. In this example, the alert contact group of the application group is <code>ECS_Group</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application group based on the tags of cloud resources.</p>
     * 
     * @param request CreateDynamicTagGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDynamicTagGroupResponse
     */
    public CreateDynamicTagGroupResponse createDynamicTagGroupWithOptions(CreateDynamicTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupList)) {
            query.put("ContactGroupList", request.contactGroupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInstallAgent)) {
            query.put("EnableInstallAgent", request.enableInstallAgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSubscribeEvent)) {
            query.put("EnableSubscribeEvent", request.enableSubscribeEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpress)) {
            query.put("MatchExpress", request.matchExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpressFilterRelation)) {
            query.put("MatchExpressFilterRelation", request.matchExpressFilterRelation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagRegionId)) {
            query.put("TagRegionId", request.tagRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIdList)) {
            query.put("TemplateIdList", request.templateIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDynamicTagGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDynamicTagGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is available for Elastic Compute Service (ECS), ApsaraDB RDS, and Server Load Balancer (SLB).
     * This topic provides an example to show how to create an application group for resources whose tag key is <code>ecs_instance</code>. In this example, the alert contact group of the application group is <code>ECS_Group</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application group based on the tags of cloud resources.</p>
     * 
     * @param request CreateDynamicTagGroupRequest
     * @return CreateDynamicTagGroupResponse
     */
    public CreateDynamicTagGroupResponse createDynamicTagGroup(CreateDynamicTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDynamicTagGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to create an alert rule for the <code>cpu_total</code> metric of Elastic Compute Service (ECS) in the <code>123456</code> application group. The ID of the alert rule is <code>456789</code>. The name of the alert rule is <code>ECS_Rule1</code>. The alert level is <code>Critical</code>. The statistical method is <code>Average</code>. The comparison operator is <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is <code>90</code>. The number of alert retries is <code>3</code>. The response shows that the alert rule named <code>ECS_Rule1</code> is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates one or more alert rules for a specified application group.</p>
     * 
     * @param request CreateGroupMetricRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupMetricRulesResponse
     */
    public CreateGroupMetricRulesResponse createGroupMetricRulesWithOptions(CreateGroupMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupMetricRules)) {
            query.put("GroupMetricRules", request.groupMetricRules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupMetricRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupMetricRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to create an alert rule for the <code>cpu_total</code> metric of Elastic Compute Service (ECS) in the <code>123456</code> application group. The ID of the alert rule is <code>456789</code>. The name of the alert rule is <code>ECS_Rule1</code>. The alert level is <code>Critical</code>. The statistical method is <code>Average</code>. The comparison operator is <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is <code>90</code>. The number of alert retries is <code>3</code>. The response shows that the alert rule named <code>ECS_Rule1</code> is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates one or more alert rules for a specified application group.</p>
     * 
     * @param request CreateGroupMetricRulesRequest
     * @return CreateGroupMetricRulesResponse
     */
    public CreateGroupMetricRulesResponse createGroupMetricRules(CreateGroupMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupMetricRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a process monitoring task for an application group.</p>
     * 
     * @param request CreateGroupMonitoringAgentProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupMonitoringAgentProcessResponse
     */
    public CreateGroupMonitoringAgentProcessResponse createGroupMonitoringAgentProcessWithOptions(CreateGroupMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertConfig)) {
            query.put("AlertConfig", request.alertConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpress)) {
            query.put("MatchExpress", request.matchExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpressFilterRelation)) {
            query.put("MatchExpressFilterRelation", request.matchExpressFilterRelation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            query.put("ProcessName", request.processName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupMonitoringAgentProcess"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupMonitoringAgentProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a process monitoring task for an application group.</p>
     * 
     * @param request CreateGroupMonitoringAgentProcessRequest
     * @return CreateGroupMonitoringAgentProcessResponse
     */
    public CreateGroupMonitoringAgentProcessResponse createGroupMonitoringAgentProcess(CreateGroupMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an availability monitoring task named <code>task1</code> in an application group named <code>123456</code>. The TaskType parameter of the task is set to <code>HTTP</code>. After you start the task, the system sends alerts by using the specified email address and DingTalk chatbot.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an availability monitoring task.</p>
     * 
     * @param request CreateHostAvailabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHostAvailabilityResponse
     */
    public CreateHostAvailabilityResponse createHostAvailabilityWithOptions(CreateHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertConfigEscalationList)) {
            query.put("AlertConfigEscalationList", request.alertConfigEscalationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertConfigTargetList)) {
            query.put("AlertConfigTargetList", request.alertConfigTargetList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskScope)) {
            query.put("TaskScope", request.taskScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertConfig)) {
            query.put("AlertConfig", request.alertConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskOption)) {
            query.put("TaskOption", request.taskOption);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHostAvailability"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHostAvailabilityResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an availability monitoring task named <code>task1</code> in an application group named <code>123456</code>. The TaskType parameter of the task is set to <code>HTTP</code>. After you start the task, the system sends alerts by using the specified email address and DingTalk chatbot.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an availability monitoring task.</p>
     * 
     * @param request CreateHostAvailabilityRequest
     * @return CreateHostAvailabilityResponse
     */
    public CreateHostAvailabilityResponse createHostAvailability(CreateHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHostAvailabilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to create a namespace named <code>aliyun</code>. In this example, the data retention period of the namespace is set to <code>cms.s1.3xlarge</code>. The returned result indicates that the namespace is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a namespace.</p>
     * 
     * @param request CreateHybridMonitorNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHybridMonitorNamespaceResponse
     */
    public CreateHybridMonitorNamespaceResponse createHybridMonitorNamespaceWithOptions(CreateHybridMonitorNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceRegion)) {
            query.put("NamespaceRegion", request.namespaceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceType)) {
            query.put("NamespaceType", request.namespaceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHybridMonitorNamespace"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHybridMonitorNamespaceResponse());
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to create a namespace named <code>aliyun</code>. In this example, the data retention period of the namespace is set to <code>cms.s1.3xlarge</code>. The returned result indicates that the namespace is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a namespace.</p>
     * 
     * @param request CreateHybridMonitorNamespaceRequest
     * @return CreateHybridMonitorNamespaceResponse
     */
    public CreateHybridMonitorNamespaceResponse createHybridMonitorNamespace(CreateHybridMonitorNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHybridMonitorNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Prerequisites</h2>
     * <p>Simple Log Service is activated. A project and a Logstore are created in Simple Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Getting Started</a>.</p>
     * <h2><a href="#"></a>Description</h2>
     * <p>This topic provides an example on how to create a Logstore group named <code>Logstore_test</code>. The region ID is <code>cn-hangzhou</code>. The project is <code>aliyun-project</code>. The Logstore is <code>Logstore-ECS</code>. The response shows that the Logstore group is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Logstore group of Hybrid Cloud Monitoring.</p>
     * 
     * @param request CreateHybridMonitorSLSGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHybridMonitorSLSGroupResponse
     */
    public CreateHybridMonitorSLSGroupResponse createHybridMonitorSLSGroupWithOptions(CreateHybridMonitorSLSGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SLSGroupConfig)) {
            query.put("SLSGroupConfig", request.SLSGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSGroupDescription)) {
            query.put("SLSGroupDescription", request.SLSGroupDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSGroupName)) {
            query.put("SLSGroupName", request.SLSGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHybridMonitorSLSGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHybridMonitorSLSGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Prerequisites</h2>
     * <p>Simple Log Service is activated. A project and a Logstore are created in Simple Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Getting Started</a>.</p>
     * <h2><a href="#"></a>Description</h2>
     * <p>This topic provides an example on how to create a Logstore group named <code>Logstore_test</code>. The region ID is <code>cn-hangzhou</code>. The project is <code>aliyun-project</code>. The Logstore is <code>Logstore-ECS</code>. The response shows that the Logstore group is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Logstore group of Hybrid Cloud Monitoring.</p>
     * 
     * @param request CreateHybridMonitorSLSGroupRequest
     * @return CreateHybridMonitorSLSGroupResponse
     */
    public CreateHybridMonitorSLSGroupResponse createHybridMonitorSLSGroup(CreateHybridMonitorSLSGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHybridMonitorSLSGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <ul>
     * <li>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</li>
     * <li>If you want to create a metric for logs imported from Simple Log Service, make sure that you have activated Simple Log Service and created a project and a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Getting Started</a>.</li>
     * </ul>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to create a metric import task named <code>aliyun_task</code> for Elastic Compute Service (ECS). The task imports the <code>cpu_total</code> metric to the <code>aliyun</code> namespace. The response shows that the metric import task is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a metric import task for an Alibaba Cloud service or creates a metric for logs imported from Simple Log Service.</p>
     * 
     * @param request CreateHybridMonitorTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHybridMonitorTaskResponse
     */
    public CreateHybridMonitorTaskResponse createHybridMonitorTaskWithOptions(CreateHybridMonitorTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachLabels)) {
            query.put("AttachLabels", request.attachLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccessId)) {
            query.put("CloudAccessId", request.cloudAccessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectInterval)) {
            query.put("CollectInterval", request.collectInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectTargetType)) {
            query.put("CollectTargetType", request.collectTargetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSProcessConfig)) {
            query.put("SLSProcessConfig", request.SLSProcessConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserIdList)) {
            query.put("TargetUserIdList", request.targetUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.YARMConfig)) {
            query.put("YARMConfig", request.YARMConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHybridMonitorTask"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHybridMonitorTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <ul>
     * <li>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</li>
     * <li>If you want to create a metric for logs imported from Simple Log Service, make sure that you have activated Simple Log Service and created a project and a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Getting Started</a>.</li>
     * </ul>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to create a metric import task named <code>aliyun_task</code> for Elastic Compute Service (ECS). The task imports the <code>cpu_total</code> metric to the <code>aliyun</code> namespace. The response shows that the metric import task is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a metric import task for an Alibaba Cloud service or creates a metric for logs imported from Simple Log Service.</p>
     * 
     * @param request CreateHybridMonitorTaskRequest
     * @return CreateHybridMonitorTaskResponse
     */
    public CreateHybridMonitorTaskResponse createHybridMonitorTask(CreateHybridMonitorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHybridMonitorTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring. 
     * This topic provides an example to show how to create an instant test task. The name of the task is <code>task1</code>. The tested address is <code>http://www.aliyun.com</code>. The test type is <code>HTTP</code>. The number of detection points is <code>1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an instant test task.</p>
     * 
     * @param request CreateInstantSiteMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstantSiteMonitorResponse
     */
    public CreateInstantSiteMonitorResponse createInstantSiteMonitorWithOptions(CreateInstantSiteMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCities)) {
            query.put("IspCities", request.ispCities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsJson)) {
            query.put("OptionsJson", request.optionsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.randomIspCity)) {
            query.put("RandomIspCity", request.randomIspCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstantSiteMonitor"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstantSiteMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring. 
     * This topic provides an example to show how to create an instant test task. The name of the task is <code>task1</code>. The tested address is <code>http://www.aliyun.com</code>. The test type is <code>HTTP</code>. The number of detection points is <code>1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an instant test task.</p>
     * 
     * @param request CreateInstantSiteMonitorRequest
     * @return CreateInstantSiteMonitorResponse
     */
    public CreateInstantSiteMonitorResponse createInstantSiteMonitor(CreateInstantSiteMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstantSiteMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Background information</h3>
     * <ul>
     * <li>CloudMonitor blocks alert notifications based on the blacklist policies that take effect. To block alert notifications when the value of a metric that belongs to a cloud service reaches the threshold that you specified, add the metric to a blacklist policy.</li>
     * <li>CloudMonitor allows you to create blacklist policies only based on threshold metrics. You cannot create blacklist policies based on system events. For more information about the cloud services and the thresholds of the metrics that are supported by CloudMonitor, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a blacklist policy.</p>
     * 
     * @param request CreateMetricRuleBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetricRuleBlackListResponse
     */
    public CreateMetricRuleBlackListResponse createMetricRuleBlackListWithOptions(CreateMetricRuleBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            query.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableEndTime)) {
            query.put("EnableEndTime", request.enableEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStartTime)) {
            query.put("EnableStartTime", request.enableStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            query.put("Instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            query.put("ScopeType", request.scopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeValue)) {
            query.put("ScopeValue", request.scopeValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetricRuleBlackList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetricRuleBlackListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Background information</h3>
     * <ul>
     * <li>CloudMonitor blocks alert notifications based on the blacklist policies that take effect. To block alert notifications when the value of a metric that belongs to a cloud service reaches the threshold that you specified, add the metric to a blacklist policy.</li>
     * <li>CloudMonitor allows you to create blacklist policies only based on threshold metrics. You cannot create blacklist policies based on system events. For more information about the cloud services and the thresholds of the metrics that are supported by CloudMonitor, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a blacklist policy.</p>
     * 
     * @param request CreateMetricRuleBlackListRequest
     * @return CreateMetricRuleBlackListResponse
     */
    public CreateMetricRuleBlackListResponse createMetricRuleBlackList(CreateMetricRuleBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetricRuleBlackListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates resources with an alert rule.</p>
     * 
     * @param request CreateMetricRuleResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetricRuleResourcesResponse
     */
    public CreateMetricRuleResourcesResponse createMetricRuleResourcesWithOptions(CreateMetricRuleResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetricRuleResources"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetricRuleResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates resources with an alert rule.</p>
     * 
     * @param request CreateMetricRuleResourcesRequest
     * @return CreateMetricRuleResourcesResponse
     */
    public CreateMetricRuleResourcesResponse createMetricRuleResources(CreateMetricRuleResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetricRuleResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert template.</p>
     * 
     * @param request CreateMetricRuleTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetricRuleTemplateResponse
     */
    public CreateMetricRuleTemplateResponse createMetricRuleTemplateWithOptions(CreateMetricRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertTemplates)) {
            query.put("AlertTemplates", request.alertTemplates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetricRuleTemplate"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetricRuleTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert template.</p>
     * 
     * @param request CreateMetricRuleTemplateRequest
     * @return CreateMetricRuleTemplateResponse
     */
    public CreateMetricRuleTemplateResponse createMetricRuleTemplate(CreateMetricRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMetricRuleTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a task to monitor a process.</p>
     * 
     * @param request CreateMonitorAgentProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorAgentProcessResponse
     */
    public CreateMonitorAgentProcessResponse createMonitorAgentProcessWithOptions(CreateMonitorAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            query.put("ProcessName", request.processName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processUser)) {
            query.put("ProcessUser", request.processUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorAgentProcess"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorAgentProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a task to monitor a process.</p>
     * 
     * @param request CreateMonitorAgentProcessRequest
     * @return CreateMonitorAgentProcessResponse
     */
    public CreateMonitorAgentProcessResponse createMonitorAgentProcess(CreateMonitorAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorAgentProcessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, an application group named <code>ECS_Group</code> is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application group.</p>
     * 
     * @param request CreateMonitorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorGroupResponse
     */
    public CreateMonitorGroupResponse createMonitorGroupWithOptions(CreateMonitorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroups)) {
            query.put("ContactGroups", request.contactGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, an application group named <code>ECS_Group</code> is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application group.</p>
     * 
     * @param request CreateMonitorGroupRequest
     * @return CreateMonitorGroupResponse
     */
    public CreateMonitorGroupResponse createMonitorGroup(CreateMonitorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an application group by using the resource group <code>CloudMonitor</code> and the alert contact group <code>ECS_Group</code>. The region ID of the resource group is <code>cn-hangzhou</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application group by using a resource group.</p>
     * 
     * @param request CreateMonitorGroupByResourceGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorGroupByResourceGroupIdResponse
     */
    public CreateMonitorGroupByResourceGroupIdResponse createMonitorGroupByResourceGroupIdWithOptions(CreateMonitorGroupByResourceGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupList)) {
            query.put("ContactGroupList", request.contactGroupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInstallAgent)) {
            query.put("EnableInstallAgent", request.enableInstallAgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSubscribeEvent)) {
            query.put("EnableSubscribeEvent", request.enableSubscribeEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorGroupByResourceGroupId"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorGroupByResourceGroupIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an application group by using the resource group <code>CloudMonitor</code> and the alert contact group <code>ECS_Group</code>. The region ID of the resource group is <code>cn-hangzhou</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application group by using a resource group.</p>
     * 
     * @param request CreateMonitorGroupByResourceGroupIdRequest
     * @return CreateMonitorGroupByResourceGroupIdResponse
     */
    public CreateMonitorGroupByResourceGroupIdResponse createMonitorGroupByResourceGroupId(CreateMonitorGroupByResourceGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorGroupByResourceGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can add a maximum of 1,000 instances to an application group at a time. You can add a maximum of 3,000 instances of an Alibaba Cloud service to an application group. The total number of instances that you can add to an application group is unlimited.
     * In this example, an Elastic Compute Service (ECS) instance in the <code>China (Hangzhou)</code> region is added to the <code>3607****</code> application group. The instance ID is <code>i-2ze26xj5wwy12****</code> and the instance name is <code>test-instance-ecs</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds resources to an application group.</p>
     * 
     * @param request CreateMonitorGroupInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorGroupInstancesResponse
     */
    public CreateMonitorGroupInstancesResponse createMonitorGroupInstancesWithOptions(CreateMonitorGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            query.put("Instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorGroupInstances"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorGroupInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can add a maximum of 1,000 instances to an application group at a time. You can add a maximum of 3,000 instances of an Alibaba Cloud service to an application group. The total number of instances that you can add to an application group is unlimited.
     * In this example, an Elastic Compute Service (ECS) instance in the <code>China (Hangzhou)</code> region is added to the <code>3607****</code> application group. The instance ID is <code>i-2ze26xj5wwy12****</code> and the instance name is <code>test-instance-ecs</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds resources to an application group.</p>
     * 
     * @param request CreateMonitorGroupInstancesRequest
     * @return CreateMonitorGroupInstancesResponse
     */
    public CreateMonitorGroupInstancesResponse createMonitorGroupInstances(CreateMonitorGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorGroupInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the policy is valid, no alert notifications are sent for the application group.
     * This topic describes how to create the <code>PauseNotify</code> policy to pause alert notifications for the <code>7301****</code> application group. The StartTime parameter is set to <code>1622949300000</code> and the EndTime parameter is set to <code>1623208500000</code>. This indicates that the policy is valid from <code>2021-06-06 11:15:00 UTC+8</code> to <code>2021-06-09 11:15:00 UTC+8</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a policy to pause alert notifications for an application group.</p>
     * 
     * @param request CreateMonitorGroupNotifyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitorGroupNotifyPolicyResponse
     */
    public CreateMonitorGroupNotifyPolicyResponse createMonitorGroupNotifyPolicyWithOptions(CreateMonitorGroupNotifyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitorGroupNotifyPolicy"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitorGroupNotifyPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>If the policy is valid, no alert notifications are sent for the application group.
     * This topic describes how to create the <code>PauseNotify</code> policy to pause alert notifications for the <code>7301****</code> application group. The StartTime parameter is set to <code>1622949300000</code> and the EndTime parameter is set to <code>1623208500000</code>. This indicates that the policy is valid from <code>2021-06-06 11:15:00 UTC+8</code> to <code>2021-06-09 11:15:00 UTC+8</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a policy to pause alert notifications for an application group.</p>
     * 
     * @param request CreateMonitorGroupNotifyPolicyRequest
     * @return CreateMonitorGroupNotifyPolicyResponse
     */
    public CreateMonitorGroupNotifyPolicyResponse createMonitorGroupNotifyPolicy(CreateMonitorGroupNotifyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitorGroupNotifyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a task to monitor a specified process.</p>
     * 
     * @param request CreateMonitoringAgentProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMonitoringAgentProcessResponse
     */
    public CreateMonitoringAgentProcessResponse createMonitoringAgentProcessWithOptions(CreateMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            query.put("ProcessName", request.processName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processUser)) {
            query.put("ProcessUser", request.processUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMonitoringAgentProcess"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMonitoringAgentProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a task to monitor a specified process.</p>
     * 
     * @param request CreateMonitoringAgentProcessRequest
     * @return CreateMonitoringAgentProcessResponse
     */
    public CreateMonitoringAgentProcessResponse createMonitoringAgentProcess(CreateMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMonitoringAgentProcessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a site monitoring task named <code>HanZhou_ECS1</code>. The URL that is monitored by the task is <code>https://www.aliyun.com</code> and the type of the task is <code>HTTPS</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a site monitoring task.</p>
     * 
     * @param request CreateSiteMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSiteMonitorResponse
     */
    public CreateSiteMonitorResponse createSiteMonitorWithOptions(CreateSiteMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertIds)) {
            query.put("AlertIds", request.alertIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSchedule)) {
            query.put("CustomSchedule", request.customSchedule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCities)) {
            query.put("IspCities", request.ispCities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsJson)) {
            query.put("OptionsJson", request.optionsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcConfig)) {
            query.put("VpcConfig", request.vpcConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSiteMonitor"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSiteMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a site monitoring task named <code>HanZhou_ECS1</code>. The URL that is monitored by the task is <code>https://www.aliyun.com</code> and the type of the task is <code>HTTPS</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a site monitoring task.</p>
     * 
     * @param request CreateSiteMonitorRequest
     * @return CreateSiteMonitorResponse
     */
    public CreateSiteMonitorResponse createSiteMonitor(CreateSiteMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSiteMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h3><a href="#"></a>Background information</h3>
     * <p>You can call this operation to obtain the Cursor information and then call the <a href="https://help.aliyun.com/document_detail/2329847.html">BatchExport</a> operation to export the monitoring data.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to define the monitoring data of a specified metric for a specified cloud service. In this example, the namespace of the cloud service is set to <code>acs_ecs_dashboard</code>, the metric is set to <code>cpu_idle</code>, the start time is set to <code>1641627000000</code>, and the end time is set to <code>1641645000000</code>. The number of idle CPU cores on your Elastic Compute Service (ECS) instances is measured every 60 seconds from 15:30:00, January 8, 2022 to 20:30:00, January 8, 2022. The <code>Cursor</code> information is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Defines the range of monitoring data that you want to export. The Cursor information is returned. When you call the BatchExport operation for the first time, you must specify the Cursor information.</p>
     * 
     * @param tmpReq CursorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CursorResponse
     */
    public CursorResponse cursorWithOptions(CursorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CursorShrinkRequest request = new CursorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchers)) {
            request.matchersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchers, "Matchers", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchersShrink)) {
            body.put("Matchers", request.matchersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Cursor"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CursorResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h3><a href="#"></a>Background information</h3>
     * <p>You can call this operation to obtain the Cursor information and then call the <a href="https://help.aliyun.com/document_detail/2329847.html">BatchExport</a> operation to export the monitoring data.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to define the monitoring data of a specified metric for a specified cloud service. In this example, the namespace of the cloud service is set to <code>acs_ecs_dashboard</code>, the metric is set to <code>cpu_idle</code>, the start time is set to <code>1641627000000</code>, and the end time is set to <code>1641645000000</code>. The number of idle CPU cores on your Elastic Compute Service (ECS) instances is measured every 60 seconds from 15:30:00, January 8, 2022 to 20:30:00, January 8, 2022. The <code>Cursor</code> information is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Defines the range of monitoring data that you want to export. The Cursor information is returned. When you call the BatchExport operation for the first time, you must specify the Cursor information.</p>
     * 
     * @param request CursorRequest
     * @return CursorResponse
     */
    public CursorResponse cursor(CursorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cursorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert contact.</p>
     * 
     * @param request DeleteContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContactWithOptions(DeleteContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContact"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert contact.</p>
     * 
     * @param request DeleteContactRequest
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContact(DeleteContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert group.</p>
     * 
     * @param request DeleteContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactGroupResponse
     */
    public DeleteContactGroupResponse deleteContactGroupWithOptions(DeleteContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            query.put("ContactGroupName", request.contactGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContactGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert group.</p>
     * 
     * @param request DeleteContactGroupRequest
     * @return DeleteContactGroupResponse
     */
    public DeleteContactGroupResponse deleteContactGroup(DeleteContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the reported monitoring data of a metric.</p>
     * 
     * @param request DeleteCustomMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomMetricResponse
     */
    public DeleteCustomMetricResponse deleteCustomMetricWithOptions(DeleteCustomMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            query.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.UUID)) {
            query.put("UUID", request.UUID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomMetric"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the reported monitoring data of a metric.</p>
     * 
     * @param request DeleteCustomMetricRequest
     * @return DeleteCustomMetricResponse
     */
    public DeleteCustomMetricResponse deleteCustomMetric(DeleteCustomMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a tag rule.</p>
     * 
     * @param request DeleteDynamicTagGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDynamicTagGroupResponse
     */
    public DeleteDynamicTagGroupResponse deleteDynamicTagGroupWithOptions(DeleteDynamicTagGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dynamicTagRuleId)) {
            query.put("DynamicTagRuleId", request.dynamicTagRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDynamicTagGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDynamicTagGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a tag rule.</p>
     * 
     * @param request DeleteDynamicTagGroupRequest
     * @return DeleteDynamicTagGroupResponse
     */
    public DeleteDynamicTagGroupResponse deleteDynamicTagGroup(DeleteDynamicTagGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDynamicTagGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the push channels of an event-triggered alert rule.</p>
     * 
     * @param request DeleteEventRuleTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventRuleTargetsResponse
     */
    public DeleteEventRuleTargetsResponse deleteEventRuleTargetsWithOptions(DeleteEventRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventRuleTargets"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventRuleTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the push channels of an event-triggered alert rule.</p>
     * 
     * @param request DeleteEventRuleTargetsRequest
     * @return DeleteEventRuleTargetsResponse
     */
    public DeleteEventRuleTargetsResponse deleteEventRuleTargets(DeleteEventRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRuleTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more event-triggered alert rules.</p>
     * 
     * @param request DeleteEventRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventRulesResponse
     */
    public DeleteEventRulesResponse deleteEventRulesWithOptions(DeleteEventRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleNames)) {
            query.put("RuleNames", request.ruleNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more event-triggered alert rules.</p>
     * 
     * @param request DeleteEventRulesRequest
     * @return DeleteEventRulesResponse
     */
    public DeleteEventRulesResponse deleteEventRules(DeleteEventRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a configuration set that is used to export monitoring data.</p>
     * 
     * @param request DeleteExporterOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExporterOutputResponse
     */
    public DeleteExporterOutputResponse deleteExporterOutputWithOptions(DeleteExporterOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destName)) {
            query.put("DestName", request.destName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExporterOutput"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExporterOutputResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a configuration set that is used to export monitoring data.</p>
     * 
     * @param request DeleteExporterOutputRequest
     * @return DeleteExporterOutputResponse
     */
    public DeleteExporterOutputResponse deleteExporterOutput(DeleteExporterOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExporterOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data export rule.</p>
     * 
     * @param request DeleteExporterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExporterRuleResponse
     */
    public DeleteExporterRuleResponse deleteExporterRuleWithOptions(DeleteExporterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExporterRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExporterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data export rule.</p>
     * 
     * @param request DeleteExporterRuleRequest
     * @return DeleteExporterRuleResponse
     */
    public DeleteExporterRuleResponse deleteExporterRule(DeleteExporterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExporterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a process monitoring task for an application group.</p>
     * 
     * @param request DeleteGroupMonitoringAgentProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupMonitoringAgentProcessResponse
     */
    public DeleteGroupMonitoringAgentProcessResponse deleteGroupMonitoringAgentProcessWithOptions(DeleteGroupMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroupMonitoringAgentProcess"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupMonitoringAgentProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a process monitoring task for an application group.</p>
     * 
     * @param request DeleteGroupMonitoringAgentProcessRequest
     * @return DeleteGroupMonitoringAgentProcessResponse
     */
    public DeleteGroupMonitoringAgentProcessResponse deleteGroupMonitoringAgentProcess(DeleteGroupMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more availability monitoring tasks.</p>
     * 
     * @param request DeleteHostAvailabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHostAvailabilityResponse
     */
    public DeleteHostAvailabilityResponse deleteHostAvailabilityWithOptions(DeleteHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHostAvailability"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHostAvailabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more availability monitoring tasks.</p>
     * 
     * @param request DeleteHostAvailabilityRequest
     * @return DeleteHostAvailabilityResponse
     */
    public DeleteHostAvailabilityResponse deleteHostAvailability(DeleteHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHostAvailabilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If a metric import task is created for metrics in a namespace, you cannot delete the namespace unless you delete the task first.
     * This topic provides an example on how to delete a namespace named <code>aliyun</code>. The response shows that the namespace is deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a namespace.</p>
     * 
     * @param request DeleteHybridMonitorNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHybridMonitorNamespaceResponse
     */
    public DeleteHybridMonitorNamespaceResponse deleteHybridMonitorNamespaceWithOptions(DeleteHybridMonitorNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHybridMonitorNamespace"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHybridMonitorNamespaceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If a metric import task is created for metrics in a namespace, you cannot delete the namespace unless you delete the task first.
     * This topic provides an example on how to delete a namespace named <code>aliyun</code>. The response shows that the namespace is deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a namespace.</p>
     * 
     * @param request DeleteHybridMonitorNamespaceRequest
     * @return DeleteHybridMonitorNamespaceResponse
     */
    public DeleteHybridMonitorNamespaceResponse deleteHybridMonitorNamespace(DeleteHybridMonitorNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHybridMonitorNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a Logstore group named <code>Logstore_test</code>. The response shows that the Logstore group is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logstore group.</p>
     * 
     * @param request DeleteHybridMonitorSLSGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHybridMonitorSLSGroupResponse
     */
    public DeleteHybridMonitorSLSGroupResponse deleteHybridMonitorSLSGroupWithOptions(DeleteHybridMonitorSLSGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SLSGroupName)) {
            query.put("SLSGroupName", request.SLSGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHybridMonitorSLSGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHybridMonitorSLSGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a Logstore group named <code>Logstore_test</code>. The response shows that the Logstore group is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logstore group.</p>
     * 
     * @param request DeleteHybridMonitorSLSGroupRequest
     * @return DeleteHybridMonitorSLSGroupResponse
     */
    public DeleteHybridMonitorSLSGroupResponse deleteHybridMonitorSLSGroup(DeleteHybridMonitorSLSGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHybridMonitorSLSGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a metric import task whose ID is <code>36****</code>. The returned result indicates that the metric import task is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a metric import task for Alibaba Cloud services or a metric for the logs that are imported from Log Service.</p>
     * 
     * @param request DeleteHybridMonitorTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHybridMonitorTaskResponse
     */
    public DeleteHybridMonitorTaskResponse deleteHybridMonitorTaskWithOptions(DeleteHybridMonitorTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHybridMonitorTask"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHybridMonitorTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a metric import task whose ID is <code>36****</code>. The returned result indicates that the metric import task is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a metric import task for Alibaba Cloud services or a metric for the logs that are imported from Log Service.</p>
     * 
     * @param request DeleteHybridMonitorTaskRequest
     * @return DeleteHybridMonitorTaskResponse
     */
    public DeleteHybridMonitorTaskResponse deleteHybridMonitorTask(DeleteHybridMonitorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHybridMonitorTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a log monitoring metric.</p>
     * 
     * @param request DeleteLogMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogMonitorResponse
     */
    public DeleteLogMonitorResponse deleteLogMonitorWithOptions(DeleteLogMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logId)) {
            query.put("LogId", request.logId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogMonitor"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a log monitoring metric.</p>
     * 
     * @param request DeleteLogMonitorRequest
     * @return DeleteLogMonitorResponse
     */
    public DeleteLogMonitorResponse deleteLogMonitor(DeleteLogMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple blacklist policies at a time.</p>
     * 
     * @param request DeleteMetricRuleBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetricRuleBlackListResponse
     */
    public DeleteMetricRuleBlackListResponse deleteMetricRuleBlackListWithOptions(DeleteMetricRuleBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetricRuleBlackList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetricRuleBlackListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple blacklist policies at a time.</p>
     * 
     * @param request DeleteMetricRuleBlackListRequest
     * @return DeleteMetricRuleBlackListResponse
     */
    public DeleteMetricRuleBlackListResponse deleteMetricRuleBlackList(DeleteMetricRuleBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRuleBlackListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates resources from an alert rule.</p>
     * 
     * @param request DeleteMetricRuleResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetricRuleResourcesResponse
     */
    public DeleteMetricRuleResourcesResponse deleteMetricRuleResourcesWithOptions(DeleteMetricRuleResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetricRuleResources"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetricRuleResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates resources from an alert rule.</p>
     * 
     * @param request DeleteMetricRuleResourcesRequest
     * @return DeleteMetricRuleResourcesResponse
     */
    public DeleteMetricRuleResourcesResponse deleteMetricRuleResources(DeleteMetricRuleResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRuleResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the push channels of an alert rule.</p>
     * 
     * @param request DeleteMetricRuleTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetricRuleTargetsResponse
     */
    public DeleteMetricRuleTargetsResponse deleteMetricRuleTargetsWithOptions(DeleteMetricRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIds)) {
            query.put("TargetIds", request.targetIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetricRuleTargets"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetricRuleTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the push channels of an alert rule.</p>
     * 
     * @param request DeleteMetricRuleTargetsRequest
     * @return DeleteMetricRuleTargetsResponse
     */
    public DeleteMetricRuleTargetsResponse deleteMetricRuleTargets(DeleteMetricRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRuleTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert template.</p>
     * 
     * @param request DeleteMetricRuleTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetricRuleTemplateResponse
     */
    public DeleteMetricRuleTemplateResponse deleteMetricRuleTemplateWithOptions(DeleteMetricRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetricRuleTemplate"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetricRuleTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert template.</p>
     * 
     * @param request DeleteMetricRuleTemplateRequest
     * @return DeleteMetricRuleTemplateResponse
     */
    public DeleteMetricRuleTemplateResponse deleteMetricRuleTemplate(DeleteMetricRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRuleTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more alert rules.</p>
     * 
     * @param request DeleteMetricRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetricRulesResponse
     */
    public DeleteMetricRulesResponse deleteMetricRulesWithOptions(DeleteMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetricRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetricRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more alert rules.</p>
     * 
     * @param request DeleteMetricRulesRequest
     * @return DeleteMetricRulesResponse
     */
    public DeleteMetricRulesResponse deleteMetricRules(DeleteMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMetricRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application group.</p>
     * 
     * @param request DeleteMonitorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorGroupResponse
     */
    public DeleteMonitorGroupResponse deleteMonitorGroupWithOptions(DeleteMonitorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application group.</p>
     * 
     * @param request DeleteMonitorGroupRequest
     * @return DeleteMonitorGroupResponse
     */
    public DeleteMonitorGroupResponse deleteMonitorGroup(DeleteMonitorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a rule that is used to dynamically add instances of a service that meet the rule to an application group.</p>
     * 
     * @param request DeleteMonitorGroupDynamicRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorGroupDynamicRuleResponse
     */
    public DeleteMonitorGroupDynamicRuleResponse deleteMonitorGroupDynamicRuleWithOptions(DeleteMonitorGroupDynamicRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorGroupDynamicRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorGroupDynamicRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a rule that is used to dynamically add instances of a service that meet the rule to an application group.</p>
     * 
     * @param request DeleteMonitorGroupDynamicRuleRequest
     * @return DeleteMonitorGroupDynamicRuleResponse
     */
    public DeleteMonitorGroupDynamicRuleResponse deleteMonitorGroupDynamicRule(DeleteMonitorGroupDynamicRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupDynamicRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes instances from an application group.</p>
     * 
     * @param request DeleteMonitorGroupInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorGroupInstancesResponse
     */
    public DeleteMonitorGroupInstancesResponse deleteMonitorGroupInstancesWithOptions(DeleteMonitorGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorGroupInstances"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorGroupInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes instances from an application group.</p>
     * 
     * @param request DeleteMonitorGroupInstancesRequest
     * @return DeleteMonitorGroupInstancesResponse
     */
    public DeleteMonitorGroupInstancesResponse deleteMonitorGroupInstances(DeleteMonitorGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a policy that is used to pause alert notifications for an application group.</p>
     * 
     * @param request DeleteMonitorGroupNotifyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitorGroupNotifyPolicyResponse
     */
    public DeleteMonitorGroupNotifyPolicyResponse deleteMonitorGroupNotifyPolicyWithOptions(DeleteMonitorGroupNotifyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitorGroupNotifyPolicy"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitorGroupNotifyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a policy that is used to pause alert notifications for an application group.</p>
     * 
     * @param request DeleteMonitorGroupNotifyPolicyRequest
     * @return DeleteMonitorGroupNotifyPolicyResponse
     */
    public DeleteMonitorGroupNotifyPolicyResponse deleteMonitorGroupNotifyPolicy(DeleteMonitorGroupNotifyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitorGroupNotifyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables monitoring on a process.</p>
     * 
     * @param request DeleteMonitoringAgentProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMonitoringAgentProcessResponse
     */
    public DeleteMonitoringAgentProcessResponse deleteMonitoringAgentProcessWithOptions(DeleteMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            query.put("ProcessId", request.processId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            query.put("ProcessName", request.processName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMonitoringAgentProcess"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMonitoringAgentProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables monitoring on a process.</p>
     * 
     * @param request DeleteMonitoringAgentProcessRequest
     * @return DeleteMonitoringAgentProcessResponse
     */
    public DeleteMonitoringAgentProcessResponse deleteMonitoringAgentProcess(DeleteMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMonitoringAgentProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more site monitoring tasks.</p>
     * 
     * @param request DeleteSiteMonitorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSiteMonitorsResponse
     */
    public DeleteSiteMonitorsResponse deleteSiteMonitorsWithOptions(DeleteSiteMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isDeleteAlarms)) {
            query.put("IsDeleteAlarms", request.isDeleteAlarms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("TaskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSiteMonitors"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSiteMonitorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more site monitoring tasks.</p>
     * 
     * @param request DeleteSiteMonitorsRequest
     * @return DeleteSiteMonitorsResponse
     */
    public DeleteSiteMonitorsResponse deleteSiteMonitors(DeleteSiteMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSiteMonitorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of initiative alert rules.</p>
     * 
     * @param request DescribeActiveMetricRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActiveMetricRuleListResponse
     */
    public DescribeActiveMetricRuleListResponse describeActiveMetricRuleListWithOptions(DescribeActiveMetricRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveMetricRuleList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveMetricRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of initiative alert rules.</p>
     * 
     * @param request DescribeActiveMetricRuleListRequest
     * @return DescribeActiveMetricRuleListResponse
     */
    public DescribeActiveMetricRuleListResponse describeActiveMetricRuleList(DescribeActiveMetricRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveMetricRuleListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is no longer maintained. We recommend that you call the <a href="https://help.aliyun.com/document_detail/201087.html">DescribeAlertLogList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries historical alerts.</p>
     * 
     * @deprecated OpenAPI DescribeAlertHistoryList is deprecated, please use Cms::2019-01-01::DescribeAlertLogList instead.
     * 
     * @param request DescribeAlertHistoryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertHistoryListResponse
     */
    @Deprecated
    // Deprecated
    public DescribeAlertHistoryListResponse describeAlertHistoryListWithOptions(DescribeAlertHistoryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ascending)) {
            query.put("Ascending", request.ascending);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertHistoryList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertHistoryListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is no longer maintained. We recommend that you call the <a href="https://help.aliyun.com/document_detail/201087.html">DescribeAlertLogList</a> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries historical alerts.</p>
     * 
     * @deprecated OpenAPI DescribeAlertHistoryList is deprecated, please use Cms::2019-01-01::DescribeAlertLogList instead.
     * 
     * @param request DescribeAlertHistoryListRequest
     * @return DescribeAlertHistoryListResponse
     */
    @Deprecated
    // Deprecated
    public DescribeAlertHistoryListResponse describeAlertHistoryList(DescribeAlertHistoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertHistoryListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the statistics of alert logs.
     * This topic provides an example on how to query the statistics of alert logs for Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics of alert logs.</p>
     * 
     * @param request DescribeAlertLogCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertLogCountResponse
     */
    public DescribeAlertLogCountResponse describeAlertLogCountWithOptions(DescribeAlertLogCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroup)) {
            query.put("ContactGroup", request.contactGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastMin)) {
            query.put("LastMin", request.lastMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendStatus)) {
            query.put("SendStatus", request.sendStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertLogCount"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertLogCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the statistics of alert logs.
     * This topic provides an example on how to query the statistics of alert logs for Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics of alert logs.</p>
     * 
     * @param request DescribeAlertLogCountRequest
     * @return DescribeAlertLogCountResponse
     */
    public DescribeAlertLogCountResponse describeAlertLogCount(DescribeAlertLogCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertLogCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the number of alert logs for Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of alert logs that are generated during each interval within a period of time.</p>
     * 
     * @param request DescribeAlertLogHistogramRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertLogHistogramResponse
     */
    public DescribeAlertLogHistogramResponse describeAlertLogHistogramWithOptions(DescribeAlertLogHistogramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroup)) {
            query.put("ContactGroup", request.contactGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastMin)) {
            query.put("LastMin", request.lastMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendStatus)) {
            query.put("SendStatus", request.sendStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertLogHistogram"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertLogHistogramResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the number of alert logs for Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of alert logs that are generated during each interval within a period of time.</p>
     * 
     * @param request DescribeAlertLogHistogramRequest
     * @return DescribeAlertLogHistogramResponse
     */
    public DescribeAlertLogHistogramResponse describeAlertLogHistogram(DescribeAlertLogHistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertLogHistogramWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to query only the alert logs within the last year.
     * This topic provides an example to show how to query the alert logs of Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert logs.</p>
     * 
     * @param request DescribeAlertLogListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertLogListResponse
     */
    public DescribeAlertLogListResponse describeAlertLogListWithOptions(DescribeAlertLogListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroup)) {
            query.put("ContactGroup", request.contactGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastMin)) {
            query.put("LastMin", request.lastMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendStatus)) {
            query.put("SendStatus", request.sendStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertLogList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertLogListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to query only the alert logs within the last year.
     * This topic provides an example to show how to query the alert logs of Elastic Compute Service (ECS) based on the <code>product</code> dimension.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert logs.</p>
     * 
     * @param request DescribeAlertLogListRequest
     * @return DescribeAlertLogListResponse
     */
    public DescribeAlertLogListResponse describeAlertLogList(DescribeAlertLogListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertLogListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources for which active alerts are triggered based on an alert rule.</p>
     * 
     * @param request DescribeAlertingMetricRuleResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAlertingMetricRuleResourcesResponse
     */
    public DescribeAlertingMetricRuleResourcesResponse describeAlertingMetricRuleResourcesWithOptions(DescribeAlertingMetricRuleResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAlertingMetricRuleResources"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAlertingMetricRuleResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources for which active alerts are triggered based on an alert rule.</p>
     * 
     * @param request DescribeAlertingMetricRuleResourcesRequest
     * @return DescribeAlertingMetricRuleResourcesResponse
     */
    public DescribeAlertingMetricRuleResourcesResponse describeAlertingMetricRuleResources(DescribeAlertingMetricRuleResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAlertingMetricRuleResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert groups.</p>
     * 
     * @param request DescribeContactGroupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContactGroupListResponse
     */
    public DescribeContactGroupListResponse describeContactGroupListWithOptions(DescribeContactGroupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContactGroupList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContactGroupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert groups.</p>
     * 
     * @param request DescribeContactGroupListRequest
     * @return DescribeContactGroupListResponse
     */
    public DescribeContactGroupListResponse describeContactGroupList(DescribeContactGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContactGroupListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert contacts.</p>
     * 
     * @param request DescribeContactListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContactListResponse
     */
    public DescribeContactListResponse describeContactListWithOptions(DescribeContactListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chanelType)) {
            query.put("ChanelType", request.chanelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chanelValue)) {
            query.put("ChanelValue", request.chanelValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContactList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContactListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries alert contacts.</p>
     * 
     * @param request DescribeContactListRequest
     * @return DescribeContactListResponse
     */
    public DescribeContactListResponse describeContactList(DescribeContactListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContactListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert contacts in an alert contact group.</p>
     * 
     * @param request DescribeContactListByContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeContactListByContactGroupResponse
     */
    public DescribeContactListByContactGroupResponse describeContactListByContactGroupWithOptions(DescribeContactListByContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            query.put("ContactGroupName", request.contactGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeContactListByContactGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeContactListByContactGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the alert contacts in an alert contact group.</p>
     * 
     * @param request DescribeContactListByContactGroupRequest
     * @return DescribeContactListByContactGroupResponse
     */
    public DescribeContactListByContactGroupResponse describeContactListByContactGroup(DescribeContactListByContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeContactListByContactGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom event that occurred in a specified time period.</p>
     * 
     * @param request DescribeCustomEventAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomEventAttributeResponse
     */
    public DescribeCustomEventAttributeResponse describeCustomEventAttributeWithOptions(DescribeCustomEventAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeywords)) {
            query.put("SearchKeywords", request.searchKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomEventAttribute"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomEventAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a custom event that occurred in a specified time period.</p>
     * 
     * @param request DescribeCustomEventAttributeRequest
     * @return DescribeCustomEventAttributeResponse
     */
    public DescribeCustomEventAttributeResponse describeCustomEventAttribute(DescribeCustomEventAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomEventAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation counts the number of times that a custom event occurred for each service.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of times that a custom event occurred in a specified time period.</p>
     * 
     * @param request DescribeCustomEventCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomEventCountResponse
     */
    public DescribeCustomEventCountResponse describeCustomEventCountWithOptions(DescribeCustomEventCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeywords)) {
            query.put("SearchKeywords", request.searchKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomEventCount"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomEventCountResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation counts the number of times that a custom event occurred for each service.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of times that a custom event occurred in a specified time period.</p>
     * 
     * @param request DescribeCustomEventCountRequest
     * @return DescribeCustomEventCountResponse
     */
    public DescribeCustomEventCountResponse describeCustomEventCount(DescribeCustomEventCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomEventCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of times that a custom event occurred during each interval of a time period.</p>
     * 
     * @param request DescribeCustomEventHistogramRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomEventHistogramResponse
     */
    public DescribeCustomEventHistogramResponse describeCustomEventHistogramWithOptions(DescribeCustomEventHistogramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeywords)) {
            query.put("SearchKeywords", request.searchKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomEventHistogram"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomEventHistogramResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of times that a custom event occurred during each interval of a time period.</p>
     * 
     * @param request DescribeCustomEventHistogramRequest
     * @return DescribeCustomEventHistogramResponse
     */
    public DescribeCustomEventHistogramResponse describeCustomEventHistogram(DescribeCustomEventHistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomEventHistogramWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call the DescribeMetricList operation to query the metrics of cloud services. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the reported monitoring data.</p>
     * 
     * @param request DescribeCustomMetricListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCustomMetricListResponse
     */
    public DescribeCustomMetricListResponse describeCustomMetricListWithOptions(DescribeCustomMetricListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            query.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            query.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCustomMetricList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCustomMetricListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call the DescribeMetricList operation to query the metrics of cloud services. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the reported monitoring data.</p>
     * 
     * @param request DescribeCustomMetricListRequest
     * @return DescribeCustomMetricListResponse
     */
    public DescribeCustomMetricListResponse describeCustomMetricList(DescribeCustomMetricListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomMetricListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query tag rules that are related to <code>tagkey1</code>. The sample responses indicate that two tag rules are found. The rule IDs are <code>1536df65-a719-429d-8813-73cc40d7****</code> and <code>56e8cebb-b3d7-4a91-9880-78a8c84f****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries tag rules.</p>
     * 
     * @param request DescribeDynamicTagRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDynamicTagRuleListResponse
     */
    public DescribeDynamicTagRuleListResponse describeDynamicTagRuleListWithOptions(DescribeDynamicTagRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dynamicTagRuleId)) {
            query.put("DynamicTagRuleId", request.dynamicTagRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagRegionId)) {
            query.put("TagRegionId", request.tagRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("TagValue", request.tagValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDynamicTagRuleList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDynamicTagRuleListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query tag rules that are related to <code>tagkey1</code>. The sample responses indicate that two tag rules are found. The rule IDs are <code>1536df65-a719-429d-8813-73cc40d7****</code> and <code>56e8cebb-b3d7-4a91-9880-78a8c84f****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries tag rules.</p>
     * 
     * @param request DescribeDynamicTagRuleListRequest
     * @return DescribeDynamicTagRuleListResponse
     */
    public DescribeDynamicTagRuleListResponse describeDynamicTagRuleList(DescribeDynamicTagRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDynamicTagRuleListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the details of an event-triggered alert rule named <code>testRule</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an event-triggered alert rule.</p>
     * 
     * @param request DescribeEventRuleAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventRuleAttributeResponse
     */
    public DescribeEventRuleAttributeResponse describeEventRuleAttributeWithOptions(DescribeEventRuleAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventRuleAttribute"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventRuleAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the details of an event-triggered alert rule named <code>testRule</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an event-triggered alert rule.</p>
     * 
     * @param request DescribeEventRuleAttributeRequest
     * @return DescribeEventRuleAttributeResponse
     */
    public DescribeEventRuleAttributeResponse describeEventRuleAttribute(DescribeEventRuleAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventRuleAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries event-triggered alert rules.</p>
     * 
     * @param request DescribeEventRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventRuleListResponse
     */
    public DescribeEventRuleListResponse describeEventRuleListWithOptions(DescribeEventRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnable)) {
            query.put("IsEnable", request.isEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePrefix)) {
            query.put("NamePrefix", request.namePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventRuleList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries event-triggered alert rules.</p>
     * 
     * @param request DescribeEventRuleListRequest
     * @return DescribeEventRuleListResponse
     */
    public DescribeEventRuleListResponse describeEventRuleList(DescribeEventRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventRuleListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the details of an event-triggered alert rule named <code>testRule</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event-triggered alert rules.</p>
     * 
     * @param request DescribeEventRuleTargetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventRuleTargetListResponse
     */
    public DescribeEventRuleTargetListResponse describeEventRuleTargetListWithOptions(DescribeEventRuleTargetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventRuleTargetList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventRuleTargetListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the details of an event-triggered alert rule named <code>testRule</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries event-triggered alert rules.</p>
     * 
     * @param request DescribeEventRuleTargetListRequest
     * @return DescribeEventRuleTargetListResponse
     */
    public DescribeEventRuleTargetListResponse describeEventRuleTargetList(DescribeEventRuleTargetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventRuleTargetListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries configuration sets that are used to export monitoring data.</p>
     * 
     * @param request DescribeExporterOutputListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExporterOutputListResponse
     */
    public DescribeExporterOutputListResponse describeExporterOutputListWithOptions(DescribeExporterOutputListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExporterOutputList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExporterOutputListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries configuration sets that are used to export monitoring data.</p>
     * 
     * @param request DescribeExporterOutputListRequest
     * @return DescribeExporterOutputListResponse
     */
    public DescribeExporterOutputListResponse describeExporterOutputList(DescribeExporterOutputListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExporterOutputListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data export rules.</p>
     * 
     * @param request DescribeExporterRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExporterRuleListResponse
     */
    public DescribeExporterRuleListResponse describeExporterRuleListWithOptions(DescribeExporterRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExporterRuleList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExporterRuleListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data export rules.</p>
     * 
     * @param request DescribeExporterRuleListRequest
     * @return DescribeExporterRuleListResponse
     */
    public DescribeExporterRuleListResponse describeExporterRuleList(DescribeExporterRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExporterRuleListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create a process monitoring task to monitor all or the specified Elastic Compute Service (ECS) instances in an application group and configure alert rules for the process monitoring task.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the process monitoring tasks for an application group.</p>
     * 
     * @param request DescribeGroupMonitoringAgentProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupMonitoringAgentProcessResponse
     */
    public DescribeGroupMonitoringAgentProcessResponse describeGroupMonitoringAgentProcessWithOptions(DescribeGroupMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processName)) {
            query.put("ProcessName", request.processName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupMonitoringAgentProcess"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupMonitoringAgentProcessResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create a process monitoring task to monitor all or the specified Elastic Compute Service (ECS) instances in an application group and configure alert rules for the process monitoring task.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the process monitoring tasks for an application group.</p>
     * 
     * @param request DescribeGroupMonitoringAgentProcessRequest
     * @return DescribeGroupMonitoringAgentProcessResponse
     */
    public DescribeGroupMonitoringAgentProcessResponse describeGroupMonitoringAgentProcess(DescribeGroupMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query all the availability monitoring tasks of your Alibaba Cloud account. The sample responses indicate that the account has one availability monitoring task named <code>ecs_instance</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries availability monitoring tasks.</p>
     * 
     * @param request DescribeHostAvailabilityListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHostAvailabilityListResponse
     */
    public DescribeHostAvailabilityListResponse describeHostAvailabilityListWithOptions(DescribeHostAvailabilityListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHostAvailabilityList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHostAvailabilityListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query all the availability monitoring tasks of your Alibaba Cloud account. The sample responses indicate that the account has one availability monitoring task named <code>ecs_instance</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries availability monitoring tasks.</p>
     * 
     * @param request DescribeHostAvailabilityListRequest
     * @return DescribeHostAvailabilityListResponse
     */
    public DescribeHostAvailabilityListResponse describeHostAvailabilityList(DescribeHostAvailabilityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHostAvailabilityListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Limits</h1>
     * <p>The size of monitoring data that is returned in each call cannot exceed 1.5 MB. If the returned data reaches the upper limit, the query fails. You must reset the query conditions.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>AliyunEcs_cpu_total</code> metric in the <code>default-aliyun</code> namespace from <code>1653804865</code> (14:14:25 on May 29, 2022) to <code>1653805225</code> (14:20:25 on May 29, 2022).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data in a namespace.</p>
     * 
     * @param request DescribeHybridMonitorDataListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridMonitorDataListResponse
     */
    public DescribeHybridMonitorDataListResponse describeHybridMonitorDataListWithOptions(DescribeHybridMonitorDataListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promSQL)) {
            query.put("PromSQL", request.promSQL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridMonitorDataList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridMonitorDataListResponse());
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Limits</h1>
     * <p>The size of monitoring data that is returned in each call cannot exceed 1.5 MB. If the returned data reaches the upper limit, the query fails. You must reset the query conditions.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>AliyunEcs_cpu_total</code> metric in the <code>default-aliyun</code> namespace from <code>1653804865</code> (14:14:25 on May 29, 2022) to <code>1653805225</code> (14:20:25 on May 29, 2022).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data in a namespace.</p>
     * 
     * @param request DescribeHybridMonitorDataListRequest
     * @return DescribeHybridMonitorDataListResponse
     */
    public DescribeHybridMonitorDataListResponse describeHybridMonitorDataList(DescribeHybridMonitorDataListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridMonitorDataListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, all namespaces within the current account are queried. The response shows that the current account has only one namespace named <code>aliyun-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries namespaces and the details of the related metric import tasks.</p>
     * 
     * @param request DescribeHybridMonitorNamespaceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridMonitorNamespaceListResponse
     */
    public DescribeHybridMonitorNamespaceListResponse describeHybridMonitorNamespaceListWithOptions(DescribeHybridMonitorNamespaceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showTaskStatistic)) {
            query.put("ShowTaskStatistic", request.showTaskStatistic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridMonitorNamespaceList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridMonitorNamespaceListResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, all namespaces within the current account are queried. The response shows that the current account has only one namespace named <code>aliyun-test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries namespaces and the details of the related metric import tasks.</p>
     * 
     * @param request DescribeHybridMonitorNamespaceListRequest
     * @return DescribeHybridMonitorNamespaceListResponse
     */
    public DescribeHybridMonitorNamespaceListResponse describeHybridMonitorNamespaceList(DescribeHybridMonitorNamespaceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridMonitorNamespaceListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, all Logstore groups within the current account are queried. The response shows that the current account has two Logstore groups: <code>Logstore_test</code> and <code>Logstore_aliyun</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries Logstore groups.</p>
     * 
     * @param request DescribeHybridMonitorSLSGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridMonitorSLSGroupResponse
     */
    public DescribeHybridMonitorSLSGroupResponse describeHybridMonitorSLSGroupWithOptions(DescribeHybridMonitorSLSGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSGroupName)) {
            query.put("SLSGroupName", request.SLSGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridMonitorSLSGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridMonitorSLSGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, all Logstore groups within the current account are queried. The response shows that the current account has two Logstore groups: <code>Logstore_test</code> and <code>Logstore_aliyun</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries Logstore groups.</p>
     * 
     * @param request DescribeHybridMonitorSLSGroupRequest
     * @return DescribeHybridMonitorSLSGroupResponse
     */
    public DescribeHybridMonitorSLSGroupResponse describeHybridMonitorSLSGroup(DescribeHybridMonitorSLSGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridMonitorSLSGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all metric import tasks that belong to the current Alibaba Cloud account. The returned result indicates that the current account has only one metric import task. The metric import task is named <code>aliyun_task</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries metric import tasks.</p>
     * 
     * @param request DescribeHybridMonitorTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHybridMonitorTaskListResponse
     */
    public DescribeHybridMonitorTaskListResponse describeHybridMonitorTaskListWithOptions(DescribeHybridMonitorTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeAliyunTask)) {
            query.put("IncludeAliyunTask", request.includeAliyunTask);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            query.put("TargetUserId", request.targetUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHybridMonitorTaskList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHybridMonitorTaskListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all metric import tasks that belong to the current Alibaba Cloud account. The returned result indicates that the current account has only one metric import task. The metric import task is named <code>aliyun_task</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries metric import tasks.</p>
     * 
     * @param request DescribeHybridMonitorTaskListRequest
     * @return DescribeHybridMonitorTaskListResponse
     */
    public DescribeHybridMonitorTaskListResponse describeHybridMonitorTaskList(DescribeHybridMonitorTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHybridMonitorTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a log monitoring metric.</p>
     * 
     * @param request DescribeLogMonitorAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogMonitorAttributeResponse
     */
    public DescribeLogMonitorAttributeResponse describeLogMonitorAttributeWithOptions(DescribeLogMonitorAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogMonitorAttribute"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogMonitorAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a log monitoring metric.</p>
     * 
     * @param request DescribeLogMonitorAttributeRequest
     * @return DescribeLogMonitorAttributeResponse
     */
    public DescribeLogMonitorAttributeResponse describeLogMonitorAttribute(DescribeLogMonitorAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogMonitorAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries log monitoring metrics.</p>
     * 
     * @param request DescribeLogMonitorListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogMonitorListResponse
     */
    public DescribeLogMonitorListResponse describeLogMonitorListWithOptions(DescribeLogMonitorListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            query.put("SearchValue", request.searchValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogMonitorList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogMonitorListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries log monitoring metrics.</p>
     * 
     * @param request DescribeLogMonitorListRequest
     * @return DescribeLogMonitorListResponse
     */
    public DescribeLogMonitorListResponse describeLogMonitorList(DescribeLogMonitorListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogMonitorListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <h3><a href="#"></a>Description</h3>
     * <blockquote>
     * <p> Different from <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>, the DescribeMetricData operation provides statistical features. You can set the Dimension parameter to <code>{&quot;instanceId&quot;: &quot;i-abcdefgh12****&quot;}</code> to aggregate all data of your Alibaba Cloud account.
     * This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of a metric for a specified cloud service.</p>
     * 
     * @param request DescribeMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricDataResponse
     */
    public DescribeMetricDataResponse describeMetricDataWithOptions(DescribeMetricDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.express)) {
            query.put("Express", request.express);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricData"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <h3><a href="#"></a>Description</h3>
     * <blockquote>
     * <p> Different from <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a>, the DescribeMetricData operation provides statistical features. You can set the Dimension parameter to <code>{&quot;instanceId&quot;: &quot;i-abcdefgh12****&quot;}</code> to aggregate all data of your Alibaba Cloud account.
     * This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of a metric for a specified cloud service.</p>
     * 
     * @param request DescribeMetricDataRequest
     * @return DescribeMetricDataResponse
     */
    public DescribeMetricDataResponse describeMetricData(DescribeMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 50 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <blockquote>
     * <p> If <code>Throttling.User</code> or <code>Request was denied due to user flow control</code> is returned when you call an API operation, the API operation is throttled. For more information about how to handle the issue, see <a href="https://help.aliyun.com/document_detail/2615031.html">How do I handle the throttling of a query API?</a></p>
     * </blockquote>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The storage duration of the monitoring data of each cloud service is related to the <code>Period</code> parameter (statistical period). A larger value of the <code>Period</code> parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:</p>
     * <ul>
     * <li>If the value of the <code>Period</code> parameter is less than 60 seconds, the storage duration is seven days.</li>
     * <li>If the value of the <code>Period</code> parameter is 60 seconds, the storage duration is 31 days.</li>
     * <li>If the value of the <code>Period</code> parameter is 300 seconds, the storage duration is 91 days.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query the latest monitoring data of the <code>CPUUtilization</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The returned result indicates that the monitoring data for the instance <code>i-abcdefgh12****</code> of the account <code>123456789876****</code> is queried at an interval of 60 seconds. The maximum, minimum, and average values of the metric are 100, 93.1, and 99.52.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the latest monitoring data of a metric.</p>
     * 
     * @param request DescribeMetricLastRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricLastResponse
     */
    public DescribeMetricLastResponse describeMetricLastWithOptions(DescribeMetricLastRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.express)) {
            query.put("Express", request.express);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricLast"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricLastResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 50 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <blockquote>
     * <p> If <code>Throttling.User</code> or <code>Request was denied due to user flow control</code> is returned when you call an API operation, the API operation is throttled. For more information about how to handle the issue, see <a href="https://help.aliyun.com/document_detail/2615031.html">How do I handle the throttling of a query API?</a></p>
     * </blockquote>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The storage duration of the monitoring data of each cloud service is related to the <code>Period</code> parameter (statistical period). A larger value of the <code>Period</code> parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:</p>
     * <ul>
     * <li>If the value of the <code>Period</code> parameter is less than 60 seconds, the storage duration is seven days.</li>
     * <li>If the value of the <code>Period</code> parameter is 60 seconds, the storage duration is 31 days.</li>
     * <li>If the value of the <code>Period</code> parameter is 300 seconds, the storage duration is 91 days.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query the latest monitoring data of the <code>CPUUtilization</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The returned result indicates that the monitoring data for the instance <code>i-abcdefgh12****</code> of the account <code>123456789876****</code> is queried at an interval of 60 seconds. The maximum, minimum, and average values of the metric are 100, 93.1, and 99.52.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the latest monitoring data of a metric.</p>
     * 
     * @param request DescribeMetricLastRequest
     * @return DescribeMetricLastResponse
     */
    public DescribeMetricLastResponse describeMetricLast(DescribeMetricLastRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricLastWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each API operation can be called up to 50 times per second. An Alibaba Cloud account and the RAM users within the account share the quota. </p>
     * <blockquote>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The returned result indicates that the monitoring data for the instance <code>i-abcdefgh12****</code> of the account <code>120886317861****</code> is queried at an interval of 60 seconds. The maximum, minimum, and average values of the metric are 100, 93.1, and 99.52.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of a metric for a specified cloud service.</p>
     * 
     * @param request DescribeMetricListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricListResponse
     */
    public DescribeMetricListResponse describeMetricListWithOptions(DescribeMetricListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.express)) {
            query.put("Express", request.express);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricListResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each API operation can be called up to 50 times per second. An Alibaba Cloud account and the RAM users within the account share the quota. </p>
     * <blockquote>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The returned result indicates that the monitoring data for the instance <code>i-abcdefgh12****</code> of the account <code>120886317861****</code> is queried at an interval of 60 seconds. The maximum, minimum, and average values of the metric are 100, 93.1, and 99.52.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the monitoring data of a metric for a specified cloud service.</p>
     * 
     * @param request DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    public DescribeMetricListResponse describeMetricList(DescribeMetricListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used together with DescribeMetricList and DescribeMetricLast. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a> and <a href="https://help.aliyun.com/document_detail/51939.html">DescribeMetricLast</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of metrics that are supported in CloudMonitor.</p>
     * 
     * @param request DescribeMetricMetaListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricMetaListResponse
     */
    public DescribeMetricMetaListResponse describeMetricMetaListWithOptions(DescribeMetricMetaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricMetaList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricMetaListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is used together with DescribeMetricList and DescribeMetricLast. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a> and <a href="https://help.aliyun.com/document_detail/51939.html">DescribeMetricLast</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of metrics that are supported in CloudMonitor.</p>
     * 
     * @param request DescribeMetricMetaListRequest
     * @return DescribeMetricMetaListResponse
     */
    public DescribeMetricMetaListResponse describeMetricMetaList(DescribeMetricMetaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricMetaListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMetricRuleBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricRuleBlackListResponse
     */
    public DescribeMetricRuleBlackListResponse describeMetricRuleBlackListWithOptions(DescribeMetricRuleBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnable)) {
            query.put("IsEnable", request.isEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            query.put("ScopeType", request.scopeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricRuleBlackList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricRuleBlackListResponse());
    }

    /**
     * @param request DescribeMetricRuleBlackListRequest
     * @return DescribeMetricRuleBlackListResponse
     */
    public DescribeMetricRuleBlackListResponse describeMetricRuleBlackList(DescribeMetricRuleBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleBlackListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of alert rules in each state.</p>
     * 
     * @param request DescribeMetricRuleCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricRuleCountResponse
     */
    public DescribeMetricRuleCountResponse describeMetricRuleCountWithOptions(DescribeMetricRuleCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricRuleCount"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricRuleCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of alert rules in each state.</p>
     * 
     * @param request DescribeMetricRuleCountRequest
     * @return DescribeMetricRuleCountResponse
     */
    public DescribeMetricRuleCountResponse describeMetricRuleCount(DescribeMetricRuleCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all alert rules within your Alibaba Cloud account. The returned result shows that only one alert rule is found. The name of the alert rule is <code>Rule_01</code> and the ID is <code>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert rules.</p>
     * 
     * @param request DescribeMetricRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricRuleListResponse
     */
    public DescribeMetricRuleListResponse describeMetricRuleListWithOptions(DescribeMetricRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertState)) {
            query.put("AlertState", request.alertState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableState)) {
            query.put("EnableState", request.enableState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            query.put("RuleIds", request.ruleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricRuleList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricRuleListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all alert rules within your Alibaba Cloud account. The returned result shows that only one alert rule is found. The name of the alert rule is <code>Rule_01</code> and the ID is <code>applyTemplate344cfd42-0f32-4fd6-805a-88d7908a****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert rules.</p>
     * 
     * @param request DescribeMetricRuleListRequest
     * @return DescribeMetricRuleListResponse
     */
    public DescribeMetricRuleListResponse describeMetricRuleList(DescribeMetricRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limit</h2>
     * <p>This operation supports only Message Service (MNS) resources. </p>
     * <blockquote>
     * <p>This topic provides an example on how to query the resources that are associated with an alert rule whose ID is <code>ae06917_75a8c43178ab66****</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources that are associated with a specified alert rule.</p>
     * 
     * @param request DescribeMetricRuleTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricRuleTargetsResponse
     */
    public DescribeMetricRuleTargetsResponse describeMetricRuleTargetsWithOptions(DescribeMetricRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricRuleTargets"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricRuleTargetsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Limit</h2>
     * <p>This operation supports only Message Service (MNS) resources. </p>
     * <blockquote>
     * <p>This topic provides an example on how to query the resources that are associated with an alert rule whose ID is <code>ae06917_75a8c43178ab66****</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources that are associated with a specified alert rule.</p>
     * 
     * @param request DescribeMetricRuleTargetsRequest
     * @return DescribeMetricRuleTargetsResponse
     */
    public DescribeMetricRuleTargetsResponse describeMetricRuleTargets(DescribeMetricRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleTargetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of an alert template whose ID is <code>70****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an alert template.</p>
     * 
     * @param request DescribeMetricRuleTemplateAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricRuleTemplateAttributeResponse
     */
    public DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttributeWithOptions(DescribeMetricRuleTemplateAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricRuleTemplateAttribute"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricRuleTemplateAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of an alert template whose ID is <code>70****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an alert template.</p>
     * 
     * @param request DescribeMetricRuleTemplateAttributeRequest
     * @return DescribeMetricRuleTemplateAttributeResponse
     */
    public DescribeMetricRuleTemplateAttributeResponse describeMetricRuleTemplateAttribute(DescribeMetricRuleTemplateAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleTemplateAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query alert templates. In this example, the following alert templates are returned in the response: <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert templates.</p>
     * 
     * @param request DescribeMetricRuleTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricRuleTemplateListResponse
     */
    public DescribeMetricRuleTemplateListResponse describeMetricRuleTemplateListWithOptions(DescribeMetricRuleTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.history)) {
            query.put("History", request.history);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricRuleTemplateList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricRuleTemplateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query alert templates. In this example, the following alert templates are returned in the response: <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries alert templates.</p>
     * 
     * @param request DescribeMetricRuleTemplateListRequest
     * @return DescribeMetricRuleTemplateListResponse
     */
    public DescribeMetricRuleTemplateListResponse describeMetricRuleTemplateList(DescribeMetricRuleTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricRuleTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The storage duration of the monitoring data of each cloud service is related to the <code>Period</code> parameter (statistical period). A larger value of the <code>Period</code> parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:</p>
     * <ul>
     * <li>If the value of the <code>Period</code> parameter is less than 60 seconds, the storage duration is seven days.</li>
     * <li>If the value of the <code>Period</code> parameter is 60 seconds, the storage duration is 31 days.</li>
     * <li>If the value of the <code>Period</code> parameter is 300 seconds, the storage duration is 91 days.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric in the last 60 seconds for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The monitoring data is sorted in the descending order based on the <code>Average</code> field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the latest monitoring data of a metric for a cloud service. The data can be sorted by a specified order.</p>
     * 
     * @param request DescribeMetricTopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricTopResponse
     */
    public DescribeMetricTopResponse describeMetricTopWithOptions(DescribeMetricTopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.express)) {
            query.put("Express", request.express);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDesc)) {
            query.put("OrderDesc", request.orderDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderby)) {
            query.put("Orderby", request.orderby);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricTop"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricTopResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Each API operation can be called up to 10 times per second. An Alibaba Cloud account and the RAM users within the account share the quota.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>The storage duration of the monitoring data of each cloud service is related to the <code>Period</code> parameter (statistical period). A larger value of the <code>Period</code> parameter indicates that the monitoring data is distributed in a larger time range and the storage duration of the monitoring data is longer. The following list describes the specific relationships:</p>
     * <ul>
     * <li>If the value of the <code>Period</code> parameter is less than 60 seconds, the storage duration is seven days.</li>
     * <li>If the value of the <code>Period</code> parameter is 60 seconds, the storage duration is 31 days.</li>
     * <li>If the value of the <code>Period</code> parameter is 300 seconds, the storage duration is 91 days.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example to show how to query the monitoring data of the <code>cpu_idle</code> metric in the last 60 seconds for Elastic Compute Service (ECS). The namespace of ECS is <code>acs_ecs_dashboard</code>. The monitoring data is sorted in the descending order based on the <code>Average</code> field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the latest monitoring data of a metric for a cloud service. The data can be sorted by a specified order.</p>
     * 
     * @param request DescribeMetricTopRequest
     * @return DescribeMetricTopResponse
     */
    public DescribeMetricTopResponse describeMetricTop(DescribeMetricTopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricTopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud services to which the resources in an application group belong and the number of resources that belong to each cloud service in the application group.</p>
     * 
     * @param request DescribeMonitorGroupCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorGroupCategoriesResponse
     */
    public DescribeMonitorGroupCategoriesResponse describeMonitorGroupCategoriesWithOptions(DescribeMonitorGroupCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorGroupCategories"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorGroupCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud services to which the resources in an application group belong and the number of resources that belong to each cloud service in the application group.</p>
     * 
     * @param request DescribeMonitorGroupCategoriesRequest
     * @return DescribeMonitorGroupCategoriesResponse
     */
    public DescribeMonitorGroupCategoriesResponse describeMonitorGroupCategories(DescribeMonitorGroupCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the dynamic rules of an application group.</p>
     * 
     * @param request DescribeMonitorGroupDynamicRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorGroupDynamicRulesResponse
     */
    public DescribeMonitorGroupDynamicRulesResponse describeMonitorGroupDynamicRulesWithOptions(DescribeMonitorGroupDynamicRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorGroupDynamicRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorGroupDynamicRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the dynamic rules of an application group.</p>
     * 
     * @param request DescribeMonitorGroupDynamicRulesRequest
     * @return DescribeMonitorGroupDynamicRulesResponse
     */
    public DescribeMonitorGroupDynamicRulesResponse describeMonitorGroupDynamicRules(DescribeMonitorGroupDynamicRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupDynamicRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the resources in an application group.</p>
     * 
     * @param request DescribeMonitorGroupInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorGroupInstanceAttributeResponse
     */
    public DescribeMonitorGroupInstanceAttributeResponse describeMonitorGroupInstanceAttributeWithOptions(DescribeMonitorGroupInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.total)) {
            query.put("Total", request.total);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorGroupInstanceAttribute"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorGroupInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the resources in an application group.</p>
     * 
     * @param request DescribeMonitorGroupInstanceAttributeRequest
     * @return DescribeMonitorGroupInstanceAttributeResponse
     */
    public DescribeMonitorGroupInstanceAttributeResponse describeMonitorGroupInstanceAttribute(DescribeMonitorGroupInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources in an application group.</p>
     * 
     * @param request DescribeMonitorGroupInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorGroupInstancesResponse
     */
    public DescribeMonitorGroupInstancesResponse describeMonitorGroupInstancesWithOptions(DescribeMonitorGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorGroupInstances"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorGroupInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources in an application group.</p>
     * 
     * @param request DescribeMonitorGroupInstancesRequest
     * @return DescribeMonitorGroupInstancesResponse
     */
    public DescribeMonitorGroupInstancesResponse describeMonitorGroupInstances(DescribeMonitorGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the policies that are used to pause alert notifications for an application group.</p>
     * 
     * @param request DescribeMonitorGroupNotifyPolicyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorGroupNotifyPolicyListResponse
     */
    public DescribeMonitorGroupNotifyPolicyListResponse describeMonitorGroupNotifyPolicyListWithOptions(DescribeMonitorGroupNotifyPolicyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorGroupNotifyPolicyList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorGroupNotifyPolicyListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the policies that are used to pause alert notifications for an application group.</p>
     * 
     * @param request DescribeMonitorGroupNotifyPolicyListRequest
     * @return DescribeMonitorGroupNotifyPolicyListResponse
     */
    public DescribeMonitorGroupNotifyPolicyListResponse describeMonitorGroupNotifyPolicyList(DescribeMonitorGroupNotifyPolicyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupNotifyPolicyListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the application groups of the current account. The response shows that the current account has two application groups: <code>testGroup124</code> and <code>test123</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries application groups.</p>
     * 
     * @param request DescribeMonitorGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorGroupsResponse
     */
    public DescribeMonitorGroupsResponse describeMonitorGroupsWithOptions(DescribeMonitorGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dynamicTagRuleId)) {
            query.put("DynamicTagRuleId", request.dynamicTagRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupFounderTagKey)) {
            query.put("GroupFounderTagKey", request.groupFounderTagKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupFounderTagValue)) {
            query.put("GroupFounderTagValue", request.groupFounderTagValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeTemplateHistory)) {
            query.put("IncludeTemplateHistory", request.includeTemplateHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectContactGroups)) {
            query.put("SelectContactGroups", request.selectContactGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorGroups"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the application groups of the current account. The response shows that the current account has two application groups: <code>testGroup124</code> and <code>test123</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries application groups.</p>
     * 
     * @param request DescribeMonitorGroupsRequest
     * @return DescribeMonitorGroupsResponse
     */
    public DescribeMonitorGroupsResponse describeMonitorGroups(DescribeMonitorGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource quotas of CloudMonitor.</p>
     * 
     * @param request DescribeMonitorResourceQuotaAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorResourceQuotaAttributeResponse
     */
    public DescribeMonitorResourceQuotaAttributeResponse describeMonitorResourceQuotaAttributeWithOptions(DescribeMonitorResourceQuotaAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.showUsed)) {
            query.put("ShowUsed", request.showUsed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorResourceQuotaAttribute"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorResourceQuotaAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource quotas of CloudMonitor.</p>
     * 
     * @param request DescribeMonitorResourceQuotaAttributeRequest
     * @return DescribeMonitorResourceQuotaAttributeResponse
     */
    public DescribeMonitorResourceQuotaAttributeResponse describeMonitorResourceQuotaAttribute(DescribeMonitorResourceQuotaAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorResourceQuotaAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the AccessKey ID and AccessKey secret that are required to install the CloudMonitor agent on a third-party host.</p>
     * 
     * @param request DescribeMonitoringAgentAccessKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitoringAgentAccessKeyResponse
     */
    public DescribeMonitoringAgentAccessKeyResponse describeMonitoringAgentAccessKeyWithOptions(DescribeMonitoringAgentAccessKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitoringAgentAccessKey"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitoringAgentAccessKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the AccessKey ID and AccessKey secret that are required to install the CloudMonitor agent on a third-party host.</p>
     * 
     * @param request DescribeMonitoringAgentAccessKeyRequest
     * @return DescribeMonitoringAgentAccessKeyResponse
     */
    public DescribeMonitoringAgentAccessKeyResponse describeMonitoringAgentAccessKey(DescribeMonitoringAgentAccessKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentAccessKeyWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMonitoringAgentConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitoringAgentConfigResponse
     */
    public DescribeMonitoringAgentConfigResponse describeMonitoringAgentConfigWithOptions(DescribeMonitoringAgentConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitoringAgentConfig"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitoringAgentConfigResponse());
    }

    /**
     * @param request DescribeMonitoringAgentConfigRequest
     * @return DescribeMonitoringAgentConfigResponse
     */
    public DescribeMonitoringAgentConfigResponse describeMonitoringAgentConfig(DescribeMonitoringAgentConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all hosts within the current Alibaba Cloud account, including hosts on which the CloudMonitor agent is installed and uninstalled.</p>
     * 
     * @param request DescribeMonitoringAgentHostsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitoringAgentHostsResponse
     */
    public DescribeMonitoringAgentHostsResponse describeMonitoringAgentHostsWithOptions(DescribeMonitoringAgentHostsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunHost)) {
            query.put("AliyunHost", request.aliyunHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            query.put("InstanceRegionId", request.instanceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumbers)) {
            query.put("SerialNumbers", request.serialNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sysomStatus)) {
            query.put("SysomStatus", request.sysomStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitoringAgentHosts"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitoringAgentHostsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all hosts within the current Alibaba Cloud account, including hosts on which the CloudMonitor agent is installed and uninstalled.</p>
     * 
     * @param request DescribeMonitoringAgentHostsRequest
     * @return DescribeMonitoringAgentHostsResponse
     */
    public DescribeMonitoringAgentHostsResponse describeMonitoringAgentHosts(DescribeMonitoringAgentHostsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentHostsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, call the CreateMonitoringAgentProcess operation to create processes. For more information, see <a href="https://help.aliyun.com/document_detail/114951.html~">CreateMonitoringAgentProcess</a>.
     * This topic provides an example of how to query the processes of the <code>i-hp3hl3cx1pbahzy8****</code> instance. The response indicates the details of the <code>NGINX</code> and <code>HTTP</code> processes.</p>
     * </blockquote>
     * 
     * @param request DescribeMonitoringAgentProcessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitoringAgentProcessesResponse
     */
    public DescribeMonitoringAgentProcessesResponse describeMonitoringAgentProcessesWithOptions(DescribeMonitoringAgentProcessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitoringAgentProcesses"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitoringAgentProcessesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, call the CreateMonitoringAgentProcess operation to create processes. For more information, see <a href="https://help.aliyun.com/document_detail/114951.html~">CreateMonitoringAgentProcess</a>.
     * This topic provides an example of how to query the processes of the <code>i-hp3hl3cx1pbahzy8****</code> instance. The response indicates the details of the <code>NGINX</code> and <code>HTTP</code> processes.</p>
     * </blockquote>
     * 
     * @param request DescribeMonitoringAgentProcessesRequest
     * @return DescribeMonitoringAgentProcessesResponse
     */
    public DescribeMonitoringAgentProcessesResponse describeMonitoringAgentProcesses(DescribeMonitoringAgentProcessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentProcessesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the status of the CloudMonitor agent that is installed on the <code>i-hp3dunahluwajv6f****</code> instance. The result indicates that the CloudMonitor agent is in the <code>running</code> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of the CloudMonitor agent.</p>
     * 
     * @param request DescribeMonitoringAgentStatusesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitoringAgentStatusesResponse
     */
    public DescribeMonitoringAgentStatusesResponse describeMonitoringAgentStatusesWithOptions(DescribeMonitoringAgentStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostAvailabilityTaskId)) {
            query.put("HostAvailabilityTaskId", request.hostAvailabilityTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitoringAgentStatuses"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitoringAgentStatusesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the status of the CloudMonitor agent that is installed on the <code>i-hp3dunahluwajv6f****</code> instance. The result indicates that the CloudMonitor agent is in the <code>running</code> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of the CloudMonitor agent.</p>
     * 
     * @param request DescribeMonitoringAgentStatusesRequest
     * @return DescribeMonitoringAgentStatusesResponse
     */
    public DescribeMonitoringAgentStatusesResponse describeMonitoringAgentStatuses(DescribeMonitoringAgentStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringAgentStatusesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMonitoringConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitoringConfigResponse
     */
    public DescribeMonitoringConfigResponse describeMonitoringConfigWithOptions(DescribeMonitoringConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitoringConfig"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitoringConfigResponse());
    }

    /**
     * @param request DescribeMonitoringConfigRequest
     * @return DescribeMonitoringConfigResponse
     */
    public DescribeMonitoringConfigResponse describeMonitoringConfig(DescribeMonitoringConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitoringConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If a tag is attached to multiple cloud resources in the region, the key of the tag is returned only once.</p>
     * </blockquote>
     * 
     * @param request DescribeProductResourceTagKeyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductResourceTagKeyListResponse
     */
    public DescribeProductResourceTagKeyListResponse describeProductResourceTagKeyListWithOptions(DescribeProductResourceTagKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProductResourceTagKeyList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductResourceTagKeyListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If a tag is attached to multiple cloud resources in the region, the key of the tag is returned only once.</p>
     * </blockquote>
     * 
     * @param request DescribeProductResourceTagKeyListRequest
     * @return DescribeProductResourceTagKeyListResponse
     */
    public DescribeProductResourceTagKeyListResponse describeProductResourceTagKeyList(DescribeProductResourceTagKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductResourceTagKeyListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud services for which the initiative alert feature is enabled.</p>
     * 
     * @param request DescribeProductsOfActiveMetricRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductsOfActiveMetricRuleResponse
     */
    public DescribeProductsOfActiveMetricRuleResponse describeProductsOfActiveMetricRuleWithOptions(DescribeProductsOfActiveMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProductsOfActiveMetricRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductsOfActiveMetricRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the cloud services for which the initiative alert feature is enabled.</p>
     * 
     * @param request DescribeProductsOfActiveMetricRuleRequest
     * @return DescribeProductsOfActiveMetricRuleResponse
     */
    public DescribeProductsOfActiveMetricRuleResponse describeProductsOfActiveMetricRule(DescribeProductsOfActiveMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductsOfActiveMetricRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The information obtained by this operation includes the service description, namespace, and tags.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about monitored services in CloudMonitor.</p>
     * 
     * @param request DescribeProjectMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectMetaResponse
     */
    public DescribeProjectMetaResponse describeProjectMetaWithOptions(DescribeProjectMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectMeta"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>The information obtained by this operation includes the service description, namespace, and tags.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about monitored services in CloudMonitor.</p>
     * 
     * @param request DescribeProjectMetaRequest
     * @return DescribeProjectMetaResponse
     */
    public DescribeProjectMetaResponse describeProjectMeta(DescribeProjectMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a site monitoring task whose ID is <code>cc641dff-c19d-45f3-ad0a-818a0c4f****</code>. The returned result indicates that the task name is <code>test123</code>, the URL that is monitored by the task is <code>https://aliyun.com</code>, and the name of the carrier is <code>Alibaba</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a site monitoring task.</p>
     * 
     * @param request DescribeSiteMonitorAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteMonitorAttributeResponse
     */
    public DescribeSiteMonitorAttributeResponse describeSiteMonitorAttributeWithOptions(DescribeSiteMonitorAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeAlert)) {
            query.put("IncludeAlert", request.includeAlert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteMonitorAttribute"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteMonitorAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a site monitoring task whose ID is <code>cc641dff-c19d-45f3-ad0a-818a0c4f****</code>. The returned result indicates that the task name is <code>test123</code>, the URL that is monitored by the task is <code>https://aliyun.com</code>, and the name of the carrier is <code>Alibaba</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a site monitoring task.</p>
     * 
     * @param request DescribeSiteMonitorAttributeRequest
     * @return DescribeSiteMonitorAttributeResponse
     */
    public DescribeSiteMonitorAttributeResponse describeSiteMonitorAttribute(DescribeSiteMonitorAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the fine-grained monitoring data of a site monitoring task.</p>
     * 
     * @param request DescribeSiteMonitorDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteMonitorDataResponse
     */
    public DescribeSiteMonitorDataResponse describeSiteMonitorDataWithOptions(DescribeSiteMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteMonitorData"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteMonitorDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the fine-grained monitoring data of a site monitoring task.</p>
     * 
     * @param request DescribeSiteMonitorDataRequest
     * @return DescribeSiteMonitorDataResponse
     */
    public DescribeSiteMonitorDataResponse describeSiteMonitorData(DescribeSiteMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the detection points that are provided by China Unicom in Guiyang.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detection points that are provided by carriers.</p>
     * 
     * @param request DescribeSiteMonitorISPCityListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteMonitorISPCityListResponse
     */
    public DescribeSiteMonitorISPCityListResponse describeSiteMonitorISPCityListWithOptions(DescribeSiteMonitorISPCityListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPV4)) {
            query.put("IPV4", request.IPV4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.IPV6)) {
            query.put("IPV6", request.IPV6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewAll)) {
            query.put("ViewAll", request.viewAll);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteMonitorISPCityList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteMonitorISPCityListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the detection points that are provided by China Unicom in Guiyang.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detection points that are provided by carriers.</p>
     * 
     * @param request DescribeSiteMonitorISPCityListRequest
     * @return DescribeSiteMonitorISPCityListResponse
     */
    public DescribeSiteMonitorISPCityListResponse describeSiteMonitorISPCityList(DescribeSiteMonitorISPCityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorISPCityListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all the site monitoring tasks of your Alibaba Cloud account. In this example, the returned result indicates that the Alibaba Cloud account has one site monitoring task named <code>HanZhou_ECS2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries site monitoring tasks.</p>
     * 
     * @param request DescribeSiteMonitorListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteMonitorListResponse
     */
    public DescribeSiteMonitorListResponse describeSiteMonitorListWithOptions(DescribeSiteMonitorListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskState)) {
            query.put("TaskState", request.taskState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteMonitorList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteMonitorListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query all the site monitoring tasks of your Alibaba Cloud account. In this example, the returned result indicates that the Alibaba Cloud account has one site monitoring task named <code>HanZhou_ECS2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries site monitoring tasks.</p>
     * 
     * @param request DescribeSiteMonitorListRequest
     * @return DescribeSiteMonitorListResponse
     */
    public DescribeSiteMonitorListResponse describeSiteMonitorList(DescribeSiteMonitorListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring.
     * This topic provides an example to show how to query the logs of an instant test task whose ID is <code>afa5c3ce-f944-4363-9edb-ce919a29****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of one or more instant test tasks.</p>
     * 
     * @param request DescribeSiteMonitorLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteMonitorLogResponse
     */
    public DescribeSiteMonitorLogResponse describeSiteMonitorLogWithOptions(DescribeSiteMonitorLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.browser)) {
            query.put("Browser", request.browser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserInfo)) {
            query.put("BrowserInfo", request.browserInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.device)) {
            query.put("Device", request.device);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.length)) {
            query.put("Length", request.length);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("TaskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteMonitorLog"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteMonitorLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create an instant test task only by using the Alibaba Cloud account that you used to enable Network Analysis and Monitoring.
     * This topic provides an example to show how to query the logs of an instant test task whose ID is <code>afa5c3ce-f944-4363-9edb-ce919a29****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of one or more instant test tasks.</p>
     * 
     * @param request DescribeSiteMonitorLogRequest
     * @return DescribeSiteMonitorLogResponse
     */
    public DescribeSiteMonitorLogResponse describeSiteMonitorLog(DescribeSiteMonitorLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quotas and version of site monitoring.</p>
     * 
     * @param request DescribeSiteMonitorQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteMonitorQuotaResponse
     */
    public DescribeSiteMonitorQuotaResponse describeSiteMonitorQuotaWithOptions(DescribeSiteMonitorQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteMonitorQuota"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteMonitorQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quotas and version of site monitoring.</p>
     * 
     * @param request DescribeSiteMonitorQuotaRequest
     * @return DescribeSiteMonitorQuotaResponse
     */
    public DescribeSiteMonitorQuotaResponse describeSiteMonitorQuota(DescribeSiteMonitorQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of the <code>Availability</code> metric for a site monitoring task whose ID is <code>ef4cdc8b-9dc7-43e7-810e-f950e56c****</code>. The result indicates that the availability rate of the site is <code>100%</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics of a specified metric for a specified site monitoring task.</p>
     * 
     * @param request DescribeSiteMonitorStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSiteMonitorStatisticsResponse
     */
    public DescribeSiteMonitorStatisticsResponse describeSiteMonitorStatisticsWithOptions(DescribeSiteMonitorStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSiteMonitorStatistics"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSiteMonitorStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of the <code>Availability</code> metric for a site monitoring task whose ID is <code>ef4cdc8b-9dc7-43e7-810e-f950e56c****</code>. The result indicates that the availability rate of the site is <code>100%</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics of a specified metric for a specified site monitoring task.</p>
     * 
     * @param request DescribeSiteMonitorStatisticsRequest
     * @return DescribeSiteMonitorStatisticsResponse
     */
    public DescribeSiteMonitorStatisticsResponse describeSiteMonitorStatistics(DescribeSiteMonitorStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSiteMonitorStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询拨测探测节点列表</p>
     * 
     * @param request DescribeSyntheticProbeListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSyntheticProbeListResponse
     */
    public DescribeSyntheticProbeListResponse describeSyntheticProbeListWithOptions(DescribeSyntheticProbeListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idcProbe)) {
            query.put("IdcProbe", request.idcProbe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv4)) {
            query.put("Ipv4", request.ipv4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6)) {
            query.put("Ipv6", request.ipv6);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmProbe)) {
            query.put("LmProbe", request.lmProbe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mbProbe)) {
            query.put("MbProbe", request.mbProbe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewAll)) {
            query.put("ViewAll", request.viewAll);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSyntheticProbeList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSyntheticProbeListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询拨测探测节点列表</p>
     * 
     * @param request DescribeSyntheticProbeListRequest
     * @return DescribeSyntheticProbeListResponse
     */
    public DescribeSyntheticProbeListResponse describeSyntheticProbeList(DescribeSyntheticProbeListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSyntheticProbeListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a system event.</p>
     * 
     * @param request DescribeSystemEventAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSystemEventAttributeResponse
     */
    public DescribeSystemEventAttributeResponse describeSystemEventAttributeWithOptions(DescribeSystemEventAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeywords)) {
            query.put("SearchKeywords", request.searchKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSystemEventAttribute"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemEventAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a system event.</p>
     * 
     * @param request DescribeSystemEventAttributeRequest
     * @return DescribeSystemEventAttributeResponse
     */
    public DescribeSystemEventAttributeResponse describeSystemEventAttribute(DescribeSystemEventAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemEventAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the cloud services supported by CloudMonitor and their system events.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query the number of times that a system event of <code>Elastic Compute Service (ECS)</code> has occurred. The returned result shows that the specified system event has occurred three times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of times that a system event of a cloud service has occurred.</p>
     * 
     * @param request DescribeSystemEventCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSystemEventCountResponse
     */
    public DescribeSystemEventCountResponse describeSystemEventCountWithOptions(DescribeSystemEventCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeywords)) {
            query.put("SearchKeywords", request.searchKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSystemEventCount"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemEventCountResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/114972.html">DescribeSystemEventMetaList</a> operation to query the cloud services supported by CloudMonitor and their system events.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query the number of times that a system event of <code>Elastic Compute Service (ECS)</code> has occurred. The returned result shows that the specified system event has occurred three times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of times that a system event of a cloud service has occurred.</p>
     * 
     * @param request DescribeSystemEventCountRequest
     * @return DescribeSystemEventCountResponse
     */
    public DescribeSystemEventCountResponse describeSystemEventCount(DescribeSystemEventCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemEventCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of times a system event occurred during each interval within a period of time.</p>
     * 
     * @param request DescribeSystemEventHistogramRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSystemEventHistogramResponse
     */
    public DescribeSystemEventHistogramResponse describeSystemEventHistogramWithOptions(DescribeSystemEventHistogramRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeywords)) {
            query.put("SearchKeywords", request.searchKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSystemEventHistogram"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemEventHistogramResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of times a system event occurred during each interval within a period of time.</p>
     * 
     * @param request DescribeSystemEventHistogramRequest
     * @return DescribeSystemEventHistogramResponse
     */
    public DescribeSystemEventHistogramResponse describeSystemEventHistogram(DescribeSystemEventHistogramRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemEventHistogramWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSystemEventMetaListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSystemEventMetaListResponse
     */
    public DescribeSystemEventMetaListResponse describeSystemEventMetaListWithOptions(DescribeSystemEventMetaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSystemEventMetaList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemEventMetaListResponse());
    }

    /**
     * @param request DescribeSystemEventMetaListRequest
     * @return DescribeSystemEventMetaListResponse
     */
    public DescribeSystemEventMetaListResponse describeSystemEventMetaList(DescribeSystemEventMetaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemEventMetaListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTagKeyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagKeyListResponse
     */
    public DescribeTagKeyListResponse describeTagKeyListWithOptions(DescribeTagKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagKeyList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagKeyListResponse());
    }

    /**
     * @param request DescribeTagKeyListRequest
     * @return DescribeTagKeyListResponse
     */
    public DescribeTagKeyListResponse describeTagKeyList(DescribeTagKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagKeyListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the tag values corresponding to <code>tagKey1</code>. The return results are <code>tagValue1</code> and <code>tagValue2</code>.</p>
     * 
     * @param request DescribeTagValueListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagValueListResponse
     */
    public DescribeTagValueListResponse describeTagValueListWithOptions(DescribeTagValueListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagValueList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagValueListResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the tag values corresponding to <code>tagKey1</code>. The return results are <code>tagValue1</code> and <code>tagValue2</code>.</p>
     * 
     * @param request DescribeTagValueListRequest
     * @return DescribeTagValueListResponse
     */
    public DescribeTagValueListResponse describeTagValueList(DescribeTagValueListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagValueListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeUnhealthyHostAvailabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUnhealthyHostAvailabilityResponse
     */
    public DescribeUnhealthyHostAvailabilityResponse describeUnhealthyHostAvailabilityWithOptions(DescribeUnhealthyHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUnhealthyHostAvailability"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUnhealthyHostAvailabilityResponse());
    }

    /**
     * @param request DescribeUnhealthyHostAvailabilityRequest
     * @return DescribeUnhealthyHostAvailabilityResponse
     */
    public DescribeUnhealthyHostAvailabilityResponse describeUnhealthyHostAvailability(DescribeUnhealthyHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUnhealthyHostAvailabilityWithOptions(request, runtime);
    }

    /**
     * @param request DisableActiveMetricRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableActiveMetricRuleResponse
     */
    public DisableActiveMetricRuleResponse disableActiveMetricRuleWithOptions(DisableActiveMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableActiveMetricRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableActiveMetricRuleResponse());
    }

    /**
     * @param request DisableActiveMetricRuleRequest
     * @return DisableActiveMetricRuleResponse
     */
    public DisableActiveMetricRuleResponse disableActiveMetricRule(DisableActiveMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableActiveMetricRuleWithOptions(request, runtime);
    }

    /**
     * @param request DisableEventRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableEventRulesResponse
     */
    public DisableEventRulesResponse disableEventRulesWithOptions(DisableEventRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleNames)) {
            query.put("RuleNames", request.ruleNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableEventRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableEventRulesResponse());
    }

    /**
     * @param request DisableEventRulesRequest
     * @return DisableEventRulesResponse
     */
    public DisableEventRulesResponse disableEventRules(DisableEventRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableEventRulesWithOptions(request, runtime);
    }

    /**
     * @param request DisableHostAvailabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableHostAvailabilityResponse
     */
    public DisableHostAvailabilityResponse disableHostAvailabilityWithOptions(DisableHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableHostAvailability"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableHostAvailabilityResponse());
    }

    /**
     * @param request DisableHostAvailabilityRequest
     * @return DisableHostAvailabilityResponse
     */
    public DisableHostAvailabilityResponse disableHostAvailability(DisableHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableHostAvailabilityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables alert rules.</p>
     * 
     * @param request DisableMetricRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableMetricRulesResponse
     */
    public DisableMetricRulesResponse disableMetricRulesWithOptions(DisableMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableMetricRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableMetricRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables alert rules.</p>
     * 
     * @param request DisableMetricRulesRequest
     * @return DisableMetricRulesResponse
     */
    public DisableMetricRulesResponse disableMetricRules(DisableMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableMetricRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables site monitoring tasks.</p>
     * 
     * @param request DisableSiteMonitorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSiteMonitorsResponse
     */
    public DisableSiteMonitorsResponse disableSiteMonitorsWithOptions(DisableSiteMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("TaskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSiteMonitors"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSiteMonitorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables site monitoring tasks.</p>
     * 
     * @param request DisableSiteMonitorsRequest
     * @return DisableSiteMonitorsResponse
     */
    public DisableSiteMonitorsResponse disableSiteMonitors(DisableSiteMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSiteMonitorsWithOptions(request, runtime);
    }

    /**
     * @param request EnableActiveMetricRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableActiveMetricRuleResponse
     */
    public EnableActiveMetricRuleResponse enableActiveMetricRuleWithOptions(EnableActiveMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableActiveMetricRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableActiveMetricRuleResponse());
    }

    /**
     * @param request EnableActiveMetricRuleRequest
     * @return EnableActiveMetricRuleResponse
     */
    public EnableActiveMetricRuleResponse enableActiveMetricRule(EnableActiveMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableActiveMetricRuleWithOptions(request, runtime);
    }

    /**
     * @param request EnableEventRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableEventRulesResponse
     */
    public EnableEventRulesResponse enableEventRulesWithOptions(EnableEventRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleNames)) {
            query.put("RuleNames", request.ruleNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableEventRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableEventRulesResponse());
    }

    /**
     * @param request EnableEventRulesRequest
     * @return EnableEventRulesResponse
     */
    public EnableEventRulesResponse enableEventRules(EnableEventRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableEventRulesWithOptions(request, runtime);
    }

    /**
     * @param request EnableHostAvailabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableHostAvailabilityResponse
     */
    public EnableHostAvailabilityResponse enableHostAvailabilityWithOptions(EnableHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableHostAvailability"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableHostAvailabilityResponse());
    }

    /**
     * @param request EnableHostAvailabilityRequest
     * @return EnableHostAvailabilityResponse
     */
    public EnableHostAvailabilityResponse enableHostAvailability(EnableHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableHostAvailabilityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables multiple blacklist policies at a time.</p>
     * 
     * @param request EnableMetricRuleBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableMetricRuleBlackListResponse
     */
    public EnableMetricRuleBlackListResponse enableMetricRuleBlackListWithOptions(EnableMetricRuleBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnable)) {
            query.put("IsEnable", request.isEnable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableMetricRuleBlackList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableMetricRuleBlackListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables multiple blacklist policies at a time.</p>
     * 
     * @param request EnableMetricRuleBlackListRequest
     * @return EnableMetricRuleBlackListResponse
     */
    public EnableMetricRuleBlackListResponse enableMetricRuleBlackList(EnableMetricRuleBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableMetricRuleBlackListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables one or more alert rules.</p>
     * 
     * @param request EnableMetricRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableMetricRulesResponse
     */
    public EnableMetricRulesResponse enableMetricRulesWithOptions(EnableMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableMetricRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableMetricRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables one or more alert rules.</p>
     * 
     * @param request EnableMetricRulesRequest
     * @return EnableMetricRulesResponse
     */
    public EnableMetricRulesResponse enableMetricRules(EnableMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableMetricRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables site monitoring tasks.</p>
     * 
     * @param request EnableSiteMonitorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableSiteMonitorsResponse
     */
    public EnableSiteMonitorsResponse enableSiteMonitorsWithOptions(EnableSiteMonitorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("TaskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableSiteMonitors"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableSiteMonitorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables site monitoring tasks.</p>
     * 
     * @param request EnableSiteMonitorsRequest
     * @return EnableSiteMonitorsResponse
     */
    public EnableSiteMonitorsResponse enableSiteMonitors(EnableSiteMonitorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSiteMonitorsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The Cloud Assistant client is installed on an ECS instance. For more information about how to install the Cloud Assistant client, see <a href="https://help.aliyun.com/document_detail/64601.html">Overview</a>.</p>
     * 
     * @param request InstallMonitoringAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallMonitoringAgentResponse
     */
    public InstallMonitoringAgentResponse installMonitoringAgentWithOptions(InstallMonitoringAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installCommand)) {
            query.put("InstallCommand", request.installCommand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallMonitoringAgent"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallMonitoringAgentResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>The Cloud Assistant client is installed on an ECS instance. For more information about how to install the Cloud Assistant client, see <a href="https://help.aliyun.com/document_detail/64601.html">Overview</a>.</p>
     * 
     * @param request InstallMonitoringAgentRequest
     * @return InstallMonitoringAgentResponse
     */
    public InstallMonitoringAgentResponse installMonitoringAgent(InstallMonitoringAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installMonitoringAgentWithOptions(request, runtime);
    }

    /**
     * @param request ModifyGroupMonitoringAgentProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGroupMonitoringAgentProcessResponse
     */
    public ModifyGroupMonitoringAgentProcessResponse modifyGroupMonitoringAgentProcessWithOptions(ModifyGroupMonitoringAgentProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertConfig)) {
            query.put("AlertConfig", request.alertConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchExpressFilterRelation)) {
            query.put("MatchExpressFilterRelation", request.matchExpressFilterRelation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGroupMonitoringAgentProcess"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGroupMonitoringAgentProcessResponse());
    }

    /**
     * @param request ModifyGroupMonitoringAgentProcessRequest
     * @return ModifyGroupMonitoringAgentProcessResponse
     */
    public ModifyGroupMonitoringAgentProcessResponse modifyGroupMonitoringAgentProcess(ModifyGroupMonitoringAgentProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGroupMonitoringAgentProcessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the name of an availability monitoring task named <code>12345</code> in an application group named <code>123456</code> to <code>task2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an availability monitoring task.</p>
     * 
     * @param request ModifyHostAvailabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostAvailabilityResponse
     */
    public ModifyHostAvailabilityResponse modifyHostAvailabilityWithOptions(ModifyHostAvailabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertConfigEscalationList)) {
            query.put("AlertConfigEscalationList", request.alertConfigEscalationList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertConfigTargetList)) {
            query.put("AlertConfigTargetList", request.alertConfigTargetList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceList)) {
            query.put("InstanceList", request.instanceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskScope)) {
            query.put("TaskScope", request.taskScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertConfig)) {
            query.put("AlertConfig", request.alertConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskOption)) {
            query.put("TaskOption", request.taskOption);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHostAvailability"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostAvailabilityResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the name of an availability monitoring task named <code>12345</code> in an application group named <code>123456</code> to <code>task2</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an availability monitoring task.</p>
     * 
     * @param request ModifyHostAvailabilityRequest
     * @return ModifyHostAvailabilityResponse
     */
    public ModifyHostAvailabilityResponse modifyHostAvailability(ModifyHostAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostAvailabilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request ModifyHostInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHostInfoResponse
     */
    public ModifyHostInfoResponse modifyHostInfoWithOptions(ModifyHostInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHostInfo"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHostInfoResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request ModifyHostInfoRequest
     * @return ModifyHostInfoResponse
     */
    public ModifyHostInfoResponse modifyHostInfo(ModifyHostInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHostInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the data retention period of the <code>aliyun</code> namespace to <code>cms.s1.2xlarge</code>. The response shows that the namespace is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a namespace.</p>
     * 
     * @param request ModifyHybridMonitorNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridMonitorNamespaceResponse
     */
    public ModifyHybridMonitorNamespaceResponse modifyHybridMonitorNamespaceWithOptions(ModifyHybridMonitorNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridMonitorNamespace"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridMonitorNamespaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the data retention period of the <code>aliyun</code> namespace to <code>cms.s1.2xlarge</code>. The response shows that the namespace is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a namespace.</p>
     * 
     * @param request ModifyHybridMonitorNamespaceRequest
     * @return ModifyHybridMonitorNamespaceResponse
     */
    public ModifyHybridMonitorNamespaceResponse modifyHybridMonitorNamespace(ModifyHybridMonitorNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridMonitorNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a Logstore group named <code>Logstore_test</code> is modified. The Logstore of the <code>aliyun-project</code> project in the <code>cn-hangzhou</code> region is changed to <code>Logstore-aliyun-all</code>. The response shows that the Logstore group is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a Logstore group.</p>
     * 
     * @param request ModifyHybridMonitorSLSGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridMonitorSLSGroupResponse
     */
    public ModifyHybridMonitorSLSGroupResponse modifyHybridMonitorSLSGroupWithOptions(ModifyHybridMonitorSLSGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SLSGroupConfig)) {
            query.put("SLSGroupConfig", request.SLSGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSGroupDescription)) {
            query.put("SLSGroupDescription", request.SLSGroupDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSGroupName)) {
            query.put("SLSGroupName", request.SLSGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridMonitorSLSGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridMonitorSLSGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>In this example, a Logstore group named <code>Logstore_test</code> is modified. The Logstore of the <code>aliyun-project</code> project in the <code>cn-hangzhou</code> region is changed to <code>Logstore-aliyun-all</code>. The response shows that the Logstore group is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a Logstore group.</p>
     * 
     * @param request ModifyHybridMonitorSLSGroupRequest
     * @return ModifyHybridMonitorSLSGroupResponse
     */
    public ModifyHybridMonitorSLSGroupResponse modifyHybridMonitorSLSGroup(ModifyHybridMonitorSLSGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridMonitorSLSGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the collection period of a metric import task whose ID is <code>36****</code> to <code>15</code> seconds. The task is used to monitor the logs that are imported from Log Service. The returned result indicates that the metric is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a metric for the logs that are imported from Log Service.</p>
     * 
     * @param request ModifyHybridMonitorTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHybridMonitorTaskResponse
     */
    public ModifyHybridMonitorTaskResponse modifyHybridMonitorTaskWithOptions(ModifyHybridMonitorTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachLabels)) {
            query.put("AttachLabels", request.attachLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectInterval)) {
            query.put("CollectInterval", request.collectInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SLSProcessConfig)) {
            query.put("SLSProcessConfig", request.SLSProcessConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHybridMonitorTask"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHybridMonitorTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the collection period of a metric import task whose ID is <code>36****</code> to <code>15</code> seconds. The task is used to monitor the logs that are imported from Log Service. The returned result indicates that the metric is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a metric for the logs that are imported from Log Service.</p>
     * 
     * @param request ModifyHybridMonitorTaskRequest
     * @return ModifyHybridMonitorTaskResponse
     */
    public ModifyHybridMonitorTaskResponse modifyHybridMonitorTask(ModifyHybridMonitorTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHybridMonitorTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a blacklist policy.</p>
     * 
     * @param request ModifyMetricRuleBlackListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMetricRuleBlackListResponse
     */
    public ModifyMetricRuleBlackListResponse modifyMetricRuleBlackListWithOptions(ModifyMetricRuleBlackListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            query.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableEndTime)) {
            query.put("EnableEndTime", request.enableEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStartTime)) {
            query.put("EnableStartTime", request.enableStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            query.put("Instances", request.instances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeType)) {
            query.put("ScopeType", request.scopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeValue)) {
            query.put("ScopeValue", request.scopeValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMetricRuleBlackList"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMetricRuleBlackListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a blacklist policy.</p>
     * 
     * @param request ModifyMetricRuleBlackListRequest
     * @return ModifyMetricRuleBlackListResponse
     */
    public ModifyMetricRuleBlackListResponse modifyMetricRuleBlackList(ModifyMetricRuleBlackListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMetricRuleBlackListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify an alert template whose version is <code>1</code> and ID is <code>123456</code>. The alert level is changed to <code>Critical</code>. The statistical method is changed to <code>Average</code>. The alert threshold comparator is changed to <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is changed to <code>90</code>. The number of alert retries is changed to <code>3</code>. The response shows that the alert template is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an alert template.</p>
     * 
     * @param request ModifyMetricRuleTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMetricRuleTemplateResponse
     */
    public ModifyMetricRuleTemplateResponse modifyMetricRuleTemplateWithOptions(ModifyMetricRuleTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alertTemplates)) {
            query.put("AlertTemplates", request.alertTemplates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restVersion)) {
            query.put("RestVersion", request.restVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMetricRuleTemplate"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMetricRuleTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify an alert template whose version is <code>1</code> and ID is <code>123456</code>. The alert level is changed to <code>Critical</code>. The statistical method is changed to <code>Average</code>. The alert threshold comparator is changed to <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is changed to <code>90</code>. The number of alert retries is changed to <code>3</code>. The response shows that the alert template is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an alert template.</p>
     * 
     * @param request ModifyMetricRuleTemplateRequest
     * @return ModifyMetricRuleTemplateResponse
     */
    public ModifyMetricRuleTemplateResponse modifyMetricRuleTemplate(ModifyMetricRuleTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMetricRuleTemplateWithOptions(request, runtime);
    }

    /**
     * @param request ModifyMonitorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMonitorGroupResponse
     */
    public ModifyMonitorGroupResponse modifyMonitorGroupWithOptions(ModifyMonitorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroups)) {
            query.put("ContactGroups", request.contactGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMonitorGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMonitorGroupResponse());
    }

    /**
     * @param request ModifyMonitorGroupRequest
     * @return ModifyMonitorGroupResponse
     */
    public ModifyMonitorGroupResponse modifyMonitorGroup(ModifyMonitorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMonitorGroupWithOptions(request, runtime);
    }

    /**
     * @param request ModifyMonitorGroupInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMonitorGroupInstancesResponse
     */
    public ModifyMonitorGroupInstancesResponse modifyMonitorGroupInstancesWithOptions(ModifyMonitorGroupInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            query.put("Instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMonitorGroupInstances"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMonitorGroupInstancesResponse());
    }

    /**
     * @param request ModifyMonitorGroupInstancesRequest
     * @return ModifyMonitorGroupInstancesResponse
     */
    public ModifyMonitorGroupInstancesResponse modifyMonitorGroupInstances(ModifyMonitorGroupInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMonitorGroupInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The number of site monitoring tasks.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a site monitoring task.</p>
     * 
     * @param request ModifySiteMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySiteMonitorResponse
     */
    public ModifySiteMonitorResponse modifySiteMonitorWithOptions(ModifySiteMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alertIds)) {
            query.put("AlertIds", request.alertIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customSchedule)) {
            query.put("CustomSchedule", request.customSchedule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalUnit)) {
            query.put("IntervalUnit", request.intervalUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispCities)) {
            query.put("IspCities", request.ispCities);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.optionsJson)) {
            query.put("OptionsJson", request.optionsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySiteMonitor"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySiteMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>The number of site monitoring tasks.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a site monitoring task.</p>
     * 
     * @param request ModifySiteMonitorRequest
     * @return ModifySiteMonitorResponse
     */
    public ModifySiteMonitorResponse modifySiteMonitor(ModifySiteMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySiteMonitorWithOptions(request, runtime);
    }

    /**
     * @deprecated OpenAPI OpenCmsService is deprecated
     * 
     * @param request OpenCmsServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenCmsServiceResponse
     */
    @Deprecated
    // Deprecated
    public OpenCmsServiceResponse openCmsServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenCmsService"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenCmsServiceResponse());
    }

    /**
     * @deprecated OpenAPI OpenCmsService is deprecated
     * @return OpenCmsServiceResponse
     */
    @Deprecated
    // Deprecated
    public OpenCmsServiceResponse openCmsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openCmsServiceWithOptions(runtime);
    }

    /**
     * @param request PutContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutContactResponse
     */
    public PutContactResponse putContactWithOptions(PutContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describe)) {
            query.put("Describe", request.describe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channels)) {
            query.put("Channels", request.channels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutContact"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutContactResponse());
    }

    /**
     * @param request PutContactRequest
     * @return PutContactResponse
     */
    public PutContactResponse putContact(PutContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putContactWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an alert contact group named <code>ECS_Group</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>添加或者修改报警联系人组</p>
     * 
     * @param request PutContactGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutContactGroupResponse
     */
    public PutContactGroupResponse putContactGroupWithOptions(PutContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroupName)) {
            query.put("ContactGroupName", request.contactGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNames)) {
            query.put("ContactNames", request.contactNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describe)) {
            query.put("Describe", request.describe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSubscribed)) {
            query.put("EnableSubscribed", request.enableSubscribed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutContactGroup"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutContactGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an alert contact group named <code>ECS_Group</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>添加或者修改报警联系人组</p>
     * 
     * @param request PutContactGroupRequest
     * @return PutContactGroupResponse
     */
    public PutContactGroupResponse putContactGroup(PutContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putContactGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reports custom events.</p>
     * 
     * @param request PutCustomEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutCustomEventResponse
     */
    public PutCustomEventResponse putCustomEventWithOptions(PutCustomEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventInfo)) {
            query.put("EventInfo", request.eventInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutCustomEvent"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutCustomEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reports custom events.</p>
     * 
     * @param request PutCustomEventRequest
     * @return PutCustomEventResponse
     */
    public PutCustomEventResponse putCustomEvent(PutCustomEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putCustomEventWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, call the PutCustomEvent operation to report the monitoring data of the custom event. For more information, see <a href="https://help.aliyun.com/document_detail/115012.html">PutCustomEvent</a>.</p>
     * 
     * @param request PutCustomEventRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutCustomEventRuleResponse
     */
    public PutCustomEventRuleResponse putCustomEventRuleWithOptions(PutCustomEventRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactGroups)) {
            query.put("ContactGroups", request.contactGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveInterval)) {
            query.put("EffectiveInterval", request.effectiveInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailSubject)) {
            query.put("EmailSubject", request.emailSubject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhook)) {
            query.put("Webhook", request.webhook);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutCustomEventRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutCustomEventRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, call the PutCustomEvent operation to report the monitoring data of the custom event. For more information, see <a href="https://help.aliyun.com/document_detail/115012.html">PutCustomEvent</a>.</p>
     * 
     * @param request PutCustomEventRuleRequest
     * @return PutCustomEventRuleResponse
     */
    public PutCustomEventRuleResponse putCustomEventRule(PutCustomEventRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putCustomEventRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> We recommend that you call the <a href="https://help.aliyun.com/document_detail/383455.html">PutHybridMonitorMetricData</a> operation of Hybrid Cloud Monitoring to report monitoring data.</p>
     * </blockquote>
     * 
     * @param request PutCustomMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutCustomMetricResponse
     */
    public PutCustomMetricResponse putCustomMetricWithOptions(PutCustomMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metricList)) {
            query.put("MetricList", request.metricList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutCustomMetric"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutCustomMetricResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> We recommend that you call the <a href="https://help.aliyun.com/document_detail/383455.html">PutHybridMonitorMetricData</a> operation of Hybrid Cloud Monitoring to report monitoring data.</p>
     * </blockquote>
     * 
     * @param request PutCustomMetricRequest
     * @return PutCustomMetricResponse
     */
    public PutCustomMetricResponse putCustomMetric(PutCustomMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putCustomMetricWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, call the PutCustomMetric operation to report custom monitoring data. For more information, see <a href="https://help.aliyun.com/document_detail/115004.html">PutCustomMetric</a>.</p>
     * 
     * @param request PutCustomMetricRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutCustomMetricRuleResponse
     */
    public PutCustomMetricRuleResponse putCustomMetricRuleWithOptions(PutCustomMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comparisonOperator)) {
            query.put("ComparisonOperator", request.comparisonOperator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroups)) {
            query.put("ContactGroups", request.contactGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveInterval)) {
            query.put("EffectiveInterval", request.effectiveInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailSubject)) {
            query.put("EmailSubject", request.emailSubject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluationCount)) {
            query.put("EvaluationCount", request.evaluationCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statistics)) {
            query.put("Statistics", request.statistics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhook)) {
            query.put("Webhook", request.webhook);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutCustomMetricRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutCustomMetricRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, call the PutCustomMetric operation to report custom monitoring data. For more information, see <a href="https://help.aliyun.com/document_detail/115004.html">PutCustomMetric</a>.</p>
     * 
     * @param request PutCustomMetricRuleRequest
     * @return PutCustomMetricRuleResponse
     */
    public PutCustomMetricRuleResponse putCustomMetricRule(PutCustomMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putCustomMetricRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the specified rule name does not exist, an event-triggered alert rule is created. If the specified rule name exists, the specified event-triggered alert rule is modified.
     * In this example, the <code>myRuleName</code> alert rule is created for the <code>ecs</code> cloud service.</p>
     * 
     * <b>summary</b> : 
     * <p>创建或者修改事件监控</p>
     * 
     * @param request PutEventRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutEventRuleResponse
     */
    public PutEventRuleResponse putEventRuleWithOptions(PutEventRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventPattern)) {
            query.put("EventPattern", request.eventPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEventRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEventRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>If the specified rule name does not exist, an event-triggered alert rule is created. If the specified rule name exists, the specified event-triggered alert rule is modified.
     * In this example, the <code>myRuleName</code> alert rule is created for the <code>ecs</code> cloud service.</p>
     * 
     * <b>summary</b> : 
     * <p>创建或者修改事件监控</p>
     * 
     * @param request PutEventRuleRequest
     * @return PutEventRuleResponse
     */
    public PutEventRuleResponse putEventRule(PutEventRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEventRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies the push channels of an event-triggered alert rule.</p>
     * 
     * @param request PutEventRuleTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutEventRuleTargetsResponse
     */
    public PutEventRuleTargetsResponse putEventRuleTargetsWithOptions(PutEventRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactParameters)) {
            query.put("ContactParameters", request.contactParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fcParameters)) {
            query.put("FcParameters", request.fcParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mnsParameters)) {
            query.put("MnsParameters", request.mnsParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openApiParameters)) {
            query.put("OpenApiParameters", request.openApiParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsParameters)) {
            query.put("SlsParameters", request.slsParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookParameters)) {
            query.put("WebhookParameters", request.webhookParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEventRuleTargets"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEventRuleTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or modifies the push channels of an event-triggered alert rule.</p>
     * 
     * @param request PutEventRuleTargetsRequest
     * @return PutEventRuleTargetsResponse
     */
    public PutEventRuleTargetsResponse putEventRuleTargets(PutEventRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEventRuleTargetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The monitoring data can be exported only to Log Service. More services will be supported in the future.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies a configuration set for exporting monitoring data.</p>
     * 
     * @param request PutExporterOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutExporterOutputResponse
     */
    public PutExporterOutputResponse putExporterOutputWithOptions(PutExporterOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configJson)) {
            query.put("ConfigJson", request.configJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            query.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destName)) {
            query.put("DestName", request.destName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destType)) {
            query.put("DestType", request.destType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutExporterOutput"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutExporterOutputResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The monitoring data can be exported only to Log Service. More services will be supported in the future.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies a configuration set for exporting monitoring data.</p>
     * 
     * @param request PutExporterOutputRequest
     * @return PutExporterOutputResponse
     */
    public PutExporterOutputResponse putExporterOutput(PutExporterOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putExporterOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies a data export rule.</p>
     * 
     * @param request PutExporterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutExporterRuleResponse
     */
    public PutExporterRuleResponse putExporterRuleWithOptions(PutExporterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.describe)) {
            query.put("Describe", request.describe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstNames)) {
            query.put("DstNames", request.dstNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetWindows)) {
            query.put("TargetWindows", request.targetWindows);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutExporterRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutExporterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies a data export rule.</p>
     * 
     * @param request PutExporterRuleRequest
     * @return PutExporterRuleResponse
     */
    public PutExporterRuleResponse putExporterRule(PutExporterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putExporterRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an alert rule for the <code>cpu_total</code> metric of Elastic Compute Service (ECS) in the <code>17285****</code> application group. The ID of the alert rule is <code>123456</code>. The name of the alert rule is <code>Rule_test</code>. The alert level is <code>Critical</code>. The statistical method is <code>Average</code>. The alert threshold comparator is <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is <code>90</code>. The number of alert retries is <code>3</code>. The returned result shows that the alert rule is created and the alert rule ID is <code>123456</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies an alert rule for an application group.</p>
     * 
     * @param request PutGroupMetricRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutGroupMetricRuleResponse
     */
    public PutGroupMetricRuleResponse putGroupMetricRuleWithOptions(PutGroupMetricRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroups)) {
            query.put("ContactGroups", request.contactGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensions)) {
            query.put("Dimensions", request.dimensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveInterval)) {
            query.put("EffectiveInterval", request.effectiveInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailSubject)) {
            query.put("EmailSubject", request.emailSubject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraDimensionJson)) {
            query.put("ExtraDimensionJson", request.extraDimensionJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noDataPolicy)) {
            query.put("NoDataPolicy", request.noDataPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noEffectiveInterval)) {
            query.put("NoEffectiveInterval", request.noEffectiveInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            query.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhook)) {
            query.put("Webhook", request.webhook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalations)) {
            query.put("Escalations", request.escalations);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutGroupMetricRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutGroupMetricRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create an alert rule for the <code>cpu_total</code> metric of Elastic Compute Service (ECS) in the <code>17285****</code> application group. The ID of the alert rule is <code>123456</code>. The name of the alert rule is <code>Rule_test</code>. The alert level is <code>Critical</code>. The statistical method is <code>Average</code>. The alert threshold comparator is <code>GreaterThanOrEqualToThreshold</code>. The alert threshold is <code>90</code>. The number of alert retries is <code>3</code>. The returned result shows that the alert rule is created and the alert rule ID is <code>123456</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies an alert rule for an application group.</p>
     * 
     * @param request PutGroupMetricRuleRequest
     * @return PutGroupMetricRuleResponse
     */
    public PutGroupMetricRuleResponse putGroupMetricRule(PutGroupMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putGroupMetricRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Limits</h1>
     * <p>The size of the monitoring data that you import at a time must be less than or equal to 1 MB.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to import the monitoring data of the <code>CPU_Usage</code> metric to the <code>default-aliyun</code> namespace of Hybrid Cloud Monitoring.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports the monitoring data of a metric to a namespace of Hybrid Cloud Monitoring.</p>
     * 
     * @param request PutHybridMonitorMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutHybridMonitorMetricDataResponse
     */
    public PutHybridMonitorMetricDataResponse putHybridMonitorMetricDataWithOptions(PutHybridMonitorMetricDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metricList)) {
            query.put("MetricList", request.metricList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutHybridMonitorMetricData"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutHybridMonitorMetricDataResponse());
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Prerequisites</h1>
     * <p>Hybrid Cloud Monitoring is activated. For more information, see <a href="https://help.aliyun.com/document_detail/250773.html">Activate Hybrid Cloud Monitoring</a>.</p>
     * <h1><a href="#"></a>Limits</h1>
     * <p>The size of the monitoring data that you import at a time must be less than or equal to 1 MB.</p>
     * <h1><a href="#"></a>Description</h1>
     * <p>This topic provides an example on how to import the monitoring data of the <code>CPU_Usage</code> metric to the <code>default-aliyun</code> namespace of Hybrid Cloud Monitoring.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports the monitoring data of a metric to a namespace of Hybrid Cloud Monitoring.</p>
     * 
     * @param request PutHybridMonitorMetricDataRequest
     * @return PutHybridMonitorMetricDataResponse
     */
    public PutHybridMonitorMetricDataResponse putHybridMonitorMetricData(PutHybridMonitorMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putHybridMonitorMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In the example of this topic, the <code>cpu_total</code> log monitoring metric is created. The response shows that the log monitoring metric is created and the metric ID is <code>16****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies a log monitoring metric.</p>
     * 
     * @param request PutLogMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutLogMonitorResponse
     */
    public PutLogMonitorResponse putLogMonitorWithOptions(PutLogMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregates)) {
            query.put("Aggregates", request.aggregates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupbys)) {
            query.put("Groupbys", request.groupbys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logId)) {
            query.put("LogId", request.logId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricExpress)) {
            query.put("MetricExpress", request.metricExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogstore)) {
            query.put("SlsLogstore", request.slsLogstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsProject)) {
            query.put("SlsProject", request.slsProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsRegionId)) {
            query.put("SlsRegionId", request.slsRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tumblingwindows)) {
            query.put("Tumblingwindows", request.tumblingwindows);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unit)) {
            query.put("Unit", request.unit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueFilter)) {
            query.put("ValueFilter", request.valueFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueFilterRelation)) {
            query.put("ValueFilterRelation", request.valueFilterRelation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLogMonitor"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutLogMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>In the example of this topic, the <code>cpu_total</code> log monitoring metric is created. The response shows that the log monitoring metric is created and the metric ID is <code>16****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates or modifies a log monitoring metric.</p>
     * 
     * @param request PutLogMonitorRequest
     * @return PutLogMonitorResponse
     */
    public PutLogMonitorResponse putLogMonitor(PutLogMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putLogMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a></h1>
     * <p>This topic provides an example on how to associate an alert rule with a resource. In this example, the alert rule is <code>ae06917_75a8c43178ab66****</code>, the resource is <code>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</code>, and the ID of the resource for which alerts are triggered is <code>1</code>. The response indicates that the resource is associated with the specified alert rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds or modifies the push channels of an alert rule.</p>
     * 
     * @param request PutMetricRuleTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutMetricRuleTargetsResponse
     */
    public PutMetricRuleTargetsResponse putMetricRuleTargetsWithOptions(PutMetricRuleTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMetricRuleTargets"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMetricRuleTargetsResponse());
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a></h1>
     * <p>This topic provides an example on how to associate an alert rule with a resource. In this example, the alert rule is <code>ae06917_75a8c43178ab66****</code>, the resource is <code>acs:mns:cn-hangzhou:120886317861****:/queues/test/message</code>, and the ID of the resource for which alerts are triggered is <code>1</code>. The response indicates that the resource is associated with the specified alert rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds or modifies the push channels of an alert rule.</p>
     * 
     * @param request PutMetricRuleTargetsRequest
     * @return PutMetricRuleTargetsResponse
     */
    public PutMetricRuleTargetsResponse putMetricRuleTargets(PutMetricRuleTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMetricRuleTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an alert rule to dynamically add instances that meet the rule to an application group.</p>
     * 
     * @param request PutMonitorGroupDynamicRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutMonitorGroupDynamicRuleResponse
     */
    public PutMonitorGroupDynamicRuleResponse putMonitorGroupDynamicRuleWithOptions(PutMonitorGroupDynamicRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupRules)) {
            query.put("GroupRules", request.groupRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            query.put("IsAsync", request.isAsync);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMonitorGroupDynamicRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMonitorGroupDynamicRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an alert rule to dynamically add instances that meet the rule to an application group.</p>
     * 
     * @param request PutMonitorGroupDynamicRuleRequest
     * @return PutMonitorGroupDynamicRuleResponse
     */
    public PutMonitorGroupDynamicRuleResponse putMonitorGroupDynamicRule(PutMonitorGroupDynamicRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMonitorGroupDynamicRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures global settings for the CloudMonitor agent.</p>
     * 
     * @param request PutMonitoringConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutMonitoringConfigResponse
     */
    public PutMonitoringConfigResponse putMonitoringConfigWithOptions(PutMonitoringConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoInstall)) {
            query.put("AutoInstall", request.autoInstall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableInstallAgentNewECS)) {
            query.put("EnableInstallAgentNewECS", request.enableInstallAgentNewECS);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMonitoringConfig"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMonitoringConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures global settings for the CloudMonitor agent.</p>
     * 
     * @param request PutMonitoringConfigRequest
     * @return PutMonitoringConfigResponse
     */
    public PutMonitoringConfigResponse putMonitoringConfig(PutMonitoringConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMonitoringConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a threshold-triggered alert rule for the <code>cpu_total</code> metric of an Elastic Compute Service (ECS) instance whose ID is <code>i-uf6j91r34rnwawoo****</code>. The namespace of ECS metrics is <code>acs_ecs_dashboard</code>. The alert contact group of the alert rule is <code>ECS_Group</code>. The name of the alert rule is <code>test123</code>. The ID of the alert rule is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>. The statistical method for Critical-level alerts is <code>Average</code>. The comparison operator for Critical-level alerts is <code>GreaterThanOrEqualToThreshold</code>. The threshold for Critical-level alerts is <code>90</code>. The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered is <code>3</code>.</p>
     * <blockquote>
     * <p> Statistics verification was added on August 15, 2024. Only the statistical value of the corresponding metric can be set for the Statistics parameter. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures an alert rule.</p>
     * 
     * @param tmpReq PutResourceMetricRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutResourceMetricRuleResponse
     */
    public PutResourceMetricRuleResponse putResourceMetricRuleWithOptions(PutResourceMetricRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PutResourceMetricRuleShrinkRequest request = new PutResourceMetricRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.compositeExpression)) {
            request.compositeExpressionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.compositeExpression, "CompositeExpression", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.prometheus)) {
            request.prometheusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.prometheus, "Prometheus", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compositeExpressionShrink)) {
            query.put("CompositeExpression", request.compositeExpressionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactGroups)) {
            query.put("ContactGroups", request.contactGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveInterval)) {
            query.put("EffectiveInterval", request.effectiveInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailSubject)) {
            query.put("EmailSubject", request.emailSubject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noDataPolicy)) {
            query.put("NoDataPolicy", request.noDataPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noEffectiveInterval)) {
            query.put("NoEffectiveInterval", request.noEffectiveInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prometheusShrink)) {
            query.put("Prometheus", request.prometheusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhook)) {
            query.put("Webhook", request.webhook);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.escalations)) {
            query.put("Escalations", request.escalations);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutResourceMetricRule"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutResourceMetricRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a threshold-triggered alert rule for the <code>cpu_total</code> metric of an Elastic Compute Service (ECS) instance whose ID is <code>i-uf6j91r34rnwawoo****</code>. The namespace of ECS metrics is <code>acs_ecs_dashboard</code>. The alert contact group of the alert rule is <code>ECS_Group</code>. The name of the alert rule is <code>test123</code>. The ID of the alert rule is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>. The statistical method for Critical-level alerts is <code>Average</code>. The comparison operator for Critical-level alerts is <code>GreaterThanOrEqualToThreshold</code>. The threshold for Critical-level alerts is <code>90</code>. The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered is <code>3</code>.</p>
     * <blockquote>
     * <p> Statistics verification was added on August 15, 2024. Only the statistical value of the corresponding metric can be set for the Statistics parameter. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Configures an alert rule.</p>
     * 
     * @param request PutResourceMetricRuleRequest
     * @return PutResourceMetricRuleResponse
     */
    public PutResourceMetricRuleResponse putResourceMetricRule(PutResourceMetricRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putResourceMetricRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a threshold-triggered alert rule for the <code>cpu_total</code> metric of an Elastic Compute Service (ECS) instance whose ID is <code>i-uf6j91r34rnwawoo****</code>. The namespace of ECS metrics is <code>acs_ecs_dashboard</code>. The alert contact group of the alert rule is <code>ECS_Group</code>. The name of the alert rule is <code>test123</code>. The ID of the alert rule is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>. The statistical method for Critical-level alerts is <code>Average</code>. The comparison operator for Critical-level alerts is <code>GreaterThanOrEqualToThreshold</code>. The threshold for Critical-level alerts is <code>90</code>. The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered is <code>3</code>.</p>
     * <blockquote>
     * <p> Statistics verification was added on August 15, 2024. Only the statistical value of the corresponding metric can be set for the Statistics parameter. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates multiple alert rules for the specified metric of a specified resource.</p>
     * 
     * @param request PutResourceMetricRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutResourceMetricRulesResponse
     */
    public PutResourceMetricRulesResponse putResourceMetricRulesWithOptions(PutResourceMetricRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            query.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutResourceMetricRules"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutResourceMetricRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a threshold-triggered alert rule for the <code>cpu_total</code> metric of an Elastic Compute Service (ECS) instance whose ID is <code>i-uf6j91r34rnwawoo****</code>. The namespace of ECS metrics is <code>acs_ecs_dashboard</code>. The alert contact group of the alert rule is <code>ECS_Group</code>. The name of the alert rule is <code>test123</code>. The ID of the alert rule is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>. The statistical method for Critical-level alerts is <code>Average</code>. The comparison operator for Critical-level alerts is <code>GreaterThanOrEqualToThreshold</code>. The threshold for Critical-level alerts is <code>90</code>. The consecutive number of times for which the metric value meets the trigger condition before a Critical-level alert is triggered is <code>3</code>.</p>
     * <blockquote>
     * <p> Statistics verification was added on August 15, 2024. Only the statistical value of the corresponding metric can be set for the Statistics parameter. For more information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Appendix 1: Metrics</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates multiple alert rules for the specified metric of a specified resource.</p>
     * 
     * @param request PutResourceMetricRulesRequest
     * @return PutResourceMetricRulesResponse
     */
    public PutResourceMetricRulesResponse putResourceMetricRules(PutResourceMetricRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putResourceMetricRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes tags.</p>
     * 
     * @param request RemoveTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTagsResponse
     */
    public RemoveTagsResponse removeTagsWithOptions(RemoveTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTags"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes tags.</p>
     * 
     * @param request RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    public RemoveTagsResponse removeTags(RemoveTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to test whether a system event can be triggered as expected. You can call this operation to simulate a system event and check whether an expected response is returned after an alert is triggered by the system event.</p>
     * 
     * @param request SendDryRunSystemEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendDryRunSystemEventResponse
     */
    public SendDryRunSystemEventResponse sendDryRunSystemEventWithOptions(SendDryRunSystemEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventContent)) {
            query.put("EventContent", request.eventContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendDryRunSystemEvent"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendDryRunSystemEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to test whether a system event can be triggered as expected. You can call this operation to simulate a system event and check whether an expected response is returned after an alert is triggered by the system event.</p>
     * 
     * @param request SendDryRunSystemEventRequest
     * @return SendDryRunSystemEventResponse
     */
    public SendDryRunSystemEventResponse sendDryRunSystemEvent(SendDryRunSystemEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendDryRunSystemEventWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This API operation is not applicable to ECS instances. To uninstall the agent from an ECS instance, see <a href="https://help.aliyun.com/document_detail/183482.html">Install and uninstall the Cloud Monitor agent</a>.</p>
     * </blockquote>
     * 
     * @param request UninstallMonitoringAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallMonitoringAgentResponse
     */
    public UninstallMonitoringAgentResponse uninstallMonitoringAgentWithOptions(UninstallMonitoringAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallMonitoringAgent"),
            new TeaPair("version", "2019-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallMonitoringAgentResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This API operation is not applicable to ECS instances. To uninstall the agent from an ECS instance, see <a href="https://help.aliyun.com/document_detail/183482.html">Install and uninstall the Cloud Monitor agent</a>.</p>
     * </blockquote>
     * 
     * @param request UninstallMonitoringAgentRequest
     * @return UninstallMonitoringAgentResponse
     */
    public UninstallMonitoringAgentResponse uninstallMonitoringAgent(UninstallMonitoringAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallMonitoringAgentWithOptions(request, runtime);
    }
}

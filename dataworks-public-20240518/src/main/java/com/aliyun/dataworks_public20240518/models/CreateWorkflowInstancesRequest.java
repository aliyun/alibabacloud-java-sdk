// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to run the workflow instance immediately after creation. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoStartEnabled")
    public Boolean autoStartEnabled;

    /**
     * <p>The reason for creating the workflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>create for test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The runtime configurations.</p>
     */
    @NameInMap("DefaultRunProperties")
    public CreateWorkflowInstancesRequestDefaultRunProperties defaultRunProperties;

    /**
     * <p>The project environment. Valid values:</p>
     * <ul>
     * <li>Prod: production</li>
     * <li>Dev: development</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowInstance1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The data backfill period settings.</p>
     */
    @NameInMap("Periods")
    public CreateWorkflowInstancesRequestPeriods periods;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tag creation policy. Valid values:</p>
     * <ul>
     * <li>Append: append mode. New tags are appended to the existing tags inherited from the manual workflow.</li>
     * <li>Overwrite: overwrite mode. Existing tags of the manual workflow are not inherited. Tags are created directly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Append</p>
     */
    @NameInMap("TagCreationPolicy")
    public String tagCreationPolicy;

    /**
     * <p>The list of node labels.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateWorkflowInstancesRequestTags> tags;

    /**
     * <p>The node parameters used to set parameters for specific nodes. The value is in JSON format. The key is the node ID, and the value format refers to the node script parameter (the Task.Script.Parameter field in the GetTask response).</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;1001&quot;: &quot;key1=val2 key2=val2&quot;, 
     *   &quot;1002&quot;: &quot;key1=val2 key2=val2&quot;
     * }</p>
     */
    @NameInMap("TaskParameters")
    public String taskParameters;

    /**
     * <p>The type of the workflow instance. Valid values:</p>
     * <ul>
     * <li>SupplementData: data backfill. The method for specifying RootTaskIds and IncludeTaskIds varies based on the data backfill pattern. For more information, see the DefaultRunProperties.Mode parameter description.</li>
     * <li>ManualWorkflow: manual workflow. Set WorkflowId to the ID of the manual workflow. RootTaskIds is optional. If you do not specify RootTaskIds, the default root node list of the manual workflow is used.</li>
     * <li>Manual: manual node. Only RootTaskIds is required, which specifies the list of manual nodes to run.</li>
     * <li>SmokeTest: smoke test. Only RootTaskIds is required, which specifies the list of test nodes to run.</li>
     * <li>TriggerWorkflow: trigger-based workflow. Set WorkflowId to the ID of the trigger-based workflow. IncludeTaskIds is optional. If you do not specify IncludeTaskIds, the entire workflow is run.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SupplementData</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the workflow to which the instance belongs. The WorkflowId for periodic nodes is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    /**
     * <p>The workflow parameters. This parameter takes effect when a unique workflow is specified (<code>WorkflowId != 1</code>). For periodic workflows and trigger-based workflows, the format is key=value, and the priority is lower than node parameters. For manual workflows, the format is JSON, and the priority is higher than node parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;key=value&quot; format:
     * key1=value1 key2=value2
     * JSON format:
     * {&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
     */
    @NameInMap("WorkflowParameters")
    public String workflowParameters;

    public static CreateWorkflowInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkflowInstancesRequest self = new CreateWorkflowInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkflowInstancesRequest setAutoStartEnabled(Boolean autoStartEnabled) {
        this.autoStartEnabled = autoStartEnabled;
        return this;
    }
    public Boolean getAutoStartEnabled() {
        return this.autoStartEnabled;
    }

    public CreateWorkflowInstancesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateWorkflowInstancesRequest setDefaultRunProperties(CreateWorkflowInstancesRequestDefaultRunProperties defaultRunProperties) {
        this.defaultRunProperties = defaultRunProperties;
        return this;
    }
    public CreateWorkflowInstancesRequestDefaultRunProperties getDefaultRunProperties() {
        return this.defaultRunProperties;
    }

    public CreateWorkflowInstancesRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public CreateWorkflowInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkflowInstancesRequest setPeriods(CreateWorkflowInstancesRequestPeriods periods) {
        this.periods = periods;
        return this;
    }
    public CreateWorkflowInstancesRequestPeriods getPeriods() {
        return this.periods;
    }

    public CreateWorkflowInstancesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateWorkflowInstancesRequest setTagCreationPolicy(String tagCreationPolicy) {
        this.tagCreationPolicy = tagCreationPolicy;
        return this;
    }
    public String getTagCreationPolicy() {
        return this.tagCreationPolicy;
    }

    public CreateWorkflowInstancesRequest setTags(java.util.List<CreateWorkflowInstancesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateWorkflowInstancesRequestTags> getTags() {
        return this.tags;
    }

    public CreateWorkflowInstancesRequest setTaskParameters(String taskParameters) {
        this.taskParameters = taskParameters;
        return this;
    }
    public String getTaskParameters() {
        return this.taskParameters;
    }

    public CreateWorkflowInstancesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateWorkflowInstancesRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public CreateWorkflowInstancesRequest setWorkflowParameters(String workflowParameters) {
        this.workflowParameters = workflowParameters;
        return this;
    }
    public String getWorkflowParameters() {
        return this.workflowParameters;
    }

    public static class CreateWorkflowInstancesRequestDefaultRunPropertiesAlert extends TeaModel {
        /**
         * <p>The notification method. Valid values:</p>
         * <ul>
         * <li>Sms: SMS only</li>
         * <li>Mail: email only</li>
         * <li>SmsMail: SMS and email</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Sms</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>The alert policy. Valid values:</p>
         * <ul>
         * <li>Success: alert on success</li>
         * <li>Failure: alert on failure</li>
         * <li>SuccessFailure: alert on both success and failure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succes</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateWorkflowInstancesRequestDefaultRunPropertiesAlert build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkflowInstancesRequestDefaultRunPropertiesAlert self = new CreateWorkflowInstancesRequestDefaultRunPropertiesAlert();
            return TeaModel.build(map, self);
        }

        public CreateWorkflowInstancesRequestDefaultRunPropertiesAlert setNoticeType(String noticeType) {
            this.noticeType = noticeType;
            return this;
        }
        public String getNoticeType() {
            return this.noticeType;
        }

        public CreateWorkflowInstancesRequestDefaultRunPropertiesAlert setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis extends TeaModel {
        /**
         * <p>Specifies whether to block running when the analysis does not pass. This parameter is required when Type is set to SupplementData.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Blocked")
        public Boolean blocked;

        /**
         * <p>Specifies whether to enable analysis. This parameter is required when Type is set to SupplementData.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        public static CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis self = new CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis();
            return TeaModel.build(map, self);
        }

        public CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis setBlocked(Boolean blocked) {
            this.blocked = blocked;
            return this;
        }
        public Boolean getBlocked() {
            return this.blocked;
        }

        public CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy extends TeaModel {
        /**
         * <p>The end run time. Format: <code>hh:mm:ss</code> in 24-hour format. This field is required if you set the run policy.</p>
         * 
         * <strong>example:</strong>
         * <p>23:59:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Specifies whether the instance can start running immediately if the run time is in the future. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Immediately")
        public Boolean immediately;

        /**
         * <p>The start run time. Format: <code>hh:mm:ss</code> in 24-hour format. This field is required if you set the run policy.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time period type. This field is required if you set the run policy. Valid values:</p>
         * <ul>
         * <li>Daily: every day</li>
         * <li>Weekend: weekends only</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy self = new CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy();
            return TeaModel.build(map, self);
        }

        public CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy setImmediately(Boolean immediately) {
            this.immediately = immediately;
            return this;
        }
        public Boolean getImmediately() {
            return this.immediately;
        }

        public CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateWorkflowInstancesRequestDefaultRunProperties extends TeaModel {
        /**
         * <p>The alert configuration.</p>
         */
        @NameInMap("Alert")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesAlert alert;

        /**
         * <p>The analysis configuration. This parameter is required when Type is set to SupplementData.</p>
         */
        @NameInMap("Analysis")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis analysis;

        /**
         * <p>The list of project IDs to exclude.</p>
         */
        @NameInMap("ExcludeProjectIds")
        public java.util.List<Long> excludeProjectIds;

        /**
         * <p>The list of node IDs to exclude from running.</p>
         */
        @NameInMap("ExcludeTaskIds")
        public java.util.List<Long> excludeTaskIds;

        /**
         * <p>The list of project IDs to include.</p>
         */
        @NameInMap("IncludeProjectIds")
        public java.util.List<Long> includeProjectIds;

        /**
         * <p>The list of node IDs to run.</p>
         */
        @NameInMap("IncludeTaskIds")
        public java.util.List<Long> includeTaskIds;

        /**
         * <p>The data backfill mode. Default value: ManualSelection. This parameter is required when Type is set to SupplementData. Valid values:</p>
         * <ul>
         * <li>General: general mode. Only one value can be specified for <code>RootTaskIds</code>. <code>IncludeTaskIds</code> is optional. If you do not specify IncludeTaskIds, the content in <code>RootTaskIds</code> is included by default.</li>
         * <li>ManualSelection: manual selection. Multiple values can be specified for <code>RootTaskIds</code>. <code>IncludeTaskIds</code> is optional. If you do not specify IncludeTaskIds, the content in <code>RootTaskIds</code> is included by default.</li>
         * <li>Chain: chain mode. <code>RootTaskIds</code> is empty. Specify two IDs in <code>IncludeTaskIds</code>, which are the start and end nodes.</li>
         * <li>AllDownstream: all downstream. Only one value can be specified for <code>RootTaskIds</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManualSelection</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The run order. Default value: Asc. Valid values:</p>
         * <ul>
         * <li>Asc: ascending order by business date.</li>
         * <li>Desc: descending order by business date.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        @NameInMap("Order")
        public String order;

        /**
         * <p>The number of parallel nodes. A value from 2 to 10 specifies the parallelism. A value of 1 specifies serial execution. This parameter is required when Type is set to SupplementData.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Parallelism")
        public Integer parallelism;

        /**
         * <p>The run priority. Valid values: 1 to 11. A larger value indicates a higher priority. This parameter settings only supports manual workflows and trigger-based workflows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The priority weight policy. This parameter settings only supports manual workflows and trigger-based workflows. Valid values:</p>
         * <ul>
         * <li><code>Disable</code>: disabled (default)</li>
         * <li><code>Upstream</code>: calculates the total weight of upstream nodes for the current node. The deeper the level, the higher the weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Upstream</p>
         */
        @NameInMap("PriorityWeightStrategy")
        public String priorityWeightStrategy;

        /**
         * <p>The list of root node IDs.</p>
         * <ul>
         * <li>When Type is set to SupplementData, RootTaskIds is required except when Mode is set to Chain.</li>
         * <li>When Type is set to ManualWorkflow, RootTaskIds is optional. If you do not specify RootTaskIds, the default root node list of the manual workflow is used.</li>
         * <li>When Type is set to Manual, RootTaskIds is required, which specifies the list of manual nodes to run.</li>
         * <li>When Type is set to SmokeTest, RootTaskIds is required, which specifies the list of test nodes to run.</li>
         * </ul>
         */
        @NameInMap("RootTaskIds")
        public java.util.List<Long> rootTaskIds;

        /**
         * <p>The run policy. If this field is empty, the node configuration is used.</p>
         */
        @NameInMap("RunPolicy")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy runPolicy;

        /**
         * <p>The identifier of the custom schedule resource group. If this field is empty, the node configuration is used.</p>
         * 
         * <strong>example:</strong>
         * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
         */
        @NameInMap("RuntimeResource")
        public String runtimeResource;

        public static CreateWorkflowInstancesRequestDefaultRunProperties build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkflowInstancesRequestDefaultRunProperties self = new CreateWorkflowInstancesRequestDefaultRunProperties();
            return TeaModel.build(map, self);
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setAlert(CreateWorkflowInstancesRequestDefaultRunPropertiesAlert alert) {
            this.alert = alert;
            return this;
        }
        public CreateWorkflowInstancesRequestDefaultRunPropertiesAlert getAlert() {
            return this.alert;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setAnalysis(CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis analysis) {
            this.analysis = analysis;
            return this;
        }
        public CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis getAnalysis() {
            return this.analysis;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setExcludeProjectIds(java.util.List<Long> excludeProjectIds) {
            this.excludeProjectIds = excludeProjectIds;
            return this;
        }
        public java.util.List<Long> getExcludeProjectIds() {
            return this.excludeProjectIds;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setExcludeTaskIds(java.util.List<Long> excludeTaskIds) {
            this.excludeTaskIds = excludeTaskIds;
            return this;
        }
        public java.util.List<Long> getExcludeTaskIds() {
            return this.excludeTaskIds;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setIncludeProjectIds(java.util.List<Long> includeProjectIds) {
            this.includeProjectIds = includeProjectIds;
            return this;
        }
        public java.util.List<Long> getIncludeProjectIds() {
            return this.includeProjectIds;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setIncludeTaskIds(java.util.List<Long> includeTaskIds) {
            this.includeTaskIds = includeTaskIds;
            return this;
        }
        public java.util.List<Long> getIncludeTaskIds() {
            return this.includeTaskIds;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setParallelism(Integer parallelism) {
            this.parallelism = parallelism;
            return this;
        }
        public Integer getParallelism() {
            return this.parallelism;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setPriorityWeightStrategy(String priorityWeightStrategy) {
            this.priorityWeightStrategy = priorityWeightStrategy;
            return this;
        }
        public String getPriorityWeightStrategy() {
            return this.priorityWeightStrategy;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setRootTaskIds(java.util.List<Long> rootTaskIds) {
            this.rootTaskIds = rootTaskIds;
            return this;
        }
        public java.util.List<Long> getRootTaskIds() {
            return this.rootTaskIds;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setRunPolicy(CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy runPolicy) {
            this.runPolicy = runPolicy;
            return this;
        }
        public CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy getRunPolicy() {
            return this.runPolicy;
        }

        public CreateWorkflowInstancesRequestDefaultRunProperties setRuntimeResource(String runtimeResource) {
            this.runtimeResource = runtimeResource;
            return this;
        }
        public String getRuntimeResource() {
            return this.runtimeResource;
        }

    }

    public static class CreateWorkflowInstancesRequestPeriodsBizDates extends TeaModel {
        /**
         * <p>The end business date. Format: <code>yyyy-mm-dd</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-24</p>
         */
        @NameInMap("EndBizDate")
        public String endBizDate;

        /**
         * <p>The start business date. Format: <code>yyyy-mm-dd</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-20</p>
         */
        @NameInMap("StartBizDate")
        public String startBizDate;

        public static CreateWorkflowInstancesRequestPeriodsBizDates build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkflowInstancesRequestPeriodsBizDates self = new CreateWorkflowInstancesRequestPeriodsBizDates();
            return TeaModel.build(map, self);
        }

        public CreateWorkflowInstancesRequestPeriodsBizDates setEndBizDate(String endBizDate) {
            this.endBizDate = endBizDate;
            return this;
        }
        public String getEndBizDate() {
            return this.endBizDate;
        }

        public CreateWorkflowInstancesRequestPeriodsBizDates setStartBizDate(String startBizDate) {
            this.startBizDate = startBizDate;
            return this;
        }
        public String getStartBizDate() {
            return this.startBizDate;
        }

    }

    public static class CreateWorkflowInstancesRequestPeriods extends TeaModel {
        /**
         * <p>The list of business dates. You can specify up to 7 business date ranges.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("BizDates")
        public java.util.List<CreateWorkflowInstancesRequestPeriodsBizDates> bizDates;

        /**
         * <p>The end period time. Format: <code>hh:mm:ss</code> in 24-hour format. Default value: 23:59:59.</p>
         * <p>If you specify this field, you must also specify StartTime.</p>
         * 
         * <strong>example:</strong>
         * <p>23:59:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start period time. Format: <code>hh:mm:ss</code> in 24-hour format. Default value: 00:00:00.</p>
         * <p>If you specify this field, you must also specify EndTime.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static CreateWorkflowInstancesRequestPeriods build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkflowInstancesRequestPeriods self = new CreateWorkflowInstancesRequestPeriods();
            return TeaModel.build(map, self);
        }

        public CreateWorkflowInstancesRequestPeriods setBizDates(java.util.List<CreateWorkflowInstancesRequestPeriodsBizDates> bizDates) {
            this.bizDates = bizDates;
            return this;
        }
        public java.util.List<CreateWorkflowInstancesRequestPeriodsBizDates> getBizDates() {
            return this.bizDates;
        }

        public CreateWorkflowInstancesRequestPeriods setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateWorkflowInstancesRequestPeriods setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class CreateWorkflowInstancesRequestTags extends TeaModel {
        /**
         * <p>The label key.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The label value.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateWorkflowInstancesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkflowInstancesRequestTags self = new CreateWorkflowInstancesRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateWorkflowInstancesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateWorkflowInstancesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

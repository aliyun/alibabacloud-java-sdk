// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesRequest extends TeaModel {
    /**
     * <p>The default value is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoStartEnabled")
    public Boolean autoStartEnabled;

    /**
     * <p>The reason for the creation.</p>
     * 
     * <strong>example:</strong>
     * <p>create for test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The runtime configuration.</p>
     */
    @NameInMap("DefaultRunProperties")
    public CreateWorkflowInstancesRequestDefaultRunProperties defaultRunProperties;

    /**
     * <p>The environment of the workspace. Valid values:</p>
     * <ul>
     * <li>Prod</li>
     * <li>Dev</li>
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
     * <p>The configuration of the data backfilling period.</p>
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

    @NameInMap("TagCreationPolicy")
    public String tagCreationPolicy;

    @NameInMap("Tags")
    public java.util.List<CreateWorkflowInstancesRequestTags> tags;

    /**
     * <p>The task-specific parameters. The value is in the JSON format. The key specifies the task ID. You can call the GetTask operation to obtain the format of the value by querying the script parameters.</p>
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
     * <li>SupplementData: The values of the RootTaskIds and IncludeTaskIds parameters vary based on the value of the Mode parameter. For more information, see the Mode parameter in this API operation.</li>
     * <li>ManualWorkflow: If you set the Type parameter to ManualWorkflow, you must set the WorkflowId parameter to the ID of the manually triggered workflow. The RootTaskIds parameter is optional. If you do not configure the RootTaskIds parameter, the IDs of the default root nodes of the manually triggered workflow are used.</li>
     * <li>Manual: You need to configure only the RootTaskIds parameter. The RootTaskIds parameter specifies the IDs of the manually triggered tasks that need to be run.</li>
     * <li>SmokeTest: You need to configure only the RootTaskIds parameter. The RootTaskIds parameter specifies the IDs of the test tasks that need to be run.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SupplementData</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the workflow to which the instance belongs. This parameter is set to 1 for auto triggered tasks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    /**
     * <p>The workflow parameters. This parameter takes effect only when you set the <code>WorkflowId</code> parameter to a value other than 1. If your workflow is an auto triggered workflow, configure this parameter in the key=value format. The parameters that you configure in this parameter have a lower priority than task parameters. If your workflow is a manually triggered workflow, configure this parameter in the JSON format. The parameters that you configure in this parameter have a higher priority than task parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{ 
     *   &quot;key1&quot;: &quot;value1&quot;, 
     *   &quot;key2&quot;: &quot;value2&quot; 
     * }</p>
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
         * <p>The alert notification method. Valid values:</p>
         * <ul>
         * <li>Sms</li>
         * <li>Mail</li>
         * <li>SmsMail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Sms</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
         * <p>The alerting policy. Valid values:</p>
         * <ul>
         * <li>Success: An alert is reported when data backfill succeeds.</li>
         * <li>Failure: An alert is reported when data backfill fails.</li>
         * <li>SuccessFailure: An alert is reported regardless of whether data backfill succeeds or fails.</li>
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
         * <p>Specifies whether to block running if the analysis fails. If you set the Type parameter to SupplementData, this parameter is required. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Blocked")
        public Boolean blocked;

        /**
         * <p>Specifies whether to enable the analysis feature. If you set the Type parameter to SupplementData, this parameter is required. Valid values: true and false.</p>
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
         * <p>The end time of running. Configure this parameter in the <code>hh:mm:ss</code> format. The time must be in the 24-hour clock. This parameter is required if you configure the RunPolicy parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>23:59:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Specifies whether the instances can be run immediately during the time period in the future. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Immediately")
        public Boolean immediately;

        /**
         * <p>The start time of running. Configure this parameter in the <code>hh:mm:ss</code> format. The time must be in the 24-hour clock. This parameter is required if you configure the RunPolicy parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The type of the time period during which the data is backfilled. This parameter is required if you configure the RunPolicy parameter.</p>
         * <ul>
         * <li>Daily</li>
         * <li>Weekend</li>
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
         * <p>The alert settings.</p>
         */
        @NameInMap("Alert")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesAlert alert;

        /**
         * <p>The configurations for analysis. If you set the Type parameter to SupplementData, this parameter is required.</p>
         */
        @NameInMap("Analysis")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis analysis;

        /**
         * <p>The IDs of the projects that do not need to be run.</p>
         */
        @NameInMap("ExcludeProjectIds")
        public java.util.List<Long> excludeProjectIds;

        /**
         * <p>The IDs of the tasks that do not need to be run.</p>
         */
        @NameInMap("ExcludeTaskIds")
        public java.util.List<Long> excludeTaskIds;

        /**
         * <p>The IDs of the projects that need to be run.</p>
         */
        @NameInMap("IncludeProjectIds")
        public java.util.List<Long> includeProjectIds;

        /**
         * <p>The IDs of the tasks that need to be run.</p>
         */
        @NameInMap("IncludeTaskIds")
        public java.util.List<Long> includeTaskIds;

        /**
         * <p>The data backfill mode. Default value: ManualSelection. If you set the Type parameter to SupplementData, this parameter is required. Valid values:</p>
         * <ul>
         * <li>General: You can specify only <code>one root task ID</code>. The <code>IncludeTaskIds</code> parameter is optional. If you do not configure the IncludeTaskIds parameter, the tasks that are specified by the <code>RootTaskIds</code> parameter are included by default.</li>
         * <li>ManualSelection: You can specify <code>multiple root task IDs</code>. The <code>IncludeTaskIds</code> parameter is optional. If you do not configure the IncludeTaskIds parameter, the tasks that are specified by the <code>RootTaskIds</code> parameter are included by default.</li>
         * <li>Chain: If you set the Mode parameter to Chain, you must leave the <code>RootTaskIds</code> parameter empty and set the <code>IncludeTaskIds</code> parameter to the start task ID and the end task ID.</li>
         * <li>AllDownstream: You can specify only one <code>root task ID</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManualSelection</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The running order. Valid values:</p>
         * <ul>
         * <li>Asc (default): The tasks are sorted by data timestamp in ascending order.</li>
         * <li>Desc: The tasks are sorted by data timestamp in descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        @NameInMap("Order")
        public String order;

        /**
         * <p>The number of tasks that can be run in parallel. If you specify a value that ranges from 2 to 10, the value indicates the number of tasks that can be run in parallel. If you set the value to 1, the tasks are run one by one. If you set the Type parameter to SupplementData, this parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Parallelism")
        public Integer parallelism;

        /**
         * <p>The running priority. Valid values: 1 to 11. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The weight policy for the priority. Valid values:</p>
         * <ul>
         * <li><code>Disable</code>: No weight policy for the priority is enabled. This is the default value.</li>
         * <li><code>Upstream</code>: The sum of the weights for the ancestor nodes of the current node is calculated. The more ancestor nodes, the higher the weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Upstream</p>
         */
        @NameInMap("PriorityWeightStrategy")
        public String priorityWeightStrategy;

        /**
         * <p>The root task IDs.</p>
         * <ul>
         * <li>If you set the Type parameter to SupplementData and the Mode parameter to a value other than Chain, the RootTaskIds parameter is required.</li>
         * <li>If you set the Type parameter to ManualWorkflow, the RootTaskIds parameter is optional. If you do not configure the RootTaskIds parameter, the IDs of the default root nodes of the manually triggered workflow are used.</li>
         * <li>If you set the Type parameter to Manual, the RootTaskIds parameter is required. The RootTaskIds parameter specifies the IDs of the manually triggered tasks that need to be run.</li>
         * <li>If you set the Type parameter to SmokeTest, the RootTaskIds parameter is required. The RootTaskIds parameter specifies the IDs of the test tasks that need to be run.</li>
         * </ul>
         */
        @NameInMap("RootTaskIds")
        public java.util.List<Long> rootTaskIds;

        /**
         * <p>The policy for running. If you leave this parameter empty, the task configuration is used.</p>
         */
        @NameInMap("RunPolicy")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy runPolicy;

        /**
         * <p>The identifier of the custom resource group for scheduling. If you leave this parameter empty, the runtime configuration is used.</p>
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
         * <p>The data timestamp at which data is no longer backfilled. Configure this parameter in the <code>yyyy-mm-dd</code> format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-24</p>
         */
        @NameInMap("EndBizDate")
        public String endBizDate;

        /**
         * <p>The data timestamp at which the data starts to be backfilled. Configure this parameter in the <code>yyyy-mm-dd</code> format.</p>
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
         * <p>The data timestamps. You can specify up to seven data timestamps.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("BizDates")
        public java.util.List<CreateWorkflowInstancesRequestPeriodsBizDates> bizDates;

        /**
         * <p>The end time of data backfill. Configure this parameter in the <code>hh:mm:ss</code> format. The time must be in the 24-hour clock. Default value: 23:59:59.</p>
         * <p>If you configure this parameter, you must also configure the StartTime parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>23:59:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of data backfill. Configure this parameter in the <code>hh:mm:ss</code> format. The time must be in the 24-hour clock. Default value: 00:00:00.</p>
         * <p>If you configure this parameter, you must also configure the EndTime parameter.</p>
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
        @NameInMap("Key")
        public String key;

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

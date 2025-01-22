// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateWorkflowInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoStartEnabled")
    public Boolean autoStartEnabled;

    /**
     * <strong>example:</strong>
     * <p>create for test</p>
     */
    @NameInMap("Comment")
    public String comment;

    @NameInMap("DefaultRunProperties")
    public CreateWorkflowInstancesRequestDefaultRunProperties defaultRunProperties;

    /**
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowInstance1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Periods")
    public CreateWorkflowInstancesRequestPeriods periods;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;1001&quot;: &quot;key1=val2 key2=val2&quot;, 
     *   &quot;1002&quot;: &quot;key1=val2 key2=val2&quot;
     * }</p>
     */
    @NameInMap("TaskParameters")
    public String taskParameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SupplementData</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    /**
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
         * <strong>example:</strong>
         * <p>Sms</p>
         */
        @NameInMap("NoticeType")
        public String noticeType;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Blocked")
        public Boolean blocked;

        /**
         * <p>This parameter is required.</p>
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
         * <strong>example:</strong>
         * <p>23:59:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Immediately")
        public Boolean immediately;

        /**
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
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
        @NameInMap("Alert")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesAlert alert;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Analysis")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesAnalysis analysis;

        @NameInMap("ExcludeProjectIds")
        public java.util.List<Long> excludeProjectIds;

        @NameInMap("ExcludeTaskIds")
        public java.util.List<Long> excludeTaskIds;

        @NameInMap("IncludeProjectIds")
        public java.util.List<Long> includeProjectIds;

        @NameInMap("IncludeTaskIds")
        public java.util.List<Long> includeTaskIds;

        /**
         * <strong>example:</strong>
         * <p>ManualSelection</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>Asc</p>
         */
        @NameInMap("Order")
        public String order;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Parallelism")
        public Integer parallelism;

        @NameInMap("RootTaskIds")
        public java.util.List<Long> rootTaskIds;

        @NameInMap("RunPolicy")
        public CreateWorkflowInstancesRequestDefaultRunPropertiesRunPolicy runPolicy;

        /**
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-24</p>
         */
        @NameInMap("EndBizDate")
        public String endBizDate;

        /**
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("BizDates")
        public java.util.List<CreateWorkflowInstancesRequestPeriodsBizDates> bizDates;

        /**
         * <strong>example:</strong>
         * <p>23:59:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
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

}

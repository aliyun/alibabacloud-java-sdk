// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RerunWorkflowInstancesRequest extends TeaModel {
    /**
     * <p>The business date used for matching manual workflow instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("Bizdate")
    public Long bizdate;

    /**
     * <p>The end trigger time of the manual workflow instance used for matching. This parameter must be used together with the StartTriggerTime.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("EndTriggerTime")
    public Long endTriggerTime;

    /**
     * <p>The environment of the workspace. Valid values:</p>
     * <p>Prod Dev</p>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The match conditions for internal instances of manual workflow instances.</p>
     */
    @NameInMap("Filter")
    public RerunWorkflowInstancesRequestFilter filter;

    /**
     * <p>The instance IDs used for matching manual workflow instances.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    /**
     * <p>The manual workflow name, used for fuzzy matching.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The start trigger time (creation time) of the manual workflow instance used for matching. This parameter must be used together with EndTriggerTime.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("StartTriggerTime")
    public Long startTriggerTime;

    /**
     * <p>The status used for matching manual workflow instances.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Success</li>
     * <li>Failure</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Failure</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the workflow instance. Valid values:</p>
     * <p>ManualWorkflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ManualWorkflow</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The workflow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static RerunWorkflowInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RerunWorkflowInstancesRequest self = new RerunWorkflowInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RerunWorkflowInstancesRequest setBizdate(Long bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public Long getBizdate() {
        return this.bizdate;
    }

    public RerunWorkflowInstancesRequest setEndTriggerTime(Long endTriggerTime) {
        this.endTriggerTime = endTriggerTime;
        return this;
    }
    public Long getEndTriggerTime() {
        return this.endTriggerTime;
    }

    public RerunWorkflowInstancesRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public RerunWorkflowInstancesRequest setFilter(RerunWorkflowInstancesRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public RerunWorkflowInstancesRequestFilter getFilter() {
        return this.filter;
    }

    public RerunWorkflowInstancesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public RerunWorkflowInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RerunWorkflowInstancesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RerunWorkflowInstancesRequest setStartTriggerTime(Long startTriggerTime) {
        this.startTriggerTime = startTriggerTime;
        return this;
    }
    public Long getStartTriggerTime() {
        return this.startTriggerTime;
    }

    public RerunWorkflowInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RerunWorkflowInstancesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RerunWorkflowInstancesRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public static class RerunWorkflowInstancesRequestFilter extends TeaModel {
        /**
         * <p>Specifies whether to rerun the matched instances and all downstream instances.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RerunDownstreamEnabled")
        public Boolean rerunDownstreamEnabled;

        /**
         * <p>The internal task IDs used for matching manual workflow instances.</p>
         */
        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        /**
         * <p>The statuses of internal tasks used for matching manual workflow instances.</p>
         */
        @NameInMap("TaskInstanceStatuses")
        public java.util.List<String> taskInstanceStatuses;

        /**
         * <p>The internal task name used for matching the manual workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>Match internal tasks within the manual workflow by type.</p>
         */
        @NameInMap("TaskTypes")
        public java.util.List<String> taskTypes;

        public static RerunWorkflowInstancesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            RerunWorkflowInstancesRequestFilter self = new RerunWorkflowInstancesRequestFilter();
            return TeaModel.build(map, self);
        }

        public RerunWorkflowInstancesRequestFilter setRerunDownstreamEnabled(Boolean rerunDownstreamEnabled) {
            this.rerunDownstreamEnabled = rerunDownstreamEnabled;
            return this;
        }
        public Boolean getRerunDownstreamEnabled() {
            return this.rerunDownstreamEnabled;
        }

        public RerunWorkflowInstancesRequestFilter setTaskIds(java.util.List<Long> taskIds) {
            this.taskIds = taskIds;
            return this;
        }
        public java.util.List<Long> getTaskIds() {
            return this.taskIds;
        }

        public RerunWorkflowInstancesRequestFilter setTaskInstanceStatuses(java.util.List<String> taskInstanceStatuses) {
            this.taskInstanceStatuses = taskInstanceStatuses;
            return this;
        }
        public java.util.List<String> getTaskInstanceStatuses() {
            return this.taskInstanceStatuses;
        }

        public RerunWorkflowInstancesRequestFilter setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public RerunWorkflowInstancesRequestFilter setTaskTypes(java.util.List<String> taskTypes) {
            this.taskTypes = taskTypes;
            return this;
        }
        public java.util.List<String> getTaskTypes() {
            return this.taskTypes;
        }

    }

}

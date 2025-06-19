// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RerunWorkflowInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("Bizdate")
    public Long bizdate;

    /**
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("EndTriggerTime")
    public Long endTriggerTime;

    /**
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    @NameInMap("Filter")
    public RerunWorkflowInstancesRequestFilter filter;

    @NameInMap("Ids")
    public java.util.List<Long> ids;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("StartTriggerTime")
    public Long startTriggerTime;

    /**
     * <strong>example:</strong>
     * <p>Failure</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ManualWorkflow</p>
     */
    @NameInMap("Type")
    public String type;

    /**
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
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RerunDownstreamEnabled")
        public Boolean rerunDownstreamEnabled;

        @NameInMap("TaskIds")
        public java.util.List<Long> taskIds;

        @NameInMap("TaskInstanceStatuses")
        public java.util.List<String> taskInstanceStatuses;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TaskName")
        public String taskName;

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

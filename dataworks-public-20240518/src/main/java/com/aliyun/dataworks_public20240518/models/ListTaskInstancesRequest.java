// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskInstancesRequest extends TeaModel {
    /**
     * <p>The data timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("Bizdate")
    public Long bizdate;

    /**
     * <p>The ID of the instance. The instance may be rerun. If the instance is rerun and you configure this parameter, the system returns the historical information of the instance, including the rerun information. You can use the RunNumber parameter to distinguish each entry in the historical information.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The IDs of the instances. You can query multiple instances at a time by instance ID.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    /**
     * <p>The account ID of the task owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The environment of the workspace. Valid values:</p>
     * <ul>
     * <li>Prod: production environment</li>
     * <li>Dev: development environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The information about the resource group. Set this parameter to the identifier of a resource group for scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResource;

    /**
     * <p>The field used for sorting. Fields such as TriggerTime and StartedTime are supported. The value of this parameter is in the Sort field + Sort by (Desc/Asc) format. By default, results are sorted in ascending order. Valid values:</p>
     * <ul>
     * <li><p><code>TriggerTime (Desc/Asc)</code></p>
     * </li>
     * <li><p><code>StartedTime (Desc/Asc)</code></p>
     * </li>
     * <li><p><code>FinishedTime (Desc/Asc)</code></p>
     * </li>
     * <li><p><code>CreateTime (Desc/Asc)</code></p>
     * </li>
     * <li><p><code>Id (Desc/Asc)</code></p>
     * <p>Default value: <code>Id Desc</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Id Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the task for which the instance is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The IDs of the tasks. You can query multiple instances at a time by task ID.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<Long> taskIds;

    /**
     * <p>The name of the task. Fuzzy match is supported.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task for which the instance is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS_SQL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The running mode of the instance after it is triggered. This parameter takes effect only if the TriggerType parameter is set to Scheduler. Valid values:</p>
     * <ul>
     * <li>Pause</li>
     * <li>Skip</li>
     * <li>Normal</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("TriggerRecurrence")
    public String triggerRecurrence;

    /**
     * <p>The trigger type. Valid values:</p>
     * <ul>
     * <li>Scheduler: scheduling cycle-based trigger</li>
     * <li>Manual: manual trigger</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The ID of the workflow to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    /**
     * <p>The workflow instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    /**
     * <p>The type of the workflow instance. Valid values:</p>
     * <ul>
     * <li>SmokeTest</li>
     * <li>Manual</li>
     * <li>SupplementData</li>
     * <li>ManualWorkflow</li>
     * <li>Normal</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("WorkflowInstanceType")
    public String workflowInstanceType;

    public static ListTaskInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstancesRequest self = new ListTaskInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskInstancesRequest setBizdate(Long bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public Long getBizdate() {
        return this.bizdate;
    }

    public ListTaskInstancesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListTaskInstancesRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public ListTaskInstancesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListTaskInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskInstancesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListTaskInstancesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListTaskInstancesRequest setRuntimeResource(String runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public String getRuntimeResource() {
        return this.runtimeResource;
    }

    public ListTaskInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTaskInstancesRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ListTaskInstancesRequest setTaskIds(java.util.List<Long> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<Long> getTaskIds() {
        return this.taskIds;
    }

    public ListTaskInstancesRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListTaskInstancesRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListTaskInstancesRequest setTriggerRecurrence(String triggerRecurrence) {
        this.triggerRecurrence = triggerRecurrence;
        return this;
    }
    public String getTriggerRecurrence() {
        return this.triggerRecurrence;
    }

    public ListTaskInstancesRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public ListTaskInstancesRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public ListTaskInstancesRequest setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public ListTaskInstancesRequest setWorkflowInstanceType(String workflowInstanceType) {
        this.workflowInstanceType = workflowInstanceType;
        return this;
    }
    public String getWorkflowInstanceType() {
        return this.workflowInstanceType;
    }

}

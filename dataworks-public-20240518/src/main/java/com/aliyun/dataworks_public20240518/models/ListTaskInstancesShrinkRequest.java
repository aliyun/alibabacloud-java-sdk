// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The data timestamp. The value of this parameter is 00:00:00 of the day before the scheduling time of the instance. The value is a UNIX timestamp. Unit: milliseconds. Example: 1743350400000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("Bizdate")
    public Long bizdate;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;startedTimeStart&quot;: &quot;1763481600000&quot;,
     *     &quot;startedTimeEnd&quot;: &quot;1763481600000&quot;,
     *     &quot;finishedTimeStart&quot;: &quot;1763481600000&quot;,
     *     &quot;finishedTimeEnd&quot;: &quot;1763481600000&quot;,
     *     &quot;createTimeStart&quot;: &quot;1763481600000&quot;,
     *     &quot;createTimeEnd&quot;: &quot;1763481600000&quot;
     * }</p>
     */
    @NameInMap("Filter")
    public String filter;

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
    public String idsShrink;

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
     * <p>The status of the task instance.</p>
     * <ul>
     * <li><code>NotRun</code>: Not started</li>
     * <li><code>Running</code></li>
     * <li><code>Failure</code></li>
     * <li><code>Success</code></li>
     * <li><code>WaitTime</code>: Awaiting scheduled time</li>
     * <li><code>WaitResource</code>: Awaiting resources</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

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
    public String taskIdsShrink;

    /**
     * <p>The name of the task. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL node</p>
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
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("UnifiedWorkflowInstanceId")
    public Long unifiedWorkflowInstanceId;

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
     * <li>SmokeTest: Testing</li>
     * <li>Manual: Manually triggered node</li>
     * <li>SupplementData: Data backfill</li>
     * <li>ManualWorkflow: Manually triggered workflow</li>
     * <li>Normal: Scheduled execution</li>
     * <li>TriggerWorkflow: Triggered Workflow</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("WorkflowInstanceType")
    public String workflowInstanceType;

    public static ListTaskInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskInstancesShrinkRequest self = new ListTaskInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskInstancesShrinkRequest setBizdate(Long bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public Long getBizdate() {
        return this.bizdate;
    }

    public ListTaskInstancesShrinkRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListTaskInstancesShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListTaskInstancesShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

    public ListTaskInstancesShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListTaskInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskInstancesShrinkRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListTaskInstancesShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListTaskInstancesShrinkRequest setRuntimeResource(String runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public String getRuntimeResource() {
        return this.runtimeResource;
    }

    public ListTaskInstancesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTaskInstancesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTaskInstancesShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ListTaskInstancesShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

    public ListTaskInstancesShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListTaskInstancesShrinkRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListTaskInstancesShrinkRequest setTriggerRecurrence(String triggerRecurrence) {
        this.triggerRecurrence = triggerRecurrence;
        return this;
    }
    public String getTriggerRecurrence() {
        return this.triggerRecurrence;
    }

    public ListTaskInstancesShrinkRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public ListTaskInstancesShrinkRequest setUnifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
        this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
        return this;
    }
    public Long getUnifiedWorkflowInstanceId() {
        return this.unifiedWorkflowInstanceId;
    }

    public ListTaskInstancesShrinkRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public ListTaskInstancesShrinkRequest setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
        return this;
    }
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public ListTaskInstancesShrinkRequest setWorkflowInstanceType(String workflowInstanceType) {
        this.workflowInstanceType = workflowInstanceType;
        return this;
    }
    public String getWorkflowInstanceType() {
        return this.workflowInstanceType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTaskInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The business date. Typically, this is 00:00:00 of the day before the scheduled time of the periodic instance, in the format of a millisecond-level timestamp, such as 1743350400000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1710239005403</p>
     */
    @NameInMap("Bizdate")
    public Long bizdate;

    /**
     * <p>The filter conditions in JSON format. Multiple filter conditions are combined with the AND logical operator. Supported fields: <code>startedTimeStart</code>, <code>startedTimeEnd</code>, <code>finishedTimeStart</code>, <code>finishedTimeEnd</code>, <code>createTimeStart</code>, and <code>createTimeEnd</code>.</p>
     * 
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
     * <p>The task instance ID. A task instance may be rerun. If you specify this parameter, the response includes historical rerun records, which are distinguished by RunNumber.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The task instance IDs. You can specify multiple task instance IDs to query task instances in batches.</p>
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
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
    @NameInMap("ProjectEnv")
    public String projectEnv;

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
     * <p>The resource group information. Specify the identifier of the scheduling resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResource;

    /**
     * <p>The sort field. Fields such as scheduled time and start time are supported. The format is \&quot;Sort field + Sort order (Desc/Asc)\&quot;, where Asc can be omitted. Valid values for the sort field:</p>
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
     * <p>Default value: <code>Id Desc</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Id Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The status of the task instance. Valid values:</p>
     * <ul>
     * <li><code>NotRun</code>: not run</li>
     * <li><code>Running</code>: running</li>
     * <li><code>Failure</code>: failed</li>
     * <li><code>Success</code>: successful</li>
     * <li><code>WaitTime</code>: waiting for scheduled time</li>
     * <li><code>WaitResource</code>: waiting for resources</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task IDs. You can specify multiple task IDs to query task instances in batches.</p>
     */
    @NameInMap("TaskIds")
    public String taskIdsShrink;

    /**
     * <p>The task name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL node</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The task type. For the valid values of TaskType for each node, see <a href="https://help.aliyun.com/document_detail/600169.html">DataWorks node types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS_SQL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The run mode upon triggering. This parameter takes effect only when TriggerType is set to Scheduler. Valid values:</p>
     * <ul>
     * <li>Pause: pause</li>
     * <li>Skip: dry run</li>
     * <li>Normal: normal run</li>
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
     * <li>Scheduler: periodic scheduling</li>
     * <li>Manual: manual</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The unified workflow instance ID. This value is the same for all task instances within a specific business date under a single trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("UnifiedWorkflowInstanceId")
    public Long unifiedWorkflowInstanceId;

    /**
     * <p>The ID of the associated workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    /**
     * <p>The ID of the associated workflow instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkflowInstanceId")
    public Long workflowInstanceId;

    /**
     * <p>The type of the workflow instance. Valid values:</p>
     * <ul>
     * <li>SmokeTest: test</li>
     * <li>Manual: manual task</li>
     * <li>SupplementData: data backfill</li>
     * <li>ManualWorkflow: manual workflow</li>
     * <li>Normal: periodic scheduling</li>
     * <li>TriggerWorkflow: triggered workflow</li>
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

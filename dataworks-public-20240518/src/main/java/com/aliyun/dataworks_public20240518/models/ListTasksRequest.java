// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    /**
     * <p>The name of the task. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL node</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <p>The workspace environment.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Prod</p>
     * </li>
     * <li><p>Dev</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The information about the resource group. Set this parameter to the ID of a resource group for scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>S_res_group_524258031846018_1684XXXXXXXXX</p>
     */
    @NameInMap("RuntimeResource")
    public String runtimeResource;

    /**
     * <p>The field that is used to sort tasks. This parameter is configured in the format of &quot;Sorting field Sorting order&quot;. You can set the sorting order to Desc or Asc. If you do not specify the sorting order, Asc is used by default. Valid values:</p>
     * <ul>
     * <li><p><code>ModifyTime (Desc/Asc)</code></p>
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
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><p>ODPS_SQL</p>
     * </li>
     * <li><p>SPARK</p>
     * </li>
     * <li><p>PY_ODPS</p>
     * </li>
     * <li><p>PY_ODPS3</p>
     * </li>
     * <li><p>ODPS_SCRIPT</p>
     * </li>
     * <li><p>ODPS_MR</p>
     * </li>
     * <li><p>COMPONENT_SQL</p>
     * </li>
     * <li><p>EMR_HIVE</p>
     * </li>
     * <li><p>EMR_MR</p>
     * </li>
     * <li><p>EMR_SPARK_SQL</p>
     * </li>
     * <li><p>EMR_SPARK</p>
     * </li>
     * <li><p>EMR_SHELL</p>
     * </li>
     * <li><p>EMR_PRESTO</p>
     * </li>
     * <li><p>EMR_IMPALA</p>
     * </li>
     * <li><p>SPARK_STREAMING</p>
     * </li>
     * <li><p>EMR_KYUUBI</p>
     * </li>
     * <li><p>EMR_TRINO</p>
     * </li>
     * <li><p>HOLOGRES_SQL</p>
     * </li>
     * <li><p>HOLOGRES_SYNC_DDL</p>
     * </li>
     * <li><p>HOLOGRES_SYNC_DATA</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ODPS_SQL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The run mode when triggered. Valid only if TriggerType is Scheduler.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Pause</p>
     * </li>
     * <li><p>Skip</p>
     * </li>
     * <li><p>Normal</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("TriggerRecurrence")
    public String triggerRecurrence;

    /**
     * <p>The trigger type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>Scheduler: Triggered by schedule.</p>
     * </li>
     * <li><p>Manual: Triggered manually.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Scheduler</p>
     */
    @NameInMap("TriggerType")
    public String triggerType;

    /**
     * <p>The ID of the workflow to which the task belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkflowId")
    public Long workflowId;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public ListTasksRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTasksRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public ListTasksRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListTasksRequest setRuntimeResource(String runtimeResource) {
        this.runtimeResource = runtimeResource;
        return this;
    }
    public String getRuntimeResource() {
        return this.runtimeResource;
    }

    public ListTasksRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListTasksRequest setTriggerRecurrence(String triggerRecurrence) {
        this.triggerRecurrence = triggerRecurrence;
        return this;
    }
    public String getTriggerRecurrence() {
        return this.triggerRecurrence;
    }

    public ListTasksRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public ListTasksRequest setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public Long getWorkflowId() {
        return this.workflowId;
    }

}

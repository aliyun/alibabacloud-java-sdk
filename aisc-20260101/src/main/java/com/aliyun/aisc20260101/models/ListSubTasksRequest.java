// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListSubTasksRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether to query only running subtasks. If you set this parameter to true, the system queries all running subtasks of the current tenant across root tasks. In this case, you do not need to specify RootTaskId.</p>
     */
    @NameInMap("OnlyRunning")
    public Boolean onlyRunning;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource directory account.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The ID of the root task returned upon task submission.</p>
     * 
     * <strong>example:</strong>
     * <p>110146ac282314fe4f7cd11afc7540eb</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
     * <p>The task type.</p>
     * 
     * <strong>example:</strong>
     * <p>SKILL_CHECK</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ListSubTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubTasksRequest self = new ListSubTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListSubTasksRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSubTasksRequest setOnlyRunning(Boolean onlyRunning) {
        this.onlyRunning = onlyRunning;
        return this;
    }
    public Boolean getOnlyRunning() {
        return this.onlyRunning;
    }

    public ListSubTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSubTasksRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ListSubTasksRequest setRootTaskId(String rootTaskId) {
        this.rootTaskId = rootTaskId;
        return this;
    }
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    public ListSubTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}

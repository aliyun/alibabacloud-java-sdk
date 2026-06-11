// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListSubTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>110146ac282314fe4f7cd11afc7540eb</p>
     */
    @NameInMap("RootTaskId")
    public String rootTaskId;

    /**
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

    public ListSubTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

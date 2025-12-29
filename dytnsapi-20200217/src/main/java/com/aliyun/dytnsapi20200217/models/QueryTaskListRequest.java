// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTaskListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Result")
    public java.util.List<Long> result;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TagId")
    public Long tagId;

    /**
     * <strong>example:</strong>
     * <p>91</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskType")
    public java.util.List<Long> taskType;

    public static QueryTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListRequest self = new QueryTaskListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskListRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTaskListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTaskListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTaskListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTaskListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryTaskListRequest setResult(java.util.List<Long> result) {
        this.result = result;
        return this;
    }
    public java.util.List<Long> getResult() {
        return this.result;
    }

    public QueryTaskListRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

    public QueryTaskListRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QueryTaskListRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public QueryTaskListRequest setTaskType(java.util.List<Long> taskType) {
        this.taskType = taskType;
        return this;
    }
    public java.util.List<Long> getTaskType() {
        return this.taskType;
    }

}

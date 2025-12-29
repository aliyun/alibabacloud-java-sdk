// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTaskListShrinkRequest extends TeaModel {
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
    public String resultShrink;

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
    public String taskTypeShrink;

    public static QueryTaskListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListShrinkRequest self = new QueryTaskListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskListShrinkRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTaskListShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTaskListShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTaskListShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTaskListShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryTaskListShrinkRequest setResultShrink(String resultShrink) {
        this.resultShrink = resultShrink;
        return this;
    }
    public String getResultShrink() {
        return this.resultShrink;
    }

    public QueryTaskListShrinkRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

    public QueryTaskListShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QueryTaskListShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public QueryTaskListShrinkRequest setTaskTypeShrink(String taskTypeShrink) {
        this.taskTypeShrink = taskTypeShrink;
        return this;
    }
    public String getTaskTypeShrink() {
        return this.taskTypeShrink;
    }

}

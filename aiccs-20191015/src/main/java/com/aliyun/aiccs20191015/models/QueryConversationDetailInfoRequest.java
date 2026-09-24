// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoRequest extends TeaModel {
    /**
     * <p>The task batch ID. This is the batch ID returned when callee data is imported. View the task batch ID on the <strong>Call Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution Records</strong> page, or use the batch ID returned when importing callee data by calling the <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139*********216</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>The task detail ID. View the task detail ID in the upper-left corner of the <strong>Call Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Completed</strong> &gt; <strong>Call Details</strong> page, or retrieve it by calling the <a href="https://help.aliyun.com/document_detail/2926853.html">QueryAiCallDetailPage</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9662*************</p>
     */
    @NameInMap("DetailId")
    public String detailId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task ID. View the task ID on the <strong>Call Task Management</strong> page or retrieve it by calling the <a href="https://help.aliyun.com/document_detail/2926799.html">QueryAiCallTaskPage</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>138************</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryConversationDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationDetailInfoRequest self = new QueryConversationDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryConversationDetailInfoRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryConversationDetailInfoRequest setDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }
    public String getDetailId() {
        return this.detailId;
    }

    public QueryConversationDetailInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryConversationDetailInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryConversationDetailInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryConversationDetailInfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

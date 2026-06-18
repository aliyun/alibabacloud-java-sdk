// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoRequest extends TeaModel {
    /**
     * <p>The batch ID. This ID is returned by the <a href="https://help.aliyun.com/document_detail/2926815.html">ImportTaskNumberDatas</a> operation when you import callee data. You can view this ID on the <strong>execution history</strong> page by navigating to <strong>call task management</strong> &gt; <strong>details</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139*********216</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>The detail ID. You can find this ID in the upper-left corner of the page by navigating to <strong>call task management</strong> &gt; <strong>details</strong> &gt; <strong>execution history</strong> &gt; <strong>completed</strong> &gt; <strong>call details</strong>, or get it by calling the <a href="https://help.aliyun.com/document_detail/2926853.html">QueryAiCallDetailPage</a> operation.</p>
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
     * <p>The task ID. You can find this ID on the <strong>call task management</strong> page or get it by calling the <a href="https://help.aliyun.com/document_detail/2926799.html">QueryAiCallTaskPage</a> operation.</p>
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

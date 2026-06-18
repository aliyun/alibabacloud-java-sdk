// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoNewRequest extends TeaModel {
    /**
     * <p>The unique ID of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>1552<strong><strong><strong><strong>^1420</strong></strong></strong></strong></p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The task detail ID. View the task detail ID in the upper-left corner of the <strong>Call Task Management</strong> &gt; <strong>Details</strong> &gt; <strong>Execution Records</strong> &gt; <strong>Completed</strong> &gt; <strong>Call Details</strong> console, or call the <a href="https://help.aliyun.com/document_detail/2926853.html">QueryAiCallDetailPage</a> operation to obtain the task detail ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9662*************</p>
     */
    @NameInMap("DetailId")
    public String detailId;

    /**
     * <p>The external business serial number reserved for external input. You can use a unique ID for business association.</p>
     * 
     * <strong>example:</strong>
     * <p>123******</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The task ID. View the task ID in the <strong>Call Task Management</strong> console or call the <a href="https://help.aliyun.com/document_detail/2926799.html">QueryAiCallTaskPage</a> operation to obtain the task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>138************</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryConversationDetailInfoNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConversationDetailInfoNewRequest self = new QueryConversationDetailInfoNewRequest();
        return TeaModel.build(map, self);
    }

    public QueryConversationDetailInfoNewRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public QueryConversationDetailInfoNewRequest setDetailId(String detailId) {
        this.detailId = detailId;
        return this;
    }
    public String getDetailId() {
        return this.detailId;
    }

    public QueryConversationDetailInfoNewRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public QueryConversationDetailInfoNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryConversationDetailInfoNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryConversationDetailInfoNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryConversationDetailInfoNewRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}

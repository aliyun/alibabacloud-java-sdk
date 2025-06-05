// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryConversationDetailInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231321231****</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231321231****</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1231321231****</p>
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

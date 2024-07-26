// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dybaseapi20170525.models;

import com.aliyun.tea.*;

public class QueryTokenForMnsQueueRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryTokenForMnsQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenForMnsQueueRequest self = new QueryTokenForMnsQueueRequest();
        return TeaModel.build(map, self);
    }

    public QueryTokenForMnsQueueRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public QueryTokenForMnsQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTokenForMnsQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public QueryTokenForMnsQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTokenForMnsQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

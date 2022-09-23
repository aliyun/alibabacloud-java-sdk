// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateMessageQueueRequest extends TeaModel {
    @NameInMap("BillIds")
    public String billIds;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("QueueTitle")
    public String queueTitle;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateMessageQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageQueueRequest self = new CreateMessageQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateMessageQueueRequest setBillIds(String billIds) {
        this.billIds = billIds;
        return this;
    }
    public String getBillIds() {
        return this.billIds;
    }

    public CreateMessageQueueRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateMessageQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMessageQueueRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateMessageQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public CreateMessageQueueRequest setQueueTitle(String queueTitle) {
        this.queueTitle = queueTitle;
        return this;
    }
    public String getQueueTitle() {
        return this.queueTitle;
    }

    public CreateMessageQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMessageQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

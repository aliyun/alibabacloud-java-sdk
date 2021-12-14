// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Delete400QualificationRequest extends TeaModel {
    @NameInMap("OrderIds")
    public String orderIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static Delete400QualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        Delete400QualificationRequest self = new Delete400QualificationRequest();
        return TeaModel.build(map, self);
    }

    public Delete400QualificationRequest setOrderIds(String orderIds) {
        this.orderIds = orderIds;
        return this;
    }
    public String getOrderIds() {
        return this.orderIds;
    }

    public Delete400QualificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public Delete400QualificationRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public Delete400QualificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public Delete400QualificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

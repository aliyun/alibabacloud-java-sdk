// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CancelPickUpWaybillRequest extends TeaModel {
    /**
     * <p>The cancellation reason.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CancelDesc")
    public String cancelDesc;

    /**
     * <p>The ID of the external order.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OuterOrderCode")
    public String outerOrderCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CancelPickUpWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPickUpWaybillRequest self = new CancelPickUpWaybillRequest();
        return TeaModel.build(map, self);
    }

    public CancelPickUpWaybillRequest setCancelDesc(String cancelDesc) {
        this.cancelDesc = cancelDesc;
        return this;
    }
    public String getCancelDesc() {
        return this.cancelDesc;
    }

    public CancelPickUpWaybillRequest setOuterOrderCode(String outerOrderCode) {
        this.outerOrderCode = outerOrderCode;
        return this;
    }
    public String getOuterOrderCode() {
        return this.outerOrderCode;
    }

    public CancelPickUpWaybillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelPickUpWaybillRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelPickUpWaybillRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

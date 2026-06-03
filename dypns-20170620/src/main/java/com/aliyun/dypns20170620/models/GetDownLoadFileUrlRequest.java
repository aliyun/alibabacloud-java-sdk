// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetDownLoadFileUrlRequest extends TeaModel {
    @NameInMap("AcctId")
    public Long acctId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetDownLoadFileUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownLoadFileUrlRequest self = new GetDownLoadFileUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDownLoadFileUrlRequest setAcctId(Long acctId) {
        this.acctId = acctId;
        return this;
    }
    public Long getAcctId() {
        return this.acctId;
    }

    public GetDownLoadFileUrlRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetDownLoadFileUrlRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDownLoadFileUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetDownLoadFileUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetDownLoadFileUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

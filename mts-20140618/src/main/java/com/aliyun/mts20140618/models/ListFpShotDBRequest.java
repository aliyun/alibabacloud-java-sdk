// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotDBRequest extends TeaModel {
    /**
     * <p>The IDs of the media fingerprint libraries. You can obtain the library IDs from the response parameters of the [CreateFpShotDB](~~170149~~) operation. You can query up to 10 libraries at a time. Separate multiple library IDs with commas (,).</p>
     */
    @NameInMap("FpDBIds")
    public String fpDBIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListFpShotDBRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotDBRequest self = new ListFpShotDBRequest();
        return TeaModel.build(map, self);
    }

    public ListFpShotDBRequest setFpDBIds(String fpDBIds) {
        this.fpDBIds = fpDBIds;
        return this;
    }
    public String getFpDBIds() {
        return this.fpDBIds;
    }

    public ListFpShotDBRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListFpShotDBRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListFpShotDBRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListFpShotDBRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotDBRequest extends TeaModel {
    /**
     * <p>The ID of the media fingerprint library. You can obtain the library ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/170149.html">CreateFpShotDB</a> operation. You can query up to 10 libraries at a time. Separate multiple library IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>2288c6ca184c0e47098a5b665e2a12****,ae687c02fe944327ba9631e50da2****</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class BatchOccupySecretResShrinkRequest extends TeaModel {
    @NameInMap("BatchOccupyList")
    public String batchOccupyListShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static BatchOccupySecretResShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchOccupySecretResShrinkRequest self = new BatchOccupySecretResShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchOccupySecretResShrinkRequest setBatchOccupyListShrink(String batchOccupyListShrink) {
        this.batchOccupyListShrink = batchOccupyListShrink;
        return this;
    }
    public String getBatchOccupyListShrink() {
        return this.batchOccupyListShrink;
    }

    public BatchOccupySecretResShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchOccupySecretResShrinkRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public BatchOccupySecretResShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BatchOccupySecretResShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class SetReceiptUrlRequest extends TeaModel {
    @NameInMap("CdrDrUrl")
    public String cdrDrUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetReceiptUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        SetReceiptUrlRequest self = new SetReceiptUrlRequest();
        return TeaModel.build(map, self);
    }

    public SetReceiptUrlRequest setCdrDrUrl(String cdrDrUrl) {
        this.cdrDrUrl = cdrDrUrl;
        return this;
    }
    public String getCdrDrUrl() {
        return this.cdrDrUrl;
    }

    public SetReceiptUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetReceiptUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetReceiptUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

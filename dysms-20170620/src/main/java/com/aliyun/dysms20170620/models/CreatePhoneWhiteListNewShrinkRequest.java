// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePhoneWhiteListNewShrinkRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Remarks")
    public String remarksShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreatePhoneWhiteListNewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneWhiteListNewShrinkRequest self = new CreatePhoneWhiteListNewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhoneWhiteListNewShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePhoneWhiteListNewShrinkRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public CreatePhoneWhiteListNewShrinkRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreatePhoneWhiteListNewShrinkRequest setRemarksShrink(String remarksShrink) {
        this.remarksShrink = remarksShrink;
        return this;
    }
    public String getRemarksShrink() {
        return this.remarksShrink;
    }

    public CreatePhoneWhiteListNewShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePhoneWhiteListNewShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

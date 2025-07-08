// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePhoneWhiteListNewRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("Remarks")
    public java.util.List<String> remarks;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreatePhoneWhiteListNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneWhiteListNewRequest self = new CreatePhoneWhiteListNewRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhoneWhiteListNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePhoneWhiteListNewRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public CreatePhoneWhiteListNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreatePhoneWhiteListNewRequest setRemarks(java.util.List<String> remarks) {
        this.remarks = remarks;
        return this;
    }
    public java.util.List<String> getRemarks() {
        return this.remarks;
    }

    public CreatePhoneWhiteListNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePhoneWhiteListNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

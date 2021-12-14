// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class DestoryNumberRequest extends TeaModel {
    @NameInMap("Number")
    public String number;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("RealNameInsId")
    public Long realNameInsId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DestoryNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        DestoryNumberRequest self = new DestoryNumberRequest();
        return TeaModel.build(map, self);
    }

    public DestoryNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public DestoryNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DestoryNumberRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public DestoryNumberRequest setRealNameInsId(Long realNameInsId) {
        this.realNameInsId = realNameInsId;
        return this;
    }
    public Long getRealNameInsId() {
        return this.realNameInsId;
    }

    public DestoryNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DestoryNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

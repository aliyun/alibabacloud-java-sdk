// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class ListSmsSignRequest extends TeaModel {
    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("QuerySmsSign")
    public String querySmsSign;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSmsSignRequest self = new ListSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public ListSmsSignRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public ListSmsSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListSmsSignRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public ListSmsSignRequest setQuerySmsSign(String querySmsSign) {
        this.querySmsSign = querySmsSign;
        return this;
    }
    public String getQuerySmsSign() {
        return this.querySmsSign;
    }

    public ListSmsSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListSmsSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSendFailDetailsUrlNewRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ProdId")
    public String prodId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SendDate")
    public String sendDate;

    public static QuerySmsSendFailDetailsUrlNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSendFailDetailsUrlNewRequest self = new QuerySmsSendFailDetailsUrlNewRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmsSendFailDetailsUrlNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmsSendFailDetailsUrlNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QuerySmsSendFailDetailsUrlNewRequest setProdId(String prodId) {
        this.prodId = prodId;
        return this;
    }
    public String getProdId() {
        return this.prodId;
    }

    public QuerySmsSendFailDetailsUrlNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmsSendFailDetailsUrlNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySmsSendFailDetailsUrlNewRequest setSendDate(String sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    public String getSendDate() {
        return this.sendDate;
    }

}

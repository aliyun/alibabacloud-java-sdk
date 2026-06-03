// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryGateVerifyBillingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthenticationType")
    public Integer authenticationType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Month")
    public String month;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryGateVerifyBillingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyBillingRequest self = new QueryGateVerifyBillingRequest();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyBillingRequest setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    public QueryGateVerifyBillingRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public QueryGateVerifyBillingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryGateVerifyBillingRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryGateVerifyBillingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryGateVerifyBillingRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

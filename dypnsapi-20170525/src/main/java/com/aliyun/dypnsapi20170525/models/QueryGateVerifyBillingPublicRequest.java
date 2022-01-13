// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QueryGateVerifyBillingPublicRequest extends TeaModel {
    @NameInMap("AuthenticationType")
    public Integer authenticationType;

    @NameInMap("Month")
    public String month;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static QueryGateVerifyBillingPublicRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGateVerifyBillingPublicRequest self = new QueryGateVerifyBillingPublicRequest();
        return TeaModel.build(map, self);
    }

    public QueryGateVerifyBillingPublicRequest setAuthenticationType(Integer authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    public QueryGateVerifyBillingPublicRequest setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public QueryGateVerifyBillingPublicRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryGateVerifyBillingPublicRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

}

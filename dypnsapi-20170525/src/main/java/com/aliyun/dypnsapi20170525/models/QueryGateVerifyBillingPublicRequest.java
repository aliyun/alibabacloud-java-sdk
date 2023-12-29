// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class QueryGateVerifyBillingPublicRequest extends TeaModel {
    /**
     * <p>The verification method. Valid values:</p>
     * <br>
     * <p>*   **0**: phone number verification</p>
     * <p>*   **1**: one-click logon</p>
     * <p>*   **2**: all</p>
     * <p>*   **3**: facial recognition</p>
     * <p>*   **4**: SMS verification</p>
     */
    @NameInMap("AuthenticationType")
    public Integer authenticationType;

    /**
     * <p>The month in which the bill is generated. Specify this parameter in the YYYYMM format. Example: 202111.</p>
     */
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

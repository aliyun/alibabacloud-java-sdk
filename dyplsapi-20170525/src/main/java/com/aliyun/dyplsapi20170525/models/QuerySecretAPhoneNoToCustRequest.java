// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretAPhoneNoToCustRequest extends TeaModel {
    /**
     * <p>号码组ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("ANoWhiteGroupId")
    public Long ANoWhiteGroupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A号码</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130*****8888</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QuerySecretAPhoneNoToCustRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretAPhoneNoToCustRequest self = new QuerySecretAPhoneNoToCustRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecretAPhoneNoToCustRequest setANoWhiteGroupId(Long ANoWhiteGroupId) {
        this.ANoWhiteGroupId = ANoWhiteGroupId;
        return this;
    }
    public Long getANoWhiteGroupId() {
        return this.ANoWhiteGroupId;
    }

    public QuerySecretAPhoneNoToCustRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySecretAPhoneNoToCustRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public QuerySecretAPhoneNoToCustRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySecretAPhoneNoToCustRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

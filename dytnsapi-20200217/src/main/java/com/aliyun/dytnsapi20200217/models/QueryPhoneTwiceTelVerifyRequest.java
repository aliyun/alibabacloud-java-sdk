// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPhoneTwiceTelVerifyRequest extends TeaModel {
    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("InputNumber")
    public String inputNumber;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryPhoneTwiceTelVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneTwiceTelVerifyRequest self = new QueryPhoneTwiceTelVerifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryPhoneTwiceTelVerifyRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public QueryPhoneTwiceTelVerifyRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public QueryPhoneTwiceTelVerifyRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public QueryPhoneTwiceTelVerifyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryPhoneTwiceTelVerifyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryPhoneTwiceTelVerifyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryPhoneTwiceTelVerifyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("NumberType")
    public Long numberType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Rate")
    public Long rate;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribePhoneNumberAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisRequest self = new DescribePhoneNumberAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberAnalysisRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneNumberAnalysisRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneNumberAnalysisRequest setNumberType(Long numberType) {
        this.numberType = numberType;
        return this;
    }
    public Long getNumberType() {
        return this.numberType;
    }

    public DescribePhoneNumberAnalysisRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneNumberAnalysisRequest setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public DescribePhoneNumberAnalysisRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneNumberAnalysisRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeRequest extends TeaModel {
    @NameInMap("AuthCode")
    public String authCode;

    @NameInMap("ExtendFunction")
    public String extendFunction;

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

    public static DescribePhoneNumberOperatorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeRequest self = new DescribePhoneNumberOperatorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberOperatorAttributeRequest setExtendFunction(String extendFunction) {
        this.extendFunction = extendFunction;
        return this;
    }
    public String getExtendFunction() {
        return this.extendFunction;
    }

    public DescribePhoneNumberOperatorAttributeRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneNumberOperatorAttributeRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneNumberOperatorAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneNumberOperatorAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneNumberOperatorAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

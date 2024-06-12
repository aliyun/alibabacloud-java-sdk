// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneTwiceTelVerifyRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <br>
     * <p>>  On the **My Applications** page in the [Cell Phone Number Service console](https://dytns.console.aliyun.com/analysis/apply), you can obtain the authorization code (also known as authorization ID).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The phone number to be queried.</p>
     * <br>
     * <p>*   If the value of Mask is NORMAL, specify an 11-digit phone number in plaintext.</p>
     * <p>*   If the value of Mask is MD5, specify a 32-bit string that is encrypted by using MD5.</p>
     * <p>*   If the value of Mask is SHA256, specify a 64-bit string that is encrypted by using SHA256.</p>
     * <br>
     * <p>>  Letters in the encrypted strings are not case-sensitive.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method of the phone number. Valid values:</p>
     * <br>
     * <p>*   **NORMAL**: The phone number is not encrypted.</p>
     * <p>*   **MD5**</p>
     * <p>*   **SHA256**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mask")
    public String mask;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The registration time. Specify the time in the yyyy-MM-dd HH:mm:ss format. This time is the service registration time of the mobile phone user. If the service registration time is later than the time when the phone number is assigned by a carrier, it indicates that the phone number is not a reassigned number. Otherwise, the phone number is a reassigned number.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If a carrier allocates a single number multiple times, the system will determine whether the phone number is a reassigned number based on the time when the carrier last allocated the phone number.</p>
     * <br>
     * <p>*   The service registration time must be later than 00:00:00 on January 1, 1970.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePhoneTwiceTelVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneTwiceTelVerifyRequest self = new DescribePhoneTwiceTelVerifyRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneTwiceTelVerifyRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneTwiceTelVerifyRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneTwiceTelVerifyRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneTwiceTelVerifyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneTwiceTelVerifyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneTwiceTelVerifyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePhoneTwiceTelVerifyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}

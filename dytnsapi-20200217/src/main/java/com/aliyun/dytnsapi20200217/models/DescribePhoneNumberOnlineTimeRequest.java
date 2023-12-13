// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOnlineTimeRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <br>
     * <p>>  On the **My Applications** page in the [Cell Phone Number Service console](https://dytns.console.aliyun.com/analysis/apply), you can obtain the authorization code (also known as authorization ID).</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The carrier. Valid values:</p>
     * <br>
     * <p>*   **MOBILE**: China Mobile</p>
     * <p>*   **UNICOM**: China Unicom</p>
     * <p>*   **TELECOM**: China Telecom</p>
     * <br>
     * <p>>  Alibaba Cloud automatically determines the carrier based on the carrier who assigns the phone number. Therefore, the value of this field does not affect the query result.</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>The phone number to be queried.</p>
     * <br>
     * <p>*   If the value of Mask is NORMAL, specify an 11-digit phone number in plaintext.</p>
     * <p>*   If the value of Mask is MD5, specify a 32-bit string that is encrypted by using MD5.</p>
     * <p>*   If the value of Mask is SHA256, specify a 64-bit string that is encrypted by using SHA256.</p>
     * <br>
     * <p>>  Letters in the encrypted strings are not case-sensitive.</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>The encryption method of the phone number. Valid values:</p>
     * <br>
     * <p>*   **NORMAL**: The phone number is not encrypted.</p>
     * <p>*   **MD5**</p>
     * <p>*   **SHA256**</p>
     */
    @NameInMap("Mask")
    public String mask;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribePhoneNumberOnlineTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOnlineTimeRequest self = new DescribePhoneNumberOnlineTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOnlineTimeRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public DescribePhoneNumberOnlineTimeRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public DescribePhoneNumberOnlineTimeRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public DescribePhoneNumberOnlineTimeRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public DescribePhoneNumberOnlineTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhoneNumberOnlineTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhoneNumberOnlineTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

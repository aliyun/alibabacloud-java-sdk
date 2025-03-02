// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetPhoneNumberIdentificationUrlRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>K***9i7CIe</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The IP address of the subscriber\&quot;s phone.</p>
     * 
     * <strong>example:</strong>
     * <p>114.124.***.13</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The external ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>149b03d2-a749-4e6e-8f5b-34******5815</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number of the subscriber. The phone number is in the Mobile Station International Subscriber Directory Number (MSISDN) format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>628211****113</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>Specifies whether to remember the phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RememberPhoneNumber")
    public Boolean rememberPhoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetPhoneNumberIdentificationUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberIdentificationUrlRequest self = new GetPhoneNumberIdentificationUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberIdentificationUrlRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public GetPhoneNumberIdentificationUrlRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetPhoneNumberIdentificationUrlRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public GetPhoneNumberIdentificationUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetPhoneNumberIdentificationUrlRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetPhoneNumberIdentificationUrlRequest setRememberPhoneNumber(Boolean rememberPhoneNumber) {
        this.rememberPhoneNumber = rememberPhoneNumber;
        return this;
    }
    public Boolean getRememberPhoneNumber() {
        return this.rememberPhoneNumber;
    }

    public GetPhoneNumberIdentificationUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetPhoneNumberIdentificationUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

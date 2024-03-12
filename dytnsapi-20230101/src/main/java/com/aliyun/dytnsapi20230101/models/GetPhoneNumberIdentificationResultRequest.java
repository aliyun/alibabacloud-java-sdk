// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetPhoneNumberIdentificationResultRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The external ID.</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number of the subscriber. The phone number to be verified must be in the Mobile Station International Subscriber Directory Number (MSISDN) format.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The session ID.</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The session payload.</p>
     */
    @NameInMap("SessionPayload")
    public String sessionPayload;

    public static GetPhoneNumberIdentificationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberIdentificationResultRequest self = new GetPhoneNumberIdentificationResultRequest();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberIdentificationResultRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public GetPhoneNumberIdentificationResultRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public GetPhoneNumberIdentificationResultRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetPhoneNumberIdentificationResultRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetPhoneNumberIdentificationResultRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetPhoneNumberIdentificationResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetPhoneNumberIdentificationResultRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetPhoneNumberIdentificationResultRequest setSessionPayload(String sessionPayload) {
        this.sessionPayload = sessionPayload;
        return this;
    }
    public String getSessionPayload() {
        return this.sessionPayload;
    }

}

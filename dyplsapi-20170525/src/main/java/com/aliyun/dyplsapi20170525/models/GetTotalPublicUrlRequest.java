// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlRequest extends TeaModel {
    /**
     * <p>The ID of the call record.</p>
     * <br>
     * <p>Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view **Call Record ID** on the **Call Record Query** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The call initiation time in the call record.</p>
     * <br>
     * <p>Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account). View **Call Initiated At** on the **Call Record Query** page, or view the call_time field in the Call Detail Record (CDR) receipt.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallTime")
    public String callTime;

    /**
     * <p>Specifies whether the verification on the binding ID is required.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckSubs")
    public Boolean checkSubs;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PartnerKey")
    public String partnerKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetTotalPublicUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTotalPublicUrlRequest self = new GetTotalPublicUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetTotalPublicUrlRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public GetTotalPublicUrlRequest setCallTime(String callTime) {
        this.callTime = callTime;
        return this;
    }
    public String getCallTime() {
        return this.callTime;
    }

    public GetTotalPublicUrlRequest setCheckSubs(Boolean checkSubs) {
        this.checkSubs = checkSubs;
        return this;
    }
    public Boolean getCheckSubs() {
        return this.checkSubs;
    }

    public GetTotalPublicUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetTotalPublicUrlRequest setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey;
        return this;
    }
    public String getPartnerKey() {
        return this.partnerKey;
    }

    public GetTotalPublicUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetTotalPublicUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

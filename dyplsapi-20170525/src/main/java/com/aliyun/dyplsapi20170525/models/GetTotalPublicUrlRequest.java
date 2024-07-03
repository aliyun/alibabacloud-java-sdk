// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlRequest extends TeaModel {
    /**
     * <p>The ID of the call record.</p>
     * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view <strong>Call Record ID</strong> on the <strong>Call Record Query</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2568900****</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The call initiation time in the call record.</p>
     * <p>Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a>. View <strong>Call Initiated At</strong> on the <strong>Call Record Query</strong> page, or view the call_time field in the Call Detail Record (CDR) receipt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-03-05 12:00:00</p>
     */
    @NameInMap("CallTime")
    public String callTime;

    /**
     * <p>Specifies whether the verification on the binding ID is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CheckSubs")
    public Boolean checkSubs;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the phone number pool. Log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> and view the key of the phone number pool on the <strong>Number Pool Management</strong> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC12256****</p>
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

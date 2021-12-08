// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetTotalPublicUrlRequest extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("CallTime")
    public String callTime;

    @NameInMap("CheckSubs")
    public Boolean checkSubs;

    @NameInMap("OwnerId")
    public Long ownerId;

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

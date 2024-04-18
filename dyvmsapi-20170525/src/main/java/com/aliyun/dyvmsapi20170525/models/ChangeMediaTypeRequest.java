// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ChangeMediaTypeRequest extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("CalledNum")
    public String calledNum;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ChangeMediaTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeMediaTypeRequest self = new ChangeMediaTypeRequest();
        return TeaModel.build(map, self);
    }

    public ChangeMediaTypeRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public ChangeMediaTypeRequest setCalledNum(String calledNum) {
        this.calledNum = calledNum;
        return this;
    }
    public String getCalledNum() {
        return this.calledNum;
    }

    public ChangeMediaTypeRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ChangeMediaTypeRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public ChangeMediaTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChangeMediaTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ChangeMediaTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

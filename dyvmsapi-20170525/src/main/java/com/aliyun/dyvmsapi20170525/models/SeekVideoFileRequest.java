// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SeekVideoFileRequest extends TeaModel {
    /**
     * <p>呼叫唯一ID</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>被叫号码</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>快进或快退值，负数为快退，单位秒</p>
     */
    @NameInMap("SeekTimes")
    public Long seekTimes;

    public static SeekVideoFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SeekVideoFileRequest self = new SeekVideoFileRequest();
        return TeaModel.build(map, self);
    }

    public SeekVideoFileRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SeekVideoFileRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SeekVideoFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SeekVideoFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SeekVideoFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SeekVideoFileRequest setSeekTimes(Long seekTimes) {
        this.seekTimes = seekTimes;
        return this;
    }
    public Long getSeekTimes() {
        return this.seekTimes;
    }

}

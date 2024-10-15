// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class PlayVideoFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>116012354148^1028137841****</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyPhone")
    public Boolean onlyPhone;

    /**
     * <strong>example:</strong>
     * <p>342268*****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static PlayVideoFileRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayVideoFileRequest self = new PlayVideoFileRequest();
        return TeaModel.build(map, self);
    }

    public PlayVideoFileRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public PlayVideoFileRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public PlayVideoFileRequest setOnlyPhone(Boolean onlyPhone) {
        this.onlyPhone = onlyPhone;
        return this;
    }
    public Boolean getOnlyPhone() {
        return this.onlyPhone;
    }

    public PlayVideoFileRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public PlayVideoFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PlayVideoFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PlayVideoFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PlayVideoFileRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}

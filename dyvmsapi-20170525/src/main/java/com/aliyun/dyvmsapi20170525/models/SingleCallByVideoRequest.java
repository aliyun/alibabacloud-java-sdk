// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVideoRequest extends TeaModel {
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlayTimes")
    public Integer playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Speed")
    public Integer speed;

    @NameInMap("VideoCode")
    public String videoCode;

    @NameInMap("VoiceCode")
    public String voiceCode;

    @NameInMap("Volume")
    public Integer volume;

    public static SingleCallByVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVideoRequest self = new SingleCallByVideoRequest();
        return TeaModel.build(map, self);
    }

    public SingleCallByVideoRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SingleCallByVideoRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public SingleCallByVideoRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SingleCallByVideoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleCallByVideoRequest setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    public SingleCallByVideoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleCallByVideoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleCallByVideoRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public SingleCallByVideoRequest setVideoCode(String videoCode) {
        this.videoCode = videoCode;
        return this;
    }
    public String getVideoCode() {
        return this.videoCode;
    }

    public SingleCallByVideoRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public SingleCallByVideoRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}

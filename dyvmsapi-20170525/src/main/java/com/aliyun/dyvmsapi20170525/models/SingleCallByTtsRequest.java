// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByTtsRequest extends TeaModel {
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

    @NameInMap("TtsCode")
    public String ttsCode;

    @NameInMap("TtsParam")
    public String ttsParam;

    @NameInMap("Volume")
    public Integer volume;

    public static SingleCallByTtsRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByTtsRequest self = new SingleCallByTtsRequest();
        return TeaModel.build(map, self);
    }

    public SingleCallByTtsRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SingleCallByTtsRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public SingleCallByTtsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SingleCallByTtsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleCallByTtsRequest setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    public SingleCallByTtsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleCallByTtsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleCallByTtsRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public SingleCallByTtsRequest setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
        return this;
    }
    public String getTtsCode() {
        return this.ttsCode;
    }

    public SingleCallByTtsRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public SingleCallByTtsRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallSignalRequest extends TeaModel {
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallerIdNumber")
    public String callerIdNumber;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Speed")
    public Long speed;

    @NameInMap("TtsCode")
    public String ttsCode;

    @NameInMap("TtsParam")
    public String ttsParam;

    @NameInMap("Volume")
    public Long volume;

    public static BackendCallSignalRequest build(java.util.Map<String, ?> map) throws Exception {
        BackendCallSignalRequest self = new BackendCallSignalRequest();
        return TeaModel.build(map, self);
    }

    public BackendCallSignalRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public BackendCallSignalRequest setCallerIdNumber(String callerIdNumber) {
        this.callerIdNumber = callerIdNumber;
        return this;
    }
    public String getCallerIdNumber() {
        return this.callerIdNumber;
    }

    public BackendCallSignalRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public BackendCallSignalRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BackendCallSignalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BackendCallSignalRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public BackendCallSignalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BackendCallSignalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BackendCallSignalRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public BackendCallSignalRequest setTtsCode(String ttsCode) {
        this.ttsCode = ttsCode;
        return this;
    }
    public String getTtsCode() {
        return this.ttsCode;
    }

    public BackendCallSignalRequest setTtsParam(String ttsParam) {
        this.ttsParam = ttsParam;
        return this;
    }
    public String getTtsParam() {
        return this.ttsParam;
    }

    public BackendCallSignalRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

}

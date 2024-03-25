// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class BackendCallSignalRequest extends TeaModel {
    /**
     * <p>The phone number that receives the voice notification.</p>
     * <br>
     * <p>You must add the country code to the beginning of the phone number. Example: 85200\*\*\*\*00.</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The calling number.</p>
     * <br>
     * <p>If you do not specify this parameter, the system uses a local random number as the display number. If you use a dedicated number for outbound calls, you must specify the purchased number. You can specify only one number. You can log on to the VMS console and choose Number Management to view the purchased phone numbers.</p>
     */
    @NameInMap("CallerIdNumber")
    public String callerIdNumber;

    /**
     * <p>The ISO2 country code.</p>
     */
    @NameInMap("CountryId")
    public String countryId;

    /**
     * <p>The ID reserved for the caller. This ID is returned to the caller in a receipt message.</p>
     * <br>
     * <p>The value must be of the STRING type and 1 to 15 bytes in length.</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of times the voice notification is played back in a call. Valid values: 1 to 3. Default value: 3.</p>
     */
    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The playback speed. Valid values: -500 to 500.</p>
     */
    @NameInMap("Speed")
    public Long speed;

    /**
     * <p>The ID of the approved voice verification code template.</p>
     * <br>
     * <p>You can log on to the VMS console and choose Voice Call Template to view the template ID.</p>
     */
    @NameInMap("TtsCode")
    public String ttsCode;

    /**
     * <p>The variables in the template, in the JSON format.</p>
     */
    @NameInMap("TtsParam")
    public String ttsParam;

    /**
     * <p>The playback volume of the voice notification. Valid values: 0 to 100. Default value: 100.</p>
     */
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

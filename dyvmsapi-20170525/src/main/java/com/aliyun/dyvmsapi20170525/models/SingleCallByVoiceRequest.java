// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVoiceRequest extends TeaModel {
    /**
     * <p>The number for receiving voice notifications.</p>
     * <br>
     * <p>Number format:</p>
     * <br>
     * <p>*   In the Chinese mainland:</p>
     * <br>
     * <p>    *   Mobile phone number, for example, 159\*\*\*\*0000.</p>
     * <p>    *   Landline number, for example, 0571\*\*\*\*5678.</p>
     * <br>
     * <p>*   Outside the Chinese mainland: country code + phone number, for example, 85200\*\*\*\*00.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can specify only one called number for a request. For more information, see [How to use voice notifications in the Chinese mainland](~~150016~~) or [How to use voice notifications in regions outside the Chinese mainland](~~268810~~).</p>
     * <br>
     * <p>*   Voice notifications are sent to a called number at the following frequency: one time per minute, five times per hour, and 20 times per 24 hours.</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The number displayed to the called party.</p>
     * <br>
     * <p>*   You do not need to specify this parameter if you use a voice notification file that uses the common outbound call mode. For more information, see [FAQ about the common outbound call mode](~~172104~~).</p>
     * <p>*   If you use a voice notification file that uses the dedicated outbound call mode, you must specify a number that you purchased. You can specify only one number. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and choose **Real Number Service** > **Real Number Management** to view the number that you purchased.</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

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
     * <p>The number of times the voice notification file is played. Valid values: 1 to 3.</p>
     */
    @NameInMap("PlayTimes")
    public Integer playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The playback speed of the voice notification file. Valid values: -500 to 500.</p>
     */
    @NameInMap("Speed")
    public Integer speed;

    /**
     * <p>The voice ID of the voice notification file.</p>
     * <br>
     * <p>You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications** or **Voice File Management**, and then click the **Voice Notification Files** tab to view the **voice ID**.</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>The playback volume of the voice notification file. Valid values: 0 to 100. Default value: 100.</p>
     */
    @NameInMap("Volume")
    public Integer volume;

    public static SingleCallByVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVoiceRequest self = new SingleCallByVoiceRequest();
        return TeaModel.build(map, self);
    }

    public SingleCallByVoiceRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public SingleCallByVoiceRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public SingleCallByVoiceRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SingleCallByVoiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SingleCallByVoiceRequest setPlayTimes(Integer playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Integer getPlayTimes() {
        return this.playTimes;
    }

    public SingleCallByVoiceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SingleCallByVoiceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SingleCallByVoiceRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

    public SingleCallByVoiceRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public SingleCallByVoiceRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}

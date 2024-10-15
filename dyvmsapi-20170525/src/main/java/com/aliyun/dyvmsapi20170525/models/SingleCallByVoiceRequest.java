// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVoiceRequest extends TeaModel {
    /**
     * <p>The number for receiving voice notifications.</p>
     * <p>Number format:</p>
     * <ul>
     * <li><p>In the Chinese mainland:</p>
     * <ul>
     * <li>Mobile phone number, for example, 159\<em>\</em>\*\*0000.</li>
     * <li>Landline number, for example, 0571\<em>\</em>\*\*5678.</li>
     * </ul>
     * </li>
     * <li><p>Outside the Chinese mainland: country code + phone number, for example, 85200\<em>\</em>\*\*00.</p>
     * </li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can specify only one called number for a request. For more information, see <a href="https://help.aliyun.com/document_detail/150016.html">How to use voice notifications in the Chinese mainland</a> or <a href="https://help.aliyun.com/document_detail/268810.html">How to use voice notifications in regions outside the Chinese mainland</a>.</p>
     * </li>
     * <li><p>Voice notifications are sent to a called number at the following frequency: one time per minute, five times per hour, and 20 times per 24 hours.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1590****000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The number displayed to the called party.</p>
     * <ul>
     * <li>You do not need to specify this parameter if you use a voice notification file that uses the common outbound call mode. For more information, see <a href="https://help.aliyun.com/document_detail/172104.html">FAQ about the common outbound call mode</a>.</li>
     * <li>If you use a voice notification file that uses the dedicated outbound call mode, you must specify a number that you purchased. You can specify only one number. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Real Number Service</strong> &gt; <strong>Real Number Management</strong> to view the number that you purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0571****5678</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>The ID reserved for the caller. This ID is returned to the caller in a receipt message.</p>
     * <p>The value must be of the STRING type and 1 to 15 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>22596****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of times the voice notification file is played. Valid values: 1 to 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PlayTimes")
    public Integer playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The playback speed of the voice notification file. Valid values: -500 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Speed")
    public Integer speed;

    /**
     * <p>The voice ID of the voice notification file.</p>
     * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong> or <strong>Voice File Management</strong>, and then click the <strong>Voice Notification Files</strong> tab to view the <strong>voice ID</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2d4c-4e78-8d2a-afbb06cf****.wav</p>
     */
    @NameInMap("VoiceCode")
    public String voiceCode;

    /**
     * <p>The playback volume of the voice notification file. Valid values: 0 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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

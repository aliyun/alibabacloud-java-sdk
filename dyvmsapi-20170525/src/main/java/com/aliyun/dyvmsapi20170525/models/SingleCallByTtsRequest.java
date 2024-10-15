// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByTtsRequest extends TeaModel {
    /**
     * <p>The mobile phone number that receives voice notifications.</p>
     * <ul>
     * <li><p>Number format in the Chinese mainland:</p>
     * <ul>
     * <li>Mobile phone number, for example, 159\<em>\</em>\*\*0000.</li>
     * <li>Landline number, for example, 0571\<em>\</em>\*\*5678.</li>
     * </ul>
     * </li>
     * <li><p>Number format outside the Chinese mainland: country code + phone number, for example, 85200\<em>\</em>\*\*00.</p>
     * </li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Each request supports only one called number. For more information, see <a href="https://help.aliyun.com/document_detail/150016.html">How to use voice notifications in the Chinese mainland</a> or <a href="https://help.aliyun.com/document_detail/270044.html">How to use voice verification codes in regions outside the Chinese mainland</a>.</p>
     * </li>
     * <li><p>Voice verification codes are sent to a called number at the following frequency: one time per minute, five times per hour, and 20 times per 24 hours.</p>
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
     * <li>You do not need to specify this parameter if you use the text-to-speech (TTS) notification template or voice verification code template for outbound calls in the common mode. For more information, see <a href="https://help.aliyun.com/document_detail/172104.html">FAQ about the common outbound call mode</a>.</li>
     * <li>If you use the TTS notification template or voice verification code template for outbound calls in the dedicated mode, you must specify a number you purchased and only one number can be specified. You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a> and choose <strong>Voice Numbers</strong> &gt; <strong>Real Number Management</strong> to view the number you purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0571****5678</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>The custom ID that is reserved for the caller of the operation when the request is initiated. This ID is returned to the caller in a receipt message.</p>
     * <p>The value is of the STRING type and must be 1 to 15 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>225869*****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of times a voice notification is played back in a call. Valid values: 1 to 3. Default value: 3.</p>
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
     * <p>The playback speed. Valid value: -500 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Speed")
    public Integer speed;

    /**
     * <p>The ID of the approved TTS notification template or voice verification code template.</p>
     * <p>You can log on to the <a href="https://dyvms.console.aliyun.com/overview/home">Voice Messaging Service console</a>, and choose <strong>Voice Messages</strong> &gt; <strong>Voice Verification Codes</strong> or choose <strong>Voice Messages</strong> &gt; <strong>Voice Notifications</strong> to view the <strong>template ID</strong>.</p>
     * <blockquote>
     * <p>The account to which the TTS template belongs must be the same as the account that is used to call the SingleCallByTts operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TTS_100****</p>
     */
    @NameInMap("TtsCode")
    public String ttsCode;

    /**
     * <p>The variables in the template, in the JSON format.</p>
     * <blockquote>
     * <p>The variables in the template must be less than 250 characters in length. The length of each single variable is not limited. These variables do not support URLs. The variables in the verification code template support only digits and letters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AckNum&quot;:&quot;123456&quot;}</p>
     */
    @NameInMap("TtsParam")
    public String ttsParam;

    /**
     * <p>The playback volume of the voice notification. Valid values: 0 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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

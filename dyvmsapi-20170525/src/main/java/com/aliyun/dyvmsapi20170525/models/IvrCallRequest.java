// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class IvrCallRequest extends TeaModel {
    /**
     * <p>The end voice.</p>
     * <br>
     * <p>*   If you use a voice notification file, this parameter specifies the voice ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **Voice Notification Files** tab to view the voice ID.</p>
     * <p>*   If you use a TTS template, this parameter specifies the template ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **TTS Template** tab to view the template ID.</p>
     * <br>
     * <p>> The value of the ByeCode parameter must be of the same type as the value of the StartCode parameter. This means that both parameters must specify voice IDs or TTS template IDs.</p>
     */
    @NameInMap("ByeCode")
    public String byeCode;

    /**
     * <p>The variables in the TTS template, in the JSON format.</p>
     * <br>
     * <p>> This parameter is required when the ByeCode parameter is set to the ID of a TTS template that contains variables.</p>
     */
    @NameInMap("ByeTtsParams")
    public String byeTtsParams;

    /**
     * <p>The called number.</p>
     * <br>
     * <p>Only phone numbers in the Chinese mainland are supported. Each request supports only one called number.</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The calling number.</p>
     * <br>
     * <p>The value must be a number you purchased. Each request supports only one calling number. In most cases, a calling number is configured with the maximum number of concurrent requests. New requests fail if the maximum number of concurrent requests is reached. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home) and choose **Real Number Service > Real Number Management** to view the number you purchased.</p>
     */
    @NameInMap("CalledShowNumber")
    public String calledShowNumber;

    /**
     * <p>The information about the key pressed by the subscriber.</p>
     */
    @NameInMap("MenuKeyMap")
    public java.util.List<IvrCallRequestMenuKeyMap> menuKeyMap;

    /**
     * <p>The ID that is reserved for the caller of the operation. This ID is returned to the caller in a receipt message.</p>
     * <br>
     * <p>The value is of the STRING type and must be 1 to 15 bytes in length.</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of replay times. Valid values: 1 to 3.</p>
     */
    @NameInMap("PlayTimes")
    public Long playTimes;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The voice that is played when the call begins.</p>
     * <br>
     * <p>*   If you use a voice notification file, this parameter specifies the voice ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > Voice Notifications, and then click the **Voice Notification Files** tab to view the voice ID.</p>
     * <p>*   If you use a text-to-speech (TTS) template, this parameter specifies the template ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **TTS Template** tab to view the template ID.</p>
     */
    @NameInMap("StartCode")
    public String startCode;

    /**
     * <p>The variables in the TTS template, in the JSON format.</p>
     * <br>
     * <p>> This parameter is required when the StartCode parameter is set to the ID of a TTS template that contains variables.</p>
     */
    @NameInMap("StartTtsParams")
    public String startTtsParams;

    /**
     * <p>The timeout period for the subscriber to press a key. Unit: milliseconds.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static IvrCallRequest build(java.util.Map<String, ?> map) throws Exception {
        IvrCallRequest self = new IvrCallRequest();
        return TeaModel.build(map, self);
    }

    public IvrCallRequest setByeCode(String byeCode) {
        this.byeCode = byeCode;
        return this;
    }
    public String getByeCode() {
        return this.byeCode;
    }

    public IvrCallRequest setByeTtsParams(String byeTtsParams) {
        this.byeTtsParams = byeTtsParams;
        return this;
    }
    public String getByeTtsParams() {
        return this.byeTtsParams;
    }

    public IvrCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public IvrCallRequest setCalledShowNumber(String calledShowNumber) {
        this.calledShowNumber = calledShowNumber;
        return this;
    }
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    public IvrCallRequest setMenuKeyMap(java.util.List<IvrCallRequestMenuKeyMap> menuKeyMap) {
        this.menuKeyMap = menuKeyMap;
        return this;
    }
    public java.util.List<IvrCallRequestMenuKeyMap> getMenuKeyMap() {
        return this.menuKeyMap;
    }

    public IvrCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public IvrCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public IvrCallRequest setPlayTimes(Long playTimes) {
        this.playTimes = playTimes;
        return this;
    }
    public Long getPlayTimes() {
        return this.playTimes;
    }

    public IvrCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public IvrCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public IvrCallRequest setStartCode(String startCode) {
        this.startCode = startCode;
        return this;
    }
    public String getStartCode() {
        return this.startCode;
    }

    public IvrCallRequest setStartTtsParams(String startTtsParams) {
        this.startTtsParams = startTtsParams;
        return this;
    }
    public String getStartTtsParams() {
        return this.startTtsParams;
    }

    public IvrCallRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public static class IvrCallRequestMenuKeyMap extends TeaModel {
        /**
         * <p>The voice that corresponds to the key specified by the **MenuKeyMap.N.Key** parameter.</p>
         * <br>
         * <p>*   If you use a voice notification file, this parameter specifies the voice ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **Voice Notification Files** tab to view the voice ID.</p>
         * <p>*   If you use a TTS template, this parameter specifies the template ID. You can log on to the [Voice Messaging Service console](https://dyvms.console.aliyun.com/overview/home), choose **Voice Messages** > **Voice Notifications**, and then click the **TTS Template** tab to view the template ID.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The key that can be pressed by the subscriber.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The variables in the TTS template, in the JSON format.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   This parameter specifies the substitution relationship of the variables in the TTS template if the value of the **MenuKeyMap.N.Code** parameter is set to the ID of the TTS template.</p>
         * <br>
         * <p>*   This parameter is required if the value of the **MenuKeyMap.N.Code** parameter is set to the ID of a TTS template that contains variables.</p>
         */
        @NameInMap("TtsParams")
        public String ttsParams;

        public static IvrCallRequestMenuKeyMap build(java.util.Map<String, ?> map) throws Exception {
            IvrCallRequestMenuKeyMap self = new IvrCallRequestMenuKeyMap();
            return TeaModel.build(map, self);
        }

        public IvrCallRequestMenuKeyMap setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IvrCallRequestMenuKeyMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public IvrCallRequestMenuKeyMap setTtsParams(String ttsParams) {
            this.ttsParams = ttsParams;
            return this;
        }
        public String getTtsParams() {
            return this.ttsParams;
        }

    }

}

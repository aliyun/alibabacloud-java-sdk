// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAvailableTtsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The personalized voice code. You can view the voice code on the <a href="https://aiccs.console.aliyun.com/engine/voiceprint">Personalized Voices</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>V9A******</p>
     */
    @NameInMap("TtsVoiceCode")
    public String ttsVoiceCode;

    /**
     * <p>The enumeration value of the TTS voice type. Valid values:</p>
     * <ul>
     * <li><code>SYSTEM</code>: system voice.</li>
     * <li><code>COSYCLONE</code>: cloned voice.</li>
     * <li><code>BL-CUSTOM</code>: custom premium cloned voice.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("VoiceType")
    public String voiceType;

    public static ListAvailableTtsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTtsRequest self = new ListAvailableTtsRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableTtsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListAvailableTtsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListAvailableTtsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListAvailableTtsRequest setTtsVoiceCode(String ttsVoiceCode) {
        this.ttsVoiceCode = ttsVoiceCode;
        return this;
    }
    public String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public ListAvailableTtsRequest setVoiceType(String voiceType) {
        this.voiceType = voiceType;
        return this;
    }
    public String getVoiceType() {
        return this.voiceType;
    }

}

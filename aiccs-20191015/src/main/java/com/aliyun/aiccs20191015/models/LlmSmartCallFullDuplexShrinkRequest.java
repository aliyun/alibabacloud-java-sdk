// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallFullDuplexShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app123</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0987654321</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <strong>example:</strong>
     * <p>out123</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("StartWordParam")
    public String startWordParamShrink;

    /**
     * <strong>example:</strong>
     * <p>70</p>
     */
    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    /**
     * <strong>example:</strong>
     * <p>V745A7CED</p>
     */
    @NameInMap("TtsVoiceCode")
    public String ttsVoiceCode;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    public static LlmSmartCallFullDuplexShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallFullDuplexShrinkRequest self = new LlmSmartCallFullDuplexShrinkRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallFullDuplexShrinkRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallFullDuplexShrinkRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public LlmSmartCallFullDuplexShrinkRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallFullDuplexShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallFullDuplexShrinkRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public LlmSmartCallFullDuplexShrinkRequest setStartWordParamShrink(String startWordParamShrink) {
        this.startWordParamShrink = startWordParamShrink;
        return this;
    }
    public String getStartWordParamShrink() {
        return this.startWordParamShrink;
    }

    public LlmSmartCallFullDuplexShrinkRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public LlmSmartCallFullDuplexShrinkRequest setTtsVoiceCode(String ttsVoiceCode) {
        this.ttsVoiceCode = ttsVoiceCode;
        return this;
    }
    public String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public LlmSmartCallFullDuplexShrinkRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

}

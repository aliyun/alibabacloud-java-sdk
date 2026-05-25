// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallFullDuplexRequest extends TeaModel {
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
    public java.util.Map<String, ?> startWordParam;

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

    public static LlmSmartCallFullDuplexRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallFullDuplexRequest self = new LlmSmartCallFullDuplexRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallFullDuplexRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallFullDuplexRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public LlmSmartCallFullDuplexRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallFullDuplexRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallFullDuplexRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public LlmSmartCallFullDuplexRequest setStartWordParam(java.util.Map<String, ?> startWordParam) {
        this.startWordParam = startWordParam;
        return this;
    }
    public java.util.Map<String, ?> getStartWordParam() {
        return this.startWordParam;
    }

    public LlmSmartCallFullDuplexRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public LlmSmartCallFullDuplexRequest setTtsVoiceCode(String ttsVoiceCode) {
        this.ttsVoiceCode = ttsVoiceCode;
        return this;
    }
    public String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public LlmSmartCallFullDuplexRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

}

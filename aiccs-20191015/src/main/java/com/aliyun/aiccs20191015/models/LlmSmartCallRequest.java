// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class LlmSmartCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>F32XXX2CF9</p>
     */
    @NameInMap("ApplicationCode")
    public String applicationCode;

    @NameInMap("BizParam")
    public java.util.Map<String, ?> bizParam;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>137****0000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>057188040000</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    @NameInMap("CustomerLineCode")
    public String customerLineCode;

    @NameInMap("Extension")
    public String extension;

    /**
     * <strong>example:</strong>
     * <p>222356****</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("PromptParam")
    public java.util.Map<String, ?> promptParam;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("StartWordParam")
    public java.util.Map<String, ?> startWordParam;

    @NameInMap("TtsSpeed")
    public Integer ttsSpeed;

    @NameInMap("TtsVoiceCode")
    public String ttsVoiceCode;

    @NameInMap("TtsVolume")
    public Integer ttsVolume;

    public static LlmSmartCallRequest build(java.util.Map<String, ?> map) throws Exception {
        LlmSmartCallRequest self = new LlmSmartCallRequest();
        return TeaModel.build(map, self);
    }

    public LlmSmartCallRequest setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
        return this;
    }
    public String getApplicationCode() {
        return this.applicationCode;
    }

    public LlmSmartCallRequest setBizParam(java.util.Map<String, ?> bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public java.util.Map<String, ?> getBizParam() {
        return this.bizParam;
    }

    public LlmSmartCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public LlmSmartCallRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public LlmSmartCallRequest setCustomerLineCode(String customerLineCode) {
        this.customerLineCode = customerLineCode;
        return this;
    }
    public String getCustomerLineCode() {
        return this.customerLineCode;
    }

    public LlmSmartCallRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public LlmSmartCallRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public LlmSmartCallRequest setPromptParam(java.util.Map<String, ?> promptParam) {
        this.promptParam = promptParam;
        return this;
    }
    public java.util.Map<String, ?> getPromptParam() {
        return this.promptParam;
    }

    public LlmSmartCallRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public LlmSmartCallRequest setStartWordParam(java.util.Map<String, ?> startWordParam) {
        this.startWordParam = startWordParam;
        return this;
    }
    public java.util.Map<String, ?> getStartWordParam() {
        return this.startWordParam;
    }

    public LlmSmartCallRequest setTtsSpeed(Integer ttsSpeed) {
        this.ttsSpeed = ttsSpeed;
        return this;
    }
    public Integer getTtsSpeed() {
        return this.ttsSpeed;
    }

    public LlmSmartCallRequest setTtsVoiceCode(String ttsVoiceCode) {
        this.ttsVoiceCode = ttsVoiceCode;
        return this;
    }
    public String getTtsVoiceCode() {
        return this.ttsVoiceCode;
    }

    public LlmSmartCallRequest setTtsVolume(Integer ttsVolume) {
        this.ttsVolume = ttsVolume;
        return this;
    }
    public Integer getTtsVolume() {
        return this.ttsVolume;
    }

}

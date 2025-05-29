// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMTTSChatRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
     */
    @NameInMap("deviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableSearch")
    public Boolean enableSearch;

    /**
     * <strong>example:</strong>
     * <p>.pcm。</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("pitchRate")
    public Integer pitchRate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2oImhCz4f8XCviiM</p>
     */
    @NameInMap("productKey")
    public String productKey;

    @NameInMap("prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>16000</p>
     */
    @NameInMap("sampleRate")
    public Integer sampleRate;

    /**
     * <strong>example:</strong>
     * <p>0sIRZDNncmCfBagzy534x2PH</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("speechRate")
    public Integer speechRate;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>661708759700322</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>wss://nls-gateway-cn-beijing.aliyuncs.com/ws/v1</p>
     */
    @NameInMap("url")
    public String url;

    /**
     * <strong>example:</strong>
     * <p>siyue</p>
     */
    @NameInMap("voice")
    public String voice;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("volume")
    public Integer volume;

    public static HalfLLMTTSChatRequest build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMTTSChatRequest self = new HalfLLMTTSChatRequest();
        return TeaModel.build(map, self);
    }

    public HalfLLMTTSChatRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public HalfLLMTTSChatRequest setEnableSearch(Boolean enableSearch) {
        this.enableSearch = enableSearch;
        return this;
    }
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    public HalfLLMTTSChatRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public HalfLLMTTSChatRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public HalfLLMTTSChatRequest setPitchRate(Integer pitchRate) {
        this.pitchRate = pitchRate;
        return this;
    }
    public Integer getPitchRate() {
        return this.pitchRate;
    }

    public HalfLLMTTSChatRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public HalfLLMTTSChatRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public HalfLLMTTSChatRequest setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Integer getSampleRate() {
        return this.sampleRate;
    }

    public HalfLLMTTSChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public HalfLLMTTSChatRequest setSpeechRate(Integer speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Integer getSpeechRate() {
        return this.speechRate;
    }

    public HalfLLMTTSChatRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public HalfLLMTTSChatRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public HalfLLMTTSChatRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public HalfLLMTTSChatRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public HalfLLMTTSChatRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

    public HalfLLMTTSChatRequest setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }
    public Integer getVolume() {
        return this.volume;
    }

}

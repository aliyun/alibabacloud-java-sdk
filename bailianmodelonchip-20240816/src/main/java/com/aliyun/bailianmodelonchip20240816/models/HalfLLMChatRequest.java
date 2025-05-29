// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMChatRequest extends TeaModel {
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
     * <p>true</p>
     */
    @NameInMap("enableSearch")
    public Boolean enableSearch;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputText")
    public String inputText;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("model")
    public String model;

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
     * <p>0sIRZDNncmCfBagzy534x2PH</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

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
     * <p>520539530998273</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static HalfLLMChatRequest build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMChatRequest self = new HalfLLMChatRequest();
        return TeaModel.build(map, self);
    }

    public HalfLLMChatRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public HalfLLMChatRequest setEnableSearch(Boolean enableSearch) {
        this.enableSearch = enableSearch;
        return this;
    }
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    public HalfLLMChatRequest setInputText(String inputText) {
        this.inputText = inputText;
        return this;
    }
    public String getInputText() {
        return this.inputText;
    }

    public HalfLLMChatRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public HalfLLMChatRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public HalfLLMChatRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public HalfLLMChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public HalfLLMChatRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public HalfLLMChatRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

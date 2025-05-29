// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMImageChatRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/xx.jpg">https://xxx/xx.jpg</a></p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputText")
    public String inputText;

    /**
     * <strong>example:</strong>
     * <p>qwen-vl-max</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>520539530998273</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static HalfLLMImageChatRequest build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMImageChatRequest self = new HalfLLMImageChatRequest();
        return TeaModel.build(map, self);
    }

    public HalfLLMImageChatRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public HalfLLMImageChatRequest setEnableSearch(Boolean enableSearch) {
        this.enableSearch = enableSearch;
        return this;
    }
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    public HalfLLMImageChatRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public HalfLLMImageChatRequest setInputText(String inputText) {
        this.inputText = inputText;
        return this;
    }
    public String getInputText() {
        return this.inputText;
    }

    public HalfLLMImageChatRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public HalfLLMImageChatRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public HalfLLMImageChatRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public HalfLLMImageChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public HalfLLMImageChatRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchCreateModelRequest extends TeaModel {
    /**
     * <p>The API key. This parameter is required. The key is shared by the same provider and reused by all models.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>The base URL. This parameter is optional. Specify this parameter when you use a custom gateway address. If you do not specify this parameter, the default address of the provider is used.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyuncs.com/compatible-mode/v1">https://dashscope.aliyuncs.com/compatible-mode/v1</a></p>
     */
    @NameInMap("baseUrl")
    public String baseUrl;

    /**
     * <p>The list of models to create in batches. This parameter is required. At least one item must be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("models")
    public java.util.List<BatchCreateModelItemDTO> models;

    /**
     * <p>The provider symbol. This parameter is required. All models items share the same provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("symbol")
    public String symbol;

    public static ModelRouterBatchCreateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchCreateModelRequest self = new ModelRouterBatchCreateModelRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchCreateModelRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public ModelRouterBatchCreateModelRequest setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ModelRouterBatchCreateModelRequest setModels(java.util.List<BatchCreateModelItemDTO> models) {
        this.models = models;
        return this;
    }
    public java.util.List<BatchCreateModelItemDTO> getModels() {
        return this.models;
    }

    public ModelRouterBatchCreateModelRequest setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

}

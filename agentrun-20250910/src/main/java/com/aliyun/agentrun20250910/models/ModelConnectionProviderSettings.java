// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelConnectionProviderSettings extends TeaModel {
    /**
     * <p>模型提供商的默认API基础地址</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://api.openai.com/v1">https://api.openai.com/v1</a></p>
     */
    @NameInMap("baseUrl")
    public String baseUrl;

    /**
     * <p>该连接支持的模型名称列表</p>
     */
    @NameInMap("modelNames")
    public java.util.List<String> modelNames;

    public static ModelConnectionProviderSettings build(java.util.Map<String, ?> map) throws Exception {
        ModelConnectionProviderSettings self = new ModelConnectionProviderSettings();
        return TeaModel.build(map, self);
    }

    public ModelConnectionProviderSettings setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ModelConnectionProviderSettings setModelNames(java.util.List<String> modelNames) {
        this.modelNames = modelNames;
        return this;
    }
    public java.util.List<String> getModelNames() {
        return this.modelNames;
    }

}

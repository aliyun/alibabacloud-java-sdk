// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ProviderSettings extends TeaModel {
    @NameInMap("apiKey")
    public String apiKey;

    @NameInMap("baseUrl")
    public String baseUrl;

    @NameInMap("modelNames")
    public java.util.List<String> modelNames;

    public static ProviderSettings build(java.util.Map<String, ?> map) throws Exception {
        ProviderSettings self = new ProviderSettings();
        return TeaModel.build(map, self);
    }

    public ProviderSettings setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public ProviderSettings setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public ProviderSettings setModelNames(java.util.List<String> modelNames) {
        this.modelNames = modelNames;
        return this;
    }
    public java.util.List<String> getModelNames() {
        return this.modelNames;
    }

}

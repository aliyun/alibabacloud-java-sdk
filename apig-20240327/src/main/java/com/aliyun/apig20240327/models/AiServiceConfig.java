// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiServiceConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://dashscope.aliyun.com">https://dashscope.aliyun.com</a></p>
     */
    @NameInMap("address")
    public String address;

    @NameInMap("apiKeys")
    public java.util.List<String> apiKeys;

    @NameInMap("enableHealthCheck")
    public Boolean enableHealthCheck;

    @NameInMap("protocols")
    public java.util.List<String> protocols;

    /**
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("provider")
    public String provider;

    public static AiServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        AiServiceConfig self = new AiServiceConfig();
        return TeaModel.build(map, self);
    }

    public AiServiceConfig setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AiServiceConfig setApiKeys(java.util.List<String> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<String> getApiKeys() {
        return this.apiKeys;
    }

    public AiServiceConfig setEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }
    public Boolean getEnableHealthCheck() {
        return this.enableHealthCheck;
    }

    public AiServiceConfig setProtocols(java.util.List<String> protocols) {
        this.protocols = protocols;
        return this;
    }
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public AiServiceConfig setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}

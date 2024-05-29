// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class BindSentinelBlockFallbackDefinitionRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FallbackId")
    public Long fallbackId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Resource")
    public String resource;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static BindSentinelBlockFallbackDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSentinelBlockFallbackDefinitionRequest self = new BindSentinelBlockFallbackDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public BindSentinelBlockFallbackDefinitionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public BindSentinelBlockFallbackDefinitionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BindSentinelBlockFallbackDefinitionRequest setFallbackId(Long fallbackId) {
        this.fallbackId = fallbackId;
        return this;
    }
    public Long getFallbackId() {
        return this.fallbackId;
    }

    public BindSentinelBlockFallbackDefinitionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BindSentinelBlockFallbackDefinitionRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public BindSentinelBlockFallbackDefinitionRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}

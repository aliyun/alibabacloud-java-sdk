// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UnbindSentinelBlockFallbackDefinitionRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("FallbackId")
    public Long fallbackId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("TargetType")
    public Long targetType;

    public static UnbindSentinelBlockFallbackDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSentinelBlockFallbackDefinitionRequest self = new UnbindSentinelBlockFallbackDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSentinelBlockFallbackDefinitionRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UnbindSentinelBlockFallbackDefinitionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UnbindSentinelBlockFallbackDefinitionRequest setFallbackId(Long fallbackId) {
        this.fallbackId = fallbackId;
        return this;
    }
    public Long getFallbackId() {
        return this.fallbackId;
    }

    public UnbindSentinelBlockFallbackDefinitionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UnbindSentinelBlockFallbackDefinitionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UnbindSentinelBlockFallbackDefinitionRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public UnbindSentinelBlockFallbackDefinitionRequest setTargetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }
    public Long getTargetType() {
        return this.targetType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BindSentinelBlockFallbackDefinitionRequest extends TeaModel {
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

    public static BindSentinelBlockFallbackDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSentinelBlockFallbackDefinitionRequest self = new BindSentinelBlockFallbackDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public BindSentinelBlockFallbackDefinitionRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
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

    public BindSentinelBlockFallbackDefinitionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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

    public BindSentinelBlockFallbackDefinitionRequest setTargetType(Long targetType) {
        this.targetType = targetType;
        return this;
    }
    public Long getTargetType() {
        return this.targetType;
    }

}

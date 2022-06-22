// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateSentinelBlockFallbackDefinitionRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("FallbackBehavior")
    public String fallbackBehavior;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ResourceClassification")
    public Integer resourceClassification;

    public static CreateSentinelBlockFallbackDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelBlockFallbackDefinitionRequest self = new CreateSentinelBlockFallbackDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSentinelBlockFallbackDefinitionRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setFallbackBehavior(String fallbackBehavior) {
        this.fallbackBehavior = fallbackBehavior;
        return this;
    }
    public String getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateSentinelBlockFallbackDefinitionRequest setResourceClassification(Integer resourceClassification) {
        this.resourceClassification = resourceClassification;
        return this;
    }
    public Integer getResourceClassification() {
        return this.resourceClassification;
    }

}

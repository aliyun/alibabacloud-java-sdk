// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class TestBlockFallbackDefinitionBehaviorRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("FallbackBehavior")
    public String fallbackBehavior;

    @NameInMap("FallbackMode")
    public String fallbackMode;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Method")
    public String method;

    @NameInMap("Namespace")
    public String namespace;

    public static TestBlockFallbackDefinitionBehaviorRequest build(java.util.Map<String, ?> map) throws Exception {
        TestBlockFallbackDefinitionBehaviorRequest self = new TestBlockFallbackDefinitionBehaviorRequest();
        return TeaModel.build(map, self);
    }

    public TestBlockFallbackDefinitionBehaviorRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public TestBlockFallbackDefinitionBehaviorRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TestBlockFallbackDefinitionBehaviorRequest setFallbackBehavior(String fallbackBehavior) {
        this.fallbackBehavior = fallbackBehavior;
        return this;
    }
    public String getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    public TestBlockFallbackDefinitionBehaviorRequest setFallbackMode(String fallbackMode) {
        this.fallbackMode = fallbackMode;
        return this;
    }
    public String getFallbackMode() {
        return this.fallbackMode;
    }

    public TestBlockFallbackDefinitionBehaviorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TestBlockFallbackDefinitionBehaviorRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public TestBlockFallbackDefinitionBehaviorRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelProtectionModuleNewRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ApiType")
    public Long apiType;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("FallbackId")
    public Long fallbackId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("RuleType")
    public Long ruleType;

    public static SentinelProtectionModuleNewRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelProtectionModuleNewRequest self = new SentinelProtectionModuleNewRequest();
        return TeaModel.build(map, self);
    }

    public SentinelProtectionModuleNewRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelProtectionModuleNewRequest setApiType(Long apiType) {
        this.apiType = apiType;
        return this;
    }
    public Long getApiType() {
        return this.apiType;
    }

    public SentinelProtectionModuleNewRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelProtectionModuleNewRequest setFallbackId(Long fallbackId) {
        this.fallbackId = fallbackId;
        return this;
    }
    public Long getFallbackId() {
        return this.fallbackId;
    }

    public SentinelProtectionModuleNewRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelProtectionModuleNewRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelProtectionModuleNewRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public SentinelProtectionModuleNewRequest setRuleType(Long ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Long getRuleType() {
        return this.ruleType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyLosslessRuleRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Aligned")
    public Boolean aligned;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("DelayTime")
    public Long delayTime;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("FuncType")
    public Long funcType;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Related")
    public Boolean related;

    @NameInMap("ShutdownWaitSeconds")
    public Integer shutdownWaitSeconds;

    @NameInMap("Source")
    public String source;

    @NameInMap("WarmupTime")
    public Long warmupTime;

    public static ModifyLosslessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLosslessRuleRequest self = new ModifyLosslessRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLosslessRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ModifyLosslessRuleRequest setAligned(Boolean aligned) {
        this.aligned = aligned;
        return this;
    }
    public Boolean getAligned() {
        return this.aligned;
    }

    public ModifyLosslessRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyLosslessRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyLosslessRuleRequest setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public ModifyLosslessRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyLosslessRuleRequest setFuncType(Long funcType) {
        this.funcType = funcType;
        return this;
    }
    public Long getFuncType() {
        return this.funcType;
    }

    public ModifyLosslessRuleRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public ModifyLosslessRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLosslessRuleRequest setRelated(Boolean related) {
        this.related = related;
        return this;
    }
    public Boolean getRelated() {
        return this.related;
    }

    public ModifyLosslessRuleRequest setShutdownWaitSeconds(Integer shutdownWaitSeconds) {
        this.shutdownWaitSeconds = shutdownWaitSeconds;
        return this;
    }
    public Integer getShutdownWaitSeconds() {
        return this.shutdownWaitSeconds;
    }

    public ModifyLosslessRuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ModifyLosslessRuleRequest setWarmupTime(Long warmupTime) {
        this.warmupTime = warmupTime;
        return this;
    }
    public Long getWarmupTime() {
        return this.warmupTime;
    }

}

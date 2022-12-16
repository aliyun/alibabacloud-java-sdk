// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyLosslessRuleRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // Specifies whether to align the lifecycle of the application in the Kubernetes cluster with that of the microservice.
    @NameInMap("Aligned")
    public Boolean aligned;

    // The ID of the application.
    @NameInMap("AppId")
    public String appId;

    // The name of the application.
    @NameInMap("AppName")
    public String appName;

    // The registration latency.
    @NameInMap("DelayTime")
    public Long delayTime;

    // Specifies whether to enable the alert rule. Valid values:
    // 
    // *   `true`: enables the rule.
    // *   `false`: disables the rule.
    @NameInMap("Enable")
    public Boolean enable;

    // The slope of the prefetching curve.
    @NameInMap("FuncType")
    public Long funcType;

    @NameInMap("LossLessDetail")
    public Boolean lossLessDetail;

    @NameInMap("Notice")
    public Boolean notice;

    // The region ID.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies whether to associate readiness probe with service prefetching.
    @NameInMap("Related")
    public Boolean related;

    // The cooldown duration. Unit: seconds.
    @NameInMap("ShutdownWaitSeconds")
    public Integer shutdownWaitSeconds;

    // The service source. Valid values:
    @NameInMap("Source")
    public String source;

    // The prefetching duration.
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

    public ModifyLosslessRuleRequest setLossLessDetail(Boolean lossLessDetail) {
        this.lossLessDetail = lossLessDetail;
        return this;
    }
    public Boolean getLossLessDetail() {
        return this.lossLessDetail;
    }

    public ModifyLosslessRuleRequest setNotice(Boolean notice) {
        this.notice = notice;
        return this;
    }
    public Boolean getNotice() {
        return this.notice;
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

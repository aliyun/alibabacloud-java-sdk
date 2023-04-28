// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyLosslessRuleRequest extends TeaModel {
    /**
     * <p>int64</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <br>
     * <p>*   `true`: enables the rule.</p>
     * <p>*   `false`: disables the rule.</p>
     */
    @NameInMap("Aligned")
    public Boolean aligned;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>clusterNotFound</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

    /**
     * <p>systemError</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The microservice namespace to which the rule applies.</p>
     */
    @NameInMap("FuncType")
    public Integer funcType;

    /**
     * <p>int64</p>
     */
    @NameInMap("LossLessDetail")
    public Boolean lossLessDetail;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The registration latency.</p>
     */
    @NameInMap("Notice")
    public Boolean notice;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The prefetching duration.</p>
     */
    @NameInMap("Related")
    public Boolean related;

    /**
     * <p>system error</p>
     */
    @NameInMap("WarmupTime")
    public Integer warmupTime;

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

    public ModifyLosslessRuleRequest setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Integer getDelayTime() {
        return this.delayTime;
    }

    public ModifyLosslessRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifyLosslessRuleRequest setFuncType(Integer funcType) {
        this.funcType = funcType;
        return this;
    }
    public Integer getFuncType() {
        return this.funcType;
    }

    public ModifyLosslessRuleRequest setLossLessDetail(Boolean lossLessDetail) {
        this.lossLessDetail = lossLessDetail;
        return this;
    }
    public Boolean getLossLessDetail() {
        return this.lossLessDetail;
    }

    public ModifyLosslessRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
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

    public ModifyLosslessRuleRequest setWarmupTime(Integer warmupTime) {
        this.warmupTime = warmupTime;
        return this;
    }
    public Integer getWarmupTime() {
        return this.warmupTime;
    }

}

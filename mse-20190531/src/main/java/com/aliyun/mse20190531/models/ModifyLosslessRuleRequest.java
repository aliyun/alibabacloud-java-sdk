// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyLosslessRuleRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to align the lifecycle of the application in the Kubernetes cluster with that of the microservice.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Aligned")
    public Boolean aligned;

    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c644n5frmc@3e75f25fd4*****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>wx-work-api</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The registration latency.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DelayTime")
    public Integer delayTime;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <ul>
     * <li><code>true</code>: enables the rule.</li>
     * <li><code>false</code>: disables the rule.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The slope of the prefetching curve.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FuncType")
    public Integer funcType;

    /**
     * <p>Specifies whether to display online and offline processing details.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LossLessDetail")
    public Boolean lossLessDetail;

    /**
     * <p>The microservice namespace to which the rule applies.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Specifies whether to enable notification.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Notice")
    public Boolean notice;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to associate with service prefetching.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Related")
    public Boolean related;

    /**
     * <p>The prefetching duration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
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

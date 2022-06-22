// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelUpdateGeneralSettingOfAppRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxContextAmount")
    public Integer maxContextAmount;

    @NameInMap("MaxOriginAmount")
    public Integer maxOriginAmount;

    @NameInMap("MaxResourceAmount")
    public Integer maxResourceAmount;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("StatisticMaxRt")
    public Integer statisticMaxRt;

    public static SentinelUpdateGeneralSettingOfAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelUpdateGeneralSettingOfAppRequest self = new SentinelUpdateGeneralSettingOfAppRequest();
        return TeaModel.build(map, self);
    }

    public SentinelUpdateGeneralSettingOfAppRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelUpdateGeneralSettingOfAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelUpdateGeneralSettingOfAppRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelUpdateGeneralSettingOfAppRequest setMaxContextAmount(Integer maxContextAmount) {
        this.maxContextAmount = maxContextAmount;
        return this;
    }
    public Integer getMaxContextAmount() {
        return this.maxContextAmount;
    }

    public SentinelUpdateGeneralSettingOfAppRequest setMaxOriginAmount(Integer maxOriginAmount) {
        this.maxOriginAmount = maxOriginAmount;
        return this;
    }
    public Integer getMaxOriginAmount() {
        return this.maxOriginAmount;
    }

    public SentinelUpdateGeneralSettingOfAppRequest setMaxResourceAmount(Integer maxResourceAmount) {
        this.maxResourceAmount = maxResourceAmount;
        return this;
    }
    public Integer getMaxResourceAmount() {
        return this.maxResourceAmount;
    }

    public SentinelUpdateGeneralSettingOfAppRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelUpdateGeneralSettingOfAppRequest setStatisticMaxRt(Integer statisticMaxRt) {
        this.statisticMaxRt = statisticMaxRt;
        return this;
    }
    public Integer getStatisticMaxRt() {
        return this.statisticMaxRt;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelAdaptiveFlowSettingOfAppRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("EnableAutoSystemAdaptive")
    public Boolean enableAutoSystemAdaptive;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static UpdateSentinelAdaptiveFlowSettingOfAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelAdaptiveFlowSettingOfAppRequest self = new UpdateSentinelAdaptiveFlowSettingOfAppRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppRequest setEnableAutoSystemAdaptive(Boolean enableAutoSystemAdaptive) {
        this.enableAutoSystemAdaptive = enableAutoSystemAdaptive;
        return this;
    }
    public Boolean getEnableAutoSystemAdaptive() {
        return this.enableAutoSystemAdaptive;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateSentinelAdaptiveFlowSettingOfAppRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}

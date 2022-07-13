// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AppsSettings extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 云帐号Id
    @NameInMap("CloudUid")
    public String cloudUid;

    // 客户非敏感信息
    @NameInMap("Customer")
    public CommonCustomer customer;

    // 互动视频配置
    @NameInMap("InteractiveVideoSettings")
    public AppsInteractiveVideoSettings interactiveVideoSettings;

    public static AppsSettings build(java.util.Map<String, ?> map) throws Exception {
        AppsSettings self = new AppsSettings();
        return TeaModel.build(map, self);
    }

    public AppsSettings setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppsSettings setCloudUid(String cloudUid) {
        this.cloudUid = cloudUid;
        return this;
    }
    public String getCloudUid() {
        return this.cloudUid;
    }

    public AppsSettings setCustomer(CommonCustomer customer) {
        this.customer = customer;
        return this;
    }
    public CommonCustomer getCustomer() {
        return this.customer;
    }

    public AppsSettings setInteractiveVideoSettings(AppsInteractiveVideoSettings interactiveVideoSettings) {
        this.interactiveVideoSettings = interactiveVideoSettings;
        return this;
    }
    public AppsInteractiveVideoSettings getInteractiveVideoSettings() {
        return this.interactiveVideoSettings;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreatePublishPlanWithPipelineRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    @NameInMap("AppVersion")
    @Validation(required = true)
    public String appVersion;

    @NameInMap("VersionCode")
    public Integer versionCode;

    @NameInMap("PlanName")
    public String planName;

    public static CreatePublishPlanWithPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishPlanWithPipelineRequest self = new CreatePublishPlanWithPipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishPlanWithPipelineRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreatePublishPlanWithPipelineRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public CreatePublishPlanWithPipelineRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public CreatePublishPlanWithPipelineRequest setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public Integer getVersionCode() {
        return this.versionCode;
    }

    public CreatePublishPlanWithPipelineRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

}

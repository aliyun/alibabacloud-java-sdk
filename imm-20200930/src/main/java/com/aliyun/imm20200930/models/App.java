// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class App extends TeaModel {
    @NameInMap("AppDescription")
    public String appDescription;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppRegion")
    public Long appRegion;

    @NameInMap("AppType")
    public Long appType;

    @NameInMap("EnglishName")
    public String englishName;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PackageName")
    public String packageName;

    public static App build(java.util.Map<String, ?> map) throws Exception {
        App self = new App();
        return TeaModel.build(map, self);
    }

    public App setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public App setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public App setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public App setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public App setAppRegion(Long appRegion) {
        this.appRegion = appRegion;
        return this;
    }
    public Long getAppRegion() {
        return this.appRegion;
    }

    public App setAppType(Long appType) {
        this.appType = appType;
        return this;
    }
    public Long getAppType() {
        return this.appType;
    }

    public App setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }
    public String getEnglishName() {
        return this.englishName;
    }

    public App setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public App setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

}

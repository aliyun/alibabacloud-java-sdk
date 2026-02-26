// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class App extends TeaModel {
    /**
     * <p>AppDescription</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    /**
     * <p>AppId</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>AppKey</p>
     * 
     * <strong>example:</strong>
     * <p>ryBOBW0Z6NnQ3fV9</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>AppName</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>AppRegion</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AppRegion")
    public Long appRegion;

    /**
     * <p>AppType</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AppType")
    public Long appType;

    /**
     * <p>EnglishName</p>
     * 
     * <strong>example:</strong>
     * <p>Taobao</p>
     */
    @NameInMap("EnglishName")
    public String englishName;

    /**
     * <p>OwnerId</p>
     * 
     * <strong>example:</strong>
     * <p>1023210024677934</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>PackageName</p>
     * 
     * <strong>example:</strong>
     * <p>ThisIsAPackageName</p>
     */
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

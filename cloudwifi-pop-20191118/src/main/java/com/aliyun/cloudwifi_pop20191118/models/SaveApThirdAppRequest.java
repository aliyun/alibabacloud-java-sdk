// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class SaveApThirdAppRequest extends TeaModel {
    // addStyle
    @NameInMap("AddStyle")
    public Integer addStyle;

    // apAssetId
    @NameInMap("ApAssetId")
    public Long apAssetId;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appData
    @NameInMap("AppData")
    public String appData;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // category
    @NameInMap("Category")
    public Integer category;

    // id
    @NameInMap("Id")
    public Long id;

    // mac
    @NameInMap("Mac")
    public String mac;

    // appName
    @NameInMap("ThirdAppName")
    public String thirdAppName;

    // version
    @NameInMap("Version")
    public String version;

    public static SaveApThirdAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveApThirdAppRequest self = new SaveApThirdAppRequest();
        return TeaModel.build(map, self);
    }

    public SaveApThirdAppRequest setAddStyle(Integer addStyle) {
        this.addStyle = addStyle;
        return this;
    }
    public Integer getAddStyle() {
        return this.addStyle;
    }

    public SaveApThirdAppRequest setApAssetId(Long apAssetId) {
        this.apAssetId = apAssetId;
        return this;
    }
    public Long getApAssetId() {
        return this.apAssetId;
    }

    public SaveApThirdAppRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SaveApThirdAppRequest setAppData(String appData) {
        this.appData = appData;
        return this;
    }
    public String getAppData() {
        return this.appData;
    }

    public SaveApThirdAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SaveApThirdAppRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public SaveApThirdAppRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SaveApThirdAppRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public SaveApThirdAppRequest setThirdAppName(String thirdAppName) {
        this.thirdAppName = thirdAppName;
        return this;
    }
    public String getThirdAppName() {
        return this.thirdAppName;
    }

    public SaveApThirdAppRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}

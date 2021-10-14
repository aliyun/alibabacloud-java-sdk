// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class UnRegisterApAssetRequest extends TeaModel {
    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // assetApgroupId
    @NameInMap("AssetApgroupId")
    public Long assetApgroupId;

    // category
    @NameInMap("Category")
    public Integer category;

    // id
    @NameInMap("Id")
    public Long id;

    // mac
    @NameInMap("Mac")
    public String mac;

    // serialNo
    @NameInMap("SerialNo")
    public String serialNo;

    // useFor
    @NameInMap("UseFor")
    public Integer useFor;

    public static UnRegisterApAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterApAssetRequest self = new UnRegisterApAssetRequest();
        return TeaModel.build(map, self);
    }

    public UnRegisterApAssetRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public UnRegisterApAssetRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UnRegisterApAssetRequest setAssetApgroupId(Long assetApgroupId) {
        this.assetApgroupId = assetApgroupId;
        return this;
    }
    public Long getAssetApgroupId() {
        return this.assetApgroupId;
    }

    public UnRegisterApAssetRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public UnRegisterApAssetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UnRegisterApAssetRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public UnRegisterApAssetRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public UnRegisterApAssetRequest setUseFor(Integer useFor) {
        this.useFor = useFor;
        return this;
    }
    public Integer getUseFor() {
        return this.useFor;
    }

}

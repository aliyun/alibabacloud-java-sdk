// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DelApThirdAppRequest extends TeaModel {
    // apAssetId
    @NameInMap("ApAssetId")
    public Long apAssetId;

    // appSecret
    @NameInMap("AppCode")
    public String appCode;

    // appKey
    @NameInMap("AppName")
    public String appName;

    // id
    @NameInMap("Id")
    public Long id;

    // mac
    @NameInMap("Mac")
    public String mac;

    public static DelApThirdAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DelApThirdAppRequest self = new DelApThirdAppRequest();
        return TeaModel.build(map, self);
    }

    public DelApThirdAppRequest setApAssetId(Long apAssetId) {
        this.apAssetId = apAssetId;
        return this;
    }
    public Long getApAssetId() {
        return this.apAssetId;
    }

    public DelApThirdAppRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DelApThirdAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DelApThirdAppRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DelApThirdAppRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

}

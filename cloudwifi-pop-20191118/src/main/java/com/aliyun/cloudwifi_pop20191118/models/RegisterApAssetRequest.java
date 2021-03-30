// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RegisterApAssetRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Mac")
    public String mac;

    @NameInMap("ApGroupUUId")
    public String apGroupUUId;

    @NameInMap("SerialNo")
    public String serialNo;

    public static RegisterApAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterApAssetRequest self = new RegisterApAssetRequest();
        return TeaModel.build(map, self);
    }

    public RegisterApAssetRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public RegisterApAssetRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public RegisterApAssetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RegisterApAssetRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public RegisterApAssetRequest setApGroupUUId(String apGroupUUId) {
        this.apGroupUUId = apGroupUUId;
        return this;
    }
    public String getApGroupUUId() {
        return this.apGroupUUId;
    }

    public RegisterApAssetRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}

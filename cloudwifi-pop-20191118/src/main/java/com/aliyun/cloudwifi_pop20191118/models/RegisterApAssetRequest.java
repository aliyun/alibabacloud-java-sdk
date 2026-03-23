// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class RegisterApAssetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApGroupUUId")
    public String apGroupUUId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mac")
    public String mac;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    public static RegisterApAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterApAssetRequest self = new RegisterApAssetRequest();
        return TeaModel.build(map, self);
    }

    public RegisterApAssetRequest setApGroupUUId(String apGroupUUId) {
        this.apGroupUUId = apGroupUUId;
        return this;
    }
    public String getApGroupUUId() {
        return this.apGroupUUId;
    }

    public RegisterApAssetRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public RegisterApAssetRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
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

    public RegisterApAssetRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}

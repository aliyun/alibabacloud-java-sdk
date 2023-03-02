// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class RegisterDeviceGroupRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("AuthorizeType")
    public String authorizeType;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("DeviceGroupName")
    public String deviceGroupName;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Remark")
    public String remark;

    public static RegisterDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceGroupRequest self = new RegisterDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceGroupRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public RegisterDeviceGroupRequest setAuthorizeType(String authorizeType) {
        this.authorizeType = authorizeType;
        return this;
    }
    public String getAuthorizeType() {
        return this.authorizeType;
    }

    public RegisterDeviceGroupRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public RegisterDeviceGroupRequest setDeviceGroupName(String deviceGroupName) {
        this.deviceGroupName = deviceGroupName;
        return this;
    }
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    public RegisterDeviceGroupRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public RegisterDeviceGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}

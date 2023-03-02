// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UnAuthorizeDeviceGroupRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static UnAuthorizeDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UnAuthorizeDeviceGroupRequest self = new UnAuthorizeDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UnAuthorizeDeviceGroupRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public UnAuthorizeDeviceGroupRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UnAuthorizeDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}

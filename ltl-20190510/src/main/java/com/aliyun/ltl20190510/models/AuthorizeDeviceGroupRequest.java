// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class AuthorizeDeviceGroupRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static AuthorizeDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeDeviceGroupRequest self = new AuthorizeDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeDeviceGroupRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public AuthorizeDeviceGroupRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public AuthorizeDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}

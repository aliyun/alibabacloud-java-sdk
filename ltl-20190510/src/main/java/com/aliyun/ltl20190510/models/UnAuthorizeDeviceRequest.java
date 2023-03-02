// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UnAuthorizeDeviceRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static UnAuthorizeDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnAuthorizeDeviceRequest self = new UnAuthorizeDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnAuthorizeDeviceRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public UnAuthorizeDeviceRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UnAuthorizeDeviceRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public UnAuthorizeDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}

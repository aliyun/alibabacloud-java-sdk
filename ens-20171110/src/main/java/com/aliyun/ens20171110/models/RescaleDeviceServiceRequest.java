// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleDeviceServiceRequest extends TeaModel {
    @NameInMap("RescaleType")
    public String rescaleType;

    @NameInMap("RescaleLevel")
    public String rescaleLevel;

    @NameInMap("Timeout")
    public Long timeout;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ResourceSelector")
    public String resourceSelector;

    @NameInMap("ResourceSpec")
    public String resourceSpec;

    @NameInMap("IpType")
    public Integer ipType;

    @NameInMap("AppId")
    public String appId;

    public static RescaleDeviceServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RescaleDeviceServiceRequest self = new RescaleDeviceServiceRequest();
        return TeaModel.build(map, self);
    }

    public RescaleDeviceServiceRequest setRescaleType(String rescaleType) {
        this.rescaleType = rescaleType;
        return this;
    }
    public String getRescaleType() {
        return this.rescaleType;
    }

    public RescaleDeviceServiceRequest setRescaleLevel(String rescaleLevel) {
        this.rescaleLevel = rescaleLevel;
        return this;
    }
    public String getRescaleLevel() {
        return this.rescaleLevel;
    }

    public RescaleDeviceServiceRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public RescaleDeviceServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RescaleDeviceServiceRequest setResourceSelector(String resourceSelector) {
        this.resourceSelector = resourceSelector;
        return this;
    }
    public String getResourceSelector() {
        return this.resourceSelector;
    }

    public RescaleDeviceServiceRequest setResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public String getResourceSpec() {
        return this.resourceSpec;
    }

    public RescaleDeviceServiceRequest setIpType(Integer ipType) {
        this.ipType = ipType;
        return this;
    }
    public Integer getIpType() {
        return this.ipType;
    }

    public RescaleDeviceServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}

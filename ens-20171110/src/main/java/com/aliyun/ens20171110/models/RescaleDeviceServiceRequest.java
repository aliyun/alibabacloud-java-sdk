// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleDeviceServiceRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the image.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the network. The value must be of the enumerated data type. Valid values:</p>
     * <br>
     * <p>*   **1** (default): Internet</p>
     * <p>*   **2**: internal network</p>
     */
    @NameInMap("IpType")
    public Integer ipType;

    /**
     * <p>The region level of the scale-out. Set the value to RegionId. RegionId specifies that resource scale-out is performed based on the ID of the edge node.</p>
     */
    @NameInMap("RescaleLevel")
    public String rescaleLevel;

    /**
     * <p>The scaling operation. Set the value to Add to add new resources.</p>
     */
    @NameInMap("RescaleType")
    public String rescaleType;

    /**
     * <p>The information about the resource specification template. The value must be a JSON string.</p>
     */
    @NameInMap("ResourceInfo")
    public String resourceInfo;

    /**
     * <p>The required resources. The value must be a JSON string.</p>
     */
    @NameInMap("ResourceSelector")
    public String resourceSelector;

    /**
     * <p>The resource specification.</p>
     */
    @NameInMap("ResourceSpec")
    public String resourceSpec;

    /**
     * <p>The ID of the service.</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The timeout period for asynchronous scale-out. Unit: seconds. Default value: 300.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static RescaleDeviceServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RescaleDeviceServiceRequest self = new RescaleDeviceServiceRequest();
        return TeaModel.build(map, self);
    }

    public RescaleDeviceServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RescaleDeviceServiceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public RescaleDeviceServiceRequest setIpType(Integer ipType) {
        this.ipType = ipType;
        return this;
    }
    public Integer getIpType() {
        return this.ipType;
    }

    public RescaleDeviceServiceRequest setRescaleLevel(String rescaleLevel) {
        this.rescaleLevel = rescaleLevel;
        return this;
    }
    public String getRescaleLevel() {
        return this.rescaleLevel;
    }

    public RescaleDeviceServiceRequest setRescaleType(String rescaleType) {
        this.rescaleType = rescaleType;
        return this;
    }
    public String getRescaleType() {
        return this.rescaleType;
    }

    public RescaleDeviceServiceRequest setResourceInfo(String resourceInfo) {
        this.resourceInfo = resourceInfo;
        return this;
    }
    public String getResourceInfo() {
        return this.resourceInfo;
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

    public RescaleDeviceServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RescaleDeviceServiceRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}

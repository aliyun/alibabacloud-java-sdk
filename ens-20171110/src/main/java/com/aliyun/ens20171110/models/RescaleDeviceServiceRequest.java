// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleDeviceServiceRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>7aedc50b-b1cb-4a7c-9e3d-4cf3c9ee55a4</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-5rynw9g1ow1e928lb83bqmbnf</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The type of the network. The value must be of the enumerated data type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): Internet</li>
     * <li><strong>2</strong>: internal network</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IpType")
    public Integer ipType;

    /**
     * <p>The region level of the scale-out. Set the value to RegionId. RegionId specifies that resource scale-out is performed based on the ID of the edge node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RegionId</p>
     */
    @NameInMap("RescaleLevel")
    public String rescaleLevel;

    /**
     * <p>The scaling operation. Set the value to Add to add new resources.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Add</p>
     */
    @NameInMap("RescaleType")
    public String rescaleType;

    /**
     * <p>The information about the resource specification template. The value must be a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;imageId\&quot;:\&quot;m-5s4z4c10avgwvwtn33gl2vgob\&quot;,\&quot;ipType\&quot;:2,\&quot;specName\&quot;:\&quot;ens.pfb-c3m7.medium\&quot;}</p>
     */
    @NameInMap("ResourceInfo")
    public String resourceInfo;

    /**
     * <p>The required resources. The value must be a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;regionCode\&quot;: \&quot;cn-wuxi-telecom_unicom_cmcc-3\&quot;,    \&quot;ispCode\&quot;: \&quot;telecom\&quot;,    \&quot;count\&quot;: 2	},{    \&quot;regionCode\&quot;: \&quot;cn-shanghai-cmcc\&quot;,    \&quot;count\&quot;: 4	}]</p>
     */
    @NameInMap("ResourceSelector")
    public String resourceSelector;

    /**
     * <p>The resource specification.</p>
     * 
     * <strong>example:</strong>
     * <p>ens.a6e.large</p>
     */
    @NameInMap("ResourceSpec")
    public String resourceSpec;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>service-01c6dd6e93f040698566</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The timeout period for asynchronous scale-out. Unit: seconds. Default value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth billing method. Valid values:</p>
     * <br>
     * <p>*   **BandwidthPackage**: billed based on bandwidth plans.</p>
     * <p>*   **CDT**: billed based on data transfer.</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>Details about the basic bandwidth plan that is associated with the basic GA instance.</p>
     */
    @NameInMap("BasicBandwidthPackage")
    public GetBasicAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage;

    /**
     * <p>The ID of the endpoint group that is associated with the basic GA instance.</p>
     */
    @NameInMap("BasicEndpointGroupId")
    public String basicEndpointGroupId;

    /**
     * <p>The ID of the region where the basic GA instance is deployed.</p>
     */
    @NameInMap("BasicIpSetId")
    public String basicIpSetId;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance to which the basic GA instance is attached.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The timestamp that indicates when the basic GA instance was created.</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Details about the cross-region acceleration bandwidth plan that is associated with the GA instance.</p>
     * <br>
     * <p>This parameter is returned only when you call this operation on the International site (alibabacloud.com).</p>
     */
    @NameInMap("CrossDomainBandwidthPackage")
    public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage;

    /**
     * <p>Indicates whether China Unicom cross-border communication is enabled.</p>
     * <br>
     * <p>*   **true**: China Unicom cross-border communication is enabled.</p>
     * <p>*   **false**: China Unicom cross-border communication is disabled.</p>
     */
    @NameInMap("CrossPrivateState")
    public String crossPrivateState;

    /**
     * <p>The description of the basic GA instance.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The timestamp that indicates when the basic GA instance expires.</p>
     */
    @NameInMap("ExpiredTime")
    public Long expiredTime;

    /**
     * <p>The billing method of the basic GA instance. Only **PREPAY** is returned, which indicates the subscription billing method.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the basic GA instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the basic GA instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the basic GA instance. Valid values:</p>
     * <br>
     * <p>*   **init**: The basic GA instance is being initialized.</p>
     * <p>*   **active**: The basic GA instance is available.</p>
     * <p>*   **configuring**: The basic GA instance is being configured.</p>
     * <p>*   **binding**: The basic GA instance is being associated.</p>
     * <p>*   **unbinding**: The basic GA instance is being disassociated.</p>
     * <p>*   **deleting**: The basic GA instance is being deleted.</p>
     * <p>*   **finacialLocked**: The basic GA instance is locked due to overdue payments.</p>
     */
    @NameInMap("State")
    public String state;

    @NameInMap("Tags")
    public java.util.List<GetBasicAcceleratorResponseBodyTags> tags;

    public static GetBasicAcceleratorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAcceleratorResponseBody self = new GetBasicAcceleratorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBasicAcceleratorResponseBody setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetBasicAcceleratorResponseBody setBandwidthBillingType(String bandwidthBillingType) {
        this.bandwidthBillingType = bandwidthBillingType;
        return this;
    }
    public String getBandwidthBillingType() {
        return this.bandwidthBillingType;
    }

    public GetBasicAcceleratorResponseBody setBasicBandwidthPackage(GetBasicAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage) {
        this.basicBandwidthPackage = basicBandwidthPackage;
        return this;
    }
    public GetBasicAcceleratorResponseBodyBasicBandwidthPackage getBasicBandwidthPackage() {
        return this.basicBandwidthPackage;
    }

    public GetBasicAcceleratorResponseBody setBasicEndpointGroupId(String basicEndpointGroupId) {
        this.basicEndpointGroupId = basicEndpointGroupId;
        return this;
    }
    public String getBasicEndpointGroupId() {
        return this.basicEndpointGroupId;
    }

    public GetBasicAcceleratorResponseBody setBasicIpSetId(String basicIpSetId) {
        this.basicIpSetId = basicIpSetId;
        return this;
    }
    public String getBasicIpSetId() {
        return this.basicIpSetId;
    }

    public GetBasicAcceleratorResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public GetBasicAcceleratorResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetBasicAcceleratorResponseBody setCrossDomainBandwidthPackage(GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage) {
        this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
        return this;
    }
    public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
        return this.crossDomainBandwidthPackage;
    }

    public GetBasicAcceleratorResponseBody setCrossPrivateState(String crossPrivateState) {
        this.crossPrivateState = crossPrivateState;
        return this;
    }
    public String getCrossPrivateState() {
        return this.crossPrivateState;
    }

    public GetBasicAcceleratorResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetBasicAcceleratorResponseBody setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public GetBasicAcceleratorResponseBody setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public GetBasicAcceleratorResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetBasicAcceleratorResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetBasicAcceleratorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBasicAcceleratorResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetBasicAcceleratorResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetBasicAcceleratorResponseBody setTags(java.util.List<GetBasicAcceleratorResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetBasicAcceleratorResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetBasicAcceleratorResponseBodyBasicBandwidthPackage extends TeaModel {
        /**
         * <p>The bandwidth value of the basic bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The type of the bandwidth that is provided by the basic bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **Basic**: basic</p>
         * <p>*   **Enhanced**: enhanced</p>
         * <p>*   **Advanced**: premium</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The ID of the basic bandwidth plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetBasicAcceleratorResponseBodyBasicBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            GetBasicAcceleratorResponseBodyBasicBandwidthPackage self = new GetBasicAcceleratorResponseBodyBasicBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public GetBasicAcceleratorResponseBodyBasicBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public GetBasicAcceleratorResponseBodyBasicBandwidthPackage setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public GetBasicAcceleratorResponseBodyBasicBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage extends TeaModel {
        /**
         * <p>The bandwidth value of the cross-region acceleration bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the cross-region acceleration bandwidth plan.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage self = new GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetBasicAcceleratorResponseBodyTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetBasicAcceleratorResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetBasicAcceleratorResponseBodyTags self = new GetBasicAcceleratorResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetBasicAcceleratorResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetBasicAcceleratorResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

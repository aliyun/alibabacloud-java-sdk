// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAcceleratorResponseBody extends TeaModel {
    /**
     * <p>The ID of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp17frjjh0udz4qz****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The bandwidth metering method.</p>
     * <ul>
     * <li><strong>BandwidthPackage</strong>: billed based on bandwidth plans.</li>
     * <li><strong>CDT</strong>: billed by Cloud Data Transfer (CDT) and based on data transfer.</li>
     * <li><strong>CDT95</strong>: billed by CDT and based on the 95th percentile bandwidth. This bandwidth metering method is available only to users that are included in the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CDT</p>
     */
    @NameInMap("BandwidthBillingType")
    public String bandwidthBillingType;

    /**
     * <p>The details about the basic bandwidth plan that is associated with the basic GA instance.</p>
     */
    @NameInMap("BasicBandwidthPackage")
    public GetBasicAcceleratorResponseBodyBasicBandwidthPackage basicBandwidthPackage;

    /**
     * <p>The ID of the endpoint group.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("BasicEndpointGroupId")
    public String basicEndpointGroupId;

    /**
     * <p>The ID of the acceleration region.</p>
     * 
     * <strong>example:</strong>
     * <p>ips-bp11ilwqjdkjeg9r7****</p>
     */
    @NameInMap("BasicIpSetId")
    public String basicIpSetId;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance to which the basic GA instance is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-hjkduu767hc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The timestamp that indicates when the basic GA instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>1637734547</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Indicates whether cross-border acceleration is enabled for the basic GA instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossBorderStatus")
    public Boolean crossBorderStatus;

    /**
     * <p>The details about the cross-border acceleration bandwidth plan that is associated with the GA instance.</p>
     * <p>This array is returned only for GA instances that are created on the international site (alibabacloud.com).</p>
     */
    @NameInMap("CrossDomainBandwidthPackage")
    public GetBasicAcceleratorResponseBodyCrossDomainBandwidthPackage crossDomainBandwidthPackage;

    /**
     * <p>Indicates whether cross-border acceleration is enabled.</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CrossPrivateState")
    public String crossPrivateState;

    /**
     * <p>The description of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>BasicAccelerator</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The timestamp that indicates when the basic GA instance expires.</p>
     * <p>The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1640326547</p>
     */
    @NameInMap("ExpiredTime")
    public Long expiredTime;

    /**
     * <p>The billing method of the basic GA instance. Only <strong>PREPAY</strong> is returned, which indicates the subscription billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the basic GA instance.</p>
     * 
     * <strong>example:</strong>
     * <p>BasicAccelerator</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region where the basic GA instance is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F591955F-5CB5-4CCE-A75D-17CF2085CE22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the basic GA instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzrnd67gq****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the basic GA instance.</p>
     * <ul>
     * <li><strong>init</strong>: The GA instance is being initialized.</li>
     * <li><strong>active</strong>: The GA instance is available.</li>
     * <li><strong>configuring</strong>: The GA instance is being configured.</li>
     * <li><strong>binding</strong>: The GA instance is being associated.</li>
     * <li><strong>unbinding</strong>: The GA instance is being disassociated.</li>
     * <li><strong>deleting</strong>: The GA instance is being deleted.</li>
     * <li><strong>finacialLocked</strong>: The GA instance is locked due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The tags of the basic GA instance.</p>
     */
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

    public GetBasicAcceleratorResponseBody setCrossBorderStatus(Boolean crossBorderStatus) {
        this.crossBorderStatus = crossBorderStatus;
        return this;
    }
    public Boolean getCrossBorderStatus() {
        return this.crossBorderStatus;
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
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The type of the bandwidth that is provided by the basic bandwidth plan.</p>
         * <ul>
         * <li><strong>Basic</strong>: basic</li>
         * <li><strong>Enhanced</strong>: enhanced</li>
         * <li><strong>Advanced</strong>: premium</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The ID of the basic bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1d8xk8bg139j0fw****</p>
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
         * <p>The bandwidth value of the cross-border acceleration bandwidth plan. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the cross-border acceleration bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1d8xk8bg139j0fw****</p>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
         */
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

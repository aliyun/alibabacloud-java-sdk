// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAcceleratorsResponseBody extends TeaModel {
    /**
     * <p>The basic GA instances.</p>
     */
    @NameInMap("Accelerators")
    public java.util.List<ListBasicAcceleratorsResponseBodyAccelerators> accelerators;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of basic GA instances returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBasicAcceleratorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAcceleratorsResponseBody self = new ListBasicAcceleratorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBasicAcceleratorsResponseBody setAccelerators(java.util.List<ListBasicAcceleratorsResponseBodyAccelerators> accelerators) {
        this.accelerators = accelerators;
        return this;
    }
    public java.util.List<ListBasicAcceleratorsResponseBodyAccelerators> getAccelerators() {
        return this.accelerators;
    }

    public ListBasicAcceleratorsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBasicAcceleratorsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBasicAcceleratorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBasicAcceleratorsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage extends TeaModel {
        /**
         * <p>The bandwidth value of the basic bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The type of the bandwidth that is provided by the basic bandwidth plan.</p>
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

        public static ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage self = new ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage extends TeaModel {
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

        public static ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage self = new ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListBasicAcceleratorsResponseBodyAcceleratorsTags extends TeaModel {
        /**
         * <p>The tag key of the basic GA instance.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the basic GA instance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListBasicAcceleratorsResponseBodyAcceleratorsTags build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsResponseBodyAcceleratorsTags self = new ListBasicAcceleratorsResponseBodyAcceleratorsTags();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBasicAcceleratorsResponseBodyAcceleratorsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListBasicAcceleratorsResponseBodyAccelerators extends TeaModel {
        /**
         * <p>The ID of the basic GA instance.</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The bandwidth billing method.</p>
         * <br>
         * <p>*   **BandwidthPackage**: billed based on bandwidth plans.</p>
         * <p>*   **CDT**: billed through Cloud Data Transfer (CDT) and based on data transfer.</p>
         * <p>*   **CDT95**: billed through CDT and based on the 95th percentile bandwidth. This bandwidth billing method is available only for users that are included in the whitelist.</p>
         */
        @NameInMap("BandwidthBillingType")
        public String bandwidthBillingType;

        /**
         * <p>The details about the basic bandwidth plan that is associated with the basic GA instance.</p>
         */
        @NameInMap("BasicBandwidthPackage")
        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage;

        /**
         * <p>The ID of the endpoint group.</p>
         */
        @NameInMap("BasicEndpointGroupId")
        public String basicEndpointGroupId;

        /**
         * <p>The ID of the acceleration region.</p>
         */
        @NameInMap("BasicIpSetId")
        public String basicIpSetId;

        /**
         * <p>The timestamp that indicates when the basic GA instance was created.</p>
         * <br>
         * <p>The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>基础全球加速实例是否开启跨境线路功能。取值：</p>
         * <br>
         * <p>- **true**：开启跨境线路功能，可以加速跨境线路。</p>
         * <br>
         * <p>- **false**：关闭跨境线路功能，不可以加速跨境线路。</p>
         */
        @NameInMap("CrossBorderStatus")
        public Boolean crossBorderStatus;

        /**
         * <p>The details about the cross-region acceleration bandwidth plan that is associated with the GA instance.</p>
         * <br>
         * <p>This array is returned only for GA instances that are created on the international site (alibabacloud.com).</p>
         */
        @NameInMap("CrossDomainBandwidthPackage")
        public ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage;

        /**
         * <p>The description of the basic GA instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp that indicates when the basic GA instance expires.</p>
         * <br>
         * <p>The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
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
         * <p>The ID of the resource group to which the basic GA instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the basic GA instance.</p>
         * <br>
         * <p>*   **init**: The GA instance is being initialized.</p>
         * <p>*   **active**: The GA instance is available.</p>
         * <p>*   **configuring**: The GA instance is being configured.</p>
         * <p>*   **binding**: The GA instance is being associated.</p>
         * <p>*   **unbinding**: The GA instance is being disassociated.</p>
         * <p>*   **deleting**: The GA instance is being deleted.</p>
         * <p>*   **finacialLocked**: The GA instance is locked due to overdue payments.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The tags of the basic GA instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListBasicAcceleratorsResponseBodyAcceleratorsTags> tags;

        /**
         * <p>An invalid parameter.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListBasicAcceleratorsResponseBodyAccelerators build(java.util.Map<String, ?> map) throws Exception {
            ListBasicAcceleratorsResponseBodyAccelerators self = new ListBasicAcceleratorsResponseBodyAccelerators();
            return TeaModel.build(map, self);
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setBandwidthBillingType(String bandwidthBillingType) {
            this.bandwidthBillingType = bandwidthBillingType;
            return this;
        }
        public String getBandwidthBillingType() {
            return this.bandwidthBillingType;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setBasicBandwidthPackage(ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage basicBandwidthPackage) {
            this.basicBandwidthPackage = basicBandwidthPackage;
            return this;
        }
        public ListBasicAcceleratorsResponseBodyAcceleratorsBasicBandwidthPackage getBasicBandwidthPackage() {
            return this.basicBandwidthPackage;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setBasicEndpointGroupId(String basicEndpointGroupId) {
            this.basicEndpointGroupId = basicEndpointGroupId;
            return this;
        }
        public String getBasicEndpointGroupId() {
            return this.basicEndpointGroupId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setBasicIpSetId(String basicIpSetId) {
            this.basicIpSetId = basicIpSetId;
            return this;
        }
        public String getBasicIpSetId() {
            return this.basicIpSetId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setCrossBorderStatus(Boolean crossBorderStatus) {
            this.crossBorderStatus = crossBorderStatus;
            return this;
        }
        public Boolean getCrossBorderStatus() {
            return this.crossBorderStatus;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setCrossDomainBandwidthPackage(ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage crossDomainBandwidthPackage) {
            this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
            return this;
        }
        public ListBasicAcceleratorsResponseBodyAcceleratorsCrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
            return this.crossDomainBandwidthPackage;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setTags(java.util.List<ListBasicAcceleratorsResponseBodyAcceleratorsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListBasicAcceleratorsResponseBodyAcceleratorsTags> getTags() {
            return this.tags;
        }

        public ListBasicAcceleratorsResponseBodyAccelerators setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

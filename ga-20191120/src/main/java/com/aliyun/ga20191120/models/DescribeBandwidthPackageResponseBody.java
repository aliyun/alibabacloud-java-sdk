// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The ID of the GA instance that is associated with the bandwidth plan.</p>
     */
    @NameInMap("Accelerators")
    public java.util.List<String> accelerators;

    /**
     * <p>The bandwidth value of the bandwidth plan. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the bandwidth plan.</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The type of the bandwidth. Valid values:</p>
     * <br>
     * <p>*   **Basic**: basic bandwidth</p>
     * <p>*   **Enhanced**: enhanced bandwidth</p>
     * <p>*   **Advanced**: premium bandwidth</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The metering method that is used when you use the pay-as-you-go billing method. Valid values:</p>
     * <br>
     * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
     * <p>*   **PayBY95**: pay-by-95th-percentile</p>
     */
    @NameInMap("BillingType")
    public String billingType;

    /**
     * <p>Area A specified in the cross-region acceleration bandwidth plan. Only **China-mainland** (the Chinese mainland) is returned.</p>
     * <br>
     * <p>This parameter is returned only if you call this operation on the International site (alibabacloud.com).</p>
     */
    @NameInMap("CbnGeographicRegionIdA")
    public String cbnGeographicRegionIdA;

    /**
     * <p>Area B specified in the cross-region acceleration bandwidth plan. Only **Global** (global) is returned.</p>
     * <br>
     * <p>This parameter is returned only if you call this operation on the International site (alibabacloud.com).</p>
     */
    @NameInMap("CbnGeographicRegionIdB")
    public String cbnGeographicRegionIdB;

    /**
     * <p>The billing method of the bandwidth plan. Only **PREPAY** is returned, which indicates the subscription billing method.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The timestamp that indicates when the bandwidth plan was created.</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the bandwidth plan.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The timestamp that indicates when the bandwidth plan expires.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The name of the bandwidth plan.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The percentage of the minimum bandwidth guaranteed if the pay-by-95th-percentile-bandwidth metering method is used. Valid values: **30** to **100**.</p>
     */
    @NameInMap("Ratio")
    public Integer ratio;

    /**
     * <p>The ID of the region where GA instance is deployed. **cn-hangzhou** is returned.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **init**: The bandwidth plan is being initialized.</p>
     * <p>*   **active**: The bandwidth plan is available.</p>
     * <p>*   **binded**: The bandwidth plan is associated with a GA instance.</p>
     * <p>*   **binding**: The bandwidth plan is being associated.</p>
     * <p>*   **unbinding**: The bandwidth plan is being disassociated.</p>
     * <p>*   **updating**: The bandwidth plan is being updated.</p>
     * <p>*   **finacialLocked**: The bandwidth plan is locked due to overdue payments.</p>
     * <p>*   **Locked**: The bandwidth plan is locked.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>Tag objects.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeBandwidthPackageResponseBodyTags> tags;

    /**
     * <p>The type of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **Basic**: a basic bandwidth plan</p>
     * <p>*   **CrossDomain**: a cross-region acceleration bandwidth plan</p>
     * <br>
     * <p>If you call this operation on the Alibaba Cloud China Site (aliyun.com), only **Basic** is returned.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeBandwidthPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackageResponseBody self = new DescribeBandwidthPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackageResponseBody setAccelerators(java.util.List<String> accelerators) {
        this.accelerators = accelerators;
        return this;
    }
    public java.util.List<String> getAccelerators() {
        return this.accelerators;
    }

    public DescribeBandwidthPackageResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeBandwidthPackageResponseBody setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public DescribeBandwidthPackageResponseBody setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
        return this;
    }
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public DescribeBandwidthPackageResponseBody setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public DescribeBandwidthPackageResponseBody setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
        this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
        return this;
    }
    public String getCbnGeographicRegionIdA() {
        return this.cbnGeographicRegionIdA;
    }

    public DescribeBandwidthPackageResponseBody setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
        this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
        return this;
    }
    public String getCbnGeographicRegionIdB() {
        return this.cbnGeographicRegionIdB;
    }

    public DescribeBandwidthPackageResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeBandwidthPackageResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeBandwidthPackageResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeBandwidthPackageResponseBody setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public DescribeBandwidthPackageResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeBandwidthPackageResponseBody setRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }
    public Integer getRatio() {
        return this.ratio;
    }

    public DescribeBandwidthPackageResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBandwidthPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandwidthPackageResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeBandwidthPackageResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeBandwidthPackageResponseBody setTags(java.util.List<DescribeBandwidthPackageResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeBandwidthPackageResponseBodyTags> getTags() {
        return this.tags;
    }

    public DescribeBandwidthPackageResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeBandwidthPackageResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeBandwidthPackageResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackageResponseBodyTags self = new DescribeBandwidthPackageResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackageResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBandwidthPackageResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

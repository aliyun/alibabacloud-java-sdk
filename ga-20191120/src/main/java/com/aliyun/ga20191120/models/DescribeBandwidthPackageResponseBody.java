// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackageResponseBody extends TeaModel {
    /**
     * <p>The instance ID of the Alibaba Cloud Global Accelerator (GA) instance attached to the bandwidth plan.</p>
     */
    @NameInMap("Accelerators")
    public java.util.List<String> accelerators;

    /**
     * <p>The bandwidth value of the bandwidth plan. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The bandwidth plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The bandwidth type. Valid values:</p>
     * <ul>
     * <li><p><strong>Basic</strong>: standard acceleration bandwidth.</p>
     * </li>
     * <li><p><strong>Enhanced</strong>: enhanced acceleration bandwidth.</p>
     * </li>
     * <li><p><strong>Advanced</strong>: premium acceleration bandwidth.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("BandwidthType")
    public String bandwidthType;

    /**
     * <p>The billable methods for the pay-as-you-go billing method. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong>: pay-by-data-transfer.</li>
     * <li><strong>PayBY95</strong>: pay-by-95th-percentile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("BillingType")
    public String billingType;

    /**
     * <p>The interconnected area A of the cross-border acceleration bandwidth plan. The value is returned only as <strong>China-mainland</strong> (the Chinese mainland).</p>
     * <p>This parameter is returned only on the Alibaba Cloud International Website (<a href="http://www.alibabacloud.com">www.alibabacloud.com</a>).</p>
     * 
     * <strong>example:</strong>
     * <p>China-mainland</p>
     */
    @NameInMap("CbnGeographicRegionIdA")
    public String cbnGeographicRegionIdA;

    /**
     * <p>The interconnected area B of the cross-border acceleration bandwidth plan. The value is returned only as <strong>Global</strong>.</p>
     * <p>This parameter is returned only on the Chinese site (Chinese mainland).</p>
     * 
     * <strong>example:</strong>
     * <p>Global</p>
     */
    @NameInMap("CbnGeographicRegionIdB")
    public String cbnGeographicRegionIdB;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PREPAY</strong> (default): subscription.</li>
     * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The timestamp when the bandwidth plan was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1578966918000</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The description of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>testDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The timestamp when the bandwidth plan expires.</p>
     * 
     * <strong>example:</strong>
     * <p>1578966918000</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The name of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The minimum percentage for the pay-by-95th-percentile metering method. Valid values: <strong>30</strong> to <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ratio")
    public Integer ratio;

    /**
     * <p>The region ID of the Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4B6DBBB0-2D01-4C6A-A384-4129266E6B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfnvueepcihjiq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><p><strong>init</strong>: initialization.</p>
     * </li>
     * <li><p><strong>active</strong>: active.</p>
     * </li>
     * <li><p><strong>binded</strong>: attached.</p>
     * </li>
     * <li><p><strong>binding</strong>: being attached.</p>
     * </li>
     * <li><p><strong>unbinding</strong>: being disassociated.</p>
     * </li>
     * <li><p><strong>updating</strong>: being updated.</p>
     * </li>
     * <li><p><strong>finacialLocked</strong>: locked due to overdue payment.</p>
     * </li>
     * <li><p><strong>locked</strong>: locked.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeBandwidthPackageResponseBodyTags> tags;

    /**
     * <p>The type of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><p><strong>Basic</strong>: basic bandwidth plan.</p>
     * </li>
     * <li><p><strong>CrossDomain</strong>: cross-border acceleration bandwidth plan.</p>
     * </li>
     * </ul>
     * <p>Only <strong>Basic</strong> is returned on the Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>).</p>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
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

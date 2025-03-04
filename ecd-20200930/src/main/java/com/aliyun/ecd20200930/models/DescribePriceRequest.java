// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The number of resources. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>The maximum public bandwidth. Unit: Mbit/s.</p>
     * <ul>
     * <li>Valid values if you set InternetChargeType to PayByBandwidth: 10 to 1000.</li>
     * <li>Valid values if you set InternetChargeType to InternetChargeType: 10 to 200.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The type of hourly plan if you use the Monthly Subscription billing method. If you set <code>ResourceType</code> to <code>DesktopMonthPackage</code>, you must specify this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>120: the 120-hour computing plan.</li>
     * <li>250: the 250-hour computing plan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The number of cloud computers in the cloud computer pool. Default value: 1.</p>
     * <blockquote>
     * <p> This parameter takes effect only if you set <code>ResourceType</code> to <code>DesktopGroup</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupDesktopCount")
    public Integer groupDesktopCount;

    /**
     * <p>The resource specifications.</p>
     * <ul>
     * <li><p>If you set <code>ResourceType</code> to <code>Desktop</code>, you must specify this parameter.</p>
     * <ul>
     * <li>ecd.basic.small</li>
     * <li>ecd.basic.large</li>
     * <li>ecd.advanced.large</li>
     * <li>ecd.advanced.xlarge</li>
     * <li>ecd.performance.2xlarge</li>
     * <li>ecd.graphics.xlarge</li>
     * <li>ecd.graphics.2xlarge</li>
     * <li>ecd.advanced.xlarge_s8d2</li>
     * <li>ecd.advanced.xlarge_s8d7</li>
     * <li>ecd.graphics.1g72c</li>
     * <li>eds.general.2c2g</li>
     * <li>eds.general.2c4g</li>
     * <li>eds.general.2c8g</li>
     * <li>eds.general.4c8g</li>
     * <li>eds.general.4c16g</li>
     * <li>eds.general.8c16g</li>
     * <li>eds.general.8c32g</li>
     * <li>eds.general.16c32g</li>
     * </ul>
     * </li>
     * <li><p>If you set <code>ResourceType</code> to <code>DesktopGroup</code>, set the value of this parameter to <code>large</code>.</p>
     * </li>
     * <li><p>If you set <code>ResourceType</code> to <code>Bandwidth</code>, you can leave this parameter empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>eds.general.2c2g</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The metering method for network traffic.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PayByTraffic: You are charged for the actually consumed traffic.</li>
     * <li>PayByBandwidth: You are charged by a fixed bandwidth.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The OS type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Linux</li>
     * <li>Windows (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The subscription duration. The valid values of this parameter vary based on the value of <code>PeriodUnit</code>.</p>
     * <ul>
     * <li>If you set <code>PeriodUnit</code> to <code>Hour</code>, set the value of this parameter to 1.</li>
     * <li>If you set <code>PeriodUnit</code> to <code>Month</code>, set the value of this parameter to 1, 2, 3, or 6.</li>
     * <li>If you set <code>PeriodUnit</code> to <code>Year</code>, set the value of this parameter to 1, 2, or 3.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * <li>Hour (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Hour</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by EDS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DesktopMonthPackage: the monthly subscription plan (also known as the 120-hour or 250-hour computing plan).</li>
     * <li>Desktop (default): the pay-as-you-go cloud computer or the monthly subscription cloud computer (also known as the Unlimited computing plan).</li>
     * <li>Bandwidth: the premium bandwidth plan.</li>
     * <li>DesktopGroup: the cloud computer pool.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desktop</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("RootDiskCategory")
    public String rootDiskCategory;

    /**
     * <p>The size of the system disk. Unit: GiB. If you set <code>ResourceType</code> to <code>Desktop</code>, you must specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("UserDiskCategory")
    public String userDiskCategory;

    /**
     * <p>The size of the data disk. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("UserDiskSizeGib")
    public Integer userDiskSizeGib;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public DescribePriceRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribePriceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public DescribePriceRequest setGroupDesktopCount(Integer groupDesktopCount) {
        this.groupDesktopCount = groupDesktopCount;
        return this;
    }
    public Integer getGroupDesktopCount() {
        return this.groupDesktopCount;
    }

    public DescribePriceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribePriceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DescribePriceRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribePriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribePriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public DescribePriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePriceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribePriceRequest setRootDiskCategory(String rootDiskCategory) {
        this.rootDiskCategory = rootDiskCategory;
        return this;
    }
    public String getRootDiskCategory() {
        return this.rootDiskCategory;
    }

    public DescribePriceRequest setRootDiskSizeGib(Integer rootDiskSizeGib) {
        this.rootDiskSizeGib = rootDiskSizeGib;
        return this;
    }
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    public DescribePriceRequest setUserDiskCategory(String userDiskCategory) {
        this.userDiskCategory = userDiskCategory;
        return this;
    }
    public String getUserDiskCategory() {
        return this.userDiskCategory;
    }

    public DescribePriceRequest setUserDiskSizeGib(Integer userDiskSizeGib) {
        this.userDiskSizeGib = userDiskSizeGib;
        return this;
    }
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

}

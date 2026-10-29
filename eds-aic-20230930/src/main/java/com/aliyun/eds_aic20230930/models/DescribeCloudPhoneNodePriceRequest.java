// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCloudPhoneNodePriceRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of cloud phone matrices to purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>Specifies whether to use a single image disk. Default value: false. Valid values:</p>
     * <ul>
     * <li><p>true: Uses only the system disk.</p>
     * </li>
     * <li><p>false: Uses the system disk and the shared internal storage image disk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSingleImgDisk")
    public Boolean isSingleImgDisk;

    /**
     * <p>The subscription period of the resource. The unit is specified by PeriodUnit. Valid values: 1 month, 2 months, 3 months, 6 months, and 1 year.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: Month.</li>
     * <li><strong>Year</strong>: Year.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The number of provisioned instances, which refers to the number of cloud phone instances in the matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("PhoneCount")
    public Integer phoneCount;

    /**
     * <p>The size of the dedicated internal storage. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PhoneDataVolume")
    public Integer phoneDataVolume;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The size of the shared internal storage. Unit: GiB.</p>
     * <blockquote>
     * <p>The minimum size of the shared internal storage must be greater than the number of instances in the matrix multiplied by 10 GiB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ServerShareDataVolume")
    public Integer serverShareDataVolume;

    /**
     * <p>The specifications of the cloud phone matrix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpm.gx7.10xlarge</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    /**
     * <p>The size of the swap space.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SwapSize")
    public Integer swapSize;

    public static DescribeCloudPhoneNodePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudPhoneNodePriceRequest self = new DescribeCloudPhoneNodePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudPhoneNodePriceRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeCloudPhoneNodePriceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeCloudPhoneNodePriceRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public DescribeCloudPhoneNodePriceRequest setIsSingleImgDisk(Boolean isSingleImgDisk) {
        this.isSingleImgDisk = isSingleImgDisk;
        return this;
    }
    public Boolean getIsSingleImgDisk() {
        return this.isSingleImgDisk;
    }

    public DescribeCloudPhoneNodePriceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeCloudPhoneNodePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeCloudPhoneNodePriceRequest setPhoneCount(Integer phoneCount) {
        this.phoneCount = phoneCount;
        return this;
    }
    public Integer getPhoneCount() {
        return this.phoneCount;
    }

    public DescribeCloudPhoneNodePriceRequest setPhoneDataVolume(Integer phoneDataVolume) {
        this.phoneDataVolume = phoneDataVolume;
        return this;
    }
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    public DescribeCloudPhoneNodePriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public DescribeCloudPhoneNodePriceRequest setServerShareDataVolume(Integer serverShareDataVolume) {
        this.serverShareDataVolume = serverShareDataVolume;
        return this;
    }
    public Integer getServerShareDataVolume() {
        return this.serverShareDataVolume;
    }

    public DescribeCloudPhoneNodePriceRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

    public DescribeCloudPhoneNodePriceRequest setSwapSize(Integer swapSize) {
        this.swapSize = swapSize;
        return this;
    }
    public Integer getSwapSize() {
        return this.swapSize;
    }

}

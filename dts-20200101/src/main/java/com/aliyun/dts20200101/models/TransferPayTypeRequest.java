// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class TransferPayTypeRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The subscription length.</p>
     * <ul>
     * <li>If the <strong>Period</strong> parameter is set to <strong>Year</strong>, the value range is <strong>1</strong> to <strong>5</strong>.</li>
     * <li>If the <strong>Period</strong> parameter is set to <strong>Month</strong>, the value range is <strong>1</strong> to <strong>60</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> You must specify this parameter only if you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BuyCount")
    public String buyCount;

    /**
     * <p>The billing method that you want to use. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>The billing method of subscription instances cannot be changed to pay-as-you-go. To prevent resource waste, determine whether you need to change the billing method of your resources.</li>
     * <li>If you do not need to change the billing method, specify the current billing method.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the data synchronization or change tracking task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>o4nh3g7jg56****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("MaxDu")
    public Integer maxDu;

    @NameInMap("MinDu")
    public Integer minDu;

    /**
     * <p>The billing cycle of the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong></li>
     * <li><strong>Month</strong> (default value)</li>
     * </ul>
     * <blockquote>
     * <p> You must specify this parameter only if you set the <strong>ChargeType</strong> parameter to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static TransferPayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferPayTypeRequest self = new TransferPayTypeRequest();
        return TeaModel.build(map, self);
    }

    public TransferPayTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public TransferPayTypeRequest setBuyCount(String buyCount) {
        this.buyCount = buyCount;
        return this;
    }
    public String getBuyCount() {
        return this.buyCount;
    }

    public TransferPayTypeRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public TransferPayTypeRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public TransferPayTypeRequest setMaxDu(Integer maxDu) {
        this.maxDu = maxDu;
        return this;
    }
    public Integer getMaxDu() {
        return this.maxDu;
    }

    public TransferPayTypeRequest setMinDu(Integer minDu) {
        this.minDu = minDu;
        return this;
    }
    public Integer getMinDu() {
        return this.minDu;
    }

    public TransferPayTypeRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public TransferPayTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TransferPayTypeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}

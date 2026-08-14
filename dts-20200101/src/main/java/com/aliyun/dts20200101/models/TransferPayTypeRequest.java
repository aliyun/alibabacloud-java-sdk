// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class TransferPayTypeRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The subscription duration of the instance.</p>
     * <ul>
     * <li>If Period is set to <strong>Year</strong>, valid values are <strong>1</strong> to <strong>5</strong>.</li>
     * <li>If Period is set to <strong>Month</strong>, valid values are <strong>1</strong> to <strong>60</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and required only when ChargeType is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BuyCount")
    public String buyCount;

    /**
     * <p>The billing method after conversion. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li><strong>sync_serverless</strong>: pay-as-you-go Serverless..</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the data synchronization or change tracking task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>o4nh3g7jg56****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The maximum number of DUs for the Serverless instance. Valid values: 2, 4, 8, and 16.
     * &lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This feature is currently not supported. Do not specify this parameter.
     * &lt;props=&quot;china&quot;&gt;
     * This parameter is valid and required only when ChargeType is set to <strong>sync_serverless</strong>..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("MaxDu")
    public Integer maxDu;

    /**
     * <p>The minimum number of DTS Units (DUs) for the Serverless instance. Valid values: 1, 2, 4, 8, and 16.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>This feature is currently not supported. Do not specify this parameter.
     * &lt;props=&quot;china&quot;&gt;
     * This parameter is valid and required only when ChargeType is set to <strong>sync_serverless</strong>..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinDu")
    public Integer minDu;

    /**
     * <p>The billing method of the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: annual subscription.</li>
     * <li><strong>Month</strong>: monthly subscription.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is valid and required only when ChargeType is set to <strong>PrePaid</strong> (subscription).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
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

    public TransferPayTypeRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
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

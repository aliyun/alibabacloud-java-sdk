// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class TransferPayTypeRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The subscription length.</p>
     * <br>
     * <p>*   If the **Period** parameter is set to **Year**, the value range is **1** to **5**.</p>
     * <p>*   If the **Period** parameter is set to **Month**, the value range is **1** to **60**.</p>
     * <br>
     * <p>>  You must specify this parameter only if you set the **ChargeType** parameter to **PrePaid**.</p>
     */
    @NameInMap("BuyCount")
    public String buyCount;

    /**
     * <p>The billing method that you want to use. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     * <br>
     * <p>> </p>
     * <p>*   The billing method of subscription instances cannot be changed to pay-as-you-go. To prevent resource waste, determine whether you need to change the billing method of your resources.</p>
     * <p>*   If you do not need to change the billing method, specify the current billing method.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the data synchronization or change tracking task. You can call the [DescribeDtsJobs](https://help.aliyun.com/document_detail/209702.html) operation to query the task ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("MaxDu")
    public Integer maxDu;

    @NameInMap("MinDu")
    public Integer minDu;

    /**
     * <p>The billing cycle of the subscription instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month** (default value)</p>
     * <br>
     * <p>>  You must specify this parameter only if you set the **ChargeType** parameter to **PrePaid**.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The ID of the region where the DTS instance resides. For more information, see [List of supported regions](https://help.aliyun.com/document_detail/141033.html).</p>
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

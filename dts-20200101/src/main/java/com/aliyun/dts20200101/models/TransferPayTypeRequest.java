// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class TransferPayTypeRequest extends TeaModel {
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
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the data synchronization or change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

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
     * <p>The ID of the region where the DTS instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static TransferPayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferPayTypeRequest self = new TransferPayTypeRequest();
        return TeaModel.build(map, self);
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

}

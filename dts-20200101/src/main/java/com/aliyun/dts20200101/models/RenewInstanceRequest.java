// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class RenewInstanceRequest extends TeaModel {
    /**
     * <p>The subscription duration of the DTS instance after renewal. Default value: 1.</p>
     * <br>
     * <p>*   If the **Period** parameter is set to **Year**, the valid values are **1 to 5**.</p>
     * <p>*   If the **Period** parameter is set to **Month**, the valid values are **1 to 60**.</p>
     */
    @NameInMap("BuyCount")
    public String buyCount;

    /**
     * <p>The billing method of the DTS instance. Set the value to **PREPAY**, which indicates the subscription billing method.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the data synchronization or change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The billing cycle of the DTS instance after renewal. Valid values:</p>
     * <br>
     * <p>*   **Year**: annual subscription.</p>
     * <p>*   **Month**: monthly subscription. This is the default value.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceRequest self = new RenewInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewInstanceRequest setBuyCount(String buyCount) {
        this.buyCount = buyCount;
        return this;
    }
    public String getBuyCount() {
        return this.buyCount;
    }

    public RenewInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public RenewInstanceRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public RenewInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public RenewInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

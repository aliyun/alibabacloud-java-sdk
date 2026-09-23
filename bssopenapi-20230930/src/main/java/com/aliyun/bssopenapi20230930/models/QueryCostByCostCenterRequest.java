// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostByCostCenterRequest extends TeaModel {
    /**
     * <p>The billing cycle month in the format of YYYYMM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>202506</p>
     */
    @NameInMap("BillingMonth")
    public Integer billingMonth;

    /**
     * <p>Specifies whether to display data rows with a payable amount of 0.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisplayZeroAmountBills")
    public Boolean displayZeroAmountBills;

    /**
     * <p>Specifies whether to display results grouped by financial unit level.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GroupByCostCenterLevel")
    public Boolean groupByCostCenterLevel;

    /**
     * <p>The cost type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>REQUIRE_AMOUNT</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The account ID of the resource ownership.</p>
     * 
     * <strong>example:</strong>
     * <p>1374729705039203</p>
     */
    @NameInMap("OwnerAccountId")
    public Long ownerAccountId;

    public static QueryCostByCostCenterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCostByCostCenterRequest self = new QueryCostByCostCenterRequest();
        return TeaModel.build(map, self);
    }

    public QueryCostByCostCenterRequest setBillingMonth(Integer billingMonth) {
        this.billingMonth = billingMonth;
        return this;
    }
    public Integer getBillingMonth() {
        return this.billingMonth;
    }

    public QueryCostByCostCenterRequest setDisplayZeroAmountBills(Boolean displayZeroAmountBills) {
        this.displayZeroAmountBills = displayZeroAmountBills;
        return this;
    }
    public Boolean getDisplayZeroAmountBills() {
        return this.displayZeroAmountBills;
    }

    public QueryCostByCostCenterRequest setGroupByCostCenterLevel(Boolean groupByCostCenterLevel) {
        this.groupByCostCenterLevel = groupByCostCenterLevel;
        return this;
    }
    public Boolean getGroupByCostCenterLevel() {
        return this.groupByCostCenterLevel;
    }

    public QueryCostByCostCenterRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public QueryCostByCostCenterRequest setOwnerAccountId(Long ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
        return this;
    }
    public Long getOwnerAccountId() {
        return this.ownerAccountId;
    }

}

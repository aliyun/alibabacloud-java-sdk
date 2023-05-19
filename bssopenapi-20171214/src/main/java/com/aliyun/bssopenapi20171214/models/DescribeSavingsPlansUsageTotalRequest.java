// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageTotalRequest extends TeaModel {
    /**
     * <p>The total amount of the savings plan.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The usage summary.</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The amount that is saved.</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The usage.</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    public static DescribeSavingsPlansUsageTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageTotalRequest self = new DescribeSavingsPlansUsageTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageTotalRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansUsageTotalRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansUsageTotalRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansUsageTotalRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

}

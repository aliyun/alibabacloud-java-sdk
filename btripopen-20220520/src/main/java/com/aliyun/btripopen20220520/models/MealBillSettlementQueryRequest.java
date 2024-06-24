// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealBillSettlementQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page_no")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-02</p>
     */
    @NameInMap("period_end")
    public String periodEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-01</p>
     */
    @NameInMap("period_start")
    public String periodStart;

    public static MealBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        MealBillSettlementQueryRequest self = new MealBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public MealBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public MealBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public MealBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public MealBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

}

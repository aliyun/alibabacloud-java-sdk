// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightBillSettlementQueryRequest extends TeaModel {
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
     * <p>50</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-01</p>
     */
    @NameInMap("period_end")
    public String periodEnd;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-01</p>
     */
    @NameInMap("period_start")
    public String periodStart;

    public static FlightBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightBillSettlementQueryRequest self = new FlightBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public FlightBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public FlightBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FlightBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public FlightBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

}

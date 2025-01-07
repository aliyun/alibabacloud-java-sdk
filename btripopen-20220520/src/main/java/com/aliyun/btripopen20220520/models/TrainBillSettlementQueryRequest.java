// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainBillSettlementQueryRequest extends TeaModel {
    @NameInMap("bill_batch")
    public String billBatch;

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
     * <p>20</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2021-10-02</p>
     */
    @NameInMap("period_end")
    public String periodEnd;

    /**
     * <strong>example:</strong>
     * <p>2021-10-01</p>
     */
    @NameInMap("period_start")
    public String periodStart;

    @NameInMap("scroll_id")
    public String scrollId;

    @NameInMap("scroll_mod")
    public Boolean scrollMod;

    public static TrainBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainBillSettlementQueryRequest self = new TrainBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public TrainBillSettlementQueryRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public TrainBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public TrainBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TrainBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public TrainBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

    public TrainBillSettlementQueryRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public TrainBillSettlementQueryRequest setScrollMod(Boolean scrollMod) {
        this.scrollMod = scrollMod;
        return this;
    }
    public Boolean getScrollMod() {
        return this.scrollMod;
    }

}

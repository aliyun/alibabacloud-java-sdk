// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IeFlightBillSettlementQueryRequest extends TeaModel {
    @NameInMap("apply_id")
    public String applyId;

    @NameInMap("bill_batch")
    public String billBatch;

    @NameInMap("bill_record_time_end")
    public String billRecordTimeEnd;

    @NameInMap("bill_record_time_start")
    public String billRecordTimeStart;

    @NameInMap("order_id")
    public Long orderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("page_no")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("period_end")
    public String periodEnd;

    @NameInMap("period_start")
    public String periodStart;

    @NameInMap("scroll_id")
    public String scrollId;

    @NameInMap("scroll_mod")
    public Boolean scrollMod;

    public static IeFlightBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        IeFlightBillSettlementQueryRequest self = new IeFlightBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public IeFlightBillSettlementQueryRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public IeFlightBillSettlementQueryRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public IeFlightBillSettlementQueryRequest setBillRecordTimeEnd(String billRecordTimeEnd) {
        this.billRecordTimeEnd = billRecordTimeEnd;
        return this;
    }
    public String getBillRecordTimeEnd() {
        return this.billRecordTimeEnd;
    }

    public IeFlightBillSettlementQueryRequest setBillRecordTimeStart(String billRecordTimeStart) {
        this.billRecordTimeStart = billRecordTimeStart;
        return this;
    }
    public String getBillRecordTimeStart() {
        return this.billRecordTimeStart;
    }

    public IeFlightBillSettlementQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public IeFlightBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public IeFlightBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public IeFlightBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public IeFlightBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

    public IeFlightBillSettlementQueryRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public IeFlightBillSettlementQueryRequest setScrollMod(Boolean scrollMod) {
        this.scrollMod = scrollMod;
        return this;
    }
    public Boolean getScrollMod() {
        return this.scrollMod;
    }

}

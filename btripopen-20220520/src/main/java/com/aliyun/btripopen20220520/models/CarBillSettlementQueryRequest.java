// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarBillSettlementQueryRequest extends TeaModel {
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

    public static CarBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CarBillSettlementQueryRequest self = new CarBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public CarBillSettlementQueryRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public CarBillSettlementQueryRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public CarBillSettlementQueryRequest setBillRecordTimeEnd(String billRecordTimeEnd) {
        this.billRecordTimeEnd = billRecordTimeEnd;
        return this;
    }
    public String getBillRecordTimeEnd() {
        return this.billRecordTimeEnd;
    }

    public CarBillSettlementQueryRequest setBillRecordTimeStart(String billRecordTimeStart) {
        this.billRecordTimeStart = billRecordTimeStart;
        return this;
    }
    public String getBillRecordTimeStart() {
        return this.billRecordTimeStart;
    }

    public CarBillSettlementQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public CarBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public CarBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CarBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public CarBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

    public CarBillSettlementQueryRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public CarBillSettlementQueryRequest setScrollMod(Boolean scrollMod) {
        this.scrollMod = scrollMod;
        return this;
    }
    public Boolean getScrollMod() {
        return this.scrollMod;
    }

}

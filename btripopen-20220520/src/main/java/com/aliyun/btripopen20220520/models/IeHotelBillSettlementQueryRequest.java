// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IeHotelBillSettlementQueryRequest extends TeaModel {
    @NameInMap("apply_id")
    public String applyId;

    @NameInMap("bill_batch")
    public String billBatch;

    @NameInMap("bill_record_time_end")
    public String billRecordTimeEnd;

    @NameInMap("bill_record_time_start")
    public String billRecordTimeStart;

    @NameInMap("category")
    public Integer category;

    @NameInMap("order_id")
    public Long orderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("page_no")
    public Integer pageNo;

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

    public static IeHotelBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        IeHotelBillSettlementQueryRequest self = new IeHotelBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public IeHotelBillSettlementQueryRequest setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public IeHotelBillSettlementQueryRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public IeHotelBillSettlementQueryRequest setBillRecordTimeEnd(String billRecordTimeEnd) {
        this.billRecordTimeEnd = billRecordTimeEnd;
        return this;
    }
    public String getBillRecordTimeEnd() {
        return this.billRecordTimeEnd;
    }

    public IeHotelBillSettlementQueryRequest setBillRecordTimeStart(String billRecordTimeStart) {
        this.billRecordTimeStart = billRecordTimeStart;
        return this;
    }
    public String getBillRecordTimeStart() {
        return this.billRecordTimeStart;
    }

    public IeHotelBillSettlementQueryRequest setCategory(Integer category) {
        this.category = category;
        return this;
    }
    public Integer getCategory() {
        return this.category;
    }

    public IeHotelBillSettlementQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public IeHotelBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public IeHotelBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public IeHotelBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public IeHotelBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

    public IeHotelBillSettlementQueryRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public IeHotelBillSettlementQueryRequest setScrollMod(Boolean scrollMod) {
        this.scrollMod = scrollMod;
        return this;
    }
    public Boolean getScrollMod() {
        return this.scrollMod;
    }

}

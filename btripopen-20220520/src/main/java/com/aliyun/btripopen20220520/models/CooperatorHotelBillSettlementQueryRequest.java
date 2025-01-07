// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorHotelBillSettlementQueryRequest extends TeaModel {
    @NameInMap("bill_batch")
    public String billBatch;

    /**
     * <strong>example:</strong>
     * <p>cooperator_alibtrip</p>
     */
    @NameInMap("cooperator_id")
    public String cooperatorId;

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

    public static CooperatorHotelBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CooperatorHotelBillSettlementQueryRequest self = new CooperatorHotelBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public CooperatorHotelBillSettlementQueryRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public CooperatorHotelBillSettlementQueryRequest setCooperatorId(String cooperatorId) {
        this.cooperatorId = cooperatorId;
        return this;
    }
    public String getCooperatorId() {
        return this.cooperatorId;
    }

    public CooperatorHotelBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public CooperatorHotelBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CooperatorHotelBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public CooperatorHotelBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

    public CooperatorHotelBillSettlementQueryRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public CooperatorHotelBillSettlementQueryRequest setScrollMod(Boolean scrollMod) {
        this.scrollMod = scrollMod;
        return this;
    }
    public Boolean getScrollMod() {
        return this.scrollMod;
    }

}

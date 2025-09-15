// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class VasBillSettlementQueryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20250501</p>
     */
    @NameInMap("bill_batch")
    public String billBatch;

    /**
     * <strong>example:</strong>
     * <p>cooperator_alibtrip</p>
     */
    @NameInMap("cooperator_id")
    public String cooperatorId;

    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("order_id")
    public Long orderId;

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
     * <p>30</p>
     */
    @NameInMap("page_size")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2022-07-01</p>
     */
    @NameInMap("period_end")
    public String periodEnd;

    /**
     * <strong>example:</strong>
     * <p>2021-10-01</p>
     */
    @NameInMap("period_start")
    public String periodStart;

    /**
     * <strong>example:</strong>
     * <p>CAESBgoEIgIIABgAIhkKFwMSAAAAMUw4MDAwMDAwMDA3MjdkMzgw</p>
     */
    @NameInMap("scroll_id")
    public String scrollId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("scroll_mod")
    public Boolean scrollMod;

    public static VasBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        VasBillSettlementQueryRequest self = new VasBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public VasBillSettlementQueryRequest setBillBatch(String billBatch) {
        this.billBatch = billBatch;
        return this;
    }
    public String getBillBatch() {
        return this.billBatch;
    }

    public VasBillSettlementQueryRequest setCooperatorId(String cooperatorId) {
        this.cooperatorId = cooperatorId;
        return this;
    }
    public String getCooperatorId() {
        return this.cooperatorId;
    }

    public VasBillSettlementQueryRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public VasBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public VasBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public VasBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public VasBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

    public VasBillSettlementQueryRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public VasBillSettlementQueryRequest setScrollMod(Boolean scrollMod) {
        this.scrollMod = scrollMod;
        return this;
    }
    public Boolean getScrollMod() {
        return this.scrollMod;
    }

}

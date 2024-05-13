// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorHotelBillSettlementQueryRequest extends TeaModel {
    @NameInMap("cooperator_id")
    public String cooperatorId;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("period_end")
    public String periodEnd;

    @NameInMap("period_start")
    public String periodStart;

    public static CooperatorHotelBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CooperatorHotelBillSettlementQueryRequest self = new CooperatorHotelBillSettlementQueryRequest();
        return TeaModel.build(map, self);
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

}

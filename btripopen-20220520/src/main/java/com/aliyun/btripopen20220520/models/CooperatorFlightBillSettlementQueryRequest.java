// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorFlightBillSettlementQueryRequest extends TeaModel {
    @NameInMap("cooperator_id")
    public String cooperatorId;

    @NameInMap("page_no")
    public Integer pageNo;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("period_end")
    public String periodEnd;

    @NameInMap("period_start")
    public String periodStart;

    public static CooperatorFlightBillSettlementQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        CooperatorFlightBillSettlementQueryRequest self = new CooperatorFlightBillSettlementQueryRequest();
        return TeaModel.build(map, self);
    }

    public CooperatorFlightBillSettlementQueryRequest setCooperatorId(String cooperatorId) {
        this.cooperatorId = cooperatorId;
        return this;
    }
    public String getCooperatorId() {
        return this.cooperatorId;
    }

    public CooperatorFlightBillSettlementQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public CooperatorFlightBillSettlementQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CooperatorFlightBillSettlementQueryRequest setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }
    public String getPeriodEnd() {
        return this.periodEnd;
    }

    public CooperatorFlightBillSettlementQueryRequest setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
        return this;
    }
    public String getPeriodStart() {
        return this.periodStart;
    }

}

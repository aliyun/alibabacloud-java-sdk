// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GeneralBillPageResult extends TeaModel {
    @NameInMap("generalBills")
    public java.util.List<GeneralBill> generalBills;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static GeneralBillPageResult build(java.util.Map<String, ?> map) throws Exception {
        GeneralBillPageResult self = new GeneralBillPageResult();
        return TeaModel.build(map, self);
    }

    public GeneralBillPageResult setGeneralBills(java.util.List<GeneralBill> generalBills) {
        this.generalBills = generalBills;
        return this;
    }
    public java.util.List<GeneralBill> getGeneralBills() {
        return this.generalBills;
    }

    public GeneralBillPageResult setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GeneralBillPageResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GeneralBillPageResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GeneralBillPageResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}

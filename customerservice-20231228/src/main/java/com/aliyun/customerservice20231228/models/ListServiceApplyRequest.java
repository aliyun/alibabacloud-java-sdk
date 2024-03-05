// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListServiceApplyRequest extends TeaModel {
    @NameInMap("applyType")
    public java.util.List<String> applyType;

    @NameInMap("endDate")
    public Long endDate;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("productCode")
    public Integer productCode;

    @NameInMap("startDate")
    public Long startDate;

    @NameInMap("status")
    public String status;

    public static ListServiceApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceApplyRequest self = new ListServiceApplyRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceApplyRequest setApplyType(java.util.List<String> applyType) {
        this.applyType = applyType;
        return this;
    }
    public java.util.List<String> getApplyType() {
        return this.applyType;
    }

    public ListServiceApplyRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public ListServiceApplyRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListServiceApplyRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListServiceApplyRequest setProductCode(Integer productCode) {
        this.productCode = productCode;
        return this;
    }
    public Integer getProductCode() {
        return this.productCode;
    }

    public ListServiceApplyRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public ListServiceApplyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

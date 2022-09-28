// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetOrderListRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("IsStronger")
    public Integer isStronger;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RamUid")
    public Long ramUid;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Status")
    public Long status;

    @NameInMap("TimeType")
    public Integer timeType;

    public static GetOrderListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderListRequest self = new GetOrderListRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderListRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetOrderListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOrderListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetOrderListRequest setIsStronger(Integer isStronger) {
        this.isStronger = isStronger;
        return this;
    }
    public Integer getIsStronger() {
        return this.isStronger;
    }

    public GetOrderListRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetOrderListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOrderListRequest setRamUid(Long ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public Long getRamUid() {
        return this.ramUid;
    }

    public GetOrderListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetOrderListRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public GetOrderListRequest setTimeType(Integer timeType) {
        this.timeType = timeType;
        return this;
    }
    public Integer getTimeType() {
        return this.timeType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetBillListRequest extends TeaModel {
    @NameInMap("AliyunPk")
    public Long aliyunPk;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("InstId")
    public String instId;

    @NameInMap("IsStronger")
    public Integer isStronger;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PayStatus")
    public Long payStatus;

    @NameInMap("RamUid")
    public Long ramUid;

    @NameInMap("StartDate")
    public String startDate;

    public static GetBillListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBillListRequest self = new GetBillListRequest();
        return TeaModel.build(map, self);
    }

    public GetBillListRequest setAliyunPk(Long aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public Long getAliyunPk() {
        return this.aliyunPk;
    }

    public GetBillListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetBillListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetBillListRequest setInstId(String instId) {
        this.instId = instId;
        return this;
    }
    public String getInstId() {
        return this.instId;
    }

    public GetBillListRequest setIsStronger(Integer isStronger) {
        this.isStronger = isStronger;
        return this;
    }
    public Integer getIsStronger() {
        return this.isStronger;
    }

    public GetBillListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetBillListRequest setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public Long getPayStatus() {
        return this.payStatus;
    }

    public GetBillListRequest setRamUid(Long ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public Long getRamUid() {
        return this.ramUid;
    }

    public GetBillListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}

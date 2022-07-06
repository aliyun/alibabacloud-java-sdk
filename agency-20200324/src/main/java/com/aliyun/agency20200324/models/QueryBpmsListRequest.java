// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20200324.models;

import com.aliyun.tea.*;

public class QueryBpmsListRequest extends TeaModel {
    @NameInMap("AuditStatus")
    public String auditStatus;

    @NameInMap("BpmsType")
    public String bpmsType;

    @NameInMap("CustomerName")
    public String customerName;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PartnerId")
    public Long partnerId;

    @NameInMap("TimeEnd")
    public String timeEnd;

    @NameInMap("TimeStart")
    public String timeStart;

    public static QueryBpmsListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBpmsListRequest self = new QueryBpmsListRequest();
        return TeaModel.build(map, self);
    }

    public QueryBpmsListRequest setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public QueryBpmsListRequest setBpmsType(String bpmsType) {
        this.bpmsType = bpmsType;
        return this;
    }
    public String getBpmsType() {
        return this.bpmsType;
    }

    public QueryBpmsListRequest setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public QueryBpmsListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryBpmsListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBpmsListRequest setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    public Long getPartnerId() {
        return this.partnerId;
    }

    public QueryBpmsListRequest setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public String getTimeEnd() {
        return this.timeEnd;
    }

    public QueryBpmsListRequest setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public String getTimeStart() {
        return this.timeStart;
    }

}

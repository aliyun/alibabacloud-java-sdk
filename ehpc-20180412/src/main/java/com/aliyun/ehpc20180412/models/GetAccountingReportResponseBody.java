// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAccountingReportResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCoreTime")
    public Integer totalCoreTime;

    @NameInMap("Data")
    public java.util.List<String> data;

    public static GetAccountingReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountingReportResponseBody self = new GetAccountingReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountingReportResponseBody setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public GetAccountingReportResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetAccountingReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountingReportResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAccountingReportResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetAccountingReportResponseBody setTotalCoreTime(Integer totalCoreTime) {
        this.totalCoreTime = totalCoreTime;
        return this;
    }
    public Integer getTotalCoreTime() {
        return this.totalCoreTime;
    }

    public GetAccountingReportResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

}

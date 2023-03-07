// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetAccountingReportResponseBody extends TeaModel {
    /**
     * <p>The list serialized in the JSON format. The list contains multiple records.</p>
     */
    @NameInMap("Data")
    public GetAccountingReportResponseBodyData data;

    /**
     * <p>The list serialized in the JSON format. The list contains the column names of each record in the Data.</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of CPU cores in the queried cluster.</p>
     */
    @NameInMap("TotalCoreTime")
    public Integer totalCoreTime;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetAccountingReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountingReportResponseBody self = new GetAccountingReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountingReportResponseBody setData(GetAccountingReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccountingReportResponseBodyData getData() {
        return this.data;
    }

    public GetAccountingReportResponseBody setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public GetAccountingReportResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetAccountingReportResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAccountingReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountingReportResponseBody setTotalCoreTime(Integer totalCoreTime) {
        this.totalCoreTime = totalCoreTime;
        return this;
    }
    public Integer getTotalCoreTime() {
        return this.totalCoreTime;
    }

    public GetAccountingReportResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetAccountingReportResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        public static GetAccountingReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccountingReportResponseBodyData self = new GetAccountingReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccountingReportResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}

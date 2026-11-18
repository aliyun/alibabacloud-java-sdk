// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class ListProductReportsResponseBody extends TeaModel {
    /**
     * <p>The query results of the periodic report list, which includes the Reports array. The array is empty if no available reports exist.</p>
     */
    @NameInMap("Data")
    public ListProductReportsResponseBodyData data;

    /**
     * <p>The unique identity of the request, which is used for Tracing Analysis and troubleshooting. Provide this identity when troubleshooting exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>9634F2B3-B59C-5475-BA9F-96D95271882C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProductReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductReportsResponseBody self = new ListProductReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductReportsResponseBody setData(ListProductReportsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductReportsResponseBodyData getData() {
        return this.data;
    }

    public ListProductReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductReportsResponseBodyDataReports extends TeaModel {
        /**
         * <p>The end time of the natural week to which the report belongs, exclusive. The natural week ends at 00:00:00 on the following Monday in UTC+8 (Asia/Shanghai). This field is transformed to UTC RFC 3339 format and ends with Z. The example corresponds to 00:00:00 on Monday, November 9, 2026, UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-08T16:00:00Z</p>
         */
        @NameInMap("PeriodEnd")
        public String periodEnd;

        /**
         * <p>The start time of the natural week to which the report belongs, inclusive. The natural week is calculated based on UTC+8 (Asia/Shanghai) and starts at 00:00:00 on Monday. This field is transformed to UTC RFC 3339 format and ends with Z. The example corresponds to 00:00:00 on Monday, November 2, 2026, UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-01T16:00:00Z</p>
         */
        @NameInMap("PeriodStart")
        public String periodStart;

        /**
         * <p>The product code of the data product to which the report belongs. This is consistent with the ProductCode of the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudsec.demo.v1</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The unique ID of the periodic report. Pass this value as the reportId parameter to GetAiReport to query the current status of the report and obtain the download URL when it is available.</p>
         * 
         * <strong>example:</strong>
         * <p>report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        public static ListProductReportsResponseBodyDataReports build(java.util.Map<String, ?> map) throws Exception {
            ListProductReportsResponseBodyDataReports self = new ListProductReportsResponseBodyDataReports();
            return TeaModel.build(map, self);
        }

        public ListProductReportsResponseBodyDataReports setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public ListProductReportsResponseBodyDataReports setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public ListProductReportsResponseBodyDataReports setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListProductReportsResponseBodyDataReports setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

    }

    public static class ListProductReportsResponseBodyData extends TeaModel {
        /**
         * <p>The available report records sorted by period in descending order. By default, up to ten records are returned. If LatestOnly is set to true, at most one record is returned. The array is empty if no reports exist. A single natural week may have multiple report records; use ReportId to distinguish them. The list does not contain download URLs. The actual download status is subject to GetAiReport.</p>
         */
        @NameInMap("Reports")
        public java.util.List<ListProductReportsResponseBodyDataReports> reports;

        public static ListProductReportsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductReportsResponseBodyData self = new ListProductReportsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductReportsResponseBodyData setReports(java.util.List<ListProductReportsResponseBodyDataReports> reports) {
            this.reports = reports;
            return this;
        }
        public java.util.List<ListProductReportsResponseBodyDataReports> getReports() {
            return this.reports;
        }

    }

}

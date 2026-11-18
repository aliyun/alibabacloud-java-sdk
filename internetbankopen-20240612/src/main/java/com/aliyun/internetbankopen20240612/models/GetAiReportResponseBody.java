// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.internetbankopen20240612.models;

import com.aliyun.tea.*;

public class GetAiReportResponseBody extends TeaModel {
    /**
     * <p>The report query result, which contains ReportStatus. The Report object is included only when the report is available.</p>
     */
    @NameInMap("Data")
    public GetAiReportResponseBodyData data;

    /**
     * <p>The unique identity of the request, which is used for Tracing Analysis and troubleshooting. Provide this ID when you troubleshoot exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>9634F2B3-B59C-5475-BA9F-96D95271882C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAiReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiReportResponseBody self = new GetAiReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiReportResponseBody setData(GetAiReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiReportResponseBodyData getData() {
        return this.data;
    }

    public GetAiReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAiReportResponseBodyDataReport extends TeaModel {
        /**
         * <p>The expiration time of the report content retention period. The time is in UTC RFC 3339 format, ends with Z, and may contain fractional seconds. No download URL is issued after this time. If the delivery is not suspended, EXPIRED is returned. If the delivery is also suspended, UNAVAILABLE is returned preferentially. This is the content expiration time, not the expiration time of a single URL.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-12T06:20:00Z</p>
         */
        @NameInMap("ContentExpiresAt")
        public String contentExpiresAt;

        /**
         * <p>The temporary signed download URL. Use the URL before UrlExpiresAt. The validity period of the signed URL does not exceed 300 seconds and is no later than ContentExpiresAt. If the URL expires but the content has not expired, you can query again to obtain a new URL. The example only shows the URL format and is not a real downloadable link. Use the complete URL in the actual response. Do not concatenate the URL yourself or share it publicly.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://reports.example.com/report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a.pdf">https://reports.example.com/report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a.pdf</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The unique ID of the report. You can use this ID as the reportId parameter to query the report again. This is the report asset ID, not an internal task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>report-3f2b8c1e-6d4a-4b7e-9a1c-2e5f7d8b9c0a</p>
         */
        @NameInMap("ReportId")
        public String reportId;

        /**
         * <p>The expiration time of the current DownloadUrl. The time is in UTC RFC 3339 format, ends with Z, and may contain fractional seconds. You cannot use the URL after it expires, and this time is no later than ContentExpiresAt.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-12T06:25:00Z</p>
         */
        @NameInMap("UrlExpiresAt")
        public String urlExpiresAt;

        public static GetAiReportResponseBodyDataReport build(java.util.Map<String, ?> map) throws Exception {
            GetAiReportResponseBodyDataReport self = new GetAiReportResponseBodyDataReport();
            return TeaModel.build(map, self);
        }

        public GetAiReportResponseBodyDataReport setContentExpiresAt(String contentExpiresAt) {
            this.contentExpiresAt = contentExpiresAt;
            return this;
        }
        public String getContentExpiresAt() {
            return this.contentExpiresAt;
        }

        public GetAiReportResponseBodyDataReport setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetAiReportResponseBodyDataReport setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public GetAiReportResponseBodyDataReport setUrlExpiresAt(String urlExpiresAt) {
            this.urlExpiresAt = urlExpiresAt;
            return this;
        }
        public String getUrlExpiresAt() {
            return this.urlExpiresAt;
        }

    }

    public static class GetAiReportResponseBodyData extends TeaModel {
        /**
         * <p>The download information of the available report, which is returned only when ReportStatus is AVAILABLE. The report ownership and the corresponding object version are verified before the download.</p>
         */
        @NameInMap("Report")
        public GetAiReportResponseBodyDataReport report;

        /**
         * <p>The report status. Valid values:</p>
         * <ul>
         * <li>NOT_APPLICABLE: The product does not include a report.</li>
         * <li>WAITING_DATA: The data call result is not determined.</li>
         * <li>NO_DATA: No data is found, and no per-use report is generated.</li>
         * <li>WAITING_PERIOD: The query result for the callId of a periodic product. You must obtain the ReportId by calling ListProductReports and then query the report.</li>
         * <li>QUEUED: The report task is queued.</li>
         * <li>RUNNING: The report task is being processed.</li>
         * <li>AVAILABLE: The report is available, and the Report object is returned in this response.</li>
         * <li>FAILED: The data call or report generation failed.</li>
         * <li>EXPIRED: The report content has expired.</li>
         * <li>UNAVAILABLE: The delivery of the report is suspended.</li>
         * </ul>
         * <p>You can query again later by using the same ID when the status is WAITING_DATA, QUEUED, or RUNNING. Repeated queries do not regenerate the report when the status is FAILED. The Report object is not returned unless the status is AVAILABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        public static GetAiReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiReportResponseBodyData self = new GetAiReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiReportResponseBodyData setReport(GetAiReportResponseBodyDataReport report) {
            this.report = report;
            return this;
        }
        public GetAiReportResponseBodyDataReport getReport() {
            return this.report;
        }

        public GetAiReportResponseBodyData setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

    }

}

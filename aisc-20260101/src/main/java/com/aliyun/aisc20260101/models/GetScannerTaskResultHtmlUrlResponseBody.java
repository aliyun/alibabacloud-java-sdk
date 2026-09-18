// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetScannerTaskResultHtmlUrlResponseBody extends TeaModel {
    /**
     * <p>The query result, which contains the temporary download URL for the HTML result report.</p>
     */
    @NameInMap("Data")
    public GetScannerTaskResultHtmlUrlResponseBodyData data;

    /**
     * <p>The request ID, which is used for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetScannerTaskResultHtmlUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScannerTaskResultHtmlUrlResponseBody self = new GetScannerTaskResultHtmlUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScannerTaskResultHtmlUrlResponseBody setData(GetScannerTaskResultHtmlUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScannerTaskResultHtmlUrlResponseBodyData getData() {
        return this.data;
    }

    public GetScannerTaskResultHtmlUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScannerTaskResultHtmlUrlResponseBodyData extends TeaModel {
        /**
         * <p>The temporary download URL for the HTML result report. The URL is valid for 2 hours. After the URL expires, call this operation again to obtain a new URL. If the report has not been generated, this value is an empty string. The actual value is a signed temporary URL from object storage that includes signature parameters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/result.task-abc123def4567.report.html">https://example.com/result.task-abc123def4567.report.html</a></p>
         */
        @NameInMap("ScannerTaskResultHtmlDownloadUrl")
        public String scannerTaskResultHtmlDownloadUrl;

        public static GetScannerTaskResultHtmlUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScannerTaskResultHtmlUrlResponseBodyData self = new GetScannerTaskResultHtmlUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScannerTaskResultHtmlUrlResponseBodyData setScannerTaskResultHtmlDownloadUrl(String scannerTaskResultHtmlDownloadUrl) {
            this.scannerTaskResultHtmlDownloadUrl = scannerTaskResultHtmlDownloadUrl;
            return this;
        }
        public String getScannerTaskResultHtmlDownloadUrl() {
            return this.scannerTaskResultHtmlDownloadUrl;
        }

    }

}

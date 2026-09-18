// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetScannerTaskHitDataUrlResponseBody extends TeaModel {
    /**
     * <p>The query result, which contains the task identifier and the temporary download URL for the hit data.</p>
     */
    @NameInMap("Data")
    public GetScannerTaskHitDataUrlResponseBodyData data;

    /**
     * <p>The request ID. You can use this ID for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>1EBD0C05-6C1F-4C95-9C63-B7AB7B5A9C8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetScannerTaskHitDataUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScannerTaskHitDataUrlResponseBody self = new GetScannerTaskHitDataUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScannerTaskHitDataUrlResponseBody setData(GetScannerTaskHitDataUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScannerTaskHitDataUrlResponseBodyData getData() {
        return this.data;
    }

    public GetScannerTaskHitDataUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScannerTaskHitDataUrlResponseBodyData extends TeaModel {
        /**
         * <p>The temporary download URL for the attack hit data (hits.csv). The URL is valid for 2 hours. After the URL expires, call this operation again to obtain a new URL. If the task is an existing task or the agent execution mode does not produce hit data, this parameter is an empty string. The actual value is a signed temporary URL of Object Storage Service (OSS) that contains signature parameters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/result.task-abc123def4567.hits.csv">https://example.com/result.task-abc123def4567.hits.csv</a></p>
         */
        @NameInMap("ScannerTaskHitDataDownloadUrl")
        public String scannerTaskHitDataDownloadUrl;

        /**
         * <p>The scan task identifier echoed from the request.</p>
         * 
         * <strong>example:</strong>
         * <p>task-abc123def4567</p>
         */
        @NameInMap("ScannerTaskId")
        public String scannerTaskId;

        public static GetScannerTaskHitDataUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScannerTaskHitDataUrlResponseBodyData self = new GetScannerTaskHitDataUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScannerTaskHitDataUrlResponseBodyData setScannerTaskHitDataDownloadUrl(String scannerTaskHitDataDownloadUrl) {
            this.scannerTaskHitDataDownloadUrl = scannerTaskHitDataDownloadUrl;
            return this;
        }
        public String getScannerTaskHitDataDownloadUrl() {
            return this.scannerTaskHitDataDownloadUrl;
        }

        public GetScannerTaskHitDataUrlResponseBodyData setScannerTaskId(String scannerTaskId) {
            this.scannerTaskId = scannerTaskId;
            return this;
        }
        public String getScannerTaskId() {
            return this.scannerTaskId;
        }

    }

}

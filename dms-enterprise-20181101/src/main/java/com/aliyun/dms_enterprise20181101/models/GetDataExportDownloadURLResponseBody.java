// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportDownloadURLResponseBody extends TeaModel {
    /**
     * <p>The details about the download URL of the file that records the export results for the ticket.</p>
     */
    @NameInMap("DownloadURLResult")
    public GetDataExportDownloadURLResponseBodyDownloadURLResult downloadURLResult;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4BF24EA5-9013-4C85-AE68-6C23AF5E0097</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataExportDownloadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportDownloadURLResponseBody self = new GetDataExportDownloadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataExportDownloadURLResponseBody setDownloadURLResult(GetDataExportDownloadURLResponseBodyDownloadURLResult downloadURLResult) {
        this.downloadURLResult = downloadURLResult;
        return this;
    }
    public GetDataExportDownloadURLResponseBodyDownloadURLResult getDownloadURLResult() {
        return this.downloadURLResult;
    }

    public GetDataExportDownloadURLResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataExportDownloadURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataExportDownloadURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataExportDownloadURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataExportDownloadURLResponseBodyDownloadURLResult extends TeaModel {
        /**
         * <p>Indicates whether export results are available for download. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Export results are available for download.</li>
         * <li><strong>false</strong>: No export results are available for download.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasResult")
        public Boolean hasResult;

        /**
         * <p>The message that indicates an exception.</p>
         * 
         * <strong>example:</strong>
         * <p>tip message</p>
         */
        @NameInMap("TipMessage")
        public String tipMessage;

        /**
         * <p>The download URL of the file that records the export results for the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dms-idb-hangzhou.oss-cn-hangzhou.aliyuncs.com/xxx.zip">https://dms-idb-hangzhou.oss-cn-hangzhou.aliyuncs.com/xxx.zip</a></p>
         */
        @NameInMap("URL")
        public String URL;

        public static GetDataExportDownloadURLResponseBodyDownloadURLResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataExportDownloadURLResponseBodyDownloadURLResult self = new GetDataExportDownloadURLResponseBodyDownloadURLResult();
            return TeaModel.build(map, self);
        }

        public GetDataExportDownloadURLResponseBodyDownloadURLResult setHasResult(Boolean hasResult) {
            this.hasResult = hasResult;
            return this;
        }
        public Boolean getHasResult() {
            return this.hasResult;
        }

        public GetDataExportDownloadURLResponseBodyDownloadURLResult setTipMessage(String tipMessage) {
            this.tipMessage = tipMessage;
            return this;
        }
        public String getTipMessage() {
            return this.tipMessage;
        }

        public GetDataExportDownloadURLResponseBodyDownloadURLResult setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}

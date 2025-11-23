// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDbExportDownloadURLResponseBody extends TeaModel {
    /**
     * <p>The download URL of the exported file.</p>
     */
    @NameInMap("DownloadURLResult")
    public GetDbExportDownloadURLResponseBodyDownloadURLResult downloadURLResult;

    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request succeeded.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDbExportDownloadURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDbExportDownloadURLResponseBody self = new GetDbExportDownloadURLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDbExportDownloadURLResponseBody setDownloadURLResult(GetDbExportDownloadURLResponseBodyDownloadURLResult downloadURLResult) {
        this.downloadURLResult = downloadURLResult;
        return this;
    }
    public GetDbExportDownloadURLResponseBodyDownloadURLResult getDownloadURLResult() {
        return this.downloadURLResult;
    }

    public GetDbExportDownloadURLResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDbExportDownloadURLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDbExportDownloadURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDbExportDownloadURLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDbExportDownloadURLResponseBodyDownloadURLResult extends TeaModel {
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
         * <p>The download URL of the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dms-idb-hangzhou.oss-cn-hangzhou.aliyuncs.com/xxx.zip">https://dms-idb-hangzhou.oss-cn-hangzhou.aliyuncs.com/xxx.zip</a></p>
         */
        @NameInMap("URL")
        public String URL;

        public static GetDbExportDownloadURLResponseBodyDownloadURLResult build(java.util.Map<String, ?> map) throws Exception {
            GetDbExportDownloadURLResponseBodyDownloadURLResult self = new GetDbExportDownloadURLResponseBodyDownloadURLResult();
            return TeaModel.build(map, self);
        }

        public GetDbExportDownloadURLResponseBodyDownloadURLResult setHasResult(Boolean hasResult) {
            this.hasResult = hasResult;
            return this;
        }
        public Boolean getHasResult() {
            return this.hasResult;
        }

        public GetDbExportDownloadURLResponseBodyDownloadURLResult setTipMessage(String tipMessage) {
            this.tipMessage = tipMessage;
            return this;
        }
        public String getTipMessage() {
            return this.tipMessage;
        }

        public GetDbExportDownloadURLResponseBodyDownloadURLResult setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

}

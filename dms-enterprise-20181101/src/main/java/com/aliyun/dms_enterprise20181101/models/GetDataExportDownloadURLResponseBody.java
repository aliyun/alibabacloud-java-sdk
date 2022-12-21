// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportDownloadURLResponseBody extends TeaModel {
    // The details about the download URL of the file that records the export results for the ticket.
    @NameInMap("DownloadURLResult")
    public GetDataExportDownloadURLResponseBodyDownloadURLResult downloadURLResult;

    // The error code.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
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
        // Indicates whether export results are available for download. Valid values:
        // 
        // *   **true**: Export results are available for download.
        // *   **false**: No export results are available for download.
        @NameInMap("HasResult")
        public Boolean hasResult;

        // The message that indicates an exception.
        @NameInMap("TipMessage")
        public String tipMessage;

        // The download URL of the file that records the export results for the ticket.
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

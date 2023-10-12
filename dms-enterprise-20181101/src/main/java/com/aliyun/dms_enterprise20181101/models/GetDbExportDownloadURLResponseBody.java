// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDbExportDownloadURLResponseBody extends TeaModel {
    @NameInMap("DownloadURLResult")
    public GetDbExportDownloadURLResponseBodyDownloadURLResult downloadURLResult;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("HasResult")
        public Boolean hasResult;

        @NameInMap("TipMessage")
        public String tipMessage;

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

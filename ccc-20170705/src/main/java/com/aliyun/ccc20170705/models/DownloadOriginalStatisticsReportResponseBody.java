// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadOriginalStatisticsReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DownloadParams")
    public DownloadOriginalStatisticsReportResponseBodyDownloadParams downloadParams;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DownloadOriginalStatisticsReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadOriginalStatisticsReportResponseBody self = new DownloadOriginalStatisticsReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadOriginalStatisticsReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadOriginalStatisticsReportResponseBody setDownloadParams(DownloadOriginalStatisticsReportResponseBodyDownloadParams downloadParams) {
        this.downloadParams = downloadParams;
        return this;
    }
    public DownloadOriginalStatisticsReportResponseBodyDownloadParams getDownloadParams() {
        return this.downloadParams;
    }

    public DownloadOriginalStatisticsReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadOriginalStatisticsReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadOriginalStatisticsReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadOriginalStatisticsReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadOriginalStatisticsReportResponseBodyDownloadParams extends TeaModel {
        @NameInMap("SignatureUrl")
        public String signatureUrl;

        public static DownloadOriginalStatisticsReportResponseBodyDownloadParams build(java.util.Map<String, ?> map) throws Exception {
            DownloadOriginalStatisticsReportResponseBodyDownloadParams self = new DownloadOriginalStatisticsReportResponseBodyDownloadParams();
            return TeaModel.build(map, self);
        }

        public DownloadOriginalStatisticsReportResponseBodyDownloadParams setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

    }

}

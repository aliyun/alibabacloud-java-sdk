// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadCabRecordingResponseBody extends TeaModel {
    @NameInMap("MediaDownloadParam")
    public DownloadCabRecordingResponseBodyMediaDownloadParam mediaDownloadParam;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static DownloadCabRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadCabRecordingResponseBody self = new DownloadCabRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadCabRecordingResponseBody setMediaDownloadParam(DownloadCabRecordingResponseBodyMediaDownloadParam mediaDownloadParam) {
        this.mediaDownloadParam = mediaDownloadParam;
        return this;
    }
    public DownloadCabRecordingResponseBodyMediaDownloadParam getMediaDownloadParam() {
        return this.mediaDownloadParam;
    }

    public DownloadCabRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadCabRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadCabRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadCabRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadCabRecordingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadCabRecordingResponseBodyMediaDownloadParam extends TeaModel {
        @NameInMap("SignatureUrl")
        public String signatureUrl;

        @NameInMap("FileName")
        public String fileName;

        public static DownloadCabRecordingResponseBodyMediaDownloadParam build(java.util.Map<String, ?> map) throws Exception {
            DownloadCabRecordingResponseBodyMediaDownloadParam self = new DownloadCabRecordingResponseBodyMediaDownloadParam();
            return TeaModel.build(map, self);
        }

        public DownloadCabRecordingResponseBodyMediaDownloadParam setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

        public DownloadCabRecordingResponseBodyMediaDownloadParam setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}

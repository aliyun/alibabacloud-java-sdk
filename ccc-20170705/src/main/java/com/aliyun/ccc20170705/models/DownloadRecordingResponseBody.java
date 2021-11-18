// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MediaDownloadParam")
    public DownloadRecordingResponseBodyMediaDownloadParam mediaDownloadParam;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DownloadRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingResponseBody self = new DownloadRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadRecordingResponseBody setMediaDownloadParam(DownloadRecordingResponseBodyMediaDownloadParam mediaDownloadParam) {
        this.mediaDownloadParam = mediaDownloadParam;
        return this;
    }
    public DownloadRecordingResponseBodyMediaDownloadParam getMediaDownloadParam() {
        return this.mediaDownloadParam;
    }

    public DownloadRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadRecordingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadRecordingResponseBodyMediaDownloadParam extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("SignatureUrl")
        public String signatureUrl;

        public static DownloadRecordingResponseBodyMediaDownloadParam build(java.util.Map<String, ?> map) throws Exception {
            DownloadRecordingResponseBodyMediaDownloadParam self = new DownloadRecordingResponseBodyMediaDownloadParam();
            return TeaModel.build(map, self);
        }

        public DownloadRecordingResponseBodyMediaDownloadParam setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DownloadRecordingResponseBodyMediaDownloadParam setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

    }

}

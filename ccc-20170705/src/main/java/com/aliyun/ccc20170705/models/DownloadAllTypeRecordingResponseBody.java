// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadAllTypeRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MediaDownloadParamList")
    public DownloadAllTypeRecordingResponseBodyMediaDownloadParamList mediaDownloadParamList;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DownloadAllTypeRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadAllTypeRecordingResponseBody self = new DownloadAllTypeRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadAllTypeRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DownloadAllTypeRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadAllTypeRecordingResponseBody setMediaDownloadParamList(DownloadAllTypeRecordingResponseBodyMediaDownloadParamList mediaDownloadParamList) {
        this.mediaDownloadParamList = mediaDownloadParamList;
        return this;
    }
    public DownloadAllTypeRecordingResponseBodyMediaDownloadParamList getMediaDownloadParamList() {
        return this.mediaDownloadParamList;
    }

    public DownloadAllTypeRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DownloadAllTypeRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadAllTypeRecordingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("SignatureUrl")
        public String signatureUrl;

        public static DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam build(java.util.Map<String, ?> map) throws Exception {
            DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam self = new DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam();
            return TeaModel.build(map, self);
        }

        public DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

    }

    public static class DownloadAllTypeRecordingResponseBodyMediaDownloadParamList extends TeaModel {
        @NameInMap("MediaDownloadParam")
        public java.util.List<DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam> mediaDownloadParam;

        public static DownloadAllTypeRecordingResponseBodyMediaDownloadParamList build(java.util.Map<String, ?> map) throws Exception {
            DownloadAllTypeRecordingResponseBodyMediaDownloadParamList self = new DownloadAllTypeRecordingResponseBodyMediaDownloadParamList();
            return TeaModel.build(map, self);
        }

        public DownloadAllTypeRecordingResponseBodyMediaDownloadParamList setMediaDownloadParam(java.util.List<DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam> mediaDownloadParam) {
            this.mediaDownloadParam = mediaDownloadParam;
            return this;
        }
        public java.util.List<DownloadAllTypeRecordingResponseBodyMediaDownloadParamListMediaDownloadParam> getMediaDownloadParam() {
            return this.mediaDownloadParam;
        }

    }

}

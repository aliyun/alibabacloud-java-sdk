// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetVoicemailRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetVoicemailRecordingResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVoicemailRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVoicemailRecordingResponseBody self = new GetVoicemailRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVoicemailRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVoicemailRecordingResponseBody setData(GetVoicemailRecordingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVoicemailRecordingResponseBodyData getData() {
        return this.data;
    }

    public GetVoicemailRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVoicemailRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVoicemailRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVoicemailRecordingResponseBodyData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetVoicemailRecordingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVoicemailRecordingResponseBodyData self = new GetVoicemailRecordingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVoicemailRecordingResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetVoicemailRecordingResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}

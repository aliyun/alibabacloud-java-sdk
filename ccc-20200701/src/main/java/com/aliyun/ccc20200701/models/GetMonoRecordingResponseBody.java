// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetMonoRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMonoRecordingResponseBodyData data;

    public static GetMonoRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonoRecordingResponseBody self = new GetMonoRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonoRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMonoRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMonoRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMonoRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMonoRecordingResponseBody setData(GetMonoRecordingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMonoRecordingResponseBodyData getData() {
        return this.data;
    }

    public static class GetMonoRecordingResponseBodyData extends TeaModel {
        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("FileName")
        public String fileName;

        public static GetMonoRecordingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMonoRecordingResponseBodyData self = new GetMonoRecordingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMonoRecordingResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetMonoRecordingResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}

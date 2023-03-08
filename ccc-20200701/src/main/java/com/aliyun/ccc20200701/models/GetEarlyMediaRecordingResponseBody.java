// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetEarlyMediaRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEarlyMediaRecordingResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetEarlyMediaRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEarlyMediaRecordingResponseBody self = new GetEarlyMediaRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEarlyMediaRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEarlyMediaRecordingResponseBody setData(GetEarlyMediaRecordingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEarlyMediaRecordingResponseBodyData getData() {
        return this.data;
    }

    public GetEarlyMediaRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetEarlyMediaRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEarlyMediaRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEarlyMediaRecordingResponseBodyData extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetEarlyMediaRecordingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEarlyMediaRecordingResponseBodyData self = new GetEarlyMediaRecordingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEarlyMediaRecordingResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetEarlyMediaRecordingResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}

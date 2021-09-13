// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetMultiChannelRecordingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMultiChannelRecordingResponseBodyData data;

    public static GetMultiChannelRecordingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiChannelRecordingResponseBody self = new GetMultiChannelRecordingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiChannelRecordingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMultiChannelRecordingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMultiChannelRecordingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMultiChannelRecordingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiChannelRecordingResponseBody setData(GetMultiChannelRecordingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMultiChannelRecordingResponseBodyData getData() {
        return this.data;
    }

    public static class GetMultiChannelRecordingResponseBodyData extends TeaModel {
        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("FileName")
        public String fileName;

        public static GetMultiChannelRecordingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMultiChannelRecordingResponseBodyData self = new GetMultiChannelRecordingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMultiChannelRecordingResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GetMultiChannelRecordingResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}

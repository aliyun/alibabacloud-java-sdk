// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetMonoRecordingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMonoRecordingResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public GetMonoRecordingResponseBody setData(GetMonoRecordingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMonoRecordingResponseBodyData getData() {
        return this.data;
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

    public static class GetMonoRecordingResponseBodyData extends TeaModel {
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>job-6538214103689****.wav</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-record/job-6538214103689****.wav?Expires=1610910578&OSSAccessKeyId=****&Signature=">http://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-record/job-6538214103689****.wav?Expires=1610910578&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetMonoRecordingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMonoRecordingResponseBodyData self = new GetMonoRecordingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMonoRecordingResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetMonoRecordingResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetMonoRecordingResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}

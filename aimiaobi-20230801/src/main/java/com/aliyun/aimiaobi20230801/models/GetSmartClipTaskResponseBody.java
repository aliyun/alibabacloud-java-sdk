// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetSmartClipTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSmartClipTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSmartClipTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartClipTaskResponseBody self = new GetSmartClipTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartClipTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmartClipTaskResponseBody setData(GetSmartClipTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSmartClipTaskResponseBodyData getData() {
        return this.data;
    }

    public GetSmartClipTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSmartClipTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmartClipTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmartClipTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSmartClipTaskResponseBodyDataSubJobsFileAttr extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <strong>example:</strong>
         * <p>290804</p>
         */
        @NameInMap("FileLength")
        public String fileLength;

        /**
         * <strong>example:</strong>
         * <p>2024-12-12.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/tmp.mp4">http://www.example.com/tmp.mp4</a></p>
         */
        @NameInMap("TmpUrl")
        public String tmpUrl;

        /**
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static GetSmartClipTaskResponseBodyDataSubJobsFileAttr build(java.util.Map<String, ?> map) throws Exception {
            GetSmartClipTaskResponseBodyDataSubJobsFileAttr self = new GetSmartClipTaskResponseBodyDataSubJobsFileAttr();
            return TeaModel.build(map, self);
        }

        public GetSmartClipTaskResponseBodyDataSubJobsFileAttr setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public GetSmartClipTaskResponseBodyDataSubJobsFileAttr setFileLength(String fileLength) {
            this.fileLength = fileLength;
            return this;
        }
        public String getFileLength() {
            return this.fileLength;
        }

        public GetSmartClipTaskResponseBodyDataSubJobsFileAttr setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetSmartClipTaskResponseBodyDataSubJobsFileAttr setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetSmartClipTaskResponseBodyDataSubJobsFileAttr setTmpUrl(String tmpUrl) {
            this.tmpUrl = tmpUrl;
            return this;
        }
        public String getTmpUrl() {
            return this.tmpUrl;
        }

        public GetSmartClipTaskResponseBodyDataSubJobsFileAttr setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetSmartClipTaskResponseBodyDataSubJobs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>x\&quot;x\&quot;x\&quot;x</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FileAttr")
        public GetSmartClipTaskResponseBodyDataSubJobsFileAttr fileAttr;

        /**
         * <strong>example:</strong>
         * <p>oss://default/bucket-name/path-xxx/xxx-1.mp4</p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("SubJobId")
        public String subJobId;

        public static GetSmartClipTaskResponseBodyDataSubJobs build(java.util.Map<String, ?> map) throws Exception {
            GetSmartClipTaskResponseBodyDataSubJobs self = new GetSmartClipTaskResponseBodyDataSubJobs();
            return TeaModel.build(map, self);
        }

        public GetSmartClipTaskResponseBodyDataSubJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetSmartClipTaskResponseBodyDataSubJobs setFileAttr(GetSmartClipTaskResponseBodyDataSubJobsFileAttr fileAttr) {
            this.fileAttr = fileAttr;
            return this;
        }
        public GetSmartClipTaskResponseBodyDataSubJobsFileAttr getFileAttr() {
            return this.fileAttr;
        }

        public GetSmartClipTaskResponseBodyDataSubJobs setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public GetSmartClipTaskResponseBodyDataSubJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSmartClipTaskResponseBodyDataSubJobs setSubJobId(String subJobId) {
            this.subJobId = subJobId;
            return this;
        }
        public String getSubJobId() {
            return this.subJobId;
        }

    }

    public static class GetSmartClipTaskResponseBodyData extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubJobs")
        public java.util.List<GetSmartClipTaskResponseBodyDataSubJobs> subJobs;

        public static GetSmartClipTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSmartClipTaskResponseBodyData self = new GetSmartClipTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSmartClipTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetSmartClipTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSmartClipTaskResponseBodyData setSubJobs(java.util.List<GetSmartClipTaskResponseBodyDataSubJobs> subJobs) {
            this.subJobs = subJobs;
            return this;
        }
        public java.util.List<GetSmartClipTaskResponseBodyDataSubJobs> getSubJobs() {
            return this.subJobs;
        }

    }

}

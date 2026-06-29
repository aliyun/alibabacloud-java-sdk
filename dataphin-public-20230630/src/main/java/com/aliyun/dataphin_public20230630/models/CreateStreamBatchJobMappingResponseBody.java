// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStreamBatchJobMappingResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result returned when the node is created.</p>
     */
    @NameInMap("Data")
    public CreateStreamBatchJobMappingResponseBodyData data;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateStreamBatchJobMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamBatchJobMappingResponseBody self = new CreateStreamBatchJobMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStreamBatchJobMappingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStreamBatchJobMappingResponseBody setData(CreateStreamBatchJobMappingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateStreamBatchJobMappingResponseBodyData getData() {
        return this.data;
    }

    public CreateStreamBatchJobMappingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateStreamBatchJobMappingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateStreamBatchJobMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStreamBatchJobMappingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateStreamBatchJobMappingResponseBodyData extends TeaModel {
        /**
         * <p>The job file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7083701105376640</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>JobId</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("JobId")
        public Long jobId;

        /**
         * <p>The redirect relative path.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/streamJob/7083701105376640?env=DEV&amp;projectId=7081229106458752&amp;tenantId=300001420</p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateStreamBatchJobMappingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateStreamBatchJobMappingResponseBodyData self = new CreateStreamBatchJobMappingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateStreamBatchJobMappingResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public CreateStreamBatchJobMappingResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public CreateStreamBatchJobMappingResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}

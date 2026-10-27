// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ValidateAgentCodePackageFromOssResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public ValidateAgentCodePackageFromOssResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ValidateAgentCodePackageFromOssResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateAgentCodePackageFromOssResponseBody self = new ValidateAgentCodePackageFromOssResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateAgentCodePackageFromOssResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateAgentCodePackageFromOssResponseBody setData(ValidateAgentCodePackageFromOssResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ValidateAgentCodePackageFromOssResponseBodyData getData() {
        return this.data;
    }

    public ValidateAgentCodePackageFromOssResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ValidateAgentCodePackageFromOssResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateAgentCodePackageFromOssResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateAgentCodePackageFromOssResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ValidateAgentCodePackageFromOssResponseBodyData extends TeaModel {
        /**
         * <p>The original file name of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>main.zip</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <p>The compressed size of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <p>The format of the code package.</p>
         * 
         * <strong>example:</strong>
         * <p>zip</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>The OSS URI of the customer source code package.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://my-agent-bucket/packages/main.zip</p>
         */
        @NameInMap("sourceUri")
        public String sourceUri;

        public static ValidateAgentCodePackageFromOssResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ValidateAgentCodePackageFromOssResponseBodyData self = new ValidateAgentCodePackageFromOssResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ValidateAgentCodePackageFromOssResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ValidateAgentCodePackageFromOssResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ValidateAgentCodePackageFromOssResponseBodyData setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ValidateAgentCodePackageFromOssResponseBodyData setSourceUri(String sourceUri) {
            this.sourceUri = sourceUri;
            return this;
        }
        public String getSourceUri() {
            return this.sourceUri;
        }

    }

}

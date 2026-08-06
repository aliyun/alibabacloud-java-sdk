// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetKgSchemaPublishResultResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The publish result.</p>
     */
    @NameInMap("Data")
    public GetKgSchemaPublishResultResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetKgSchemaPublishResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKgSchemaPublishResultResponseBody self = new GetKgSchemaPublishResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKgSchemaPublishResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKgSchemaPublishResultResponseBody setData(GetKgSchemaPublishResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetKgSchemaPublishResultResponseBodyData getData() {
        return this.data;
    }

    public GetKgSchemaPublishResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetKgSchemaPublishResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKgSchemaPublishResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKgSchemaPublishResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetKgSchemaPublishResultResponseBodyData extends TeaModel {
        /**
         * <p>The publish content.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The publish status. Valid values:</p>
         * <ul>
         * <li>Publishing: Publishing in progress.</li>
         * <li>Published: Published successfully.</li>
         * <li>Partial: Partially completed.</li>
         * <li>Failed: Failed.</li>
         * <li>RollbackFailed: Publish failed and rollback failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionId")
        public Integer versionId;

        public static GetKgSchemaPublishResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetKgSchemaPublishResultResponseBodyData self = new GetKgSchemaPublishResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetKgSchemaPublishResultResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetKgSchemaPublishResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetKgSchemaPublishResultResponseBodyData setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

    }

}

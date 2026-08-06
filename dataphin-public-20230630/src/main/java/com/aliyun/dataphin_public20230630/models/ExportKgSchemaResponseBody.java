// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExportKgSchemaResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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
     * <p>The knowledge graph definition details.</p>
     */
    @NameInMap("SchemaInfo")
    public ExportKgSchemaResponseBodySchemaInfo schemaInfo;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExportKgSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportKgSchemaResponseBody self = new ExportKgSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportKgSchemaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportKgSchemaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportKgSchemaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportKgSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportKgSchemaResponseBody setSchemaInfo(ExportKgSchemaResponseBodySchemaInfo schemaInfo) {
        this.schemaInfo = schemaInfo;
        return this;
    }
    public ExportKgSchemaResponseBodySchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }

    public ExportKgSchemaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportKgSchemaResponseBodySchemaInfo extends TeaModel {
        /**
         * <p>The knowledge graph definition content converted based on the specified format.</p>
         * 
         * <strong>example:</strong>
         * <p>workspaceId: f1d4559a4db044158305e2d89bccf81f
         * name: jytest</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The format of the returned knowledge graph definition content. Valid values: json and yaml.</p>
         * 
         * <strong>example:</strong>
         * <p>yaml</p>
         */
        @NameInMap("OutputFormat")
        public String outputFormat;

        public static ExportKgSchemaResponseBodySchemaInfo build(java.util.Map<String, ?> map) throws Exception {
            ExportKgSchemaResponseBodySchemaInfo self = new ExportKgSchemaResponseBodySchemaInfo();
            return TeaModel.build(map, self);
        }

        public ExportKgSchemaResponseBodySchemaInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExportKgSchemaResponseBodySchemaInfo setOutputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public String getOutputFormat() {
            return this.outputFormat;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDocumentResponseBodyData data;

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

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>943D8EF3-3321-471F-A104-51C96FCA94D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentResponseBody self = new GetDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDocumentResponseBody setData(GetDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocumentResponseBodyData getData() {
        return this.data;
    }

    public GetDocumentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDocumentResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDocumentResponseBodyDataSchema extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-16T02:12:12Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        /**
         * <strong>example:</strong>
         * <p>terraform-example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>schame id</p>
         * 
         * <strong>example:</strong>
         * <p>400135</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>57236c4f-48e9-49ca-a560-8697ec6c185e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Properties")
        public java.util.Map<String, DataSchemaPropertiesValue> properties;

        /**
         * <strong>example:</strong>
         * <p>2024-10-16T02:12:12Z</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetDocumentResponseBodyDataSchema build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentResponseBodyDataSchema self = new GetDocumentResponseBodyDataSchema();
            return TeaModel.build(map, self);
        }

        public GetDocumentResponseBodyDataSchema setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDocumentResponseBodyDataSchema setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetDocumentResponseBodyDataSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDocumentResponseBodyDataSchema setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDocumentResponseBodyDataSchema setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDocumentResponseBodyDataSchema setProperties(java.util.Map<String, DataSchemaPropertiesValue> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, DataSchemaPropertiesValue> getProperties() {
            return this.properties;
        }

        public GetDocumentResponseBodyDataSchema setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class GetDocumentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;tom&quot;}</p>
         */
        @NameInMap("Document")
        public java.util.Map<String, ?> document;

        /**
         * <p>scheme</p>
         */
        @NameInMap("Schema")
        public GetDocumentResponseBodyDataSchema schema;

        public static GetDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentResponseBodyData self = new GetDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentResponseBodyData setDocument(java.util.Map<String, ?> document) {
            this.document = document;
            return this;
        }
        public java.util.Map<String, ?> getDocument() {
            return this.document;
        }

        public GetDocumentResponseBodyData setSchema(GetDocumentResponseBodyDataSchema schema) {
            this.schema = schema;
            return this;
        }
        public GetDocumentResponseBodyDataSchema getSchema() {
            return this.schema;
        }

    }

}

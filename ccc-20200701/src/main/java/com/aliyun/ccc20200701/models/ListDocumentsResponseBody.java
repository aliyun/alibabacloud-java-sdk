// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDocumentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDocumentsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsResponseBody self = new ListDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDocumentsResponseBody setData(ListDocumentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDocumentsResponseBodyData getData() {
        return this.data;
    }

    public ListDocumentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDocumentsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDocumentsResponseBodyDataSchema extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        /**
         * <p>schame id</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Properties")
        public java.util.Map<String, DataSchemaPropertiesValue> properties;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListDocumentsResponseBodyDataSchema build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentsResponseBodyDataSchema self = new ListDocumentsResponseBodyDataSchema();
            return TeaModel.build(map, self);
        }

        public ListDocumentsResponseBodyDataSchema setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDocumentsResponseBodyDataSchema setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListDocumentsResponseBodyDataSchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDocumentsResponseBodyDataSchema setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDocumentsResponseBodyDataSchema setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDocumentsResponseBodyDataSchema setProperties(java.util.Map<String, DataSchemaPropertiesValue> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, DataSchemaPropertiesValue> getProperties() {
            return this.properties;
        }

        public ListDocumentsResponseBodyDataSchema setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListDocumentsResponseBodyData extends TeaModel {
        @NameInMap("Documents")
        public java.util.List<java.util.Map<String, ?>> documents;

        @NameInMap("NextPageToken")
        public String nextPageToken;

        /**
         * <p>scheme</p>
         */
        @NameInMap("Schema")
        public ListDocumentsResponseBodyDataSchema schema;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentsResponseBodyData self = new ListDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDocumentsResponseBodyData setDocuments(java.util.List<java.util.Map<String, ?>> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getDocuments() {
            return this.documents;
        }

        public ListDocumentsResponseBodyData setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public ListDocumentsResponseBodyData setSchema(ListDocumentsResponseBodyDataSchema schema) {
            this.schema = schema;
            return this;
        }
        public ListDocumentsResponseBodyDataSchema getSchema() {
            return this.schema;
        }

        public ListDocumentsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDocumentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDocumentsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2020-10-14T09:53:53Z</p>
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
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>schame id</p>
         * 
         * <strong>example:</strong>
         * <p>profile</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>87b12784-8ce2-40b6-b21f-c49cb3b5501e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Properties")
        public java.util.Map<String, DataSchemaPropertiesValue> properties;

        /**
         * <strong>example:</strong>
         * <p>2020-10-14T09:53:53Z</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>54d1a616d95a4a01ba58967a9115b649</p>
         */
        @NameInMap("NextPageToken")
        public String nextPageToken;

        /**
         * <p>scheme</p>
         */
        @NameInMap("Schema")
        public ListDocumentsResponseBodyDataSchema schema;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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

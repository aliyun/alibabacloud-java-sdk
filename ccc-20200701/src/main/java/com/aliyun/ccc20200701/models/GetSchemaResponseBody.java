// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetSchemaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSchemaResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Service abnormal, the instance 0418 is ceased.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>19D09CCC-F298-4124-849A-AFA217819011</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSchemaResponseBody self = new GetSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSchemaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSchemaResponseBody setData(GetSchemaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSchemaResponseBodyData getData() {
        return this.data;
    }

    public GetSchemaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSchemaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSchemaResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSchemaResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-07-14 10:48:43.0</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        /**
         * <p>schema id</p>
         * 
         * <strong>example:</strong>
         * <p>profile</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>5e0964fd-951c-4e45-b518-d09d4d2db8ca</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Properties")
        public java.util.Map<String, DataPropertiesValue> properties;

        /**
         * <strong>example:</strong>
         * <p>2021-07-14 10:48:43.0</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetSchemaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSchemaResponseBodyData self = new GetSchemaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSchemaResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetSchemaResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetSchemaResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSchemaResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetSchemaResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSchemaResponseBodyData setProperties(java.util.Map<String, DataPropertiesValue> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, DataPropertiesValue> getProperties() {
            return this.properties;
        }

        public GetSchemaResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}

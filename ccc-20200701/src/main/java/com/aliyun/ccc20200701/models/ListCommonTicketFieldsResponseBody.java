// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCommonTicketFieldsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCommonTicketFieldsResponseBodyData data;

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
     * <p>30C7D235-DDCF-4C7F-A462-5E2598252C2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCommonTicketFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommonTicketFieldsResponseBody self = new ListCommonTicketFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommonTicketFieldsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCommonTicketFieldsResponseBody setData(ListCommonTicketFieldsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCommonTicketFieldsResponseBodyData getData() {
        return this.data;
    }

    public ListCommonTicketFieldsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCommonTicketFieldsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCommonTicketFieldsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListCommonTicketFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCommonTicketFieldsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1703517780627</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>Schema ID。</p>
         * 
         * <strong>example:</strong>
         * <p>ticketing</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Properties")
        public java.util.Map<String, DataPropertiesValue> properties;

        /**
         * <strong>example:</strong>
         * <p>1716211430928</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListCommonTicketFieldsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCommonTicketFieldsResponseBodyData self = new ListCommonTicketFieldsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCommonTicketFieldsResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListCommonTicketFieldsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCommonTicketFieldsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCommonTicketFieldsResponseBodyData setProperties(java.util.Map<String, DataPropertiesValue> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, DataPropertiesValue> getProperties() {
            return this.properties;
        }

        public ListCommonTicketFieldsResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}

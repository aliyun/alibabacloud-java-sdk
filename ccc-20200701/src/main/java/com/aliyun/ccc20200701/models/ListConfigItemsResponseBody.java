// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListConfigItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListConfigItemsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigItemsResponseBody self = new ListConfigItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConfigItemsResponseBody setData(java.util.List<ListConfigItemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListConfigItemsResponseBodyData> getData() {
        return this.data;
    }

    public ListConfigItemsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConfigItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConfigItemsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListConfigItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigItemsResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Value")
        public String value;

        public static ListConfigItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConfigItemsResponseBodyData self = new ListConfigItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConfigItemsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConfigItemsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConfigItemsResponseBodyData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public ListConfigItemsResponseBodyData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public ListConfigItemsResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

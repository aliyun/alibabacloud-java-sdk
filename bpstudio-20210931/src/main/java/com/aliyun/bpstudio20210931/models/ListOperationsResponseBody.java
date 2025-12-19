// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListOperationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListOperationsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>NotFound</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOperationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationsResponseBody self = new ListOperationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOperationsResponseBody setData(java.util.List<ListOperationsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOperationsResponseBodyData> getData() {
        return this.data;
    }

    public ListOperationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOperationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOperationsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Add Tag</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>addTags</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        public static ListOperationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationsResponseBodyData self = new ListOperationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOperationsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListOperationsResponseBodyData setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListOperationsResponseBodyData setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}

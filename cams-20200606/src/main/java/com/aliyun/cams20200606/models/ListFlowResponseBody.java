// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListFlowResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowResponseBody self = new ListFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlowResponseBody setData(java.util.List<ListFlowResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFlowResponseBodyData> getData() {
        return this.data;
    }

    public ListFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlowResponseBodyData extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>flow ID。</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowName")
        public String flowName;

        public static ListFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlowResponseBodyData self = new ListFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlowResponseBodyData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ListFlowResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListFlowResponseBodyData setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

}

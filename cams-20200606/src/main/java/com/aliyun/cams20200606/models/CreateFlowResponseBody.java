// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateFlowResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowResponseBody self = new CreateFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFlowResponseBody setData(CreateFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateFlowResponseBodyData getData() {
        return this.data;
    }

    public CreateFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateFlowResponseBodyData extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>flow ID。</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("FlowName")
        public String flowName;

        public static CreateFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowResponseBodyData self = new CreateFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateFlowResponseBodyData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public CreateFlowResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public CreateFlowResponseBodyData setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

}

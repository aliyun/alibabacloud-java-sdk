// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateFlowResponseBody extends TeaModel {
    /**
     * <p>If OK is returned, the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateFlowResponseBodyData data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
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
        /**
         * <p>The categories of the Flow.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The Flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>333993838***</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The name of the Flow.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
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

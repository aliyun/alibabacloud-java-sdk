// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyFlowResponseBody extends TeaModel {
    /**
     * <p>If OK is returned, the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ModifyFlowResponseBodyData data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowResponseBody self = new ModifyFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyFlowResponseBody setData(ModifyFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyFlowResponseBodyData getData() {
        return this.data;
    }

    public ModifyFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyFlowResponseBodyData extends TeaModel {
        /**
         * <p>The categories of the Flow.</p>
         */
        @NameInMap("Categories")
        public java.util.List<String> categories;

        /**
         * <p>The Flow ID.</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The name of the Flow.</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        public static ModifyFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowResponseBodyData self = new ModifyFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyFlowResponseBodyData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ModifyFlowResponseBodyData setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ModifyFlowResponseBodyData setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

}

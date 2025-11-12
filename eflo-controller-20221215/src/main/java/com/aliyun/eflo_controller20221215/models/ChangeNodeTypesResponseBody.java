// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ChangeNodeTypesResponseBody extends TeaModel {
    @NameInMap("NodeResponse")
    public java.util.List<ChangeNodeTypesResponseBodyNodeResponse> nodeResponse;

    /**
     * <strong>example:</strong>
     * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>i158475611663639202234</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ChangeNodeTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeNodeTypesResponseBody self = new ChangeNodeTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeNodeTypesResponseBody setNodeResponse(java.util.List<ChangeNodeTypesResponseBodyNodeResponse> nodeResponse) {
        this.nodeResponse = nodeResponse;
        return this;
    }
    public java.util.List<ChangeNodeTypesResponseBodyNodeResponse> getNodeResponse() {
        return this.nodeResponse;
    }

    public ChangeNodeTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeNodeTypesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class ChangeNodeTypesResponseBodyNodeResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PASSED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>e01-in-067da4ca9c2</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static ChangeNodeTypesResponseBodyNodeResponse build(java.util.Map<String, ?> map) throws Exception {
            ChangeNodeTypesResponseBodyNodeResponse self = new ChangeNodeTypesResponseBodyNodeResponse();
            return TeaModel.build(map, self);
        }

        public ChangeNodeTypesResponseBodyNodeResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ChangeNodeTypesResponseBodyNodeResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ChangeNodeTypesResponseBodyNodeResponse setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApplicationActionResponseBody extends TeaModel {
    /**
     * <p>异常节点列表。</p>
     */
    @NameInMap("AbnInstances")
    public java.util.List<AbnInstances> abnInstances;

    /**
     * <p>The operation ID.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RunApplicationActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunApplicationActionResponseBody self = new RunApplicationActionResponseBody();
        return TeaModel.build(map, self);
    }

    public RunApplicationActionResponseBody setAbnInstances(java.util.List<AbnInstances> abnInstances) {
        this.abnInstances = abnInstances;
        return this;
    }
    public java.util.List<AbnInstances> getAbnInstances() {
        return this.abnInstances;
    }

    public RunApplicationActionResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public RunApplicationActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AbnInstances extends TeaModel {
        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        public static AbnInstances build(java.util.Map<String, ?> map) throws Exception {
            AbnInstances self = new AbnInstances();
            return TeaModel.build(map, self);
        }

        public AbnInstances setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public AbnInstances setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}

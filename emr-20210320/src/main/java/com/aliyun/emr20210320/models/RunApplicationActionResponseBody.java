// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApplicationActionResponseBody extends TeaModel {
    /**
     * <p>The abnormal nodes.</p>
     */
    @NameInMap("AbnInstances")
    public java.util.List<AbnInstances> abnInstances;

    /**
     * <p>The operation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>op-13c37a77c505****</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3****</p>
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
        /**
         * <p>The ID of the abnormal node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cudc25w2bfwl5****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The name of the abnormal node.</p>
         * 
         * <strong>example:</strong>
         * <p>core1-1</p>
         */
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

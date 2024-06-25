// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RepairClusterNodePoolRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow node restart.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_restart")
    public Boolean autoRestart;

    /**
     * <p>The nodes that you want to repair. If you do not specify nodes, all nodes in the node pool are repaired.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    @NameInMap("operations")
    public java.util.List<RepairClusterNodePoolRequestOperations> operations;

    public static RepairClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        RepairClusterNodePoolRequest self = new RepairClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public RepairClusterNodePoolRequest setAutoRestart(Boolean autoRestart) {
        this.autoRestart = autoRestart;
        return this;
    }
    public Boolean getAutoRestart() {
        return this.autoRestart;
    }

    public RepairClusterNodePoolRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public RepairClusterNodePoolRequest setOperations(java.util.List<RepairClusterNodePoolRequestOperations> operations) {
        this.operations = operations;
        return this;
    }
    public java.util.List<RepairClusterNodePoolRequestOperations> getOperations() {
        return this.operations;
    }

    public static class RepairClusterNodePoolRequestOperations extends TeaModel {
        @NameInMap("args")
        public java.util.List<String> args;

        @NameInMap("operation_id")
        public String operationId;

        public static RepairClusterNodePoolRequestOperations build(java.util.Map<String, ?> map) throws Exception {
            RepairClusterNodePoolRequestOperations self = new RepairClusterNodePoolRequestOperations();
            return TeaModel.build(map, self);
        }

        public RepairClusterNodePoolRequestOperations setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public RepairClusterNodePoolRequestOperations setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

}

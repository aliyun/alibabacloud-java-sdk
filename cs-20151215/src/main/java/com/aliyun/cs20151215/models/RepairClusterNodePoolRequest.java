// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RepairClusterNodePoolRequest extends TeaModel {
    /**
     * <p>Specifies whether to restart the instance of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("auto_restart")
    public Boolean autoRestart;

    /**
     * <p>The list of nodes. If you do not specify nodes, all nodes in the node pool are selected.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>The repair operation to be performed. If not specified, all repair operations will be executed by default. Generally, there is no need to specify this in most scenarios.</p>
     */
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
        /**
         * <p>List of repair operation parameters.</p>
         */
        @NameInMap("args")
        public java.util.List<String> args;

        /**
         * <p>Repair operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>remove.containerdContainer</p>
         */
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

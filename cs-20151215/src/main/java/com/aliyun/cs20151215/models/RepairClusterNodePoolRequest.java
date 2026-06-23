// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RepairClusterNodePoolRequest extends TeaModel {
    /**
     * <p>[This field is deprecated] Specifies whether to allow instance restart.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("auto_restart")
    @Deprecated
    public Boolean autoRestart;

    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>The repair operations to perform. If not specified, all repair operations are performed by default. In most scenarios, you do not need to specify this parameter.</p>
     */
    @NameInMap("operations")
    public java.util.List<RepairClusterNodePoolRequestOperations> operations;

    public static RepairClusterNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        RepairClusterNodePoolRequest self = new RepairClusterNodePoolRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
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
         * <p>The list of repair operation parameters.</p>
         */
        @NameInMap("args")
        public java.util.List<String> args;

        /**
         * <p>The repair operation ID. Valid values:</p>
         * <ul>
         * <li>restart.kubelet: restart kubelet.</li>
         * <li>restart.docker: restart Docker.</li>
         * <li>restart.containerd: restart Containerd.</li>
         * <li>restart.ntp: restart ntpd or chronyd.</li>
         * <li>remove.containerdContainerInSandbox: delete a specified sandbox container under Containerd.</li>
         * <li>remove.dockerContainerInSandbox: delete a specified sandbox container under Docker.</li>
         * <li>remove.containerdContainer: delete a specified container under Containerd.</li>
         * <li>remove.dockerContainer: delete a specified container under Docker.</li>
         * </ul>
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

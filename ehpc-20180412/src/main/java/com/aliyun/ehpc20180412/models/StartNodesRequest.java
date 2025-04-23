// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Instance")
    public java.util.List<StartNodesRequestInstance> instance;

    /**
     * <p>The role of the node. Valid values:</p>
     * <ul>
     * <li>Manager: management node</li>
     * <li>Login: logon node</li>
     * <li>Compute: compute node</li>
     * </ul>
     * <p>Default value: Compute</p>
     * 
     * <strong>example:</strong>
     * <p>Compute</p>
     */
    @NameInMap("Role")
    public String role;

    public static StartNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNodesRequest self = new StartNodesRequest();
        return TeaModel.build(map, self);
    }

    public StartNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StartNodesRequest setInstance(java.util.List<StartNodesRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<StartNodesRequestInstance> getInstance() {
        return this.instance;
    }

    public StartNodesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public static class StartNodesRequestInstance extends TeaModel {
        /**
         * <p>The ID of the Nth node. Valid values of N: 1 to 100.</p>
         * <p>Make sure that the node is in the Stopped state. You can call the <a href="https://help.aliyun.com/document_detail/87161.html">ListNodes</a> operation to query the status of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13p7vlcb1uihfv****</p>
         */
        @NameInMap("Id")
        public String id;

        public static StartNodesRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            StartNodesRequestInstance self = new StartNodesRequestInstance();
            return TeaModel.build(map, self);
        }

        public StartNodesRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

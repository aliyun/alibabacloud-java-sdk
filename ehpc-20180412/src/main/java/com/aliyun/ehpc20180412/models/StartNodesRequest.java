// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Instance")
    public java.util.List<StartNodesRequestInstance> instance;

    /**
     * <p>The role of the node. Valid values:</p>
     * <br>
     * <p>*   Manager: management node</p>
     * <p>*   Login: logon node</p>
     * <p>*   Compute: compute node</p>
     * <br>
     * <p>Default value: Compute</p>
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
         * <br>
         * <p>Make sure that the node is in the Stopped state. You can call the [ListNodes](~~87161~~) operation to query the status of the node.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopNodesRequest extends TeaModel {
    /**
     * <p>The ID of the E-HPC cluster.</p>
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
    public java.util.List<StopNodesRequestInstance> instance;

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

    public static StopNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopNodesRequest self = new StopNodesRequest();
        return TeaModel.build(map, self);
    }

    public StopNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StopNodesRequest setInstance(java.util.List<StopNodesRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<StopNodesRequestInstance> getInstance() {
        return this.instance;
    }

    public StopNodesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public static class StopNodesRequestInstance extends TeaModel {
        /**
         * <p>The ID of the Nth node that you want to stop. Valid values of N: 1 to 100</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87161.html">ListNodes</a> operation to query the IDs of the compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13p7vlcb1uihf****</p>
         */
        @NameInMap("Id")
        public String id;

        public static StopNodesRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            StopNodesRequestInstance self = new StopNodesRequestInstance();
            return TeaModel.build(map, self);
        }

        public StopNodesRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

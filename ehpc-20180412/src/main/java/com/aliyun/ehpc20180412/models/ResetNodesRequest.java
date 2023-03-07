// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ResetNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Instance")
    public java.util.List<ResetNodesRequestInstance> instance;

    public static ResetNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetNodesRequest self = new ResetNodesRequest();
        return TeaModel.build(map, self);
    }

    public ResetNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResetNodesRequest setInstance(java.util.List<ResetNodesRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<ResetNodesRequestInstance> getInstance() {
        return this.instance;
    }

    public static class ResetNodesRequestInstance extends TeaModel {
        /**
         * <p>The ID of the compute node that you want to reset. Valid values of N: 1 to 100</p>
         * <br>
         * <p>You can call the [ListNodes](~~87161~~) operation to query the IDs of the compute nodes.</p>
         */
        @NameInMap("Id")
        public String id;

        public static ResetNodesRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            ResetNodesRequestInstance self = new ResetNodesRequestInstance();
            return TeaModel.build(map, self);
        }

        public ResetNodesRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

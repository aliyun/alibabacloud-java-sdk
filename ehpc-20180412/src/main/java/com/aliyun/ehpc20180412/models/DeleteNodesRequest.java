// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Instance")
    public java.util.List<DeleteNodesRequestInstance> instance;

    /**
     * <p>Specifies whether to release the instances that are created by using E-HPC.</p>
     * <br>
     * <p>Default value: true</p>
     */
    @NameInMap("ReleaseInstance")
    public Boolean releaseInstance;

    /**
     * <p>Specifies whether to directly delete the node. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Sync")
    public Boolean sync;

    public static DeleteNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodesRequest self = new DeleteNodesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteNodesRequest setInstance(java.util.List<DeleteNodesRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<DeleteNodesRequestInstance> getInstance() {
        return this.instance;
    }

    public DeleteNodesRequest setReleaseInstance(Boolean releaseInstance) {
        this.releaseInstance = releaseInstance;
        return this;
    }
    public Boolean getReleaseInstance() {
        return this.releaseInstance;
    }

    public DeleteNodesRequest setSync(Boolean sync) {
        this.sync = sync;
        return this;
    }
    public Boolean getSync() {
        return this.sync;
    }

    public static class DeleteNodesRequestInstance extends TeaModel {
        /**
         * <p>The ID of the compute node that you want to delete. Valid values of N: 1 to 100.</p>
         * <br>
         * <p>You can call the [DescribeCluster](~~87126~~) operation to query the IDs of the nodes in the cluster.</p>
         */
        @NameInMap("Id")
        public String id;

        public static DeleteNodesRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            DeleteNodesRequestInstance self = new DeleteNodesRequestInstance();
            return TeaModel.build(map, self);
        }

        public DeleteNodesRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

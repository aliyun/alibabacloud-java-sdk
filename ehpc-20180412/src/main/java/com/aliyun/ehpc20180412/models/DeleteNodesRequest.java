// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteNodesRequest extends TeaModel {
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
    public java.util.List<DeleteNodesRequestInstance> instance;

    /**
     * <p>Specifies whether to release the instances that are created by using E-HPC.</p>
     * <p>Default value: true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReleaseInstance")
    public Boolean releaseInstance;

    /**
     * <p>Specifies whether to directly delete the node. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87126.html">DescribeCluster</a> operation to query the IDs of the nodes in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp13p7vlcb1uihfv****</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Body")
    public DeleteClusterNodesRequestBody body;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to release the ENS instance where the node resides. Default value: true.</p>
     */
    @NameInMap("ReleaseNode")
    public Boolean releaseNode;

    public static DeleteClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodesRequest self = new DeleteClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodesRequest setBody(DeleteClusterNodesRequestBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterNodesRequestBody getBody() {
        return this.body;
    }

    public DeleteClusterNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteClusterNodesRequest setReleaseNode(Boolean releaseNode) {
        this.releaseNode = releaseNode;
        return this;
    }
    public Boolean getReleaseNode() {
        return this.releaseNode;
    }

    public static class DeleteClusterNodesRequestBody extends TeaModel {
        /**
         * <p>The information about the nodes to be removed.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<String> nodes;

        public static DeleteClusterNodesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            DeleteClusterNodesRequestBody self = new DeleteClusterNodesRequestBody();
            return TeaModel.build(map, self);
        }

        public DeleteClusterNodesRequestBody setNodes(java.util.List<String> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<String> getNodes() {
            return this.nodes;
        }

    }

}

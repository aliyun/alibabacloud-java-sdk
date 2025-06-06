// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddLocalNodesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information of the local node. A JSON string that contains the HostName, IpAddress, CpuCores, and Memory (Unit: MB) of the local node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;HostName&quot;:&quot;test-HostName&quot;,&quot;IpAddress&quot;:&quot;<code>192.168.**.**</code>&quot;},{&quot;CpuCores&quot;:2,&quot;Memory&quot;:1024}]</p>
     */
    @NameInMap("Nodes")
    public String nodes;

    /**
     * <p>The queue to which to add the local node.</p>
     * 
     * <strong>example:</strong>
     * <p>test.q</p>
     */
    @NameInMap("Queue")
    public String queue;

    public static AddLocalNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLocalNodesRequest self = new AddLocalNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddLocalNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddLocalNodesRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public AddLocalNodesRequest setQueue(String queue) {
        this.queue = queue;
        return this;
    }
    public String getQueue() {
        return this.queue;
    }

}

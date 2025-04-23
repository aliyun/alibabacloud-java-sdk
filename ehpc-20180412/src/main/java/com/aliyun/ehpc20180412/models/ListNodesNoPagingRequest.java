// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingRequest extends TeaModel {
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
     * <p>The name of the node. You can perform a fuzzy search. MySQL regular expressions are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Compute0</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li>Manager: management node</li>
     * <li>Login: logon node</li>
     * <li>Compute: compute node</li>
     * </ul>
     * <p>Default value: Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>Compute</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The sorting method of the node list. Valid values:</p>
     * <ul>
     * <li>Forward: sorts the nodes in chronological order.</li>
     * <li>Backward: sorts the nodes in reverse chronological order.</li>
     * </ul>
     * <p>Default value: Forward.</p>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("Sequence")
    public String sequence;

    public static ListNodesNoPagingRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesNoPagingRequest self = new ListNodesNoPagingRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesNoPagingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodesNoPagingRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListNodesNoPagingRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListNodesNoPagingRequest setSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }
    public String getSequence() {
        return this.sequence;
    }

}

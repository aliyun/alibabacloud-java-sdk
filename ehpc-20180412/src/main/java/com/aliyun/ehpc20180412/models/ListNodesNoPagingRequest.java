// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the node. You can perform a fuzzy search. MySQL regular expressions are supported.</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The type of the node. Valid values:</p>
     * <br>
     * <p>*   Manager: management node</p>
     * <p>*   Login: logon node</p>
     * <p>*   Compute: compute node</p>
     * <br>
     * <p>Default value: Compute.</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The sorting method of the node list. Valid values:</p>
     * <br>
     * <p>*   Forward: sorts the nodes in chronological order.</p>
     * <p>*   Backward: sorts the nodes in reverse chronological order.</p>
     * <br>
     * <p>Default value: Forward.</p>
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

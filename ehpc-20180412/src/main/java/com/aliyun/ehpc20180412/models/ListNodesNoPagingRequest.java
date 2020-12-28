// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesNoPagingRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Role")
    public String role;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("OnlyDetached")
    public Boolean onlyDetached;

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

    public ListNodesNoPagingRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListNodesNoPagingRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public ListNodesNoPagingRequest setOnlyDetached(Boolean onlyDetached) {
        this.onlyDetached = onlyDetached;
        return this;
    }
    public Boolean getOnlyDetached() {
        return this.onlyDetached;
    }

    public ListNodesNoPagingRequest setSequence(String sequence) {
        this.sequence = sequence;
        return this;
    }
    public String getSequence() {
        return this.sequence;
    }

}

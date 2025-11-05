// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListOperationPlansForRegionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c02b3e03be10643e8a644a843ffcb****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>CLUSTER_UPGRADE_MASTER</p>
     */
    @NameInMap("type")
    public String type;

    public static ListOperationPlansForRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationPlansForRegionRequest self = new ListOperationPlansForRegionRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationPlansForRegionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListOperationPlansForRegionRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListOperationPlansForRegionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

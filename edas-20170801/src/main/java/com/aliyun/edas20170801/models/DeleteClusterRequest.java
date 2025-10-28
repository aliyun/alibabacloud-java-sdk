// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteClusterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8b96ade0-0a07-****-af9d-5ed83640d076</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the cluster ID. Valid values:</p>
     * <ul>
     * <li>0: specifies the ID of the cluster in Enterprise Distributed Application Service (EDAS).</li>
     * <li>1: specifies the ID of the ACK cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Mode")
    public Integer mode;

    public static DeleteClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterRequest self = new DeleteClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteClusterRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

}

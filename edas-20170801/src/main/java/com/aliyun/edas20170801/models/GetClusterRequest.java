// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetClusterRequest extends TeaModel {
    /**
     * <p>The ID of the cluster in Enterprise Distributed Application Service (EDAS). You can call the ListCluster operation to query the cluster ID. For more information, see <a href="https://help.aliyun.com/document_detail/154995.html">ListCluster</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5439271a-015b-433d-<strong><strong>-d76db49</strong></strong></p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterRequest self = new GetClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

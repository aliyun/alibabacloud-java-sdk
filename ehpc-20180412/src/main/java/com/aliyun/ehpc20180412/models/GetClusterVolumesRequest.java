// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetClusterVolumesRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-gh5WKb****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetClusterVolumesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterVolumesRequest self = new GetClusterVolumesRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterVolumesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

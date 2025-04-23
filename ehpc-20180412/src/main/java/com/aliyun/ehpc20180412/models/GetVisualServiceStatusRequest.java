// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetVisualServiceStatusRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-jeJki6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetVisualServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVisualServiceStatusRequest self = new GetVisualServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetVisualServiceStatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

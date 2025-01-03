// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetResourceRequest extends TeaModel {
    /**
     * <p>The cluster ID of Lingjun</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-bj-uo8f26cpmo</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static GetResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRequest self = new GetResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetClusterRequest extends TeaModel {
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

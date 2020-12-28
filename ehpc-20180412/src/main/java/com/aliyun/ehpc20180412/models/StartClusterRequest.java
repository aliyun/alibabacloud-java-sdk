// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static StartClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        StartClusterRequest self = new StartClusterRequest();
        return TeaModel.build(map, self);
    }

    public StartClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static StopClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        StopClusterRequest self = new StopClusterRequest();
        return TeaModel.build(map, self);
    }

    public StopClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

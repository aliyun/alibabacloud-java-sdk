// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class CheckClusterNameRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    public static CheckClusterNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckClusterNameRequest self = new CheckClusterNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckClusterNameRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}

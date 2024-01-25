// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class UpdateClusterNameRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("ClusterName")
    public String clusterName;

    public static UpdateClusterNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterNameRequest self = new UpdateClusterNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterNameRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public UpdateClusterNameRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}

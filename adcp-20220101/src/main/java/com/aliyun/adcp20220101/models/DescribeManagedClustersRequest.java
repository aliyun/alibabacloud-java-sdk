// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeManagedClustersRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeManagedClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeManagedClustersRequest self = new DescribeManagedClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeManagedClustersRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

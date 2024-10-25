// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c8f0377146d104687ac562eef9403****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterRequest self = new DescribeClusterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

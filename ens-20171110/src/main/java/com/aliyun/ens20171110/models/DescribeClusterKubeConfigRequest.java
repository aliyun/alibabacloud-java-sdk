// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterKubeConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c8f0377146d104687ac562eef9403****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterKubeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterKubeConfigRequest self = new DescribeClusterKubeConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterKubeConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

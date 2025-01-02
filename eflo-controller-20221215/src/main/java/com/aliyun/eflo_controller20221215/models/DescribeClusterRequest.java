// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeClusterRequest extends TeaModel {
    /**
     * <p>Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
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

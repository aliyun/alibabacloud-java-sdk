// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeClusterRequest extends TeaModel {
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

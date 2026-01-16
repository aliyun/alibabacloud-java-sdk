// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeClusterDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-11111111</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeClusterDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterDetailRequest self = new DescribeClusterDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterDetailRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

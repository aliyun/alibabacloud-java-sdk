// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c676decda7b8148d69a9aba751877****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeHubClusterDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterDetailsRequest self = new DescribeHubClusterDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterDetailsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

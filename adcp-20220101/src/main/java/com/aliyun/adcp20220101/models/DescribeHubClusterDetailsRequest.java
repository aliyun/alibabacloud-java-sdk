// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the master instance.</p>
     * <br>
     * <p>This parameter is required.</p>
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

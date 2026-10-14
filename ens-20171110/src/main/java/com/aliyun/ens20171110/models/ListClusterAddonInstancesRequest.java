// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListClusterAddonInstancesRequest extends TeaModel {
    /**
     * <p>The cluster ID. The target cluster must be in the running state. You can verify the state by checking the State field in the response of DescribeClustersV1 or DescribeClusterDetail.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static ListClusterAddonInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAddonInstancesRequest self = new ListClusterAddonInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterAddonInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

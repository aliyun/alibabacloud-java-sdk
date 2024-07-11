// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp161ax8i03c4uq**</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeSecurityGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsRequest self = new DescribeSecurityGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

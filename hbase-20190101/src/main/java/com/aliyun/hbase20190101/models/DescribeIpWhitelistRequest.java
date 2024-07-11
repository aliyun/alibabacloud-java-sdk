// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-bp150tns0sjxs****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistRequest self = new DescribeIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

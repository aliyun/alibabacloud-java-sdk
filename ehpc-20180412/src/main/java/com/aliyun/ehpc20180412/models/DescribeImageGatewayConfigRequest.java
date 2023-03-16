// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeImageGatewayConfigRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeImageGatewayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGatewayConfigRequest self = new DescribeImageGatewayConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageGatewayConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

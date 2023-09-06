// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeAutoScaleConfigRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DescribeAutoScaleConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoScaleConfigRequest self = new DescribeAutoScaleConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoScaleConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}

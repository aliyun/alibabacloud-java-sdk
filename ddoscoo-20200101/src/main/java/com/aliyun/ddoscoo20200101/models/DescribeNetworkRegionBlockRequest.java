// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRegionBlockRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeNetworkRegionBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRegionBlockRequest self = new DescribeNetworkRegionBlockRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRegionBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

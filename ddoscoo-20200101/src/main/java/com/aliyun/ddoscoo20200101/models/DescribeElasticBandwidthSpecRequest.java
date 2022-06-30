// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticBandwidthSpecRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeElasticBandwidthSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticBandwidthSpecRequest self = new DescribeElasticBandwidthSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticBandwidthSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

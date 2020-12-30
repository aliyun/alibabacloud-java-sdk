// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeElasticBandwidthSpecRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeElasticBandwidthSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticBandwidthSpecRequest self = new DescribeElasticBandwidthSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticBandwidthSpecRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeElasticBandwidthSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeElasticBandwidthSpecResponseBody extends TeaModel {
    @NameInMap("ElasticBandwidthSpec")
    public java.util.List<String> elasticBandwidthSpec;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElasticBandwidthSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticBandwidthSpecResponseBody self = new DescribeElasticBandwidthSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElasticBandwidthSpecResponseBody setElasticBandwidthSpec(java.util.List<String> elasticBandwidthSpec) {
        this.elasticBandwidthSpec = elasticBandwidthSpec;
        return this;
    }
    public java.util.List<String> getElasticBandwidthSpec() {
        return this.elasticBandwidthSpec;
    }

    public DescribeElasticBandwidthSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

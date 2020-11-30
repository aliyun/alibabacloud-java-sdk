// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeElasticBandwidthSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ElasticBandwidthSpec")
    @Validation(required = true)
    public java.util.List<String> elasticBandwidthSpec;

    public static DescribeElasticBandwidthSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticBandwidthSpecResponse self = new DescribeElasticBandwidthSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeElasticBandwidthSpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeElasticBandwidthSpecResponse setElasticBandwidthSpec(java.util.List<String> elasticBandwidthSpec) {
        this.elasticBandwidthSpec = elasticBandwidthSpec;
        return this;
    }
    public java.util.List<String> getElasticBandwidthSpec() {
        return this.elasticBandwidthSpec;
    }

}

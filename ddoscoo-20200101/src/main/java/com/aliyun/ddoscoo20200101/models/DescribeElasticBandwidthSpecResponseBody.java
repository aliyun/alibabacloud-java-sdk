// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticBandwidthSpecResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the available burstable protection bandwidths. Unit: Gbit/s.</p>
     */
    @NameInMap("ElasticBandwidthSpec")
    public java.util.List<String> elasticBandwidthSpec;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
     */
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

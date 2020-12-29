// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeRegionDdosThresholdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionDdosThreshold")
    public DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold regionDdosThreshold;

    public static DescribeRegionDdosThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionDdosThresholdResponseBody self = new DescribeRegionDdosThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionDdosThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionDdosThresholdResponseBody setRegionDdosThreshold(DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold regionDdosThreshold) {
        this.regionDdosThreshold = regionDdosThreshold;
        return this;
    }
    public DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold getRegionDdosThreshold() {
        return this.regionDdosThreshold;
    }

    public static class DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold extends TeaModel {
        @NameInMap("ElasticThreshold")
        public Integer elasticThreshold;

        @NameInMap("BaseThreshold")
        public Integer baseThreshold;

        public static DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold self = new DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold();
            return TeaModel.build(map, self);
        }

        public DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold setElasticThreshold(Integer elasticThreshold) {
            this.elasticThreshold = elasticThreshold;
            return this;
        }
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        public DescribeRegionDdosThresholdResponseBodyRegionDdosThreshold setBaseThreshold(Integer baseThreshold) {
            this.baseThreshold = baseThreshold;
            return this;
        }
        public Integer getBaseThreshold() {
            return this.baseThreshold;
        }

    }

}

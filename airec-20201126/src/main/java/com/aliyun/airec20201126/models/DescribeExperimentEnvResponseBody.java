// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeExperimentEnvResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeExperimentEnvResponseBodyResult result;

    public static DescribeExperimentEnvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExperimentEnvResponseBody self = new DescribeExperimentEnvResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExperimentEnvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExperimentEnvResponseBody setResult(DescribeExperimentEnvResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeExperimentEnvResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeExperimentEnvResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("bucketCount")
        public Integer bucketCount;

        /**
         * <strong>example:</strong>
         * <p>UID</p>
         */
        @NameInMap("divideType")
        public String divideType;

        public static DescribeExperimentEnvResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeExperimentEnvResponseBodyResult self = new DescribeExperimentEnvResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeExperimentEnvResponseBodyResult setBucketCount(Integer bucketCount) {
            this.bucketCount = bucketCount;
            return this;
        }
        public Integer getBucketCount() {
            return this.bucketCount;
        }

        public DescribeExperimentEnvResponseBodyResult setDivideType(String divideType) {
            this.divideType = divideType;
            return this;
        }
        public String getDivideType() {
            return this.divideType;
        }

    }

}

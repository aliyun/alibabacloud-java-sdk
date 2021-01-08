// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeSceneThroughputResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeSceneThroughputResponseBodyResult result;

    public static DescribeSceneThroughputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneThroughputResponseBody self = new DescribeSceneThroughputResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneThroughputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneThroughputResponseBody setResult(DescribeSceneThroughputResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSceneThroughputResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeSceneThroughputResponseBodyResult extends TeaModel {
        @NameInMap("PvCount")
        public Long pvCount;

        public static DescribeSceneThroughputResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneThroughputResponseBodyResult self = new DescribeSceneThroughputResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSceneThroughputResponseBodyResult setPvCount(Long pvCount) {
            this.pvCount = pvCount;
            return this;
        }
        public Long getPvCount() {
            return this.pvCount;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSceneThroughputResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeSceneThroughputResponseBodyResult result;

    public static DescribeSceneThroughputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneThroughputResponseBody self = new DescribeSceneThroughputResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneThroughputResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSceneThroughputResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        @NameInMap("pvCount")
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

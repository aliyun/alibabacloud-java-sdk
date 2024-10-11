// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSceneBucketResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E3D6FE3B-B7C2-43DA-9A13-5EA837ACED9B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeSceneBucketResponseBodyResult result;

    public static DescribeSceneBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneBucketResponseBody self = new DescribeSceneBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneBucketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneBucketResponseBody setResult(DescribeSceneBucketResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSceneBucketResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeSceneBucketResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("detail")
        public java.util.Map<String, ?> detail;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("inUse")
        public String inUse;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("num")
        public Integer num;

        public static DescribeSceneBucketResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneBucketResponseBodyResult self = new DescribeSceneBucketResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSceneBucketResponseBodyResult setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public DescribeSceneBucketResponseBodyResult setInUse(String inUse) {
            this.inUse = inUse;
            return this;
        }
        public String getInUse() {
            return this.inUse;
        }

        public DescribeSceneBucketResponseBodyResult setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeQuotaResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The quotas of the instance.</p>
     */
    @NameInMap("result")
    public DescribeQuotaResponseBodyResult result;

    public static DescribeQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuotaResponseBody self = new DescribeQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeQuotaResponseBody setResult(DescribeQuotaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeQuotaResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeQuotaResponseBodyResult extends TeaModel {
        /**
         * <p>The current QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("currentQps")
        public Integer currentQps;

        /**
         * <p>The number of documents in the item table. Valid values:</p>
         * <p>1000000 to 10000000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("itemCount")
        public Long itemCount;

        /**
         * <p>The number of items that are used in the item table.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("itemCountUsed")
        public Long itemCountUsed;

        /**
         * <p>The queries per second (QPS). Valid values:</p>
         * <p>10 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("qps")
        public Integer qps;

        /**
         * <p>The number of documents in the user table. Valid values:</p>
         * <p>1000000 to 10000000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("userCount")
        public Long userCount;

        /**
         * <p>The number of users that are used in the user table.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("userCountUsed")
        public Long userCountUsed;

        public static DescribeQuotaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeQuotaResponseBodyResult self = new DescribeQuotaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeQuotaResponseBodyResult setCurrentQps(Integer currentQps) {
            this.currentQps = currentQps;
            return this;
        }
        public Integer getCurrentQps() {
            return this.currentQps;
        }

        public DescribeQuotaResponseBodyResult setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public DescribeQuotaResponseBodyResult setItemCountUsed(Long itemCountUsed) {
            this.itemCountUsed = itemCountUsed;
            return this;
        }
        public Long getItemCountUsed() {
            return this.itemCountUsed;
        }

        public DescribeQuotaResponseBodyResult setQps(Integer qps) {
            this.qps = qps;
            return this;
        }
        public Integer getQps() {
            return this.qps;
        }

        public DescribeQuotaResponseBodyResult setUserCount(Long userCount) {
            this.userCount = userCount;
            return this;
        }
        public Long getUserCount() {
            return this.userCount;
        }

        public DescribeQuotaResponseBodyResult setUserCountUsed(Long userCountUsed) {
            this.userCountUsed = userCountUsed;
            return this;
        }
        public Long getUserCountUsed() {
            return this.userCountUsed;
        }

    }

}

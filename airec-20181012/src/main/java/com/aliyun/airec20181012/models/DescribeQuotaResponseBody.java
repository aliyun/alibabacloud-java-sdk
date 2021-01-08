// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeQuotaResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DescribeQuotaResponseBodyResult result;

    public static DescribeQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQuotaResponseBody self = new DescribeQuotaResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeQuotaResponseBody setResult(DescribeQuotaResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeQuotaResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeQuotaResponseBodyResult extends TeaModel {
        @NameInMap("Qps")
        public Integer qps;

        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("CurrentQps")
        public Integer currentQps;

        @NameInMap("UserCount")
        public Long userCount;

        @NameInMap("UserCountUsed")
        public Long userCountUsed;

        @NameInMap("ItemCountUsed")
        public Long itemCountUsed;

        public static DescribeQuotaResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeQuotaResponseBodyResult self = new DescribeQuotaResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeQuotaResponseBodyResult setQps(Integer qps) {
            this.qps = qps;
            return this;
        }
        public Integer getQps() {
            return this.qps;
        }

        public DescribeQuotaResponseBodyResult setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public DescribeQuotaResponseBodyResult setCurrentQps(Integer currentQps) {
            this.currentQps = currentQps;
            return this;
        }
        public Integer getCurrentQps() {
            return this.currentQps;
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

        public DescribeQuotaResponseBodyResult setItemCountUsed(Long itemCountUsed) {
            this.itemCountUsed = itemCountUsed;
            return this;
        }
        public Long getItemCountUsed() {
            return this.itemCountUsed;
        }

    }

}

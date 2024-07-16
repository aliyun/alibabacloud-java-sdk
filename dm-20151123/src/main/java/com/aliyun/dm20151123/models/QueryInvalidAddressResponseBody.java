// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryInvalidAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextStart")
    public String nextStart;

    /**
     * <strong>example:</strong>
     * <p>95A7D497-F8DD-4834-B81E-C1783236E55F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public QueryInvalidAddressResponseBodyData data;

    public static QueryInvalidAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInvalidAddressResponseBody self = new QueryInvalidAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInvalidAddressResponseBody setNextStart(String nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public String getNextStart() {
        return this.nextStart;
    }

    public QueryInvalidAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInvalidAddressResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryInvalidAddressResponseBody setData(QueryInvalidAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInvalidAddressResponseBodyData getData() {
        return this.data;
    }

    public static class QueryInvalidAddressResponseBodyDataMailDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-04-28T17:11Z</p>
         */
        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:toaddress@test.com">toaddress@test.com</a></p>
         */
        @NameInMap("ToAddress")
        public String toAddress;

        /**
         * <strong>example:</strong>
         * <p>1619601108</p>
         */
        @NameInMap("UtcLastUpdateTime")
        public Long utcLastUpdateTime;

        public static QueryInvalidAddressResponseBodyDataMailDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryInvalidAddressResponseBodyDataMailDetail self = new QueryInvalidAddressResponseBodyDataMailDetail();
            return TeaModel.build(map, self);
        }

        public QueryInvalidAddressResponseBodyDataMailDetail setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public QueryInvalidAddressResponseBodyDataMailDetail setToAddress(String toAddress) {
            this.toAddress = toAddress;
            return this;
        }
        public String getToAddress() {
            return this.toAddress;
        }

        public QueryInvalidAddressResponseBodyDataMailDetail setUtcLastUpdateTime(Long utcLastUpdateTime) {
            this.utcLastUpdateTime = utcLastUpdateTime;
            return this;
        }
        public Long getUtcLastUpdateTime() {
            return this.utcLastUpdateTime;
        }

    }

    public static class QueryInvalidAddressResponseBodyData extends TeaModel {
        @NameInMap("mailDetail")
        public java.util.List<QueryInvalidAddressResponseBodyDataMailDetail> mailDetail;

        public static QueryInvalidAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInvalidAddressResponseBodyData self = new QueryInvalidAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInvalidAddressResponseBodyData setMailDetail(java.util.List<QueryInvalidAddressResponseBodyDataMailDetail> mailDetail) {
            this.mailDetail = mailDetail;
            return this;
        }
        public java.util.List<QueryInvalidAddressResponseBodyDataMailDetail> getMailDetail() {
            return this.mailDetail;
        }

    }

}

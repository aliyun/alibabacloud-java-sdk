// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryInvalidAddressResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public QueryInvalidAddressResponseBodyData data;

    @NameInMap("NextStart")
    public Integer nextStart;

    public static QueryInvalidAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInvalidAddressResponseBody self = new QueryInvalidAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInvalidAddressResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryInvalidAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInvalidAddressResponseBody setData(QueryInvalidAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInvalidAddressResponseBodyData getData() {
        return this.data;
    }

    public QueryInvalidAddressResponseBody setNextStart(Integer nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public Integer getNextStart() {
        return this.nextStart;
    }

    public static class QueryInvalidAddressResponseBodyDataMailDetail extends TeaModel {
        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        @NameInMap("ToAddress")
        public String toAddress;

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

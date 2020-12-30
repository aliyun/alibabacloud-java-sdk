// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverDetailResponseBody extends TeaModel {
    @NameInMap("DataSchema")
    public String dataSchema;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public QueryReceiverDetailResponseBodyData data;

    @NameInMap("NextStart")
    public String nextStart;

    public static QueryReceiverDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryReceiverDetailResponseBody self = new QueryReceiverDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryReceiverDetailResponseBody setDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
        return this;
    }
    public String getDataSchema() {
        return this.dataSchema;
    }

    public QueryReceiverDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryReceiverDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReceiverDetailResponseBody setData(QueryReceiverDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryReceiverDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryReceiverDetailResponseBody setNextStart(String nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public String getNextStart() {
        return this.nextStart;
    }

    public static class QueryReceiverDetailResponseBodyDataDetail extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Email")
        public String email;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UtcCreateTime")
        public Long utcCreateTime;

        public static QueryReceiverDetailResponseBodyDataDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiverDetailResponseBodyDataDetail self = new QueryReceiverDetailResponseBodyDataDetail();
            return TeaModel.build(map, self);
        }

        public QueryReceiverDetailResponseBodyDataDetail setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryReceiverDetailResponseBodyDataDetail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryReceiverDetailResponseBodyDataDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryReceiverDetailResponseBodyDataDetail setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

    }

    public static class QueryReceiverDetailResponseBodyData extends TeaModel {
        @NameInMap("detail")
        public java.util.List<QueryReceiverDetailResponseBodyDataDetail> detail;

        public static QueryReceiverDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiverDetailResponseBodyData self = new QueryReceiverDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryReceiverDetailResponseBodyData setDetail(java.util.List<QueryReceiverDetailResponseBodyDataDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<QueryReceiverDetailResponseBodyDataDetail> getDetail() {
            return this.detail;
        }

    }

}

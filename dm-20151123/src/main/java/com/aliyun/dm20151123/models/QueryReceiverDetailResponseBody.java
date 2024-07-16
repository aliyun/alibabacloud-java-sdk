// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryReceiverDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UserName,NickName,Gender,Birthday,Mobile</p>
     */
    @NameInMap("DataSchema")
    public String dataSchema;

    /**
     * <strong>example:</strong>
     * <p>90f0243616#401#b68c2af70b9664b2843f90fd3630b1a3-1650779410#<a href="mailto:xxx@demo.aliyun.com">xxx@demo.aliyun.com</a></p>
     */
    @NameInMap("NextStart")
    public String nextStart;

    /**
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>361</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("data")
    public QueryReceiverDetailResponseBodyData data;

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

    public QueryReceiverDetailResponseBody setNextStart(String nextStart) {
        this.nextStart = nextStart;
        return this;
    }
    public String getNextStart() {
        return this.nextStart;
    }

    public QueryReceiverDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryReceiverDetailResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryReceiverDetailResponseBody setData(QueryReceiverDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryReceiverDetailResponseBodyData getData() {
        return this.data;
    }

    public static class QueryReceiverDetailResponseBodyDataDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2019-09-29T13:28Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Domains\&quot;: [\&quot;a.example.net\&quot;, \&quot;b.example.net\&quot;, \&quot;c.example.net\&quot;, \&quot;d.example.net\&quot;]}</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>a***@example.net</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1569734892</p>
         */
        @NameInMap("UtcCreateTime")
        public Long utcCreateTime;

        public static QueryReceiverDetailResponseBodyDataDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryReceiverDetailResponseBodyDataDetail self = new QueryReceiverDetailResponseBodyDataDetail();
            return TeaModel.build(map, self);
        }

        public QueryReceiverDetailResponseBodyDataDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

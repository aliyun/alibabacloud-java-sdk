// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QuerySmsStatisticsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public QuerySmsStatisticsResponseBodyData data;

    public static QuerySmsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsStatisticsResponseBody self = new QuerySmsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsStatisticsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QuerySmsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySmsStatisticsResponseBody setData(QuerySmsStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySmsStatisticsResponseBodyData getData() {
        return this.data;
    }

    public static class QuerySmsStatisticsResponseBodyDataStat extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("faildCount")
        public String faildCount;

        @NameInMap("successCount")
        public String successCount;

        @NameInMap("requestCount")
        public String requestCount;

        public static QuerySmsStatisticsResponseBodyDataStat build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsStatisticsResponseBodyDataStat self = new QuerySmsStatisticsResponseBodyDataStat();
            return TeaModel.build(map, self);
        }

        public QuerySmsStatisticsResponseBodyDataStat setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QuerySmsStatisticsResponseBodyDataStat setFaildCount(String faildCount) {
            this.faildCount = faildCount;
            return this;
        }
        public String getFaildCount() {
            return this.faildCount;
        }

        public QuerySmsStatisticsResponseBodyDataStat setSuccessCount(String successCount) {
            this.successCount = successCount;
            return this;
        }
        public String getSuccessCount() {
            return this.successCount;
        }

        public QuerySmsStatisticsResponseBodyDataStat setRequestCount(String requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public String getRequestCount() {
            return this.requestCount;
        }

    }

    public static class QuerySmsStatisticsResponseBodyData extends TeaModel {
        @NameInMap("stat")
        public java.util.List<QuerySmsStatisticsResponseBodyDataStat> stat;

        public static QuerySmsStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySmsStatisticsResponseBodyData self = new QuerySmsStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySmsStatisticsResponseBodyData setStat(java.util.List<QuerySmsStatisticsResponseBodyDataStat> stat) {
            this.stat = stat;
            return this;
        }
        public java.util.List<QuerySmsStatisticsResponseBodyDataStat> getStat() {
            return this.stat;
        }

    }

}

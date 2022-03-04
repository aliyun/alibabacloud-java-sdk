// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeRunningQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeRunningQueryResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRunningQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningQueryResponseBody self = new DescribeRunningQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRunningQueryResponseBody setData(java.util.List<DescribeRunningQueryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRunningQueryResponseBodyData> getData() {
        return this.data;
    }

    public DescribeRunningQueryResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRunningQueryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRunningQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRunningQueryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRunningQueryResponseBodyData extends TeaModel {
        // 查询源地址
        @NameInMap("InitialAddress")
        public String initialAddress;

        // 查询ID
        @NameInMap("InitialQueryId")
        public String initialQueryId;

        // 查询用户
        @NameInMap("InitialUser")
        public String initialUser;

        @NameInMap("Query")
        public String query;

        // 查询持续时间 毫秒
        @NameInMap("QueryDurationMs")
        public Long queryDurationMs;

        // 查询起始时间 UTC时间
        @NameInMap("QueryStartTime")
        public String queryStartTime;

        public static DescribeRunningQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRunningQueryResponseBodyData self = new DescribeRunningQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRunningQueryResponseBodyData setInitialAddress(String initialAddress) {
            this.initialAddress = initialAddress;
            return this;
        }
        public String getInitialAddress() {
            return this.initialAddress;
        }

        public DescribeRunningQueryResponseBodyData setInitialQueryId(String initialQueryId) {
            this.initialQueryId = initialQueryId;
            return this;
        }
        public String getInitialQueryId() {
            return this.initialQueryId;
        }

        public DescribeRunningQueryResponseBodyData setInitialUser(String initialUser) {
            this.initialUser = initialUser;
            return this;
        }
        public String getInitialUser() {
            return this.initialUser;
        }

        public DescribeRunningQueryResponseBodyData setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public DescribeRunningQueryResponseBodyData setQueryDurationMs(Long queryDurationMs) {
            this.queryDurationMs = queryDurationMs;
            return this;
        }
        public Long getQueryDurationMs() {
            return this.queryDurationMs;
        }

        public DescribeRunningQueryResponseBodyData setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

    }

}

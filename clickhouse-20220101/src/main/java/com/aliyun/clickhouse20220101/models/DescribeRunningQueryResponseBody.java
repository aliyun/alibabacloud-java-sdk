// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeRunningQueryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeRunningQueryResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>48CBEEBE-FA07-5A06-8BA4-567B92ADD6A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>::ffff:10.1.XX.XX</p>
         */
        @NameInMap("InitialAddress")
        public String initialAddress;

        /**
         * <strong>example:</strong>
         * <p>7c28bbbb-753b-4eba-98b1-efcbe2b9bdf6</p>
         */
        @NameInMap("InitialQueryId")
        public String initialQueryId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InitialUser")
        public String initialUser;

        /**
         * <strong>example:</strong>
         * <p>select * from test order by score limit 1;</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("QueryDurationMs")
        public Long queryDurationMs;

        /**
         * <strong>example:</strong>
         * <p>2021-02-02T09:14:48Z</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceErrorLogResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceErrorLogResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDBInstanceErrorLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceErrorLogResponseBody self = new DescribeDBInstanceErrorLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceErrorLogResponseBody setItems(java.util.List<DescribeDBInstanceErrorLogResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBInstanceErrorLogResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBInstanceErrorLogResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceErrorLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceErrorLogResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDBInstanceErrorLogResponseBodyItems extends TeaModel {
        @NameInMap("Database")
        public String database;

        @NameInMap("Host")
        public String host;

        @NameInMap("LogContext")
        public String logContext;

        @NameInMap("LogLevel")
        public String logLevel;

        @NameInMap("Time")
        public Long time;

        @NameInMap("User")
        public String user;

        public static DescribeDBInstanceErrorLogResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceErrorLogResponseBodyItems self = new DescribeDBInstanceErrorLogResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceErrorLogResponseBodyItems setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeDBInstanceErrorLogResponseBodyItems setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeDBInstanceErrorLogResponseBodyItems setLogContext(String logContext) {
            this.logContext = logContext;
            return this;
        }
        public String getLogContext() {
            return this.logContext;
        }

        public DescribeDBInstanceErrorLogResponseBodyItems setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

        public DescribeDBInstanceErrorLogResponseBodyItems setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeDBInstanceErrorLogResponseBodyItems setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}

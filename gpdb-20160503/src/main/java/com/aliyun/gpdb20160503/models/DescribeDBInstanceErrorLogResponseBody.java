// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceErrorLogResponseBody extends TeaModel {
    /**
     * <p>The content of the error log.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDBInstanceErrorLogResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adbtest</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The content of the error log.</p>
         * 
         * <strong>example:</strong>
         * <p>unsupported frontend protocol 2689.28208: server supports 1.0 to 3.0</p>
         */
        @NameInMap("LogContext")
        public String logContext;

        /**
         * <p>The level of the queried log.</p>
         * 
         * <strong>example:</strong>
         * <p>FATAL</p>
         */
        @NameInMap("LogLevel")
        public String logLevel;

        /**
         * <p>The time when the log was generated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-24 11:28:14</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>adbpguser</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The database engine.</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>Details about the log entries returned.</p>
     */
    @NameInMap("Items")
    public DescribeErrorLogRecordsResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeErrorLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogRecordsResponseBody self = new DescribeErrorLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeErrorLogRecordsResponseBody setItems(DescribeErrorLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeErrorLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeErrorLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeErrorLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeErrorLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeErrorLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeErrorLogRecordsResponseBodyItemsLogRecords extends TeaModel {
        /**
         * <p>The category of the log entry. Valid values:</p>
         * <br>
         * <p>*   NETWORK: network connection log</p>
         * <p>*   ACCESS: access control log</p>
         * <p>*   \-: general log</p>
         * <p>*   COMMAND: slow query log</p>
         * <p>*   SHARDING: sharded cluster log</p>
         * <p>*   STORAGE: storage engine log</p>
         * <p>*   CONNPOOL: connection pool log</p>
         * <p>*   ASIO: asynchronous I/O operation log</p>
         * <p>*   WRITE: slow update log</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The connection information of the log entry.</p>
         */
        @NameInMap("ConnInfo")
        public String connInfo;

        /**
         * <p>The content of the log entry.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the log entry was generated. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the log entry.</p>
         */
        @NameInMap("Id")
        public Integer id;

        public static DescribeErrorLogRecordsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogRecordsResponseBodyItemsLogRecords self = new DescribeErrorLogRecordsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setConnInfo(String connInfo) {
            this.connInfo = connInfo;
            return this;
        }
        public String getConnInfo() {
            return this.connInfo;
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class DescribeErrorLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("LogRecords")
        public java.util.List<DescribeErrorLogRecordsResponseBodyItemsLogRecords> logRecords;

        public static DescribeErrorLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogRecordsResponseBodyItems self = new DescribeErrorLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogRecordsResponseBodyItems setLogRecords(java.util.List<DescribeErrorLogRecordsResponseBodyItemsLogRecords> logRecords) {
            this.logRecords = logRecords;
            return this;
        }
        public java.util.List<DescribeErrorLogRecordsResponseBodyItemsLogRecords> getLogRecords() {
            return this.logRecords;
        }

    }

}

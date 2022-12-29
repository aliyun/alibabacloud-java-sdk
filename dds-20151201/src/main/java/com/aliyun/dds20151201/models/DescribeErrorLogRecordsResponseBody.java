// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsResponseBody extends TeaModel {
    // The database engine.
    @NameInMap("Engine")
    public String engine;

    // Details about the log entries returned.
    @NameInMap("Items")
    public DescribeErrorLogRecordsResponseBodyItems items;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries.
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
        // The category of the log entry. Valid values:
        // 
        // *   NETWORK: network connection log
        // *   ACCESS: access control log
        // *   \-: general log
        // *   COMMAND: slow query log
        // *   SHARDING: sharded cluster log
        // *   STORAGE: storage engine log
        // *   CONNPOOL: connection pool log
        // *   ASIO: asynchronous I/O operation log
        // *   WRITE: slow update log
        @NameInMap("Category")
        public String category;

        // The connection information of the log entry.
        @NameInMap("ConnInfo")
        public String connInfo;

        // The content of the log entry.
        @NameInMap("Content")
        public String content;

        // The time when the log entry was generated. The time is in the *yyyy-MM-dd*T*HH:mm:ss***Z format. The time is displayed in UTC.
        @NameInMap("CreateTime")
        public String createTime;

        // The ID of the log entry.
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>68BCBEC2-1E66-471F-A1A8-E3C60C0A80B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <ul>
         * <li>NETWORK: network connection log</li>
         * <li>ACCESS: access control log</li>
         * <li>\-: general log</li>
         * <li>COMMAND: slow query log</li>
         * <li>SHARDING: sharded cluster log</li>
         * <li>STORAGE: storage engine log</li>
         * <li>CONNPOOL: connection pool log</li>
         * <li>ASIO: asynchronous I/O operation log</li>
         * <li>WRITE: slow update log</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NETWORK</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The connection information of the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>conn18xxxxxx</p>
         */
        @NameInMap("ConnInfo")
        public String connInfo;

        /**
         * <p>The content of the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The time when the log entry was generated. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-26T12:09:34Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
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

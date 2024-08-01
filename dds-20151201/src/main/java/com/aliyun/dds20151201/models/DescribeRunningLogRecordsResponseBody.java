// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRunningLogRecordsResponseBody extends TeaModel {
    /**
     * <p>The database engine.</p>
     * 
     * <strong>example:</strong>
     * <p>MongoDB</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>Details about the operational log entries.</p>
     */
    @NameInMap("Items")
    public DescribeRunningLogRecordsResponseBodyItems items;

    /**
     * <p>The number of the page to return.</p>
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
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>45D2B592-DEBA-4347-BBF3-47FF6C97DBBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeRunningLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunningLogRecordsResponseBody self = new DescribeRunningLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRunningLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeRunningLogRecordsResponseBody setItems(DescribeRunningLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeRunningLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeRunningLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRunningLogRecordsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeRunningLogRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRunningLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeRunningLogRecordsResponseBodyItemsLogRecords extends TeaModel {
        /**
         * <p>The category of the log entry.</p>
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
         * <p>end connection 11.xxx.xxx.xx:3xxxx (0 connections now open)\n</p>
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

        public static DescribeRunningLogRecordsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeRunningLogRecordsResponseBodyItemsLogRecords self = new DescribeRunningLogRecordsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setConnInfo(String connInfo) {
            this.connInfo = connInfo;
            return this;
        }
        public String getConnInfo() {
            return this.connInfo;
        }

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeRunningLogRecordsResponseBodyItemsLogRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeRunningLogRecordsResponseBodyItems extends TeaModel {
        @NameInMap("LogRecords")
        public java.util.List<DescribeRunningLogRecordsResponseBodyItemsLogRecords> logRecords;

        public static DescribeRunningLogRecordsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRunningLogRecordsResponseBodyItems self = new DescribeRunningLogRecordsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRunningLogRecordsResponseBodyItems setLogRecords(java.util.List<DescribeRunningLogRecordsResponseBodyItemsLogRecords> logRecords) {
            this.logRecords = logRecords;
            return this;
        }
        public java.util.List<DescribeRunningLogRecordsResponseBodyItemsLogRecords> getLogRecords() {
            return this.logRecords;
        }

    }

}

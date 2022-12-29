// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRunningLogRecordsResponseBody extends TeaModel {
    // The database engine.
    @NameInMap("Engine")
    public String engine;

    // Details about the operational log entries.
    @NameInMap("Items")
    public DescribeRunningLogRecordsResponseBodyItems items;

    // The number of the page to return.
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
        // The category of the log entry. Valid values:
        @NameInMap("Category")
        public String category;

        // The connection information of the log entry.
        @NameInMap("ConnInfo")
        public String connInfo;

        // The content of the log entry.
        @NameInMap("Content")
        public String content;

        // The time when the log entry was generated. The time is in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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

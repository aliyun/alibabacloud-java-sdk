// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeErrorLogRecordsResponseBody extends TeaModel {
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeErrorLogRecordsResponseBodyItems items;

    @NameInMap("Engine")
    public String engine;

    public static DescribeErrorLogRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeErrorLogRecordsResponseBody self = new DescribeErrorLogRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeErrorLogRecordsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
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

    public DescribeErrorLogRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeErrorLogRecordsResponseBody setItems(DescribeErrorLogRecordsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeErrorLogRecordsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeErrorLogRecordsResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public static class DescribeErrorLogRecordsResponseBodyItemsLogRecords extends TeaModel {
        @NameInMap("ConnInfo")
        public String connInfo;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Category")
        public String category;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Integer id;

        public static DescribeErrorLogRecordsResponseBodyItemsLogRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeErrorLogRecordsResponseBodyItemsLogRecords self = new DescribeErrorLogRecordsResponseBodyItemsLogRecords();
            return TeaModel.build(map, self);
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setConnInfo(String connInfo) {
            this.connInfo = connInfo;
            return this;
        }
        public String getConnInfo() {
            return this.connInfo;
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeErrorLogRecordsResponseBodyItemsLogRecords setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
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

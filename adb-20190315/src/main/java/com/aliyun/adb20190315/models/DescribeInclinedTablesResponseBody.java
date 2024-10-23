// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeInclinedTablesResponseBody extends TeaModel {
    @NameInMap("DetectionItems")
    public java.util.List<DescribeInclinedTablesResponseBodyDetectionItems> detectionItems;

    /**
     * <p>The monitoring information about tables.</p>
     */
    @NameInMap("Items")
    public DescribeInclinedTablesResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
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
    public String totalCount;

    public static DescribeInclinedTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInclinedTablesResponseBody self = new DescribeInclinedTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInclinedTablesResponseBody setDetectionItems(java.util.List<DescribeInclinedTablesResponseBodyDetectionItems> detectionItems) {
        this.detectionItems = detectionItems;
        return this;
    }
    public java.util.List<DescribeInclinedTablesResponseBodyDetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    public DescribeInclinedTablesResponseBody setItems(DescribeInclinedTablesResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeInclinedTablesResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeInclinedTablesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInclinedTablesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeInclinedTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInclinedTablesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInclinedTablesResponseBodyDetectionItems extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static DescribeInclinedTablesResponseBodyDetectionItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedTablesResponseBodyDetectionItems self = new DescribeInclinedTablesResponseBodyDetectionItems();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedTablesResponseBodyDetectionItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeInclinedTablesResponseBodyDetectionItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInclinedTablesResponseBodyDetectionItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeInclinedTablesResponseBodyItemsTable extends TeaModel {
        @NameInMap("IsIncline")
        public String isIncline;

        @NameInMap("Name")
        public String name;

        @NameInMap("RowCount")
        public Long rowCount;

        @NameInMap("Schema")
        public String schema;

        @NameInMap("Size")
        public String size;

        @NameInMap("SpaceRatio")
        public Double spaceRatio;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("Type")
        public String type;

        public static DescribeInclinedTablesResponseBodyItemsTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedTablesResponseBodyItemsTable self = new DescribeInclinedTablesResponseBodyItemsTable();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedTablesResponseBodyItemsTable setIsIncline(String isIncline) {
            this.isIncline = isIncline;
            return this;
        }
        public String getIsIncline() {
            return this.isIncline;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Long getRowCount() {
            return this.rowCount;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setSpaceRatio(Double spaceRatio) {
            this.spaceRatio = spaceRatio;
            return this;
        }
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeInclinedTablesResponseBodyItemsTable setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeInclinedTablesResponseBodyItems extends TeaModel {
        @NameInMap("Table")
        public java.util.List<DescribeInclinedTablesResponseBodyItemsTable> table;

        public static DescribeInclinedTablesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInclinedTablesResponseBodyItems self = new DescribeInclinedTablesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInclinedTablesResponseBodyItems setTable(java.util.List<DescribeInclinedTablesResponseBodyItemsTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<DescribeInclinedTablesResponseBodyItemsTable> getTable() {
            return this.table;
        }

    }

}

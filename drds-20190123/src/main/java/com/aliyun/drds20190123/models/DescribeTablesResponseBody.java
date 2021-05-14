// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTablesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("List")
    public java.util.List<DescribeTablesResponseBodyList> list;

    public static DescribeTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesResponseBody self = new DescribeTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTablesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTablesResponseBody setList(java.util.List<DescribeTablesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeTablesResponseBodyList> getList() {
        return this.list;
    }

    public static class DescribeTablesResponseBodyList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("IsLocked")
        public Boolean isLocked;

        @NameInMap("ShardKey")
        public String shardKey;

        @NameInMap("IsShard")
        public Boolean isShard;

        @NameInMap("Broadcast")
        public Boolean broadcast;

        @NameInMap("AllowFullTableScan")
        public Boolean allowFullTableScan;

        @NameInMap("Table")
        public String table;

        @NameInMap("DbInstType")
        public Integer dbInstType;

        public static DescribeTablesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseBodyList self = new DescribeTablesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeTablesResponseBodyList setIsLocked(Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        public DescribeTablesResponseBodyList setShardKey(String shardKey) {
            this.shardKey = shardKey;
            return this;
        }
        public String getShardKey() {
            return this.shardKey;
        }

        public DescribeTablesResponseBodyList setIsShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }
        public Boolean getIsShard() {
            return this.isShard;
        }

        public DescribeTablesResponseBodyList setBroadcast(Boolean broadcast) {
            this.broadcast = broadcast;
            return this;
        }
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        public DescribeTablesResponseBodyList setAllowFullTableScan(Boolean allowFullTableScan) {
            this.allowFullTableScan = allowFullTableScan;
            return this;
        }
        public Boolean getAllowFullTableScan() {
            return this.allowFullTableScan;
        }

        public DescribeTablesResponseBodyList setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeTablesResponseBodyList setDbInstType(Integer dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public Integer getDbInstType() {
            return this.dbInstType;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("List")
    @Validation(required = true)
    public java.util.List<DescribeTablesResponseList> list;

    public static DescribeTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesResponse self = new DescribeTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTablesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTablesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTablesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTablesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTablesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeTablesResponse setList(java.util.List<DescribeTablesResponseList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeTablesResponseList> getList() {
        return this.list;
    }

    public static class DescribeTablesResponseList extends TeaModel {
        @NameInMap("Table")
        @Validation(required = true)
        public String table;

        @NameInMap("ShardKey")
        @Validation(required = true)
        public String shardKey;

        @NameInMap("IsShard")
        @Validation(required = true)
        public Boolean isShard;

        @NameInMap("IsLocked")
        @Validation(required = true)
        public Boolean isLocked;

        @NameInMap("DbInstType")
        @Validation(required = true)
        public Integer dbInstType;

        @NameInMap("Broadcast")
        @Validation(required = true)
        public Boolean broadcast;

        @NameInMap("AllowFullTableScan")
        @Validation(required = true)
        public Boolean allowFullTableScan;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static DescribeTablesResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseList self = new DescribeTablesResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseList setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeTablesResponseList setShardKey(String shardKey) {
            this.shardKey = shardKey;
            return this;
        }
        public String getShardKey() {
            return this.shardKey;
        }

        public DescribeTablesResponseList setIsShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }
        public Boolean getIsShard() {
            return this.isShard;
        }

        public DescribeTablesResponseList setIsLocked(Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        public DescribeTablesResponseList setDbInstType(Integer dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public Integer getDbInstType() {
            return this.dbInstType;
        }

        public DescribeTablesResponseList setBroadcast(Boolean broadcast) {
            this.broadcast = broadcast;
            return this;
        }
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        public DescribeTablesResponseList setAllowFullTableScan(Boolean allowFullTableScan) {
            this.allowFullTableScan = allowFullTableScan;
            return this;
        }
        public Boolean getAllowFullTableScan() {
            return this.allowFullTableScan;
        }

        public DescribeTablesResponseList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}

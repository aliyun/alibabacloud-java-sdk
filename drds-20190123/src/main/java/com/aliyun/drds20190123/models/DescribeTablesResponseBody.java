// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeTablesResponseBody extends TeaModel {
    /**
     * <p>The list of returned tables.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeTablesResponseBodyList> list;

    /**
     * <p>The number of returned pages.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tables returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned tables.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTablesResponseBody self = new DescribeTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTablesResponseBody setList(java.util.List<DescribeTablesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeTablesResponseBodyList> getList() {
        return this.list;
    }

    public DescribeTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTablesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeTablesResponseBodyList extends TeaModel {
        /**
         * <p>Indicates whether full table scanning is allowed.</p>
         */
        @NameInMap("AllowFullTableScan")
        public Boolean allowFullTableScan;

        /**
         * <p>Indicates whether the table is a replicated table.</p>
         */
        @NameInMap("Broadcast")
        public Boolean broadcast;

        /**
         * <p>The type of the PolarDB-X 1.0 instance. Valid values:</p>
         * <br>
         * <p>*   0: The instance is a dedicated instance.</p>
         * <p>*   1: The instance is a shard instance.</p>
         */
        @NameInMap("DbInstType")
        public Integer dbInstType;

        /**
         * <p>Indicates whether the table is locked.</p>
         */
        @NameInMap("IsLocked")
        public Boolean isLocked;

        /**
         * <p>Indicates whether the table is sharded.</p>
         */
        @NameInMap("IsShard")
        public Boolean isShard;

        /**
         * <p>The shard key of the table.</p>
         */
        @NameInMap("ShardKey")
        public String shardKey;

        /**
         * <p>Indicates whether sharding tasks are performed on the table. Valid values:</p>
         * <br>
         * <p>*   0: No sharding task is performed on the table.</p>
         * <p>*   1: Sharding tasks are performed on the table.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("Table")
        public String table;

        public static DescribeTablesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTablesResponseBodyList self = new DescribeTablesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeTablesResponseBodyList setAllowFullTableScan(Boolean allowFullTableScan) {
            this.allowFullTableScan = allowFullTableScan;
            return this;
        }
        public Boolean getAllowFullTableScan() {
            return this.allowFullTableScan;
        }

        public DescribeTablesResponseBodyList setBroadcast(Boolean broadcast) {
            this.broadcast = broadcast;
            return this;
        }
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        public DescribeTablesResponseBodyList setDbInstType(Integer dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public Integer getDbInstType() {
            return this.dbInstType;
        }

        public DescribeTablesResponseBodyList setIsLocked(Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        public DescribeTablesResponseBodyList setIsShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }
        public Boolean getIsShard() {
            return this.isShard;
        }

        public DescribeTablesResponseBodyList setShardKey(String shardKey) {
            this.shardKey = shardKey;
            return this;
        }
        public String getShardKey() {
            return this.shardKey;
        }

        public DescribeTablesResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeTablesResponseBodyList setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

}

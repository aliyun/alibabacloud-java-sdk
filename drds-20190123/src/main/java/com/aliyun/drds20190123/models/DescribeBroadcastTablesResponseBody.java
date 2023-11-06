// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBroadcastTablesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the database is sharded.</p>
     */
    @NameInMap("IsShard")
    public Boolean isShard;

    /**
     * <p>Indicates information about broadcast tables.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeBroadcastTablesResponseBodyList> list;

    /**
     * <p>Indicates the page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Indicates the number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates the ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates the total number of entries returned.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeBroadcastTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBroadcastTablesResponseBody self = new DescribeBroadcastTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBroadcastTablesResponseBody setIsShard(Boolean isShard) {
        this.isShard = isShard;
        return this;
    }
    public Boolean getIsShard() {
        return this.isShard;
    }

    public DescribeBroadcastTablesResponseBody setList(java.util.List<DescribeBroadcastTablesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeBroadcastTablesResponseBodyList> getList() {
        return this.list;
    }

    public DescribeBroadcastTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBroadcastTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBroadcastTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBroadcastTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBroadcastTablesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeBroadcastTablesResponseBodyList extends TeaModel {
        /**
         * <p>Indicates whether a table is a broadcast table.</p>
         */
        @NameInMap("Broadcast")
        public Boolean broadcast;

        /**
         * <p>Indicates the type of the broadcast table. Valid values:</p>
         * <br>
         * <p>*   **1**: multi-write mode</p>
         * <p>*   **2**: synchronous mode</p>
         */
        @NameInMap("BroadcastType")
        public String broadcastType;

        /**
         * <p>Indicates the storage type of the database. Valid values:</p>
         * <br>
         * <p>*   **0**: RDS</p>
         * <p>*   **4**: PolarDB</p>
         */
        @NameInMap("DbInstType")
        public Integer dbInstType;

        /**
         * <p>Indicates whether the broadcast table was sharded.</p>
         */
        @NameInMap("IsShard")
        public Boolean isShard;

        /**
         * <p>Indicates the activation state of the broadcast table. Valid values:</p>
         * <br>
         * <p>*   **1**: The broadcast table is activated.</p>
         * <p>*   **2**: The broadcast table is being activated.</p>
         * <p>*   **3**: An exception occurs when the broadcast table is being activated.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates the name of the table.</p>
         */
        @NameInMap("Table")
        public String table;

        public static DescribeBroadcastTablesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBroadcastTablesResponseBodyList self = new DescribeBroadcastTablesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeBroadcastTablesResponseBodyList setBroadcast(Boolean broadcast) {
            this.broadcast = broadcast;
            return this;
        }
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        public DescribeBroadcastTablesResponseBodyList setBroadcastType(String broadcastType) {
            this.broadcastType = broadcastType;
            return this;
        }
        public String getBroadcastType() {
            return this.broadcastType;
        }

        public DescribeBroadcastTablesResponseBodyList setDbInstType(Integer dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public Integer getDbInstType() {
            return this.dbInstType;
        }

        public DescribeBroadcastTablesResponseBodyList setIsShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }
        public Boolean getIsShard() {
            return this.isShard;
        }

        public DescribeBroadcastTablesResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeBroadcastTablesResponseBodyList setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

}

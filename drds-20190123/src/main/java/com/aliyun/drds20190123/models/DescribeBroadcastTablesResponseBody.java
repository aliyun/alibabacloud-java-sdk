// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBroadcastTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("IsShard")
    public Boolean isShard;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("List")
    public java.util.List<DescribeBroadcastTablesResponseBodyList> list;

    public static DescribeBroadcastTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBroadcastTablesResponseBody self = new DescribeBroadcastTablesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeBroadcastTablesResponseBody setIsShard(Boolean isShard) {
        this.isShard = isShard;
        return this;
    }
    public Boolean getIsShard() {
        return this.isShard;
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

    public DescribeBroadcastTablesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeBroadcastTablesResponseBody setList(java.util.List<DescribeBroadcastTablesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeBroadcastTablesResponseBodyList> getList() {
        return this.list;
    }

    public static class DescribeBroadcastTablesResponseBodyList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("IsShard")
        public Boolean isShard;

        @NameInMap("Broadcast")
        public Boolean broadcast;

        @NameInMap("Table")
        public String table;

        @NameInMap("DbInstType")
        public Integer dbInstType;

        @NameInMap("BroadcastType")
        public String broadcastType;

        public static DescribeBroadcastTablesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBroadcastTablesResponseBodyList self = new DescribeBroadcastTablesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeBroadcastTablesResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeBroadcastTablesResponseBodyList setIsShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }
        public Boolean getIsShard() {
            return this.isShard;
        }

        public DescribeBroadcastTablesResponseBodyList setBroadcast(Boolean broadcast) {
            this.broadcast = broadcast;
            return this;
        }
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        public DescribeBroadcastTablesResponseBodyList setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeBroadcastTablesResponseBodyList setDbInstType(Integer dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public Integer getDbInstType() {
            return this.dbInstType;
        }

        public DescribeBroadcastTablesResponseBodyList setBroadcastType(String broadcastType) {
            this.broadcastType = broadcastType;
            return this;
        }
        public String getBroadcastType() {
            return this.broadcastType;
        }

    }

}

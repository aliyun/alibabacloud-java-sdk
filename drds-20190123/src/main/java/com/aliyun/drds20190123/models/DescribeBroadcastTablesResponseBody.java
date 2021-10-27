// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBroadcastTablesResponseBody extends TeaModel {
    @NameInMap("IsShard")
    public Boolean isShard;

    @NameInMap("List")
    public java.util.List<DescribeBroadcastTablesResponseBodyList> list;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Broadcast")
        public Boolean broadcast;

        @NameInMap("BroadcastType")
        public String broadcastType;

        @NameInMap("DbInstType")
        public Integer dbInstType;

        @NameInMap("IsShard")
        public Boolean isShard;

        @NameInMap("Status")
        public Integer status;

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

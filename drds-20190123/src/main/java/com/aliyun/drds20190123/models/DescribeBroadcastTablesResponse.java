// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBroadcastTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("IsShard")
    @Validation(required = true)
    public Boolean isShard;

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
    public java.util.List<DescribeBroadcastTablesResponseList> list;

    public static DescribeBroadcastTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBroadcastTablesResponse self = new DescribeBroadcastTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBroadcastTablesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBroadcastTablesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBroadcastTablesResponse setIsShard(Boolean isShard) {
        this.isShard = isShard;
        return this;
    }
    public Boolean getIsShard() {
        return this.isShard;
    }

    public DescribeBroadcastTablesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBroadcastTablesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBroadcastTablesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeBroadcastTablesResponse setList(java.util.List<DescribeBroadcastTablesResponseList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeBroadcastTablesResponseList> getList() {
        return this.list;
    }

    public static class DescribeBroadcastTablesResponseList extends TeaModel {
        @NameInMap("Table")
        @Validation(required = true)
        public String table;

        @NameInMap("BroadcastType")
        @Validation(required = true)
        public String broadcastType;

        @NameInMap("IsShard")
        @Validation(required = true)
        public Boolean isShard;

        @NameInMap("DbInstType")
        @Validation(required = true)
        public Integer dbInstType;

        @NameInMap("Broadcast")
        @Validation(required = true)
        public Boolean broadcast;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static DescribeBroadcastTablesResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBroadcastTablesResponseList self = new DescribeBroadcastTablesResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeBroadcastTablesResponseList setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeBroadcastTablesResponseList setBroadcastType(String broadcastType) {
            this.broadcastType = broadcastType;
            return this;
        }
        public String getBroadcastType() {
            return this.broadcastType;
        }

        public DescribeBroadcastTablesResponseList setIsShard(Boolean isShard) {
            this.isShard = isShard;
            return this;
        }
        public Boolean getIsShard() {
            return this.isShard;
        }

        public DescribeBroadcastTablesResponseList setDbInstType(Integer dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public Integer getDbInstType() {
            return this.dbInstType;
        }

        public DescribeBroadcastTablesResponseList setBroadcast(Boolean broadcast) {
            this.broadcast = broadcast;
            return this;
        }
        public Boolean getBroadcast() {
            return this.broadcast;
        }

        public DescribeBroadcastTablesResponseList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}

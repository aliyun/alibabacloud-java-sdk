// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBTableListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMetaDBTableListResponseBodyData data;

    public static GetMetaDBTableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBTableListResponseBody self = new GetMetaDBTableListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaDBTableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaDBTableListResponseBody setData(GetMetaDBTableListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaDBTableListResponseBodyData getData() {
        return this.data;
    }

    public static class GetMetaDBTableListResponseBodyDataTableEntityList extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("DatabaseName")
        public String databaseName;

        public static GetMetaDBTableListResponseBodyDataTableEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBTableListResponseBodyDataTableEntityList self = new GetMetaDBTableListResponseBodyDataTableEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaDBTableListResponseBodyDataTableEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaDBTableListResponseBodyDataTableEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaDBTableListResponseBodyDataTableEntityList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

    }

    public static class GetMetaDBTableListResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TableEntityList")
        public java.util.List<GetMetaDBTableListResponseBodyDataTableEntityList> tableEntityList;

        public static GetMetaDBTableListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBTableListResponseBodyData self = new GetMetaDBTableListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaDBTableListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaDBTableListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaDBTableListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaDBTableListResponseBodyData setTableEntityList(java.util.List<GetMetaDBTableListResponseBodyDataTableEntityList> tableEntityList) {
            this.tableEntityList = tableEntityList;
            return this;
        }
        public java.util.List<GetMetaDBTableListResponseBodyDataTableEntityList> getTableEntityList() {
            return this.tableEntityList;
        }

    }

}

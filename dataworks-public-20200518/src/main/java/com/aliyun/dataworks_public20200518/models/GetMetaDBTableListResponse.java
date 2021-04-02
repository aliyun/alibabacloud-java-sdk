// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBTableListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaDBTableListResponseData data;

    public static GetMetaDBTableListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBTableListResponse self = new GetMetaDBTableListResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaDBTableListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaDBTableListResponse setData(GetMetaDBTableListResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaDBTableListResponseData getData() {
        return this.data;
    }

    public static class GetMetaDBTableListResponseDataTableEntityList extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        @NameInMap("DatabaseName")
        @Validation(required = true)
        public String databaseName;

        public static GetMetaDBTableListResponseDataTableEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBTableListResponseDataTableEntityList self = new GetMetaDBTableListResponseDataTableEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaDBTableListResponseDataTableEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMetaDBTableListResponseDataTableEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaDBTableListResponseDataTableEntityList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

    }

    public static class GetMetaDBTableListResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("TableEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaDBTableListResponseDataTableEntityList> tableEntityList;

        public static GetMetaDBTableListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBTableListResponseData self = new GetMetaDBTableListResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaDBTableListResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaDBTableListResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaDBTableListResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaDBTableListResponseData setTableEntityList(java.util.List<GetMetaDBTableListResponseDataTableEntityList> tableEntityList) {
            this.tableEntityList = tableEntityList;
            return this;
        }
        public java.util.List<GetMetaDBTableListResponseDataTableEntityList> getTableEntityList() {
            return this.tableEntityList;
        }

    }

}

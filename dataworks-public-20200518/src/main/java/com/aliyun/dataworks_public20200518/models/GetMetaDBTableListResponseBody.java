// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBTableListResponseBody extends TeaModel {
    /**
     * <p>The metatable information in a compute engine instance.</p>
     */
    @NameInMap("Data")
    public GetMetaDBTableListResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMetaDBTableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBTableListResponseBody self = new GetMetaDBTableListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaDBTableListResponseBody setData(GetMetaDBTableListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaDBTableListResponseBodyData getData() {
        return this.data;
    }

    public GetMetaDBTableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMetaDBTableListResponseBodyDataTableEntityList extends TeaModel {
        /**
         * <p>The name of the metadatabase.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The GUID of the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.tname</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The name of the metatable.</p>
         * 
         * <strong>example:</strong>
         * <p>tname</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetMetaDBTableListResponseBodyDataTableEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaDBTableListResponseBodyDataTableEntityList self = new GetMetaDBTableListResponseBodyDataTableEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaDBTableListResponseBodyDataTableEntityList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaDBTableListResponseBodyDataTableEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaDBTableListResponseBodyDataTableEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetMetaDBTableListResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of metatables in the compute engine instance.</p>
         */
        @NameInMap("TableEntityList")
        public java.util.List<GetMetaDBTableListResponseBodyDataTableEntityList> tableEntityList;

        /**
         * <p>The total number of compute engine instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

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

        public GetMetaDBTableListResponseBodyData setTableEntityList(java.util.List<GetMetaDBTableListResponseBodyDataTableEntityList> tableEntityList) {
            this.tableEntityList = tableEntityList;
            return this;
        }
        public java.util.List<GetMetaDBTableListResponseBodyDataTableEntityList> getTableEntityList() {
            return this.tableEntityList;
        }

        public GetMetaDBTableListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

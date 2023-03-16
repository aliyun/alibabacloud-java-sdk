// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaColumnLineageResponseBody extends TeaModel {
    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("Data")
    public GetMetaColumnLineageResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaColumnLineageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaColumnLineageResponseBody self = new GetMetaColumnLineageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaColumnLineageResponseBody setData(GetMetaColumnLineageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaColumnLineageResponseBodyData getData() {
        return this.data;
    }

    public GetMetaColumnLineageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaColumnLineageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaColumnLineageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaColumnLineageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaColumnLineageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaColumnLineageResponseBodyDataDataEntityList extends TeaModel {
        /**
         * <p>The ID of the EMR cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The GUID of the field.</p>
         */
        @NameInMap("ColumnGuid")
        public String columnGuid;

        /**
         * <p>The name of the field.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The name of the metatable.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetMetaColumnLineageResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaColumnLineageResponseBodyDataDataEntityList self = new GetMetaColumnLineageResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaColumnLineageResponseBodyDataDataEntityList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetaColumnLineageResponseBodyDataDataEntityList setColumnGuid(String columnGuid) {
            this.columnGuid = columnGuid;
            return this;
        }
        public String getColumnGuid() {
            return this.columnGuid;
        }

        public GetMetaColumnLineageResponseBodyDataDataEntityList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaColumnLineageResponseBodyDataDataEntityList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaColumnLineageResponseBodyDataDataEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetMetaColumnLineageResponseBodyData extends TeaModel {
        /**
         * <p>The list of metatables in the compute engine instance.</p>
         */
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaColumnLineageResponseBodyDataDataEntityList> dataEntityList;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of fields.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaColumnLineageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaColumnLineageResponseBodyData self = new GetMetaColumnLineageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaColumnLineageResponseBodyData setDataEntityList(java.util.List<GetMetaColumnLineageResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaColumnLineageResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        public GetMetaColumnLineageResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetMetaColumnLineageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaColumnLineageResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchMetaTablesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("Data")
    public SearchMetaTablesResponseBodyData data;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchMetaTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMetaTablesResponseBody self = new SearchMetaTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMetaTablesResponseBody setData(SearchMetaTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchMetaTablesResponseBodyData getData() {
        return this.data;
    }

    public SearchMetaTablesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchMetaTablesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchMetaTablesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchMetaTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMetaTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchMetaTablesResponseBodyDataDataEntityList extends TeaModel {
        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the workspace.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("EntityType")
        public Integer entityType;

        /**
         * <p>The schema information of the table. This parameter is returned only if you enable the table schema in MaxCompute.</p>
         */
        @NameInMap("EnvType")
        public Integer envType;

        /**
         * <p>The type of the environment. Valid values:</p>
         * <br>
         * <p>*   1: production environment</p>
         * <p>*   0: development environment</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The ID of the Alibaba Cloud account used by the workspace owner.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The GUID of the metatable.</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The ID of the EMR cluster.</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The type of the metatable. Valid values:</p>
         * <br>
         * <p>*   0: table</p>
         * <p>*   1: view</p>
         */
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TenantId")
        public Long tenantId;

        public static SearchMetaTablesResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            SearchMetaTablesResponseBodyDataDataEntityList self = new SearchMetaTablesResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class SearchMetaTablesResponseBodyData extends TeaModel {
        /**
         * <p>The name of the metadatabase.</p>
         */
        @NameInMap("DataEntityList")
        public java.util.List<SearchMetaTablesResponseBodyDataDataEntityList> dataEntityList;

        /**
         * <p>The total number of metatables.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The list of metatables.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The name of the metatable.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchMetaTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchMetaTablesResponseBodyData self = new SearchMetaTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchMetaTablesResponseBodyData setDataEntityList(java.util.List<SearchMetaTablesResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<SearchMetaTablesResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        public SearchMetaTablesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchMetaTablesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchMetaTablesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

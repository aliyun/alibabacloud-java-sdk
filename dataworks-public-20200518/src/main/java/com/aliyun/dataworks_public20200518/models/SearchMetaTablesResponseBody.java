// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchMetaTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public SearchMetaTablesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static SearchMetaTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMetaTablesResponseBody self = new SearchMetaTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMetaTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMetaTablesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public SearchMetaTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchMetaTablesResponseBodyDataDataEntityList extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("EntityType")
        public Integer entityType;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("EnvType")
        public Integer envType;

        @NameInMap("TenantId")
        public Long tenantId;

        public static SearchMetaTablesResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            SearchMetaTablesResponseBodyDataDataEntityList self = new SearchMetaTablesResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
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

        public SearchMetaTablesResponseBodyDataDataEntityList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public SearchMetaTablesResponseBodyDataDataEntityList setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
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
        @NameInMap("DataEntityList")
        public java.util.List<SearchMetaTablesResponseBodyDataDataEntityList> dataEntityList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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

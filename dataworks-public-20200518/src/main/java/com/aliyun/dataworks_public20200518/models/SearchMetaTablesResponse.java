// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchMetaTablesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public SearchMetaTablesResponseData data;

    public static SearchMetaTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchMetaTablesResponse self = new SearchMetaTablesResponse();
        return TeaModel.build(map, self);
    }

    public SearchMetaTablesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMetaTablesResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchMetaTablesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchMetaTablesResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchMetaTablesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchMetaTablesResponse setData(SearchMetaTablesResponseData data) {
        this.data = data;
        return this;
    }
    public SearchMetaTablesResponseData getData() {
        return this.data;
    }

    public static class SearchMetaTablesResponseDataDataEntityList extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("EnvType")
        @Validation(required = true)
        public Integer envType;

        @NameInMap("EntityType")
        @Validation(required = true)
        public Integer entityType;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        @NameInMap("DatabaseName")
        @Validation(required = true)
        public String databaseName;

        public static SearchMetaTablesResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            SearchMetaTablesResponseDataDataEntityList self = new SearchMetaTablesResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public SearchMetaTablesResponseDataDataEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public SearchMetaTablesResponseDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public SearchMetaTablesResponseDataDataEntityList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public SearchMetaTablesResponseDataDataEntityList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public SearchMetaTablesResponseDataDataEntityList setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public SearchMetaTablesResponseDataDataEntityList setEntityType(Integer entityType) {
            this.entityType = entityType;
            return this;
        }
        public Integer getEntityType() {
            return this.entityType;
        }

        public SearchMetaTablesResponseDataDataEntityList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public SearchMetaTablesResponseDataDataEntityList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public SearchMetaTablesResponseDataDataEntityList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public SearchMetaTablesResponseDataDataEntityList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

    }

    public static class SearchMetaTablesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<SearchMetaTablesResponseDataDataEntityList> dataEntityList;

        public static SearchMetaTablesResponseData build(java.util.Map<String, ?> map) throws Exception {
            SearchMetaTablesResponseData self = new SearchMetaTablesResponseData();
            return TeaModel.build(map, self);
        }

        public SearchMetaTablesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchMetaTablesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchMetaTablesResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public SearchMetaTablesResponseData setDataEntityList(java.util.List<SearchMetaTablesResponseDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<SearchMetaTablesResponseDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

    }

}

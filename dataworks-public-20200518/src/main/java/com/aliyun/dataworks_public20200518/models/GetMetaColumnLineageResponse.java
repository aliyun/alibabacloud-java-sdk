// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaColumnLineageResponse extends TeaModel {
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
    public GetMetaColumnLineageResponseData data;

    public static GetMetaColumnLineageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaColumnLineageResponse self = new GetMetaColumnLineageResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaColumnLineageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaColumnLineageResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaColumnLineageResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaColumnLineageResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaColumnLineageResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaColumnLineageResponse setData(GetMetaColumnLineageResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaColumnLineageResponseData getData() {
        return this.data;
    }

    public static class GetMetaColumnLineageResponseDataDataEntityList extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        public String columnName;

        @NameInMap("ColumnGuid")
        @Validation(required = true)
        public String columnGuid;

        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        @NameInMap("DatabaseName")
        @Validation(required = true)
        public String databaseName;

        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        public static GetMetaColumnLineageResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaColumnLineageResponseDataDataEntityList self = new GetMetaColumnLineageResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaColumnLineageResponseDataDataEntityList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaColumnLineageResponseDataDataEntityList setColumnGuid(String columnGuid) {
            this.columnGuid = columnGuid;
            return this;
        }
        public String getColumnGuid() {
            return this.columnGuid;
        }

        public GetMetaColumnLineageResponseDataDataEntityList setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetMetaColumnLineageResponseDataDataEntityList setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public GetMetaColumnLineageResponseDataDataEntityList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetMetaColumnLineageResponseData extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaColumnLineageResponseDataDataEntityList> dataEntityList;

        public static GetMetaColumnLineageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaColumnLineageResponseData self = new GetMetaColumnLineageResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaColumnLineageResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaColumnLineageResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetMetaColumnLineageResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaColumnLineageResponseData setDataEntityList(java.util.List<GetMetaColumnLineageResponseDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaColumnLineageResponseDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

    }

}

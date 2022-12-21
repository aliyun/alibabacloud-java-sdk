// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsDetailResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The details of the sensitive field.
    @NameInMap("SensitiveColumnsDetailList")
    public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList sensitiveColumnsDetailList;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static ListSensitiveColumnsDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnsDetailResponseBody self = new ListSensitiveColumnsDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnsDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSensitiveColumnsDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSensitiveColumnsDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSensitiveColumnsDetailResponseBody setSensitiveColumnsDetailList(ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList sensitiveColumnsDetailList) {
        this.sensitiveColumnsDetailList = sensitiveColumnsDetailList;
        return this;
    }
    public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList getSensitiveColumnsDetailList() {
        return this.sensitiveColumnsDetailList;
    }

    public ListSensitiveColumnsDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail extends TeaModel {
        // The description of the field.
        @NameInMap("ColumnDescription")
        public String columnDescription;

        // The name of the field.
        @NameInMap("ColumnName")
        public String columnName;

        // The data type of the field.
        @NameInMap("ColumnType")
        public String columnType;

        // The ID of the database.
        @NameInMap("DbId")
        public Long dbId;

        // The type of the database.
        @NameInMap("DbType")
        public String dbType;

        // The type of the environment to which the database belongs.
        @NameInMap("EnvType")
        public String envType;

        // Indicates whether the database is a logical database. Valid values:
        // 
        // *   **true**: The database is a logical database.
        // *   **false**: The database is not a logical database.
        @NameInMap("Logic")
        public Boolean logic;

        // The name of the database.
        @NameInMap("SchemaName")
        public String schemaName;

        // The name that is used to search for the database.
        @NameInMap("SearchName")
        public String searchName;

        // The name of the table.
        @NameInMap("TableName")
        public String tableName;

        public static ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail self = new ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setColumnDescription(String columnDescription) {
            this.columnDescription = columnDescription;
            return this;
        }
        public String getColumnDescription() {
            return this.columnDescription;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList extends TeaModel {
        @NameInMap("SensitiveColumnsDetail")
        public java.util.List<ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail> sensitiveColumnsDetail;

        public static ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList self = new ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList setSensitiveColumnsDetail(java.util.List<ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail> sensitiveColumnsDetail) {
            this.sensitiveColumnsDetail = sensitiveColumnsDetail;
            return this;
        }
        public java.util.List<ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailListSensitiveColumnsDetail> getSensitiveColumnsDetail() {
            return this.sensitiveColumnsDetail;
        }

    }

}

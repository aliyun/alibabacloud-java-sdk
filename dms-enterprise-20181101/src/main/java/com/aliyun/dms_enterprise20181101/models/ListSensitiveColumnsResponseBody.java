// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SensitiveColumnList")
    public ListSensitiveColumnsResponseBodySensitiveColumnList sensitiveColumnList;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSensitiveColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveColumnsResponseBody self = new ListSensitiveColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSensitiveColumnsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSensitiveColumnsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSensitiveColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSensitiveColumnsResponseBody setSensitiveColumnList(ListSensitiveColumnsResponseBodySensitiveColumnList sensitiveColumnList) {
        this.sensitiveColumnList = sensitiveColumnList;
        return this;
    }
    public ListSensitiveColumnsResponseBodySensitiveColumnList getSensitiveColumnList() {
        return this.sensitiveColumnList;
    }

    public ListSensitiveColumnsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSensitiveColumnsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn extends TeaModel {
        @NameInMap("ColumnCount")
        public Long columnCount;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("FunctionType")
        public String functionType;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SecurityLevel")
        public String securityLevel;

        @NameInMap("TableName")
        public String tableName;

        public static ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn self = new ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn setColumnCount(Long columnCount) {
            this.columnCount = columnCount;
            return this;
        }
        public Long getColumnCount() {
            return this.columnCount;
        }

        public ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class ListSensitiveColumnsResponseBodySensitiveColumnList extends TeaModel {
        @NameInMap("SensitiveColumn")
        public java.util.List<ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn> sensitiveColumn;

        public static ListSensitiveColumnsResponseBodySensitiveColumnList build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveColumnsResponseBodySensitiveColumnList self = new ListSensitiveColumnsResponseBodySensitiveColumnList();
            return TeaModel.build(map, self);
        }

        public ListSensitiveColumnsResponseBodySensitiveColumnList setSensitiveColumn(java.util.List<ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn> sensitiveColumn) {
            this.sensitiveColumn = sensitiveColumn;
            return this;
        }
        public java.util.List<ListSensitiveColumnsResponseBodySensitiveColumnListSensitiveColumn> getSensitiveColumn() {
            return this.sensitiveColumn;
        }

    }

}

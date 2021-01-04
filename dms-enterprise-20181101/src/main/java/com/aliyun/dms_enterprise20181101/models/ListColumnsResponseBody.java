// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListColumnsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ColumnList")
    public ListColumnsResponseBodyColumnList columnList;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListColumnsResponseBody self = new ListColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListColumnsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListColumnsResponseBody setColumnList(ListColumnsResponseBodyColumnList columnList) {
        this.columnList = columnList;
        return this;
    }
    public ListColumnsResponseBodyColumnList getColumnList() {
        return this.columnList;
    }

    public ListColumnsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListColumnsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListColumnsResponseBodyColumnListColumn extends TeaModel {
        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        @NameInMap("ColumnId")
        public String columnId;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Sensitive")
        public Boolean sensitive;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("SecurityLevel")
        public String securityLevel;

        @NameInMap("Description")
        public String description;

        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        @NameInMap("DataScale")
        public Integer dataScale;

        @NameInMap("FunctionType")
        public String functionType;

        @NameInMap("Nullable")
        public Boolean nullable;

        @NameInMap("DataLength")
        public Long dataLength;

        public static ListColumnsResponseBodyColumnListColumn build(java.util.Map<String, ?> map) throws Exception {
            ListColumnsResponseBodyColumnListColumn self = new ListColumnsResponseBodyColumnListColumn();
            return TeaModel.build(map, self);
        }

        public ListColumnsResponseBodyColumnListColumn setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListColumnsResponseBodyColumnListColumn setAutoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }
        public Boolean getAutoIncrement() {
            return this.autoIncrement;
        }

        public ListColumnsResponseBodyColumnListColumn setColumnId(String columnId) {
            this.columnId = columnId;
            return this;
        }
        public String getColumnId() {
            return this.columnId;
        }

        public ListColumnsResponseBodyColumnListColumn setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListColumnsResponseBodyColumnListColumn setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public ListColumnsResponseBodyColumnListColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListColumnsResponseBodyColumnListColumn setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public ListColumnsResponseBodyColumnListColumn setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListColumnsResponseBodyColumnListColumn setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public ListColumnsResponseBodyColumnListColumn setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public ListColumnsResponseBodyColumnListColumn setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public ListColumnsResponseBodyColumnListColumn setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ListColumnsResponseBodyColumnListColumn setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

    }

    public static class ListColumnsResponseBodyColumnList extends TeaModel {
        @NameInMap("Column")
        public java.util.List<ListColumnsResponseBodyColumnListColumn> column;

        public static ListColumnsResponseBodyColumnList build(java.util.Map<String, ?> map) throws Exception {
            ListColumnsResponseBodyColumnList self = new ListColumnsResponseBodyColumnList();
            return TeaModel.build(map, self);
        }

        public ListColumnsResponseBodyColumnList setColumn(java.util.List<ListColumnsResponseBodyColumnListColumn> column) {
            this.column = column;
            return this;
        }
        public java.util.List<ListColumnsResponseBodyColumnListColumn> getColumn() {
            return this.column;
        }

    }

}

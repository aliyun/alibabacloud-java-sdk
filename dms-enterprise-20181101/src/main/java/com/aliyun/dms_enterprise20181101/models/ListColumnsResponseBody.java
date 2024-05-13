// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListColumnsResponseBody extends TeaModel {
    /**
     * <p>The details about columns.</p>
     */
    @NameInMap("ColumnList")
    public ListColumnsResponseBodyColumnList columnList;

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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListColumnsResponseBody self = new ListColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListColumnsResponseBody setColumnList(ListColumnsResponseBodyColumnList columnList) {
        this.columnList = columnList;
        return this;
    }
    public ListColumnsResponseBodyColumnList getColumnList() {
        return this.columnList;
    }

    public ListColumnsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListColumnsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListColumnsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListColumnsResponseBodyColumnListColumn extends TeaModel {
        /**
         * <p>Indicates whether the column is an auto-increment column. Valid values:</p>
         * <br>
         * <p>*   true: The column is an auto-increment column.</p>
         * <p>*   false: The column is not an auto-increment column.</p>
         */
        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        /**
         * <p>The ID of the column.</p>
         */
        @NameInMap("ColumnId")
        public String columnId;

        /**
         * <p>The name of the column.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the column.</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The length of the field.</p>
         */
        @NameInMap("DataLength")
        public Long dataLength;

        /**
         * <p>The number of valid digits for the field.</p>
         */
        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        /**
         * <p>The number of decimal places for the field.</p>
         */
        @NameInMap("DataScale")
        public Integer dataScale;

        /**
         * <p>The default value of the column.</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description of the column.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the masking algorithm that is used for the field. Valid values:</p>
         * <br>
         * <p>*   null: No masking algorithm is used.</p>
         * <p>*   DEFAULT: A full masking algorithm is used.</p>
         * <p>*   FIX_POS: The fixed position is masked.</p>
         * <p>*   FIX_CHAR: The fixed characters are replaced.</p>
         */
        @NameInMap("FunctionType")
        public String functionType;

        /**
         * <p>Indicates whether the column can be empty. Valid values:</p>
         * <br>
         * <p>*   **true**: The column can be empty.</p>
         * <p>*   **false**: The column cannot be empty.</p>
         */
        @NameInMap("Nullable")
        public Boolean nullable;

        /**
         * <p>The security level of the column. Valid values:</p>
         * <br>
         * <p>*   INNER: The column is an internal column but not sensitive.</p>
         * <p>*   SENSITIVE: The column is a sensitive column.</p>
         * <p>*   CONFIDENTIAL: The column is a confidential column.</p>
         * <br>
         * <p>> For more information, see [Sensitivity levels of fields](https://help.aliyun.com/document_detail/66091.html).</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>Indicates whether the column is a sensitive column. Valid values:</p>
         * <br>
         * <p>*   **true**: The column is a sensitive column.</p>
         * <p>*   **false**: The column is not a sensitive column.</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        public static ListColumnsResponseBodyColumnListColumn build(java.util.Map<String, ?> map) throws Exception {
            ListColumnsResponseBodyColumnListColumn self = new ListColumnsResponseBodyColumnListColumn();
            return TeaModel.build(map, self);
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

        public ListColumnsResponseBodyColumnListColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListColumnsResponseBodyColumnListColumn setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListColumnsResponseBodyColumnListColumn setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
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

        public ListColumnsResponseBodyColumnListColumn setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListColumnsResponseBodyColumnListColumn setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public ListColumnsResponseBodyColumnListColumn setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public ListColumnsResponseBodyColumnListColumn setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
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

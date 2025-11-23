// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTableColumnsResponseBody extends TeaModel {
    /**
     * <p>The details about fields in the table.</p>
     */
    @NameInMap("ColumnList")
    public ListTableColumnsResponseBodyColumnList columnList;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTableColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTableColumnsResponseBody self = new ListTableColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTableColumnsResponseBody setColumnList(ListTableColumnsResponseBodyColumnList columnList) {
        this.columnList = columnList;
        return this;
    }
    public ListTableColumnsResponseBodyColumnList getColumnList() {
        return this.columnList;
    }

    public ListTableColumnsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTableColumnsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTableColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTableColumnsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTableColumnsResponseBodyColumnListColumn extends TeaModel {
        /**
         * <p>Indicates whether the field is an auto-increment field. Valid values:</p>
         * <ul>
         * <li>true: The field is an auto-increment field.</li>
         * <li>false: The field is not an auto-increment field.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        /**
         * <p>The ID of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ColumnId")
        public String columnId;

        /**
         * <p>The field name.</p>
         * 
         * <strong>example:</strong>
         * <p>c1</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The length of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("DataLength")
        public Long dataLength;

        /**
         * <p>The number of valid digits for the column.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        /**
         * <p>The number of decimal places of the field data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataScale")
        public Integer dataScale;

        /**
         * <p>The default value of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>The description of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>column desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the masking algorithm that is used for the field. Valid values:</p>
         * <ul>
         * <li>null: No masking algorithm is used.</li>
         * <li>DEFAULT: A full masking algorithm is used.</li>
         * <li>FIX_POS: The fixed position is masked.</li>
         * <li>FIX_CHAR: The fixed characters are replaced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        @NameInMap("FunctionType")
        public String functionType;

        /**
         * <p>Indicates whether the field can be empty. Valid values:</p>
         * <ul>
         * <li>true: The field can be empty.</li>
         * <li>false: The field cannot be empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Nullable")
        public Boolean nullable;

        /**
         * <p>The security level of the field. Valid values:</p>
         * <ul>
         * <li>INNER: The field is an internal field but not sensitive.</li>
         * <li>SENSITIVE: The field is sensitive.</li>
         * <li>CONFIDENTIAL: The field is a confidential column.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INNER</p>
         */
        @NameInMap("SecurityLevel")
        public String securityLevel;

        /**
         * <p>Indicates whether the field is a sensitive column. Valid values:</p>
         * <ul>
         * <li>true: The field is a sensitive field.</li>
         * <li>false: The field is not a sensitive field.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Sensitive")
        public Boolean sensitive;

        public static ListTableColumnsResponseBodyColumnListColumn build(java.util.Map<String, ?> map) throws Exception {
            ListTableColumnsResponseBodyColumnListColumn self = new ListTableColumnsResponseBodyColumnListColumn();
            return TeaModel.build(map, self);
        }

        public ListTableColumnsResponseBodyColumnListColumn setAutoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }
        public Boolean getAutoIncrement() {
            return this.autoIncrement;
        }

        public ListTableColumnsResponseBodyColumnListColumn setColumnId(String columnId) {
            this.columnId = columnId;
            return this;
        }
        public String getColumnId() {
            return this.columnId;
        }

        public ListTableColumnsResponseBodyColumnListColumn setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListTableColumnsResponseBodyColumnListColumn setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public ListTableColumnsResponseBodyColumnListColumn setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public ListTableColumnsResponseBodyColumnListColumn setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public ListTableColumnsResponseBodyColumnListColumn setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public ListTableColumnsResponseBodyColumnListColumn setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListTableColumnsResponseBodyColumnListColumn setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTableColumnsResponseBodyColumnListColumn setFunctionType(String functionType) {
            this.functionType = functionType;
            return this;
        }
        public String getFunctionType() {
            return this.functionType;
        }

        public ListTableColumnsResponseBodyColumnListColumn setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public ListTableColumnsResponseBodyColumnListColumn setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public ListTableColumnsResponseBodyColumnListColumn setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

    }

    public static class ListTableColumnsResponseBodyColumnList extends TeaModel {
        @NameInMap("Column")
        public java.util.List<ListTableColumnsResponseBodyColumnListColumn> column;

        public static ListTableColumnsResponseBodyColumnList build(java.util.Map<String, ?> map) throws Exception {
            ListTableColumnsResponseBodyColumnList self = new ListTableColumnsResponseBodyColumnList();
            return TeaModel.build(map, self);
        }

        public ListTableColumnsResponseBodyColumnList setColumn(java.util.List<ListTableColumnsResponseBodyColumnListColumn> column) {
            this.column = column;
            return this;
        }
        public java.util.List<ListTableColumnsResponseBodyColumnListColumn> getColumn() {
            return this.column;
        }

    }

}

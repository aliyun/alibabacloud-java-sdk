// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnResponseBody extends TeaModel {
    // The details about fields in the table.
    @NameInMap("ColumnList")
    public java.util.List<GetMetaTableColumnResponseBodyColumnList> columnList;

    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableColumnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnResponseBody self = new GetMetaTableColumnResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnResponseBody setColumnList(java.util.List<GetMetaTableColumnResponseBodyColumnList> columnList) {
        this.columnList = columnList;
        return this;
    }
    public java.util.List<GetMetaTableColumnResponseBodyColumnList> getColumnList() {
        return this.columnList;
    }

    public GetMetaTableColumnResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableColumnResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableColumnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableColumnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableColumnResponseBodyColumnList extends TeaModel {
        // Indicates whether the field is an auto-increment field. Valid values:
        // 
        // *   **true**: The field is an auto-increment field.
        // *   **false**: The field is not an auto-increment field.
        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        // The ID of the field.
        @NameInMap("ColumnId")
        public String columnId;

        // The name of the field.
        @NameInMap("ColumnName")
        public String columnName;

        // The data type of the field.
        // 
        // >  The returned data type is not unique. For example, the returned data type can be **bigint** or **int**.
        @NameInMap("ColumnType")
        public String columnType;

        // The length of the field.
        @NameInMap("DataLength")
        public Long dataLength;

        // The precision of the field.
        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        // The number of decimal places that the field shows.
        @NameInMap("DataScale")
        public Integer dataScale;

        // The description of the field.
        @NameInMap("Description")
        public String description;

        // Indicates whether the field can be empty. Valid values:
        // 
        // *   **true**: The field can be empty.
        // *   **false**: The field cannot be empty.
        @NameInMap("Nullable")
        public Boolean nullable;

        // The position of the field in the table.
        @NameInMap("Position")
        public Integer position;

        // Indicates whether the field is the primary key. Valid values:
        // 
        // *   **true**: The field is the primary key.
        // *   **false**: The field is not the primary key.
        @NameInMap("PrimaryKey")
        public String primaryKey;

        // The sensitivity level of the field. Valid values:
        // 
        // *   **INNER**: The field is not sensitive.
        // *   **SENSITIVE**: The field is sensitive.
        // *   **CONFIDENTIAL**: The field is confidential.
        // 
        // >  For more information, see [Sensitivity levels of fields](~~66091~~).
        @NameInMap("SecurityLevel")
        public String securityLevel;

        public static GetMetaTableColumnResponseBodyColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableColumnResponseBodyColumnList self = new GetMetaTableColumnResponseBodyColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableColumnResponseBodyColumnList setAutoIncrement(Boolean autoIncrement) {
            this.autoIncrement = autoIncrement;
            return this;
        }
        public Boolean getAutoIncrement() {
            return this.autoIncrement;
        }

        public GetMetaTableColumnResponseBodyColumnList setColumnId(String columnId) {
            this.columnId = columnId;
            return this;
        }
        public String getColumnId() {
            return this.columnId;
        }

        public GetMetaTableColumnResponseBodyColumnList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetMetaTableColumnResponseBodyColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetMetaTableColumnResponseBodyColumnList setDataLength(Long dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Long getDataLength() {
            return this.dataLength;
        }

        public GetMetaTableColumnResponseBodyColumnList setDataPrecision(Integer dataPrecision) {
            this.dataPrecision = dataPrecision;
            return this;
        }
        public Integer getDataPrecision() {
            return this.dataPrecision;
        }

        public GetMetaTableColumnResponseBodyColumnList setDataScale(Integer dataScale) {
            this.dataScale = dataScale;
            return this;
        }
        public Integer getDataScale() {
            return this.dataScale;
        }

        public GetMetaTableColumnResponseBodyColumnList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMetaTableColumnResponseBodyColumnList setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetMetaTableColumnResponseBodyColumnList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public GetMetaTableColumnResponseBodyColumnList setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetMetaTableColumnResponseBodyColumnList setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableColumnResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ColumnList")
    public java.util.List<GetMetaTableColumnResponseBodyColumnList> columnList;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableColumnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableColumnResponseBody self = new GetMetaTableColumnResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableColumnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableColumnResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableColumnResponseBody setColumnList(java.util.List<GetMetaTableColumnResponseBodyColumnList> columnList) {
        this.columnList = columnList;
        return this;
    }
    public java.util.List<GetMetaTableColumnResponseBodyColumnList> getColumnList() {
        return this.columnList;
    }

    public GetMetaTableColumnResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableColumnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableColumnResponseBodyColumnList extends TeaModel {
        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("AutoIncrement")
        public Boolean autoIncrement;

        @NameInMap("ColumnId")
        public String columnId;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("SecurityLevel")
        public String securityLevel;

        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("Description")
        public String description;

        @NameInMap("DataPrecision")
        public Integer dataPrecision;

        @NameInMap("DataScale")
        public Integer dataScale;

        @NameInMap("Position")
        public Integer position;

        @NameInMap("Nullable")
        public Boolean nullable;

        @NameInMap("DataLength")
        public Integer dataLength;

        public static GetMetaTableColumnResponseBodyColumnList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableColumnResponseBodyColumnList self = new GetMetaTableColumnResponseBodyColumnList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableColumnResponseBodyColumnList setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
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

        public GetMetaTableColumnResponseBodyColumnList setSecurityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public GetMetaTableColumnResponseBodyColumnList setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetMetaTableColumnResponseBodyColumnList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public GetMetaTableColumnResponseBodyColumnList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public GetMetaTableColumnResponseBodyColumnList setNullable(Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        public Boolean getNullable() {
            return this.nullable;
        }

        public GetMetaTableColumnResponseBodyColumnList setDataLength(Integer dataLength) {
            this.dataLength = dataLength;
            return this;
        }
        public Integer getDataLength() {
            return this.dataLength;
        }

    }

}

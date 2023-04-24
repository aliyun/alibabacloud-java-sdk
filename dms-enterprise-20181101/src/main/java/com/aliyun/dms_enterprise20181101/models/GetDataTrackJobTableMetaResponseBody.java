// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobTableMetaResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TableMetaList")
    public java.util.List<GetDataTrackJobTableMetaResponseBodyTableMetaList> tableMetaList;

    public static GetDataTrackJobTableMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackJobTableMetaResponseBody self = new GetDataTrackJobTableMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataTrackJobTableMetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataTrackJobTableMetaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataTrackJobTableMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataTrackJobTableMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataTrackJobTableMetaResponseBody setTableMetaList(java.util.List<GetDataTrackJobTableMetaResponseBodyTableMetaList> tableMetaList) {
        this.tableMetaList = tableMetaList;
        return this;
    }
    public java.util.List<GetDataTrackJobTableMetaResponseBodyTableMetaList> getTableMetaList() {
        return this.tableMetaList;
    }

    public static class GetDataTrackJobTableMetaResponseBodyTableMetaListColumns extends TeaModel {
        @NameInMap("Charset")
        public String charset;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("ColumnPosition")
        public Integer columnPosition;

        @NameInMap("ColumnType")
        public String columnType;

        @NameInMap("Fictive")
        public Boolean fictive;

        public static GetDataTrackJobTableMetaResponseBodyTableMetaListColumns build(java.util.Map<String, ?> map) throws Exception {
            GetDataTrackJobTableMetaResponseBodyTableMetaListColumns self = new GetDataTrackJobTableMetaResponseBodyTableMetaListColumns();
            return TeaModel.build(map, self);
        }

        public GetDataTrackJobTableMetaResponseBodyTableMetaListColumns setCharset(String charset) {
            this.charset = charset;
            return this;
        }
        public String getCharset() {
            return this.charset;
        }

        public GetDataTrackJobTableMetaResponseBodyTableMetaListColumns setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetDataTrackJobTableMetaResponseBodyTableMetaListColumns setColumnPosition(Integer columnPosition) {
            this.columnPosition = columnPosition;
            return this;
        }
        public Integer getColumnPosition() {
            return this.columnPosition;
        }

        public GetDataTrackJobTableMetaResponseBodyTableMetaListColumns setColumnType(String columnType) {
            this.columnType = columnType;
            return this;
        }
        public String getColumnType() {
            return this.columnType;
        }

        public GetDataTrackJobTableMetaResponseBodyTableMetaListColumns setFictive(Boolean fictive) {
            this.fictive = fictive;
            return this;
        }
        public Boolean getFictive() {
            return this.fictive;
        }

    }

    public static class GetDataTrackJobTableMetaResponseBodyTableMetaList extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<GetDataTrackJobTableMetaResponseBodyTableMetaListColumns> columns;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("TableName")
        public String tableName;

        public static GetDataTrackJobTableMetaResponseBodyTableMetaList build(java.util.Map<String, ?> map) throws Exception {
            GetDataTrackJobTableMetaResponseBodyTableMetaList self = new GetDataTrackJobTableMetaResponseBodyTableMetaList();
            return TeaModel.build(map, self);
        }

        public GetDataTrackJobTableMetaResponseBodyTableMetaList setColumns(java.util.List<GetDataTrackJobTableMetaResponseBodyTableMetaListColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<GetDataTrackJobTableMetaResponseBodyTableMetaListColumns> getColumns() {
            return this.columns;
        }

        public GetDataTrackJobTableMetaResponseBodyTableMetaList setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetDataTrackJobTableMetaResponseBodyTableMetaList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}

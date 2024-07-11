// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobTableMetaResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
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

    /**
     * <p>The metadata of tables.</p>
     */
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
        /**
         * <p>The name of the character set.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("Charset")
        public String charset;

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>claimantno</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The position of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ColumnPosition")
        public Integer columnPosition;

        /**
         * <p>The data type of the column. Examples: BIGINT, INT, and VARCHAR.</p>
         * 
         * <strong>example:</strong>
         * <p>BIGINT</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>Indicates whether the column is a virtual column. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>The information about columns.</p>
         */
        @NameInMap("Columns")
        public java.util.List<GetDataTrackJobTableMetaResponseBodyTableMetaListColumns> columns;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>DB165</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>live_stat</p>
         */
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

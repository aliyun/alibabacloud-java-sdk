// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsDetailResponseBody extends TeaModel {
    /**
     * <p>WB01053274</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The name of the field. You can call the [ListSensitiveColumns](~~188103~~) operation to obtain the name of the field.</p>
     * <br>
     * <p>>  You can also call the [ListColumns](~~141870~~) operation to obtain the name of the field.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data type of the field.</p>
     */
    @NameInMap("SensitiveColumnsDetailList")
    public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList sensitiveColumnsDetailList;

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
        /**
         * <p>$.parameters[6].schema.description</p>
         */
        @NameInMap("ColumnDescription")
        public String columnDescription;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>$.parameters[7].schema.description</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**: The database is a logical database.</p>
         * <p>*   **false**: The database is not a logical database.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>$.parameters[6].schema.enumValueTitles</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>ListSensitiveColumnsDetail</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>$.parameters[7].schema.example</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>$.parameters[7].schema.enumValueTitles</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>Queries the details of a sensitive field.</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>$.parameters[6].schema.example</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitiveColumnsDetailResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
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
     * <p>7629888F-C9FB-4D16-A7D3-B443FE06FBD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the sensitive field.</p>
     */
    @NameInMap("SensitiveColumnsDetailList")
    public ListSensitiveColumnsDetailResponseBodySensitiveColumnsDetailList sensitiveColumnsDetailList;

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
         * <p>The description of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ColumnDescription")
        public String columnDescription;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>ColumnName_test</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The data type of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>varchar(32)</p>
         */
        @NameInMap("ColumnType")
        public String columnType;

        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>1860****</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The type of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The database is a logical database.</li>
         * <li><strong>false</strong>: The database is not a logical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>SchemaName_test</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test@xxx:3306</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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

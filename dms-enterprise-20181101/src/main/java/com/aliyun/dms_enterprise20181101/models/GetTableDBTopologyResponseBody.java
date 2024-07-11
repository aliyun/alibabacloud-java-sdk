// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDBTopologyResponseBody extends TeaModel {
    /**
     * <p>The topology of the data table.</p>
     */
    @NameInMap("DBTopology")
    public GetTableDBTopologyResponseBodyDBTopology DBTopology;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
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
     * <p>853F7FD4-D922-4EFB-931C-D253EF159E06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTableDBTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableDBTopologyResponseBody self = new GetTableDBTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableDBTopologyResponseBody setDBTopology(GetTableDBTopologyResponseBodyDBTopology DBTopology) {
        this.DBTopology = DBTopology;
        return this;
    }
    public GetTableDBTopologyResponseBodyDBTopology getDBTopology() {
        return this.DBTopology;
    }

    public GetTableDBTopologyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTableDBTopologyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTableDBTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableDBTopologyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList extends TeaModel {
        /**
         * <p>The ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <p>The name of the physical table.</p>
         * 
         * <strong>example:</strong>
         * <p>151977812</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The type of the table. This is a reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>yuyang_test_0000</p>
         */
        @NameInMap("TableType")
        public String tableType;

        public static GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList build(java.util.Map<String, ?> map) throws Exception {
            GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList self = new GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList();
            return TeaModel.build(map, self);
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }
        public String getTableType() {
            return this.tableType;
        }

    }

    public static class GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList extends TeaModel {
        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>489347</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db-test</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <ul>
         * <li><strong>product</strong>: production environment</li>
         * <li><strong>dev</strong>: development environment</li>
         * <li><strong>pre</strong>: pre-release environment</li>
         * <li><strong>test</strong>: test environment</li>
         * <li><strong>sit</strong>: system integration testing (SIT) environment</li>
         * <li><strong>uat</strong>: user acceptance testing (UAT) environment</li>
         * <li><strong>pet</strong>: stress testing environment</li>
         * <li><strong>stag</strong>: staging environment</li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pre</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The physical tables.</p>
         */
        @NameInMap("TableList")
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList> tableList;

        public static GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList self = new GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList();
            return TeaModel.build(map, self);
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList setTableList(java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList> tableList) {
            this.tableList = tableList;
            return this;
        }
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseListTableList> getTableList() {
            return this.tableList;
        }

    }

    public static class GetTableDBTopologyResponseBodyDBTopologyDataSourceList extends TeaModel {
        /**
         * <p>The physical databases.</p>
         */
        @NameInMap("DatabaseList")
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList> databaseList;

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The endpoint of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.mysql.polardb.rds.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port that is used to connect to the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The system ID (SID) of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("Sid")
        public String sid;

        public static GetTableDBTopologyResponseBodyDBTopologyDataSourceList build(java.util.Map<String, ?> map) throws Exception {
            GetTableDBTopologyResponseBodyDBTopologyDataSourceList self = new GetTableDBTopologyResponseBodyDBTopologyDataSourceList();
            return TeaModel.build(map, self);
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setDatabaseList(java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList> databaseList) {
            this.databaseList = databaseList;
            return this;
        }
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceListDatabaseList> getDatabaseList() {
            return this.databaseList;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetTableDBTopologyResponseBodyDBTopologyDataSourceList setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

    }

    public static class GetTableDBTopologyResponseBodyDBTopology extends TeaModel {
        /**
         * <p>The data sources.</p>
         */
        @NameInMap("DataSourceList")
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceList> dataSourceList;

        /**
         * <p>The GUID of the table in DMS.</p>
         * 
         * <strong>example:</strong>
         * <p>IDB_L_9032.db-test.yuyang_test</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The name of the table.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If a logical table is queried, the name of the logical table is returned.</p>
         * </li>
         * <li><p>If a physical table is queried, the name of the physical table is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yuyang_test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetTableDBTopologyResponseBodyDBTopology build(java.util.Map<String, ?> map) throws Exception {
            GetTableDBTopologyResponseBodyDBTopology self = new GetTableDBTopologyResponseBodyDBTopology();
            return TeaModel.build(map, self);
        }

        public GetTableDBTopologyResponseBodyDBTopology setDataSourceList(java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceList> dataSourceList) {
            this.dataSourceList = dataSourceList;
            return this;
        }
        public java.util.List<GetTableDBTopologyResponseBodyDBTopologyDataSourceList> getDataSourceList() {
            return this.dataSourceList;
        }

        public GetTableDBTopologyResponseBodyDBTopology setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetTableDBTopologyResponseBodyDBTopology setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}

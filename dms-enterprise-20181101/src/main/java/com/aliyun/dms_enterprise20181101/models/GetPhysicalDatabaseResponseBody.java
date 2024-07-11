// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPhysicalDatabaseResponseBody extends TeaModel {
    /**
     * <p>The information about the physical database.</p>
     */
    @NameInMap("Database")
    public GetPhysicalDatabaseResponseBodyDatabase database;

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
     * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
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

    public static GetPhysicalDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalDatabaseResponseBody self = new GetPhysicalDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalDatabaseResponseBody setDatabase(GetPhysicalDatabaseResponseBodyDatabase database) {
        this.database = database;
        return this;
    }
    public GetPhysicalDatabaseResponseBodyDatabase getDatabase() {
        return this.database;
    }

    public GetPhysicalDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPhysicalDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPhysicalDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList self = new GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList();
            return TeaModel.build(map, self);
        }

        public GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList self = new GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList();
            return TeaModel.build(map, self);
        }

        public GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class GetPhysicalDatabaseResponseBodyDatabase extends TeaModel {
        /**
         * <p>The name of the catalog to which the database belongs.</p>
         * <blockquote>
         * <p>: If the database is a PostgreSQL database, the name of the database is displayed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The ID of the physical database.</p>
         * 
         * <strong>example:</strong>
         * <p>43125312</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The user ID of the DBA in the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>43253</p>
         */
        @NameInMap("DbaId")
        public String dbaId;

        /**
         * <p>The nickname of the database administrator (DBA) in the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest</p>
         */
        @NameInMap("DbaName")
        public String dbaName;

        /**
         * <p>The encoding format of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>The type of the environment to which the database belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The endpoint that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-xxxab3r272.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The alias of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        /**
         * <p>The instance ID of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>43215325</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The user IDs of the database owners.</p>
         */
        @NameInMap("OwnerIdList")
        public GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList ownerIdList;

        /**
         * <p>The nicknames of the database owners.</p>
         */
        @NameInMap("OwnerNameList")
        public GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList ownerNameList;

        /**
         * <p>The port that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The name of the database.</p>
         * <blockquote>
         * <p>: If the database is a PostgreSQL database, the name of the mode is displayed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dmstest</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used for searching the database.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:dmstest@rm-xxxab3r272.mysql.rds.aliyuncs.com">dmstest@rm-xxxab3r272.mysql.rds.aliyuncs.com</a>:3306</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The system ID (SID) of the database.</p>
         * <blockquote>
         * <p>: The value of the parameter is returned only for Oracle databases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("Sid")
        public String sid;

        /**
         * <p>The state of the database. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The database is normal.</li>
         * <li><strong>DISABLE</strong>: The database is disabled.</li>
         * <li><strong>OFFLINE</strong>: The database is unpublished.</li>
         * <li><strong>NOT_EXIST</strong>: The database does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("State")
        public String state;

        public static GetPhysicalDatabaseResponseBodyDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalDatabaseResponseBodyDatabase self = new GetPhysicalDatabaseResponseBodyDatabase();
            return TeaModel.build(map, self);
        }

        public GetPhysicalDatabaseResponseBodyDatabase setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setDbaName(String dbaName) {
            this.dbaName = dbaName;
            return this;
        }
        public String getDbaName() {
            return this.dbaName;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setOwnerIdList(GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setOwnerNameList(GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}

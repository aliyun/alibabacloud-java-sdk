// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseResponseBody extends TeaModel {
    /**
     * <p>The details of the database.</p>
     */
    @NameInMap("Database")
    public GetDatabaseResponseBodyDatabase database;

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
     * <p>An unknown error occurred.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3CDB8601-AD74-4A47-8114-08E08CD6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseResponseBody self = new GetDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseResponseBody setDatabase(GetDatabaseResponseBodyDatabase database) {
        this.database = database;
        return this;
    }
    public GetDatabaseResponseBodyDatabase getDatabase() {
        return this.database;
    }

    public GetDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDatabaseResponseBodyDatabaseOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static GetDatabaseResponseBodyDatabaseOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseBodyDatabaseOwnerIdList self = new GetDatabaseResponseBodyDatabaseOwnerIdList();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseBodyDatabaseOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class GetDatabaseResponseBodyDatabaseOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static GetDatabaseResponseBodyDatabaseOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseBodyDatabaseOwnerNameList self = new GetDatabaseResponseBodyDatabaseOwnerNameList();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseBodyDatabaseOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class GetDatabaseResponseBodyDatabase extends TeaModel {
        /**
         * <p>The name of the catalog to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>984****</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The ID of the database administrator (DBA).</p>
         * 
         * <strong>example:</strong>
         * <p>27****</p>
         */
        @NameInMap("DbaId")
        public String dbaId;

        /**
         * <p>The nickname of the DBA.</p>
         * 
         * <strong>example:</strong>
         * <p>dba_name</p>
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
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <ul>
         * <li><strong>product</strong>: production environment</li>
         * <li><strong>dev</strong>: development environment</li>
         * <li><strong>pre</strong>: staging environment</li>
         * <li><strong>test</strong>: test environment</li>
         * <li><strong>sit</strong>: SIT environment</li>
         * <li><strong>uat</strong>: user acceptance testing (UAT) environment</li>
         * <li><strong>pet</strong>: stress testing environment</li>
         * <li><strong>stag</strong>: STAG environment</li>
         * </ul>
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
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The alias of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>149****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IDs of the owners of the database.</p>
         */
        @NameInMap("OwnerIdList")
        public GetDatabaseResponseBodyDatabaseOwnerIdList ownerIdList;

        /**
         * <p>The names of the owners of the database.</p>
         */
        @NameInMap("OwnerNameList")
        public GetDatabaseResponseBodyDatabaseOwnerNameList ownerNameList;

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
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The keyword that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:mysql@192.168.XX.XX">mysql@192.168.XX.XX</a>:3306</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The SID of the database.</p>
         * <blockquote>
         * <p> The value of the parameter is returned only for Oracle databases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_sid</p>
         */
        @NameInMap("Sid")
        public String sid;

        /**
         * <p>The status of the database. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The database is running as expected.</li>
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

        public static GetDatabaseResponseBodyDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseBodyDatabase self = new GetDatabaseResponseBodyDatabase();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseBodyDatabase setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetDatabaseResponseBodyDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public GetDatabaseResponseBodyDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDatabaseResponseBodyDatabase setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public GetDatabaseResponseBodyDatabase setDbaName(String dbaName) {
            this.dbaName = dbaName;
            return this;
        }
        public String getDbaName() {
            return this.dbaName;
        }

        public GetDatabaseResponseBodyDatabase setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetDatabaseResponseBodyDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDatabaseResponseBodyDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDatabaseResponseBodyDatabase setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetDatabaseResponseBodyDatabase setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDatabaseResponseBodyDatabase setOwnerIdList(GetDatabaseResponseBodyDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public GetDatabaseResponseBodyDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public GetDatabaseResponseBodyDatabase setOwnerNameList(GetDatabaseResponseBodyDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public GetDatabaseResponseBodyDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public GetDatabaseResponseBodyDatabase setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetDatabaseResponseBodyDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetDatabaseResponseBodyDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetDatabaseResponseBodyDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public GetDatabaseResponseBodyDatabase setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}

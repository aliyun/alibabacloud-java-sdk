// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTopologyResponseBody extends TeaModel {
    /**
     * <p>The topology of the data table.</p>
     */
    @NameInMap("DBTopology")
    public GetDBTopologyResponseBodyDBTopology DBTopology;

    /**
     * <p>The error code.</p>
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
     * <p>C5B8E84B-42B6-4374-AD5A-6264E1753378</p>
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

    public static GetDBTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDBTopologyResponseBody self = new GetDBTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDBTopologyResponseBody setDBTopology(GetDBTopologyResponseBodyDBTopology DBTopology) {
        this.DBTopology = DBTopology;
        return this;
    }
    public GetDBTopologyResponseBodyDBTopology getDBTopology() {
        return this.DBTopology;
    }

    public GetDBTopologyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDBTopologyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDBTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDBTopologyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList extends TeaModel {
        /**
         * <p>The name of the catalog to which the database belongs.</p>
         * <blockquote>
         * <p>If the database is a PostgreSQL database, the value of this parameter is the name of the database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>def</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The ID of the database for which the schema design is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>423532</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <ul>
         * <li>product: production environment</li>
         * <li>dev: development environment</li>
         * <li>pre: staging environment</li>
         * <li>test: test environment</li>
         * <li>sit: SIT environment</li>
         * <li>uat: user acceptance testing (UAT) environment</li>
         * <li>pet: stress testing environment</li>
         * <li>stag: STAG environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The ID of the instance. The valid value is returned if you call the ListInstances operation. The instance ID is not the ID of the RDS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4325325</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>Instance resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-xxx</p>
         */
        @NameInMap("InstanceResourceId")
        public String instanceResourceId;

        /**
         * <p>The source of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>PUBLIC_OWN:</strong> a self-managed database instance that is deployed on the Internet</li>
         * <li><strong>RDS:</strong> an ApsaraDB RDS instance</li>
         * <li><strong>ECS_OWN:</strong> a self-managed database that is deployed on an Elastic Compute Service (ECS) instance</li>
         * <li><strong>VPC_IDC:</strong> a self-managed database instance that is deployed in a data center connected over a virtual private cloud (VPC)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceSource")
        public String instanceSource;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the logical database.</p>
         * <blockquote>
         * <p>If the database is a PostgreSQL database, the value of this parameter is the name of the database schema.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>db_test@rm-xxx:3306</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name of the saved search.</p>
         * 
         * <strong>example:</strong>
         * <p>db_test</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        public static GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList self = new GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList();
            return TeaModel.build(map, self);
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setInstanceResourceId(String instanceResourceId) {
            this.instanceResourceId = instanceResourceId;
            return this;
        }
        public String getInstanceResourceId() {
            return this.instanceResourceId;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class GetDBTopologyResponseBodyDBTopology extends TeaModel {
        /**
         * <p>The alias of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>logic_db_test</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The list of database splitting topology information.</p>
         */
        @NameInMap("DBTopologyInfoList")
        public java.util.List<GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList> DBTopologyInfoList;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment in which the database instance is deployed. Valid values:</p>
         * <ul>
         * <li>product: production environment</li>
         * <li>dev: development environment</li>
         * <li>pre: pre-release environment</li>
         * <li>test: test environment</li>
         * <li>sit: system integration testing (SIT) environment</li>
         * <li>uat: user acceptance testing (UAT) environment</li>
         * <li>pet: stress testing environment</li>
         * <li>stag: staging environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The ID of the logical database.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("LogicDbId")
        public Long logicDbId;

        /**
         * <p>Logical database name.</p>
         * 
         * <strong>example:</strong>
         * <p>logic_db_test</p>
         */
        @NameInMap("LogicDbName")
        public String logicDbName;

        /**
         * <p>The name of the saved search.</p>
         * 
         * <strong>example:</strong>
         * <p>logic_db_test</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        public static GetDBTopologyResponseBodyDBTopology build(java.util.Map<String, ?> map) throws Exception {
            GetDBTopologyResponseBodyDBTopology self = new GetDBTopologyResponseBodyDBTopology();
            return TeaModel.build(map, self);
        }

        public GetDBTopologyResponseBodyDBTopology setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetDBTopologyResponseBodyDBTopology setDBTopologyInfoList(java.util.List<GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList> DBTopologyInfoList) {
            this.DBTopologyInfoList = DBTopologyInfoList;
            return this;
        }
        public java.util.List<GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList> getDBTopologyInfoList() {
            return this.DBTopologyInfoList;
        }

        public GetDBTopologyResponseBodyDBTopology setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDBTopologyResponseBodyDBTopology setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDBTopologyResponseBodyDBTopology setLogicDbId(Long logicDbId) {
            this.logicDbId = logicDbId;
            return this;
        }
        public Long getLogicDbId() {
            return this.logicDbId;
        }

        public GetDBTopologyResponseBodyDBTopology setLogicDbName(String logicDbName) {
            this.logicDbName = logicDbName;
            return this;
        }
        public String getLogicDbName() {
            return this.logicDbName;
        }

        public GetDBTopologyResponseBodyDBTopology setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTopologyResponseBody extends TeaModel {
    /**
     * <p>The topology of the logical database.</p>
     */
    @NameInMap("DBTopology")
    public GetDBTopologyResponseBodyDBTopology DBTopology;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
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
         * <br>
         * <p>> If the database is a PostgreSQL database, the value of this parameter is the name of the database.</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The ID of the logical database.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the logical database belongs. Valid values:</p>
         * <br>
         * <p>*   **product**: production environment</p>
         * <p>*   **dev**: development environment</p>
         * <p>*   **pre**: pre-release environment</p>
         * <p>*   **test**: test environment</p>
         * <p>*   **sit**: SIT environment</p>
         * <p>*   **uat**: UAT environment</p>
         * <p>*   **pet**: stress testing environment</p>
         * <p>*   **stag**: staging environment</p>
         * <br>
         * <p>> For more information, see [Change the environment type of an instance](~~163309~~).</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The ID of the instance in which the logical database resides.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the resource related to the instance. The resource corresponds with the database instance type returned in the InstanceSource parameter.</p>
         * <br>
         * <p>*   If the value of the InstanceSource parameter is RDS, the ID of an ApsaraDB RDS instance is returned.</p>
         * <p>*   If the value of the InstanceSource parameter is ECS_OWN, the ID of a self-managed database that is hosted on an Elastic Compute Service (ECS) instance is returned.</p>
         * <p>*   If the value of the InstanceSource parameter is PUBLIC_OWN, an empty string is returned.</p>
         * <p>*   If the value of the InstanceSource parameter is VPC_ID, the ID of a self-managed database instance in a virtual private cloud (VPC) that is connected over Express Connect circuits is returned.</p>
         * <p>*   If the value of the InstanceSource parameter is GATEWAY, the ID of a database instance connected by using a database gateway is returned.</p>
         */
        @NameInMap("InstanceResourceId")
        public String instanceResourceId;

        /**
         * <p>The type of the database instance. Valid values:</p>
         * <br>
         * <p>*   **RDS**: an ApsaraDB RDS instance.</p>
         * <p>*   **ECS_OWN**: a self-managed database that is hosted on an ECS instance.</p>
         * <p>*   **PUBLIC_OWN**: a self-managed database instance that is connected over the Internet.</p>
         * <p>*   **VPC_ID**: a self-managed database instance in a VPC that is connected over Express Connect circuits.</p>
         * <p>*   **GATEWAY**: a database instance connected by using a database gateway.</p>
         */
        @NameInMap("InstanceSource")
        public String instanceSource;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the logical database.</p>
         * <br>
         * <p>> If the database is a PostgreSQL database, the value of this parameter is the name of the database schema.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the database.</p>
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
         * <p>The alias of the logical database.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The topologies of the physical database shards.</p>
         */
        @NameInMap("DBTopologyInfoList")
        public java.util.List<GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList> DBTopologyInfoList;

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the logical database belongs. Valid values:</p>
         * <br>
         * <p>*   **product**: production environment</p>
         * <p>*   **dev**: development environment</p>
         * <p>*   **pre**: pre-release environment</p>
         * <p>*   **test**: test environment</p>
         * <p>*   **sit**: system integration testing (SIT) environment</p>
         * <p>*   **uat**: user acceptance testing (UAT) environment</p>
         * <p>*   **pet**: stress testing environment</p>
         * <p>*   **stag**: staging environment</p>
         * <br>
         * <p>> For more information, see [Change the environment type of an instance](~~163309~~).</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The ID of the logical database.</p>
         */
        @NameInMap("LogicDbId")
        public Long logicDbId;

        /**
         * <p>The name of the logical database.</p>
         */
        @NameInMap("LogicDbName")
        public String logicDbName;

        /**
         * <p>The name that is used to search for the logical database.</p>
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

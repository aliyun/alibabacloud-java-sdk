// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableTopologyResponseBody extends TeaModel {
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

    /**
     * <p>The topology information.</p>
     */
    @NameInMap("TableTopology")
    public GetTableTopologyResponseBodyTableTopology tableTopology;

    public static GetTableTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableTopologyResponseBody self = new GetTableTopologyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableTopologyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTableTopologyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTableTopologyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableTopologyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTableTopologyResponseBody setTableTopology(GetTableTopologyResponseBodyTableTopology tableTopology) {
        this.tableTopology = tableTopology;
        return this;
    }
    public GetTableTopologyResponseBodyTableTopology getTableTopology() {
        return this.tableTopology;
    }

    public static class GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList extends TeaModel {
        /**
         * <p>The ID of the physical database.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The name that is used to search for the database.</p>
         */
        @NameInMap("DbSearchName")
        public String dbSearchName;

        /**
         * <p>The database engine.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The ID of the instance to which the physical database belongs.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The ID of the resource related to the instance. The resource corresponds with the database instance type returned in the InstanceSource parameter.</p>
         * <br>
         * <p>*   **RDS**:The ID of the ApsaraDB RDS instance.</p>
         * <p>*   **ECS_OWN**: The ID of the Elastic Compute Service (ECS) instance.</p>
         * <p>*   **PUBLIC_OWN**: This parameter is left empty for self-managed database instances that are connected over the Internet.</p>
         * <p>*   **VPC_ID**:The ID of the virtual private cloud (VPC).</p>
         * <p>*   **GATEWAY**: The ID of the database gateway.</p>
         */
        @NameInMap("InstanceResourceId")
        public String instanceResourceId;

        /**
         * <p>The type of the database instance. Valid values:</p>
         * <br>
         * <p>*   **RDS**: an ApsaraDB RDS instance.</p>
         * <p>*   **ECS_OWN**: a self-managed database that is deployed on an ECS instance</p>
         * <p>*   **PUBLIC_OWN**: a self-managed database instance that is connected over the Internet.</p>
         * <p>*   **VPC_ID**: a self-managed database instance in a VPC that is connected over Express Connect circuits.</p>
         * <p>*   **GATEWAY**: a database instance connected by using a database gateway.</p>
         */
        @NameInMap("InstanceSource")
        public String instanceSource;

        /**
         * <p>The region ID of the instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of tables.</p>
         */
        @NameInMap("TableCount")
        public Long tableCount;

        /**
         * <p>The expression of the names of logical tables.</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Description** This parameter is not returned for physical tables.</p>
         */
        @NameInMap("TableNameExpr")
        public String tableNameExpr;

        /**
         * <p>The names of tables.</p>
         * <br>
         * <p>> The table names are separated by commas (,).</p>
         */
        @NameInMap("TableNameList")
        public String tableNameList;

        public static GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList self = new GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList();
            return TeaModel.build(map, self);
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setDbSearchName(String dbSearchName) {
            this.dbSearchName = dbSearchName;
            return this;
        }
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setInstanceResourceId(String instanceResourceId) {
            this.instanceResourceId = instanceResourceId;
            return this;
        }
        public String getInstanceResourceId() {
            return this.instanceResourceId;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setTableNameExpr(String tableNameExpr) {
            this.tableNameExpr = tableNameExpr;
            return this;
        }
        public String getTableNameExpr() {
            return this.tableNameExpr;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setTableNameList(String tableNameList) {
            this.tableNameList = tableNameList;
            return this;
        }
        public String getTableNameList() {
            return this.tableNameList;
        }

    }

    public static class GetTableTopologyResponseBodyTableTopology extends TeaModel {
        /**
         * <p>Indicates whether the table is a logical table. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The GUID of the table in DMS.</p>
         */
        @NameInMap("TableGuid")
        public String tableGuid;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>Information of the topology of the table.</p>
         */
        @NameInMap("TableTopologyInfoList")
        public java.util.List<GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList> tableTopologyInfoList;

        public static GetTableTopologyResponseBodyTableTopology build(java.util.Map<String, ?> map) throws Exception {
            GetTableTopologyResponseBodyTableTopology self = new GetTableTopologyResponseBodyTableTopology();
            return TeaModel.build(map, self);
        }

        public GetTableTopologyResponseBodyTableTopology setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetTableTopologyResponseBodyTableTopology setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetTableTopologyResponseBodyTableTopology setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetTableTopologyResponseBodyTableTopology setTableTopologyInfoList(java.util.List<GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList> tableTopologyInfoList) {
            this.tableTopologyInfoList = tableTopologyInfoList;
            return this;
        }
        public java.util.List<GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList> getTableTopologyInfoList() {
            return this.tableTopologyInfoList;
        }

    }

}

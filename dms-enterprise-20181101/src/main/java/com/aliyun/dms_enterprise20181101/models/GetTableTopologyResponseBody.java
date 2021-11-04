// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableTopologyResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbSearchName")
        public String dbSearchName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceResourceId")
        public String instanceResourceId;

        @NameInMap("InstanceSource")
        public String instanceSource;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TableCount")
        public Long tableCount;

        @NameInMap("TableNameExpr")
        public String tableNameExpr;

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
        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TableName")
        public String tableName;

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

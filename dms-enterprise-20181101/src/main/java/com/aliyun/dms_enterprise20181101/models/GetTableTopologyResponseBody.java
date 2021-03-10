// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableTopologyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("TableTopology")
    public GetTableTopologyResponseBodyTableTopology tableTopology;

    public static GetTableTopologyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableTopologyResponseBody self = new GetTableTopologyResponseBody();
        return TeaModel.build(map, self);
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

    public GetTableTopologyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTableTopologyResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTableTopologyResponseBody setTableTopology(GetTableTopologyResponseBodyTableTopology tableTopology) {
        this.tableTopology = tableTopology;
        return this;
    }
    public GetTableTopologyResponseBodyTableTopology getTableTopology() {
        return this.tableTopology;
    }

    public static class GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList extends TeaModel {
        @NameInMap("TableNameList")
        public String tableNameList;

        @NameInMap("TableNameExpr")
        public String tableNameExpr;

        @NameInMap("TableCount")
        public Long tableCount;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("DbSearchName")
        public String dbSearchName;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceResourceId")
        public String instanceResourceId;

        @NameInMap("InstanceSource")
        public String instanceSource;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("DbType")
        public String dbType;

        public static GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList self = new GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList();
            return TeaModel.build(map, self);
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setTableNameList(String tableNameList) {
            this.tableNameList = tableNameList;
            return this;
        }
        public String getTableNameList() {
            return this.tableNameList;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setTableNameExpr(String tableNameExpr) {
            this.tableNameExpr = tableNameExpr;
            return this;
        }
        public String getTableNameExpr() {
            return this.tableNameExpr;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setDbSearchName(String dbSearchName) {
            this.dbSearchName = dbSearchName;
            return this;
        }
        public String getDbSearchName() {
            return this.dbSearchName;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

    }

    public static class GetTableTopologyResponseBodyTableTopology extends TeaModel {
        @NameInMap("TableGuid")
        public String tableGuid;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("TableTopologyInfoList")
        public java.util.List<GetTableTopologyResponseBodyTableTopologyTableTopologyInfoList> tableTopologyInfoList;

        @NameInMap("Logic")
        public Boolean logic;

        public static GetTableTopologyResponseBodyTableTopology build(java.util.Map<String, ?> map) throws Exception {
            GetTableTopologyResponseBodyTableTopology self = new GetTableTopologyResponseBodyTableTopology();
            return TeaModel.build(map, self);
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

        public GetTableTopologyResponseBodyTableTopology setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

    }

}

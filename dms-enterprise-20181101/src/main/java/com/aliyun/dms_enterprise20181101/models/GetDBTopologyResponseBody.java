// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTopologyResponseBody extends TeaModel {
    @NameInMap("DBTopology")
    public GetDBTopologyResponseBodyDBTopology DBTopology;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CatalogName")
        public String catalogName;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("InstanceResourceId")
        public String instanceResourceId;

        @NameInMap("InstanceSource")
        public String instanceSource;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SchemaName")
        public String schemaName;

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
        @NameInMap("Alias")
        public String alias;

        @NameInMap("DBTopologyInfoList")
        public java.util.List<GetDBTopologyResponseBodyDBTopologyDBTopologyInfoList> DBTopologyInfoList;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("LogicDbId")
        public Long logicDbId;

        @NameInMap("LogicDbName")
        public String logicDbName;

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

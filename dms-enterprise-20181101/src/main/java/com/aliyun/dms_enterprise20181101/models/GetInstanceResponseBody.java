// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    // The error code that is returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message that is returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The details of the database instance.
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetInstanceResponseBody setInstance(GetInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceResponseBodyInstanceOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static GetInstanceResponseBodyInstanceOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceOwnerIdList self = new GetInstanceResponseBodyInstanceOwnerIdList();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class GetInstanceResponseBodyInstanceOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static GetInstanceResponseBodyInstanceOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceOwnerNameList self = new GetInstanceResponseBodyInstanceOwnerNameList();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class GetInstanceResponseBodyInstanceStandardGroup extends TeaModel {
        // The type of the control mode. Valid values:
        // 
        // *   **COMMON**: Security Collaboration
        // *   **NONE_CONTROL**: Flexible Management
        // *   **STABLE**: Stable Change
        @NameInMap("GroupMode")
        public String groupMode;

        // The name of the security rule set corresponding to the control mode.
        @NameInMap("GroupName")
        public String groupName;

        public static GetInstanceResponseBodyInstanceStandardGroup build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceStandardGroup self = new GetInstanceResponseBodyInstanceStandardGroup();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceStandardGroup setGroupMode(String groupMode) {
            this.groupMode = groupMode;
            return this;
        }
        public String getGroupMode() {
            return this.groupMode;
        }

        public GetInstanceResponseBodyInstanceStandardGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        // The name of the database link for the database instance.
        @NameInMap("DataLinkName")
        public String dataLinkName;

        // The password that is used to log on to the database.
        @NameInMap("DatabasePassword")
        public String databasePassword;

        // The account that is used to log on to the database instance.
        @NameInMap("DatabaseUser")
        public String databaseUser;

        // The ID of the database administrator (DBA) for the database instance.
        @NameInMap("DbaId")
        public String dbaId;

        // The nickname of the DBA for the database instance.
        @NameInMap("DbaNickName")
        public String dbaNickName;

        // Indicates whether the lock-free schema change feature is enabled for the database instance.
        @NameInMap("DdlOnline")
        public Integer ddlOnline;

        // The ID of the Elastic Compute Service (ECS) instance on which the database instance is deployed.
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        // The ID of the region in which the database instance resides.
        @NameInMap("EcsRegion")
        public String ecsRegion;

        // The type of the environment to which the database instance belongs. Valid values:
        // 
        // *   **product**: production environment
        // *   **dev**: development environment
        // *   **pre**: staging environment
        // *   **test**: test environment
        // *   **sit**: system integration testing (SIT) environment
        // *   **uat**: user acceptance testing (UAT) environment
        // *   **pet**: stress testing environment
        // *   **stag**: STAG environment
        @NameInMap("EnvType")
        public String envType;

        // The timeout period for exporting data from the database instance.
        @NameInMap("ExportTimeout")
        public Integer exportTimeout;

        // The host address that is used to connect to the database instance.
        @NameInMap("Host")
        public String host;

        // The alias of the database instance.
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        // The ID of the database instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The source of the database instance.
        @NameInMap("InstanceSource")
        public String instanceSource;

        // The type of the database instance.
        @NameInMap("InstanceType")
        public String instanceType;

        // The IDs of the owners for the database instance.
        @NameInMap("OwnerIdList")
        public GetInstanceResponseBodyInstanceOwnerIdList ownerIdList;

        // The nicknames of the owners for the database instance.
        @NameInMap("OwnerNameList")
        public GetInstanceResponseBodyInstanceOwnerNameList ownerNameList;

        // The port number that is used to connect to the database instance.
        @NameInMap("Port")
        public Integer port;

        // The timeout period for querying data in the database instance.
        @NameInMap("QueryTimeout")
        public Integer queryTimeout;

        // The ID of the security rule set for the database instance.
        @NameInMap("SafeRuleId")
        public String safeRuleId;

        @NameInMap("SellSitd")
        public String sellSitd;

        // The SID of the database instance.
        @NameInMap("Sid")
        public String sid;

        // The control mode of the database instance.
        @NameInMap("StandardGroup")
        public GetInstanceResponseBodyInstanceStandardGroup standardGroup;

        // The status of the database instance. Valid values:
        // 
        // *   **NORMAL**: normal
        // *   **DISABLE**: disabled
        @NameInMap("State")
        public String state;

        // Indicates whether the cross-database query feature is enabled for the database instance. Valid values:
        // 
        // *   **0**: disabled
        // *   **1**: enabled
        @NameInMap("UseDsql")
        public Integer useDsql;

        // The ID of the virtual private cloud (VPC) to which the database instance belongs.
        @NameInMap("VpcId")
        public String vpcId;

        public static GetInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstance self = new GetInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstance setDataLinkName(String dataLinkName) {
            this.dataLinkName = dataLinkName;
            return this;
        }
        public String getDataLinkName() {
            return this.dataLinkName;
        }

        public GetInstanceResponseBodyInstance setDatabasePassword(String databasePassword) {
            this.databasePassword = databasePassword;
            return this;
        }
        public String getDatabasePassword() {
            return this.databasePassword;
        }

        public GetInstanceResponseBodyInstance setDatabaseUser(String databaseUser) {
            this.databaseUser = databaseUser;
            return this;
        }
        public String getDatabaseUser() {
            return this.databaseUser;
        }

        public GetInstanceResponseBodyInstance setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public GetInstanceResponseBodyInstance setDbaNickName(String dbaNickName) {
            this.dbaNickName = dbaNickName;
            return this;
        }
        public String getDbaNickName() {
            return this.dbaNickName;
        }

        public GetInstanceResponseBodyInstance setDdlOnline(Integer ddlOnline) {
            this.ddlOnline = ddlOnline;
            return this;
        }
        public Integer getDdlOnline() {
            return this.ddlOnline;
        }

        public GetInstanceResponseBodyInstance setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public GetInstanceResponseBodyInstance setEcsRegion(String ecsRegion) {
            this.ecsRegion = ecsRegion;
            return this;
        }
        public String getEcsRegion() {
            return this.ecsRegion;
        }

        public GetInstanceResponseBodyInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetInstanceResponseBodyInstance setExportTimeout(Integer exportTimeout) {
            this.exportTimeout = exportTimeout;
            return this;
        }
        public Integer getExportTimeout() {
            return this.exportTimeout;
        }

        public GetInstanceResponseBodyInstance setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetInstanceResponseBodyInstance setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstance setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public GetInstanceResponseBodyInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetInstanceResponseBodyInstance setOwnerIdList(GetInstanceResponseBodyInstanceOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public GetInstanceResponseBodyInstanceOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public GetInstanceResponseBodyInstance setOwnerNameList(GetInstanceResponseBodyInstanceOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public GetInstanceResponseBodyInstanceOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public GetInstanceResponseBodyInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetInstanceResponseBodyInstance setQueryTimeout(Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Integer getQueryTimeout() {
            return this.queryTimeout;
        }

        public GetInstanceResponseBodyInstance setSafeRuleId(String safeRuleId) {
            this.safeRuleId = safeRuleId;
            return this;
        }
        public String getSafeRuleId() {
            return this.safeRuleId;
        }

        public GetInstanceResponseBodyInstance setSellSitd(String sellSitd) {
            this.sellSitd = sellSitd;
            return this;
        }
        public String getSellSitd() {
            return this.sellSitd;
        }

        public GetInstanceResponseBodyInstance setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public GetInstanceResponseBodyInstance setStandardGroup(GetInstanceResponseBodyInstanceStandardGroup standardGroup) {
            this.standardGroup = standardGroup;
            return this;
        }
        public GetInstanceResponseBodyInstanceStandardGroup getStandardGroup() {
            return this.standardGroup;
        }

        public GetInstanceResponseBodyInstance setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetInstanceResponseBodyInstance setUseDsql(Integer useDsql) {
            this.useDsql = useDsql;
            return this;
        }
        public Integer getUseDsql() {
            return this.useDsql;
        }

        public GetInstanceResponseBodyInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

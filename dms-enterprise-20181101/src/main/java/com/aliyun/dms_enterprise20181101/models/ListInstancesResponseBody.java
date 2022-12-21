// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    // The error code that is returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message that is returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The information about the database instances that are returned.
    @NameInMap("InstanceList")
    public ListInstancesResponseBodyInstanceList instanceList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The total number of database instances that are returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListInstancesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListInstancesResponseBody setInstanceList(ListInstancesResponseBodyInstanceList instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public ListInstancesResponseBodyInstanceList getInstanceList() {
        return this.instanceList;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstanceListInstanceOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static ListInstancesResponseBodyInstanceListInstanceOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceListInstanceOwnerIdList self = new ListInstancesResponseBodyInstanceListInstanceOwnerIdList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceListInstanceOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class ListInstancesResponseBodyInstanceListInstanceOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static ListInstancesResponseBodyInstanceListInstanceOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceListInstanceOwnerNameList self = new ListInstancesResponseBodyInstanceListInstanceOwnerNameList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceListInstanceOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class ListInstancesResponseBodyInstanceListInstanceStandardGroup extends TeaModel {
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

        public static ListInstancesResponseBodyInstanceListInstanceStandardGroup build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceListInstanceStandardGroup self = new ListInstancesResponseBodyInstanceListInstanceStandardGroup();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceListInstanceStandardGroup setGroupMode(String groupMode) {
            this.groupMode = groupMode;
            return this;
        }
        public String getGroupMode() {
            return this.groupMode;
        }

        public ListInstancesResponseBodyInstanceListInstanceStandardGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class ListInstancesResponseBodyInstanceListInstance extends TeaModel {
        // The name of the database link for the database instance.
        @NameInMap("DataLinkName")
        public String dataLinkName;

        // The password that is used to log on to the database.
        @NameInMap("DatabasePassword")
        public String databasePassword;

        // The account that is used to log on to the database.
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

        // The ID of the ECS instance on which the database instance is deployed.
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
        // *   **sit**: SIT environment
        // *   **uat**: UAT environment
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

        // The ID of the owner for the database instance.
        @NameInMap("OwnerIdList")
        public ListInstancesResponseBodyInstanceListInstanceOwnerIdList ownerIdList;

        // The nickname of the owner for the database instance.
        @NameInMap("OwnerNameList")
        public ListInstancesResponseBodyInstanceListInstanceOwnerNameList ownerNameList;

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
        public Boolean sellSitd;

        // The system ID (SID) of the database instance.
        @NameInMap("Sid")
        public String sid;

        // The control mode of the database instance.
        @NameInMap("StandardGroup")
        public ListInstancesResponseBodyInstanceListInstanceStandardGroup standardGroup;

        // The status of the database instance.
        @NameInMap("State")
        public String state;

        // Indicates whether the cross-database query feature is enabled for the database instance. Valid values:
        // 
        // *   **0**: disabled
        // *   **1**: enabled
        @NameInMap("UseDsql")
        public Integer useDsql;

        // The ID of the VPC to which the database instance belongs.
        @NameInMap("VpcId")
        public String vpcId;

        public static ListInstancesResponseBodyInstanceListInstance build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceListInstance self = new ListInstancesResponseBodyInstanceListInstance();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceListInstance setDataLinkName(String dataLinkName) {
            this.dataLinkName = dataLinkName;
            return this;
        }
        public String getDataLinkName() {
            return this.dataLinkName;
        }

        public ListInstancesResponseBodyInstanceListInstance setDatabasePassword(String databasePassword) {
            this.databasePassword = databasePassword;
            return this;
        }
        public String getDatabasePassword() {
            return this.databasePassword;
        }

        public ListInstancesResponseBodyInstanceListInstance setDatabaseUser(String databaseUser) {
            this.databaseUser = databaseUser;
            return this;
        }
        public String getDatabaseUser() {
            return this.databaseUser;
        }

        public ListInstancesResponseBodyInstanceListInstance setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public ListInstancesResponseBodyInstanceListInstance setDbaNickName(String dbaNickName) {
            this.dbaNickName = dbaNickName;
            return this;
        }
        public String getDbaNickName() {
            return this.dbaNickName;
        }

        public ListInstancesResponseBodyInstanceListInstance setDdlOnline(Integer ddlOnline) {
            this.ddlOnline = ddlOnline;
            return this;
        }
        public Integer getDdlOnline() {
            return this.ddlOnline;
        }

        public ListInstancesResponseBodyInstanceListInstance setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public ListInstancesResponseBodyInstanceListInstance setEcsRegion(String ecsRegion) {
            this.ecsRegion = ecsRegion;
            return this;
        }
        public String getEcsRegion() {
            return this.ecsRegion;
        }

        public ListInstancesResponseBodyInstanceListInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListInstancesResponseBodyInstanceListInstance setExportTimeout(Integer exportTimeout) {
            this.exportTimeout = exportTimeout;
            return this;
        }
        public Integer getExportTimeout() {
            return this.exportTimeout;
        }

        public ListInstancesResponseBodyInstanceListInstance setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListInstancesResponseBodyInstanceListInstance setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public ListInstancesResponseBodyInstanceListInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstanceListInstance setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public ListInstancesResponseBodyInstanceListInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesResponseBodyInstanceListInstance setOwnerIdList(ListInstancesResponseBodyInstanceListInstanceOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public ListInstancesResponseBodyInstanceListInstanceOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListInstancesResponseBodyInstanceListInstance setOwnerNameList(ListInstancesResponseBodyInstanceListInstanceOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public ListInstancesResponseBodyInstanceListInstanceOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public ListInstancesResponseBodyInstanceListInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListInstancesResponseBodyInstanceListInstance setQueryTimeout(Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Integer getQueryTimeout() {
            return this.queryTimeout;
        }

        public ListInstancesResponseBodyInstanceListInstance setSafeRuleId(String safeRuleId) {
            this.safeRuleId = safeRuleId;
            return this;
        }
        public String getSafeRuleId() {
            return this.safeRuleId;
        }

        public ListInstancesResponseBodyInstanceListInstance setSellSitd(Boolean sellSitd) {
            this.sellSitd = sellSitd;
            return this;
        }
        public Boolean getSellSitd() {
            return this.sellSitd;
        }

        public ListInstancesResponseBodyInstanceListInstance setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public ListInstancesResponseBodyInstanceListInstance setStandardGroup(ListInstancesResponseBodyInstanceListInstanceStandardGroup standardGroup) {
            this.standardGroup = standardGroup;
            return this;
        }
        public ListInstancesResponseBodyInstanceListInstanceStandardGroup getStandardGroup() {
            return this.standardGroup;
        }

        public ListInstancesResponseBodyInstanceListInstance setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListInstancesResponseBodyInstanceListInstance setUseDsql(Integer useDsql) {
            this.useDsql = useDsql;
            return this;
        }
        public Integer getUseDsql() {
            return this.useDsql;
        }

        public ListInstancesResponseBodyInstanceListInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListInstancesResponseBodyInstanceList extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<ListInstancesResponseBodyInstanceListInstance> instance;

        public static ListInstancesResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceList self = new ListInstancesResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceList setInstance(java.util.List<ListInstancesResponseBodyInstanceListInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstanceListInstance> getInstance() {
            return this.instance;
        }

    }

}

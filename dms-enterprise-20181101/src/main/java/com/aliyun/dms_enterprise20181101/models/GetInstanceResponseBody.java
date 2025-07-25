// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of the database instance.</p>
     */
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F6C80B69-3203-56AC-8021-18BA72A6F4E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The type of the control mode. Valid values:</p>
         * <ul>
         * <li><strong>COMMON</strong>: Security Collaboration</li>
         * <li><strong>NONE_CONTROL</strong>: Flexible Management</li>
         * <li><strong>STABLE</strong>: Stable Change</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE_CONTROL</p>
         */
        @NameInMap("GroupMode")
        public String groupMode;

        /**
         * <p>The name of the security rule set corresponding to the control mode.</p>
         * 
         * <strong>example:</strong>
         * <p>test group name</p>
         */
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
        /**
         * <p>The name of the database link for the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DataLinkName")
        public String dataLinkName;

        /**
         * <p>The password that is used to log on to the database.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("DatabasePassword")
        public String databasePassword;

        /**
         * <p>The account that is used to log on to the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dbuser</p>
         */
        @NameInMap("DatabaseUser")
        public String databaseUser;

        /**
         * <p>The ID of the database administrator (DBA) for the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>29****</p>
         */
        @NameInMap("DbaId")
        public String dbaId;

        /**
         * <p>The nickname of the DBA for the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dbaname</p>
         */
        @NameInMap("DbaNickName")
        public String dbaNickName;

        /**
         * <p>Indicates whether the lock-free schema change feature is enabled for the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DdlOnline")
        public Integer ddlOnline;

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance on which the database instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp124ldpklqz59y3****</p>
         */
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        /**
         * <p>The ID of the region in which the database instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("EcsRegion")
        public String ecsRegion;

        /**
         * <p>The type of the environment to which the database instance belongs. Valid values:</p>
         * <ul>
         * <li><strong>product</strong>: production environment</li>
         * <li><strong>dev</strong>: development environment</li>
         * <li><strong>pre</strong>: staging environment</li>
         * <li><strong>test</strong>: test environment</li>
         * <li><strong>sit</strong>: system integration testing (SIT) environment</li>
         * <li><strong>uat</strong>: user acceptance testing (UAT) environment</li>
         * <li><strong>pet</strong>: stress testing environment</li>
         * <li><strong>stag</strong>: STAG environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The timeout period for exporting data from the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        @NameInMap("ExportTimeout")
        public Integer exportTimeout;

        /**
         * <p>The host address that is used to connect to the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XXX.XXX</p>
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
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>188****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The source of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_OWN</p>
         */
        @NameInMap("InstanceSource")
        public String instanceSource;

        /**
         * <p>The type of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>postgresql</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The IDs of the owners for the database instance.</p>
         */
        @NameInMap("OwnerIdList")
        public GetInstanceResponseBodyInstanceOwnerIdList ownerIdList;

        /**
         * <p>The nicknames of the owners for the database instance.</p>
         */
        @NameInMap("OwnerNameList")
        public GetInstanceResponseBodyInstanceOwnerNameList ownerNameList;

        /**
         * <p>The port number that is used to connect to the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The timeout period for querying data in the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("QueryTimeout")
        public Integer queryTimeout;

        /**
         * <p>The ID of the security rule set for the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3****</p>
         */
        @NameInMap("SafeRuleId")
        public String safeRuleId;

        /**
         * <p>Whether sensitive data protection is enabled.  Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable.</p>
         * </li>
         * <li><p><strong>false</strong>: Close.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SellSitd")
        public String sellSitd;

        @NameInMap("SellTrust")
        public String sellTrust;

        /**
         * <p>The SID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Sid")
        public String sid;

        /**
         * <p>The control mode of the database instance.</p>
         */
        @NameInMap("StandardGroup")
        public GetInstanceResponseBodyInstanceStandardGroup standardGroup;

        /**
         * <p>The status of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: normal</li>
         * <li><strong>DISABLE</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Indicates whether the cross-database query feature is enabled for the database instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UseDsql")
        public Integer useDsql;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the database instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-o6wrloqsdqc9io3mg****</p>
         */
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

        public GetInstanceResponseBodyInstance setSellTrust(String sellTrust) {
            this.sellTrust = sellTrust;
            return this;
        }
        public String getSellTrust() {
            return this.sellTrust;
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

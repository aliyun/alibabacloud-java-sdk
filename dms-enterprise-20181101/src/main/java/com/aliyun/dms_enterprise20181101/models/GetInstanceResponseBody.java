// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setInstance(GetInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetInstanceResponseBodyInstance getInstance() {
        return this.instance;
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

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("DatabaseUser")
        public String databaseUser;

        @NameInMap("DbaId")
        public String dbaId;

        @NameInMap("UseDsql")
        public Integer useDsql;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("OwnerIdList")
        public GetInstanceResponseBodyInstanceOwnerIdList ownerIdList;

        @NameInMap("SafeRuleId")
        public String safeRuleId;

        @NameInMap("OwnerNameList")
        public GetInstanceResponseBodyInstanceOwnerNameList ownerNameList;

        @NameInMap("DbaNickName")
        public String dbaNickName;

        @NameInMap("QueryTimeout")
        public Integer queryTimeout;

        @NameInMap("InstanceSource")
        public String instanceSource;

        @NameInMap("Host")
        public String host;

        @NameInMap("State")
        public String state;

        @NameInMap("DataLinkName")
        public String dataLinkName;

        @NameInMap("ExportTimeout")
        public Integer exportTimeout;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("DatabasePassword")
        public String databasePassword;

        @NameInMap("InstanceAlias")
        public String instanceAlias;

        @NameInMap("DdlOnline")
        public Integer ddlOnline;

        @NameInMap("EcsRegion")
        public String ecsRegion;

        public static GetInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstance self = new GetInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

        public GetInstanceResponseBodyInstance setUseDsql(Integer useDsql) {
            this.useDsql = useDsql;
            return this;
        }
        public Integer getUseDsql() {
            return this.useDsql;
        }

        public GetInstanceResponseBodyInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetInstanceResponseBodyInstance setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public GetInstanceResponseBodyInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetInstanceResponseBodyInstance setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public GetInstanceResponseBodyInstance setOwnerIdList(GetInstanceResponseBodyInstanceOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public GetInstanceResponseBodyInstanceOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public GetInstanceResponseBodyInstance setSafeRuleId(String safeRuleId) {
            this.safeRuleId = safeRuleId;
            return this;
        }
        public String getSafeRuleId() {
            return this.safeRuleId;
        }

        public GetInstanceResponseBodyInstance setOwnerNameList(GetInstanceResponseBodyInstanceOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public GetInstanceResponseBodyInstanceOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public GetInstanceResponseBodyInstance setDbaNickName(String dbaNickName) {
            this.dbaNickName = dbaNickName;
            return this;
        }
        public String getDbaNickName() {
            return this.dbaNickName;
        }

        public GetInstanceResponseBodyInstance setQueryTimeout(Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Integer getQueryTimeout() {
            return this.queryTimeout;
        }

        public GetInstanceResponseBodyInstance setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public GetInstanceResponseBodyInstance setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetInstanceResponseBodyInstance setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetInstanceResponseBodyInstance setDataLinkName(String dataLinkName) {
            this.dataLinkName = dataLinkName;
            return this;
        }
        public String getDataLinkName() {
            return this.dataLinkName;
        }

        public GetInstanceResponseBodyInstance setExportTimeout(Integer exportTimeout) {
            this.exportTimeout = exportTimeout;
            return this;
        }
        public Integer getExportTimeout() {
            return this.exportTimeout;
        }

        public GetInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetInstanceResponseBodyInstance setDatabasePassword(String databasePassword) {
            this.databasePassword = databasePassword;
            return this;
        }
        public String getDatabasePassword() {
            return this.databasePassword;
        }

        public GetInstanceResponseBodyInstance setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetInstanceResponseBodyInstance setDdlOnline(Integer ddlOnline) {
            this.ddlOnline = ddlOnline;
            return this;
        }
        public Integer getDdlOnline() {
            return this.ddlOnline;
        }

        public GetInstanceResponseBodyInstance setEcsRegion(String ecsRegion) {
            this.ecsRegion = ecsRegion;
            return this;
        }
        public String getEcsRegion() {
            return this.ecsRegion;
        }

    }

}

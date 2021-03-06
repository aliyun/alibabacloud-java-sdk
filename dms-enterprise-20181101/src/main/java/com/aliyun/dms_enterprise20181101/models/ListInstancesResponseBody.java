// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("InstanceList")
    public ListInstancesResponseBodyInstanceList instanceList;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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

    public static class ListInstancesResponseBodyInstanceListInstance extends TeaModel {
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
        public ListInstancesResponseBodyInstanceListInstanceOwnerIdList ownerIdList;

        @NameInMap("SafeRuleId")
        public String safeRuleId;

        @NameInMap("OwnerNameList")
        public ListInstancesResponseBodyInstanceListInstanceOwnerNameList ownerNameList;

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

        public static ListInstancesResponseBodyInstanceListInstance build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstanceListInstance self = new ListInstancesResponseBodyInstanceListInstance();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstanceListInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

        public ListInstancesResponseBodyInstanceListInstance setUseDsql(Integer useDsql) {
            this.useDsql = useDsql;
            return this;
        }
        public Integer getUseDsql() {
            return this.useDsql;
        }

        public ListInstancesResponseBodyInstanceListInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListInstancesResponseBodyInstanceListInstance setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public ListInstancesResponseBodyInstanceListInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListInstancesResponseBodyInstanceListInstance setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public ListInstancesResponseBodyInstanceListInstance setOwnerIdList(ListInstancesResponseBodyInstanceListInstanceOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public ListInstancesResponseBodyInstanceListInstanceOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListInstancesResponseBodyInstanceListInstance setSafeRuleId(String safeRuleId) {
            this.safeRuleId = safeRuleId;
            return this;
        }
        public String getSafeRuleId() {
            return this.safeRuleId;
        }

        public ListInstancesResponseBodyInstanceListInstance setOwnerNameList(ListInstancesResponseBodyInstanceListInstanceOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public ListInstancesResponseBodyInstanceListInstanceOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public ListInstancesResponseBodyInstanceListInstance setDbaNickName(String dbaNickName) {
            this.dbaNickName = dbaNickName;
            return this;
        }
        public String getDbaNickName() {
            return this.dbaNickName;
        }

        public ListInstancesResponseBodyInstanceListInstance setQueryTimeout(Integer queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Integer getQueryTimeout() {
            return this.queryTimeout;
        }

        public ListInstancesResponseBodyInstanceListInstance setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public ListInstancesResponseBodyInstanceListInstance setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListInstancesResponseBodyInstanceListInstance setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListInstancesResponseBodyInstanceListInstance setDataLinkName(String dataLinkName) {
            this.dataLinkName = dataLinkName;
            return this;
        }
        public String getDataLinkName() {
            return this.dataLinkName;
        }

        public ListInstancesResponseBodyInstanceListInstance setExportTimeout(Integer exportTimeout) {
            this.exportTimeout = exportTimeout;
            return this;
        }
        public Integer getExportTimeout() {
            return this.exportTimeout;
        }

        public ListInstancesResponseBodyInstanceListInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstanceListInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesResponseBodyInstanceListInstance setDatabasePassword(String databasePassword) {
            this.databasePassword = databasePassword;
            return this;
        }
        public String getDatabasePassword() {
            return this.databasePassword;
        }

        public ListInstancesResponseBodyInstanceListInstance setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public ListInstancesResponseBodyInstanceListInstance setDdlOnline(Integer ddlOnline) {
            this.ddlOnline = ddlOnline;
            return this;
        }
        public Integer getDdlOnline() {
            return this.ddlOnline;
        }

        public ListInstancesResponseBodyInstanceListInstance setEcsRegion(String ecsRegion) {
            this.ecsRegion = ecsRegion;
            return this;
        }
        public String getEcsRegion() {
            return this.ecsRegion;
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

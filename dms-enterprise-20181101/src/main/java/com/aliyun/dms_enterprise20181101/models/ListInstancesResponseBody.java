// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("InstanceList")
    public ListInstancesResponseBodyInstanceList instanceList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("GroupMode")
        public String groupMode;

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
        @NameInMap("DataLinkName")
        public String dataLinkName;

        @NameInMap("DatabasePassword")
        public String databasePassword;

        @NameInMap("DatabaseUser")
        public String databaseUser;

        @NameInMap("DbaId")
        public String dbaId;

        @NameInMap("DbaNickName")
        public String dbaNickName;

        @NameInMap("DdlOnline")
        public Integer ddlOnline;

        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("EcsRegion")
        public String ecsRegion;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("ExportTimeout")
        public Integer exportTimeout;

        @NameInMap("Host")
        public String host;

        @NameInMap("InstanceAlias")
        public String instanceAlias;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceSource")
        public String instanceSource;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("OwnerIdList")
        public ListInstancesResponseBodyInstanceListInstanceOwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        public ListInstancesResponseBodyInstanceListInstanceOwnerNameList ownerNameList;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("QueryTimeout")
        public Integer queryTimeout;

        @NameInMap("SafeRuleId")
        public String safeRuleId;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("StandardGroup")
        public ListInstancesResponseBodyInstanceListInstanceStandardGroup standardGroup;

        @NameInMap("State")
        public String state;

        @NameInMap("UseDsql")
        public Integer useDsql;

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

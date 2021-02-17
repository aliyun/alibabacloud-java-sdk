// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeReplicaSetRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ReplicaSets")
    public DescribeReplicaSetRoleResponseBodyReplicaSets replicaSets;

    public static DescribeReplicaSetRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicaSetRoleResponseBody self = new DescribeReplicaSetRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReplicaSetRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReplicaSetRoleResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeReplicaSetRoleResponseBody setReplicaSets(DescribeReplicaSetRoleResponseBodyReplicaSets replicaSets) {
        this.replicaSets = replicaSets;
        return this;
    }
    public DescribeReplicaSetRoleResponseBodyReplicaSets getReplicaSets() {
        return this.replicaSets;
    }

    public static class DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet extends TeaModel {
        @NameInMap("ConnectionPort")
        public String connectionPort;

        @NameInMap("ReplicaSetRole")
        public String replicaSetRole;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RoleId")
        public String roleId;

        public static DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet self = new DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet();
            return TeaModel.build(map, self);
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setConnectionPort(String connectionPort) {
            this.connectionPort = connectionPort;
            return this;
        }
        public String getConnectionPort() {
            return this.connectionPort;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setReplicaSetRole(String replicaSetRole) {
            this.replicaSetRole = replicaSetRole;
            return this;
        }
        public String getReplicaSetRole() {
            return this.replicaSetRole;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setRoleId(String roleId) {
            this.roleId = roleId;
            return this;
        }
        public String getRoleId() {
            return this.roleId;
        }

    }

    public static class DescribeReplicaSetRoleResponseBodyReplicaSets extends TeaModel {
        @NameInMap("ReplicaSet")
        public java.util.List<DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet> replicaSet;

        public static DescribeReplicaSetRoleResponseBodyReplicaSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicaSetRoleResponseBodyReplicaSets self = new DescribeReplicaSetRoleResponseBodyReplicaSets();
            return TeaModel.build(map, self);
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSets setReplicaSet(java.util.List<DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet> replicaSet) {
            this.replicaSet = replicaSet;
            return this;
        }
        public java.util.List<DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet> getReplicaSet() {
            return this.replicaSet;
        }

    }

}

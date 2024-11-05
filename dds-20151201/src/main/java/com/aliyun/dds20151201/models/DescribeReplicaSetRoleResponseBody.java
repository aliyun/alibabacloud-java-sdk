// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeReplicaSetRoleResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bpxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The details of the roles of the replica set instance.</p>
     */
    @NameInMap("ReplicaSets")
    public DescribeReplicaSetRoleResponseBodyReplicaSets replicaSets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DB4A0595-FCA9-437F-B2BB-25DBFC009D3E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeReplicaSetRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicaSetRoleResponseBody self = new DescribeReplicaSetRoleResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeReplicaSetRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet extends TeaModel {
        /**
         * <p>The endpoint of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The port number that is used to connect to the node.</p>
         * 
         * <strong>example:</strong>
         * <p>3717</p>
         */
        @NameInMap("ConnectionPort")
        public String connectionPort;

        /**
         * <p>The connection type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>SRV</p>
         */
        @NameInMap("ConnectionType")
        public String connectionType;

        /**
         * <p>The remaining duration of the classic network endpoint. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1209582</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: the virtual private cloud (VPC)</li>
         * <li><strong>Classic</strong>: the classic network</li>
         * <li><strong>Public</strong>: the Internet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The role of the node in the replica set instance. Valid values:</p>
         * <ul>
         * <li><strong>Primary</strong></li>
         * <li><strong>Secondary</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("ReplicaSetRole")
        public String replicaSetRole;

        /**
         * <p>The role ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>651xxxxx</p>
         */
        @NameInMap("RoleId")
        public String roleId;

        public static DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet self = new DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet();
            return TeaModel.build(map, self);
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setConnectionPort(String connectionPort) {
            this.connectionPort = connectionPort;
            return this;
        }
        public String getConnectionPort() {
            return this.connectionPort;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeReplicaSetRoleResponseBodyReplicaSetsReplicaSet setReplicaSetRole(String replicaSetRole) {
            this.replicaSetRole = replicaSetRole;
            return this;
        }
        public String getReplicaSetRole() {
            return this.replicaSetRole;
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

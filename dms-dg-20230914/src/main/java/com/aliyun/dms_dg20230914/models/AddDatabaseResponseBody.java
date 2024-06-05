// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class AddDatabaseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DbInstance")
    public AddDatabaseResponseBodyDbInstance dbInstance;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDatabaseResponseBody self = new AddDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDatabaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddDatabaseResponseBody setDbInstance(AddDatabaseResponseBodyDbInstance dbInstance) {
        this.dbInstance = dbInstance;
        return this;
    }
    public AddDatabaseResponseBodyDbInstance getDbInstance() {
        return this.dbInstance;
    }

    public AddDatabaseResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AddDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddDatabaseResponseBodyDbInstance extends TeaModel {
        /**
         * <p>连接使用的主机</p>
         */
        @NameInMap("ConnectHost")
        public String connectHost;

        @NameInMap("ConnectPort")
        public Integer connectPort;

        /**
         * <p>备注信息</p>
         */
        @NameInMap("DbDescription")
        public String dbDescription;

        /**
         * <p>数据库类型。</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>数据库所在网关ID。</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>网关名称</p>
         */
        @NameInMap("GatewayName")
        public String gatewayName;

        /**
         * <p>通过网关所在宿主机去访问数据库的地址。</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>数据库实例ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>当前实例的状态</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>网络类型</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>节点的ID</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>归属主账号ID</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>通过网关所在宿主机去访问数据库的端口。</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>所在的地域编号</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>服务类型</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>用户ID</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>VpcId</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>VpcInstanceId</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static AddDatabaseResponseBodyDbInstance build(java.util.Map<String, ?> map) throws Exception {
            AddDatabaseResponseBodyDbInstance self = new AddDatabaseResponseBodyDbInstance();
            return TeaModel.build(map, self);
        }

        public AddDatabaseResponseBodyDbInstance setConnectHost(String connectHost) {
            this.connectHost = connectHost;
            return this;
        }
        public String getConnectHost() {
            return this.connectHost;
        }

        public AddDatabaseResponseBodyDbInstance setConnectPort(Integer connectPort) {
            this.connectPort = connectPort;
            return this;
        }
        public Integer getConnectPort() {
            return this.connectPort;
        }

        public AddDatabaseResponseBodyDbInstance setDbDescription(String dbDescription) {
            this.dbDescription = dbDescription;
            return this;
        }
        public String getDbDescription() {
            return this.dbDescription;
        }

        public AddDatabaseResponseBodyDbInstance setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public AddDatabaseResponseBodyDbInstance setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public AddDatabaseResponseBodyDbInstance setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public AddDatabaseResponseBodyDbInstance setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddDatabaseResponseBodyDbInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddDatabaseResponseBodyDbInstance setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public AddDatabaseResponseBodyDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public AddDatabaseResponseBodyDbInstance setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public AddDatabaseResponseBodyDbInstance setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public AddDatabaseResponseBodyDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddDatabaseResponseBodyDbInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public AddDatabaseResponseBodyDbInstance setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public AddDatabaseResponseBodyDbInstance setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public AddDatabaseResponseBodyDbInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public AddDatabaseResponseBodyDbInstance setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}

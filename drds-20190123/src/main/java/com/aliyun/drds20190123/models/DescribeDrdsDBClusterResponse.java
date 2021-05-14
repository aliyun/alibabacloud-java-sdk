// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("DbInstance")
    @Validation(required = true)
    public DescribeDrdsDBClusterResponseDbInstance dbInstance;

    public static DescribeDrdsDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBClusterResponse self = new DescribeDrdsDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBClusterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBClusterResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDBClusterResponse setDbInstance(DescribeDrdsDBClusterResponseDbInstance dbInstance) {
        this.dbInstance = dbInstance;
        return this;
    }
    public DescribeDrdsDBClusterResponseDbInstance getDbInstance() {
        return this.dbInstance;
    }

    public static class DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint extends TeaModel {
        @NameInMap("NodeIds")
        @Validation(required = true)
        public String nodeIds;

        @NameInMap("EndpointId")
        @Validation(required = true)
        public String endpointId;

        @NameInMap("ReadWeight")
        @Validation(required = true)
        public Integer readWeight;

        public static DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint self = new DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint setNodeIds(String nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public String getNodeIds() {
            return this.nodeIds;
        }

        public DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

    }

    public static class DescribeDrdsDBClusterResponseDbInstanceEndpoints extends TeaModel {
        @NameInMap("Endpoint")
        @Validation(required = true)
        public java.util.List<DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint> endpoint;

        public static DescribeDrdsDBClusterResponseDbInstanceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseDbInstanceEndpoints self = new DescribeDrdsDBClusterResponseDbInstanceEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseDbInstanceEndpoints setEndpoint(java.util.List<DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public java.util.List<DescribeDrdsDBClusterResponseDbInstanceEndpointsEndpoint> getEndpoint() {
            return this.endpoint;
        }

    }

    public static class DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode extends TeaModel {
        @NameInMap("DBNodeId")
        @Validation(required = true)
        public String DBNodeId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DBNodeStatus")
        @Validation(required = true)
        public String DBNodeStatus;

        @NameInMap("DBNodeRole")
        @Validation(required = true)
        public String DBNodeRole;

        public static DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode self = new DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

    }

    public static class DescribeDrdsDBClusterResponseDbInstanceDBNodes extends TeaModel {
        @NameInMap("DBNode")
        @Validation(required = true)
        public java.util.List<DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode> DBNode;

        public static DescribeDrdsDBClusterResponseDbInstanceDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseDbInstanceDBNodes self = new DescribeDrdsDBClusterResponseDbInstanceDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseDbInstanceDBNodes setDBNode(java.util.List<DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode> DBNode) {
            this.DBNode = DBNode;
            return this;
        }
        public java.util.List<DescribeDrdsDBClusterResponseDbInstanceDBNodesDBNode> getDBNode() {
            return this.DBNode;
        }

    }

    public static class DescribeDrdsDBClusterResponseDbInstance extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("DBInstanceStatus")
        @Validation(required = true)
        public String DBInstanceStatus;

        @NameInMap("DbInstType")
        @Validation(required = true)
        public String dbInstType;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("EngineVersion")
        @Validation(required = true)
        public String engineVersion;

        @NameInMap("RdsInstType")
        @Validation(required = true)
        public String rdsInstType;

        @NameInMap("PayType")
        @Validation(required = true)
        public String payType;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("RemainDays")
        @Validation(required = true)
        public String remainDays;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("ReadMode")
        @Validation(required = true)
        public String readMode;

        @NameInMap("Endpoints")
        @Validation(required = true)
        public DescribeDrdsDBClusterResponseDbInstanceEndpoints endpoints;

        @NameInMap("DBNodes")
        @Validation(required = true)
        public DescribeDrdsDBClusterResponseDbInstanceDBNodes DBNodes;

        public static DescribeDrdsDBClusterResponseDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseDbInstance self = new DescribeDrdsDBClusterResponseDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDBClusterResponseDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDBClusterResponseDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDBClusterResponseDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDBClusterResponseDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDBClusterResponseDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDBClusterResponseDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDBClusterResponseDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDBClusterResponseDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDBClusterResponseDbInstance setRemainDays(String remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public String getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDBClusterResponseDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDBClusterResponseDbInstance setReadMode(String readMode) {
            this.readMode = readMode;
            return this;
        }
        public String getReadMode() {
            return this.readMode;
        }

        public DescribeDrdsDBClusterResponseDbInstance setEndpoints(DescribeDrdsDBClusterResponseDbInstanceEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeDrdsDBClusterResponseDbInstanceEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeDrdsDBClusterResponseDbInstance setDBNodes(DescribeDrdsDBClusterResponseDbInstanceDBNodes DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public DescribeDrdsDBClusterResponseDbInstanceDBNodes getDBNodes() {
            return this.DBNodes;
        }

    }

}

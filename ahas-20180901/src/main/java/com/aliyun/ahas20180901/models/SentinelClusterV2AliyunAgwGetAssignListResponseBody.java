// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwGetAssignListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelClusterV2AliyunAgwGetAssignListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterV2AliyunAgwGetAssignListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwGetAssignListResponseBody self = new SentinelClusterV2AliyunAgwGetAssignListResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwGetAssignListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterV2AliyunAgwGetAssignListResponseBody setData(java.util.List<SentinelClusterV2AliyunAgwGetAssignListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelClusterV2AliyunAgwGetAssignListResponseBodyData> getData() {
        return this.data;
    }

    public SentinelClusterV2AliyunAgwGetAssignListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterV2AliyunAgwGetAssignListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterV2AliyunAgwGetAssignListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity extends TeaModel {
        @NameInMap("alive")
        public Boolean alive;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastHbTimestamp")
        public Long lastHbTimestamp;

        @NameInMap("maxAllowedQps")
        public Float maxAllowedQps;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("publicIp")
        public String publicIp;

        @NameInMap("serverHost")
        public String serverHost;

        @NameInMap("serverPort")
        public Integer serverPort;

        @NameInMap("serverType")
        public Integer serverType;

        @NameInMap("vpcId")
        public String vpcId;

        public static SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity self = new SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity();
            return TeaModel.build(map, self);
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setAlive(Boolean alive) {
            this.alive = alive;
            return this;
        }
        public Boolean getAlive() {
            return this.alive;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setLastHbTimestamp(Long lastHbTimestamp) {
            this.lastHbTimestamp = lastHbTimestamp;
            return this;
        }
        public Long getLastHbTimestamp() {
            return this.lastHbTimestamp;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setMaxAllowedQps(Float maxAllowedQps) {
            this.maxAllowedQps = maxAllowedQps;
            return this;
        }
        public Float getMaxAllowedQps() {
            return this.maxAllowedQps;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setServerHost(String serverHost) {
            this.serverHost = serverHost;
            return this;
        }
        public String getServerHost() {
            return this.serverHost;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setServerType(Integer serverType) {
            this.serverType = serverType;
            return this;
        }
        public Integer getServerType() {
            return this.serverType;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class SentinelClusterV2AliyunAgwGetAssignListResponseBodyData extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("serverEntity")
        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity serverEntity;

        @NameInMap("shardIdx")
        public Integer shardIdx;

        @NameInMap("tsNamespace")
        public String tsNamespace;

        public static SentinelClusterV2AliyunAgwGetAssignListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterV2AliyunAgwGetAssignListResponseBodyData self = new SentinelClusterV2AliyunAgwGetAssignListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyData setServerEntity(SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity serverEntity) {
            this.serverEntity = serverEntity;
            return this;
        }
        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyDataServerEntity getServerEntity() {
            return this.serverEntity;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyData setShardIdx(Integer shardIdx) {
            this.shardIdx = shardIdx;
            return this;
        }
        public Integer getShardIdx() {
            return this.shardIdx;
        }

        public SentinelClusterV2AliyunAgwGetAssignListResponseBodyData setTsNamespace(String tsNamespace) {
            this.tsNamespace = tsNamespace;
            return this;
        }
        public String getTsNamespace() {
            return this.tsNamespace;
        }

    }

}

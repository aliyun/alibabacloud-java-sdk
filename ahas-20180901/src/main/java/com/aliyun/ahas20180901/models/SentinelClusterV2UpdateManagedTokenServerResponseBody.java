// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2UpdateManagedTokenServerResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelClusterV2UpdateManagedTokenServerResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterV2UpdateManagedTokenServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2UpdateManagedTokenServerResponseBody self = new SentinelClusterV2UpdateManagedTokenServerResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2UpdateManagedTokenServerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterV2UpdateManagedTokenServerResponseBody setData(SentinelClusterV2UpdateManagedTokenServerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelClusterV2UpdateManagedTokenServerResponseBodyData getData() {
        return this.data;
    }

    public SentinelClusterV2UpdateManagedTokenServerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterV2UpdateManagedTokenServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterV2UpdateManagedTokenServerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterV2UpdateManagedTokenServerResponseBodyData extends TeaModel {
        @NameInMap("Alive")
        public Boolean alive;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastHbTimestamp")
        public Long lastHbTimestamp;

        @NameInMap("MaxAllowedQps")
        public Float maxAllowedQps;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("ServerHost")
        public String serverHost;

        @NameInMap("ServerPort")
        public Integer serverPort;

        @NameInMap("ServerType")
        public Integer serverType;

        @NameInMap("VpcId")
        public String vpcId;

        public static SentinelClusterV2UpdateManagedTokenServerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterV2UpdateManagedTokenServerResponseBodyData self = new SentinelClusterV2UpdateManagedTokenServerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setAlive(Boolean alive) {
            this.alive = alive;
            return this;
        }
        public Boolean getAlive() {
            return this.alive;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setLastHbTimestamp(Long lastHbTimestamp) {
            this.lastHbTimestamp = lastHbTimestamp;
            return this;
        }
        public Long getLastHbTimestamp() {
            return this.lastHbTimestamp;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setMaxAllowedQps(Float maxAllowedQps) {
            this.maxAllowedQps = maxAllowedQps;
            return this;
        }
        public Float getMaxAllowedQps() {
            return this.maxAllowedQps;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setServerHost(String serverHost) {
            this.serverHost = serverHost;
            return this;
        }
        public String getServerHost() {
            return this.serverHost;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setServerType(Integer serverType) {
            this.serverType = serverType;
            return this;
        }
        public Integer getServerType() {
            return this.serverType;
        }

        public SentinelClusterV2UpdateManagedTokenServerResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}

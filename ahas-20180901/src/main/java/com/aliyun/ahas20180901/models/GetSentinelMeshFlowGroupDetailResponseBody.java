// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSentinelMeshFlowGroupDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSentinelMeshFlowGroupDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSentinelMeshFlowGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSentinelMeshFlowGroupDetailResponseBody self = new GetSentinelMeshFlowGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSentinelMeshFlowGroupDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSentinelMeshFlowGroupDetailResponseBody setData(GetSentinelMeshFlowGroupDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSentinelMeshFlowGroupDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSentinelMeshFlowGroupDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSentinelMeshFlowGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSentinelMeshFlowGroupDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSentinelMeshFlowGroupDetailResponseBodyData extends TeaModel {
        @NameInMap("EnvoyRlsDomain")
        public String envoyRlsDomain;

        @NameInMap("Id")
        public Long id;

        @NameInMap("License")
        public String license;

        @NameInMap("MaxEstimatedQps")
        public Long maxEstimatedQps;

        @NameInMap("MeshType")
        public Integer meshType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerPort")
        public Integer serverPort;

        @NameInMap("UserId")
        public String userId;

        public static GetSentinelMeshFlowGroupDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSentinelMeshFlowGroupDetailResponseBodyData self = new GetSentinelMeshFlowGroupDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setEnvoyRlsDomain(String envoyRlsDomain) {
            this.envoyRlsDomain = envoyRlsDomain;
            return this;
        }
        public String getEnvoyRlsDomain() {
            return this.envoyRlsDomain;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setLicense(String license) {
            this.license = license;
            return this;
        }
        public String getLicense() {
            return this.license;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setMaxEstimatedQps(Long maxEstimatedQps) {
            this.maxEstimatedQps = maxEstimatedQps;
            return this;
        }
        public Long getMaxEstimatedQps() {
            return this.maxEstimatedQps;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setMeshType(Integer meshType) {
            this.meshType = meshType;
            return this;
        }
        public Integer getMeshType() {
            return this.meshType;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setServerPort(Integer serverPort) {
            this.serverPort = serverPort;
            return this;
        }
        public Integer getServerPort() {
            return this.serverPort;
        }

        public GetSentinelMeshFlowGroupDetailResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

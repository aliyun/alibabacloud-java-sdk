// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelMeshFlowGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSentinelMeshFlowGroupsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSentinelMeshFlowGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelMeshFlowGroupsResponseBody self = new ListSentinelMeshFlowGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSentinelMeshFlowGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSentinelMeshFlowGroupsResponseBody setData(java.util.List<ListSentinelMeshFlowGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSentinelMeshFlowGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListSentinelMeshFlowGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSentinelMeshFlowGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSentinelMeshFlowGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSentinelMeshFlowGroupsResponseBodyData extends TeaModel {
        @NameInMap("EnvoyRlsDomain")
        public String envoyRlsDomain;

        @NameInMap("Id")
        public Long id;

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

        @NameInMap("UserId")
        public String userId;

        public static ListSentinelMeshFlowGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSentinelMeshFlowGroupsResponseBodyData self = new ListSentinelMeshFlowGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSentinelMeshFlowGroupsResponseBodyData setEnvoyRlsDomain(String envoyRlsDomain) {
            this.envoyRlsDomain = envoyRlsDomain;
            return this;
        }
        public String getEnvoyRlsDomain() {
            return this.envoyRlsDomain;
        }

        public ListSentinelMeshFlowGroupsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSentinelMeshFlowGroupsResponseBodyData setMaxEstimatedQps(Long maxEstimatedQps) {
            this.maxEstimatedQps = maxEstimatedQps;
            return this;
        }
        public Long getMaxEstimatedQps() {
            return this.maxEstimatedQps;
        }

        public ListSentinelMeshFlowGroupsResponseBodyData setMeshType(Integer meshType) {
            this.meshType = meshType;
            return this;
        }
        public Integer getMeshType() {
            return this.meshType;
        }

        public ListSentinelMeshFlowGroupsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSentinelMeshFlowGroupsResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListSentinelMeshFlowGroupsResponseBodyData setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public ListSentinelMeshFlowGroupsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

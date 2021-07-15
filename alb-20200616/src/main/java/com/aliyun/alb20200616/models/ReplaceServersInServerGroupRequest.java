// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ReplaceServersInServerGroupRequest extends TeaModel {
    // 后端服务器Id
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    // 待添加后端服务器
    @NameInMap("AddedServers")
    public java.util.List<ReplaceServersInServerGroupRequestAddedServers> addedServers;

    // 待删除后端服务器
    @NameInMap("RemovedServers")
    public java.util.List<ReplaceServersInServerGroupRequestRemovedServers> removedServers;

    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    // dryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static ReplaceServersInServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceServersInServerGroupRequest self = new ReplaceServersInServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceServersInServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public ReplaceServersInServerGroupRequest setAddedServers(java.util.List<ReplaceServersInServerGroupRequestAddedServers> addedServers) {
        this.addedServers = addedServers;
        return this;
    }
    public java.util.List<ReplaceServersInServerGroupRequestAddedServers> getAddedServers() {
        return this.addedServers;
    }

    public ReplaceServersInServerGroupRequest setRemovedServers(java.util.List<ReplaceServersInServerGroupRequestRemovedServers> removedServers) {
        this.removedServers = removedServers;
        return this;
    }
    public java.util.List<ReplaceServersInServerGroupRequestRemovedServers> getRemovedServers() {
        return this.removedServers;
    }

    public ReplaceServersInServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ReplaceServersInServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class ReplaceServersInServerGroupRequestAddedServers extends TeaModel {
        // 描述信息
        @NameInMap("Description")
        public String description;

        // 后端端口号
        @NameInMap("Port")
        public Integer port;

        // 后端服务器id
        @NameInMap("ServerId")
        public String serverId;

        // 后端服务器ip
        @NameInMap("ServerIp")
        public String serverIp;

        // 后端服务器类型
        @NameInMap("ServerType")
        public String serverType;

        // 后端服务器权重
        @NameInMap("Weight")
        public Integer weight;

        public static ReplaceServersInServerGroupRequestAddedServers build(java.util.Map<String, ?> map) throws Exception {
            ReplaceServersInServerGroupRequestAddedServers self = new ReplaceServersInServerGroupRequestAddedServers();
            return TeaModel.build(map, self);
        }

        public ReplaceServersInServerGroupRequestAddedServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ReplaceServersInServerGroupRequestAddedServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ReplaceServersInServerGroupRequestAddedServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public ReplaceServersInServerGroupRequestAddedServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public ReplaceServersInServerGroupRequestAddedServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public ReplaceServersInServerGroupRequestAddedServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ReplaceServersInServerGroupRequestRemovedServers extends TeaModel {
        // 后端服务器id
        @NameInMap("ServerId")
        public String serverId;

        // 后端服务器ip
        @NameInMap("ServerIp")
        public String serverIp;

        // 后端服务器类型
        @NameInMap("ServerType")
        public String serverType;

        // 端口
        @NameInMap("Port")
        public Integer port;

        public static ReplaceServersInServerGroupRequestRemovedServers build(java.util.Map<String, ?> map) throws Exception {
            ReplaceServersInServerGroupRequestRemovedServers self = new ReplaceServersInServerGroupRequestRemovedServers();
            return TeaModel.build(map, self);
        }

        public ReplaceServersInServerGroupRequestRemovedServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public ReplaceServersInServerGroupRequestRemovedServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public ReplaceServersInServerGroupRequestRemovedServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public ReplaceServersInServerGroupRequestRemovedServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}

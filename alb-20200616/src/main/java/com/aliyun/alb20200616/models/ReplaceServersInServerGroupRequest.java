// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ReplaceServersInServerGroupRequest extends TeaModel {
    @NameInMap("AddedServers")
    public java.util.List<ReplaceServersInServerGroupRequestAddedServers> addedServers;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RemovedServers")
    public java.util.List<ReplaceServersInServerGroupRequestRemovedServers> removedServers;

    @NameInMap("ServerGroupId")
    public String serverGroupId;

    public static ReplaceServersInServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceServersInServerGroupRequest self = new ReplaceServersInServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceServersInServerGroupRequest setAddedServers(java.util.List<ReplaceServersInServerGroupRequestAddedServers> addedServers) {
        this.addedServers = addedServers;
        return this;
    }
    public java.util.List<ReplaceServersInServerGroupRequestAddedServers> getAddedServers() {
        return this.addedServers;
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

    public ReplaceServersInServerGroupRequest setRemovedServers(java.util.List<ReplaceServersInServerGroupRequestRemovedServers> removedServers) {
        this.removedServers = removedServers;
        return this;
    }
    public java.util.List<ReplaceServersInServerGroupRequestRemovedServers> getRemovedServers() {
        return this.removedServers;
    }

    public ReplaceServersInServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public static class ReplaceServersInServerGroupRequestAddedServers extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerType")
        public String serverType;

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
        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerType")
        public String serverType;

        public static ReplaceServersInServerGroupRequestRemovedServers build(java.util.Map<String, ?> map) throws Exception {
            ReplaceServersInServerGroupRequestRemovedServers self = new ReplaceServersInServerGroupRequestRemovedServers();
            return TeaModel.build(map, self);
        }

        public ReplaceServersInServerGroupRequestRemovedServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
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

    }

}

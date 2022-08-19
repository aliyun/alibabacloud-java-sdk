// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupServersAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ServerGroupId")
    public String serverGroupId;

    @NameInMap("Servers")
    public java.util.List<UpdateServerGroupServersAttributeRequestServers> servers;

    public static UpdateServerGroupServersAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServerGroupServersAttributeRequest self = new UpdateServerGroupServersAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServerGroupServersAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateServerGroupServersAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateServerGroupServersAttributeRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public UpdateServerGroupServersAttributeRequest setServers(java.util.List<UpdateServerGroupServersAttributeRequestServers> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.List<UpdateServerGroupServersAttributeRequestServers> getServers() {
        return this.servers;
    }

    public static class UpdateServerGroupServersAttributeRequestServers extends TeaModel {
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

        public static UpdateServerGroupServersAttributeRequestServers build(java.util.Map<String, ?> map) throws Exception {
            UpdateServerGroupServersAttributeRequestServers self = new UpdateServerGroupServersAttributeRequestServers();
            return TeaModel.build(map, self);
        }

        public UpdateServerGroupServersAttributeRequestServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateServerGroupServersAttributeRequestServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateServerGroupServersAttributeRequestServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public UpdateServerGroupServersAttributeRequestServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public UpdateServerGroupServersAttributeRequestServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public UpdateServerGroupServersAttributeRequestServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}

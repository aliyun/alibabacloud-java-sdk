// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-atstuj3rtoptyui****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Servers")
    public java.util.List<RemoveServersFromServerGroupRequestServers> servers;

    public static RemoveServersFromServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveServersFromServerGroupRequest self = new RemoveServersFromServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveServersFromServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveServersFromServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RemoveServersFromServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public RemoveServersFromServerGroupRequest setServers(java.util.List<RemoveServersFromServerGroupRequestServers> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.List<RemoveServersFromServerGroupRequestServers> getServers() {
        return this.servers;
    }

    public static class RemoveServersFromServerGroupRequestServers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6081</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <strong>example:</strong>
         * <p>192.168.xxx.xxx</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        public static RemoveServersFromServerGroupRequestServers build(java.util.Map<String, ?> map) throws Exception {
            RemoveServersFromServerGroupRequestServers self = new RemoveServersFromServerGroupRequestServers();
            return TeaModel.build(map, self);
        }

        public RemoveServersFromServerGroupRequestServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public RemoveServersFromServerGroupRequestServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public RemoveServersFromServerGroupRequestServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public RemoveServersFromServerGroupRequestServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddServersToServerGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request, but does not add a backend server to a server group. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The server group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-atstuj3rtop****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Servers")
    public java.util.List<AddServersToServerGroupRequestServers> servers;

    public static AddServersToServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddServersToServerGroupRequest self = new AddServersToServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddServersToServerGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddServersToServerGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AddServersToServerGroupRequest setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }
    public String getServerGroupId() {
        return this.serverGroupId;
    }

    public AddServersToServerGroupRequest setServers(java.util.List<AddServersToServerGroupRequestServers> servers) {
        this.servers = servers;
        return this;
    }
    public java.util.List<AddServersToServerGroupRequestServers> getServers() {
        return this.servers;
    }

    public static class AddServersToServerGroupRequestServers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        @NameInMap("RemoteIpEnabled")
        public Boolean remoteIpEnabled;

        /**
         * <strong>example:</strong>
         * <p>ecs-123</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static AddServersToServerGroupRequestServers build(java.util.Map<String, ?> map) throws Exception {
            AddServersToServerGroupRequestServers self = new AddServersToServerGroupRequestServers();
            return TeaModel.build(map, self);
        }

        public AddServersToServerGroupRequestServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddServersToServerGroupRequestServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddServersToServerGroupRequestServers setRemoteIpEnabled(Boolean remoteIpEnabled) {
            this.remoteIpEnabled = remoteIpEnabled;
            return this;
        }
        public Boolean getRemoteIpEnabled() {
            return this.remoteIpEnabled;
        }

        public AddServersToServerGroupRequestServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public AddServersToServerGroupRequestServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public AddServersToServerGroupRequestServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public AddServersToServerGroupRequestServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}

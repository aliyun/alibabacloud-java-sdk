// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupRequest extends TeaModel {
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
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
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
     * <p>The backend servers that you want to remove from the server group. You can specify up to 40 backend servers in each call.</p>
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
         * <p>The port that is used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify at most 40 servers in each call.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>ServerType</strong> parameter is set to <strong>Ecs</strong>, <strong>Eni</strong>, <strong>Eci</strong>, or <strong>Ip</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The backend server ID. You can specify up to 40 server IDs in each call.</p>
         * <ul>
         * <li>If the server group type is <strong>Instance</strong>, set the ServerId parameter to the ID of an ECS instance, an ENI, or an elastic container instance. These backend servers are specified by <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong>.</li>
         * <li>If the server group type is <strong>Ip</strong>, set the ServerId parameter to an IP address specified in the server group.</li>
         * <li>If the server group type is <strong>Fc</strong>, set the ServerId parameter to the ARN of a function specified in the server group.</li>
         * </ul>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query information about the server group type so that you can set ServerId to a proper value.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1f9kdprbgy9uiu****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address in inclusive ENI mode. You can specify at most 40 servers in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server. You can specify at most 40 servers in each call. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong></li>
         * <li><strong>Eni</strong></li>
         * <li><strong>Eci</strong></li>
         * <li><strong>Ip</strong></li>
         * <li><strong>Fc</strong></li>
         * </ul>
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

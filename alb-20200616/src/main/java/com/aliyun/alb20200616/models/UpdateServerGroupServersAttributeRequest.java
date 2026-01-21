// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupServersAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <p>This parameter is required.</p>
     */
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

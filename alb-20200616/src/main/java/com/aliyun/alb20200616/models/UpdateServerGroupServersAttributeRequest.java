// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateServerGroupServersAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The value of **RequestId** for each API request is different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The server group ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The backend servers that you want to add to the server group. You can specify up to 40 servers in each call.</p>
     * <br>
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
         * <p>The description of the backend server. The description must be 2 to 256 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), commas (,), semicolons (;), forward slashes (/), and at signs (@). You can specify at most 40 servers in each call.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the backend server. Valid values: **1** to **65535**. You can specify at most 40 servers in each call.</p>
         * <br>
         * <p>> You do not need to set this parameter if **ServerType** is set to **Fc**.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend server. You can specify up to 40 server IDs in each call.</p>
         * <br>
         * <p>*   If **ServerType** is set to **Ecs**, **Eni**, or **Eci**, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance.</p>
         * <p>*   If **ServerType** is set to **Ip**, set the ServerId parameter to an IP address.</p>
         * <p>*   If **ServerType** is set to **Fc**, set the ServerId parameter to the Alibaba Cloud Resource Name (ARN) of a function.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address in inclusive ENI mode. You can specify at most 40 servers in each call.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server. You can specify at most 40 servers in each call. Valid values:</p>
         * <br>
         * <p>*   **Ecs**</p>
         * <p>*   **Eni**</p>
         * <p>*   **Eci**</p>
         * <p>*   **Ip**</p>
         * <p>*   **Fc**</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The weight of the backend server. Valid values: **0** to **100**. Default value: **100**. If the weight of a backend server is set to **0**, no requests are forwarded to the backend server. You can specify at most 40 servers in each call.</p>
         * <br>
         * <p>> You do not need to set this parameter if **ServerType** is set to **Fc**.</p>
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

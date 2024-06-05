// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class RemoveServersFromServerGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
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
     * <p>The backend servers that you want to remove from the server group. You can specify up to 40 backend servers in each call.</p>
     * <br>
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
         * <p>The port that is used by the backend server. Valid values: **1** to **65535**. You can specify at most 40 servers in each call.</p>
         * <br>
         * <p>> This parameter is required if the **ServerType** parameter is set to **Ecs**, **Eni**, **Eci**, or **Ip**.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The backend server ID. You can specify up to 40 server IDs in each call.</p>
         * <br>
         * <p>*   If the server group type is **Instance**, set the ServerId parameter to the ID of an ECS instance, an ENI, or an elastic container instance. These backend servers are specified by **Ecs**, **Eni**, or **Eci**.</p>
         * <p>*   If the server group type is **Ip**, set the ServerId parameter to an IP address specified in the server group.</p>
         * <p>*   If the server group type is **Fc**, set the ServerId parameter to the ARN of a function specified in the server group.</p>
         * <br>
         * <p>> You can call the [ListServerGroups](https://help.aliyun.com/document_detail/213627.html) operation to query information about the server group type so that you can set ServerId to a proper value.</p>
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

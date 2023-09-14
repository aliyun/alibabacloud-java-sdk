// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ReplaceServersInServerGroupRequest extends TeaModel {
    /**
     * <p>The backend servers that you want to add to the server group. You can specify up to 40 backend servers in each call.</p>
     */
    @NameInMap("AddedServers")
    public java.util.List<ReplaceServersInServerGroupRequestAddedServers> addedServers;

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
     * <p>*   **true**: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx` HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The backend servers that you want to remove.</p>
     */
    @NameInMap("RemovedServers")
    public java.util.List<ReplaceServersInServerGroupRequestRemovedServers> removedServers;

    /**
     * <p>The ID of the server group.</p>
     * <br>
     * <p>> You cannot perform this operation on a server group of the Function type.</p>
     */
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
        /**
         * <p>The description of the backend server. The description must be 2 to 256 characters in length, and can contain letters, digits, periods (.), underscores (\_), hyphens (-), commas (,), semicolons (;), forward slashes (/), and at signs (@). You can specify at most 40 servers in each call.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the server group. Valid values: **1** to **65535**. You can specify at most 40 servers in each call.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend server. You can specify up to 40 server IDs in each call.</p>
         * <br>
         * <p>*   If the server group type is **Instance**, set the ServerId parameter to the ID of an ECS instance, an ENI, or an elastic container instance. These backend servers are specified by **Ecs**, **Eni**, or **Eci**.</p>
         * <p>*   If the server group type is **Ip**, set the ServerId parameter to an IP address specified in the server group.</p>
         * <br>
         * <p>> You cannot perform this operation on a server group of the Function type. You can call the [ListServerGroups](~~213627~~) operation to query information about the server group type so that you can set ServerId to a proper value.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address in inclusive ENI mode. You can specify at most 40 servers in each call.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server that you want to remove from the server group. You can specify up to 40 backend servers in each call. Valid values:</p>
         * <br>
         * <p>*   **Ecs**</p>
         * <p>*   **Eni**</p>
         * <p>*   **Eci**</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The weight of the backend server that you want to add to the server group. You can specify up to 40 backend servers in each call.</p>
         * <br>
         * <p>Valid values: **0** to **100**. Default value: **100**. If the weight of a backend server is set to **0**, no requests are forwarded to the backend server.</p>
         */
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
        /**
         * <p>The port that is used by the backend server. Valid values: **1** to **65535**. You can specify at most 40 servers in each call.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend server. You can specify up to 40 server IDs in each call.</p>
         * <br>
         * <p>*   If the server group type is **Instance**, set the ServerId parameter to the ID of an ECS instance, an ENI, or an elastic container instance. These backend servers are specified by **Ecs**, **Eni**, or **Eci**.</p>
         * <p>*   If the server group type is **Ip**, set the ServerId parameter to an IP address specified in the server group.</p>
         * <br>
         * <p>> You cannot perform this operation on a server group of the Function type. You can call the [ListServerGroups](~~213627~~) operation to query information about the server group type so that you can set ServerId to a proper value.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address in inclusive ENI mode. You can specify at most 40 servers in each call.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server that you want to remove from the server group. You can specify up to 40 backend servers in each call. Valid values:</p>
         * <br>
         * <p>*   **Ecs**</p>
         * <p>*   **Eni**</p>
         * <p>*   **Eci**</p>
         */
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

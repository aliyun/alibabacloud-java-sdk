// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ReplaceServersInServerGroupRequest extends TeaModel {
    /**
     * <p>The backend servers that you want to add to the server group. You can specify up to 40 backend servers in each call.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddedServers")
    public java.util.List<ReplaceServersInServerGroupRequestAddedServers> addedServers;

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
     * <li><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <code>2xx</code> HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The backend servers that you want to remove.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemovedServers")
    public java.util.List<ReplaceServersInServerGroupRequestRemovedServers> removedServers;

    /**
     * <p>The ID of the server group.</p>
     * <blockquote>
     * <p>You cannot perform this operation on a server group of the Function type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-5114d593o96qxy****</p>
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
         * <p>The description of the backend server. The description must be 2 to 256 characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), commas (,), semicolons (;), forward slashes (/), and at signs (@). You can specify at most 40 servers in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the server group. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify at most 40 servers in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend server. You can specify up to 40 server IDs in each call.</p>
         * <ul>
         * <li>If the server group type is <strong>Instance</strong>, set the ServerId parameter to the ID of an ECS instance, an ENI, or an elastic container instance. These backend servers are specified by <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong>.</li>
         * <li>If the server group type is <strong>Ip</strong>, set the ServerId parameter to an IP address specified in the server group.</li>
         * </ul>
         * <blockquote>
         * <p>You cannot perform this operation on a server group of the Function type. You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query information about the server group type so that you can set ServerId to a proper value.</p>
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
         * <p>The type of the backend server that you want to remove from the server group. You can specify up to 40 backend servers in each call. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong></li>
         * <li><strong>Eni</strong></li>
         * <li><strong>Eci</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The weight of the backend server that you want to add to the server group. You can specify up to 40 backend servers in each call.</p>
         * <p>Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If the weight of a backend server is set to <strong>0</strong>, no requests are forwarded to the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The port that is used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify at most 40 servers in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend server. You can specify up to 40 server IDs in each call.</p>
         * <ul>
         * <li>If the server group type is <strong>Instance</strong>, set the ServerId parameter to the ID of an ECS instance, an ENI, or an elastic container instance. These backend servers are specified by <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong>.</li>
         * <li>If the server group type is <strong>Ip</strong>, set the ServerId parameter to an IP address specified in the server group.</li>
         * </ul>
         * <blockquote>
         * <p>You cannot perform this operation on a server group of the Function type. You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query information about the server group type so that you can set ServerId to a proper value.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-bp1ac9uozods2uc****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address in inclusive ENI mode. You can specify at most 40 servers in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.12</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server that you want to remove from the server group. You can specify up to 40 backend servers in each call. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong></li>
         * <li><strong>Eni</strong></li>
         * <li><strong>Eci</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
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

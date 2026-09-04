// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ReplaceServersInServerGroupRequest extends TeaModel {
    /**
     * <p>The list of backend servers to add. You can specify up to 200 servers in a single request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AddedServers")
    public java.util.List<ReplaceServersInServerGroupRequestAddedServers> addedServers;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without replacing backend servers in the server group. The system checks the required parameters, request syntax, and business limitations. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the check succeeds, an <code>HTTP 2xx</code> status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The backend servers to remove.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemovedServers")
    public java.util.List<ReplaceServersInServerGroupRequestRemovedServers> removedServers;

    /**
     * <p>The server group ID.</p>
     * <blockquote>
     * <p>Server groups of the Function Compute type do not support replacing backend servers.</p>
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
         * <p>The description of the backend server. The description must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the backend server group. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify up to 200 servers in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The backend server ID. You can specify up to 200 servers in a single request.</p>
         * <ul>
         * <li><p>If the server group type is <strong>Instance</strong>, set this parameter to the ID of an <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> resource.</p>
         * </li>
         * <li><p>If the server group type is <strong>Ip</strong>, set this parameter to an IP address.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Server groups of the Function Compute type do not support replacing backend servers. You can call <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> to query the server group type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-bp1f9kdprbgy9uiu****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address.</p>
         * <p>If <strong>ServerType</strong> is set to <strong>Eni</strong>, you can specify the primary private IP address or a secondary private IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The backend server type. You can specify up to 200 servers in a single call. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong>: ECS instance.</li>
         * <li><strong>Eni</strong>: ENI network interface controller (NIC) instance.</li>
         * <li><strong>Eci</strong>: ECI elastic container.</li>
         * <li><strong>Ip</strong>: IP address.</li>
         * <li><strong>Fc</strong>: Function Compute.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The weight of the backend server. You can specify up to 200 servers in a single request.</p>
         * <p>Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If the weight is set to <strong>0</strong>, no requests are forwarded to the backend server.</p>
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
         * <p>The port used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify up to 200 servers in a single request.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The backend server ID. You can specify up to 200 servers in a single request.</p>
         * <ul>
         * <li><p>If the server group type is <strong>Instance</strong>, set this parameter to the ID of an <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> resource.</p>
         * </li>
         * <li><p>If the server group type is <strong>Ip</strong>, set this parameter to an IP address.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Server groups of the Function Compute type do not support replacing backend servers. You can call <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> to query the server group type.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1f9kdprbgy9uiu****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address.</p>
         * <p>If <strong>ServerType</strong> is set to <strong>Eni</strong>, you can specify the primary private IP address or a secondary private IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.12</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The backend server type. You can specify up to 200 servers in a single call. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong>: ECS instance.</li>
         * <li><strong>Eni</strong>: ENI network interface controller (NIC) instance.</li>
         * <li><strong>Eci</strong>: ECI elastic container.</li>
         * <li><strong>Ip</strong>: IP address.</li>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AddServersToServerGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request and does not add the backend servers to the server group. The system checks whether the required parameters are specified, the request format, and the service limits. If the request fails the check, the corresponding error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request. After the request passes the check, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the server group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sgp-atstuj3rtop****</p>
     */
    @NameInMap("ServerGroupId")
    public String serverGroupId;

    /**
     * <p>The list of backend servers. You can add up to 200 servers in a single call.</p>
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
         * <p>The description of the backend server. The description must be 2 to 256 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>. You can add up to 200 servers in a single call.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>ServerType</strong> is set to <strong>Ecs</strong>, <strong>Eni</strong>, <strong>Eci</strong>, or <strong>Ip</strong>. This parameter is not required when <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Specifies whether to enable the remote IP address feature. You can add up to 200 servers in a single call. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong>: disables the feature.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>ServerType</strong> is set to <strong>Ip</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RemoteIpEnabled")
        public Boolean remoteIpEnabled;

        /**
         * <p>The ID of the backend server. You can add up to 200 servers in a single call.</p>
         * <ul>
         * <li><p>If the server group is of the <strong>Instance</strong> type, this parameter specifies the ID of an <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong> resource.</p>
         * </li>
         * <li><p>If the server group is of the <strong>Ip</strong> type, this parameter specifies an IP address.</p>
         * </li>
         * <li><p>If the server group is of the <strong>Fc</strong> type, this parameter specifies the ARN of the Function Compute resource.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-uf616vu8me******</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The specified IP address. You can add up to 200 servers in a single call.</p>
         * <p>If <strong>ServerType</strong> is set to <strong>Eni</strong>, you can specify the primary or secondary private IP address of the ENI.</p>
         * <blockquote>
         * <p>This parameter is not required when <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The backend server type. You can add up to 200 servers each time you invoke the operation. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong>: ECS instance.</li>
         * <li><strong>Eni</strong>: elastic network interfaces (ENIs) or network interface controller (NIC).</li>
         * <li><strong>Eci</strong>: Elastic Container Instance (ECI).</li>
         * <li><strong>Ip</strong>: IP address.</li>
         * <li><strong>Fc</strong>: Function Compute.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If the weight is set to <strong>0</strong>, no requests are forwarded to the backend server. You can add up to 200 servers in a single call.</p>
         * <blockquote>
         * <p>This parameter is not required when <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
         * </blockquote>
         * 
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

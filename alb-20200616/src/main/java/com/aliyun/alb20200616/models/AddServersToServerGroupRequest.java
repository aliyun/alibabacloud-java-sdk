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
     * <p>The backend servers that you want to add to the server group. You can specify up to 40 backend servers in each call.</p>
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
         * <p>The description of the backend server. The description must be 2 to 256 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), commas (,), semicolons (;), forward slashes (/), and at signs (@). You can specify up to 40 servers in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port used by the backend server. Valid values: <strong>1</strong> to <strong>65535</strong>. You can specify up to 40 server IDs in each call.</p>
         * <blockquote>
         * <p>This parameter is required if the <strong>ServerType</strong> parameter is set to <strong>Ecs</strong>, <strong>Eni</strong>, <strong>Eci</strong>, or <strong>Ip</strong>. You do not need to set this parameter if <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Specifies whether to enable the remote IP address feature. You can specify up to 40 server IDs in each call. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>Regions that support the remote IP address feature: China (Hangzhou), China (Shenzhen), China (Qingdao), China (Beijing), China (Zhangjiakou), China (Ulanqab), China (Shanghai), China (Chengdu), China (Guangzhou), China (Hong Kong), US (Virginia), Japan (Tokyo), UK (London), US (Silicon Valley), Germany (Frankfurt), Indonesia (Jakarta), Singapore, Malaysia (Kuala Lumpur), Australia (Sydney), and India (Mumbai).</p>
         * <blockquote>
         * <p>If <strong>ServerType</strong> is set to <strong>Ip</strong>, this parameter is available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RemoteIpEnabled")
        public Boolean remoteIpEnabled;

        /**
         * <p>The backend server ID. You can specify up to 40 server IDs in each call.</p>
         * <ul>
         * <li>If ServerType is set to <strong>Instance</strong>, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by <strong>Ecs</strong>, <strong>Eni</strong>, or <strong>Eci</strong>.</li>
         * <li>If ServerType is set to <strong>Ip</strong>, set the ServerId parameter to an IP address specified in the server group.</li>
         * <li>If the backend server group is of the <strong>Fc</strong> type, set this parameter to the Alibaba Cloud Resource Name (ARN) of a function.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-bp67acfmxazb4p****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address in inclusive ENI mode. You can specify up to 40 server IDs in each call.</p>
         * <blockquote>
         * <p>You do not need to set this parameter if <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The type of the backend server that you want to add to the server group. You can specify up to 40 server IDs in each call. Valid values:</p>
         * <ul>
         * <li><strong>Ecs</strong></li>
         * <li><strong>Eni</strong></li>
         * <li><strong>Eci</strong></li>
         * <li><strong>Ip</strong></li>
         * <li><strong>fc</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If the weight of a backend server is set to <strong>0</strong>, no requests are forwarded to the backend server. You can specify up to 40 server IDs in each call.</p>
         * <blockquote>
         * <p>You do not need to set this parameter if <strong>ServerType</strong> is set to <strong>Fc</strong>.</p>
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

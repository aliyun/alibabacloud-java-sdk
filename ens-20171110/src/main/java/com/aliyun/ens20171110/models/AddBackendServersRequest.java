// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to add. You can add at most 20 backend servers.</p>
     * <blockquote>
     * <p> Only ENS instances that are in the running state can be attached to the ELB instance as backend servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackendServers")
    public java.util.List<AddBackendServersRequestBackendServers> backendServers;

    /**
     * <p>The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5qzdmxefgrpxd7oz2mefonvtx</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static AddBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBackendServersRequest self = new AddBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public AddBackendServersRequest setBackendServers(java.util.List<AddBackendServersRequestBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<AddBackendServersRequestBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public AddBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static class AddBackendServersRequestBackendServers extends TeaModel {
        /**
         * <p>The IP address of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The backend port that is used by the ELB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3309</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the ENS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5uf6dwyzch3wly790****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The type of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>ens</strong>: ENS instance.</li>
         * <li><strong>eni</strong>: ENI.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ens</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the backend server. Default value: 100. Valid values: <strong>0</strong> to <strong>100</strong>.</p>
         * <blockquote>
         * <p> The value 0 indicates that requests are not forwarded to the backend server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static AddBackendServersRequestBackendServers build(java.util.Map<String, ?> map) throws Exception {
            AddBackendServersRequestBackendServers self = new AddBackendServersRequestBackendServers();
            return TeaModel.build(map, self);
        }

        public AddBackendServersRequestBackendServers setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public AddBackendServersRequestBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddBackendServersRequestBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public AddBackendServersRequestBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddBackendServersRequestBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}

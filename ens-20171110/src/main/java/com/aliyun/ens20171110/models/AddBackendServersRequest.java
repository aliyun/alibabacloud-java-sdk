// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to add. You can add at most 20 backend servers.</p>
     * <br>
     * <p>>  Only ENS instances that are in the running state can be attached to the ELB instance as backend servers.</p>
     */
    @NameInMap("BackendServers")
    public java.util.List<AddBackendServersRequestBackendServers> backendServers;

    /**
     * <p>The frontend port that is used by the Edge Load Balance (ELB) instance. Valid values: **1** to **65535**.</p>
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
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The backend port that is used by the ELB instance.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the ENS instance.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The type of the backend server. Valid values:</p>
         * <br>
         * <p>*   **ens**: ENS instance.</p>
         * <p>*   **eni**: ENI.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the backend server. Default value: 100. Valid values: **0** to **100**.</p>
         * <br>
         * <p>>  The value 0 indicates that requests are not forwarded to the backend server.</p>
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

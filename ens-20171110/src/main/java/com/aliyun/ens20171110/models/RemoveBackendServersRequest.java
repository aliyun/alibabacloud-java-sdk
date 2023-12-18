// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to add. You can add at most 20 backend servers.</p>
     * <br>
     * <p>>  Only ENS instances that are in the running state can be attached to the ELB instance as backend servers.</p>
     */
    @NameInMap("BackendServers")
    public java.util.List<RemoveBackendServersRequestBackendServers> backendServers;

    /**
     * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static RemoveBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackendServersRequest self = new RemoveBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBackendServersRequest setBackendServers(java.util.List<RemoveBackendServersRequestBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<RemoveBackendServersRequestBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public RemoveBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static class RemoveBackendServersRequestBackendServers extends TeaModel {
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
         * <p>The ID of the instance that is used as the backend server.</p>
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

        public static RemoveBackendServersRequestBackendServers build(java.util.Map<String, ?> map) throws Exception {
            RemoveBackendServersRequestBackendServers self = new RemoveBackendServersRequestBackendServers();
            return TeaModel.build(map, self);
        }

        public RemoveBackendServersRequestBackendServers setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public RemoveBackendServersRequestBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public RemoveBackendServersRequestBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public RemoveBackendServersRequestBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RemoveBackendServersRequestBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}

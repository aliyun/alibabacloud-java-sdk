// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to add. You can add at most 20 backend servers.</p>
     * <br>
     * <p>>  Only ENS instances that are in the running state can be attached to the ELB instance as backend servers.</p>
     */
    @NameInMap("BackendServers")
    public java.util.List<SetBackendServersRequestBackendServers> backendServers;

    /**
     * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static SetBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBackendServersRequest self = new SetBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public SetBackendServersRequest setBackendServers(java.util.List<SetBackendServersRequestBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<SetBackendServersRequestBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public SetBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public static class SetBackendServersRequestBackendServers extends TeaModel {
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

        public static SetBackendServersRequestBackendServers build(java.util.Map<String, ?> map) throws Exception {
            SetBackendServersRequestBackendServers self = new SetBackendServersRequestBackendServers();
            return TeaModel.build(map, self);
        }

        public SetBackendServersRequestBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public SetBackendServersRequestBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SetBackendServersRequestBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}

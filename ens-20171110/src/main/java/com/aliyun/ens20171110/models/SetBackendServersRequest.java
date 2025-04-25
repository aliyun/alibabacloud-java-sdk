// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you added. You can modify the weights of up to 20 backend servers in each request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackendServers")
    public java.util.List<SetBackendServersRequestBackendServers> backendServers;

    /**
     * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-5s7crik3yo3bp03gqrbp5****</p>
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
         * <p>The ID of the instance that you use as the backend server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5ze0o05xccvbljtn****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The type of the backend server. Valid values:</p>
         * <ul>
         * <li><strong>ens</strong>: ENS instance</li>
         * <li><strong>eni</strong>: elastic network interface (ENI)</li>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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

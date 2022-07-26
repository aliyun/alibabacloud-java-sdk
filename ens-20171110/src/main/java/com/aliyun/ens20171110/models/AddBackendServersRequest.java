// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersRequest extends TeaModel {
    @NameInMap("BackendServers")
    public java.util.List<AddBackendServersRequestBackendServers> backendServers;

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
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Type")
        public String type;

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

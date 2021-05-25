// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveBackendServersRequest extends TeaModel {
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("BackendServers")
    public java.util.List<RemoveBackendServersRequestBackendServers> backendServers;

    public static RemoveBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackendServersRequest self = new RemoveBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public RemoveBackendServersRequest setBackendServers(java.util.List<RemoveBackendServersRequestBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<RemoveBackendServersRequestBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class RemoveBackendServersRequestBackendServers extends TeaModel {
        @NameInMap("ServerId")
        public String serverId;

        // 后端服务器的权重。  取值：0~100  默认值为100，如果值为0，则不会将请求转发给该后端服务器。
        @NameInMap("Weight")
        public Integer weight;

        // 后端服务器类型。  ens：ENS实例（默认）
        @NameInMap("Type")
        public String type;

        @NameInMap("Ip")
        public String ip;

        // 端口
        @NameInMap("Port")
        public Integer port;

        public static RemoveBackendServersRequestBackendServers build(java.util.Map<String, ?> map) throws Exception {
            RemoveBackendServersRequestBackendServers self = new RemoveBackendServersRequestBackendServers();
            return TeaModel.build(map, self);
        }

        public RemoveBackendServersRequestBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public RemoveBackendServersRequestBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public RemoveBackendServersRequestBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetBackendServersRequest extends TeaModel {
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("BackendServers")
    public java.util.List<SetBackendServersRequestBackendServers> backendServers;

    public static SetBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBackendServersRequest self = new SetBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public SetBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetBackendServersRequest setBackendServers(java.util.List<SetBackendServersRequestBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<SetBackendServersRequestBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class SetBackendServersRequestBackendServers extends TeaModel {
        @NameInMap("ServerId")
        public String serverId;

        // 后端服务器的权重。  取值：0~100  默认值为100，如果值为0，则不会将请求转发给该后端服务器。
        @NameInMap("Weight")
        public Integer weight;

        // 后端服务器类型。  ens：ENS实例（默认）
        @NameInMap("Type")
        public String type;

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

        public SetBackendServersRequestBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public SetBackendServersRequestBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SetBackendServersResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackendServers")
    public SetBackendServersResponseBodyBackendServers backendServers;

    public static SetBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetBackendServersResponseBody self = new SetBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public SetBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetBackendServersResponseBody setBackendServers(SetBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public SetBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public static class SetBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Type")
        public String type;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public Integer port;

        public static SetBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            SetBackendServersResponseBodyBackendServersBackendServer self = new SetBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class SetBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<SetBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static SetBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            SetBackendServersResponseBodyBackendServers self = new SetBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public SetBackendServersResponseBodyBackendServers setBackendServer(java.util.List<SetBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<SetBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}

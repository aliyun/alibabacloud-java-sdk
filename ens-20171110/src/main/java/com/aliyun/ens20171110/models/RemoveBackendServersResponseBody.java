// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RemoveBackendServersResponseBody extends TeaModel {
    @NameInMap("BackendServers")
    public RemoveBackendServersResponseBodyBackendServers backendServers;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackendServersResponseBody self = new RemoveBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveBackendServersResponseBody setBackendServers(RemoveBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public RemoveBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public RemoveBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
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

        public static RemoveBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            RemoveBackendServersResponseBodyBackendServersBackendServer self = new RemoveBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class RemoveBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<RemoveBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static RemoveBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            RemoveBackendServersResponseBodyBackendServers self = new RemoveBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public RemoveBackendServersResponseBodyBackendServers setBackendServer(java.util.List<RemoveBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<RemoveBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}

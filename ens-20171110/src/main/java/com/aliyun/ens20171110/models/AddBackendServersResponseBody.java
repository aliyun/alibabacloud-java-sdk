// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddBackendServersResponseBody extends TeaModel {
    /**
     * <p>The list of backend servers that you want to add. You can add at most 20 backend servers.</p>
     * <br>
     * <p>>  Only ENS instances that are in the running state can be attached to the ELB instance as backend servers.</p>
     */
    @NameInMap("BackendServers")
    public AddBackendServersResponseBodyBackendServers backendServers;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBackendServersResponseBody self = new AddBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBackendServersResponseBody setBackendServers(AddBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public AddBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public AddBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
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

        public static AddBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            AddBackendServersResponseBodyBackendServersBackendServer self = new AddBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class AddBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<AddBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static AddBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            AddBackendServersResponseBodyBackendServers self = new AddBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public AddBackendServersResponseBodyBackendServers setBackendServer(java.util.List<AddBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<AddBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}

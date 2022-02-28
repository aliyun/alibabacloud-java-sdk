// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class UpgradeSitePairResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Gateways")
    public UpgradeSitePairResponseBodyGateways gateways;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Servers")
    public UpgradeSitePairResponseBodyServers servers;

    @NameInMap("Success")
    public Boolean success;

    public static UpgradeSitePairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSitePairResponseBody self = new UpgradeSitePairResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeSitePairResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeSitePairResponseBody setGateways(UpgradeSitePairResponseBodyGateways gateways) {
        this.gateways = gateways;
        return this;
    }
    public UpgradeSitePairResponseBodyGateways getGateways() {
        return this.gateways;
    }

    public UpgradeSitePairResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeSitePairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeSitePairResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpgradeSitePairResponseBody setServers(UpgradeSitePairResponseBodyServers servers) {
        this.servers = servers;
        return this;
    }
    public UpgradeSitePairResponseBodyServers getServers() {
        return this.servers;
    }

    public UpgradeSitePairResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeSitePairResponseBodyGatewaysGateway extends TeaModel {
        @NameInMap("Errno")
        public String errno;

        @NameInMap("GatewayId")
        public String gatewayId;

        public static UpgradeSitePairResponseBodyGatewaysGateway build(java.util.Map<String, ?> map) throws Exception {
            UpgradeSitePairResponseBodyGatewaysGateway self = new UpgradeSitePairResponseBodyGatewaysGateway();
            return TeaModel.build(map, self);
        }

        public UpgradeSitePairResponseBodyGatewaysGateway setErrno(String errno) {
            this.errno = errno;
            return this;
        }
        public String getErrno() {
            return this.errno;
        }

        public UpgradeSitePairResponseBodyGatewaysGateway setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

    }

    public static class UpgradeSitePairResponseBodyGateways extends TeaModel {
        @NameInMap("gateway")
        public java.util.List<UpgradeSitePairResponseBodyGatewaysGateway> gateway;

        public static UpgradeSitePairResponseBodyGateways build(java.util.Map<String, ?> map) throws Exception {
            UpgradeSitePairResponseBodyGateways self = new UpgradeSitePairResponseBodyGateways();
            return TeaModel.build(map, self);
        }

        public UpgradeSitePairResponseBodyGateways setGateway(java.util.List<UpgradeSitePairResponseBodyGatewaysGateway> gateway) {
            this.gateway = gateway;
            return this;
        }
        public java.util.List<UpgradeSitePairResponseBodyGatewaysGateway> getGateway() {
            return this.gateway;
        }

    }

    public static class UpgradeSitePairResponseBodyServersServer extends TeaModel {
        @NameInMap("Errno")
        public String errno;

        @NameInMap("ServerId")
        public String serverId;

        public static UpgradeSitePairResponseBodyServersServer build(java.util.Map<String, ?> map) throws Exception {
            UpgradeSitePairResponseBodyServersServer self = new UpgradeSitePairResponseBodyServersServer();
            return TeaModel.build(map, self);
        }

        public UpgradeSitePairResponseBodyServersServer setErrno(String errno) {
            this.errno = errno;
            return this;
        }
        public String getErrno() {
            return this.errno;
        }

        public UpgradeSitePairResponseBodyServersServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class UpgradeSitePairResponseBodyServers extends TeaModel {
        @NameInMap("server")
        public java.util.List<UpgradeSitePairResponseBodyServersServer> server;

        public static UpgradeSitePairResponseBodyServers build(java.util.Map<String, ?> map) throws Exception {
            UpgradeSitePairResponseBodyServers self = new UpgradeSitePairResponseBodyServers();
            return TeaModel.build(map, self);
        }

        public UpgradeSitePairResponseBodyServers setServer(java.util.List<UpgradeSitePairResponseBodyServersServer> server) {
            this.server = server;
            return this;
        }
        public java.util.List<UpgradeSitePairResponseBodyServersServer> getServer() {
            return this.server;
        }

    }

}

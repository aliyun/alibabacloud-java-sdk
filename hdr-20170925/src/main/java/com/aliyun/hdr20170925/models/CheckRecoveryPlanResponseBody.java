// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CheckRecoveryPlanResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Servers")
    public CheckRecoveryPlanResponseBodyServers servers;

    @NameInMap("Success")
    public Boolean success;

    public static CheckRecoveryPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryPlanResponseBody self = new CheckRecoveryPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRecoveryPlanResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckRecoveryPlanResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckRecoveryPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckRecoveryPlanResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public CheckRecoveryPlanResponseBody setServers(CheckRecoveryPlanResponseBodyServers servers) {
        this.servers = servers;
        return this;
    }
    public CheckRecoveryPlanResponseBodyServers getServers() {
        return this.servers;
    }

    public CheckRecoveryPlanResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckRecoveryPlanResponseBodyServersServer extends TeaModel {
        @NameInMap("Errno")
        public String errno;

        @NameInMap("ServerId")
        public String serverId;

        public static CheckRecoveryPlanResponseBodyServersServer build(java.util.Map<String, ?> map) throws Exception {
            CheckRecoveryPlanResponseBodyServersServer self = new CheckRecoveryPlanResponseBodyServersServer();
            return TeaModel.build(map, self);
        }

        public CheckRecoveryPlanResponseBodyServersServer setErrno(String errno) {
            this.errno = errno;
            return this;
        }
        public String getErrno() {
            return this.errno;
        }

        public CheckRecoveryPlanResponseBodyServersServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class CheckRecoveryPlanResponseBodyServers extends TeaModel {
        @NameInMap("server")
        public java.util.List<CheckRecoveryPlanResponseBodyServersServer> server;

        public static CheckRecoveryPlanResponseBodyServers build(java.util.Map<String, ?> map) throws Exception {
            CheckRecoveryPlanResponseBodyServers self = new CheckRecoveryPlanResponseBodyServers();
            return TeaModel.build(map, self);
        }

        public CheckRecoveryPlanResponseBodyServers setServer(java.util.List<CheckRecoveryPlanResponseBodyServersServer> server) {
            this.server = server;
            return this;
        }
        public java.util.List<CheckRecoveryPlanResponseBodyServersServer> getServer() {
            return this.server;
        }

    }

}

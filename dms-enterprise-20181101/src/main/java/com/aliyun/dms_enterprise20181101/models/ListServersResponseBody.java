// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListServersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerList")
    public ListServersResponseBodyServerList serverList;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServersResponseBody self = new ListServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListServersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServersResponseBody setServerList(ListServersResponseBodyServerList serverList) {
        this.serverList = serverList;
        return this;
    }
    public ListServersResponseBodyServerList getServerList() {
        return this.serverList;
    }

    public ListServersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServersResponseBodyServerListServer extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Password")
        public String password;

        @NameInMap("ServerName")
        public String serverName;

        @NameInMap("SshPort")
        public Integer sshPort;

        @NameInMap("User")
        public String user;

        public static ListServersResponseBodyServerListServer build(java.util.Map<String, ?> map) throws Exception {
            ListServersResponseBodyServerListServer self = new ListServersResponseBodyServerListServer();
            return TeaModel.build(map, self);
        }

        public ListServersResponseBodyServerListServer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListServersResponseBodyServerListServer setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListServersResponseBodyServerListServer setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListServersResponseBodyServerListServer setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

        public ListServersResponseBodyServerListServer setSshPort(Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Integer getSshPort() {
            return this.sshPort;
        }

        public ListServersResponseBodyServerListServer setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ListServersResponseBodyServerList extends TeaModel {
        @NameInMap("Server")
        public java.util.List<ListServersResponseBodyServerListServer> server;

        public static ListServersResponseBodyServerList build(java.util.Map<String, ?> map) throws Exception {
            ListServersResponseBodyServerList self = new ListServersResponseBodyServerList();
            return TeaModel.build(map, self);
        }

        public ListServersResponseBodyServerList setServer(java.util.List<ListServersResponseBodyServerListServer> server) {
            this.server = server;
            return this;
        }
        public java.util.List<ListServersResponseBodyServerListServer> getServer() {
            return this.server;
        }

    }

}

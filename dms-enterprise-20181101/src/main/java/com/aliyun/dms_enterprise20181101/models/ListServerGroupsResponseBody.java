// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListServerGroupsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerGroupList")
    public ListServerGroupsResponseBodyServerGroupList serverGroupList;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServerGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsResponseBody self = new ListServerGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListServerGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListServerGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerGroupsResponseBody setServerGroupList(ListServerGroupsResponseBodyServerGroupList serverGroupList) {
        this.serverGroupList = serverGroupList;
        return this;
    }
    public ListServerGroupsResponseBodyServerGroupList getServerGroupList() {
        return this.serverGroupList;
    }

    public ListServerGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListServerGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServerGroupsResponseBodyServerGroupListServerMasterServer extends TeaModel {
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

        public static ListServerGroupsResponseBodyServerGroupListServerMasterServer build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupListServerMasterServer self = new ListServerGroupsResponseBodyServerGroupListServerMasterServer();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupListServerMasterServer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListServerGroupsResponseBodyServerGroupListServerMasterServer setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListServerGroupsResponseBodyServerGroupListServerMasterServer setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListServerGroupsResponseBodyServerGroupListServerMasterServer setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

        public ListServerGroupsResponseBodyServerGroupListServerMasterServer setSshPort(Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Integer getSshPort() {
            return this.sshPort;
        }

        public ListServerGroupsResponseBodyServerGroupListServerMasterServer setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer extends TeaModel {
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

        public static ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer self = new ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer setSshPort(Integer sshPort) {
            this.sshPort = sshPort;
            return this;
        }
        public Integer getSshPort() {
            return this.sshPort;
        }

        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupListServerSlaveServerList extends TeaModel {
        @NameInMap("SlaveServer")
        public java.util.List<ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer> slaveServer;

        public static ListServerGroupsResponseBodyServerGroupListServerSlaveServerList build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupListServerSlaveServerList self = new ListServerGroupsResponseBodyServerGroupListServerSlaveServerList();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerList setSlaveServer(java.util.List<ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer> slaveServer) {
            this.slaveServer = slaveServer;
            return this;
        }
        public java.util.List<ListServerGroupsResponseBodyServerGroupListServerSlaveServerListSlaveServer> getSlaveServer() {
            return this.slaveServer;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupListServer extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Id")
        public String id;

        @NameInMap("MasterServer")
        public ListServerGroupsResponseBodyServerGroupListServerMasterServer masterServer;

        @NameInMap("SlaveServerList")
        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerList slaveServerList;

        public static ListServerGroupsResponseBodyServerGroupListServer build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupListServer self = new ListServerGroupsResponseBodyServerGroupListServer();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupListServer setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListServerGroupsResponseBodyServerGroupListServer setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListServerGroupsResponseBodyServerGroupListServer setMasterServer(ListServerGroupsResponseBodyServerGroupListServerMasterServer masterServer) {
            this.masterServer = masterServer;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupListServerMasterServer getMasterServer() {
            return this.masterServer;
        }

        public ListServerGroupsResponseBodyServerGroupListServer setSlaveServerList(ListServerGroupsResponseBodyServerGroupListServerSlaveServerList slaveServerList) {
            this.slaveServerList = slaveServerList;
            return this;
        }
        public ListServerGroupsResponseBodyServerGroupListServerSlaveServerList getSlaveServerList() {
            return this.slaveServerList;
        }

    }

    public static class ListServerGroupsResponseBodyServerGroupList extends TeaModel {
        @NameInMap("Server")
        public java.util.List<ListServerGroupsResponseBodyServerGroupListServer> server;

        public static ListServerGroupsResponseBodyServerGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsResponseBodyServerGroupList self = new ListServerGroupsResponseBodyServerGroupList();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsResponseBodyServerGroupList setServer(java.util.List<ListServerGroupsResponseBodyServerGroupListServer> server) {
            this.server = server;
            return this;
        }
        public java.util.List<ListServerGroupsResponseBodyServerGroupListServer> getServer() {
            return this.server;
        }

    }

}

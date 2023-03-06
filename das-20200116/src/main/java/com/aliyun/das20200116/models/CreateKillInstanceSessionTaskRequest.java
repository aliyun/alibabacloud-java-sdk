// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskRequest extends TeaModel {
    @NameInMap("DbUser")
    public String dbUser;

    @NameInMap("DbUserPassword")
    public String dbUserPassword;

    @NameInMap("IgnoredUsers")
    public String ignoredUsers;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KillAllSessions")
    public Boolean killAllSessions;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("SessionIds")
    public String sessionIds;

    public static CreateKillInstanceSessionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKillInstanceSessionTaskRequest self = new CreateKillInstanceSessionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateKillInstanceSessionTaskRequest setDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }
    public String getDbUser() {
        return this.dbUser;
    }

    public CreateKillInstanceSessionTaskRequest setDbUserPassword(String dbUserPassword) {
        this.dbUserPassword = dbUserPassword;
        return this;
    }
    public String getDbUserPassword() {
        return this.dbUserPassword;
    }

    public CreateKillInstanceSessionTaskRequest setIgnoredUsers(String ignoredUsers) {
        this.ignoredUsers = ignoredUsers;
        return this;
    }
    public String getIgnoredUsers() {
        return this.ignoredUsers;
    }

    public CreateKillInstanceSessionTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateKillInstanceSessionTaskRequest setKillAllSessions(Boolean killAllSessions) {
        this.killAllSessions = killAllSessions;
        return this;
    }
    public Boolean getKillAllSessions() {
        return this.killAllSessions;
    }

    public CreateKillInstanceSessionTaskRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateKillInstanceSessionTaskRequest setSessionIds(String sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }
    public String getSessionIds() {
        return this.sessionIds;
    }

}

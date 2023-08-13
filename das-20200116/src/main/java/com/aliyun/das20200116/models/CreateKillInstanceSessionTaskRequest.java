// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskRequest extends TeaModel {
    /**
     * <p>The database account that has the permissions to terminate sessions.</p>
     */
    @NameInMap("DbUser")
    public String dbUser;

    /**
     * <p>The password of the database account.</p>
     */
    @NameInMap("DbUserPassword")
    public String dbUserPassword;

    /**
     * <p>The account whose sessions do not need to be terminated.</p>
     * <br>
     * <p>>  Set this parameter to a JSON array. Separate database accounts with commas (,). Example: \[\"Database account 1\",\"Database account 2\"].</p>
     */
    @NameInMap("IgnoredUsers")
    public String ignoredUsers;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to terminate all sessions.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>>  If you set this parameter to **true**, sessions of the accounts that are specified by **IgnoredUsers**, sessions of internal O\&M accounts of Alibaba Cloud, and **Binlog Dump** sessions are not terminated.</p>
     */
    @NameInMap("KillAllSessions")
    public Boolean killAllSessions;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  This parameter must be specified if the database instance is a PolarDB for MySQL cluster. If you do not specify a node ID and set **KillAllSessions** to **true**, the system traverses all nodes in the PolarDB for MySQL cluster and terminates the active sessions on each node.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The IDs of sessions that need to be terminated.</p>
     * <br>
     * <p>>  Set this parameter to a JSON array. Separate session IDs with commas (,). Example: \[\"Session ID1\",\"Session ID2\"]. If **KillAllSessions** is set to **true**, this parameter does not take effect.</p>
     */
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

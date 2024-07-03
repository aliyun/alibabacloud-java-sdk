// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskRequest extends TeaModel {
    /**
     * <p>The database account that has the permissions to terminate sessions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testUser</p>
     */
    @NameInMap("DbUser")
    public String dbUser;

    /**
     * <p>The password of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("DbUserPassword")
    public String dbUserPassword;

    /**
     * <p>The account whose sessions do not need to be terminated.</p>
     * <blockquote>
     * <p> Set this parameter to a JSON array. Separate database accounts with commas (,). Example: [\&quot;Database account 1\&quot;,\&quot;Database account 2\&quot;].</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;db_user1\&quot;,\&quot;db_user2\&quot;]</p>
     */
    @NameInMap("IgnoredUsers")
    public String ignoredUsers;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to terminate all sessions.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to <strong>true</strong>, sessions of the accounts that are specified by <strong>IgnoredUsers</strong>, sessions of internal O\&amp;M accounts of Alibaba Cloud, and <strong>Binlog Dump</strong> sessions are not terminated.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("KillAllSessions")
    public Boolean killAllSessions;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p> This parameter must be specified if the database instance is a PolarDB for MySQL cluster. If you do not specify a node ID and set <strong>KillAllSessions</strong> to <strong>true</strong>, the system traverses all nodes in the PolarDB for MySQL cluster and terminates the active sessions on each node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp1v203xzzh0a****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The IDs of sessions that need to be terminated.</p>
     * <blockquote>
     * <p> Set this parameter to a JSON array. Separate session IDs with commas (,). Example: [\&quot;Session ID1\&quot;,\&quot;Session ID2\&quot;]. If <strong>KillAllSessions</strong> is set to <strong>true</strong>, this parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[10805639,10805623,10805645,10805553,10805566,10805616]</p>
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

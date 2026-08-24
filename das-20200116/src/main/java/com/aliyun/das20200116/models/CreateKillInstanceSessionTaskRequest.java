// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskRequest extends TeaModel {
    /**
     * <p>The database account that has the permission to terminate sessions.</p>
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
     * <p>The list of accounts whose sessions will not be terminated.</p>
     * <blockquote>
     * <p>The data is in JSONArray format, such as [\&quot;DatabaseAccount1\&quot;,\&quot;DatabaseAccount2\&quot;\]. Separate multiple database accounts with commas (,).</p>
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
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When this parameter is set to <strong>true</strong>, sessions of accounts specified in the <strong>IgnoredUsers</strong> request parameter, sessions of Alibaba Cloud internal operations accounts, and <strong>Binlog Dump</strong> sessions are not terminated.</p>
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
     * <p>For PolarDB for MySQL instances, provide the node ID. If no node ID is provided and the <strong>KillAllSessions</strong> request parameter is set to <strong>true</strong> (terminate all sessions), the system traverses all nodes of the PolarDB for MySQL instance and terminates ongoing sessions on each node.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp1v203xzzh0a****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The list of session IDs to be terminated.</p>
     * <blockquote>
     * <p>The data is in JSONArray format, such as [SessionID1,SessionID2\]. Separate multiple session IDs with commas (,). If the <strong>KillAllSessions</strong> request parameter is set to <strong>true</strong> (terminate all sessions), this list is ignored.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateKillInstanceSessionTaskWithMaintainUserRequest extends TeaModel {
    @NameInMap("IgnoredUsers")
    public String ignoredUsers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("KillAllSessions")
    public Boolean killAllSessions;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("SessionIds")
    public String sessionIds;

    public static CreateKillInstanceSessionTaskWithMaintainUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKillInstanceSessionTaskWithMaintainUserRequest self = new CreateKillInstanceSessionTaskWithMaintainUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateKillInstanceSessionTaskWithMaintainUserRequest setIgnoredUsers(String ignoredUsers) {
        this.ignoredUsers = ignoredUsers;
        return this;
    }
    public String getIgnoredUsers() {
        return this.ignoredUsers;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserRequest setKillAllSessions(Boolean killAllSessions) {
        this.killAllSessions = killAllSessions;
        return this;
    }
    public Boolean getKillAllSessions() {
        return this.killAllSessions;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateKillInstanceSessionTaskWithMaintainUserRequest setSessionIds(String sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }
    public String getSessionIds() {
        return this.sessionIds;
    }

}

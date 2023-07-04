// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallChatsRequest extends TeaModel {
    /**
     * <p>坐席ID</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <p>坐席标签</p>
     */
    @NameInMap("AgentTag")
    public String agentTag;

    /**
     * <p>外呼ID</p>
     */
    @NameInMap("CallId")
    public String callId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>任务ID</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static TaskCallChatsRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskCallChatsRequest self = new TaskCallChatsRequest();
        return TeaModel.build(map, self);
    }

    public TaskCallChatsRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public TaskCallChatsRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public TaskCallChatsRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public TaskCallChatsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TaskCallChatsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TaskCallChatsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TaskCallChatsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentRecoverCallRequest extends TeaModel {
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
     * <p>查询开始导入时间</p>
     */
    @NameInMap("BeginImportTime")
    public String beginImportTime;

    /**
     * <p>查询结束导入时间</p>
     */
    @NameInMap("EndImportTime")
    public String endImportTime;

    /**
     * <p>号码列表</p>
     */
    @NameInMap("Numbers")
    public java.util.List<String> numbers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>用户自定义标签列表</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static AgentRecoverCallRequest build(java.util.Map<String, ?> map) throws Exception {
        AgentRecoverCallRequest self = new AgentRecoverCallRequest();
        return TeaModel.build(map, self);
    }

    public AgentRecoverCallRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public AgentRecoverCallRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public AgentRecoverCallRequest setBeginImportTime(String beginImportTime) {
        this.beginImportTime = beginImportTime;
        return this;
    }
    public String getBeginImportTime() {
        return this.beginImportTime;
    }

    public AgentRecoverCallRequest setEndImportTime(String endImportTime) {
        this.endImportTime = endImportTime;
        return this;
    }
    public String getEndImportTime() {
        return this.endImportTime;
    }

    public AgentRecoverCallRequest setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    public AgentRecoverCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AgentRecoverCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AgentRecoverCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AgentRecoverCallRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}

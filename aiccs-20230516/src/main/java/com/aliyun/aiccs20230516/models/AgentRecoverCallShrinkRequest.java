// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentRecoverCallShrinkRequest extends TeaModel {
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
    public String numbersShrink;

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
    public String tagsShrink;

    public static AgentRecoverCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AgentRecoverCallShrinkRequest self = new AgentRecoverCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AgentRecoverCallShrinkRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public AgentRecoverCallShrinkRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public AgentRecoverCallShrinkRequest setBeginImportTime(String beginImportTime) {
        this.beginImportTime = beginImportTime;
        return this;
    }
    public String getBeginImportTime() {
        return this.beginImportTime;
    }

    public AgentRecoverCallShrinkRequest setEndImportTime(String endImportTime) {
        this.endImportTime = endImportTime;
        return this;
    }
    public String getEndImportTime() {
        return this.endImportTime;
    }

    public AgentRecoverCallShrinkRequest setNumbersShrink(String numbersShrink) {
        this.numbersShrink = numbersShrink;
        return this;
    }
    public String getNumbersShrink() {
        return this.numbersShrink;
    }

    public AgentRecoverCallShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AgentRecoverCallShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AgentRecoverCallShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AgentRecoverCallShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}

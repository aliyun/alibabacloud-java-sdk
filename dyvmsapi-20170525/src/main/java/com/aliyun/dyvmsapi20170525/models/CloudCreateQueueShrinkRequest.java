// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateQueueShrinkRequest extends TeaModel {
    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>队列信息</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Queue")
    public String queueShrink;

    /**
     * <p>队列技能</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueueSkills")
    public String queueSkillsShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CloudCreateQueueShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateQueueShrinkRequest self = new CloudCreateQueueShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloudCreateQueueShrinkRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudCreateQueueShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudCreateQueueShrinkRequest setQueueShrink(String queueShrink) {
        this.queueShrink = queueShrink;
        return this;
    }
    public String getQueueShrink() {
        return this.queueShrink;
    }

    public CloudCreateQueueShrinkRequest setQueueSkillsShrink(String queueSkillsShrink) {
        this.queueSkillsShrink = queueSkillsShrink;
        return this;
    }
    public String getQueueSkillsShrink() {
        return this.queueSkillsShrink;
    }

    public CloudCreateQueueShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudCreateQueueShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateQueueSkillRequest extends TeaModel {
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
     * <p>队列号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Qno")
    public String qno;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>skill的id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17</p>
     */
    @NameInMap("SkillId")
    public Long skillId;

    /**
     * <p>技能值</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("SkillLevel")
    public Long skillLevel;

    public static CloudCreateQueueSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateQueueSkillRequest self = new CloudCreateQueueSkillRequest();
        return TeaModel.build(map, self);
    }

    public CloudCreateQueueSkillRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudCreateQueueSkillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudCreateQueueSkillRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public CloudCreateQueueSkillRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudCreateQueueSkillRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudCreateQueueSkillRequest setSkillId(Long skillId) {
        this.skillId = skillId;
        return this;
    }
    public Long getSkillId() {
        return this.skillId;
    }

    public CloudCreateQueueSkillRequest setSkillLevel(Long skillLevel) {
        this.skillLevel = skillLevel;
        return this;
    }
    public Long getSkillLevel() {
        return this.skillLevel;
    }

}

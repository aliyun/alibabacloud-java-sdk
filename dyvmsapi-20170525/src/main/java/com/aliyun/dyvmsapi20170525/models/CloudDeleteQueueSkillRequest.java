// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteQueueSkillRequest extends TeaModel {
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
     * <p>10000</p>
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
     * <p>76</p>
     */
    @NameInMap("SkillId")
    public Long skillId;

    public static CloudDeleteQueueSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteQueueSkillRequest self = new CloudDeleteQueueSkillRequest();
        return TeaModel.build(map, self);
    }

    public CloudDeleteQueueSkillRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudDeleteQueueSkillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudDeleteQueueSkillRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public CloudDeleteQueueSkillRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudDeleteQueueSkillRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudDeleteQueueSkillRequest setSkillId(Long skillId) {
        this.skillId = skillId;
        return this;
    }
    public Long getSkillId() {
        return this.skillId;
    }

}

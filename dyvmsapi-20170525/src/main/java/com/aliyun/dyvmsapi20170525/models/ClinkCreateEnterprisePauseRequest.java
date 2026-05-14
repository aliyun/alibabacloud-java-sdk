// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateEnterprisePauseRequest extends TeaModel {
    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8004970</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>默认状态，0：不是；1：是</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDefault")
    public Long isDefault;

    /**
     * <p>休息状态，0：不是；1：是</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsRest")
    public String isRest;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>置忙状态描述（不超4个字符）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("PauseStatus")
    public String pauseStatus;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ClinkCreateEnterprisePauseRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateEnterprisePauseRequest self = new ClinkCreateEnterprisePauseRequest();
        return TeaModel.build(map, self);
    }

    public ClinkCreateEnterprisePauseRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkCreateEnterprisePauseRequest setIsDefault(Long isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Long getIsDefault() {
        return this.isDefault;
    }

    public ClinkCreateEnterprisePauseRequest setIsRest(String isRest) {
        this.isRest = isRest;
        return this;
    }
    public String getIsRest() {
        return this.isRest;
    }

    public ClinkCreateEnterprisePauseRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkCreateEnterprisePauseRequest setPauseStatus(String pauseStatus) {
        this.pauseStatus = pauseStatus;
        return this;
    }
    public String getPauseStatus() {
        return this.pauseStatus;
    }

    public ClinkCreateEnterprisePauseRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkCreateEnterprisePauseRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

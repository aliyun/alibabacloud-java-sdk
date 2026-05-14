// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDetailCdrIbRequest extends TeaModel {
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
     * <p>是否隐藏号码。 0: 不隐藏，1: 中间四位，2: 最后八位，3: 全部号码，4: 最后四位。默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HiddenType")
    public Long hiddenType;

    /**
     * <p>通话记录唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>medias_1-162046xxxx.12</p>
     */
    @NameInMap("MainUniqueId")
    public String mainUniqueId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ClinkDetailCdrIbRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkDetailCdrIbRequest self = new ClinkDetailCdrIbRequest();
        return TeaModel.build(map, self);
    }

    public ClinkDetailCdrIbRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkDetailCdrIbRequest setHiddenType(Long hiddenType) {
        this.hiddenType = hiddenType;
        return this;
    }
    public Long getHiddenType() {
        return this.hiddenType;
    }

    public ClinkDetailCdrIbRequest setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        return this;
    }
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    public ClinkDetailCdrIbRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkDetailCdrIbRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkDetailCdrIbRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

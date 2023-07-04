// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddBlacklistShrinkRequest extends TeaModel {
    /**
     * <p>有效天数</p>
     */
    @NameInMap("ExpiredDay")
    public String expiredDay;

    /**
     * <p>号码列表</p>
     */
    @NameInMap("Numbers")
    public String numbersShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>备注</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddBlacklistShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBlacklistShrinkRequest self = new AddBlacklistShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddBlacklistShrinkRequest setExpiredDay(String expiredDay) {
        this.expiredDay = expiredDay;
        return this;
    }
    public String getExpiredDay() {
        return this.expiredDay;
    }

    public AddBlacklistShrinkRequest setNumbersShrink(String numbersShrink) {
        this.numbersShrink = numbersShrink;
        return this;
    }
    public String getNumbersShrink() {
        return this.numbersShrink;
    }

    public AddBlacklistShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddBlacklistShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddBlacklistShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddBlacklistShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

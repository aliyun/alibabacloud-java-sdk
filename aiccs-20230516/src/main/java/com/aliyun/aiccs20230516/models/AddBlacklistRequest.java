// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddBlacklistRequest extends TeaModel {
    /**
     * <p>有效天数</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExpiredDay")
    public String expiredDay;

    /**
     * <p>号码列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Numbers")
    public java.util.List<String> numbers;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>备注</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBlacklistRequest self = new AddBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public AddBlacklistRequest setExpiredDay(String expiredDay) {
        this.expiredDay = expiredDay;
        return this;
    }
    public String getExpiredDay() {
        return this.expiredDay;
    }

    public AddBlacklistRequest setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    public AddBlacklistRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddBlacklistRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddBlacklistRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddBlacklistRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

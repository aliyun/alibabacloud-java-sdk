// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class UpdateSmsCodeLimitConfigRequest extends TeaModel {
    @NameInMap("LimitDay")
    public Integer limitDay;

    @NameInMap("LimitHour")
    public Integer limitHour;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LimitId")
    public Long limitId;

    @NameInMap("LimitMinute")
    public Integer limitMinute;

    @NameInMap("LimitOther")
    public String limitOther;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateSmsCodeLimitConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsCodeLimitConfigRequest self = new UpdateSmsCodeLimitConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsCodeLimitConfigRequest setLimitDay(Integer limitDay) {
        this.limitDay = limitDay;
        return this;
    }
    public Integer getLimitDay() {
        return this.limitDay;
    }

    public UpdateSmsCodeLimitConfigRequest setLimitHour(Integer limitHour) {
        this.limitHour = limitHour;
        return this;
    }
    public Integer getLimitHour() {
        return this.limitHour;
    }

    public UpdateSmsCodeLimitConfigRequest setLimitId(Long limitId) {
        this.limitId = limitId;
        return this;
    }
    public Long getLimitId() {
        return this.limitId;
    }

    public UpdateSmsCodeLimitConfigRequest setLimitMinute(Integer limitMinute) {
        this.limitMinute = limitMinute;
        return this;
    }
    public Integer getLimitMinute() {
        return this.limitMinute;
    }

    public UpdateSmsCodeLimitConfigRequest setLimitOther(String limitOther) {
        this.limitOther = limitOther;
        return this;
    }
    public String getLimitOther() {
        return this.limitOther;
    }

    public UpdateSmsCodeLimitConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmsCodeLimitConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmsCodeLimitConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

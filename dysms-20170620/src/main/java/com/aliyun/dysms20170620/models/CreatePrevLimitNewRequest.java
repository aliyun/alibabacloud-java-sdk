// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePrevLimitNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HourLimit")
    public Long hourLimit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IncreaseRate")
    public Integer increaseRate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SuccessRate")
    public Integer successRate;

    public static CreatePrevLimitNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrevLimitNewRequest self = new CreatePrevLimitNewRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrevLimitNewRequest setHourLimit(Long hourLimit) {
        this.hourLimit = hourLimit;
        return this;
    }
    public Long getHourLimit() {
        return this.hourLimit;
    }

    public CreatePrevLimitNewRequest setIncreaseRate(Integer increaseRate) {
        this.increaseRate = increaseRate;
        return this;
    }
    public Integer getIncreaseRate() {
        return this.increaseRate;
    }

    public CreatePrevLimitNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePrevLimitNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreatePrevLimitNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePrevLimitNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreatePrevLimitNewRequest setSuccessRate(Integer successRate) {
        this.successRate = successRate;
        return this;
    }
    public Integer getSuccessRate() {
        return this.successRate;
    }

}

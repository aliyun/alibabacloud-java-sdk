// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class AutoRenewInstanceRequest extends TeaModel {
    @NameInMap("AutoRenewCycle")
    public String autoRenewCycle;

    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    @NameInMap("OrderBizId")
    public Long orderBizId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Type")
    public String type;

    public static AutoRenewInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AutoRenewInstanceRequest self = new AutoRenewInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AutoRenewInstanceRequest setAutoRenewCycle(String autoRenewCycle) {
        this.autoRenewCycle = autoRenewCycle;
        return this;
    }
    public String getAutoRenewCycle() {
        return this.autoRenewCycle;
    }

    public AutoRenewInstanceRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public AutoRenewInstanceRequest setOrderBizId(Long orderBizId) {
        this.orderBizId = orderBizId;
        return this;
    }
    public Long getOrderBizId() {
        return this.orderBizId;
    }

    public AutoRenewInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AutoRenewInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

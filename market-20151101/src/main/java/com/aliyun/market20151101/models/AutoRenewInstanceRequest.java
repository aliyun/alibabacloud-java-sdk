// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class AutoRenewInstanceRequest extends TeaModel {
    /**
     * <p>The cycle unit. This parameter is required when enabling auto-renewal. Valid values:</p>
     * <ul>
     * <li>Day: day.</li>
     * <li>Month: month.</li>
     * <li>Year: year.</li>
     * </ul>
     */
    @NameInMap("AutoRenewCycle")
    public String autoRenewCycle;

    /**
     * <p>The renewal cycle. This parameter is required when enabling auto-renewal.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The Alibaba Cloud Marketplace instance ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderBizId")
    public Long orderBizId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li>open: enables auto-renewal.</li>
     * <li>close: disables auto-renewal.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * <p>This parameter is required.</p>
     */
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

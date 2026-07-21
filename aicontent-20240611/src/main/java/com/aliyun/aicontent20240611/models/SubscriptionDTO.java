// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class SubscriptionDTO extends TeaModel {
    /**
     * <p>The balance type (permanent/monthly).</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-15T10:00:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The subscription ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The subscription status. Valid values:</p>
     * <ul>
     * <li>active: The subscription is active.</li>
     * <li>stopped: The subscription is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The stop time. This value is empty if the subscription has not been stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-01T00:00:00Z</p>
     */
    @NameInMap("stopTime")
    public String stopTime;

    /**
     * <p>The subscription recharge amount.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("subscriptionAmount")
    public Double subscriptionAmount;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-15T10:00:00Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The effective period.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-01T00:00:00Z</p>
     */
    @NameInMap("validFrom")
    public String validFrom;

    public static SubscriptionDTO build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionDTO self = new SubscriptionDTO();
        return TeaModel.build(map, self);
    }

    public SubscriptionDTO setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public SubscriptionDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public SubscriptionDTO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public SubscriptionDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SubscriptionDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubscriptionDTO setStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public String getStopTime() {
        return this.stopTime;
    }

    public SubscriptionDTO setSubscriptionAmount(Double subscriptionAmount) {
        this.subscriptionAmount = subscriptionAmount;
        return this;
    }
    public Double getSubscriptionAmount() {
        return this.subscriptionAmount;
    }

    public SubscriptionDTO setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public SubscriptionDTO setValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public String getValidFrom() {
        return this.validFrom;
    }

}

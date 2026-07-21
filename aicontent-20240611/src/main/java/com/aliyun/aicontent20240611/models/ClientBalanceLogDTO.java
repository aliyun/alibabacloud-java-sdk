// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ClientBalanceLogDTO extends TeaModel {
    /**
     * <p>The new balance.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("balanceAfter")
    public Double balanceAfter;

    /**
     * <p>The previous balance.</p>
     * 
     * <strong>example:</strong>
     * <p>90.00</p>
     */
    @NameInMap("balanceBefore")
    public Double balanceBefore;

    /**
     * <p>The change amount. A positive value represents a recharge, and a negative value represents a deduction.</p>
     * 
     * <strong>example:</strong>
     * <p>10.00</p>
     */
    @NameInMap("changeAmount")
    public Double changeAmount;

    /**
     * <p>The type of change. Possible values are <code>auto_deduct</code>, <code>deduct</code>, or <code>recharge</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>recharge</p>
     */
    @NameInMap("changeType")
    public String changeType;

    /**
     * <p>The client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The creation time in ISO 8601 UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The unique record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Notes about the balance change.</p>
     * 
     * <strong>example:</strong>
     * <p>充值</p>
     */
    @NameInMap("remark")
    public String remark;

    public static ClientBalanceLogDTO build(java.util.Map<String, ?> map) throws Exception {
        ClientBalanceLogDTO self = new ClientBalanceLogDTO();
        return TeaModel.build(map, self);
    }

    public ClientBalanceLogDTO setBalanceAfter(Double balanceAfter) {
        this.balanceAfter = balanceAfter;
        return this;
    }
    public Double getBalanceAfter() {
        return this.balanceAfter;
    }

    public ClientBalanceLogDTO setBalanceBefore(Double balanceBefore) {
        this.balanceBefore = balanceBefore;
        return this;
    }
    public Double getBalanceBefore() {
        return this.balanceBefore;
    }

    public ClientBalanceLogDTO setChangeAmount(Double changeAmount) {
        this.changeAmount = changeAmount;
        return this;
    }
    public Double getChangeAmount() {
        return this.changeAmount;
    }

    public ClientBalanceLogDTO setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

    public ClientBalanceLogDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ClientBalanceLogDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ClientBalanceLogDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ClientBalanceLogDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}

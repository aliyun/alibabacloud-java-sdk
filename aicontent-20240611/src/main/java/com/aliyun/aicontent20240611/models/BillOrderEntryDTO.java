// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillOrderEntryDTO extends TeaModel {
    /**
     * <p>The change amount.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("amount")
    public Double amount;

    /**
     * <p>The balance after the change.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("balanceAfter")
    public Double balanceAfter;

    /**
     * <p>The balance before the change.</p>
     * 
     * <strong>example:</strong>
     * <p>0.00</p>
     */
    @NameInMap("balanceBefore")
    public Double balanceBefore;

    /**
     * <p>The balance type: permanent/monthly.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The change direction: in/out.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The model code (available when gateway billing deduction is applied).</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("operatorId")
    public String operatorId;

    /**
     * <p>The change record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ord_xxxxxxxx</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>The change type.</p>
     * 
     * <strong>example:</strong>
     * <p>recharge</p>
     */
    @NameInMap("orderType")
    public String orderType;

    /**
     * <p>The remark.</p>
     * 
     * <strong>example:</strong>
     * <p>Top-up</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The total balance after the change.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("totalAfter")
    public Double totalAfter;

    /**
     * <p>The total balance before the change.</p>
     * 
     * <strong>example:</strong>
     * <p>0.00</p>
     */
    @NameInMap("totalBefore")
    public Double totalBefore;

    public static BillOrderEntryDTO build(java.util.Map<String, ?> map) throws Exception {
        BillOrderEntryDTO self = new BillOrderEntryDTO();
        return TeaModel.build(map, self);
    }

    public BillOrderEntryDTO setAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    public Double getAmount() {
        return this.amount;
    }

    public BillOrderEntryDTO setBalanceAfter(Double balanceAfter) {
        this.balanceAfter = balanceAfter;
        return this;
    }
    public Double getBalanceAfter() {
        return this.balanceAfter;
    }

    public BillOrderEntryDTO setBalanceBefore(Double balanceBefore) {
        this.balanceBefore = balanceBefore;
        return this;
    }
    public Double getBalanceBefore() {
        return this.balanceBefore;
    }

    public BillOrderEntryDTO setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public BillOrderEntryDTO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BillOrderEntryDTO setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public BillOrderEntryDTO setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public BillOrderEntryDTO setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public BillOrderEntryDTO setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BillOrderEntryDTO setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public BillOrderEntryDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BillOrderEntryDTO setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public BillOrderEntryDTO setTotalAfter(Double totalAfter) {
        this.totalAfter = totalAfter;
        return this;
    }
    public Double getTotalAfter() {
        return this.totalAfter;
    }

    public BillOrderEntryDTO setTotalBefore(Double totalBefore) {
        this.totalBefore = totalBefore;
        return this;
    }
    public Double getTotalBefore() {
        return this.totalBefore;
    }

}

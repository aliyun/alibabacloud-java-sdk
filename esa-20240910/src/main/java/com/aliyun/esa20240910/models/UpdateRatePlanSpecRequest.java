// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRatePlanSpecRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <strong>example:</strong>
     * <p>xcdn-91fknmb80f0g</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("TargetPlanCode")
    public String targetPlanCode;

    /**
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("TargetPlanName")
    public String targetPlanName;

    public static UpdateRatePlanSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRatePlanSpecRequest self = new UpdateRatePlanSpecRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRatePlanSpecRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpdateRatePlanSpecRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public UpdateRatePlanSpecRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateRatePlanSpecRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public UpdateRatePlanSpecRequest setTargetPlanCode(String targetPlanCode) {
        this.targetPlanCode = targetPlanCode;
        return this;
    }
    public String getTargetPlanCode() {
        return this.targetPlanCode;
    }

    public UpdateRatePlanSpecRequest setTargetPlanName(String targetPlanName) {
        this.targetPlanName = targetPlanName;
        return this;
    }
    public String getTargetPlanName() {
        return this.targetPlanName;
    }

}

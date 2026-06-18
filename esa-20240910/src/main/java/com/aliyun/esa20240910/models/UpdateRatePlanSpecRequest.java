// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRatePlanSpecRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The billing type. Valid values:</p>
     * <ul>
     * <li>PREPAY: Subscription.</li>
     * <li>POSTPAY: Pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xcdn-91fknmb80f0g</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of specification change. Valid values:</p>
     * <ul>
     * <li>UPGRADE: Upgrade.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The code of the target plan.</p>
     * <p>Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>)</p>
     * <ul>
     * <li>Free Edition: entranceplan</li>
     * <li>Basic Edition: basicplan</li>
     * <li>Standard Edition: standardplan</li>
     * <li>Premium Edition: advancedplan</li>
     * </ul>
     * <p>Alibaba Cloud International Website (<a href="http://www.alibabacloud.com">www.alibabacloud.com</a>)</p>
     * <ul>
     * <li>Entrance: entranceplan</li>
     * <li>Pro: standardplan</li>
     * <li>Premium: advancedpla.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("TargetPlanCode")
    public String targetPlanCode;

    /**
     * <p>The name of the target plan.</p>
     * <p>Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>)</p>
     * <ul>
     * <li>Free Edition: entranceplan</li>
     * <li>Basic Edition: basic</li>
     * <li>Standard Edition: medium</li>
     * <li>Premium Edition: high</li>
     * </ul>
     * <p>Alibaba Cloud International Website (<a href="http://www.alibabacloud.com">www.alibabacloud.com</a>)</p>
     * <ul>
     * <li>Entrance: entranceplan_intl</li>
     * <li>Pro: basicplan_intl</li>
     * <li>Premium: vipplan_intl.</li>
     * </ul>
     * 
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

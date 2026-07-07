// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanPriceGapRequest extends TeaModel {
    /**
     * <p>The target plan name. You can obtain this value from the <a href="~~DescribeRatePlanPrice~~">DescribeRatePlanPrice</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The specification change type. Valid values:</p>
     * <ul>
     * <li>DOWNGRADE: downgrade.</li>
     * <li>UPGRADE: upgrade.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The code of the target plan for the specification change.</p>
     * 
     * <strong>example:</strong>
     * <p>standardplan</p>
     */
    @NameInMap("TargetPlanCode")
    public String targetPlanCode;

    /**
     * <p>The name of the target plan for the specification change.</p>
     * 
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("TargetPlanName")
    public String targetPlanName;

    public static DescribeRatePlanPriceGapRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanPriceGapRequest self = new DescribeRatePlanPriceGapRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanPriceGapRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRatePlanPriceGapRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeRatePlanPriceGapRequest setTargetPlanCode(String targetPlanCode) {
        this.targetPlanCode = targetPlanCode;
        return this;
    }
    public String getTargetPlanCode() {
        return this.targetPlanCode;
    }

    public DescribeRatePlanPriceGapRequest setTargetPlanName(String targetPlanName) {
        this.targetPlanName = targetPlanName;
        return this;
    }
    public String getTargetPlanName() {
        return this.targetPlanName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class IncreaseNodesRequest extends TeaModel {
    /**
     * <p>The application configurations. The number of array elements can range from 1 to 1,000.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    /**
     * <p>Specifies whether to automatically pay for the order. This parameter is effective only when the PaymentType of the node group is Subscription. Valid values:</p>
     * <ul>
     * <li><p>true: Automatically pays for the order.</p>
     * </li>
     * <li><p>false: Does not automatically pay for the order.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPayOrder")
    public Boolean autoPayOrder;

    /**
     * <p>Specifies whether to enable auto-renewal for the added nodes. The default value is false. Valid values:</p>
     * <ul>
     * <li><p>true: Enables auto-renewal.</p>
     * </li>
     * <li><p>false: Disables auto-renewal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of nodes to add. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("IncreaseNodeCount")
    public Integer increaseNodeCount;

    /**
     * <p>The minimum number of nodes to add in this scale-out operation. The value must be between 1 and 500.</p>
     * <ul>
     * <li><p>If you set this parameter and the available ECS inventory is less than IncreaseNodeCount, the system attempts to create at least the number of nodes specified by MinIncreaseNodeCount. The scale-out flow is then marked as <code>PARTIAL_COMPLETED</code>.</p>
     * </li>
     * <li><p>If you do not set this parameter and the available ECS inventory is less than IncreaseNodeCount, the scale-out flow fails and is marked as <code>FAILED</code>.</p>
     * </li>
     * </ul>
     */
    @NameInMap("MinIncreaseNodeCount")
    public Integer minIncreaseNodeCount;

    /**
     * <p>The ID of the node group to scale out.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The subscription duration. If PaymentDurationUnit is set to Month, valid values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li>Month: The unit is month.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    @NameInMap("Promotions")
    public java.util.List<Promotion> promotions;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static IncreaseNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodesRequest self = new IncreaseNodesRequest();
        return TeaModel.build(map, self);
    }

    public IncreaseNodesRequest setApplicationConfigs(java.util.List<ApplicationConfig> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public IncreaseNodesRequest setAutoPayOrder(Boolean autoPayOrder) {
        this.autoPayOrder = autoPayOrder;
        return this;
    }
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    public IncreaseNodesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public IncreaseNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public IncreaseNodesRequest setIncreaseNodeCount(Integer increaseNodeCount) {
        this.increaseNodeCount = increaseNodeCount;
        return this;
    }
    public Integer getIncreaseNodeCount() {
        return this.increaseNodeCount;
    }

    public IncreaseNodesRequest setMinIncreaseNodeCount(Integer minIncreaseNodeCount) {
        this.minIncreaseNodeCount = minIncreaseNodeCount;
        return this;
    }
    public Integer getMinIncreaseNodeCount() {
        return this.minIncreaseNodeCount;
    }

    public IncreaseNodesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public IncreaseNodesRequest setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public IncreaseNodesRequest setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public IncreaseNodesRequest setPromotions(java.util.List<Promotion> promotions) {
        this.promotions = promotions;
        return this;
    }
    public java.util.List<Promotion> getPromotions() {
        return this.promotions;
    }

    public IncreaseNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

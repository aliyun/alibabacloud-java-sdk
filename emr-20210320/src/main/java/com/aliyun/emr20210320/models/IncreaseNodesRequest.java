// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class IncreaseNodesRequest extends TeaModel {
    /**
     * <p>The configurations of the applications. Valid values of N: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    /**
     * <p>Indicates whether to automatically pay for the orders involved in the scale-out operation. This parameter takes effect only when the PaymentType parameter is set to Subscription. Valid values:</p>
     * <ul>
     * <li>true: automatically pays for the order involved in this operation.</li>
     * <li>false: does not automatically pay for the orders involved in this operation.</li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPayOrder")
    public Boolean autoPayOrder;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of nodes. The number of incremental nodes for this scale-out. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("IncreaseNodeCount")
    public Integer increaseNodeCount;

    /**
     * <p>The minimum number of nodes that can be added. Valid values: 1 to 500.</p>
     * <ul>
     * <li>If you configure this parameter, and the number of available Elastic Compute Service (ECS) instances is less than the value of the IncreaseNodeCount parameter, the system tries to add nodes based on the number specified by the <code>MinIncreaseNodeCount</code> parameter. If the minimum number of nodes are added, the scale-out status is <code>PARTIAL_COMPLETED</code>.</li>
     * <li>If you do not configure this parameter, and the number of available ECS instances is less than the value of the IncreaseNodeCount parameter, the scale-out process fails. The scale-out status is <code>FAILED</code>.</li>
     * </ul>
     */
    @NameInMap("MinIncreaseNodeCount")
    public Integer minIncreaseNodeCount;

    /**
     * <p>The ID of the node group. The target node group to which you want to scale out the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The subscription duration. Valid values when the PaymentDurationUnit value is Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li>Month</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>The ID of the region in which you want to create the instance.</p>
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

    public IncreaseNodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class IncreaseNodesRequest extends TeaModel {
    /**
     * <p>The configurations of the applications. Valid values of N: 1 to 1000.</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    /**
     * <p>Indicates whether to automatically pay for the orders involved in the scale-out operation. This parameter takes effect only when the PaymentType parameter is set to Subscription. Valid values:</p>
     * <br>
     * <p>*   true: automatically pays for the order involved in this operation.</p>
     * <p>*   false: does not automatically pay for the orders involved in this operation.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("AutoPayOrder")
    public Boolean autoPayOrder;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of nodes. The number of incremental nodes for this scale-out. Valid values: 1 to 500.</p>
     */
    @NameInMap("IncreaseNodeCount")
    public Integer increaseNodeCount;

    /**
     * <p>The ID of the node group. The target node group to which you want to scale out the cluster.</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The subscription duration. Valid values when the PaymentDurationUnit value is Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     */
    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <br>
     * <p>*   Month</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>The ID of the region in which you want to create the instance.</p>
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

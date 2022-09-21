// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class IncreaseNodesRequest extends TeaModel {
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    @NameInMap("AutoPayOrder")
    public Boolean autoPayOrder;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IncreaseNodeCount")
    public Integer increaseNodeCount;

    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

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

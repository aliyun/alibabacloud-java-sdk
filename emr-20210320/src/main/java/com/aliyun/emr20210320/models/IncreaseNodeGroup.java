// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class IncreaseNodeGroup extends TeaModel {
    /**
     * <p>描述。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>节点数量。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>节点组ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>付费时长。</p>
     */
    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    /**
     * <p>付费时长单位。</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>虚拟机交换机ID。</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static IncreaseNodeGroup build(java.util.Map<String, ?> map) throws Exception {
        IncreaseNodeGroup self = new IncreaseNodeGroup();
        return TeaModel.build(map, self);
    }

    public IncreaseNodeGroup setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncreaseNodeGroup setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public IncreaseNodeGroup setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public IncreaseNodeGroup setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public IncreaseNodeGroup setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public IncreaseNodeGroup setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}

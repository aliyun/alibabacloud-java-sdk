// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CostNodeGroupConfig extends TeaModel {
    /**
     * <p>实例类型列表。</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<CostInstanceType> instanceTypes;

    /**
     * <p>最大节点数限制。</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaximalNodeCount")
    public Integer maximalNodeCount;

    /**
     * <p>最小节点数限制。</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinimalNodeCount")
    public Integer minimalNodeCount;

    /**
     * <p>节点数。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <p>节点组类型。取值范围：</p>
     * <ul>
     * <li>MASTER：管理类型节点组。</li>
     * <li>CORE：存储类型节点组。</li>
     * <li>TASK：计算类型节点组。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CORE</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <p>付费类型。</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    public static CostNodeGroupConfig build(java.util.Map<String, ?> map) throws Exception {
        CostNodeGroupConfig self = new CostNodeGroupConfig();
        return TeaModel.build(map, self);
    }

    public CostNodeGroupConfig setInstanceTypes(java.util.List<CostInstanceType> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<CostInstanceType> getInstanceTypes() {
        return this.instanceTypes;
    }

    public CostNodeGroupConfig setMaximalNodeCount(Integer maximalNodeCount) {
        this.maximalNodeCount = maximalNodeCount;
        return this;
    }
    public Integer getMaximalNodeCount() {
        return this.maximalNodeCount;
    }

    public CostNodeGroupConfig setMinimalNodeCount(Integer minimalNodeCount) {
        this.minimalNodeCount = minimalNodeCount;
        return this;
    }
    public Integer getMinimalNodeCount() {
        return this.minimalNodeCount;
    }

    public CostNodeGroupConfig setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public CostNodeGroupConfig setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public CostNodeGroupConfig setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public CostNodeGroupConfig setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

}

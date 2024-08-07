// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Node extends TeaModel {
    /**
     * <p>节点是否自动续费。</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>节点自动续费时长。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>节点自动续费时长单位。</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>节点过期时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1603728394857</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>实例类型。</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6e.xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>运维模式状态。取值范围：</p>
     * <ul>
     * <li>ON：处于运维模式。</li>
     * <li>OFF：处于非运维模式。</li>
     * </ul>
     * <p>为空表示处于非运维模式。</p>
     */
    @NameInMap("MaintenanceStatus")
    public String maintenanceStatus;

    /**
     * <p>节点组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>节点组类型。</p>
     * 
     * <strong>example:</strong>
     * <p>CORE</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <p>节点ID。</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cudc25w2bfwl5****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>节点名称。</p>
     * 
     * <strong>example:</strong>
     * <p>core1-1</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>节点状态。取值范围：</p>
     * <ul>
     * <li>Pending：创建中。</li>
     * <li>Starting：启动中。</li>
     * <li>Running：运行中。</li>
     * <li>Stopping：停止中。</li>
     * <li>Stopped：已停止。</li>
     * <li>Terminated：已终止。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("NodeState")
    public String nodeState;

    /**
     * <p>私网IP。</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.1</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>公网IP。</p>
     * 
     * <strong>example:</strong>
     * <p>42.120.75.***</p>
     */
    @NameInMap("PublicIp")
    public String publicIp;

    /**
     * <p>可用区ID。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static Node build(java.util.Map<String, ?> map) throws Exception {
        Node self = new Node();
        return TeaModel.build(map, self);
    }

    public Node setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public Node setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public Node setAutoRenewDurationUnit(String autoRenewDurationUnit) {
        this.autoRenewDurationUnit = autoRenewDurationUnit;
        return this;
    }
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    public Node setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Node setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public Node setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public Node setMaintenanceStatus(String maintenanceStatus) {
        this.maintenanceStatus = maintenanceStatus;
        return this;
    }
    public String getMaintenanceStatus() {
        return this.maintenanceStatus;
    }

    public Node setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public Node setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public Node setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public Node setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public Node setNodeState(String nodeState) {
        this.nodeState = nodeState;
        return this;
    }
    public String getNodeState() {
        return this.nodeState;
    }

    public Node setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public Node setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public Node setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

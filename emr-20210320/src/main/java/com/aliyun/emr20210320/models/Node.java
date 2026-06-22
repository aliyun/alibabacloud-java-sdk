// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class Node extends TeaModel {
    /**
     * <p>Whether auto-renewal is enabled for the node. Valid values:</p>
     * <ul>
     * <li><p>true: Auto-renewal is enabled.</p>
     * </li>
     * <li><p>false: Auto-renewal is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration for the node.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The unit of the auto-renewal duration.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    /**
     * <p>The creation time of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>1603728394857</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The expiration time of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>1603728394857</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The instance type of the node. This corresponds to an ECS instance type. You can call the ECS <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the available instance types.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g7.xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maintenance status of the node. Valid values:</p>
     * <ul>
     * <li><p>ON: The node is in maintenance mode.</p>
     * </li>
     * <li><p>OFF: The node is not in maintenance mode.</p>
     * </li>
     * </ul>
     * <p>If this parameter is empty, the node is not in maintenance mode.</p>
     */
    @NameInMap("MaintenanceStatus")
    public String maintenanceStatus;

    /**
     * <p>The ID of the node group.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-869471354ecd****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The type of the node group. Valid values:</p>
     * <ul>
     * <li><p>MASTER: A master node group.</p>
     * </li>
     * <li><p>CORE: A core node group.</p>
     * </li>
     * <li><p>TASK: A task node group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CORE</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <p>The ID of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1cudc25w2bfwl5****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The name of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>core1-1</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The state of the node. Valid values:</p>
     * <ul>
     * <li><p>Pending: The node is being created.</p>
     * </li>
     * <li><p>Starting: The node is starting up.</p>
     * </li>
     * <li><p>Running: The node is operational and running services.</p>
     * </li>
     * <li><p>Stopping: The node is shutting down.</p>
     * </li>
     * <li><p>Stopped: The node is powered off.</p>
     * </li>
     * <li><p>Terminated: The node has been permanently deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("NodeState")
    public String nodeState;

    /**
     * <p>The private IP address of the node.</p>
     * 
     * <strong>example:</strong>
     * <p><code>10.10.**.**</code></p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>The public IP address of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>42.1.1.**</p>
     */
    @NameInMap("PublicIp")
    public String publicIp;

    /**
     * <p>The ID of the zone.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyDBResourceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-t7241****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterMode")
    public String clusterMode;

    @NameInMap("ClusterSizeResource")
    public String clusterSizeResource;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the cluster IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a specific region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("EngineParams")
    public String engineParamsShrink;

    /**
     * <p>The name of the resource group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The query execution mode. Valid values:</p>
     * <ul>
     * <li><strong>interactive</strong></li>
     * <li><strong>batch</strong></li>
     * </ul>
     * <blockquote>
     * <p> For more information, see <a href="https://help.aliyun.com/document_detail/189502.html">Query execution modes</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>batch</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("MaxClusterCount")
    public Integer maxClusterCount;

    @NameInMap("MaxComputeResource")
    public String maxComputeResource;

    @NameInMap("MinClusterCount")
    public Integer minClusterCount;

    @NameInMap("MinComputeResource")
    public String minComputeResource;

    /**
     * <p>The number of nodes. Default value: 0.</p>
     * <ul>
     * <li>Each node is configured with the resources of 16 cores and 64 GB memory.</li>
     * <li>Make sure that the amount of resources of the nodes (Number of nodes × 16 cores and 64 GB memory) is less than or equal to the amount of unused resources of the cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NodeNum")
    public Integer nodeNum;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The database accounts with which to associate the resource group. They can be standard accounts or privileged accounts.</p>
     */
    @NameInMap("PoolUserList")
    public String poolUserListShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBResourceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBResourceGroupShrinkRequest self = new ModifyDBResourceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBResourceGroupShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDBResourceGroupShrinkRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public ModifyDBResourceGroupShrinkRequest setClusterSizeResource(String clusterSizeResource) {
        this.clusterSizeResource = clusterSizeResource;
        return this;
    }
    public String getClusterSizeResource() {
        return this.clusterSizeResource;
    }

    public ModifyDBResourceGroupShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBResourceGroupShrinkRequest setEngineParamsShrink(String engineParamsShrink) {
        this.engineParamsShrink = engineParamsShrink;
        return this;
    }
    public String getEngineParamsShrink() {
        return this.engineParamsShrink;
    }

    public ModifyDBResourceGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDBResourceGroupShrinkRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public ModifyDBResourceGroupShrinkRequest setMaxClusterCount(Integer maxClusterCount) {
        this.maxClusterCount = maxClusterCount;
        return this;
    }
    public Integer getMaxClusterCount() {
        return this.maxClusterCount;
    }

    public ModifyDBResourceGroupShrinkRequest setMaxComputeResource(String maxComputeResource) {
        this.maxComputeResource = maxComputeResource;
        return this;
    }
    public String getMaxComputeResource() {
        return this.maxComputeResource;
    }

    public ModifyDBResourceGroupShrinkRequest setMinClusterCount(Integer minClusterCount) {
        this.minClusterCount = minClusterCount;
        return this;
    }
    public Integer getMinClusterCount() {
        return this.minClusterCount;
    }

    public ModifyDBResourceGroupShrinkRequest setMinComputeResource(String minComputeResource) {
        this.minComputeResource = minComputeResource;
        return this;
    }
    public String getMinComputeResource() {
        return this.minComputeResource;
    }

    public ModifyDBResourceGroupShrinkRequest setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Integer getNodeNum() {
        return this.nodeNum;
    }

    public ModifyDBResourceGroupShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBResourceGroupShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBResourceGroupShrinkRequest setPoolUserListShrink(String poolUserListShrink) {
        this.poolUserListShrink = poolUserListShrink;
        return this;
    }
    public String getPoolUserListShrink() {
        return this.poolUserListShrink;
    }

    public ModifyDBResourceGroupShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBResourceGroupShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

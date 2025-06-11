// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBResourceGroupShrinkRequest extends TeaModel {
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

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineParams")
    public String engineParamsShrink;

    /**
     * <p>The name of the resource group.</p>
     * <ul>
     * <li>The name can be up to 255 characters in length.</li>
     * <li>The name must start with an uppercase letter or a digit.</li>
     * <li>The name can contain uppercase letters, digits, hyphens (-), and underscores (_).</li>
     * </ul>
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
     * <li><strong>interactive</strong> (default)</li>
     * <li><strong>batch</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>interactive</p>
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
     * <p>2</p>
     */
    @NameInMap("NodeNum")
    public Integer nodeNum;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateDBResourceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourceGroupShrinkRequest self = new CreateDBResourceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBResourceGroupShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBResourceGroupShrinkRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public CreateDBResourceGroupShrinkRequest setClusterSizeResource(String clusterSizeResource) {
        this.clusterSizeResource = clusterSizeResource;
        return this;
    }
    public String getClusterSizeResource() {
        return this.clusterSizeResource;
    }

    public CreateDBResourceGroupShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBResourceGroupShrinkRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateDBResourceGroupShrinkRequest setEngineParamsShrink(String engineParamsShrink) {
        this.engineParamsShrink = engineParamsShrink;
        return this;
    }
    public String getEngineParamsShrink() {
        return this.engineParamsShrink;
    }

    public CreateDBResourceGroupShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDBResourceGroupShrinkRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public CreateDBResourceGroupShrinkRequest setMaxClusterCount(Integer maxClusterCount) {
        this.maxClusterCount = maxClusterCount;
        return this;
    }
    public Integer getMaxClusterCount() {
        return this.maxClusterCount;
    }

    public CreateDBResourceGroupShrinkRequest setMaxComputeResource(String maxComputeResource) {
        this.maxComputeResource = maxComputeResource;
        return this;
    }
    public String getMaxComputeResource() {
        return this.maxComputeResource;
    }

    public CreateDBResourceGroupShrinkRequest setMinClusterCount(Integer minClusterCount) {
        this.minClusterCount = minClusterCount;
        return this;
    }
    public Integer getMinClusterCount() {
        return this.minClusterCount;
    }

    public CreateDBResourceGroupShrinkRequest setMinComputeResource(String minComputeResource) {
        this.minComputeResource = minComputeResource;
        return this;
    }
    public String getMinComputeResource() {
        return this.minComputeResource;
    }

    public CreateDBResourceGroupShrinkRequest setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Integer getNodeNum() {
        return this.nodeNum;
    }

    public CreateDBResourceGroupShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBResourceGroupShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBResourceGroupShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBResourceGroupShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

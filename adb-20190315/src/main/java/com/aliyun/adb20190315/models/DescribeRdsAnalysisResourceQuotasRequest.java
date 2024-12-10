// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeRdsAnalysisResourceQuotasRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mixed_storage</p>
     */
    @NameInMap("ClusterCategory")
    public String clusterCategory;

    /**
     * <strong>example:</strong>
     * <p>flexible</p>
     */
    @NameInMap("ClusterMode")
    public String clusterMode;

    /**
     * <strong>example:</strong>
     * <p>E32</p>
     */
    @NameInMap("NodeClass")
    public String nodeClass;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>rm-2ze09tofcv39h7165</p>
     */
    @NameInMap("RdsInstanceId")
    public String rdsInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-4690g37929****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static DescribeRdsAnalysisResourceQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsAnalysisResourceQuotasRequest self = new DescribeRdsAnalysisResourceQuotasRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsAnalysisResourceQuotasRequest setClusterCategory(String clusterCategory) {
        this.clusterCategory = clusterCategory;
        return this;
    }
    public String getClusterCategory() {
        return this.clusterCategory;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }
    public String getClusterMode() {
        return this.clusterMode;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setNodeClass(String nodeClass) {
        this.nodeClass = nodeClass;
        return this;
    }
    public String getNodeClass() {
        return this.nodeClass;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }
    public String getRdsInstanceId() {
        return this.rdsInstanceId;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRdsAnalysisResourceQuotasRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}

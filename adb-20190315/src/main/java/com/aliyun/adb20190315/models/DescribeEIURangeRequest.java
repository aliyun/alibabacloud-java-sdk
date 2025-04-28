// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeEIURangeRequest extends TeaModel {
    /**
     * <p>The specifications of computing resources.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/469002.html">DescribeComputeResource</a> operation to query the specifications of computing resources.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;RealValue&quot;: &quot;32Core128GBNEW&quot;,
     *       &quot;DisplayValue&quot;: &quot;32Core128GB&quot;
     *     }</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
     * <ul>
     * <li>This parameter can be left empty when <strong>Operation</strong> is set to <strong>Buy</strong>.</li>
     * <li>This parameter must be specified when <strong>Operation</strong> is set to <strong>Upgrade</strong> or <strong>Downgrade</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>am-bp16t5ci7r74s****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The version of the AnalyticDB for MySQL Data Warehouse Edition cluster. Set the value to <strong>3.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>The type of the operation. Valid values:</p>
     * <ul>
     * <li><strong>Buy</strong>: purchases a cluster.</li>
     * <li><strong>Modify</strong>: changes configurations of a cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Buy</p>
     */
    @NameInMap("Operation")
    public String operation;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProductVersion")
    public String productVersion;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
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
     * <p>The specifications of storage resources. Default value: <strong>8ACU</strong>. Valid values:</p>
     * <ul>
     * <li><strong>8ACU</strong></li>
     * <li><strong>12ACU</strong></li>
     * <li><strong>16ACU</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8ACU</p>
     */
    @NameInMap("StorageSize")
    public String storageSize;

    /**
     * <p>The type of the sub-operation. Valid values:</p>
     * <ul>
     * <li><strong>Upgrade</strong>: upgrades a cluster.</li>
     * <li><strong>Downgrade</strong>: downgrades a cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Upgrade</p>
     */
    @NameInMap("SubOperation")
    public String subOperation;

    /**
     * <p>The zone ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/612293.html">DescribeRegions</a> operation to query the most recent zone list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeEIURangeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEIURangeRequest self = new DescribeEIURangeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEIURangeRequest setComputeResource(String computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public String getComputeResource() {
        return this.computeResource;
    }

    public DescribeEIURangeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeEIURangeRequest setDBClusterVersion(String DBClusterVersion) {
        this.DBClusterVersion = DBClusterVersion;
        return this;
    }
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    public DescribeEIURangeRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public DescribeEIURangeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeEIURangeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEIURangeRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public DescribeEIURangeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEIURangeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeEIURangeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEIURangeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEIURangeRequest setStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public String getStorageSize() {
        return this.storageSize;
    }

    public DescribeEIURangeRequest setSubOperation(String subOperation) {
        this.subOperation = subOperation;
        return this;
    }
    public String getSubOperation() {
        return this.subOperation;
    }

    public DescribeEIURangeRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}

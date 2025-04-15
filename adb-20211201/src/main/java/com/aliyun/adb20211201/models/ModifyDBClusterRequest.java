// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>The reserved computing resources. Valid values: 0ACU to 4096ACU. The value must be in increments of 16ACU. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
     * <blockquote>
     * <p> This parameter must be specified with a unit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16ACU</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to allocate all reserved computing resources to the user_default resource group. Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDefaultResourcePool")
    public Boolean enableDefaultResourcePool;

    /**
     * <strong>example:</strong>
     * <p>LegacyForm</p>
     */
    @NameInMap("ProductForm")
    public String productForm;

    /**
     * <p>The region ID of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReservedNodeCount")
    public Integer reservedNodeCount;

    /**
     * <strong>example:</strong>
     * <p>LegacyForm</p>
     */
    @NameInMap("ReservedNodeSize")
    public String reservedNodeSize;

    /**
     * <p>The reserved storage resources. Valid values: 0ACU to 2064ACU. The value must be in increments of 24ACU. Each ACU is approximately equal to 1 core and 4 GB memory.</p>
     * <blockquote>
     * <p> This parameter must be specified with a unit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>24ACU</p>
     */
    @NameInMap("StorageResource")
    public String storageResource;

    public static ModifyDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterRequest self = new ModifyDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterRequest setComputeResource(String computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public String getComputeResource() {
        return this.computeResource;
    }

    public ModifyDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterRequest setEnableDefaultResourcePool(Boolean enableDefaultResourcePool) {
        this.enableDefaultResourcePool = enableDefaultResourcePool;
        return this;
    }
    public Boolean getEnableDefaultResourcePool() {
        return this.enableDefaultResourcePool;
    }

    public ModifyDBClusterRequest setProductForm(String productForm) {
        this.productForm = productForm;
        return this;
    }
    public String getProductForm() {
        return this.productForm;
    }

    public ModifyDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBClusterRequest setReservedNodeCount(Integer reservedNodeCount) {
        this.reservedNodeCount = reservedNodeCount;
        return this;
    }
    public Integer getReservedNodeCount() {
        return this.reservedNodeCount;
    }

    public ModifyDBClusterRequest setReservedNodeSize(String reservedNodeSize) {
        this.reservedNodeSize = reservedNodeSize;
        return this;
    }
    public String getReservedNodeSize() {
        return this.reservedNodeSize;
    }

    public ModifyDBClusterRequest setStorageResource(String storageResource) {
        this.storageResource = storageResource;
        return this;
    }
    public String getStorageResource() {
        return this.storageResource;
    }

}

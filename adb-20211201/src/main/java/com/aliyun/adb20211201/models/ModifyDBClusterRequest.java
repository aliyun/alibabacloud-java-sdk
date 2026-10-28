// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>The number of AI nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AINodeNumber")
    public Integer AINodeNumber;

    /**
     * <p>The AI node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>ADB.MLPlus.4</p>
     */
    @NameInMap("AINodeSpec")
    public String AINodeSpec;

    /**
     * <p>The reserved compute resources. Valid values: 0 ACU to 4096 ACU. Step: 16. 1 ACU is approximately equal to 1 core and 4 GB of memory.</p>
     * <blockquote>
     * <p>Include the unit when you specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16ACU</p>
     */
    @NameInMap("ComputeResource")
    public String computeResource;

    /**
     * <p>The ID of the Data Lakehouse Edition cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454250.html">DescribeDBClusters</a> operation to query the ID of the Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to allocate all reserved compute resources to the default resource group (user_default). Valid values:</p>
     * <ul>
     * <li>true (default): Yes.</li>
     * <li>false: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableDefaultResourcePool")
    public Boolean enableDefaultResourcePool;

    /**
     * <p>The product form. Valid values:</p>
     * <ul>
     * <li><strong>IntegrationForm</strong>: Integration form.</li>
     * <li><strong>LegacyForm</strong>: Data Lakehouse Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LegacyForm</p>
     */
    @NameInMap("ProductForm")
    public String productForm;

    /**
     * <p>The target product version. When you switch from LegacyForm to IntegrationForm Enterprise Edition in-place, set this parameter to enterprise_version and specify ProductForm, ReservedNodeSize, and ReservedNodeCount at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise_version</p>
     */
    @NameInMap("ProductVersion")
    public String productVersion;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the region ID of the specified Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of reserved nodes. </p>
     * <ul>
     * <li>For Enterprise Edition, the default value is 3 and the step is 3.</li>
     * <li>For Basic Edition, the default value is 1.<blockquote>
     * <p>Specify this parameter only when ProductForm is set to IntegrationForm.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ReservedNodeCount")
    public Integer reservedNodeCount;

    /**
     * <p>The node specifications for reserved storage resources. Valid values: 8 ACU, 12 ACU, and 16 ACU.</p>
     * <blockquote>
     * <p>Include the unit when you specify this parameter. Specify this parameter only when ProductForm is set to IntegrationForm.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8ACU</p>
     */
    @NameInMap("ReservedNodeSize")
    public String reservedNodeSize;

    /**
     * <p>The reserved storage resources. Valid values: 0 ACU to 2064 ACU. Step: 24. 1 ACU is approximately equal to 1 core and 4 GB of memory.</p>
     * <blockquote>
     * <p>Include the unit when you specify this parameter.</p>
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

    public ModifyDBClusterRequest setAINodeNumber(Integer AINodeNumber) {
        this.AINodeNumber = AINodeNumber;
        return this;
    }
    public Integer getAINodeNumber() {
        return this.AINodeNumber;
    }

    public ModifyDBClusterRequest setAINodeSpec(String AINodeSpec) {
        this.AINodeSpec = AINodeSpec;
        return this;
    }
    public String getAINodeSpec() {
        return this.AINodeSpec;
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

    public ModifyDBClusterRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
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

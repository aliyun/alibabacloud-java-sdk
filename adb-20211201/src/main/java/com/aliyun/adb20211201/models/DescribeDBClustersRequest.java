// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDBClustersRequest extends TeaModel {
    /**
     * <p>The cluster description.</p>
     * <ul>
     * <li><p>Cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>The description must be 2 to 256 characters long.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The cluster ID.</p>
     * <p>If you omit this parameter, the operation returns information about all clusters in the specified region.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    /**
     * <p>The cluster status. Valid values:</p>
     * <ul>
     * <li><p><strong>Preparing</strong>: The cluster is preparing.</p>
     * </li>
     * <li><p><strong>Creating</strong>: The cluster is being created.</p>
     * </li>
     * <li><p><strong>Running</strong>: The cluster is running.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The cluster is being deleted.</p>
     * </li>
     * <li><p><strong>Restoring</strong>: The cluster is being restored from a backup.</p>
     * </li>
     * <li><p><strong>ClassChanging</strong>: The cluster specifications are changing.</p>
     * </li>
     * <li><p><strong>NetAddressCreating</strong>: A network connection is being created for the cluster.</p>
     * </li>
     * <li><p><strong>NetAddressDeleting</strong>: The network connection of the cluster is being deleted.</p>
     * </li>
     * <li><p><strong>NetAddressModifying</strong>: The network connection of the cluster is being modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The cluster version. Valid values:</p>
     * <ul>
     * <li><p><strong>3.0</strong>: Data Warehouse edition.</p>
     * </li>
     * <li><p><strong>5.0</strong> (default): Includes the Lakehouse, Enterprise, and Basic editions.</p>
     * </li>
     * <li><p><strong>All</strong>: All editions, including the Data Warehouse, Lakehouse, Enterprise, and Basic editions.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("DBClusterVersion")
    public String DBClusterVersion;

    /**
     * <p>The page number. The value must be a positive integer. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong> (default)</p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product version. Valid values:</p>
     * <ul>
     * <li><p><strong>EnterpriseVersion</strong>: Enterprise edition.</p>
     * </li>
     * <li><p><strong>BasicVersion</strong>: Basic edition.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you omit this parameter, the operation returns clusters of all product versions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BasicVersion</p>
     */
    @NameInMap("ProductVersion")
    public String productVersion;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/454314.html">DescribeRegions</a> operation to query the IDs of available regions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If you omit this parameter, the operation returns information about clusters in all resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4690g37929****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags to filter clusters by.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDBClustersRequestTag> tag;

    public static DescribeDBClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersRequest self = new DescribeDBClustersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDBClustersRequest setDBClusterIds(String DBClusterIds) {
        this.DBClusterIds = DBClusterIds;
        return this;
    }
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    public DescribeDBClustersRequest setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDBClustersRequest setDBClusterVersion(String DBClusterVersion) {
        this.DBClusterVersion = DBClusterVersion;
        return this;
    }
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    public DescribeDBClustersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBClustersRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public DescribeDBClustersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClustersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBClustersRequest setTag(java.util.List<DescribeDBClustersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBClustersRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDBClustersRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBClustersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersRequestTag self = new DescribeDBClustersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

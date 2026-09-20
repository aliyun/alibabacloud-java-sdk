// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The ID of target instance. You can call the <a href="https://help.aliyun.com/document_detail/144595.html">DescribeInstances</a> operation to query target instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp1u0639js2h7****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the ApsaraDB for HBase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><strong>hbase</strong>: ApsaraDB for HBase Standard Edition or ApsaraDB for HBase single-node.</li>
     * <li><strong>hbaseue</strong>: ApsaraDB for HBase Performance-enhanced Edition.</li>
     * <li><strong>bds</strong>: BDS data synchronization service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hbase</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <p>The page number of the instance list. Minimum value: <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of rows to display per page. Maximum value: <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region to which the instance belongs. You can call the <a href="https://help.aliyun.com/document_detail/144489.html">DescribeRegions</a> operation to query the region ID.</p>
     * <blockquote>
     * <p>If you specify the <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> parameters, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can query the resource group ID in the Resource Group console.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-4f51d54g5****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInstancesRequestTag> tag;

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeInstancesRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeInstancesRequest setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesRequest setTag(java.util.List<DescribeInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeInstancesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. The tag key and tag value form a key-value pair in the format of {&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag key. The tag value and tag key form a key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestTag self = new DescribeInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

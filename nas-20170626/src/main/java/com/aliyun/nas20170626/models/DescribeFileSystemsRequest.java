// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li>General-purpose NAS: 31a8e4****.</li>
     * <li>Extreme NAS: must start with extreme-, such as extreme-0015****.</li>
     * <li>CPFS (locally redundant): must start with cpfs-, such as cpfs-125487****.</li>
     * <li>CPFS SE (zone-redundant): must start with cpfsse-, such as cpfsse-022c71b134****.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The type of the file system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>all (default): queries all types.</li>
     * <li>standard: General-purpose NAS.</li>
     * <li>extreme: Extreme NAS.</li>
     * <li>cpfs: Cloud Parallel File Storage (locally redundant).</li>
     * <li>cpfsse: Cloud Parallel File Storage SE (zone-redundant).</li>
     * </ul>
     * <blockquote>
     * <p>To query multiple types, separate them with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The page number of the file system list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of file systems on each page during a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * <p>You can view the resource group ID in the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwavnfef****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The storage type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>General-purpose NAS: Capacity, Performance, and Premium.</li>
     * <li>Extreme NAS: standard and advance.</li>
     * <li>CPFS: advance_100 (100 MB/s/TiB baseline), advance_200 (200 MB/s/TiB baseline), and economic.</li>
     * <li>CPFS SE: advance_100 (100 MB/s/TiB baseline).</li>
     * <li>AgenticFS: Agentic (available only when FileSystemType is set to standard).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Capacity</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The collection of tag information.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeFileSystemsRequestTag> tag;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1sevsgtqvk5gxbl****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeFileSystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemsRequest self = new DescribeFileSystemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeFileSystemsRequest setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }
    public String getFileSystemType() {
        return this.fileSystemType;
    }

    public DescribeFileSystemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeFileSystemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFileSystemsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeFileSystemsRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeFileSystemsRequest setTag(java.util.List<DescribeFileSystemsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeFileSystemsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeFileSystemsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeFileSystemsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>Valid values of N: 1 to 20.</li>
         * <li>The tag value can be up to 128 characters in length.</li>
         * <li>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
         * <li>The tag value cannot contain <code>http://</code> or <code>https://</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFileSystemsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsRequestTag self = new DescribeFileSystemsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFileSystemsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

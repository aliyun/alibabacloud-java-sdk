// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li><p>For General-purpose NAS file systems, the ID is a string of characters, such as <code>31a8e4****</code>.</p>
     * </li>
     * <li><p>For Extreme NAS file systems, the ID must start with <code>extreme-</code>, such as <code>extreme-0015****</code>.</p>
     * </li>
     * <li><p>For Cloud Parallel File System (CPFS) file systems, the ID must start with <code>cpfs-</code>, such as <code>cpfs-125487****</code>.</p>
     * </li>
     * <li><p>For Cloud Parallel File System SE (CPFS SE) file systems, the ID must start with <code>cpfsse-</code>, such as <code>cpfsse-022c71b134****</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The file system type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>all</code> (default): all file system types.</p>
     * </li>
     * <li><p><code>standard</code>: General-purpose NAS.</p>
     * </li>
     * <li><p><code>extreme</code>: Extreme NAS.</p>
     * </li>
     * <li><p><code>cpfs</code>: Cloud Parallel File System (CPFS).</p>
     * </li>
     * <li><p><code>cpfsse</code>: Cloud Parallel File System SE (CPFS SE).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Separate multiple types with commas.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The page number of the file system list.</p>
     * <p>The page number starts at 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of file systems to return on each page.</p>
     * <p>Value range: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * <p>You can view this ID in the <a href="https://resourcemanager.console.aliyun.com/resource-groups?">Resource Management console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwavnfef****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags used to filter file systems. You can specify 1 to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeFileSystemsRequestTag> tag;

    /**
     * <p>The ID of the VPC.</p>
     * <p>The file system and the ECS instance used for mounting must be in the same VPC.</p>
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
         * <p>Limits:</p>
         * <ul>
         * <li></li>
         * <li><p>The tag key can be up to 128 characters long.</p>
         * </li>
         * <li><p>It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * </li>
         * <li><p>It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * </ul>
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
         * <li></li>
         * <li><p>The tag value can be up to 128 characters long.</p>
         * </li>
         * <li><p>It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * </li>
         * <li><p>It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </li>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>*   Sample ID of a General-purpose NAS file system: 31a8e4\\*\\*\\*\\*.</p>
     * <p>*   The IDs of Extreme NAS file systems must start with extreme-, for example, extreme-0015\\*\\*\\*\\*.</p>
     * <p>*   The IDs of Cloud Parallel File Storage (CPFS) file systems must start with cpfs-, for example, cpfs-125487\\*\\*\\*\\*.</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The type of the file system.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   all (default): all types</p>
     * <p>*   standard: General-purpose NAS file system</p>
     * <p>*   extreme: Extreme NAS file system</p>
     * <p>*   cpfs: CPFS file system</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     */
    @NameInMap("FileSystemType")
    public String fileSystemType;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The details about the tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeFileSystemsRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <br>
     * <p>If you want to mount the file system on an Elastic Compute Service (ECS) instance, the file system and the ECS instance must reside in the same VPC.</p>
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
         * <p>The key of tag N to add to the resource.</p>
         * <br>
         * <p>Limits:</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   The tag key must be 1 to 128 characters in length.</p>
         * <p>*   The tag key cannot start with `aliyun` or `acs:`.</p>
         * <p>*   The tag key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the resource.</p>
         * <br>
         * <p>Limits:</p>
         * <br>
         * <p>*   Valid values of N: 1 to 20.</p>
         * <p>*   The tag value must be 1 to 128 characters in length.</p>
         * <p>*   The tag value cannot start with `aliyun` or `acs:`.</p>
         * <p>*   The tag value cannot contain `http://` or `https://`.</p>
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

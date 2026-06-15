// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTagsRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is deprecated. We recommend that you use other parameters to ensure compatibility.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Category")
    public String category;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the tag list.</p>
     * <p>Starts from 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to obtain the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource. For example, if the <code>ResourceType</code> is <code>instance</code>, this parameter specifies the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>s-946ntx4wr****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p><code>instance</code>: an ECS instance.</p>
     * </li>
     * <li><p><code>disk</code>: a disk.</p>
     * </li>
     * <li><p><code>snapshot</code>: a snapshot.</p>
     * </li>
     * <li><p><code>image</code>: an image.</p>
     * </li>
     * <li><p><code>securitygroup</code>: a security group.</p>
     * </li>
     * <li><p><code>volume</code>: a volume.</p>
     * </li>
     * <li><p><code>eni</code>: an elastic network interface.</p>
     * </li>
     * <li><p><code>ddh</code>: a dedicated host.</p>
     * </li>
     * <li><p><code>keypair</code>: an SSH key pair.</p>
     * </li>
     * <li><p><code>launchtemplate</code>: a launch template.</p>
     * </li>
     * <li><p><code>reservedinstance</code>: a reserved instance.</p>
     * </li>
     * <li><p><code>snapshotpolicy</code>: a snapshot policy.</p>
     * </li>
     * </ul>
     * <p>All values must be in lowercase.</p>
     * 
     * <strong>example:</strong>
     * <p>snapshot</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeTagsRequestTag> tag;

    public static DescribeTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsRequest self = new DescribeTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeTagsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTagsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeTagsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeTagsRequest setTag(java.util.List<DescribeTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeTagsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <blockquote>
         * <p>We recommend that you use the <code>Tag.N.Key</code> parameter to ensure compatibility.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters in length and can be an empty string. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsRequestTag self = new DescribeTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

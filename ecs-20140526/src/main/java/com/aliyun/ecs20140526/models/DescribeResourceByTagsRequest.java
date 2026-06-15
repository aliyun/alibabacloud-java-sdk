// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourceByTagsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number to return. The minimum value is 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the resource is located. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p><code>instance</code>: ECS instance.</p>
     * </li>
     * <li><p><code>disk</code>: disk.</p>
     * </li>
     * <li><p><code>snapshot</code>: snapshot.</p>
     * </li>
     * <li><p><code>image</code>: image.</p>
     * </li>
     * <li><p><code>securitygroup</code>: security group.</p>
     * </li>
     * <li><p><code>volume</code>: volume.</p>
     * </li>
     * <li><p><code>eni</code>: elastic network interface.</p>
     * </li>
     * <li><p><code>ddh</code>: dedicated host.</p>
     * </li>
     * <li><p><code>keypair</code>: key pair.</p>
     * </li>
     * <li><p><code>launchtemplate</code>: launch template.</p>
     * </li>
     * </ul>
     * <p>All values must be in lowercase.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeResourceByTagsRequestTag> tag;

    public static DescribeResourceByTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByTagsRequest self = new DescribeResourceByTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeResourceByTagsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResourceByTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResourceByTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceByTagsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeResourceByTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeResourceByTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceByTagsRequest setTag(java.util.List<DescribeResourceByTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeResourceByTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeResourceByTagsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <blockquote>
         * <p>For best compatibility, we recommend that you use the <code>Tag.N.Key</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. An empty string is allowed. The value can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeResourceByTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsRequestTag self = new DescribeResourceByTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeResourceByTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

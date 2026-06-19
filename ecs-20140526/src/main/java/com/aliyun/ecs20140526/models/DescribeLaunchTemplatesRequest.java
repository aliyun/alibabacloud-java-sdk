// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplatesRequest extends TeaModel {
    /**
     * <p>An array of one or more launch template IDs.</p>
     * <ul>
     * <li><p>You can query up to 100 launch templates at a time.</p>
     * </li>
     * <li><p>You must specify LaunchTemplateId or LaunchTemplateName to determine the templates.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lt-m5e3ofjr1zn1aw7q****</p>
     */
    @NameInMap("LaunchTemplateId")
    public java.util.List<String> launchTemplateId;

    /**
     * <p>An array of one or more launch template names.</p>
     * <ul>
     * <li><p>You can query up to 100 launch templates at a time.</p>
     * </li>
     * <li><p>You must specify LaunchTemplateId or LaunchTemplateName to determine the templates.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>wd-152630748****</p>
     */
    @NameInMap("LaunchTemplateName")
    public java.util.List<String> launchTemplateName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the launch template list. Minimum value: 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paginated query.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <p>The ID of the resource group to which the launch template belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1000.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4p****</p>
     */
    @NameInMap("TemplateResourceGroupId")
    public String templateResourceGroupId;

    /**
     * <p>The list of tag key-value pairs of the launch template.</p>
     * <blockquote>
     * <p>Currently, you can create and query launch template tags only by calling API operations. The console does not support creating or viewing launch template tags.</p>
     * </blockquote>
     */
    @NameInMap("TemplateTag")
    public java.util.List<DescribeLaunchTemplatesRequestTemplateTag> templateTag;

    public static DescribeLaunchTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplatesRequest self = new DescribeLaunchTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplatesRequest setLaunchTemplateId(java.util.List<String> launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public java.util.List<String> getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public DescribeLaunchTemplatesRequest setLaunchTemplateName(java.util.List<String> launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public java.util.List<String> getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public DescribeLaunchTemplatesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeLaunchTemplatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLaunchTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLaunchTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLaunchTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLaunchTemplatesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLaunchTemplatesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeLaunchTemplatesRequest setTemplateResourceGroupId(String templateResourceGroupId) {
        this.templateResourceGroupId = templateResourceGroupId;
        return this;
    }
    public String getTemplateResourceGroupId() {
        return this.templateResourceGroupId;
    }

    public DescribeLaunchTemplatesRequest setTemplateTag(java.util.List<DescribeLaunchTemplatesRequestTemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<DescribeLaunchTemplatesRequestTemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public static class DescribeLaunchTemplatesRequestTemplateTag extends TeaModel {
        /**
         * <p>The tag key of the launch template. Valid values of N: 1 to 20.</p>
         * <p>If you use a single tag to filter resources, the number of resources with the specified tag cannot exceed 1000. If you use multiple tags to filter resources, the number of resources that are bound with all the specified tags cannot exceed 1000. If the number of resources exceeds 1000, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query them.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the launch template. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLaunchTemplatesRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLaunchTemplatesRequestTemplateTag self = new DescribeLaunchTemplatesRequestTemplateTag();
            return TeaModel.build(map, self);
        }

        public DescribeLaunchTemplatesRequestTemplateTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLaunchTemplatesRequestTemplateTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

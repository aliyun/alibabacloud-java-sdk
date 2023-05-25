// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeActivationsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("ActivationId")
    public String activationId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>An array that consists of the tags of the activation code.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The information about the tag of the activation code.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The default instance name prefix.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The key of tag N of the activation code. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
     * <br>
     * <p>Up to 1,000 resources that have the specified tags can be returned in the response. To query more than 1,000 resources that have the specified tags, call the [ListTagResources](~~110425~~) operation.</p>
     * <br>
     * <p>The tag key is up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeActivationsRequestTag> tag;

    public static DescribeActivationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationsRequest self = new DescribeActivationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActivationsRequest setActivationId(String activationId) {
        this.activationId = activationId;
        return this;
    }
    public String getActivationId() {
        return this.activationId;
    }

    public DescribeActivationsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeActivationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeActivationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeActivationsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActivationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeActivationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeActivationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeActivationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeActivationsRequest setTag(java.util.List<DescribeActivationsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeActivationsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeActivationsRequestTag extends TeaModel {
        /**
         * <p>The number of entries to return on each page.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeActivationsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeActivationsRequestTag self = new DescribeActivationsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeActivationsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeActivationsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

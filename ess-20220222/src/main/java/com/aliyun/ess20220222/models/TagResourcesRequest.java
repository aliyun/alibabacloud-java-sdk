// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The type of the Auto Scaling resource. Only scaling groups are supported. Set the value to scalinggroup.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceIds")
    public java.util.List<String> resourceIds;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the resource.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Details of the tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<TagResourcesRequestTags> tags;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceIds(java.util.List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    public TagResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTags(java.util.List<TagResourcesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TagResourcesRequestTags> getTags() {
        return this.tags;
    }

    public static class TagResourcesRequestTags extends TeaModel {
        /**
         * <p>The value of the tag that you want to add to the Auto Scaling resource.</p>
         * <br>
         * <p>You can specify empty strings as tag values. The tag value must be 0 to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Propagate")
        public Boolean propagate;

        /**
         * <p>Specifies whether to propagate the tag that you want to add. Valid values:</p>
         * <br>
         * <p>*   true: propagates the tag only to instances that are newly created and does not propagate the tag to instances that are already running in the scaling group.</p>
         * <p>*   false: does not propagate the tag to any instances.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTags self = new TagResourcesRequestTags();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTags setPropagate(Boolean propagate) {
            this.propagate = propagate;
            return this;
        }
        public Boolean getPropagate() {
            return this.propagate;
        }

        public TagResourcesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

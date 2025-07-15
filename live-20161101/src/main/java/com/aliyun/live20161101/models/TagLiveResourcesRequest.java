// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class TagLiveResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the resources. Set the value to <strong>DOMAIN</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOMAIN</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagLiveResourcesRequestTag> tag;

    public static TagLiveResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagLiveResourcesRequest self = new TagLiveResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagLiveResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagLiveResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagLiveResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagLiveResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagLiveResourcesRequest setTag(java.util.List<TagLiveResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagLiveResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagLiveResourcesRequestTag extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagLiveResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagLiveResourcesRequestTag self = new TagLiveResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagLiveResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagLiveResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveTagResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The N resources. The resources are domain names in this operation. Valid values of N: <strong>1 to 50</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resources. Set the value to <strong>DOMAIN</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOMAIN</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The N tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeLiveTagResourcesRequestTag> tag;

    public static DescribeLiveTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveTagResourcesRequest self = new DescribeLiveTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public DescribeLiveTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeLiveTagResourcesRequest setTag(java.util.List<DescribeLiveTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeLiveTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeLiveTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. Valid values of N: <strong>1 to 20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. Valid values of N: <strong>1 to 20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeLiveTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveTagResourcesRequestTag self = new DescribeLiveTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeLiveTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLiveTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

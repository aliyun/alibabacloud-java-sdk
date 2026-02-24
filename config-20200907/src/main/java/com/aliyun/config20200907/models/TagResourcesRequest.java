// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The type of the resource in CloudConfig. Valid values:</p>
     * <ul>
     * <li><p><code>ACS::Config::Rule</code>: a rule for a single account.</p>
     * </li>
     * <li><p><code>ACS::Config::AggregateConfigRule</code>: a rule for multiple accounts.</p>
     * </li>
     * <li><p><code>ACS::Config::Aggregator</code>: an account group.</p>
     * </li>
     * <li><p><code>ACS::Config::CompliancePack</code>: a compliance package for a single account.</p>
     * </li>
     * <li><p><code>ACS::Config::AggregateCompliancePack</code>: a compliance package for multiple accounts.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::Config::Rule</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags of the resource.</p>
     * <p>You can attach a maximum of 20 tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public java.util.List<TagResourcesRequestTag> tag;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTag(java.util.List<TagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class TagResourcesRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>You can attach a maximum of 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>Env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>You can attach a maximum of 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static TagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesRequestTag self = new TagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

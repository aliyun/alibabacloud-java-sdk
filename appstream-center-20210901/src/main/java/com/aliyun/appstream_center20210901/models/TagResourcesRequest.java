// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
    /**
     * <p>The region ID. This parameter is required. Set this parameter to the ID of the region where the delivery group resides, such as <code>cn-hangzhou</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of resource IDs to which you want to bind tags. This parameter is required. Specify delivery group IDs. You can specify up to 50 IDs in a single request. Duplicate IDs are automatically deduplicated.</p>
     * <p><strong>All IDs must be existing delivery groups under the current Alibaba Cloud account.</strong> If any ID does not exist or does not belong to the current account, the entire request fails and the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned. No tags are bound to any resource.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The resource type. This parameter is required. <strong>Currently, only delivery groups are supported.</strong> The value is case-insensitive. We recommend that you use uppercase letters.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>APPINSTANCEGROUP: China Office (Chinese: Wuying) delivery group.</li>
     * </ul>
     * <p>If you specify another value, the error code <code>InvalidResourceType.Invalid</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APPINSTANCEGROUP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The list of tags to bind. This parameter is required. You can specify up to 20 tags in a single request. Each tag must include both <code>Key</code> and <code>Value</code>.</p>
     * <ul>
     * <li>Tag keys in the same request must be unique. Otherwise, the error code <code>InvalidTag.Duplicated</code> is returned.</li>
     * <li>If a tag key already exists on the resource, the tag value is updated to the value specified in the current request.</li>
     * <li>A maximum of 20 custom tags can be bound to a single resource. If this limit is exceeded, the error code <code>ResourceTag.CustomTagCountExceed</code> is returned.</li>
     * </ul>
     * <p>Tag keys that start with <code>System/</code> are China Office (Chinese: Wuying) system tags. Only the following values are supported, and the tag value can be only <code>true</code> or <code>false</code>:</p>
     * <ul>
     * <li><code>System/Scheduler/GRAYSCALE</code>: the canary release tag for the delivery group.</li>
     * <li><code>System/Scheduler/STOP_NEW_USER_CONNECTION</code>: prevents newly bound users from establishing connections to the delivery group.</li>
     * </ul>
     * <p>If you specify other tag keys that start with <code>System/</code>, the error code <code>InvalidTag.SystemTagKeyInvalid</code> or <code>InvalidTag.SystemKeyNotAllow</code> is returned.</p>
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
         * <p>The tag key. This parameter is required. The tag key must be 1 to 128 characters in length and is case-sensitive. The tag key cannot start with <code>aliyun</code> or <code>acs:</code> (case-insensitive) and cannot contain <code>http://</code> or <code>https://</code>. Letters, digits, spaces, and common punctuation marks are supported. If the tag key does not comply with the rules, the error code <code>InvalidTagPolicy.KeyInvalid</code> is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Resolution</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. This parameter is required. The tag value must be 0 to 256 characters in length and is case-sensitive. An empty string is allowed. The tag value cannot contain <code>http://</code> or <code>https://</code>. If the tag value does not comply with the rules, the error code <code>InvalidTagPolicy.ValueInvalid</code> is returned.</p>
         * <p>If the tag key is a system tag, the tag value can be only <code>true</code> or <code>false</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>720p</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
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

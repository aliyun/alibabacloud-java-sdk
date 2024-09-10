// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class AddTagsRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <p>Valid values of N: 1 to 20.</p>
     * <p>For more information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7301****</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddTagsRequestTag> tag;

    public static AddTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsRequest self = new AddTagsRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public AddTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddTagsRequest setTag(java.util.List<AddTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class AddTagsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <p>Valid values of N: 1 to 3. A tag key can be 1 to 64 characters in length.</p>
         * <p>You can create a tag key or specify an existing tag key. For more information about how to obtain a tag key, see <a href="https://help.aliyun.com/document_detail/145558.html">DescribeTagKeyList</a>.</p>
         * <blockquote>
         * <p>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key (<code>Tag.N.Key</code>) and tag value (<code>Tag.N.Value</code>) must be specified at the same time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <p>Valid values of N: 1 to 3. A tag value can be 1 to 64 characters in length.</p>
         * <p>You can create a tag value or specify an existing tag value. For more information about how to obtain a tag value, see <a href="https://help.aliyun.com/document_detail/145557.html">DescribeTagKeyList</a>.</p>
         * <blockquote>
         * <p>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key (<code>Tag.N.Key</code>) and tag value (<code>Tag.N.Value</code>) must be specified at the same time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddTagsRequestTag self = new AddTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public AddTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

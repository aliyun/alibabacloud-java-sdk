// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class AddTagsRequest extends TeaModel {
    /**
     * <p>The IDs of the application groups.</p>
     * <p>The value of N can be from 1 to 20.</p>
     * <p>For information about how to obtain application group IDs, see <a href="https://help.aliyun.com/document_detail/2513168.html">DescribeMonitorGroups</a>.</p>
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
     * <p>A list of tags.</p>
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
         * <p>The tag key.</p>
         * <p>The value of N can be from 1 to 3. The tag key must be 1 to 64 characters in length.</p>
         * <p>Enter a new tag key or use an existing tag key from Cloud Monitor. For information about how to obtain tag keys, see <a href="https://help.aliyun.com/document_detail/2513189.html">DescribeTagKeyList</a>.</p>
         * <blockquote>
         * <p>The tag key cannot start with <code>aliyun</code> or <code>acs:</code>. The <code>Tag.N.Key</code> and <code>Tag.N.Value</code> parameters must be specified together.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The value of N can be from 1 to 3. The tag value must be 1 to 64 characters in length.</p>
         * <p>Enter a new tag value or use an existing tag value from Cloud Monitor. For information about how to obtain tag values, see <a href="https://help.aliyun.com/document_detail/2513188.html">DescribeTagValueList</a>.</p>
         * <blockquote>
         * <p>The tag value cannot start with <code>aliyun</code> or <code>acs:</code>. The <code>Tag.N.Key</code> and <code>Tag.N.Value</code> parameters must be specified together.</p>
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

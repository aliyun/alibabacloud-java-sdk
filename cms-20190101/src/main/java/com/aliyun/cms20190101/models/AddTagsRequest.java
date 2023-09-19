// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class AddTagsRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <br>
     * <p>Valid values of N: 1 to 20.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags.</p>
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
         * <br>
         * <p>Valid values of N: 1 to 3. A tag key can be 1 to 64 characters in length.</p>
         * <br>
         * <p>You can create a tag key or specify an existing tag key. For more information about how to obtain a tag key, see [DescribeTagKeyList](~~145558~~).</p>
         * <br>
         * <p>> The tag key cannot start with `aliyun` or `acs:`. The tag key (`Tag.N.Key`) and tag value (`Tag.N.Value`) must be specified at the same time.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <br>
         * <p>Valid values of N: 1 to 3. A tag value can be 1 to 64 characters in length.</p>
         * <br>
         * <p>You can create a tag value or specify an existing tag value. For more information about how to obtain a tag value, see [DescribeTagKeyList](~~145557~~).</p>
         * <br>
         * <p>> The tag value cannot start with `aliyun` or `acs:`. The tag key (`Tag.N.Key`) and tag value (`Tag.N.Value`) must be specified at the same time.</p>
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

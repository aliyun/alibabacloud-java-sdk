// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class RemoveTagsRequest extends TeaModel {
    /**
     * <p>The IDs of the application groups.</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RemoveTagsRequestTag> tag;

    public static RemoveTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsRequest self = new RemoveTagsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTagsRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public RemoveTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveTagsRequest setTag(java.util.List<RemoveTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RemoveTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class RemoveTagsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <br>
         * <p>> The tag key (`Tag.N.Key`) and tag value (`Tag.N.Value`) must be specified at the same time.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>> The tag key (`Tag.N.Key`) and tag value (`Tag.N.Value`) must be specified at the same time.</p>
         */
        @NameInMap("Value")
        public String value;

        public static RemoveTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RemoveTagsRequestTag self = new RemoveTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public RemoveTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RemoveTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

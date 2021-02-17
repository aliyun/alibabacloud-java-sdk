// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class ListSetTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("Tags")
    public java.util.List<ListSetTagsResponseBodyTags> tags;

    public static ListSetTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSetTagsResponseBody self = new ListSetTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSetTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSetTagsResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public ListSetTagsResponseBody setTags(java.util.List<ListSetTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListSetTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListSetTagsResponseBodyTags extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagCount")
        public Integer tagCount;

        @NameInMap("TagLevel")
        public Integer tagLevel;

        public static ListSetTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListSetTagsResponseBodyTags self = new ListSetTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListSetTagsResponseBodyTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListSetTagsResponseBodyTags setTagCount(Integer tagCount) {
            this.tagCount = tagCount;
            return this;
        }
        public Integer getTagCount() {
            return this.tagCount;
        }

        public ListSetTagsResponseBodyTags setTagLevel(Integer tagLevel) {
            this.tagLevel = tagLevel;
            return this;
        }
        public Integer getTagLevel() {
            return this.tagLevel;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<ListPrivateAccessTagsResponseBodyTags> tags;

    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListPrivateAccessTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessTagsResponseBody self = new ListPrivateAccessTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivateAccessTagsResponseBody setTags(java.util.List<ListPrivateAccessTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListPrivateAccessTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public ListPrivateAccessTagsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListPrivateAccessTagsResponseBodyTags extends TeaModel {
        @NameInMap("ApplicationIds")
        public java.util.List<String> applicationIds;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagType")
        public String tagType;

        public static ListPrivateAccessTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateAccessTagsResponseBodyTags self = new ListPrivateAccessTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListPrivateAccessTagsResponseBodyTags setApplicationIds(java.util.List<String> applicationIds) {
            this.applicationIds = applicationIds;
            return this;
        }
        public java.util.List<String> getApplicationIds() {
            return this.applicationIds;
        }

        public ListPrivateAccessTagsResponseBodyTags setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrivateAccessTagsResponseBodyTags setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrivateAccessTagsResponseBodyTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivateAccessTagsResponseBodyTags setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public ListPrivateAccessTagsResponseBodyTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListPrivateAccessTagsResponseBodyTags setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

    }

}

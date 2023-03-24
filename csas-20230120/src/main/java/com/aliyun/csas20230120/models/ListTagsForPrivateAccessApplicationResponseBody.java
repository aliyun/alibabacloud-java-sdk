// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListTagsForPrivateAccessApplicationResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListTagsForPrivateAccessApplicationResponseBodyApplications> applications;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTagsForPrivateAccessApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsForPrivateAccessApplicationResponseBody self = new ListTagsForPrivateAccessApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsForPrivateAccessApplicationResponseBody setApplications(java.util.List<ListTagsForPrivateAccessApplicationResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListTagsForPrivateAccessApplicationResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListTagsForPrivateAccessApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagType")
        public String tagType;

        public static ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags self = new ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags();
            return TeaModel.build(map, self);
        }

        public ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

    }

    public static class ListTagsForPrivateAccessApplicationResponseBodyApplications extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("Tags")
        public java.util.List<ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags> tags;

        public static ListTagsForPrivateAccessApplicationResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListTagsForPrivateAccessApplicationResponseBodyApplications self = new ListTagsForPrivateAccessApplicationResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListTagsForPrivateAccessApplicationResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListTagsForPrivateAccessApplicationResponseBodyApplications setTags(java.util.List<ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTagsForPrivateAccessApplicationResponseBodyApplicationsTags> getTags() {
            return this.tags;
        }

    }

}

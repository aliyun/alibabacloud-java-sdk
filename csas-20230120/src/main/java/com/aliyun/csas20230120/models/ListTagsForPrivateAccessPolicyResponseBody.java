// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListTagsForPrivateAccessPolicyResponseBody extends TeaModel {
    @NameInMap("Polices")
    public java.util.List<ListTagsForPrivateAccessPolicyResponseBodyPolices> polices;

    /**
     * <strong>example:</strong>
     * <p>9EE61139-A6A8-5E13-80AF-83435C21B26B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTagsForPrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsForPrivateAccessPolicyResponseBody self = new ListTagsForPrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsForPrivateAccessPolicyResponseBody setPolices(java.util.List<ListTagsForPrivateAccessPolicyResponseBodyPolices> polices) {
        this.polices = polices;
        return this;
    }
    public java.util.List<ListTagsForPrivateAccessPolicyResponseBodyPolices> getPolices() {
        return this.polices;
    }

    public ListTagsForPrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTagsForPrivateAccessPolicyResponseBodyPolicesTags extends TeaModel {
        /**
         * <p>内网访问标签创建时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-21 14:10:16</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>tag_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>tag-d3f64e8bdd4a****</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("TagType")
        public String tagType;

        public static ListTagsForPrivateAccessPolicyResponseBodyPolicesTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagsForPrivateAccessPolicyResponseBodyPolicesTags self = new ListTagsForPrivateAccessPolicyResponseBodyPolicesTags();
            return TeaModel.build(map, self);
        }

        public ListTagsForPrivateAccessPolicyResponseBodyPolicesTags setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTagsForPrivateAccessPolicyResponseBodyPolicesTags setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTagsForPrivateAccessPolicyResponseBodyPolicesTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTagsForPrivateAccessPolicyResponseBodyPolicesTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public ListTagsForPrivateAccessPolicyResponseBodyPolicesTags setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

    }

    public static class ListTagsForPrivateAccessPolicyResponseBodyPolices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pa-policy-1b0d0e8b4bcf****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("Tags")
        public java.util.List<ListTagsForPrivateAccessPolicyResponseBodyPolicesTags> tags;

        public static ListTagsForPrivateAccessPolicyResponseBodyPolices build(java.util.Map<String, ?> map) throws Exception {
            ListTagsForPrivateAccessPolicyResponseBodyPolices self = new ListTagsForPrivateAccessPolicyResponseBodyPolices();
            return TeaModel.build(map, self);
        }

        public ListTagsForPrivateAccessPolicyResponseBodyPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListTagsForPrivateAccessPolicyResponseBodyPolices setTags(java.util.List<ListTagsForPrivateAccessPolicyResponseBodyPolicesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTagsForPrivateAccessPolicyResponseBodyPolicesTags> getTags() {
            return this.tags;
        }

    }

}

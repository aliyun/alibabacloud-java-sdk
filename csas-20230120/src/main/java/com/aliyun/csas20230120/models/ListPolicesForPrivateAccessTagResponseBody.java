// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<ListPolicesForPrivateAccessTagResponseBodyTags> tags;

    public static ListPolicesForPrivateAccessTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForPrivateAccessTagResponseBody self = new ListPolicesForPrivateAccessTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicesForPrivateAccessTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicesForPrivateAccessTagResponseBody setTags(java.util.List<ListPolicesForPrivateAccessTagResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListPolicesForPrivateAccessTagResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes extends TeaModel {
        @NameInMap("IdpId")
        public Integer idpId;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("UserGroupType")
        public String userGroupType;

        @NameInMap("Value")
        public String value;

        public static ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes self = new ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes();
            return TeaModel.build(map, self);
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPolicesForPrivateAccessTagResponseBodyTagsPolices extends TeaModel {
        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomUserAttributes")
        public java.util.List<ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes> customUserAttributes;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyAction")
        public String policyAction;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserGroupType")
        public String userGroupType;

        public static ListPolicesForPrivateAccessTagResponseBodyTagsPolices build(java.util.Map<String, ?> map) throws Exception {
            ListPolicesForPrivateAccessTagResponseBodyTagsPolices self = new ListPolicesForPrivateAccessTagResponseBodyTagsPolices();
            return TeaModel.build(map, self);
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setCustomUserAttributes(java.util.List<ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes> customUserAttributes) {
            this.customUserAttributes = customUserAttributes;
            return this;
        }
        public java.util.List<ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes> getCustomUserAttributes() {
            return this.customUserAttributes;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTagsPolices setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

    }

    public static class ListPolicesForPrivateAccessTagResponseBodyTags extends TeaModel {
        @NameInMap("Polices")
        public java.util.List<ListPolicesForPrivateAccessTagResponseBodyTagsPolices> polices;

        @NameInMap("TagId")
        public String tagId;

        public static ListPolicesForPrivateAccessTagResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListPolicesForPrivateAccessTagResponseBodyTags self = new ListPolicesForPrivateAccessTagResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListPolicesForPrivateAccessTagResponseBodyTags setPolices(java.util.List<ListPolicesForPrivateAccessTagResponseBodyTagsPolices> polices) {
            this.polices = polices;
            return this;
        }
        public java.util.List<ListPolicesForPrivateAccessTagResponseBodyTagsPolices> getPolices() {
            return this.polices;
        }

        public ListPolicesForPrivateAccessTagResponseBodyTags setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

}

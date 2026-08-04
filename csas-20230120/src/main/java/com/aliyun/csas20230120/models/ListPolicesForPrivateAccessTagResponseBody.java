// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessTagResponseBody extends TeaModel {
    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>4D169859-A4F2-5EC8-853B-8447787C0D8A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of private network access tags.</p>
     */
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
        /**
         * <p>The identity provider ID of the user group. This value exists if the custom user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relationship of the user group. Values:</p>
         * <ul>
         * <li><p><strong>Equal</strong>: Equal.</p>
         * </li>
         * <li><p><strong>Unequal</strong>: Unequal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>The type of user group. Values:</p>
         * <ul>
         * <li><p><strong>username</strong>: Username.</p>
         * </li>
         * <li><p><strong>department</strong>: Department.</p>
         * </li>
         * <li><p><strong>email</strong>: Mailbox.</p>
         * </li>
         * <li><p><strong>telephone</strong>: Mobile phone.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>The value of the user group attribute.</p>
         * <ul>
         * <li><p>If the user group type is <strong>username</strong>, this indicates the username\&quot;s value. The length is 1 to 128 characters. It supports Chinese characters, uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>If the user group type is <strong>department</strong>, this indicates the department\&quot;s value. For example: OU=Department 1,OU=SASE DingTalk.</p>
         * </li>
         * <li><p>If the user group type is <strong>email</strong>, this indicates the mailbox\&quot;s value. For example: username\@example.com.</p>
         * </li>
         * <li><p>If the user group type is <strong>telephone</strong>, this indicates the mobile phone\&quot;s value. For example: 13900001234.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
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
        /**
         * <p>The application type of the private network access policy. Values:</p>
         * <ul>
         * <li><p><strong>Application</strong>: Application.</p>
         * </li>
         * <li><p><strong>Tag</strong>: Tag.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Application</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>Creation time of the private network access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-21 14:10:16</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>A collection of custom user group attributes. Multiple custom user group attributes have an OR relationship and take effect as a union.</p>
         */
        @NameInMap("CustomUserAttributes")
        public java.util.List<ListPolicesForPrivateAccessTagResponseBodyTagsPolicesCustomUserAttributes> customUserAttributes;

        /**
         * <p>Description of the private network access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条内网访问策略</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Private network access policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The action that the private access policy performs. Valid values:</p>
         * <ul>
         * <li><p><strong>Block</strong>: Blocks access.</p>
         * </li>
         * <li><p><strong>Allow</strong>: Allows access.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("PolicyAction")
        public String policyAction;

        /**
         * <p>Private network access policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-867ef4007c8a****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The private network access policy priority. The number 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The status of the private network access policy. Values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user group type of the private network access policy. Values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Normal user group.</p>
         * </li>
         * <li><p><strong>Custom</strong>: Custom user group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
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
        /**
         * <p>Collection of private network access policies.</p>
         */
        @NameInMap("Polices")
        public java.util.List<ListPolicesForPrivateAccessTagResponseBodyTagsPolices> polices;

        /**
         * <p>Private network access tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-b927baf3e592****</p>
         */
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

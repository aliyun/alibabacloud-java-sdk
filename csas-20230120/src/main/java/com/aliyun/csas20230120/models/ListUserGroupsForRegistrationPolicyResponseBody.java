// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForRegistrationPolicyResponseBody extends TeaModel {
    /**
     * <p>A list of device registration policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPolicies> policies;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>D89009C7-54C6-51B6-BAE7-3F373920C6BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUserGroupsForRegistrationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForRegistrationPolicyResponseBody self = new ListUserGroupsForRegistrationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForRegistrationPolicyResponseBody setPolicies(java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListUserGroupsForRegistrationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes extends TeaModel {
        /**
         * <p>The identity provider ID for the user group. This field appears only when UserGroupType is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relation for the user group. Valid values:</p>
         * <ul>
         * <li><p><strong>Equal</strong>: Equal to.</p>
         * </li>
         * <li><p><strong>Unequal</strong>: Not equal to.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <p>The type of the user group. Valid values:</p>
         * <ul>
         * <li><p><strong>username</strong>: A username.</p>
         * </li>
         * <li><p><strong>department</strong>: A department.</p>
         * </li>
         * <li><p><strong>email</strong>: An email address.</p>
         * </li>
         * <li><p><strong>telephone</strong>: A phone number.</p>
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
         * <li><p>If UserGroupType is <strong>username</strong>, this is the username. It must be 1–128 characters long and can contain uppercase and lowercase letters, Chinese characters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>If UserGroupType is <strong>department</strong>, this is the department name. Example: OU=Department 1,OU=SASE DingTalk.</p>
         * </li>
         * <li><p>If UserGroupType is <strong>email</strong>, this is the email address. Example: username\@example.com.</p>
         * </li>
         * <li><p>If UserGroupType is <strong>telephone</strong>, this is the phone number. Example: 13900001234.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes self = new ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups extends TeaModel {
        /**
         * <p>A collection of user group attributes.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes> attributes;

        /**
         * <p>The time when the user group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-27 18:10:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>A description of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条被设备注册策略引用的用户组。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>usergroup-6f1ef2fc56b6****</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups self = new ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups setAttributes(java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes> getAttributes() {
            return this.attributes;
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

    public static class ListUserGroupsForRegistrationPolicyResponseBodyPolicies extends TeaModel {
        /**
         * <p>The ID of the device registration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-policy-f25c9e5872e5****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>A collection of user groups associated with the device registration policy.</p>
         */
        @NameInMap("UserGroups")
        public java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups> userGroups;

        public static ListUserGroupsForRegistrationPolicyResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForRegistrationPolicyResponseBodyPolicies self = new ListUserGroupsForRegistrationPolicyResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListUserGroupsForRegistrationPolicyResponseBodyPolicies setUserGroups(java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroups> getUserGroups() {
            return this.userGroups;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForRegistrationPolicyResponseBody extends TeaModel {
    @NameInMap("Policies")
    public java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPolicies> policies;

    /**
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
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Relation")
        public String relation;

        /**
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

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
        @NameInMap("Attributes")
        public java.util.List<ListUserGroupsForRegistrationPolicyResponseBodyPoliciesUserGroupsAttributes> attributes;

        /**
         * <strong>example:</strong>
         * <p>2022-09-27 18:10:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>reg-policy-f25c9e5872e5****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

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

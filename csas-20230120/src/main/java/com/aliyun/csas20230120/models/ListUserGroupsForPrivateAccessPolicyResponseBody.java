// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForPrivateAccessPolicyResponseBody extends TeaModel {
    /**
     * <p>List of private network access policies.</p>
     */
    @NameInMap("Polices")
    public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolices> polices;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUserGroupsForPrivateAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForPrivateAccessPolicyResponseBody self = new ListUserGroupsForPrivateAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForPrivateAccessPolicyResponseBody setPolices(java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolices> polices) {
        this.polices = polices;
        return this;
    }
    public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolices> getPolices() {
        return this.polices;
    }

    public ListUserGroupsForPrivateAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes extends TeaModel {
        /**
         * <p>The identity source ID of the user group. This value exists if the custom user group type is <strong>department</strong>.</p>
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
         * <p>The type of the user group. Values:</p>
         * <ul>
         * <li><p><strong>username</strong>: username.</p>
         * </li>
         * <li><p><strong>department</strong>: department.</p>
         * </li>
         * <li><p><strong>email</strong>: mailbox.</p>
         * </li>
         * <li><p><strong>telephone</strong>: telephone.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("UserGroupType")
        public String userGroupType;

        /**
         * <p>Value of the user group property.</p>
         * <ul>
         * <li><p>If the user group type is <strong>username</strong>, this indicates the username\&quot;s value. The length is 1 to 128 characters. It supports Chinese characters and uppercase and lowercase English letters. It can contain numbers, periods (.), underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>If the user group type is <strong>department</strong>, this indicates the department\&quot;s value, such as OU=Department 1,OU=SASE DingTalk.</p>
         * </li>
         * <li><p>If the user group type is <strong>email</strong>, this indicates the mailbox\&quot;s value, such as username\@example.com.</p>
         * </li>
         * <li><p>If the user group type is <strong>telephone</strong>, this indicates the telephone\&quot;s value, such as 13900001234.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes self = new ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups extends TeaModel {
        /**
         * <p>Collection of user group properties.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes> attributes;

        /**
         * <p>User group creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-27 18:10:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>User group description.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条被内网访问策略引用的用户组</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>User group name.</p>
         * 
         * <strong>example:</strong>
         * <p>user_group_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>User group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>usergroup-6f1ef2fc56b6****</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        public static ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups self = new ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setAttributes(java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroupsAttributes> getAttributes() {
            return this.attributes;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

    public static class ListUserGroupsForPrivateAccessPolicyResponseBodyPolices extends TeaModel {
        /**
         * <p>Private network access policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-1b0d0e8b4bcf****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>Collection of user groups for the private network access policy.</p>
         */
        @NameInMap("UserGroups")
        public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups> userGroups;

        public static ListUserGroupsForPrivateAccessPolicyResponseBodyPolices build(java.util.Map<String, ?> map) throws Exception {
            ListUserGroupsForPrivateAccessPolicyResponseBodyPolices self = new ListUserGroupsForPrivateAccessPolicyResponseBodyPolices();
            return TeaModel.build(map, self);
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolices setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBodyPolices setUserGroups(java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public java.util.List<ListUserGroupsForPrivateAccessPolicyResponseBodyPolicesUserGroups> getUserGroups() {
            return this.userGroups;
        }

    }

}

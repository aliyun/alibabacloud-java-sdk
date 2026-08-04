// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessApplicationResponseBody extends TeaModel {
    /**
     * <p>The list of private access applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplications> applications;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4AB972E2-D702-5464-B132-B1911498B8BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPolicesForPrivateAccessApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForPrivateAccessApplicationResponseBody self = new ListPolicesForPrivateAccessApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicesForPrivateAccessApplicationResponseBody setApplications(java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListPolicesForPrivateAccessApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes extends TeaModel {
        /**
         * <p>The ID of the identity provider (IdP) for the user group. This parameter is returned when the custom user group type is <strong>department</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("IdpId")
        public Integer idpId;

        /**
         * <p>The relationship of the user group. Valid values:</p>
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
         * <li><p><strong>username</strong>: Username.</p>
         * </li>
         * <li><p><strong>department</strong>: Department.</p>
         * </li>
         * <li><p><strong>email</strong>: Email.</p>
         * </li>
         * <li><p><strong>telephone</strong>: Mobile number.</p>
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
         * <li><p>If the user group type is <strong>username</strong>, this parameter specifies the value of the username. The value can be 1 to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>If the user group type is <strong>department</strong>, this parameter specifies the value of the department. Example: OU=Department 1,OU=SASE DingTalk.</p>
         * </li>
         * <li><p>If the user group type is <strong>email</strong>, this parameter specifies the value of the email address. Example: username\@example.com.</p>
         * </li>
         * <li><p>If the user group type is <strong>telephone</strong>, this parameter specifies the value of the mobile number. Example: 13900001234.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OU=部门1,OU=SASE钉钉</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes self = new ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes();
            return TeaModel.build(map, self);
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes setIdpId(Integer idpId) {
            this.idpId = idpId;
            return this;
        }
        public Integer getIdpId() {
            return this.idpId;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies extends TeaModel {
        /**
         * <p>The application type of the private access policy. Valid values:</p>
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
         * <p>The time when the private access policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-27 18:10:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The collection of custom user group attributes. If you specify multiple attributes, the relationship between them is OR.</p>
         */
        @NameInMap("CustomUserAttributes")
        public java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes> customUserAttributes;

        /**
         * <p>The description of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条内网访问策略</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The action of the private access policy. Valid values:</p>
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
         * <p>The ID of the private access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-867ef4007c8a****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The priority of the private access policy. The value 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The status of the private access policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: The policy is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: The policy is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user group type of the private access policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Regular user group.</p>
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

        public static ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies self = new ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies();
            return TeaModel.build(map, self);
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setCustomUserAttributes(java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes> customUserAttributes) {
            this.customUserAttributes = customUserAttributes;
            return this;
        }
        public java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes> getCustomUserAttributes() {
            return this.customUserAttributes;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setPolicyAction(String policyAction) {
            this.policyAction = policyAction;
            return this;
        }
        public String getPolicyAction() {
            return this.policyAction;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies setUserGroupType(String userGroupType) {
            this.userGroupType = userGroupType;
            return this;
        }
        public String getUserGroupType() {
            return this.userGroupType;
        }

    }

    public static class ListPolicesForPrivateAccessApplicationResponseBodyApplications extends TeaModel {
        /**
         * <p>The ID of the private access application.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-b927baf3e592****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The collection of private access policies.</p>
         */
        @NameInMap("Policies")
        public java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies> policies;

        public static ListPolicesForPrivateAccessApplicationResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListPolicesForPrivateAccessApplicationResponseBodyApplications self = new ListPolicesForPrivateAccessApplicationResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListPolicesForPrivateAccessApplicationResponseBodyApplications setPolicies(java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPolicies> getPolicies() {
            return this.policies;
        }

    }

}

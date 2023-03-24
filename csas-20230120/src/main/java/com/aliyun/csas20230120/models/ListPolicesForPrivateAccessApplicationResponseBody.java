// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessApplicationResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplications> applications;

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
        @NameInMap("IdpId")
        public Integer idpId;

        @NameInMap("Relation")
        public String relation;

        @NameInMap("UserGroupType")
        public String userGroupType;

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
        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomUserAttributes")
        public java.util.List<ListPolicesForPrivateAccessApplicationResponseBodyApplicationsPoliciesCustomUserAttributes> customUserAttributes;

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
        @NameInMap("ApplicationId")
        public String applicationId;

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

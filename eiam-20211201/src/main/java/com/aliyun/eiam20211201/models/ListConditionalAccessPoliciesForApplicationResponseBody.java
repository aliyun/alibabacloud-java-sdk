// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForApplicationResponseBody extends TeaModel {
    /**
     * <p>A collection of conditional access policies.</p>
     */
    @NameInMap("ConditionalAccessPolicies")
    public java.util.List<ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies> conditionalAccessPolicies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConditionalAccessPoliciesForApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForApplicationResponseBody self = new ListConditionalAccessPoliciesForApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForApplicationResponseBody setConditionalAccessPolicies(java.util.List<ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies> conditionalAccessPolicies) {
        this.conditionalAccessPolicies = conditionalAccessPolicies;
        return this;
    }
    public java.util.List<ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies> getConditionalAccessPolicies() {
        return this.conditionalAccessPolicies;
    }

    public ListConditionalAccessPoliciesForApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications extends TeaModel {
        /**
         * <p>The excluded applications.</p>
         */
        @NameInMap("ExcludeApplications")
        public java.util.List<String> excludeApplications;

        /**
         * <p>The selected applications.</p>
         */
        @NameInMap("IncludeApplications")
        public java.util.List<String> includeApplications;

        public static ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications self = new ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications setExcludeApplications(java.util.List<String> excludeApplications) {
            this.excludeApplications = excludeApplications;
            return this;
        }
        public java.util.List<String> getExcludeApplications() {
            return this.excludeApplications;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications setIncludeApplications(java.util.List<String> includeApplications) {
            this.includeApplications = includeApplications;
            return this;
        }
        public java.util.List<String> getIncludeApplications() {
            return this.includeApplications;
        }

    }

    public static class ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones extends TeaModel {
        /**
         * <p>The excluded network zones.</p>
         */
        @NameInMap("ExcludeNetworkZones")
        public java.util.List<String> excludeNetworkZones;

        /**
         * <p>The selected network zones.</p>
         */
        @NameInMap("IncludeNetworkZones")
        public java.util.List<String> includeNetworkZones;

        public static ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones self = new ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones setExcludeNetworkZones(java.util.List<String> excludeNetworkZones) {
            this.excludeNetworkZones = excludeNetworkZones;
            return this;
        }
        public java.util.List<String> getExcludeNetworkZones() {
            return this.excludeNetworkZones;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones setIncludeNetworkZones(java.util.List<String> includeNetworkZones) {
            this.includeNetworkZones = includeNetworkZones;
            return this;
        }
        public java.util.List<String> getIncludeNetworkZones() {
            return this.includeNetworkZones;
        }

    }

    public static class ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers extends TeaModel {
        /**
         * <p>The excluded user groups.</p>
         */
        @NameInMap("ExcludeGroups")
        public java.util.List<String> excludeGroups;

        /**
         * <p>The excluded organizations.</p>
         */
        @NameInMap("ExcludeOrganizationalUnits")
        public java.util.List<String> excludeOrganizationalUnits;

        /**
         * <p>The excluded users.</p>
         */
        @NameInMap("ExcludeUsers")
        public java.util.List<String> excludeUsers;

        /**
         * <p>The selected user groups.</p>
         */
        @NameInMap("IncludeGroups")
        public java.util.List<String> includeGroups;

        /**
         * <p>The selected organizations.</p>
         */
        @NameInMap("IncludeOrganizationalUnits")
        public java.util.List<String> includeOrganizationalUnits;

        /**
         * <p>The selected users.</p>
         */
        @NameInMap("IncludeUsers")
        public java.util.List<String> includeUsers;

        public static ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers self = new ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeGroups(java.util.List<String> excludeGroups) {
            this.excludeGroups = excludeGroups;
            return this;
        }
        public java.util.List<String> getExcludeGroups() {
            return this.excludeGroups;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
            this.excludeOrganizationalUnits = excludeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getExcludeOrganizationalUnits() {
            return this.excludeOrganizationalUnits;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeGroups(java.util.List<String> includeGroups) {
            this.includeGroups = includeGroups;
            return this;
        }
        public java.util.List<String> getIncludeGroups() {
            return this.includeGroups;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
            this.includeOrganizationalUnits = includeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getIncludeOrganizationalUnits() {
            return this.includeOrganizationalUnits;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeUsers(java.util.List<String> includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }
        public java.util.List<String> getIncludeUsers() {
            return this.includeUsers;
        }

    }

    public static class ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig extends TeaModel {
        /**
         * <p>The target applications of the conditional access policy.</p>
         */
        @NameInMap("Applications")
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications applications;

        /**
         * <p>The network zones of the conditional access policy.</p>
         */
        @NameInMap("NetworkZones")
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones networkZones;

        /**
         * <p>The target users of the conditional access policy.</p>
         */
        @NameInMap("Users")
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers users;

        public static ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig self = new ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig setApplications(ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications applications) {
            this.applications = applications;
            return this;
        }
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigApplications getApplications() {
            return this.applications;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig setNetworkZones(ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones networkZones) {
            this.networkZones = networkZones;
            return this;
        }
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones getNetworkZones() {
            return this.networkZones;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig setUsers(ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers users) {
            this.users = users;
            return this;
        }
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfigUsers getUsers() {
            return this.users;
        }

    }

    public static class ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig extends TeaModel {
        /**
         * <p>Indicates whether session reuse is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("ActiveSessionReuseStatus")
        public String activeSessionReuseStatus;

        /**
         * <p>The effect of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The re-authentication interval of the conditional access policy, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MfaAuthenticationIntervalSeconds")
        public Long mfaAuthenticationIntervalSeconds;

        /**
         * <p>The collection of MFA methods allowed by the conditional access policy.</p>
         */
        @NameInMap("MfaAuthenticationMethods")
        public java.util.List<String> mfaAuthenticationMethods;

        /**
         * <p>The multi-factor authentication (MFA) type of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>directly_access</p>
         */
        @NameInMap("MfaType")
        public String mfaType;

        public static ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig self = new ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig setActiveSessionReuseStatus(String activeSessionReuseStatus) {
            this.activeSessionReuseStatus = activeSessionReuseStatus;
            return this;
        }
        public String getActiveSessionReuseStatus() {
            return this.activeSessionReuseStatus;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig setMfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
            this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
            return this;
        }
        public Long getMfaAuthenticationIntervalSeconds() {
            return this.mfaAuthenticationIntervalSeconds;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig setMfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
            this.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }
        public java.util.List<String> getMfaAuthenticationMethods() {
            return this.mfaAuthenticationMethods;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig setMfaType(String mfaType) {
            this.mfaType = mfaType;
            return this;
        }
        public String getMfaType() {
            return this.mfaType;
        }

    }

    public static class ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies extends TeaModel {
        /**
         * <p>The conditional access policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cap_m5etun43kejxphsbke6mjxxxxx</p>
         */
        @NameInMap("ConditionalAccessPolicyId")
        public String conditionalAccessPolicyId;

        /**
         * <p>The name of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>myPolicy</p>
         */
        @NameInMap("ConditionalAccessPolicyName")
        public String conditionalAccessPolicyName;

        /**
         * <p>The type of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:authn:access:policy:system</p>
         */
        @NameInMap("ConditionalAccessPolicyType")
        public String conditionalAccessPolicyType;

        /**
         * <p>The content of the conditional access policy.</p>
         */
        @NameInMap("ConditionsConfig")
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig conditionsConfig;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1741857554000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The execution configuration of the conditional access policy.</p>
         */
        @NameInMap("DecisionConfig")
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig decisionConfig;

        /**
         * <p>The execution type of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>enforcement</p>
         */
        @NameInMap("DecisionType")
        public String decisionType;

        /**
         * <p>The description of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policyTest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The policy enforcement point.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1</p>
         */
        @NameInMap("EvaluateAt")
        public String evaluateAt;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_oynbcyaaejuik6b37eldzxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1741857554000</p>
         */
        @NameInMap("LastUpdatedTime")
        public Long lastUpdatedTime;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The status of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies self = new ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
            this.conditionalAccessPolicyId = conditionalAccessPolicyId;
            return this;
        }
        public String getConditionalAccessPolicyId() {
            return this.conditionalAccessPolicyId;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
            this.conditionalAccessPolicyName = conditionalAccessPolicyName;
            return this;
        }
        public String getConditionalAccessPolicyName() {
            return this.conditionalAccessPolicyName;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setConditionalAccessPolicyType(String conditionalAccessPolicyType) {
            this.conditionalAccessPolicyType = conditionalAccessPolicyType;
            return this;
        }
        public String getConditionalAccessPolicyType() {
            return this.conditionalAccessPolicyType;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setConditionsConfig(ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig conditionsConfig) {
            this.conditionsConfig = conditionsConfig;
            return this;
        }
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesConditionsConfig getConditionsConfig() {
            return this.conditionsConfig;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setDecisionConfig(ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig decisionConfig) {
            this.decisionConfig = decisionConfig;
            return this;
        }
        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPoliciesDecisionConfig getDecisionConfig() {
            return this.decisionConfig;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setDecisionType(String decisionType) {
            this.decisionType = decisionType;
            return this;
        }
        public String getDecisionType() {
            return this.decisionType;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setEvaluateAt(String evaluateAt) {
            this.evaluateAt = evaluateAt;
            return this;
        }
        public String getEvaluateAt() {
            return this.evaluateAt;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setLastUpdatedTime(Long lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Long getLastUpdatedTime() {
            return this.lastUpdatedTime;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListConditionalAccessPoliciesForApplicationResponseBodyConditionalAccessPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

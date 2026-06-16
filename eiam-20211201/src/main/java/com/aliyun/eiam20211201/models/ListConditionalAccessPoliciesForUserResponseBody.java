// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForUserResponseBody extends TeaModel {
    /**
     * <p>A collection of conditional access policies.</p>
     */
    @NameInMap("ConditionalAccessPolicies")
    public java.util.List<ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies> conditionalAccessPolicies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConditionalAccessPoliciesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForUserResponseBody self = new ListConditionalAccessPoliciesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForUserResponseBody setConditionalAccessPolicies(java.util.List<ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies> conditionalAccessPolicies) {
        this.conditionalAccessPolicies = conditionalAccessPolicies;
        return this;
    }
    public java.util.List<ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies> getConditionalAccessPolicies() {
        return this.conditionalAccessPolicies;
    }

    public ListConditionalAccessPoliciesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications extends TeaModel {
        /**
         * <p>The excluded applications.</p>
         */
        @NameInMap("ExcludeApplications")
        public java.util.List<String> excludeApplications;

        /**
         * <p>The included applications.</p>
         */
        @NameInMap("IncludeApplications")
        public java.util.List<String> includeApplications;

        public static ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications self = new ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications setExcludeApplications(java.util.List<String> excludeApplications) {
            this.excludeApplications = excludeApplications;
            return this;
        }
        public java.util.List<String> getExcludeApplications() {
            return this.excludeApplications;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications setIncludeApplications(java.util.List<String> includeApplications) {
            this.includeApplications = includeApplications;
            return this;
        }
        public java.util.List<String> getIncludeApplications() {
            return this.includeApplications;
        }

    }

    public static class ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones extends TeaModel {
        /**
         * <p>The excluded network zones.</p>
         */
        @NameInMap("ExcludeNetworkZones")
        public java.util.List<String> excludeNetworkZones;

        /**
         * <p>The included network zones.</p>
         */
        @NameInMap("IncludeNetworkZones")
        public java.util.List<String> includeNetworkZones;

        public static ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones self = new ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones setExcludeNetworkZones(java.util.List<String> excludeNetworkZones) {
            this.excludeNetworkZones = excludeNetworkZones;
            return this;
        }
        public java.util.List<String> getExcludeNetworkZones() {
            return this.excludeNetworkZones;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones setIncludeNetworkZones(java.util.List<String> includeNetworkZones) {
            this.includeNetworkZones = includeNetworkZones;
            return this;
        }
        public java.util.List<String> getIncludeNetworkZones() {
            return this.includeNetworkZones;
        }

    }

    public static class ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers extends TeaModel {
        /**
         * <p>The excluded groups.</p>
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
         * <p>The included groups.</p>
         */
        @NameInMap("IncludeGroups")
        public java.util.List<String> includeGroups;

        /**
         * <p>The included organizations.</p>
         */
        @NameInMap("IncludeOrganizationalUnits")
        public java.util.List<String> includeOrganizationalUnits;

        /**
         * <p>The included users.</p>
         */
        @NameInMap("IncludeUsers")
        public java.util.List<String> includeUsers;

        public static ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers self = new ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeGroups(java.util.List<String> excludeGroups) {
            this.excludeGroups = excludeGroups;
            return this;
        }
        public java.util.List<String> getExcludeGroups() {
            return this.excludeGroups;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
            this.excludeOrganizationalUnits = excludeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getExcludeOrganizationalUnits() {
            return this.excludeOrganizationalUnits;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeGroups(java.util.List<String> includeGroups) {
            this.includeGroups = includeGroups;
            return this;
        }
        public java.util.List<String> getIncludeGroups() {
            return this.includeGroups;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
            this.includeOrganizationalUnits = includeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getIncludeOrganizationalUnits() {
            return this.includeOrganizationalUnits;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeUsers(java.util.List<String> includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }
        public java.util.List<String> getIncludeUsers() {
            return this.includeUsers;
        }

    }

    public static class ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig extends TeaModel {
        /**
         * <p>The target applications of the conditional access policy.</p>
         */
        @NameInMap("Applications")
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications applications;

        /**
         * <p>The network zones of the conditional access policy.</p>
         */
        @NameInMap("NetworkZones")
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones networkZones;

        /**
         * <p>The target users of the conditional access policy.</p>
         */
        @NameInMap("Users")
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers users;

        public static ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig self = new ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig setApplications(ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications applications) {
            this.applications = applications;
            return this;
        }
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigApplications getApplications() {
            return this.applications;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig setNetworkZones(ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones networkZones) {
            this.networkZones = networkZones;
            return this;
        }
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones getNetworkZones() {
            return this.networkZones;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig setUsers(ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers users) {
            this.users = users;
            return this;
        }
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfigUsers getUsers() {
            return this.users;
        }

    }

    public static class ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig extends TeaModel {
        /**
         * <p>Indicates whether session reuse is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("ActiveSessionReuseStatus")
        public String activeSessionReuseStatus;

        /**
         * <p>The action of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The interval for repeated authentication, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MfaAuthenticationIntervalSeconds")
        public Long mfaAuthenticationIntervalSeconds;

        /**
         * <p>The MFA methods allowed by the conditional access policy.</p>
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

        public static ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig self = new ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig setActiveSessionReuseStatus(String activeSessionReuseStatus) {
            this.activeSessionReuseStatus = activeSessionReuseStatus;
            return this;
        }
        public String getActiveSessionReuseStatus() {
            return this.activeSessionReuseStatus;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig setMfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
            this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
            return this;
        }
        public Long getMfaAuthenticationIntervalSeconds() {
            return this.mfaAuthenticationIntervalSeconds;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig setMfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
            this.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }
        public java.util.List<String> getMfaAuthenticationMethods() {
            return this.mfaAuthenticationMethods;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig setMfaType(String mfaType) {
            this.mfaType = mfaType;
            return this;
        }
        public String getMfaType() {
            return this.mfaType;
        }

    }

    public static class ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies extends TeaModel {
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
         * <p>policyName</p>
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
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig conditionsConfig;

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
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig decisionConfig;

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
         * <p>testPolicy</p>
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
         * <p>idaas_oynbcyaaejuik6b37eldz4xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The last update time.</p>
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

        public static ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies self = new ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
            this.conditionalAccessPolicyId = conditionalAccessPolicyId;
            return this;
        }
        public String getConditionalAccessPolicyId() {
            return this.conditionalAccessPolicyId;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
            this.conditionalAccessPolicyName = conditionalAccessPolicyName;
            return this;
        }
        public String getConditionalAccessPolicyName() {
            return this.conditionalAccessPolicyName;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setConditionalAccessPolicyType(String conditionalAccessPolicyType) {
            this.conditionalAccessPolicyType = conditionalAccessPolicyType;
            return this;
        }
        public String getConditionalAccessPolicyType() {
            return this.conditionalAccessPolicyType;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setConditionsConfig(ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig conditionsConfig) {
            this.conditionsConfig = conditionsConfig;
            return this;
        }
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesConditionsConfig getConditionsConfig() {
            return this.conditionsConfig;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setDecisionConfig(ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig decisionConfig) {
            this.decisionConfig = decisionConfig;
            return this;
        }
        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPoliciesDecisionConfig getDecisionConfig() {
            return this.decisionConfig;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setDecisionType(String decisionType) {
            this.decisionType = decisionType;
            return this;
        }
        public String getDecisionType() {
            return this.decisionType;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setEvaluateAt(String evaluateAt) {
            this.evaluateAt = evaluateAt;
            return this;
        }
        public String getEvaluateAt() {
            return this.evaluateAt;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setLastUpdatedTime(Long lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Long getLastUpdatedTime() {
            return this.lastUpdatedTime;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListConditionalAccessPoliciesForUserResponseBodyConditionalAccessPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

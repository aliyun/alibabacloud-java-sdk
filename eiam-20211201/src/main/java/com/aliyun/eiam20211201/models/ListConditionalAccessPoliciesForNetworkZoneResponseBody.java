// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesForNetworkZoneResponseBody extends TeaModel {
    /**
     * <p>The collection of conditional access policies.</p>
     */
    @NameInMap("ConditionalAccessPolicies")
    public java.util.List<ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies> conditionalAccessPolicies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConditionalAccessPoliciesForNetworkZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesForNetworkZoneResponseBody self = new ListConditionalAccessPoliciesForNetworkZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesForNetworkZoneResponseBody setConditionalAccessPolicies(java.util.List<ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies> conditionalAccessPolicies) {
        this.conditionalAccessPolicies = conditionalAccessPolicies;
        return this;
    }
    public java.util.List<ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies> getConditionalAccessPolicies() {
        return this.conditionalAccessPolicies;
    }

    public ListConditionalAccessPoliciesForNetworkZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications extends TeaModel {
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

        public static ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications self = new ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications setExcludeApplications(java.util.List<String> excludeApplications) {
            this.excludeApplications = excludeApplications;
            return this;
        }
        public java.util.List<String> getExcludeApplications() {
            return this.excludeApplications;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications setIncludeApplications(java.util.List<String> includeApplications) {
            this.includeApplications = includeApplications;
            return this;
        }
        public java.util.List<String> getIncludeApplications() {
            return this.includeApplications;
        }

    }

    public static class ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones extends TeaModel {
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

        public static ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones self = new ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones setExcludeNetworkZones(java.util.List<String> excludeNetworkZones) {
            this.excludeNetworkZones = excludeNetworkZones;
            return this;
        }
        public java.util.List<String> getExcludeNetworkZones() {
            return this.excludeNetworkZones;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones setIncludeNetworkZones(java.util.List<String> includeNetworkZones) {
            this.includeNetworkZones = includeNetworkZones;
            return this;
        }
        public java.util.List<String> getIncludeNetworkZones() {
            return this.includeNetworkZones;
        }

    }

    public static class ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers extends TeaModel {
        /**
         * <p>The excluded user groups.</p>
         */
        @NameInMap("ExcludeGroups")
        public java.util.List<String> excludeGroups;

        /**
         * <p>The excluded organizational units.</p>
         */
        @NameInMap("ExcludeOrganizationalUnits")
        public java.util.List<String> excludeOrganizationalUnits;

        /**
         * <p>The excluded users.</p>
         */
        @NameInMap("ExcludeUsers")
        public java.util.List<String> excludeUsers;

        /**
         * <p>The included user groups.</p>
         */
        @NameInMap("IncludeGroups")
        public java.util.List<String> includeGroups;

        /**
         * <p>The included organizational units.</p>
         */
        @NameInMap("IncludeOrganizationalUnits")
        public java.util.List<String> includeOrganizationalUnits;

        /**
         * <p>The included users.</p>
         */
        @NameInMap("IncludeUsers")
        public java.util.List<String> includeUsers;

        public static ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers self = new ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeGroups(java.util.List<String> excludeGroups) {
            this.excludeGroups = excludeGroups;
            return this;
        }
        public java.util.List<String> getExcludeGroups() {
            return this.excludeGroups;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
            this.excludeOrganizationalUnits = excludeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getExcludeOrganizationalUnits() {
            return this.excludeOrganizationalUnits;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeGroups(java.util.List<String> includeGroups) {
            this.includeGroups = includeGroups;
            return this;
        }
        public java.util.List<String> getIncludeGroups() {
            return this.includeGroups;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
            this.includeOrganizationalUnits = includeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getIncludeOrganizationalUnits() {
            return this.includeOrganizationalUnits;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeUsers(java.util.List<String> includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }
        public java.util.List<String> getIncludeUsers() {
            return this.includeUsers;
        }

    }

    public static class ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig extends TeaModel {
        /**
         * <p>The target applications of the conditional access policy.</p>
         */
        @NameInMap("Applications")
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications applications;

        /**
         * <p>The network zones of the conditional access policy.</p>
         */
        @NameInMap("NetworkZones")
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones networkZones;

        /**
         * <p>The target users of the conditional access policy.</p>
         */
        @NameInMap("Users")
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers users;

        public static ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig self = new ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig setApplications(ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications applications) {
            this.applications = applications;
            return this;
        }
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigApplications getApplications() {
            return this.applications;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig setNetworkZones(ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones networkZones) {
            this.networkZones = networkZones;
            return this;
        }
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones getNetworkZones() {
            return this.networkZones;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig setUsers(ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers users) {
            this.users = users;
            return this;
        }
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfigUsers getUsers() {
            return this.users;
        }

    }

    public static class ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig extends TeaModel {
        /**
         * <p>Indicates whether session reuse is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ActiveSessionReuseStatus")
        public String activeSessionReuseStatus;

        /**
         * <p>The decision action of the conditional access policy.</p>
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
         * <p>The MFA methods allowed by the conditional access policy.</p>
         */
        @NameInMap("MfaAuthenticationMethods")
        public java.util.List<String> mfaAuthenticationMethods;

        /**
         * <p>The MFA type of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>directly_access</p>
         */
        @NameInMap("MfaType")
        public String mfaType;

        public static ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig self = new ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig setActiveSessionReuseStatus(String activeSessionReuseStatus) {
            this.activeSessionReuseStatus = activeSessionReuseStatus;
            return this;
        }
        public String getActiveSessionReuseStatus() {
            return this.activeSessionReuseStatus;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig setMfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
            this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
            return this;
        }
        public Long getMfaAuthenticationIntervalSeconds() {
            return this.mfaAuthenticationIntervalSeconds;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig setMfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
            this.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }
        public java.util.List<String> getMfaAuthenticationMethods() {
            return this.mfaAuthenticationMethods;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig setMfaType(String mfaType) {
            this.mfaType = mfaType;
            return this;
        }
        public String getMfaType() {
            return this.mfaType;
        }

    }

    public static class ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies extends TeaModel {
        /**
         * <p>The conditional access policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cp_xxxxx</p>
         */
        @NameInMap("ConditionalAccessPolicyId")
        public String conditionalAccessPolicyId;

        /**
         * <p>The conditional access policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>My policy</p>
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
         * <p>The conditions configuration of the conditional access policy.</p>
         */
        @NameInMap("ConditionsConfig")
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig conditionsConfig;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1741857554000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The decision action configuration of the conditional access policy.</p>
         */
        @NameInMap("DecisionConfig")
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig decisionConfig;

        /**
         * <p>The decision type of the conditional access policy.</p>
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
         * <p>terraform-example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The evaluation point of the conditional access policy.</p>
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
         * <p>idaas_oynbcyaaejuik6b37eldz4pinu</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The last updated time.</p>
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
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The enabled or disabled status of the conditional access policy.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies self = new ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
            this.conditionalAccessPolicyId = conditionalAccessPolicyId;
            return this;
        }
        public String getConditionalAccessPolicyId() {
            return this.conditionalAccessPolicyId;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
            this.conditionalAccessPolicyName = conditionalAccessPolicyName;
            return this;
        }
        public String getConditionalAccessPolicyName() {
            return this.conditionalAccessPolicyName;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setConditionalAccessPolicyType(String conditionalAccessPolicyType) {
            this.conditionalAccessPolicyType = conditionalAccessPolicyType;
            return this;
        }
        public String getConditionalAccessPolicyType() {
            return this.conditionalAccessPolicyType;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setConditionsConfig(ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig conditionsConfig) {
            this.conditionsConfig = conditionsConfig;
            return this;
        }
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesConditionsConfig getConditionsConfig() {
            return this.conditionsConfig;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setDecisionConfig(ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig decisionConfig) {
            this.decisionConfig = decisionConfig;
            return this;
        }
        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPoliciesDecisionConfig getDecisionConfig() {
            return this.decisionConfig;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setDecisionType(String decisionType) {
            this.decisionType = decisionType;
            return this;
        }
        public String getDecisionType() {
            return this.decisionType;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setEvaluateAt(String evaluateAt) {
            this.evaluateAt = evaluateAt;
            return this;
        }
        public String getEvaluateAt() {
            return this.evaluateAt;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setLastUpdatedTime(Long lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Long getLastUpdatedTime() {
            return this.lastUpdatedTime;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListConditionalAccessPoliciesForNetworkZoneResponseBodyConditionalAccessPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

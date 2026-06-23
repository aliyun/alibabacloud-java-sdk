// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListConditionalAccessPoliciesResponseBody extends TeaModel {
    /**
     * <p>Collection of conditional access policies.</p>
     */
    @NameInMap("ConditionalAccessPolicies")
    public java.util.List<ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies> conditionalAccessPolicies;

    /**
     * <p>The query token value returned by this call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Previous page query token.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of items in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListConditionalAccessPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConditionalAccessPoliciesResponseBody self = new ListConditionalAccessPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConditionalAccessPoliciesResponseBody setConditionalAccessPolicies(java.util.List<ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies> conditionalAccessPolicies) {
        this.conditionalAccessPolicies = conditionalAccessPolicies;
        return this;
    }
    public java.util.List<ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies> getConditionalAccessPolicies() {
        return this.conditionalAccessPolicies;
    }

    public ListConditionalAccessPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListConditionalAccessPoliciesResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListConditionalAccessPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConditionalAccessPoliciesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications extends TeaModel {
        /**
         * <p>Excluded applications.</p>
         */
        @NameInMap("ExcludeApplications")
        public java.util.List<String> excludeApplications;

        /**
         * <p>Included applications.</p>
         */
        @NameInMap("IncludeApplications")
        public java.util.List<String> includeApplications;

        public static ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications self = new ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications setExcludeApplications(java.util.List<String> excludeApplications) {
            this.excludeApplications = excludeApplications;
            return this;
        }
        public java.util.List<String> getExcludeApplications() {
            return this.excludeApplications;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications setIncludeApplications(java.util.List<String> includeApplications) {
            this.includeApplications = includeApplications;
            return this;
        }
        public java.util.List<String> getIncludeApplications() {
            return this.includeApplications;
        }

    }

    public static class ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones extends TeaModel {
        /**
         * <p>Excluded network zones.</p>
         */
        @NameInMap("ExcludeNetworkZones")
        public java.util.List<String> excludeNetworkZones;

        /**
         * <p>Included network zones.</p>
         */
        @NameInMap("IncludeNetworkZones")
        public java.util.List<String> includeNetworkZones;

        public static ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones self = new ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones setExcludeNetworkZones(java.util.List<String> excludeNetworkZones) {
            this.excludeNetworkZones = excludeNetworkZones;
            return this;
        }
        public java.util.List<String> getExcludeNetworkZones() {
            return this.excludeNetworkZones;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones setIncludeNetworkZones(java.util.List<String> includeNetworkZones) {
            this.includeNetworkZones = includeNetworkZones;
            return this;
        }
        public java.util.List<String> getIncludeNetworkZones() {
            return this.includeNetworkZones;
        }

    }

    public static class ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers extends TeaModel {
        /**
         * <p>Excluded user groups.</p>
         */
        @NameInMap("ExcludeGroups")
        public java.util.List<String> excludeGroups;

        /**
         * <p>Excluded organizational units.</p>
         */
        @NameInMap("ExcludeOrganizationalUnits")
        public java.util.List<String> excludeOrganizationalUnits;

        /**
         * <p>Excluded users.</p>
         */
        @NameInMap("ExcludeUsers")
        public java.util.List<String> excludeUsers;

        /**
         * <p>Included user groups.</p>
         */
        @NameInMap("IncludeGroups")
        public java.util.List<String> includeGroups;

        /**
         * <p>Included organizational units.</p>
         */
        @NameInMap("IncludeOrganizationalUnits")
        public java.util.List<String> includeOrganizationalUnits;

        /**
         * <p>Included users.</p>
         */
        @NameInMap("IncludeUsers")
        public java.util.List<String> includeUsers;

        public static ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers self = new ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeGroups(java.util.List<String> excludeGroups) {
            this.excludeGroups = excludeGroups;
            return this;
        }
        public java.util.List<String> getExcludeGroups() {
            return this.excludeGroups;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
            this.excludeOrganizationalUnits = excludeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getExcludeOrganizationalUnits() {
            return this.excludeOrganizationalUnits;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeGroups(java.util.List<String> includeGroups) {
            this.includeGroups = includeGroups;
            return this;
        }
        public java.util.List<String> getIncludeGroups() {
            return this.includeGroups;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
            this.includeOrganizationalUnits = includeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getIncludeOrganizationalUnits() {
            return this.includeOrganizationalUnits;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers setIncludeUsers(java.util.List<String> includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }
        public java.util.List<String> getIncludeUsers() {
            return this.includeUsers;
        }

    }

    public static class ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig extends TeaModel {
        /**
         * <p>Conditional access policy target applications.</p>
         */
        @NameInMap("Applications")
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications applications;

        /**
         * <p>Conditional access policy network zones.</p>
         */
        @NameInMap("NetworkZones")
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones networkZones;

        /**
         * <p>Conditional access policy target users.</p>
         */
        @NameInMap("Users")
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers users;

        public static ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig self = new ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig setApplications(ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications applications) {
            this.applications = applications;
            return this;
        }
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigApplications getApplications() {
            return this.applications;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig setNetworkZones(ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones networkZones) {
            this.networkZones = networkZones;
            return this;
        }
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigNetworkZones getNetworkZones() {
            return this.networkZones;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig setUsers(ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers users) {
            this.users = users;
            return this;
        }
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfigUsers getUsers() {
            return this.users;
        }

    }

    public static class ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig extends TeaModel {
        /**
         * <p>Whether to enable secondary authentication session reuse.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("ActiveSessionReuseStatus")
        public String activeSessionReuseStatus;

        /**
         * <p>Conditional access policy decision action:
         * deny: Deny access.
         * allow: Allow access.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>Conditional access policy re-authentication interval (seconds), ranging from 300 to 86400.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MfaAuthenticationIntervalSeconds")
        public Long mfaAuthenticationIntervalSeconds;

        /**
         * <p>MFA types allowed by the conditional access policy.</p>
         */
        @NameInMap("MfaAuthenticationMethods")
        public java.util.List<String> mfaAuthenticationMethods;

        /**
         * <p>Conditional access policy MFA type.</p>
         * 
         * <strong>example:</strong>
         * <p>directly_access</p>
         */
        @NameInMap("MfaType")
        public String mfaType;

        public static ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig self = new ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig setActiveSessionReuseStatus(String activeSessionReuseStatus) {
            this.activeSessionReuseStatus = activeSessionReuseStatus;
            return this;
        }
        public String getActiveSessionReuseStatus() {
            return this.activeSessionReuseStatus;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig setMfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
            this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
            return this;
        }
        public Long getMfaAuthenticationIntervalSeconds() {
            return this.mfaAuthenticationIntervalSeconds;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig setMfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
            this.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }
        public java.util.List<String> getMfaAuthenticationMethods() {
            return this.mfaAuthenticationMethods;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig setMfaType(String mfaType) {
            this.mfaType = mfaType;
            return this;
        }
        public String getMfaType() {
            return this.mfaType;
        }

    }

    public static class ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies extends TeaModel {
        /**
         * <p>Conditional access policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cp_xxxxx</p>
         */
        @NameInMap("ConditionalAccessPolicyId")
        public String conditionalAccessPolicyId;

        /**
         * <p>Conditional access policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>My policy</p>
         */
        @NameInMap("ConditionalAccessPolicyName")
        public String conditionalAccessPolicyName;

        /**
         * <p>Conditional access policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:authn:access:policy:system</p>
         */
        @NameInMap("ConditionalAccessPolicyType")
        public String conditionalAccessPolicyType;

        /**
         * <p>Conditional access policy conditions.</p>
         */
        @NameInMap("ConditionsConfig")
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig conditionsConfig;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1741857554000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Conditional access policy execution action.</p>
         */
        @NameInMap("DecisionConfig")
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig decisionConfig;

        /**
         * <p>Conditional access policy execution type.</p>
         * 
         * <strong>example:</strong>
         * <p>enforcement</p>
         */
        @NameInMap("DecisionType")
        public String decisionType;

        /**
         * <p>Conditional access policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>My policy description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Conditional access policy evaluation point.</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1</p>
         */
        @NameInMap("EvaluateAt")
        public String evaluateAt;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ksvv5c7f2l6uzh6oqspeks23ni</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1741857554000</p>
         */
        @NameInMap("LastUpdatedTime")
        public Long lastUpdatedTime;

        /**
         * <p>Priority, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Conditional access policy enabled/disabled status.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies self = new ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies();
            return TeaModel.build(map, self);
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
            this.conditionalAccessPolicyId = conditionalAccessPolicyId;
            return this;
        }
        public String getConditionalAccessPolicyId() {
            return this.conditionalAccessPolicyId;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
            this.conditionalAccessPolicyName = conditionalAccessPolicyName;
            return this;
        }
        public String getConditionalAccessPolicyName() {
            return this.conditionalAccessPolicyName;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setConditionalAccessPolicyType(String conditionalAccessPolicyType) {
            this.conditionalAccessPolicyType = conditionalAccessPolicyType;
            return this;
        }
        public String getConditionalAccessPolicyType() {
            return this.conditionalAccessPolicyType;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setConditionsConfig(ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig conditionsConfig) {
            this.conditionsConfig = conditionsConfig;
            return this;
        }
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesConditionsConfig getConditionsConfig() {
            return this.conditionsConfig;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setDecisionConfig(ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig decisionConfig) {
            this.decisionConfig = decisionConfig;
            return this;
        }
        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPoliciesDecisionConfig getDecisionConfig() {
            return this.decisionConfig;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setDecisionType(String decisionType) {
            this.decisionType = decisionType;
            return this;
        }
        public String getDecisionType() {
            return this.decisionType;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setEvaluateAt(String evaluateAt) {
            this.evaluateAt = evaluateAt;
            return this;
        }
        public String getEvaluateAt() {
            return this.evaluateAt;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setLastUpdatedTime(Long lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Long getLastUpdatedTime() {
            return this.lastUpdatedTime;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListConditionalAccessPoliciesResponseBodyConditionalAccessPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetConditionalAccessPolicyResponseBody extends TeaModel {
    /**
     * <p>Details of the conditional access policy</p>
     */
    @NameInMap("ConditionalAccessPolicy")
    public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy conditionalAccessPolicy;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetConditionalAccessPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConditionalAccessPolicyResponseBody self = new GetConditionalAccessPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConditionalAccessPolicyResponseBody setConditionalAccessPolicy(GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy conditionalAccessPolicy) {
        this.conditionalAccessPolicy = conditionalAccessPolicy;
        return this;
    }
    public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy getConditionalAccessPolicy() {
        return this.conditionalAccessPolicy;
    }

    public GetConditionalAccessPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications extends TeaModel {
        /**
         * <p>Excluded applications</p>
         */
        @NameInMap("ExcludeApplications")
        public java.util.List<String> excludeApplications;

        /**
         * <p>Selected applications</p>
         */
        @NameInMap("IncludeApplications")
        public java.util.List<String> includeApplications;

        public static GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications build(java.util.Map<String, ?> map) throws Exception {
            GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications self = new GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications();
            return TeaModel.build(map, self);
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications setExcludeApplications(java.util.List<String> excludeApplications) {
            this.excludeApplications = excludeApplications;
            return this;
        }
        public java.util.List<String> getExcludeApplications() {
            return this.excludeApplications;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications setIncludeApplications(java.util.List<String> includeApplications) {
            this.includeApplications = includeApplications;
            return this;
        }
        public java.util.List<String> getIncludeApplications() {
            return this.includeApplications;
        }

    }

    public static class GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones extends TeaModel {
        /**
         * <p>Excluded network zones</p>
         */
        @NameInMap("ExcludeNetworkZones")
        public java.util.List<String> excludeNetworkZones;

        /**
         * <p>Included network zones</p>
         */
        @NameInMap("IncludeNetworkZones")
        public java.util.List<String> includeNetworkZones;

        public static GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones build(java.util.Map<String, ?> map) throws Exception {
            GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones self = new GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones();
            return TeaModel.build(map, self);
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones setExcludeNetworkZones(java.util.List<String> excludeNetworkZones) {
            this.excludeNetworkZones = excludeNetworkZones;
            return this;
        }
        public java.util.List<String> getExcludeNetworkZones() {
            return this.excludeNetworkZones;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones setIncludeNetworkZones(java.util.List<String> includeNetworkZones) {
            this.includeNetworkZones = includeNetworkZones;
            return this;
        }
        public java.util.List<String> getIncludeNetworkZones() {
            return this.includeNetworkZones;
        }

    }

    public static class GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers extends TeaModel {
        /**
         * <p>Excluded user groups</p>
         */
        @NameInMap("ExcludeGroups")
        public java.util.List<String> excludeGroups;

        /**
         * <p>Excluded organizations</p>
         */
        @NameInMap("ExcludeOrganizationalUnits")
        public java.util.List<String> excludeOrganizationalUnits;

        /**
         * <p>Excluded users</p>
         */
        @NameInMap("ExcludeUsers")
        public java.util.List<String> excludeUsers;

        /**
         * <p>Selected user groups</p>
         */
        @NameInMap("IncludeGroups")
        public java.util.List<String> includeGroups;

        /**
         * <p>Included organizations</p>
         */
        @NameInMap("IncludeOrganizationalUnits")
        public java.util.List<String> includeOrganizationalUnits;

        /**
         * <p>Selected users</p>
         */
        @NameInMap("IncludeUsers")
        public java.util.List<String> includeUsers;

        public static GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers build(java.util.Map<String, ?> map) throws Exception {
            GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers self = new GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers();
            return TeaModel.build(map, self);
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers setExcludeGroups(java.util.List<String> excludeGroups) {
            this.excludeGroups = excludeGroups;
            return this;
        }
        public java.util.List<String> getExcludeGroups() {
            return this.excludeGroups;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers setExcludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
            this.excludeOrganizationalUnits = excludeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getExcludeOrganizationalUnits() {
            return this.excludeOrganizationalUnits;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers setIncludeGroups(java.util.List<String> includeGroups) {
            this.includeGroups = includeGroups;
            return this;
        }
        public java.util.List<String> getIncludeGroups() {
            return this.includeGroups;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers setIncludeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
            this.includeOrganizationalUnits = includeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getIncludeOrganizationalUnits() {
            return this.includeOrganizationalUnits;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers setIncludeUsers(java.util.List<String> includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }
        public java.util.List<String> getIncludeUsers() {
            return this.includeUsers;
        }

    }

    public static class GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig extends TeaModel {
        /**
         * <p>Target applications of the conditional access policy</p>
         */
        @NameInMap("Applications")
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications applications;

        /**
         * <p>Network zones for the conditional access policy</p>
         */
        @NameInMap("NetworkZones")
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones networkZones;

        /**
         * <p>Target users of the conditional access policy</p>
         */
        @NameInMap("Users")
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers users;

        public static GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig self = new GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig();
            return TeaModel.build(map, self);
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig setApplications(GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications applications) {
            this.applications = applications;
            return this;
        }
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigApplications getApplications() {
            return this.applications;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig setNetworkZones(GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones networkZones) {
            this.networkZones = networkZones;
            return this;
        }
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigNetworkZones getNetworkZones() {
            return this.networkZones;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig setUsers(GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers users) {
            this.users = users;
            return this;
        }
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfigUsers getUsers() {
            return this.users;
        }

    }

    public static class GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig extends TeaModel {
        /**
         * <p>Whether to enable session reuse</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ActiveSessionReuseStatus")
        public String activeSessionReuseStatus;

        /**
         * <p>Decision action of the conditional access policy</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>Re-authentication interval (in seconds) for the conditional access policy</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MfaAuthenticationIntervalSeconds")
        public Long mfaAuthenticationIntervalSeconds;

        /**
         * <p>Allowed MFA types for the conditional access policy</p>
         */
        @NameInMap("MfaAuthenticationMethods")
        public java.util.List<String> mfaAuthenticationMethods;

        /**
         * <p>MFA authentication type of the conditional access policy</p>
         * 
         * <strong>example:</strong>
         * <p>directly_access</p>
         */
        @NameInMap("MfaType")
        public String mfaType;

        public static GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig self = new GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig();
            return TeaModel.build(map, self);
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig setActiveSessionReuseStatus(String activeSessionReuseStatus) {
            this.activeSessionReuseStatus = activeSessionReuseStatus;
            return this;
        }
        public String getActiveSessionReuseStatus() {
            return this.activeSessionReuseStatus;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig setMfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
            this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
            return this;
        }
        public Long getMfaAuthenticationIntervalSeconds() {
            return this.mfaAuthenticationIntervalSeconds;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig setMfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
            this.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }
        public java.util.List<String> getMfaAuthenticationMethods() {
            return this.mfaAuthenticationMethods;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig setMfaType(String mfaType) {
            this.mfaType = mfaType;
            return this;
        }
        public String getMfaType() {
            return this.mfaType;
        }

    }

    public static class GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy extends TeaModel {
        /**
         * <p>Conditional Access Policy ID</p>
         * 
         * <strong>example:</strong>
         * <p>cp_xxxxx</p>
         */
        @NameInMap("ConditionalAccessPolicyId")
        public String conditionalAccessPolicyId;

        /**
         * <p>Conditional Access Policy Name</p>
         * 
         * <strong>example:</strong>
         * <p>My Policy</p>
         */
        @NameInMap("ConditionalAccessPolicyName")
        public String conditionalAccessPolicyName;

        /**
         * <p>Type of the conditional access policy</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:authn:access:policy:system</p>
         */
        @NameInMap("ConditionalAccessPolicyType")
        public String conditionalAccessPolicyType;

        /**
         * <p>Conditional access policy content</p>
         */
        @NameInMap("ConditionsConfig")
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig conditionsConfig;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1741857554000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Action of the conditional access policy</p>
         */
        @NameInMap("DecisionConfig")
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig decisionConfig;

        /**
         * <p>Execution type of the conditional access policy</p>
         * 
         * <strong>example:</strong>
         * <p>enforcement</p>
         */
        @NameInMap("DecisionType")
        public String decisionType;

        /**
         * <p>Description of the conditional access policy</p>
         * 
         * <strong>example:</strong>
         * <p>ga access port for ecs: internal-cn-hangzhou-docker-builder-2(i-bp19g1pheaailkk1xvr6)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Execution point of the conditional access policy</p>
         * 
         * <strong>example:</strong>
         * <p>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1</p>
         */
        @NameInMap("EvaluateAt")
        public String evaluateAt;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_qnx6fbrinlecptl5hld23lfkvy</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Last updated time</p>
         * 
         * <strong>example:</strong>
         * <p>1741857554000</p>
         */
        @NameInMap("LastUpdatedTime")
        public Long lastUpdatedTime;

        /**
         * <p>Priority</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Enable or disable status of the conditional access policy</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy self = new GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy();
            return TeaModel.build(map, self);
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
            this.conditionalAccessPolicyId = conditionalAccessPolicyId;
            return this;
        }
        public String getConditionalAccessPolicyId() {
            return this.conditionalAccessPolicyId;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
            this.conditionalAccessPolicyName = conditionalAccessPolicyName;
            return this;
        }
        public String getConditionalAccessPolicyName() {
            return this.conditionalAccessPolicyName;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setConditionalAccessPolicyType(String conditionalAccessPolicyType) {
            this.conditionalAccessPolicyType = conditionalAccessPolicyType;
            return this;
        }
        public String getConditionalAccessPolicyType() {
            return this.conditionalAccessPolicyType;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setConditionsConfig(GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig conditionsConfig) {
            this.conditionsConfig = conditionsConfig;
            return this;
        }
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyConditionsConfig getConditionsConfig() {
            return this.conditionsConfig;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setDecisionConfig(GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig decisionConfig) {
            this.decisionConfig = decisionConfig;
            return this;
        }
        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicyDecisionConfig getDecisionConfig() {
            return this.decisionConfig;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setDecisionType(String decisionType) {
            this.decisionType = decisionType;
            return this;
        }
        public String getDecisionType() {
            return this.decisionType;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setEvaluateAt(String evaluateAt) {
            this.evaluateAt = evaluateAt;
            return this;
        }
        public String getEvaluateAt() {
            return this.evaluateAt;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setLastUpdatedTime(Long lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Long getLastUpdatedTime() {
            return this.lastUpdatedTime;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetConditionalAccessPolicyResponseBodyConditionalAccessPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateConditionalAccessPolicyRequest extends TeaModel {
    /**
     * <p>Conditional Access Policy ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cap_11111</p>
     */
    @NameInMap("ConditionalAccessPolicyId")
    public String conditionalAccessPolicyId;

    /**
     * <p>Conditional Access Policy Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My Policy</p>
     */
    @NameInMap("ConditionalAccessPolicyName")
    public String conditionalAccessPolicyName;

    /**
     * <p>Conditional Access Policy Condition Content Configuration</p>
     */
    @NameInMap("ConditionsConfig")
    public UpdateConditionalAccessPolicyRequestConditionsConfig conditionsConfig;

    /**
     * <p>Conditional Access Policy Action Configuration</p>
     */
    @NameInMap("DecisionConfig")
    public UpdateConditionalAccessPolicyRequestDecisionConfig decisionConfig;

    /**
     * <p>Conditional Access Policy Execution Type</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enforcement</p>
     */
    @NameInMap("DecisionType")
    public String decisionType;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Priority of the conditional access policy</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    public static UpdateConditionalAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConditionalAccessPolicyRequest self = new UpdateConditionalAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConditionalAccessPolicyRequest setConditionalAccessPolicyId(String conditionalAccessPolicyId) {
        this.conditionalAccessPolicyId = conditionalAccessPolicyId;
        return this;
    }
    public String getConditionalAccessPolicyId() {
        return this.conditionalAccessPolicyId;
    }

    public UpdateConditionalAccessPolicyRequest setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
        this.conditionalAccessPolicyName = conditionalAccessPolicyName;
        return this;
    }
    public String getConditionalAccessPolicyName() {
        return this.conditionalAccessPolicyName;
    }

    public UpdateConditionalAccessPolicyRequest setConditionsConfig(UpdateConditionalAccessPolicyRequestConditionsConfig conditionsConfig) {
        this.conditionsConfig = conditionsConfig;
        return this;
    }
    public UpdateConditionalAccessPolicyRequestConditionsConfig getConditionsConfig() {
        return this.conditionsConfig;
    }

    public UpdateConditionalAccessPolicyRequest setDecisionConfig(UpdateConditionalAccessPolicyRequestDecisionConfig decisionConfig) {
        this.decisionConfig = decisionConfig;
        return this;
    }
    public UpdateConditionalAccessPolicyRequestDecisionConfig getDecisionConfig() {
        return this.decisionConfig;
    }

    public UpdateConditionalAccessPolicyRequest setDecisionType(String decisionType) {
        this.decisionType = decisionType;
        return this;
    }
    public String getDecisionType() {
        return this.decisionType;
    }

    public UpdateConditionalAccessPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConditionalAccessPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public static class UpdateConditionalAccessPolicyRequestConditionsConfigApplications extends TeaModel {
        /**
         * <p>Excluded Applications</p>
         */
        @NameInMap("ExcludeApplications")
        public java.util.List<String> excludeApplications;

        /**
         * <p>Included Applications</p>
         */
        @NameInMap("IncludeApplications")
        public java.util.List<String> includeApplications;

        public static UpdateConditionalAccessPolicyRequestConditionsConfigApplications build(java.util.Map<String, ?> map) throws Exception {
            UpdateConditionalAccessPolicyRequestConditionsConfigApplications self = new UpdateConditionalAccessPolicyRequestConditionsConfigApplications();
            return TeaModel.build(map, self);
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigApplications setExcludeApplications(java.util.List<String> excludeApplications) {
            this.excludeApplications = excludeApplications;
            return this;
        }
        public java.util.List<String> getExcludeApplications() {
            return this.excludeApplications;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigApplications setIncludeApplications(java.util.List<String> includeApplications) {
            this.includeApplications = includeApplications;
            return this;
        }
        public java.util.List<String> getIncludeApplications() {
            return this.includeApplications;
        }

    }

    public static class UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones extends TeaModel {
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

        public static UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones build(java.util.Map<String, ?> map) throws Exception {
            UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones self = new UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones();
            return TeaModel.build(map, self);
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones setExcludeNetworkZones(java.util.List<String> excludeNetworkZones) {
            this.excludeNetworkZones = excludeNetworkZones;
            return this;
        }
        public java.util.List<String> getExcludeNetworkZones() {
            return this.excludeNetworkZones;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones setIncludeNetworkZones(java.util.List<String> includeNetworkZones) {
            this.includeNetworkZones = includeNetworkZones;
            return this;
        }
        public java.util.List<String> getIncludeNetworkZones() {
            return this.includeNetworkZones;
        }

    }

    public static class UpdateConditionalAccessPolicyRequestConditionsConfigUsers extends TeaModel {
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
         * <p>Excluded Users</p>
         */
        @NameInMap("ExcludeUsers")
        public java.util.List<String> excludeUsers;

        /**
         * <p>Included User Groups</p>
         */
        @NameInMap("IncludeGroups")
        public java.util.List<String> includeGroups;

        /**
         * <p>Included organizations</p>
         */
        @NameInMap("IncludeOrganizationalUnits")
        public java.util.List<String> includeOrganizationalUnits;

        /**
         * <p>Included Users</p>
         */
        @NameInMap("IncludeUsers")
        public java.util.List<String> includeUsers;

        public static UpdateConditionalAccessPolicyRequestConditionsConfigUsers build(java.util.Map<String, ?> map) throws Exception {
            UpdateConditionalAccessPolicyRequestConditionsConfigUsers self = new UpdateConditionalAccessPolicyRequestConditionsConfigUsers();
            return TeaModel.build(map, self);
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigUsers setExcludeGroups(java.util.List<String> excludeGroups) {
            this.excludeGroups = excludeGroups;
            return this;
        }
        public java.util.List<String> getExcludeGroups() {
            return this.excludeGroups;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigUsers setExcludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
            this.excludeOrganizationalUnits = excludeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getExcludeOrganizationalUnits() {
            return this.excludeOrganizationalUnits;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigUsers setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigUsers setIncludeGroups(java.util.List<String> includeGroups) {
            this.includeGroups = includeGroups;
            return this;
        }
        public java.util.List<String> getIncludeGroups() {
            return this.includeGroups;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigUsers setIncludeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
            this.includeOrganizationalUnits = includeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getIncludeOrganizationalUnits() {
            return this.includeOrganizationalUnits;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfigUsers setIncludeUsers(java.util.List<String> includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }
        public java.util.List<String> getIncludeUsers() {
            return this.includeUsers;
        }

    }

    public static class UpdateConditionalAccessPolicyRequestConditionsConfig extends TeaModel {
        /**
         * <p>Target Applications for the Conditional Access Policy</p>
         */
        @NameInMap("Applications")
        public UpdateConditionalAccessPolicyRequestConditionsConfigApplications applications;

        /**
         * <p>Network zones for conditional access policy</p>
         */
        @NameInMap("NetworkZones")
        public UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones networkZones;

        /**
         * <p>Target Users for the Conditional Access Policy</p>
         */
        @NameInMap("Users")
        public UpdateConditionalAccessPolicyRequestConditionsConfigUsers users;

        public static UpdateConditionalAccessPolicyRequestConditionsConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateConditionalAccessPolicyRequestConditionsConfig self = new UpdateConditionalAccessPolicyRequestConditionsConfig();
            return TeaModel.build(map, self);
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfig setApplications(UpdateConditionalAccessPolicyRequestConditionsConfigApplications applications) {
            this.applications = applications;
            return this;
        }
        public UpdateConditionalAccessPolicyRequestConditionsConfigApplications getApplications() {
            return this.applications;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfig setNetworkZones(UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones networkZones) {
            this.networkZones = networkZones;
            return this;
        }
        public UpdateConditionalAccessPolicyRequestConditionsConfigNetworkZones getNetworkZones() {
            return this.networkZones;
        }

        public UpdateConditionalAccessPolicyRequestConditionsConfig setUsers(UpdateConditionalAccessPolicyRequestConditionsConfigUsers users) {
            this.users = users;
            return this;
        }
        public UpdateConditionalAccessPolicyRequestConditionsConfigUsers getUsers() {
            return this.users;
        }

    }

    public static class UpdateConditionalAccessPolicyRequestDecisionConfig extends TeaModel {
        /**
         * <p>Whether to enable session reuse</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ActiveSessionReuseStatus")
        public String activeSessionReuseStatus;

        /**
         * <p>Conditional Access Policy Decision Action</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>Conditional Access Policy Re-authentication Interval (seconds)</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("MfaAuthenticationIntervalSeconds")
        public Long mfaAuthenticationIntervalSeconds;

        /**
         * <p>Allowed MFA types for the Conditional Access Policy</p>
         */
        @NameInMap("MfaAuthenticationMethods")
        public java.util.List<String> mfaAuthenticationMethods;

        /**
         * <p>Conditional Access Policy MFA Type</p>
         * 
         * <strong>example:</strong>
         * <p>directly_access</p>
         */
        @NameInMap("MfaType")
        public String mfaType;

        public static UpdateConditionalAccessPolicyRequestDecisionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateConditionalAccessPolicyRequestDecisionConfig self = new UpdateConditionalAccessPolicyRequestDecisionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateConditionalAccessPolicyRequestDecisionConfig setActiveSessionReuseStatus(String activeSessionReuseStatus) {
            this.activeSessionReuseStatus = activeSessionReuseStatus;
            return this;
        }
        public String getActiveSessionReuseStatus() {
            return this.activeSessionReuseStatus;
        }

        public UpdateConditionalAccessPolicyRequestDecisionConfig setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public UpdateConditionalAccessPolicyRequestDecisionConfig setMfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
            this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
            return this;
        }
        public Long getMfaAuthenticationIntervalSeconds() {
            return this.mfaAuthenticationIntervalSeconds;
        }

        public UpdateConditionalAccessPolicyRequestDecisionConfig setMfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
            this.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }
        public java.util.List<String> getMfaAuthenticationMethods() {
            return this.mfaAuthenticationMethods;
        }

        public UpdateConditionalAccessPolicyRequestDecisionConfig setMfaType(String mfaType) {
            this.mfaType = mfaType;
            return this;
        }
        public String getMfaType() {
            return this.mfaType;
        }

    }

}

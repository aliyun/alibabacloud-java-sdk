// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateConditionalAccessPolicyRequest extends TeaModel {
    /**
     * <p>Idempotent token.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-example</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Conditional access policy name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My Conditional Access Policy</p>
     */
    @NameInMap("ConditionalAccessPolicyName")
    public String conditionalAccessPolicyName;

    /**
     * <p>Type of the conditional access policy, with the following options:</p>
     * <p>arn:alibaba:idaas:authn:access:policy:system: System policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arn:alibaba:idaas:authn:access:policy:system</p>
     */
    @NameInMap("ConditionalAccessPolicyType")
    public String conditionalAccessPolicyType;

    /**
     * <p>Condition content configuration for the conditional access policy</p>
     */
    @NameInMap("ConditionsConfig")
    public CreateConditionalAccessPolicyRequestConditionsConfig conditionsConfig;

    /**
     * <p>Action configuration for the conditional access policy</p>
     */
    @NameInMap("DecisionConfig")
    public CreateConditionalAccessPolicyRequestDecisionConfig decisionConfig;

    /**
     * <p>Execution type of the conditional access policy, with the following options:</p>
     * <p>enforcement: Enforce the policy.</p>
     * <p>This parameter is required.</p>
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
     * <p>Test Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Execution point of the conditional access policy, with the following options:</p>
     * <ul>
     * <li>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1: Allow.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>arn:alibaba:idaas:authn:access:rule:eval_at:after_step1</p>
     */
    @NameInMap("EvaluateAt")
    public String evaluateAt;

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
     * <p>Priority of the conditional access policy, lower values indicate higher priority
     * Minimum value: 1
     * Maximum value: 100</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    public static CreateConditionalAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConditionalAccessPolicyRequest self = new CreateConditionalAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateConditionalAccessPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateConditionalAccessPolicyRequest setConditionalAccessPolicyName(String conditionalAccessPolicyName) {
        this.conditionalAccessPolicyName = conditionalAccessPolicyName;
        return this;
    }
    public String getConditionalAccessPolicyName() {
        return this.conditionalAccessPolicyName;
    }

    public CreateConditionalAccessPolicyRequest setConditionalAccessPolicyType(String conditionalAccessPolicyType) {
        this.conditionalAccessPolicyType = conditionalAccessPolicyType;
        return this;
    }
    public String getConditionalAccessPolicyType() {
        return this.conditionalAccessPolicyType;
    }

    public CreateConditionalAccessPolicyRequest setConditionsConfig(CreateConditionalAccessPolicyRequestConditionsConfig conditionsConfig) {
        this.conditionsConfig = conditionsConfig;
        return this;
    }
    public CreateConditionalAccessPolicyRequestConditionsConfig getConditionsConfig() {
        return this.conditionsConfig;
    }

    public CreateConditionalAccessPolicyRequest setDecisionConfig(CreateConditionalAccessPolicyRequestDecisionConfig decisionConfig) {
        this.decisionConfig = decisionConfig;
        return this;
    }
    public CreateConditionalAccessPolicyRequestDecisionConfig getDecisionConfig() {
        return this.decisionConfig;
    }

    public CreateConditionalAccessPolicyRequest setDecisionType(String decisionType) {
        this.decisionType = decisionType;
        return this;
    }
    public String getDecisionType() {
        return this.decisionType;
    }

    public CreateConditionalAccessPolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConditionalAccessPolicyRequest setEvaluateAt(String evaluateAt) {
        this.evaluateAt = evaluateAt;
        return this;
    }
    public String getEvaluateAt() {
        return this.evaluateAt;
    }

    public CreateConditionalAccessPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateConditionalAccessPolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public static class CreateConditionalAccessPolicyRequestConditionsConfigApplications extends TeaModel {
        /**
         * <p>Excluded applications</p>
         */
        @NameInMap("ExcludeApplications")
        public java.util.List<String> excludeApplications;

        /**
         * <p>Included applications</p>
         */
        @NameInMap("IncludeApplications")
        public java.util.List<String> includeApplications;

        public static CreateConditionalAccessPolicyRequestConditionsConfigApplications build(java.util.Map<String, ?> map) throws Exception {
            CreateConditionalAccessPolicyRequestConditionsConfigApplications self = new CreateConditionalAccessPolicyRequestConditionsConfigApplications();
            return TeaModel.build(map, self);
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigApplications setExcludeApplications(java.util.List<String> excludeApplications) {
            this.excludeApplications = excludeApplications;
            return this;
        }
        public java.util.List<String> getExcludeApplications() {
            return this.excludeApplications;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigApplications setIncludeApplications(java.util.List<String> includeApplications) {
            this.includeApplications = includeApplications;
            return this;
        }
        public java.util.List<String> getIncludeApplications() {
            return this.includeApplications;
        }

    }

    public static class CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones extends TeaModel {
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

        public static CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones build(java.util.Map<String, ?> map) throws Exception {
            CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones self = new CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones();
            return TeaModel.build(map, self);
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones setExcludeNetworkZones(java.util.List<String> excludeNetworkZones) {
            this.excludeNetworkZones = excludeNetworkZones;
            return this;
        }
        public java.util.List<String> getExcludeNetworkZones() {
            return this.excludeNetworkZones;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones setIncludeNetworkZones(java.util.List<String> includeNetworkZones) {
            this.includeNetworkZones = includeNetworkZones;
            return this;
        }
        public java.util.List<String> getIncludeNetworkZones() {
            return this.includeNetworkZones;
        }

    }

    public static class CreateConditionalAccessPolicyRequestConditionsConfigUsers extends TeaModel {
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
         * <p>Included user groups</p>
         */
        @NameInMap("IncludeGroups")
        public java.util.List<String> includeGroups;

        /**
         * <p>Included organizations</p>
         */
        @NameInMap("IncludeOrganizationalUnits")
        public java.util.List<String> includeOrganizationalUnits;

        /**
         * <p>Selected user</p>
         */
        @NameInMap("IncludeUsers")
        public java.util.List<String> includeUsers;

        public static CreateConditionalAccessPolicyRequestConditionsConfigUsers build(java.util.Map<String, ?> map) throws Exception {
            CreateConditionalAccessPolicyRequestConditionsConfigUsers self = new CreateConditionalAccessPolicyRequestConditionsConfigUsers();
            return TeaModel.build(map, self);
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigUsers setExcludeGroups(java.util.List<String> excludeGroups) {
            this.excludeGroups = excludeGroups;
            return this;
        }
        public java.util.List<String> getExcludeGroups() {
            return this.excludeGroups;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigUsers setExcludeOrganizationalUnits(java.util.List<String> excludeOrganizationalUnits) {
            this.excludeOrganizationalUnits = excludeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getExcludeOrganizationalUnits() {
            return this.excludeOrganizationalUnits;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigUsers setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigUsers setIncludeGroups(java.util.List<String> includeGroups) {
            this.includeGroups = includeGroups;
            return this;
        }
        public java.util.List<String> getIncludeGroups() {
            return this.includeGroups;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigUsers setIncludeOrganizationalUnits(java.util.List<String> includeOrganizationalUnits) {
            this.includeOrganizationalUnits = includeOrganizationalUnits;
            return this;
        }
        public java.util.List<String> getIncludeOrganizationalUnits() {
            return this.includeOrganizationalUnits;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfigUsers setIncludeUsers(java.util.List<String> includeUsers) {
            this.includeUsers = includeUsers;
            return this;
        }
        public java.util.List<String> getIncludeUsers() {
            return this.includeUsers;
        }

    }

    public static class CreateConditionalAccessPolicyRequestConditionsConfig extends TeaModel {
        /**
         * <p>Target applications for the conditional access policy</p>
         */
        @NameInMap("Applications")
        public CreateConditionalAccessPolicyRequestConditionsConfigApplications applications;

        /**
         * <p>Network zones for conditional access policy</p>
         */
        @NameInMap("NetworkZones")
        public CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones networkZones;

        /**
         * <p>Target users of the conditional access policy</p>
         */
        @NameInMap("Users")
        public CreateConditionalAccessPolicyRequestConditionsConfigUsers users;

        public static CreateConditionalAccessPolicyRequestConditionsConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateConditionalAccessPolicyRequestConditionsConfig self = new CreateConditionalAccessPolicyRequestConditionsConfig();
            return TeaModel.build(map, self);
        }

        public CreateConditionalAccessPolicyRequestConditionsConfig setApplications(CreateConditionalAccessPolicyRequestConditionsConfigApplications applications) {
            this.applications = applications;
            return this;
        }
        public CreateConditionalAccessPolicyRequestConditionsConfigApplications getApplications() {
            return this.applications;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfig setNetworkZones(CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones networkZones) {
            this.networkZones = networkZones;
            return this;
        }
        public CreateConditionalAccessPolicyRequestConditionsConfigNetworkZones getNetworkZones() {
            return this.networkZones;
        }

        public CreateConditionalAccessPolicyRequestConditionsConfig setUsers(CreateConditionalAccessPolicyRequestConditionsConfigUsers users) {
            this.users = users;
            return this;
        }
        public CreateConditionalAccessPolicyRequestConditionsConfigUsers getUsers() {
            return this.users;
        }

    }

    public static class CreateConditionalAccessPolicyRequestDecisionConfig extends TeaModel {
        /**
         * <p>Whether to enable session reuse</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ActiveSessionReuseStatus")
        public String activeSessionReuseStatus;

        /**
         * <p>Decision action for the conditional access policy, with the following options:</p>
         * <ul>
         * <li>allow: Allow.</li>
         * <li>deny: Deny.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>allow or deny</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>Re-authentication interval (in seconds) for the conditional access policy</p>
         * <ul>
         * <li>Maximum MFA re-authentication interval: 86400</li>
         * <li>Minimum MFA re-authentication interval: 300</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("MfaAuthenticationIntervalSeconds")
        public Long mfaAuthenticationIntervalSeconds;

        /**
         * <p>Allowed MFA types for the conditional access policy, with the following options:</p>
         * <ul>
         * <li>ia_otp_sms: SMS verification code</li>
         * <li>ia_otp_email: Email verification code</li>
         * <li>ia_totp: OTP dynamic password</li>
         * <li>ia_webauthn: WebAuthn</li>
         * </ul>
         */
        @NameInMap("MfaAuthenticationMethods")
        public java.util.List<String> mfaAuthenticationMethods;

        /**
         * <p>MFA type for the conditional access policy, with the following options:</p>
         * <ul>
         * <li>directly_access: Direct access</li>
         * <li>mfa_required: MFA required</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>directly_access</p>
         */
        @NameInMap("MfaType")
        public String mfaType;

        public static CreateConditionalAccessPolicyRequestDecisionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateConditionalAccessPolicyRequestDecisionConfig self = new CreateConditionalAccessPolicyRequestDecisionConfig();
            return TeaModel.build(map, self);
        }

        public CreateConditionalAccessPolicyRequestDecisionConfig setActiveSessionReuseStatus(String activeSessionReuseStatus) {
            this.activeSessionReuseStatus = activeSessionReuseStatus;
            return this;
        }
        public String getActiveSessionReuseStatus() {
            return this.activeSessionReuseStatus;
        }

        public CreateConditionalAccessPolicyRequestDecisionConfig setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public CreateConditionalAccessPolicyRequestDecisionConfig setMfaAuthenticationIntervalSeconds(Long mfaAuthenticationIntervalSeconds) {
            this.mfaAuthenticationIntervalSeconds = mfaAuthenticationIntervalSeconds;
            return this;
        }
        public Long getMfaAuthenticationIntervalSeconds() {
            return this.mfaAuthenticationIntervalSeconds;
        }

        public CreateConditionalAccessPolicyRequestDecisionConfig setMfaAuthenticationMethods(java.util.List<String> mfaAuthenticationMethods) {
            this.mfaAuthenticationMethods = mfaAuthenticationMethods;
            return this;
        }
        public java.util.List<String> getMfaAuthenticationMethods() {
            return this.mfaAuthenticationMethods;
        }

        public CreateConditionalAccessPolicyRequestDecisionConfig setMfaType(String mfaType) {
            this.mfaType = mfaType;
            return this;
        }
        public String getMfaType() {
            return this.mfaType;
        }

    }

}

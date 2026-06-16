// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderUdPushConfigurationResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Outbound synchronization configuration</p>
     */
    @NameInMap("UdPushConfiguration")
    public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration udPushConfiguration;

    public static GetIdentityProviderUdPushConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderUdPushConfigurationResponseBody self = new GetIdentityProviderUdPushConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderUdPushConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderUdPushConfigurationResponseBody setUdPushConfiguration(GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration udPushConfiguration) {
        this.udPushConfiguration = udPushConfiguration;
        return this;
    }
    public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration getUdPushConfiguration() {
        return this.udPushConfiguration;
    }

    public static class GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig extends TeaModel {
        /**
         * <p>Organization ObjectClass</p>
         * 
         * <strong>example:</strong>
         * <p>ou,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <p>Organization RDN</p>
         * 
         * <strong>example:</strong>
         * <p>ou</p>
         */
        @NameInMap("OrganizationalUnitRdn")
        public String organizationalUnitRdn;

        /**
         * <p>Password synchronization status</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordSyncStatus")
        public String passwordSyncStatus;

        /**
         * <p>User ObjectClass</p>
         * 
         * <strong>example:</strong>
         * <p>user,top</p>
         */
        @NameInMap("UserObjectClass")
        public String userObjectClass;

        /**
         * <p>User RDN</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("UserRdn")
        public String userRdn;

        public static GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig self = new GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig setOrganizationUnitObjectClass(String organizationUnitObjectClass) {
            this.organizationUnitObjectClass = organizationUnitObjectClass;
            return this;
        }
        public String getOrganizationUnitObjectClass() {
            return this.organizationUnitObjectClass;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig setOrganizationalUnitRdn(String organizationalUnitRdn) {
            this.organizationalUnitRdn = organizationalUnitRdn;
            return this;
        }
        public String getOrganizationalUnitRdn() {
            return this.organizationalUnitRdn;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig setPasswordSyncStatus(String passwordSyncStatus) {
            this.passwordSyncStatus = passwordSyncStatus;
            return this;
        }
        public String getPasswordSyncStatus() {
            return this.passwordSyncStatus;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig setUserObjectClass(String userObjectClass) {
            this.userObjectClass = userObjectClass;
            return this;
        }
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig setUserRdn(String userRdn) {
            this.userRdn = userRdn;
            return this;
        }
        public String getUserRdn() {
            return this.userRdn;
        }

    }

    public static class GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig extends TeaModel {
        /**
         * <p>Cron expression</p>
         * 
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        /**
         * <p>Collection of time points</p>
         */
        @NameInMap("PeriodicSyncTimes")
        public java.util.List<String> periodicSyncTimes;

        /**
         * <p>Type</p>
         * 
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("PeriodicSyncType")
        public String periodicSyncType;

        public static GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig self = new GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig setPeriodicSyncCron(String periodicSyncCron) {
            this.periodicSyncCron = periodicSyncCron;
            return this;
        }
        public String getPeriodicSyncCron() {
            return this.periodicSyncCron;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig setPeriodicSyncTimes(java.util.List<String> periodicSyncTimes) {
            this.periodicSyncTimes = periodicSyncTimes;
            return this;
        }
        public java.util.List<String> getPeriodicSyncTimes() {
            return this.periodicSyncTimes;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig setPeriodicSyncType(String periodicSyncType) {
            this.periodicSyncType = periodicSyncType;
            return this;
        }
        public String getPeriodicSyncType() {
            return this.periodicSyncType;
        }

    }

    public static class GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs extends TeaModel {
        /**
         * <p>Source nodes for synchronization</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>Target node for synchronization</p>
         * 
         * <strong>example:</strong>
         * <p>604352338</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs self = new GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs setSourceScopes(java.util.List<String> sourceScopes) {
            this.sourceScopes = sourceScopes;
            return this;
        }
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

    public static class GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration extends TeaModel {
        /**
         * <p>Identity provider ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_na2rzpyc67zr7ixdfy35zgrxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>Incremental callback status. Indicates whether incremental callback data from the IdP is processed.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_7vdv3olzk36gymwtlaq6fixxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>LDAP synchronization-side configuration</p>
         */
        @NameInMap("LdapUdPushConfig")
        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig ldapUdPushConfig;

        /**
         * <p>Periodic verification configuration</p>
         */
        @NameInMap("PeriodicSyncConfig")
        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig periodicSyncConfig;

        /**
         * <p>Periodic verification status</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>Outbound synchronization configuration details</p>
         */
        @NameInMap("UdSyncScopeConfigs")
        public java.util.List<GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs> udSyncScopeConfigs;

        public static GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration self = new GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration setIncrementalCallbackStatus(String incrementalCallbackStatus) {
            this.incrementalCallbackStatus = incrementalCallbackStatus;
            return this;
        }
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration setLdapUdPushConfig(GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig ldapUdPushConfig) {
            this.ldapUdPushConfig = ldapUdPushConfig;
            return this;
        }
        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig getLdapUdPushConfig() {
            return this.ldapUdPushConfig;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration setPeriodicSyncConfig(GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig periodicSyncConfig) {
            this.periodicSyncConfig = periodicSyncConfig;
            return this;
        }
        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig getPeriodicSyncConfig() {
            return this.periodicSyncConfig;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration setPeriodicSyncStatus(String periodicSyncStatus) {
            this.periodicSyncStatus = periodicSyncStatus;
            return this;
        }
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
        }

        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfiguration setUdSyncScopeConfigs(java.util.List<GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs> udSyncScopeConfigs) {
            this.udSyncScopeConfigs = udSyncScopeConfigs;
            return this;
        }
        public java.util.List<GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationUdSyncScopeConfigs> getUdSyncScopeConfigs() {
            return this.udSyncScopeConfigs;
        }

    }

}

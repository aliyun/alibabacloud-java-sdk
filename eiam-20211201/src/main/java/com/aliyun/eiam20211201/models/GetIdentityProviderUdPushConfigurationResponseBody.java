// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderUdPushConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>ou,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <strong>example:</strong>
         * <p>ou</p>
         */
        @NameInMap("OrganizationalUnitRdn")
        public String organizationalUnitRdn;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PasswordSyncStatus")
        public String passwordSyncStatus;

        /**
         * <strong>example:</strong>
         * <p>user,top</p>
         */
        @NameInMap("UserObjectClass")
        public String userObjectClass;

        /**
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
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        @NameInMap("PeriodicSyncTimes")
        public java.util.List<String> periodicSyncTimes;

        /**
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
         * <p>同步来源节点</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>同步目标节点</p>
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
         * <p>IDaaS EIAM 身份提供方ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_na2rzpyc67zr7ixdfy35zgrxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_7vdv3olzk36gymwtlaq6fixxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LdapUdPushConfig")
        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationLdapUdPushConfig ldapUdPushConfig;

        @NameInMap("PeriodicSyncConfig")
        public GetIdentityProviderUdPushConfigurationResponseBodyUdPushConfigurationPeriodicSyncConfig periodicSyncConfig;

        /**
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>同步出配置信息</p>
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

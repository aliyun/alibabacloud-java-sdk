// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetIdentityProviderUdPushConfigurationRequest extends TeaModel {
    /**
     * <p>IDaaS的身份提供方主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_11111</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

    /**
     * <p>增量回调状态，是否处理来自IdP的增量回调数据</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("IncrementalCallbackStatus")
    public String incrementalCallbackStatus;

    /**
     * <p>IDaaS EIAM的实例id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam-111ccc1111</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LdapUdPushConfig")
    public SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig ldapUdPushConfig;

    @NameInMap("PeriodicSyncConfig")
    public SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig periodicSyncConfig;

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
    public java.util.List<SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs> udSyncScopeConfigs;

    public static SetIdentityProviderUdPushConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIdentityProviderUdPushConfigurationRequest self = new SetIdentityProviderUdPushConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetIdentityProviderUdPushConfigurationRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public SetIdentityProviderUdPushConfigurationRequest setIncrementalCallbackStatus(String incrementalCallbackStatus) {
        this.incrementalCallbackStatus = incrementalCallbackStatus;
        return this;
    }
    public String getIncrementalCallbackStatus() {
        return this.incrementalCallbackStatus;
    }

    public SetIdentityProviderUdPushConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetIdentityProviderUdPushConfigurationRequest setLdapUdPushConfig(SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig ldapUdPushConfig) {
        this.ldapUdPushConfig = ldapUdPushConfig;
        return this;
    }
    public SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig getLdapUdPushConfig() {
        return this.ldapUdPushConfig;
    }

    public SetIdentityProviderUdPushConfigurationRequest setPeriodicSyncConfig(SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig periodicSyncConfig) {
        this.periodicSyncConfig = periodicSyncConfig;
        return this;
    }
    public SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig getPeriodicSyncConfig() {
        return this.periodicSyncConfig;
    }

    public SetIdentityProviderUdPushConfigurationRequest setPeriodicSyncStatus(String periodicSyncStatus) {
        this.periodicSyncStatus = periodicSyncStatus;
        return this;
    }
    public String getPeriodicSyncStatus() {
        return this.periodicSyncStatus;
    }

    public SetIdentityProviderUdPushConfigurationRequest setUdSyncScopeConfigs(java.util.List<SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs> udSyncScopeConfigs) {
        this.udSyncScopeConfigs = udSyncScopeConfigs;
        return this;
    }
    public java.util.List<SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs> getUdSyncScopeConfigs() {
        return this.udSyncScopeConfigs;
    }

    public static class SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig extends TeaModel {
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

        public static SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig self = new SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig setOrganizationUnitObjectClass(String organizationUnitObjectClass) {
            this.organizationUnitObjectClass = organizationUnitObjectClass;
            return this;
        }
        public String getOrganizationUnitObjectClass() {
            return this.organizationUnitObjectClass;
        }

        public SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig setOrganizationalUnitRdn(String organizationalUnitRdn) {
            this.organizationalUnitRdn = organizationalUnitRdn;
            return this;
        }
        public String getOrganizationalUnitRdn() {
            return this.organizationalUnitRdn;
        }

        public SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig setPasswordSyncStatus(String passwordSyncStatus) {
            this.passwordSyncStatus = passwordSyncStatus;
            return this;
        }
        public String getPasswordSyncStatus() {
            return this.passwordSyncStatus;
        }

        public SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig setUserObjectClass(String userObjectClass) {
            this.userObjectClass = userObjectClass;
            return this;
        }
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

        public SetIdentityProviderUdPushConfigurationRequestLdapUdPushConfig setUserRdn(String userRdn) {
            this.userRdn = userRdn;
            return this;
        }
        public String getUserRdn() {
            return this.userRdn;
        }

    }

    public static class SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        @NameInMap("PeriodicSyncTimes")
        public java.util.List<Integer> periodicSyncTimes;

        /**
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("PeriodicSyncType")
        public String periodicSyncType;

        public static SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig self = new SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig setPeriodicSyncCron(String periodicSyncCron) {
            this.periodicSyncCron = periodicSyncCron;
            return this;
        }
        public String getPeriodicSyncCron() {
            return this.periodicSyncCron;
        }

        public SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig setPeriodicSyncTimes(java.util.List<Integer> periodicSyncTimes) {
            this.periodicSyncTimes = periodicSyncTimes;
            return this;
        }
        public java.util.List<Integer> getPeriodicSyncTimes() {
            return this.periodicSyncTimes;
        }

        public SetIdentityProviderUdPushConfigurationRequestPeriodicSyncConfig setPeriodicSyncType(String periodicSyncType) {
            this.periodicSyncType = periodicSyncType;
            return this;
        }
        public String getPeriodicSyncType() {
            return this.periodicSyncType;
        }

    }

    public static class SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs extends TeaModel {
        /**
         * <p>同步来源节点</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>同步目标节点</p>
         * 
         * <strong>example:</strong>
         * <p>6537211</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs self = new SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs setSourceScopes(java.util.List<String> sourceScopes) {
            this.sourceScopes = sourceScopes;
            return this;
        }
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        public SetIdentityProviderUdPushConfigurationRequestUdSyncScopeConfigs setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

}

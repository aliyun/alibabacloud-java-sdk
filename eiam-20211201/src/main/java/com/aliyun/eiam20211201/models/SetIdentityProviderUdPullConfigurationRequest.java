// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetIdentityProviderUdPullConfigurationRequest extends TeaModel {
    /**
     * <p>The group synchronization status. Valid values:</p>
     * <ul>
     * <li><p>disabled: The feature is disabled.</p>
     * </li>
     * <li><p>enabled: The feature is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("GroupSyncStatus")
    public String groupSyncStatus;

    /**
     * <p>The identity provider ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
     */
    @NameInMap("IdentityProviderId")
    public String identityProviderId;

    /**
     * <p>The status of incremental callback. This parameter specifies whether to process incremental callback data from the IdP. Valid values:</p>
     * <ul>
     * <li><p>disabled: The feature is disabled.</p>
     * </li>
     * <li><p>enabled: The feature is enabled.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("IncrementalCallbackStatus")
    public String incrementalCallbackStatus;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The configurations of LDAP synchronization.</p>
     */
    @NameInMap("LdapUdPullConfig")
    public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig ldapUdPullConfig;

    /**
     * <p>The scheduled synchronization configuration.</p>
     */
    @NameInMap("PeriodicSyncConfig")
    public SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig periodicSyncConfig;

    /**
     * <p>The status of scheduled check. This parameter specifies whether to periodically check for data inconsistencies between IDaaS and the IdP. Valid values:</p>
     * <ul>
     * <li><p>disabled: The feature is disabled.</p>
     * </li>
     * <li><p>enabled: The feature is enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("PeriodicSyncStatus")
    public String periodicSyncStatus;

    /**
     * <p>The inbound synchronization protection rule.</p>
     */
    @NameInMap("PullProtectedRule")
    public SetIdentityProviderUdPullConfigurationRequestPullProtectedRule pullProtectedRule;

    /**
     * <p>The inbound synchronization configuration.</p>
     */
    @NameInMap("UdSyncScopeConfig")
    public SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig udSyncScopeConfig;

    public static SetIdentityProviderUdPullConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        SetIdentityProviderUdPullConfigurationRequest self = new SetIdentityProviderUdPullConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public SetIdentityProviderUdPullConfigurationRequest setGroupSyncStatus(String groupSyncStatus) {
        this.groupSyncStatus = groupSyncStatus;
        return this;
    }
    public String getGroupSyncStatus() {
        return this.groupSyncStatus;
    }

    public SetIdentityProviderUdPullConfigurationRequest setIdentityProviderId(String identityProviderId) {
        this.identityProviderId = identityProviderId;
        return this;
    }
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    public SetIdentityProviderUdPullConfigurationRequest setIncrementalCallbackStatus(String incrementalCallbackStatus) {
        this.incrementalCallbackStatus = incrementalCallbackStatus;
        return this;
    }
    public String getIncrementalCallbackStatus() {
        return this.incrementalCallbackStatus;
    }

    public SetIdentityProviderUdPullConfigurationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetIdentityProviderUdPullConfigurationRequest setLdapUdPullConfig(SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig ldapUdPullConfig) {
        this.ldapUdPullConfig = ldapUdPullConfig;
        return this;
    }
    public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig getLdapUdPullConfig() {
        return this.ldapUdPullConfig;
    }

    public SetIdentityProviderUdPullConfigurationRequest setPeriodicSyncConfig(SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig periodicSyncConfig) {
        this.periodicSyncConfig = periodicSyncConfig;
        return this;
    }
    public SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig getPeriodicSyncConfig() {
        return this.periodicSyncConfig;
    }

    public SetIdentityProviderUdPullConfigurationRequest setPeriodicSyncStatus(String periodicSyncStatus) {
        this.periodicSyncStatus = periodicSyncStatus;
        return this;
    }
    public String getPeriodicSyncStatus() {
        return this.periodicSyncStatus;
    }

    public SetIdentityProviderUdPullConfigurationRequest setPullProtectedRule(SetIdentityProviderUdPullConfigurationRequestPullProtectedRule pullProtectedRule) {
        this.pullProtectedRule = pullProtectedRule;
        return this;
    }
    public SetIdentityProviderUdPullConfigurationRequestPullProtectedRule getPullProtectedRule() {
        return this.pullProtectedRule;
    }

    public SetIdentityProviderUdPullConfigurationRequest setUdSyncScopeConfig(SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig udSyncScopeConfig) {
        this.udSyncScopeConfig = udSyncScopeConfig;
        return this;
    }
    public SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig getUdSyncScopeConfig() {
        return this.udSyncScopeConfig;
    }

    public static class SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig extends TeaModel {
        /**
         * <p>The group member identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("GroupMemberAttributeName")
        public String groupMemberAttributeName;

        /**
         * <p>The group objectClass.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("GroupObjectClass")
        public String groupObjectClass;

        /**
         * <p>The custom group filter.</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("GroupObjectClassCustomFilter")
        public String groupObjectClassCustomFilter;

        /**
         * <p>The organizational unit objectClass.</p>
         * 
         * <strong>example:</strong>
         * <p>organizationUnit,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <p>The user objectClass.</p>
         * 
         * <strong>example:</strong>
         * <p>userPrincipalName, mail</p>
         */
        @NameInMap("UserObjectClass")
        public String userObjectClass;

        /**
         * <p>The custom user filter.</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(mail=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("UserObjectClassCustomFilter")
        public String userObjectClassCustomFilter;

        public static SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig self = new SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig setGroupMemberAttributeName(String groupMemberAttributeName) {
            this.groupMemberAttributeName = groupMemberAttributeName;
            return this;
        }
        public String getGroupMemberAttributeName() {
            return this.groupMemberAttributeName;
        }

        public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig setGroupObjectClass(String groupObjectClass) {
            this.groupObjectClass = groupObjectClass;
            return this;
        }
        public String getGroupObjectClass() {
            return this.groupObjectClass;
        }

        public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig setGroupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
            this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
            return this;
        }
        public String getGroupObjectClassCustomFilter() {
            return this.groupObjectClassCustomFilter;
        }

        public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig setOrganizationUnitObjectClass(String organizationUnitObjectClass) {
            this.organizationUnitObjectClass = organizationUnitObjectClass;
            return this;
        }
        public String getOrganizationUnitObjectClass() {
            return this.organizationUnitObjectClass;
        }

        public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig setUserObjectClass(String userObjectClass) {
            this.userObjectClass = userObjectClass;
            return this;
        }
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

        public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig setUserObjectClassCustomFilter(String userObjectClassCustomFilter) {
            this.userObjectClassCustomFilter = userObjectClassCustomFilter;
            return this;
        }
        public String getUserObjectClassCustomFilter() {
            return this.userObjectClassCustomFilter;
        }

    }

    public static class SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig extends TeaModel {
        /**
         * <p>The cron expression. This parameter is required when periodicSyncType is set to cron.</p>
         * 
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        /**
         * <p>The time points for synchronization. This parameter is required when periodicSyncType is set to time. For example, if you set this parameter to [3, 5], the synchronization is performed from 03:00 to 04:00 and from 05:00 to 06:00.</p>
         */
        @NameInMap("PeriodicSyncTimes")
        public java.util.List<Integer> periodicSyncTimes;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("PeriodicSyncType")
        public String periodicSyncType;

        public static SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig self = new SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig setPeriodicSyncCron(String periodicSyncCron) {
            this.periodicSyncCron = periodicSyncCron;
            return this;
        }
        public String getPeriodicSyncCron() {
            return this.periodicSyncCron;
        }

        public SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig setPeriodicSyncTimes(java.util.List<Integer> periodicSyncTimes) {
            this.periodicSyncTimes = periodicSyncTimes;
            return this;
        }
        public java.util.List<Integer> getPeriodicSyncTimes() {
            return this.periodicSyncTimes;
        }

        public SetIdentityProviderUdPullConfigurationRequestPeriodicSyncConfig setPeriodicSyncType(String periodicSyncType) {
            this.periodicSyncType = periodicSyncType;
            return this;
        }
        public String getPeriodicSyncType() {
            return this.periodicSyncType;
        }

    }

    public static class SetIdentityProviderUdPullConfigurationRequestPullProtectedRule extends TeaModel {
        /**
         * <p>The threshold for the number of groups to be deleted. If the number of groups to be deleted exceeds this value, the synchronization task is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GroupDeletedThreshold")
        public Integer groupDeletedThreshold;

        /**
         * <p>The threshold for the number of organizational units to be deleted. If the number of organizational units to be deleted exceeds this value, the synchronization task is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OrganizationalUnitDeletedThreshold")
        public Integer organizationalUnitDeletedThreshold;

        /**
         * <p>The threshold for the number of users to be deleted. If the number of users to be deleted exceeds this value, the synchronization task is stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UserDeletedThreshold")
        public Integer userDeletedThreshold;

        public static SetIdentityProviderUdPullConfigurationRequestPullProtectedRule build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderUdPullConfigurationRequestPullProtectedRule self = new SetIdentityProviderUdPullConfigurationRequestPullProtectedRule();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderUdPullConfigurationRequestPullProtectedRule setGroupDeletedThreshold(Integer groupDeletedThreshold) {
            this.groupDeletedThreshold = groupDeletedThreshold;
            return this;
        }
        public Integer getGroupDeletedThreshold() {
            return this.groupDeletedThreshold;
        }

        public SetIdentityProviderUdPullConfigurationRequestPullProtectedRule setOrganizationalUnitDeletedThreshold(Integer organizationalUnitDeletedThreshold) {
            this.organizationalUnitDeletedThreshold = organizationalUnitDeletedThreshold;
            return this;
        }
        public Integer getOrganizationalUnitDeletedThreshold() {
            return this.organizationalUnitDeletedThreshold;
        }

        public SetIdentityProviderUdPullConfigurationRequestPullProtectedRule setUserDeletedThreshold(Integer userDeletedThreshold) {
            this.userDeletedThreshold = userDeletedThreshold;
            return this;
        }
        public Integer getUserDeletedThreshold() {
            return this.userDeletedThreshold;
        }

    }

    public static class SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig extends TeaModel {
        /**
         * <p>The list of source nodes for synchronization.</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>The target node for synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_asdaq1addsxzdq1XXX</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig self = new SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig();
            return TeaModel.build(map, self);
        }

        public SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig setSourceScopes(java.util.List<String> sourceScopes) {
            this.sourceScopes = sourceScopes;
            return this;
        }
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        public SetIdentityProviderUdPullConfigurationRequestUdSyncScopeConfig setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

}

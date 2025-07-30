// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderUdPullConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Inbound Synchronization Configuration Information</p>
     */
    @NameInMap("UdPullConfiguration")
    public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration udPullConfiguration;

    public static GetIdentityProviderUdPullConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderUdPullConfigurationResponseBody self = new GetIdentityProviderUdPullConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderUdPullConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIdentityProviderUdPullConfigurationResponseBody setUdPullConfiguration(GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration udPullConfiguration) {
        this.udPullConfiguration = udPullConfiguration;
        return this;
    }
    public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration getUdPullConfiguration() {
        return this.udPullConfiguration;
    }

    public static class GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig extends TeaModel {
        /**
         * <p>Group Member Identifier</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("GroupMemberAttributeName")
        public String groupMemberAttributeName;

        /**
         * <p>Group ObjectClass</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("GroupObjectClass")
        public String groupObjectClass;

        /**
         * <p>Group Custom Filter</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("GroupObjectClassCustomFilter")
        public String groupObjectClassCustomFilter;

        /**
         * <p>Organization ObjectClass</p>
         * 
         * <strong>example:</strong>
         * <p>ou,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <p>User ObjectClass</p>
         * 
         * <strong>example:</strong>
         * <p>ou,top</p>
         */
        @NameInMap("UserObjectClass")
        public String userObjectClass;

        /**
         * <p>User ObjectClass Custom Filter</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(mail=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("UserObjectClassCustomFilter")
        public String userObjectClassCustomFilter;

        public static GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig self = new GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig setGroupMemberAttributeName(String groupMemberAttributeName) {
            this.groupMemberAttributeName = groupMemberAttributeName;
            return this;
        }
        public String getGroupMemberAttributeName() {
            return this.groupMemberAttributeName;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig setGroupObjectClass(String groupObjectClass) {
            this.groupObjectClass = groupObjectClass;
            return this;
        }
        public String getGroupObjectClass() {
            return this.groupObjectClass;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig setGroupObjectClassCustomFilter(String groupObjectClassCustomFilter) {
            this.groupObjectClassCustomFilter = groupObjectClassCustomFilter;
            return this;
        }
        public String getGroupObjectClassCustomFilter() {
            return this.groupObjectClassCustomFilter;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig setOrganizationUnitObjectClass(String organizationUnitObjectClass) {
            this.organizationUnitObjectClass = organizationUnitObjectClass;
            return this;
        }
        public String getOrganizationUnitObjectClass() {
            return this.organizationUnitObjectClass;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig setUserObjectClass(String userObjectClass) {
            this.userObjectClass = userObjectClass;
            return this;
        }
        public String getUserObjectClass() {
            return this.userObjectClass;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig setUserObjectClassCustomFilter(String userObjectClassCustomFilter) {
            this.userObjectClassCustomFilter = userObjectClassCustomFilter;
            return this;
        }
        public String getUserObjectClassCustomFilter() {
            return this.userObjectClassCustomFilter;
        }

    }

    public static class GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig extends TeaModel {
        /**
         * <p>Cron expression</p>
         * 
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        /**
         * <p>Execution time slots, for example 3,5, meaning the task runs once between 03:00–04:00 and once between 05:00–06:00.</p>
         * 
         * <strong>example:</strong>
         * <p>[3,5]</p>
         */
        @NameInMap("PeriodicSyncTimes")
        public Integer periodicSyncTimes;

        /**
         * <p>type</p>
         * 
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("PeriodicSyncType")
        public String periodicSyncType;

        public static GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig self = new GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig setPeriodicSyncCron(String periodicSyncCron) {
            this.periodicSyncCron = periodicSyncCron;
            return this;
        }
        public String getPeriodicSyncCron() {
            return this.periodicSyncCron;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig setPeriodicSyncTimes(Integer periodicSyncTimes) {
            this.periodicSyncTimes = periodicSyncTimes;
            return this;
        }
        public Integer getPeriodicSyncTimes() {
            return this.periodicSyncTimes;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig setPeriodicSyncType(String periodicSyncType) {
            this.periodicSyncType = periodicSyncType;
            return this;
        }
        public String getPeriodicSyncType() {
            return this.periodicSyncType;
        }

    }

    public static class GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule extends TeaModel {
        /**
         * <p>Group Deletion Threshold: If the number of deleted groups exceeds this value, the synchronization task will be terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GroupDeletedThreshold")
        public Integer groupDeletedThreshold;

        /**
         * <p>Organization Deletion Threshold: If the number of deleted organizations exceeds this value, the synchronization task will be terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OrganizationalUnitDeletedThreshold")
        public Integer organizationalUnitDeletedThreshold;

        /**
         * <p>Account Deletion Threshold: If the number of deleted users exceeds this value, the synchronization task will be terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UserDeletedThreshold")
        public Integer userDeletedThreshold;

        public static GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule self = new GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule setGroupDeletedThreshold(Integer groupDeletedThreshold) {
            this.groupDeletedThreshold = groupDeletedThreshold;
            return this;
        }
        public Integer getGroupDeletedThreshold() {
            return this.groupDeletedThreshold;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule setOrganizationalUnitDeletedThreshold(Integer organizationalUnitDeletedThreshold) {
            this.organizationalUnitDeletedThreshold = organizationalUnitDeletedThreshold;
            return this;
        }
        public Integer getOrganizationalUnitDeletedThreshold() {
            return this.organizationalUnitDeletedThreshold;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule setUserDeletedThreshold(Integer userDeletedThreshold) {
            this.userDeletedThreshold = userDeletedThreshold;
            return this;
        }
        public Integer getUserDeletedThreshold() {
            return this.userDeletedThreshold;
        }

    }

    public static class GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig extends TeaModel {
        /**
         * <p>Synchronization Source Node</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>Synchronization Target Node</p>
         * 
         * <strong>example:</strong>
         * <p>ou_asjdfhaskfhw213mnsj33sXXX</p>
         */
        @NameInMap("TargetScope")
        public String targetScope;

        public static GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig self = new GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig setSourceScopes(java.util.List<String> sourceScopes) {
            this.sourceScopes = sourceScopes;
            return this;
        }
        public java.util.List<String> getSourceScopes() {
            return this.sourceScopes;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig setTargetScope(String targetScope) {
            this.targetScope = targetScope;
            return this;
        }
        public String getTargetScope() {
            return this.targetScope;
        }

    }

    public static class GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration extends TeaModel {
        /**
         * <p>Group Synchronization Status
         * Possible values:</p>
         * <p>Disabled: disabled</p>
         * <p>Enabled: enabled</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("GroupSyncStatus")
        public String groupSyncStatus;

        /**
         * <p>Identity provider ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>Incremental Callback Status: Whether to process incremental callback data from the IdP</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>LDAP Synchronization Side Related Configuration Information</p>
         */
        @NameInMap("LdapUdPullConfig")
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig ldapUdPullConfig;

        /**
         * <p>Scheduled sync configuration</p>
         */
        @NameInMap("PeriodicSyncConfig")
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig periodicSyncConfig;

        /**
         * <p>Scheduled Validation Status: Whether to periodically validate data discrepancies between IDaaS and the Identity Provider. Possible values:</p>
         * <p>Disabled: disabled</p>
         * <p>Enabled: enabled</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>Inbound Synchronization Protection Rule Configuration</p>
         */
        @NameInMap("PullProtectedRule")
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule pullProtectedRule;

        /**
         * <p>Synchronization Scope Configuration Information</p>
         */
        @NameInMap("UdSyncScopeConfig")
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig udSyncScopeConfig;

        public static GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration self = new GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration();
            return TeaModel.build(map, self);
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setGroupSyncStatus(String groupSyncStatus) {
            this.groupSyncStatus = groupSyncStatus;
            return this;
        }
        public String getGroupSyncStatus() {
            return this.groupSyncStatus;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setIncrementalCallbackStatus(String incrementalCallbackStatus) {
            this.incrementalCallbackStatus = incrementalCallbackStatus;
            return this;
        }
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setLdapUdPullConfig(GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig ldapUdPullConfig) {
            this.ldapUdPullConfig = ldapUdPullConfig;
            return this;
        }
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig getLdapUdPullConfig() {
            return this.ldapUdPullConfig;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setPeriodicSyncConfig(GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig periodicSyncConfig) {
            this.periodicSyncConfig = periodicSyncConfig;
            return this;
        }
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig getPeriodicSyncConfig() {
            return this.periodicSyncConfig;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setPeriodicSyncStatus(String periodicSyncStatus) {
            this.periodicSyncStatus = periodicSyncStatus;
            return this;
        }
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setPullProtectedRule(GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule pullProtectedRule) {
            this.pullProtectedRule = pullProtectedRule;
            return this;
        }
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule getPullProtectedRule() {
            return this.pullProtectedRule;
        }

        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfiguration setUdSyncScopeConfig(GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig udSyncScopeConfig) {
            this.udSyncScopeConfig = udSyncScopeConfig;
            return this;
        }
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationUdSyncScopeConfig getUdSyncScopeConfig() {
            return this.udSyncScopeConfig;
        }

    }

}

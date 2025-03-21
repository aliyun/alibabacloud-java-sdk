// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderUdPullConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <p>组成员标识</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("GroupMemberAttributeName")
        public String groupMemberAttributeName;

        /**
         * <p>组objectClass</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("GroupObjectClass")
        public String groupObjectClass;

        /**
         * <p>组自定义Filter</p>
         * 
         * <strong>example:</strong>
         * <p>(|(cn=test)(group=<a href="mailto:test@test.com">test@test.com</a>))</p>
         */
        @NameInMap("GroupObjectClassCustomFilter")
        public String groupObjectClassCustomFilter;

        /**
         * <p>组织objectClass</p>
         * 
         * <strong>example:</strong>
         * <p>ou,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <p>用户objectClass</p>
         * 
         * <strong>example:</strong>
         * <p>ou,top</p>
         */
        @NameInMap("UserObjectClass")
        public String userObjectClass;

        /**
         * <p>用户自定义Filter</p>
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
         * <strong>example:</strong>
         * <p>0 45 1 * * ?</p>
         */
        @NameInMap("PeriodicSyncCron")
        public String periodicSyncCron;

        @NameInMap("PeriodicSyncTimes")
        public Integer periodicSyncTimes;

        /**
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
         * <p>同步保护规则-删除组数量</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GroupDeletedThreshold")
        public Integer groupDeletedThreshold;

        /**
         * <p>IDaaS EIAM 钉钉一方应用同步保护规则-删除组织数量</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OrganizationalUnitDeletedThreshold")
        public Integer organizationalUnitDeletedThreshold;

        /**
         * <p>IDaaS EIAM 钉钉一方应用同步保护规则-删除账户数量</p>
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
         * <p>同步来源节点</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>同步目标节点</p>
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
         * <p>组同步状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("GroupSyncStatus")
        public String groupSyncStatus;

        /**
         * <p>IDaaS EIAM 身份提供方ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
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
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>ldap同步侧相关配置信息</p>
         */
        @NameInMap("LdapUdPullConfig")
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationLdapUdPullConfig ldapUdPullConfig;

        @NameInMap("PeriodicSyncConfig")
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPeriodicSyncConfig periodicSyncConfig;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>同步入用户映射字段配置列表</p>
         */
        @NameInMap("PullProtectedRule")
        public GetIdentityProviderUdPullConfigurationResponseBodyUdPullConfigurationPullProtectedRule pullProtectedRule;

        /**
         * <p>同步入配置信息</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetIdentityProviderUdPullConfigurationRequest extends TeaModel {
    /**
     * <p>组同步状态</p>
     * 
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("GroupSyncStatus")
    public String groupSyncStatus;

    /**
     * <p>IDaaS的身份提供方主键id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
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
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
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
    public SetIdentityProviderUdPullConfigurationRequestLdapUdPullConfig ldapUdPullConfig;

    /**
     * <strong>example:</strong>
     * <p>disabled</p>
     */
    @NameInMap("PeriodicSyncStatus")
    public String periodicSyncStatus;

    /**
     * <p>同步入保护规则,根据IdP的type做解析</p>
     */
    @NameInMap("PullProtectedRule")
    public SetIdentityProviderUdPullConfigurationRequestPullProtectedRule pullProtectedRule;

    /**
     * <p>同步入配置信息</p>
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
         * <p>组成员标识</p>
         * 
         * <strong>example:</strong>
         * <p>member</p>
         */
        @NameInMap("GroupMemberAttributeName")
        public String groupMemberAttributeName;

        /**
         * <p>组objectClass</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
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
         * <p>组织ObjectClass</p>
         * 
         * <strong>example:</strong>
         * <p>organizationUnit,top</p>
         */
        @NameInMap("OrganizationUnitObjectClass")
        public String organizationUnitObjectClass;

        /**
         * <p>用户ObjectClass</p>
         * 
         * <strong>example:</strong>
         * <p>userPrincipalName, mail</p>
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

    public static class SetIdentityProviderUdPullConfigurationRequestPullProtectedRule extends TeaModel {
        /**
         * <p>同步保护规则-删除组数量</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("GroupDeletedThreshold")
        public Integer groupDeletedThreshold;

        /**
         * <p>钉钉一方应用同步保护规则-删除组织数量</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OrganizationalUnitDeletedThreshold")
        public Integer organizationalUnitDeletedThreshold;

        /**
         * <p>钉钉一方应用同步保护规则-删除账户数量</p>
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
         * <p>同步来源节点</p>
         */
        @NameInMap("SourceScopes")
        public java.util.List<String> sourceScopes;

        /**
         * <p>同步目标节点</p>
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

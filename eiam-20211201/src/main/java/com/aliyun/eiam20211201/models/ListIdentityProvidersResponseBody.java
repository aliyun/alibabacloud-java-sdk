// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersResponseBody extends TeaModel {
    /**
     * <p>The list of identity providers.</p>
     */
    @NameInMap("IdentityProviders")
    public java.util.List<ListIdentityProvidersResponseBodyIdentityProviders> identityProviders;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIdentityProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProvidersResponseBody self = new ListIdentityProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityProvidersResponseBody setIdentityProviders(java.util.List<ListIdentityProvidersResponseBodyIdentityProviders> identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }
    public java.util.List<ListIdentityProvidersResponseBodyIdentityProviders> getIdentityProviders() {
        return this.identityProviders;
    }

    public ListIdentityProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentityProvidersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIdentityProvidersResponseBodyIdentityProviders extends TeaModel {
        /**
         * <p>Indicates whether advanced configuration is enabled. Valid values:</p>
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
        @NameInMap("AdvancedStatus")
        public String advancedStatus;

        /**
         * <p>The authentication source product, such as Okta, Google, or Azure AD.
         * Valid values:</p>
         * <ul>
         * <li><p>DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk</p>
         * </li>
         * <li><p>LDAP: urn:alibaba:idaas:idp:unknown:ldap</p>
         * </li>
         * <li><p>Alibaba Cloud IDaaS: urn:alibaba:idaas:idp:alibaba:idaas</p>
         * </li>
         * <li><p>WeCom: urn:alibaba:idaas:idp:tencent:wecom</p>
         * </li>
         * <li><p>Lark: urn:alibaba:idaas:idp:bytedance:lark</p>
         * </li>
         * <li><p>Active Directory: urn:alibaba:idaas:idp:microsoft:ad</p>
         * </li>
         * <li><p>Azure Active Directory: urn:alibaba:idaas:idp:microsoft:aad</p>
         * </li>
         * <li><p>Alibaba Cloud SASE: urn:alibaba:idaas:idp:alibaba:sase</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
         */
        @NameInMap("AuthnSourceSupplier")
        public String authnSourceSupplier;

        /**
         * <p>The authentication method type. Valid values:</p>
         * <ul>
         * <li><p>OIDC: urn:alibaba:idaas:authntype:oidc</p>
         * </li>
         * <li><p>SAML: urn:alibaba:idaas:authntype:saml2</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:authntype:oidc</p>
         */
        @NameInMap("AuthnSourceType")
        public String authnSourceType;

        /**
         * <p>Indicates whether the identity provider supports authentication. Valid values:</p>
         * <ul>
         * <li><p>disabled: Authentication is disabled.</p>
         * </li>
         * <li><p>enabled: Authentication is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AuthnStatus")
        public String authnStatus;

        /**
         * <p>The time when the identity provider was created. This is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1712561597000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The external ID of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("IdentityProviderExternalId")
        public String identityProviderExternalId;

        /**
         * <p>The identity provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_m5b5wd5s2hpq4t6iaehhXXX</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>The name of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <p>The synchronization type of the identity provider.</p>
         * <ul>
         * <li><p>Inbound DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:pull</p>
         * </li>
         * <li><p>Outbound DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
         * </li>
         * <li><p>Inbound WeCom: urn:alibaba:idaas:idp:tencent:wecom:pull</p>
         * </li>
         * <li><p>Inbound Lark: urn:alibaba:idaas:idp:bytedance:lark:pull</p>
         * </li>
         * <li><p>Inbound AD: urn:alibaba:idaas:idp:microsoft:ad:pull</p>
         * </li>
         * <li><p>Inbound LDAP: urn:alibaba:idaas:idp:unknown:ldap:pull</p>
         * </li>
         * <li><p>Standard OIDC: urn:alibaba:idaas:idp:standard:oidc</p>
         * </li>
         * <li><p>Custom OIDC for SASE: urn:alibaba:idaas:idp:alibaba:sase</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:bytedance:lark:pull</p>
         */
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        /**
         * <p>The incremental callback status. This indicates whether to process incremental callback data from the identity provider. Valid values:</p>
         * <ul>
         * <li><p>disabled: The feature is disabled.</p>
         * </li>
         * <li><p>enabled: The feature is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("IncrementalCallbackStatus")
        public String incrementalCallbackStatus;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_pbf4dth34l2qb7mydpntXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The result of the last status check. A sync task can be triggered only when the status check of the identity provider returns \<code>success\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("LastStatusCheckJobResult")
        public String lastStatusCheckJobResult;

        /**
         * <p>The reason why the identity provider is locked.</p>
         * 
         * <strong>example:</strong>
         * <p>financial</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The URL of the custom logo for the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn-cn-hangzhou.aliyunidaas.com/xx/logos/xx">https://cdn-cn-hangzhou.aliyunidaas.com/xx/logos/xx</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>The periodic check status. This indicates whether to periodically check for data inconsistencies between IDaaS and the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>Indicates whether inbound synchronization is enabled. Valid values:</p>
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
        @NameInMap("UdPullStatus")
        public String udPullStatus;

        /**
         * <p>The target node for synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_2buqmxsa3ltyqkjgpwfijurXXX</p>
         */
        @NameInMap("UdPullTargetScope")
        public String udPullTargetScope;

        /**
         * <p>Indicates whether outbound synchronization is enabled. Valid values:</p>
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
        @NameInMap("UdPushStatus")
        public String udPushStatus;

        /**
         * <p>The time when the identity provider was last updated. This is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1712561597000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListIdentityProvidersResponseBodyIdentityProviders build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyIdentityProviders self = new ListIdentityProvidersResponseBodyIdentityProviders();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setAdvancedStatus(String advancedStatus) {
            this.advancedStatus = advancedStatus;
            return this;
        }
        public String getAdvancedStatus() {
            return this.advancedStatus;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setAuthnSourceSupplier(String authnSourceSupplier) {
            this.authnSourceSupplier = authnSourceSupplier;
            return this;
        }
        public String getAuthnSourceSupplier() {
            return this.authnSourceSupplier;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setAuthnSourceType(String authnSourceType) {
            this.authnSourceType = authnSourceType;
            return this;
        }
        public String getAuthnSourceType() {
            return this.authnSourceType;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setAuthnStatus(String authnStatus) {
            this.authnStatus = authnStatus;
            return this;
        }
        public String getAuthnStatus() {
            return this.authnStatus;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setIdentityProviderExternalId(String identityProviderExternalId) {
            this.identityProviderExternalId = identityProviderExternalId;
            return this;
        }
        public String getIdentityProviderExternalId() {
            return this.identityProviderExternalId;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setIdentityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }
        public String getIdentityProviderId() {
            return this.identityProviderId;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setIdentityProviderName(String identityProviderName) {
            this.identityProviderName = identityProviderName;
            return this;
        }
        public String getIdentityProviderName() {
            return this.identityProviderName;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setIncrementalCallbackStatus(String incrementalCallbackStatus) {
            this.incrementalCallbackStatus = incrementalCallbackStatus;
            return this;
        }
        public String getIncrementalCallbackStatus() {
            return this.incrementalCallbackStatus;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setLastStatusCheckJobResult(String lastStatusCheckJobResult) {
            this.lastStatusCheckJobResult = lastStatusCheckJobResult;
            return this;
        }
        public String getLastStatusCheckJobResult() {
            return this.lastStatusCheckJobResult;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setPeriodicSyncStatus(String periodicSyncStatus) {
            this.periodicSyncStatus = periodicSyncStatus;
            return this;
        }
        public String getPeriodicSyncStatus() {
            return this.periodicSyncStatus;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setUdPullStatus(String udPullStatus) {
            this.udPullStatus = udPullStatus;
            return this;
        }
        public String getUdPullStatus() {
            return this.udPullStatus;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setUdPullTargetScope(String udPullTargetScope) {
            this.udPullTargetScope = udPullTargetScope;
            return this;
        }
        public String getUdPullTargetScope() {
            return this.udPullTargetScope;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setUdPushStatus(String udPushStatus) {
            this.udPushStatus = udPushStatus;
            return this;
        }
        public String getUdPushStatus() {
            return this.udPushStatus;
        }

        public ListIdentityProvidersResponseBodyIdentityProviders setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}

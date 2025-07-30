// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersResponseBody extends TeaModel {
    /**
     * <p>Identity provider information array.</p>
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
     * <p>The total number of entries returned.</p>
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
         * <p>Advanced configuration capabilities</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AdvancedStatus")
        public String advancedStatus;

        /**
         * <p>Authentication source product.</p>
         * <ul>
         * <li>urn:alibaba:idaas:idp:okta:okta</li>
         * <li>urn:alibaba:idaas:idp:google:account</li>
         * <li>urn:alibaba:idaas:idp:microsoft:aad</li>
         * <li>urn:alibaba:idaas:idp:microsoft:ad</li>
         * <li>urn:alibaba:idaas:idp:bytedance:lark</li>
         * <li>urn:alibaba:idaas:idp:unknown:ldap</li>
         * <li>urn:alibaba:idaas:idp:alibaba:idaas</li>
         * <li>urn:alibaba:idaas:idp:tencent:wecom</li>
         * <li>urn:alibaba:idaas:idp:alibaba:aliyunram</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:bytedance:lark</p>
         */
        @NameInMap("AuthnSourceSupplier")
        public String authnSourceSupplier;

        /**
         * <p>Authentication method type.</p>
         * <ul>
         * <li>urn:alibaba:idaas:authntype:oidc</li>
         * <li>urn:alibaba:idaas:authntype:saml2</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:authntype:oidc</p>
         */
        @NameInMap("AuthnSourceType")
        public String authnSourceType;

        /**
         * <p>Does the corresponding IdP support authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("AuthnStatus")
        public String authnStatus;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1712561597000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the Identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Identity provider external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123xxx</p>
         */
        @NameInMap("IdentityProviderExternalId")
        public String identityProviderExternalId;

        /**
         * <p>Identity provider ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_m5b5wd5s2hpq4t6iaehhXXX</p>
         */
        @NameInMap("IdentityProviderId")
        public String identityProviderId;

        /**
         * <p>Identity provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>ceshi</p>
         */
        @NameInMap("IdentityProviderName")
        public String identityProviderName;

        /**
         * <p>Identity provider synchronization type.</p>
         * <ul>
         * <li><p>Inbound to DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:pull</p>
         * </li>
         * <li><p>Outbound to DingTalk: urn:alibaba:idaas:idp:alibaba:dingtalk:push</p>
         * </li>
         * <li><p>Inbound to WeCom: urn:alibaba:idaas:idp:tencent:wecom:pull</p>
         * </li>
         * <li><p>Inbound to Lark: urn:alibaba:idaas:idp:bytedance:lark:pull</p>
         * </li>
         * <li><p>Inbound to AD: urn:alibaba:idaas:idp:microsoft:ad:pull</p>
         * </li>
         * <li><p>Inbound to LDAP: urn:alibaba:idaas:idp:unknown:ldap:pull</p>
         * </li>
         * <li><p>Standard OIDC: urn:alibaba:idaas:idp:standard:oidc</p>
         * </li>
         * <li><p>SASE Custom OIDC: urn:alibaba:idaas:idp:alibaba:sase</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:idp:bytedance:lark:pull</p>
         */
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        /**
         * <p>Incremental callback status, whether to process the incremental callback data from IdP.</p>
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
         * <p>Last status check result.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("LastStatusCheckJobResult")
        public String lastStatusCheckJobResult;

        /**
         * <p>The reason why write operations are locked.</p>
         * 
         * <strong>example:</strong>
         * <p>ConfigNotReady.UuidIsNul</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>IdP logo url.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn-cn-hangzhou.aliyunidaas.com/xx/logos/xx">https://cdn-cn-hangzhou.aliyunidaas.com/xx/logos/xx</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>Regular verification status.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PeriodicSyncStatus")
        public String periodicSyncStatus;

        /**
         * <p>Whether support UD synchronization.Values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("UdPullStatus")
        public String udPullStatus;

        /**
         * <p>When supporting the range in the UD of ud_pullIDaaS side.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_2buqmxsa3ltyqkjgpwfijurXXX</p>
         */
        @NameInMap("UdPullTargetScope")
        public String udPullTargetScope;

        /**
         * <p>Synchronize capabilities</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("UdPushStatus")
        public String udPushStatus;

        /**
         * <p>The time when the service was updated.</p>
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

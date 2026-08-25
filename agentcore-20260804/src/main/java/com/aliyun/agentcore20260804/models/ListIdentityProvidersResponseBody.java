// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListIdentityProvidersResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of external identity providers.</p>
     */
    @NameInMap("items")
    public java.util.List<ListIdentityProvidersResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page that takes effect for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page. This parameter is empty if no more pages exist.</p>
     * 
     * <strong>example:</strong>
     * <p>aWRlbnRpdHktcHJvdmlkZXItb2Zmc2V0OjEw</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of external identity providers that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListIdentityProvidersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProvidersResponseBody self = new ListIdentityProvidersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityProvidersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIdentityProvidersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIdentityProvidersResponseBody setItems(java.util.List<ListIdentityProvidersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListIdentityProvidersResponseBodyItems> getItems() {
        return this.items;
    }

    public ListIdentityProvidersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIdentityProvidersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIdentityProvidersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIdentityProvidersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentityProvidersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListIdentityProvidersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIdentityProvidersResponseBodyItemsMetadata extends TeaModel {
        /**
         * <p>The App ID of the Lark application. Required when the binding type is Feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>cli_exampleappid01</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>The AppKey of the DingTalk application. Required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexampleappkey01</p>
         */
        @NameInMap("appKey")
        public String appKey;

        /**
         * <p>The CorpId of the DingTalk enterprise. Required when the binding type is DingTalk.</p>
         * 
         * <strong>example:</strong>
         * <p>dingexamplecorpid01</p>
         */
        @NameInMap("corpId")
        public String corpId;

        public static ListIdentityProvidersResponseBodyItemsMetadata build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyItemsMetadata self = new ListIdentityProvidersResponseBodyItemsMetadata();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListIdentityProvidersResponseBodyItemsMetadata setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

    }

    public static class ListIdentityProvidersResponseBodyItems extends TeaModel {
        /**
         * <p>The creation time in UTC, formatted according to RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The event subscription callback URL. Configure this URL in the external identity provider application to receive organization change events. An empty string is returned if the user pool has not been provisioned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://auth.cn-hangzhou.agentteams.aliyuncs.com/roa/dingtalk/event/up-123456">http://auth.cn-hangzhou.agentteams.aliyuncs.com/roa/dingtalk/event/up-123456</a></p>
         */
        @NameInMap("eventSubscriptionCallbackUrl")
        public String eventSubscriptionCallbackUrl;

        /**
         * <p>The type of the external identity provider. Valid values:</p>
         * <ul>
         * <li>DingTalk</li>
         * <li>Feishu</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>The logon callback URL. Configure this URL in the external identity provider application. An empty string is returned if the user pool has not been provisioned.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin-cn-hangzhou.aliyunagentid.com/up-123456/dingtalk/callback">https://signin-cn-hangzhou.aliyunagentid.com/up-123456/dingtalk/callback</a></p>
         */
        @NameInMap("loginCallbackUrl")
        public String loginCallbackUrl;

        /**
         * <p>Indicates whether workspace users are allowed to log on through this external identity provider.</p>
         */
        @NameInMap("loginEnabled")
        public Boolean loginEnabled;

        /**
         * <p>The application configuration of the external identity provider. Application secret configurations are not returned.</p>
         */
        @NameInMap("metadata")
        public ListIdentityProvidersResponseBodyItemsMetadata metadata;

        /**
         * <p>The binding status. Valid values:</p>
         * <ul>
         * <li>CONFIGURED: The configuration has been accepted and is waiting for user pool provisioning.</li>
         * <li>SYNCING: Organization members are being synchronized.</li>
         * <li>SYNCED: Organization member synchronization is complete.</li>
         * <li>READY: The binding is active.</li>
         * <li>SYNC_FAILED: Organization member synchronization failed.</li>
         * <li>UPDATING: The configuration is being updated.</li>
         * <li>UPDATE_FAILED: The configuration update failed.</li>
         * <li>DISCONNECTING: The binding is being removed.</li>
         * <li>DISCONNECT_FAILED: The unbinding failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Indicates whether organization member synchronization is enabled. When enabled, organization members are synchronized from this external identity provider as workspace users.</p>
         */
        @NameInMap("syncEnabled")
        public Boolean syncEnabled;

        /**
         * <p>The last modification time in UTC, formatted according to RFC 3339.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T03:04:05Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListIdentityProvidersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProvidersResponseBodyItems self = new ListIdentityProvidersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListIdentityProvidersResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListIdentityProvidersResponseBodyItems setEventSubscriptionCallbackUrl(String eventSubscriptionCallbackUrl) {
            this.eventSubscriptionCallbackUrl = eventSubscriptionCallbackUrl;
            return this;
        }
        public String getEventSubscriptionCallbackUrl() {
            return this.eventSubscriptionCallbackUrl;
        }

        public ListIdentityProvidersResponseBodyItems setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public ListIdentityProvidersResponseBodyItems setLoginCallbackUrl(String loginCallbackUrl) {
            this.loginCallbackUrl = loginCallbackUrl;
            return this;
        }
        public String getLoginCallbackUrl() {
            return this.loginCallbackUrl;
        }

        public ListIdentityProvidersResponseBodyItems setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public ListIdentityProvidersResponseBodyItems setMetadata(ListIdentityProvidersResponseBodyItemsMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        public ListIdentityProvidersResponseBodyItemsMetadata getMetadata() {
            return this.metadata;
        }

        public ListIdentityProvidersResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIdentityProvidersResponseBodyItems setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public ListIdentityProvidersResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListIdentityProvidersResponseBodyItems setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}

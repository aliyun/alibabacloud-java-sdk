// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetMyAgenticNotificationChannelAuthorizeUrlResponseBody extends TeaModel {
    /**
     * <p>The authorization URL information.</p>
     */
    @NameInMap("Data")
    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData data;

    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID_PARAMETER</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>channel must be FEISHU</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMyAgenticNotificationChannelAuthorizeUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMyAgenticNotificationChannelAuthorizeUrlResponseBody self = new GetMyAgenticNotificationChannelAuthorizeUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBody setData(GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData getData() {
        return this.data;
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMyAgenticNotificationChannelAuthorizeUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the Lark OAuth authorization page. After the user opens the URL in a browser and completes the authorization, the system binds the Lark account as the notification identity for the current user, and the channel switch remains unchanged. The state parameter in the URL is valid for 180 seconds and can be used only once.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://open.feishu.cn/open-apis/authen/v1/authorize?app_id=cli_a5f8e2d9c3b1****&redirect_uri=https%3A%2F%2Faig-dms-cn-hangzhou.aliyuncs.com%2Foauth%2Fmobile%2Ffeishu%2Fbind&state=eyJhbGciOiJIUzI1NiJ9">https://open.feishu.cn/open-apis/authen/v1/authorize?app_id=cli_a5f8e2d9c3b1****&amp;redirect_uri=https%3A%2F%2Faig-dms-cn-hangzhou.aliyuncs.com%2Foauth%2Fmobile%2Ffeishu%2Fbind&amp;state=eyJhbGciOiJIUzI1NiJ9</a>****</p>
         */
        @NameInMap("AuthorizeUrl")
        public String authorizeUrl;

        /**
         * <p>The callback URL after the authorization is completed. You must add this URL to the redirect URL whitelist of the tenant&quot;s Lark application. Otherwise, the authorization fails.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aig-dms-cn-hangzhou.aliyuncs.com/oauth/mobile/feishu/bind">https://aig-dms-cn-hangzhou.aliyuncs.com/oauth/mobile/feishu/bind</a></p>
         */
        @NameInMap("RedirectUri")
        public String redirectUri;

        public static GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData self = new GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData setAuthorizeUrl(String authorizeUrl) {
            this.authorizeUrl = authorizeUrl;
            return this;
        }
        public String getAuthorizeUrl() {
            return this.authorizeUrl;
        }

        public GetMyAgenticNotificationChannelAuthorizeUrlResponseBodyData setRedirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public String getRedirectUri() {
            return this.redirectUri;
        }

    }

}

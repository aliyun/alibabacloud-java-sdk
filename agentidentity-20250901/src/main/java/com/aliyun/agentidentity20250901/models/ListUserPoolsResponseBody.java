// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListUserPoolsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to query the next page of data. An empty value indicates that no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFVzZXJQb29sczo6MjA=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of user pools that meet the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of user pools.</p>
     */
    @NameInMap("UserPools")
    public java.util.List<ListUserPoolsResponseBodyUserPools> userPools;

    public static ListUserPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPoolsResponseBody self = new ListUserPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPoolsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserPoolsResponseBody setUserPools(java.util.List<ListUserPoolsResponseBodyUserPools> userPools) {
        this.userPools = userPools;
        return this;
    }
    public java.util.List<ListUserPoolsResponseBodyUserPools> getUserPools() {
        return this.userPools;
    }

    public static class ListUserPoolsResponseBodyUserPools extends TeaModel {
        /**
         * <p>The creation time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>User pool example</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The OpenID Connect (OIDC) discovery URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin-cn-beijing.aliyunagentid.com/up_7b6908bcb9ba4c****c8e187/.well-known/openid-configuration">https://signin-cn-beijing.aliyunagentid.com/up_7b6908bcb9ba4c****c8e187/.well-known/openid-configuration</a></p>
         */
        @NameInMap("OIDCDiscoveryURL")
        public String OIDCDiscoveryURL;

        /**
         * <p>The base sign-in URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://pre-signin-cn-hangzhou.aliyunagentid.com/up_e14d889*****716841">https://pre-signin-cn-hangzhou.aliyunagentid.com/up_e14d889*****716841</a></p>
         */
        @NameInMap("SigninBaseURL")
        public String signinBaseURL;

        /**
         * <p>The creation source.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        /**
         * <p>The update time in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>up-xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("UserPoolId")
        public String userPoolId;

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        @NameInMap("UserPoolName")
        public String userPoolName;

        public static ListUserPoolsResponseBodyUserPools build(java.util.Map<String, ?> map) throws Exception {
            ListUserPoolsResponseBodyUserPools self = new ListUserPoolsResponseBodyUserPools();
            return TeaModel.build(map, self);
        }

        public ListUserPoolsResponseBodyUserPools setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserPoolsResponseBodyUserPools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserPoolsResponseBodyUserPools setOIDCDiscoveryURL(String OIDCDiscoveryURL) {
            this.OIDCDiscoveryURL = OIDCDiscoveryURL;
            return this;
        }
        public String getOIDCDiscoveryURL() {
            return this.OIDCDiscoveryURL;
        }

        public ListUserPoolsResponseBodyUserPools setSigninBaseURL(String signinBaseURL) {
            this.signinBaseURL = signinBaseURL;
            return this;
        }
        public String getSigninBaseURL() {
            return this.signinBaseURL;
        }

        public ListUserPoolsResponseBodyUserPools setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public ListUserPoolsResponseBodyUserPools setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserPoolsResponseBodyUserPools setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

        public ListUserPoolsResponseBodyUserPools setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}

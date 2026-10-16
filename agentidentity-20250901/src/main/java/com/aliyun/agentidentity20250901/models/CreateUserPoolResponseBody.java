// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the newly created user pool.</p>
     */
    @NameInMap("UserPool")
    public CreateUserPoolResponseBodyUserPool userPool;

    public static CreateUserPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPoolResponseBody self = new CreateUserPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserPoolResponseBody setUserPool(CreateUserPoolResponseBodyUserPool userPool) {
        this.userPool = userPool;
        return this;
    }
    public CreateUserPoolResponseBodyUserPool getUserPool() {
        return this.userPool;
    }

    public static class CreateUserPoolResponseBodyUserPool extends TeaModel {
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
         * <p>Sample user pool</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The discovery URL for the OpenID Connect (OIDC) protocol.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://signin-cn-beijing.aliyunagentid.com/up_7b6908bcb9ba4c****c8e187/.well-known/openid-configuration">https://signin-cn-beijing.aliyunagentid.com/up_7b6908bcb9ba4c****c8e187/.well-known/openid-configuration</a></p>
         */
        @NameInMap("OIDCDiscoveryURL")
        public String OIDCDiscoveryURL;

        /**
         * <p>The base URL for logon.</p>
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
         * <p>up_xxxxxxxxxxxxxxxxxxxx</p>
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

        public static CreateUserPoolResponseBodyUserPool build(java.util.Map<String, ?> map) throws Exception {
            CreateUserPoolResponseBodyUserPool self = new CreateUserPoolResponseBodyUserPool();
            return TeaModel.build(map, self);
        }

        public CreateUserPoolResponseBodyUserPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateUserPoolResponseBodyUserPool setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateUserPoolResponseBodyUserPool setOIDCDiscoveryURL(String OIDCDiscoveryURL) {
            this.OIDCDiscoveryURL = OIDCDiscoveryURL;
            return this;
        }
        public String getOIDCDiscoveryURL() {
            return this.OIDCDiscoveryURL;
        }

        public CreateUserPoolResponseBodyUserPool setSigninBaseURL(String signinBaseURL) {
            this.signinBaseURL = signinBaseURL;
            return this;
        }
        public String getSigninBaseURL() {
            return this.signinBaseURL;
        }

        public CreateUserPoolResponseBodyUserPool setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public CreateUserPoolResponseBodyUserPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateUserPoolResponseBodyUserPool setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

        public CreateUserPoolResponseBodyUserPool setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}

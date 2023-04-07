// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateConnectionRequest extends TeaModel {
    @NameInMap("AuthParameters")
    public UpdateConnectionRequestAuthParameters authParameters;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("Description")
    public String description;

    @NameInMap("NetworkParameters")
    public UpdateConnectionRequestNetworkParameters networkParameters;

    public static UpdateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnectionRequest self = new UpdateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConnectionRequest setAuthParameters(UpdateConnectionRequestAuthParameters authParameters) {
        this.authParameters = authParameters;
        return this;
    }
    public UpdateConnectionRequestAuthParameters getAuthParameters() {
        return this.authParameters;
    }

    public UpdateConnectionRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public UpdateConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConnectionRequest setNetworkParameters(UpdateConnectionRequestNetworkParameters networkParameters) {
        this.networkParameters = networkParameters;
        return this;
    }
    public UpdateConnectionRequestNetworkParameters getNetworkParameters() {
        return this.networkParameters;
    }

    public static class UpdateConnectionRequestAuthParametersApiKeyAuthParameters extends TeaModel {
        @NameInMap("ApiKeyName")
        public String apiKeyName;

        @NameInMap("ApiKeyValue")
        public String apiKeyValue;

        public static UpdateConnectionRequestAuthParametersApiKeyAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParametersApiKeyAuthParameters self = new UpdateConnectionRequestAuthParametersApiKeyAuthParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParametersApiKeyAuthParameters setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        public UpdateConnectionRequestAuthParametersApiKeyAuthParameters setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

    }

    public static class UpdateConnectionRequestAuthParametersBasicAuthParameters extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Username")
        public String username;

        public static UpdateConnectionRequestAuthParametersBasicAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParametersBasicAuthParameters self = new UpdateConnectionRequestAuthParametersBasicAuthParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParametersBasicAuthParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public UpdateConnectionRequestAuthParametersBasicAuthParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class UpdateConnectionRequestAuthParametersOAuthParametersClientParameters extends TeaModel {
        @NameInMap("ClientID")
        public String clientID;

        @NameInMap("ClientSecret")
        public String clientSecret;

        public static UpdateConnectionRequestAuthParametersOAuthParametersClientParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParametersOAuthParametersClientParameters self = new UpdateConnectionRequestAuthParametersOAuthParametersClientParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersClientParameters setClientID(String clientID) {
            this.clientID = clientID;
            return this;
        }
        public String getClientID() {
            return this.clientID;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersClientParameters setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters self = new UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters self = new UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters self = new UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters extends TeaModel {
        @NameInMap("BodyParameters")
        public java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        @NameInMap("HeaderParameters")
        public java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

        @NameInMap("QueryStringParameters")
        public java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> queryStringParameters;

        public static UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters self = new UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters setBodyParameters(java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }
        public java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters setHeaderParameters(java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }
        public java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters setQueryStringParameters(java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }
        public java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

    }

    public static class UpdateConnectionRequestAuthParametersOAuthParameters extends TeaModel {
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        @NameInMap("ClientParameters")
        public UpdateConnectionRequestAuthParametersOAuthParametersClientParameters clientParameters;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("OAuthHttpParameters")
        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters OAuthHttpParameters;

        public static UpdateConnectionRequestAuthParametersOAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParametersOAuthParameters self = new UpdateConnectionRequestAuthParametersOAuthParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParametersOAuthParameters setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public UpdateConnectionRequestAuthParametersOAuthParameters setClientParameters(UpdateConnectionRequestAuthParametersOAuthParametersClientParameters clientParameters) {
            this.clientParameters = clientParameters;
            return this;
        }
        public UpdateConnectionRequestAuthParametersOAuthParametersClientParameters getClientParameters() {
            return this.clientParameters;
        }

        public UpdateConnectionRequestAuthParametersOAuthParameters setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public UpdateConnectionRequestAuthParametersOAuthParameters setOAuthHttpParameters(UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters OAuthHttpParameters) {
            this.OAuthHttpParameters = OAuthHttpParameters;
            return this;
        }
        public UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters getOAuthHttpParameters() {
            return this.OAuthHttpParameters;
        }

    }

    public static class UpdateConnectionRequestAuthParameters extends TeaModel {
        @NameInMap("ApiKeyAuthParameters")
        public UpdateConnectionRequestAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("BasicAuthParameters")
        public UpdateConnectionRequestAuthParametersBasicAuthParameters basicAuthParameters;

        @NameInMap("OAuthParameters")
        public UpdateConnectionRequestAuthParametersOAuthParameters OAuthParameters;

        public static UpdateConnectionRequestAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestAuthParameters self = new UpdateConnectionRequestAuthParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestAuthParameters setApiKeyAuthParameters(UpdateConnectionRequestAuthParametersApiKeyAuthParameters apiKeyAuthParameters) {
            this.apiKeyAuthParameters = apiKeyAuthParameters;
            return this;
        }
        public UpdateConnectionRequestAuthParametersApiKeyAuthParameters getApiKeyAuthParameters() {
            return this.apiKeyAuthParameters;
        }

        public UpdateConnectionRequestAuthParameters setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public UpdateConnectionRequestAuthParameters setBasicAuthParameters(UpdateConnectionRequestAuthParametersBasicAuthParameters basicAuthParameters) {
            this.basicAuthParameters = basicAuthParameters;
            return this;
        }
        public UpdateConnectionRequestAuthParametersBasicAuthParameters getBasicAuthParameters() {
            return this.basicAuthParameters;
        }

        public UpdateConnectionRequestAuthParameters setOAuthParameters(UpdateConnectionRequestAuthParametersOAuthParameters OAuthParameters) {
            this.OAuthParameters = OAuthParameters;
            return this;
        }
        public UpdateConnectionRequestAuthParametersOAuthParameters getOAuthParameters() {
            return this.OAuthParameters;
        }

    }

    public static class UpdateConnectionRequestNetworkParameters extends TeaModel {
        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitcheId")
        public String vswitcheId;

        public static UpdateConnectionRequestNetworkParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateConnectionRequestNetworkParameters self = new UpdateConnectionRequestNetworkParameters();
            return TeaModel.build(map, self);
        }

        public UpdateConnectionRequestNetworkParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public UpdateConnectionRequestNetworkParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateConnectionRequestNetworkParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateConnectionRequestNetworkParameters setVswitcheId(String vswitcheId) {
            this.vswitcheId = vswitcheId;
            return this;
        }
        public String getVswitcheId() {
            return this.vswitcheId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    @NameInMap("AuthParameters")
    public CreateConnectionRequestAuthParameters authParameters;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("Description")
    public String description;

    @NameInMap("NetworkParameters")
    public CreateConnectionRequestNetworkParameters networkParameters;

    public static CreateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionRequest self = new CreateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnectionRequest setAuthParameters(CreateConnectionRequestAuthParameters authParameters) {
        this.authParameters = authParameters;
        return this;
    }
    public CreateConnectionRequestAuthParameters getAuthParameters() {
        return this.authParameters;
    }

    public CreateConnectionRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CreateConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConnectionRequest setNetworkParameters(CreateConnectionRequestNetworkParameters networkParameters) {
        this.networkParameters = networkParameters;
        return this;
    }
    public CreateConnectionRequestNetworkParameters getNetworkParameters() {
        return this.networkParameters;
    }

    public static class CreateConnectionRequestAuthParametersApiKeyAuthParameters extends TeaModel {
        @NameInMap("ApiKeyName")
        public String apiKeyName;

        @NameInMap("ApiKeyValue")
        public String apiKeyValue;

        public static CreateConnectionRequestAuthParametersApiKeyAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParametersApiKeyAuthParameters self = new CreateConnectionRequestAuthParametersApiKeyAuthParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParametersApiKeyAuthParameters setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        public CreateConnectionRequestAuthParametersApiKeyAuthParameters setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

    }

    public static class CreateConnectionRequestAuthParametersBasicAuthParameters extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("Username")
        public String username;

        public static CreateConnectionRequestAuthParametersBasicAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParametersBasicAuthParameters self = new CreateConnectionRequestAuthParametersBasicAuthParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParametersBasicAuthParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateConnectionRequestAuthParametersBasicAuthParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateConnectionRequestAuthParametersOAuthParametersClientParameters extends TeaModel {
        @NameInMap("ClientID")
        public String clientID;

        @NameInMap("ClientSecret")
        public String clientSecret;

        public static CreateConnectionRequestAuthParametersOAuthParametersClientParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParametersOAuthParametersClientParameters self = new CreateConnectionRequestAuthParametersOAuthParametersClientParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParametersOAuthParametersClientParameters setClientID(String clientID) {
            this.clientID = clientID;
            return this;
        }
        public String getClientID() {
            return this.clientID;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersClientParameters setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters self = new CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters self = new CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters self = new CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters extends TeaModel {
        @NameInMap("BodyParameters")
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        @NameInMap("HeaderParameters")
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

        @NameInMap("QueryStringParameters")
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> queryStringParameters;

        public static CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters self = new CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters setBodyParameters(java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters setHeaderParameters(java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters setQueryStringParameters(java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

    }

    public static class CreateConnectionRequestAuthParametersOAuthParameters extends TeaModel {
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        @NameInMap("ClientParameters")
        public CreateConnectionRequestAuthParametersOAuthParametersClientParameters clientParameters;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("OAuthHttpParameters")
        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters OAuthHttpParameters;

        public static CreateConnectionRequestAuthParametersOAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParametersOAuthParameters self = new CreateConnectionRequestAuthParametersOAuthParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParametersOAuthParameters setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public CreateConnectionRequestAuthParametersOAuthParameters setClientParameters(CreateConnectionRequestAuthParametersOAuthParametersClientParameters clientParameters) {
            this.clientParameters = clientParameters;
            return this;
        }
        public CreateConnectionRequestAuthParametersOAuthParametersClientParameters getClientParameters() {
            return this.clientParameters;
        }

        public CreateConnectionRequestAuthParametersOAuthParameters setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public CreateConnectionRequestAuthParametersOAuthParameters setOAuthHttpParameters(CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters OAuthHttpParameters) {
            this.OAuthHttpParameters = OAuthHttpParameters;
            return this;
        }
        public CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParameters getOAuthHttpParameters() {
            return this.OAuthHttpParameters;
        }

    }

    public static class CreateConnectionRequestAuthParameters extends TeaModel {
        @NameInMap("ApiKeyAuthParameters")
        public CreateConnectionRequestAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("BasicAuthParameters")
        public CreateConnectionRequestAuthParametersBasicAuthParameters basicAuthParameters;

        @NameInMap("OAuthParameters")
        public CreateConnectionRequestAuthParametersOAuthParameters OAuthParameters;

        public static CreateConnectionRequestAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestAuthParameters self = new CreateConnectionRequestAuthParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestAuthParameters setApiKeyAuthParameters(CreateConnectionRequestAuthParametersApiKeyAuthParameters apiKeyAuthParameters) {
            this.apiKeyAuthParameters = apiKeyAuthParameters;
            return this;
        }
        public CreateConnectionRequestAuthParametersApiKeyAuthParameters getApiKeyAuthParameters() {
            return this.apiKeyAuthParameters;
        }

        public CreateConnectionRequestAuthParameters setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public CreateConnectionRequestAuthParameters setBasicAuthParameters(CreateConnectionRequestAuthParametersBasicAuthParameters basicAuthParameters) {
            this.basicAuthParameters = basicAuthParameters;
            return this;
        }
        public CreateConnectionRequestAuthParametersBasicAuthParameters getBasicAuthParameters() {
            return this.basicAuthParameters;
        }

        public CreateConnectionRequestAuthParameters setOAuthParameters(CreateConnectionRequestAuthParametersOAuthParameters OAuthParameters) {
            this.OAuthParameters = OAuthParameters;
            return this;
        }
        public CreateConnectionRequestAuthParametersOAuthParameters getOAuthParameters() {
            return this.OAuthParameters;
        }

    }

    public static class CreateConnectionRequestNetworkParameters extends TeaModel {
        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitcheId")
        public String vswitcheId;

        public static CreateConnectionRequestNetworkParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateConnectionRequestNetworkParameters self = new CreateConnectionRequestNetworkParameters();
            return TeaModel.build(map, self);
        }

        public CreateConnectionRequestNetworkParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public CreateConnectionRequestNetworkParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateConnectionRequestNetworkParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateConnectionRequestNetworkParameters setVswitcheId(String vswitcheId) {
            this.vswitcheId = vswitcheId;
            return this;
        }
        public String getVswitcheId() {
            return this.vswitcheId;
        }

    }

}

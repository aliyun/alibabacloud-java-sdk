// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    /**
     * <p>The authentication configuration.</p>
     */
    @NameInMap("AuthParameters")
    public CreateConnectionRequestAuthParameters authParameters;

    /**
     * <p>The connection configuration name. Maximum length: 127 characters. Minimum length: 2 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description of the connection configuration. Maximum length: 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The network configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkParameters")
    public CreateConnectionRequestNetworkParameters networkParameters;

    /**
     * <p>The data source connection parameters (JSON object). This parameter is required when Type is set to a data source type. This parameter is not required for the Http type. For specific field definitions, call the GetConnectionType operation and refer to ParamsSchema in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HostName&quot;:&quot;xxx.mysql.rds.aliyuncs.com&quot;,&quot;Port&quot;:&quot;3306&quot;,&quot;User&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;xxx&quot;,&quot;DatabaseName&quot;:&quot;demo_db&quot;}</p>
     */
    @NameInMap("Parameters")
    public Object parameters;

    /**
     * <p>The connection type. Valid values: MySQL, PostgreSQL, Elasticsearch, and Http. This parameter is required for data source connections. If this parameter is not specified, the default value Http is used. The Http type is used for HTTP protocol targets such as API Destination. Data source types are used for data connections in the integration marketplace.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("Type")
    public String type;

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

    public CreateConnectionRequest setParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }
    public Object getParameters() {
        return this.parameters;
    }

    public CreateConnectionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateConnectionRequestAuthParametersApiKeyAuthParameters extends TeaModel {
        /**
         * <p>The key name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>Token</p>
         */
        @NameInMap("ApiKeyName")
        public String apiKeyName;

        /**
         * <p>The value of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>adkjnakddh****</p>
         */
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
        /**
         * <p>The password for basic authentication.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The username for basic authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
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
        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientID</p>
         */
        @NameInMap("ClientID")
        public String clientID;

        /**
         * <p>The client secret of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Qo57Q<del>F249</del>S74GmNPA36pZJoJK4f4LY****</p>
         */
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
        /**
         * <p>Specifies whether the value is a secret.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the body request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>keyDemo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the body request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>keyValue</p>
         */
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
        /**
         * <p>Specifies whether the value is a secret.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the header parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>keyDemo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>keyValue</p>
         */
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
        /**
         * <p>Specifies whether the value is a secret.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the URI of the request path parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>keyDemo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the URI of the request path parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>valueDemo</p>
         */
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
        /**
         * <p>The list of body request parameter configurations.</p>
         */
        @NameInMap("BodyParameters")
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        /**
         * <p>The list of header parameter configurations.</p>
         */
        @NameInMap("HeaderParameters")
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

        /**
         * <p>The structure of the URI of the request path parameters.</p>
         */
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
        /**
         * <p>The authorization endpoint URL. Maximum length: 127 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://localhost:8080/oauth/token">http://localhost:8080/oauth/token</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The client parameter configuration.</p>
         */
        @NameInMap("ClientParameters")
        public CreateConnectionRequestAuthParametersOAuthParametersClientParameters clientParameters;

        /**
         * <p>The HTTP method. Valid values:</p>
         * <ul>
         * <li>GET</li>
         * <li>POST</li>
         * <li>HEAD</li>
         * <li>DELETE</li>
         * <li>PUT</li>
         * <li>PATCH</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The OAuth authentication request parameters.</p>
         */
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
        /**
         * <p>The API key authentication configuration.</p>
         */
        @NameInMap("ApiKeyAuthParameters")
        public CreateConnectionRequestAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        /**
         * <p>The authentication type:</p>
         * <ul>
         * <li><p>BASIC: BASIC_AUTH. This authorization method is a basic authorization method implemented by browsers in compliance with the HTTP protocol. During HTTP communication, the HTTP protocol defines a basic authentication method that allows an HTTP server to authenticate clients. Add <code>Authorization: Basic Base64Encoded(username:password)</code> in the fixed format to the request header. Username and Password are required.</p>
         * </li>
         * <li><p>API KEY: API_KEY_AUTH. Add <code>Token: TokenValue</code> in the fixed format to the request header. ApiKeyName and ApiKeyValue are required.</p>
         * </li>
         * <li><p>OAUTH: OAUTH_AUTH. OAuth 2.0 is an authorization mechanism. In a system that does not use an authorization mechanism such as OAuth 2.0, the client can directly access resources on the resource server. To ensure secure data access, an Access Token mechanism is added. The client must carry an Access Token to access protected resources. OAuth 2.0 prevents resources from being accessed by malicious clients, which improves system security. AuthorizationEndpoint, OAuthHttpParameters, and HttpMethod are required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC_AUTH</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <p>The basic authentication configuration.</p>
         */
        @NameInMap("BasicAuthParameters")
        public CreateConnectionRequestAuthParametersBasicAuthParameters basicAuthParameters;

        /**
         * <p>The OAuth authentication configuration.</p>
         */
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
        /**
         * <ul>
         * <li><p>Public network: PublicNetwork</p>
         * </li>
         * <li><p>Virtual private cloud (VPC): PrivateNetwork</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: If you select PrivateNetwork, VpcId, VswitcheId, and SecurityGroupId are required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eb-167adad548759-security_grop/sg-bp1addad26peuh9qh9****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>eb-test/vpc-bp1symadadwnwg****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1iu4x7aeradadown1og8,vsw-bp193sqmadadlaszpeq****</p>
         */
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

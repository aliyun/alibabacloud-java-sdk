// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class UpdateConnectionRequest extends TeaModel {
    /**
     * <p>The data structure of the authentication parameters.</p>
     */
    @NameInMap("AuthParameters")
    public UpdateConnectionRequestAuthParameters authParameters;

    /**
     * <p>The name of the connection to be updated. The maximum length is 127 characters. The minimum length is 2 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connection-name</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <p>The description. The maximum length is 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Description of the connection configuration</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The data structure of the network configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkParameters")
    public UpdateConnectionRequestNetworkParameters networkParameters;

    /**
     * <p>The data source connection parameters (JSON object). For specific field definitions, call the GetConnectionType API and refer to the ParamsSchema in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HostName&quot;:&quot;xxx.mysql.rds.aliyuncs.com&quot;,&quot;Port&quot;:&quot;3306&quot;,&quot;User&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;xxx&quot;,&quot;DatabaseName&quot;:&quot;demo_db&quot;}</p>
     */
    @NameInMap("Parameters")
    public Object parameters;

    /**
     * <p>The connection type. Valid values: MySQL, PostgreSQL, Elasticsearch, and Http.</p>
     * 
     * <strong>example:</strong>
     * <p>Http</p>
     */
    @NameInMap("Type")
    public String type;

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

    public UpdateConnectionRequest setParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }
    public Object getParameters() {
        return this.parameters;
    }

    public UpdateConnectionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdateConnectionRequestAuthParametersApiKeyAuthParameters extends TeaModel {
        /**
         * <p>The key of the API Key.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ApiKeyName")
        public String apiKeyName;

        /**
         * <p>The value of the API Key.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
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
        /**
         * <p>The password for Basic authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The username for Basic authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
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
         * <p>ClientSecret</p>
         */
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
        /**
         * <p>Specifies whether the parameter is used for authentication.</p>
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
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the body request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
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
        /**
         * <p>Specifies whether the parameter is used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the request header parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the request header parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
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
        /**
         * <p>Specifies whether the parameter is used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the request query parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the request query parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
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
        /**
         * <p>The list of data structures for body request parameters.</p>
         */
        @NameInMap("BodyParameters")
        public java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        /**
         * <p>The list of request header parameters.</p>
         */
        @NameInMap("HeaderParameters")
        public java.util.List<UpdateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

        /**
         * <p>The data structure of request query parameters.</p>
         */
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
        /**
         * <p>The request URL for obtaining the OAuth token. The maximum length is 127 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://localhost:8080/oauth/token">http://localhost:8080/oauth/token</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The data structure of the client parameters.</p>
         */
        @NameInMap("ClientParameters")
        public UpdateConnectionRequestAuthParametersOAuthParametersClientParameters clientParameters;

        /**
         * <p>The HTTP request method. Valid values:</p>
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
         * <p>The request parameters for OAuth authentication.</p>
         */
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
        /**
         * <p>The data structure of API Key authentication.</p>
         */
        @NameInMap("ApiKeyAuthParameters")
        public UpdateConnectionRequestAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><p>BASIC: BASIC_AUTH. This authorization method is the basic authentication method implemented by browsers in compliance with the HTTP protocol. During communication using the HTTP protocol, the HTTP protocol defines basic authentication that allows the HTTP server to authenticate the user identity of the client. Add Authorization: Basic followed by one space and the Base64-encoded value of <code>username:password</code> to the request header in a fixed format. Username and Password are required.</p>
         * </li>
         * <li><p>API KEY: API_KEY_AUTH. Add Token: TokenValue to the request header in a fixed format. ApiKeyName and ApiKeyValue are required.</p>
         * </li>
         * <li><p>OAUTH: OAUTH_AUTH. OAuth 2.0 is an authorization mechanism. In normal cases, in a system that does not use an authorization mechanism such as OAuth 2.0, the client can directly access resources on the resource server. To ensure secure data access for users, the Access Token mechanism is added between the client and the resource server. The client must carry an Access Token to access protected resources. Therefore, OAuth 2.0 prevents resources from being accessed by malicious clients, thereby improving the security of the system. AuthorizationEndpoint, OAuthHttpParameters, and HttpMethod are required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC_AUTH</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <p>The data structure of Basic authentication.</p>
         */
        @NameInMap("BasicAuthParameters")
        public UpdateConnectionRequestAuthParametersBasicAuthParameters basicAuthParameters;

        /**
         * <p>The data structure of the OAuth authentication parameters.</p>
         */
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
        /**
         * <ul>
         * <li><p>Public network: PublicNetwork</p>
         * </li>
         * <li><p>Virtual Private Cloud (VPC): PrivateNetwork</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When you select PrivateNetwork, VpcId, VswitcheId, and SecurityGroupId are required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PublicNetwork</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>eb-167adad548759-security_grop/sg-bp1addad26peuh9qh9rtyb</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>eb-test/vpc-bp1symadadwnwgmqud</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1iu4x7aeradadown1og8,vsw-bp193sqmadadlaszpeqbt2c</p>
         */
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

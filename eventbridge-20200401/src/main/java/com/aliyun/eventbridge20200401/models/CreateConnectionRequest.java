// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    /**
     * <p>The authentication data structure.</p>
     */
    @NameInMap("AuthParameters")
    public CreateConnectionRequestAuthParameters authParameters;

    /**
     * <p>The name of the connection configuration. The length must be 2 to 127 characters.</p>
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
     * <p>The data structure of the network configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkParameters")
    public CreateConnectionRequestNetworkParameters networkParameters;

    /**
     * <p>The data source connection parameters in JSON format. This parameter is required when Type is set to a data source type, and is not required when Type is set to Http. For specific field definitions, call the GetConnectionType operation and refer to ParamsSchema in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;HostName&quot;:&quot;xxx.mysql.rds.aliyuncs.com&quot;,&quot;Port&quot;:&quot;3306&quot;,&quot;User&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;xxx&quot;,&quot;DatabaseName&quot;:&quot;demo_db&quot;}</p>
     */
    @NameInMap("Parameters")
    public Object parameters;

    /**
     * <p>The connection type. Valid values: MySQL, PostgreSQL, Elasticsearch, OSS_TABLES, SLS, OTS, MaxCompute, MongoDB, Redis, SQLServer, ClickHouse, Oracle, Hive, Iceberg, lakehouse, and Http. This parameter is required for data source connections. If you do not specify this parameter, the default value Http is used. The Http type is used for HTTP protocol targets such as API Destination. Hive and Iceberg are used for their respective data lakehouse data sources. The lakehouse type is used only for compatibility with existing connections. Other data source types are used for data connections in the integration marketplace.</p>
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
         * <p>The ID of the client.</p>
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
         * <p>The list of structures for body request parameters.</p>
         */
        @NameInMap("BodyParameters")
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        /**
         * <p>The list of header parameters.</p>
         */
        @NameInMap("HeaderParameters")
        public java.util.List<CreateConnectionRequestAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

        /**
         * <p>The structure of URI of the request path parameters.</p>
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
         * <p>The endpoint URL for authorization. Maximum length: 127 characters.</p>
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
        public CreateConnectionRequestAuthParametersOAuthParametersClientParameters clientParameters;

        /**
         * <p>The HTTP method for probing. Valid values:</p>
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
         * <p>The data structure of the API key authentication parameters.</p>
         */
        @NameInMap("ApiKeyAuthParameters")
        public CreateConnectionRequestAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li>BASIC: Basic authentication. This is a standard authentication method defined by the HTTP protocol. Add the Authorization header in the format of Basic followed by a space and the Base64-encoded username:password. Username and Password are required.</li>
         * <li>API KEY: API key authentication. Add the Token header with the token value. ApiKeyName and ApiKeyValue are required.</li>
         * <li>OAUTH: OAuth 2.0 authentication. OAuth 2.0 is an authorization framework that uses access tokens to protect resources. Clients must include an access token in their requests to access protected resources. AuthorizationEndpoint, OAuthHttpParameters, and HttpMethod are required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC_AUTH</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <p>The data structure of the basic authentication parameters.</p>
         */
        @NameInMap("BasicAuthParameters")
        public CreateConnectionRequestAuthParametersBasicAuthParameters basicAuthParameters;

        /**
         * <p>The data structure of the OAuth authentication parameters.</p>
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
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li>PublicNetwork: public network</li>
         * <li>PrivateNetwork: VPC
         * <notice>If you select PrivateNetwork, VpcId, VswitcheId, and SecurityGroupId are required.</notice></li>
         * </ul>
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
         * <p>The ID of the vSwitch.</p>
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

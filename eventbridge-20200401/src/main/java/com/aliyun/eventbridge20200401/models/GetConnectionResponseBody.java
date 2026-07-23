// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetConnectionResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code. Valid values: Success: The request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetConnectionResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public Integer httpCode;

    /**
     * <p>The information returned by the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionResponseBody self = new GetConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConnectionResponseBody setData(GetConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetConnectionResponseBodyData getData() {
        return this.data;
    }

    public GetConnectionResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetConnectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters extends TeaModel {
        /**
         * <p>The key of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("ApiKeyName")
        public String apiKeyName;

        /**
         * <p>The value of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("ApiKeyValue")
        public String apiKeyValue;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters extends TeaModel {
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

        public static GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters extends TeaModel {
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
         * <p>Qo57Q<del>F249</del>S74GmNPA36pZJoJK4f4****</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters setClientID(String clientID) {
            this.clientID = clientID;
            return this;
        }
        public String getClientID() {
            return this.clientID;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters extends TeaModel {
        /**
         * <p>Indicates whether the parameter is used for authentication.</p>
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
         * <p>valueDemo</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters extends TeaModel {
        /**
         * <p>Indicates whether the parameter is used for authentication.</p>
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
         * <p>keyDemo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the request header parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>keyDemo</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters extends TeaModel {
        /**
         * <p>Indicates whether the parameter is used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the request path parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>keyDemo</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the request path parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>valueDemo</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters extends TeaModel {
        /**
         * <p>The list of request parameter data structures.</p>
         */
        @NameInMap("BodyParameters")
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        /**
         * <p>The list of request header parameters.</p>
         */
        @NameInMap("HeaderParameters")
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

        /**
         * <p>The data structure of the request path parameters.</p>
         */
        @NameInMap("QueryStringParameters")
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> queryStringParameters;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters setBodyParameters(java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters setHeaderParameters(java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters setQueryStringParameters(java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters extends TeaModel {
        /**
         * <p>The request URL for obtaining the OAuth token.</p>
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
        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters clientParameters;

        /**
         * <p>The HTTP method used for the request. Valid values:</p>
         * <ul>
         * <li>GET</li>
         * <li>POST</li>
         * <li>HEAD</li>
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
        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters OAuthHttpParameters;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters setClientParameters(GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters clientParameters) {
            this.clientParameters = clientParameters;
            return this;
        }
        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters getClientParameters() {
            return this.clientParameters;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters setOAuthHttpParameters(GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters OAuthHttpParameters) {
            this.OAuthHttpParameters = OAuthHttpParameters;
            return this;
        }
        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters getOAuthHttpParameters() {
            return this.OAuthHttpParameters;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParameters extends TeaModel {
        /**
         * <p>The data structure of the API KEY.</p>
         */
        @NameInMap("ApiKeyAuthParameters")
        public GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        /**
         * <p>The authorization type:</p>
         * <ul>
         * <li><p>BASIC: BASIC_AUTH</p>
         * </li>
         * <li><p>API KEY: API_KEY_AUTH</p>
         * </li>
         * <li><p>OAUTH: OAUTH_AUTH</p>
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
        public GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters basicAuthParameters;

        /**
         * <p>The data structure of OAuth request parameters.</p>
         */
        @NameInMap("OAuthParameters")
        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters OAuthParameters;

        public static GetConnectionResponseBodyDataConnectionsAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParameters self = new GetConnectionResponseBodyDataConnectionsAuthParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParameters setApiKeyAuthParameters(GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters apiKeyAuthParameters) {
            this.apiKeyAuthParameters = apiKeyAuthParameters;
            return this;
        }
        public GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters getApiKeyAuthParameters() {
            return this.apiKeyAuthParameters;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParameters setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParameters setBasicAuthParameters(GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters basicAuthParameters) {
            this.basicAuthParameters = basicAuthParameters;
            return this;
        }
        public GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters getBasicAuthParameters() {
            return this.basicAuthParameters;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParameters setOAuthParameters(GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters OAuthParameters) {
            this.OAuthParameters = OAuthParameters;
            return this;
        }
        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParameters getOAuthParameters() {
            return this.OAuthParameters;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsNetworkParameters extends TeaModel {
        /**
         * <ul>
         * <li><p>Internet: PublicNetwork</p>
         * </li>
         * <li><p>Virtual private cloud (VPC): PrivateNetwork</p>
         * </li>
         * </ul>
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
         * <p>The ID of the virtual private cloud (VPC).</p>
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
         * <p>vsw-bp1iu4x7aeradadown****,vsw-bp193sqmadadlaszpeq****</p>
         */
        @NameInMap("VswitcheId")
        public String vswitcheId;

        public static GetConnectionResponseBodyDataConnectionsNetworkParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsNetworkParameters self = new GetConnectionResponseBodyDataConnectionsNetworkParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsNetworkParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetConnectionResponseBodyDataConnectionsNetworkParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetConnectionResponseBodyDataConnectionsNetworkParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetConnectionResponseBodyDataConnectionsNetworkParameters setVswitcheId(String vswitcheId) {
            this.vswitcheId = vswitcheId;
            return this;
        }
        public String getVswitcheId() {
            return this.vswitcheId;
        }

    }

    public static class GetConnectionResponseBodyDataConnections extends TeaModel {
        /**
         * <p>The data structure of the permission.</p>
         */
        @NameInMap("AuthParameters")
        public GetConnectionResponseBodyDataConnectionsAuthParameters authParameters;

        /**
         * <p>The name of the connection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>The description of the connection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1669648905</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5668</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The data structure of the network configuration.</p>
         */
        @NameInMap("NetworkParameters")
        public GetConnectionResponseBodyDataConnectionsNetworkParameters networkParameters;

        /**
         * <p>The data source connection parameters (JSON object). Only returned for data source type connections. Empty for the Http type. For field definitions, refer to the ParamsSchema returned by GetConnectionType.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;HostName&quot;:&quot;xxx.mysql.rds.aliyuncs.com&quot;,&quot;Port&quot;:&quot;3306&quot;,&quot;User&quot;:&quot;root&quot;,&quot;Password&quot;:&quot;xxx&quot;,&quot;DatabaseName&quot;:&quot;demo_db&quot;}</p>
         */
        @NameInMap("Parameters")
        public Object parameters;

        /**
         * <p>The connection type. Valid values: Http, MySQL, PostgreSQL, Elasticsearch.</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetConnectionResponseBodyDataConnections build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnections self = new GetConnectionResponseBodyDataConnections();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnections setAuthParameters(GetConnectionResponseBodyDataConnectionsAuthParameters authParameters) {
            this.authParameters = authParameters;
            return this;
        }
        public GetConnectionResponseBodyDataConnectionsAuthParameters getAuthParameters() {
            return this.authParameters;
        }

        public GetConnectionResponseBodyDataConnections setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public GetConnectionResponseBodyDataConnections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetConnectionResponseBodyDataConnections setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetConnectionResponseBodyDataConnections setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetConnectionResponseBodyDataConnections setNetworkParameters(GetConnectionResponseBodyDataConnectionsNetworkParameters networkParameters) {
            this.networkParameters = networkParameters;
            return this;
        }
        public GetConnectionResponseBodyDataConnectionsNetworkParameters getNetworkParameters() {
            return this.networkParameters;
        }

        public GetConnectionResponseBodyDataConnections setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public GetConnectionResponseBodyDataConnections setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetConnectionResponseBodyData extends TeaModel {
        /**
         * <p>The list of connection configuration information.</p>
         */
        @NameInMap("Connections")
        public java.util.List<GetConnectionResponseBodyDataConnections> connections;

        public static GetConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyData self = new GetConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyData setConnections(java.util.List<GetConnectionResponseBodyDataConnections> connections) {
            this.connections = connections;
            return this;
        }
        public java.util.List<GetConnectionResponseBodyDataConnections> getConnections() {
            return this.connections;
        }

    }

}

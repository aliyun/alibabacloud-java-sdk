// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListConnectionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The value Success indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListConnectionsResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E3619976-8714-5D88-BBA2-6983D798A8BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsResponseBody self = new ListConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConnectionsResponseBody setData(ListConnectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConnectionsResponseBodyData getData() {
        return this.data;
    }

    public ListConnectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters extends TeaModel {
        /**
         * <p>The key of the API key.</p>
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
         * <p>asdkjnqkwejooa</p>
         */
        @NameInMap("ApiKeyValue")
        public String apiKeyValue;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters setApiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters extends TeaModel {
        /**
         * <p>The password for basic authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
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

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters extends TeaModel {
        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientID</p>
         */
        @NameInMap("ClientID")
        public String clientID;

        /**
         * <p>The AccessKey secret of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientSecret</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters setClientID(String clientID) {
            this.clientID = clientID;
            return this;
        }
        public String getClientID() {
            return this.clientID;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters extends TeaModel {
        /**
         * <p>Indicates whether authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters extends TeaModel {
        /**
         * <p>Indicates whether authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters extends TeaModel {
        /**
         * <p>Indicates whether authentication is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the request path.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the request path.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setIsValueSecret(String isValueSecret) {
            this.isValueSecret = isValueSecret;
            return this;
        }
        public String getIsValueSecret() {
            return this.isValueSecret;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters extends TeaModel {
        /**
         * <p>The parameters that are configured for the request.</p>
         */
        @NameInMap("BodyParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        /**
         * <p>The parameters that are returned for the request header.</p>
         */
        @NameInMap("HeaderParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

        /**
         * <p>The parameters that are returned for the request path.</p>
         */
        @NameInMap("QueryStringParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> queryStringParameters;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters setBodyParameters(java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters setHeaderParameters(java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters setQueryStringParameters(java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersQueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters extends TeaModel {
        /**
         * <p>The endpoint that is used to obtain the OAuth token.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://localhost:8080/oauth/token">http://localhost:8080/oauth/token</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The parameters that are returned for the client.</p>
         */
        @NameInMap("ClientParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters clientParameters;

        /**
         * <p>The HTTP request method. Valid values:</p>
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
         * <p>The request parameters of OAuth authentication.</p>
         */
        @NameInMap("OAuthHttpParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters OAuthHttpParameters;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = authorizationEndpoint;
            return this;
        }
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters setClientParameters(ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters clientParameters) {
            this.clientParameters = clientParameters;
            return this;
        }
        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters getClientParameters() {
            return this.clientParameters;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters setOAuthHttpParameters(ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters OAuthHttpParameters) {
            this.OAuthHttpParameters = OAuthHttpParameters;
            return this;
        }
        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParameters getOAuthHttpParameters() {
            return this.OAuthHttpParameters;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParameters extends TeaModel {
        /**
         * <p>The parameters that are returned for API key authentication.</p>
         */
        @NameInMap("ApiKeyAuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        /**
         * <p>The authentication method. Valid values:</p>
         * <ul>
         * <li>BASIC_AUTH: basic authentication.</li>
         * <li>API_KEY_AUTH: API key authentication.</li>
         * <li>OAUTH_AUTH: OAuth authentication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC_AUTH</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <p>The parameters that are returned for basic authentication.</p>
         */
        @NameInMap("BasicAuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters basicAuthParameters;

        /**
         * <p>The parameters that are returned for OAuth authentication.</p>
         */
        @NameInMap("OAuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters OAuthParameters;

        public static ListConnectionsResponseBodyDataConnectionsAuthParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParameters setApiKeyAuthParameters(ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters apiKeyAuthParameters) {
            this.apiKeyAuthParameters = apiKeyAuthParameters;
            return this;
        }
        public ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters getApiKeyAuthParameters() {
            return this.apiKeyAuthParameters;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParameters setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParameters setBasicAuthParameters(ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters basicAuthParameters) {
            this.basicAuthParameters = basicAuthParameters;
            return this;
        }
        public ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters getBasicAuthParameters() {
            return this.basicAuthParameters;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParameters setOAuthParameters(ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters OAuthParameters) {
            this.OAuthParameters = OAuthParameters;
            return this;
        }
        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParameters getOAuthParameters() {
            return this.OAuthParameters;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsNetworkParameters extends TeaModel {
        /**
         * <ul>
         * <li>PublicNetwork: the Internet.</li>
         * <li>PrivateNetwork: virtual private cloud (VPC).</li>
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
         * <p>eb-167adad548759-security_grop/sg-bp1addad26peuh9qh9rtyb</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The VPC ID.</p>
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

        public static ListConnectionsResponseBodyDataConnectionsNetworkParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsNetworkParameters self = new ListConnectionsResponseBodyDataConnectionsNetworkParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsNetworkParameters setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListConnectionsResponseBodyDataConnectionsNetworkParameters setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListConnectionsResponseBodyDataConnectionsNetworkParameters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListConnectionsResponseBodyDataConnectionsNetworkParameters setVswitcheId(String vswitcheId) {
            this.vswitcheId = vswitcheId;
            return this;
        }
        public String getVswitcheId() {
            return this.vswitcheId;
        }

    }

    public static class ListConnectionsResponseBodyDataConnections extends TeaModel {
        /**
         * <p>The parameters that are returned for authentication.</p>
         */
        @NameInMap("AuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParameters authParameters;

        /**
         * <p>The connection name.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>The connection description.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the connection.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the connection was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1592838994234</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the connection.</p>
         * 
         * <strong>example:</strong>
         * <p>1141093</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The parameters that are returned for the network.</p>
         */
        @NameInMap("NetworkParameters")
        public ListConnectionsResponseBodyDataConnectionsNetworkParameters networkParameters;

        public static ListConnectionsResponseBodyDataConnections build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnections self = new ListConnectionsResponseBodyDataConnections();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnections setAuthParameters(ListConnectionsResponseBodyDataConnectionsAuthParameters authParameters) {
            this.authParameters = authParameters;
            return this;
        }
        public ListConnectionsResponseBodyDataConnectionsAuthParameters getAuthParameters() {
            return this.authParameters;
        }

        public ListConnectionsResponseBodyDataConnections setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public ListConnectionsResponseBodyDataConnections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConnectionsResponseBodyDataConnections setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListConnectionsResponseBodyDataConnections setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListConnectionsResponseBodyDataConnections setNetworkParameters(ListConnectionsResponseBodyDataConnectionsNetworkParameters networkParameters) {
            this.networkParameters = networkParameters;
            return this;
        }
        public ListConnectionsResponseBodyDataConnectionsNetworkParameters getNetworkParameters() {
            return this.networkParameters;
        }

    }

    public static class ListConnectionsResponseBodyData extends TeaModel {
        /**
         * <p>The connections.</p>
         */
        @NameInMap("Connections")
        public java.util.List<ListConnectionsResponseBodyDataConnections> connections;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Float maxResults;

        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Float total;

        public static ListConnectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyData self = new ListConnectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyData setConnections(java.util.List<ListConnectionsResponseBodyDataConnections> connections) {
            this.connections = connections;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnections> getConnections() {
            return this.connections;
        }

        public ListConnectionsResponseBodyData setMaxResults(Float maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Float getMaxResults() {
            return this.maxResults;
        }

        public ListConnectionsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListConnectionsResponseBodyData setTotal(Float total) {
            this.total = total;
            return this;
        }
        public Float getTotal() {
            return this.total;
        }

    }

}

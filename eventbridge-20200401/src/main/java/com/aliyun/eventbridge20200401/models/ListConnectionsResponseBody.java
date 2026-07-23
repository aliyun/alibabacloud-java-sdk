// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListConnectionsResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code. Valid values: Success: The request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of returned connection configurations.</p>
     */
    @NameInMap("Data")
    public ListConnectionsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Common parameter. The ID of each request is unique and can be used for troubleshooting and issue locating.</p>
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
         * <p>The password used for basic authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The username used for basic authentication.</p>
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
         * <p>The client secret of the application.</p>
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
         * <p>Specifies whether the value is used for authentication.</p>
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
         * <p>Specifies whether the value is used for authentication.</p>
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
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the header parameter.</p>
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
         * <p>Specifies whether the value is used for authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        /**
         * <p>The key of the query string parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the query string parameter.</p>
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
         * <p>The list of request parameter data structures.</p>
         */
        @NameInMap("BodyParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        /**
         * <p>The list of header parameters.</p>
         */
        @NameInMap("HeaderParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

        /**
         * <p>The data structure of query string parameters.</p>
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
         * <p>The endpoint URL for obtaining the OAuth token.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://localhost:8080/oauth/token">http://localhost:8080/oauth/token</a></p>
         */
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        /**
         * <p>The data structure of client parameters.</p>
         */
        @NameInMap("ClientParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters clientParameters;

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
         * <p>The request parameters used for OAuth authentication.</p>
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
         * <p>The data structure of API key authentication parameters.</p>
         */
        @NameInMap("ApiKeyAuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        /**
         * <p>The authentication type. Valid values:</p>
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
         * <p>The data structure of basic authentication parameters.</p>
         */
        @NameInMap("BasicAuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters basicAuthParameters;

        /**
         * <p>The data structure of OAuth request parameters.</p>
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
         * <li><p>Public network: PublicNetwork</p>
         * </li>
         * <li><p>Virtual private cloud: PrivateNetwork</p>
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
         * <p>eb-167adad548759-security_grop/sg-bp1addad26peuh9qh9rtyb</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
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
         * <p>The data structure of authentication parameters.</p>
         */
        @NameInMap("AuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParameters authParameters;

        /**
         * <p>The name of the connection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>connection-name</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>The description of the connection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the connection configuration</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp when the data source was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1592838994234</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the connection configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1141093</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The data structure of the network configuration.</p>
         */
        @NameInMap("NetworkParameters")
        public ListConnectionsResponseBodyDataConnectionsNetworkParameters networkParameters;

        /**
         * <p>The data source connection parameters (JSON object). This field is only returned for data source type connections and is empty for Http type. For field definitions, refer to the ParamsSchema returned by GetConnectionType.</p>
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

        public ListConnectionsResponseBodyDataConnections setParameters(Object parameters) {
            this.parameters = parameters;
            return this;
        }
        public Object getParameters() {
            return this.parameters;
        }

        public ListConnectionsResponseBodyDataConnections setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListConnectionsResponseBodyData extends TeaModel {
        /**
         * <p>The list of returned connection configurations.</p>
         */
        @NameInMap("Connections")
        public java.util.List<ListConnectionsResponseBodyDataConnections> connections;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Float maxResults;

        /**
         * <p>If there are more results to fetch, NextToken is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
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

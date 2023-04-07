// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListConnectionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListConnectionsResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("ApiKeyName")
        public String apiKeyName;

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
        @NameInMap("Password")
        public String password;

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

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters extends TeaModel {
        @NameInMap("BodyParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters> bodyParameters;

        @NameInMap("HeaderParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters> headerParameters;

        @NameInMap("QueryStringParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters> queryStringParameters;

        public static ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters self = new ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters setBodyParameters(java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters setHeaderParameters(java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters setQueryStringParameters(java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

    }

    public static class ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters extends TeaModel {
        @NameInMap("ClientID")
        public String clientID;

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
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("BodyParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        @NameInMap("HeaderParameters")
        public java.util.List<ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

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
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        @NameInMap("ClientParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters clientParameters;

        @NameInMap("HttpMethod")
        public String httpMethod;

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
        @NameInMap("ApiKeyAuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("BasicAuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersBasicAuthParameters basicAuthParameters;

        @NameInMap("InvocationHttpParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters invocationHttpParameters;

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

        public ListConnectionsResponseBodyDataConnectionsAuthParameters setInvocationHttpParameters(ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters invocationHttpParameters) {
            this.invocationHttpParameters = invocationHttpParameters;
            return this;
        }
        public ListConnectionsResponseBodyDataConnectionsAuthParametersInvocationHttpParameters getInvocationHttpParameters() {
            return this.invocationHttpParameters;
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
        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VpcId")
        public String vpcId;

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
        @NameInMap("AuthParameters")
        public ListConnectionsResponseBodyDataConnectionsAuthParameters authParameters;

        @NameInMap("ConnectionName")
        public String connectionName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Connections")
        public java.util.List<ListConnectionsResponseBodyDataConnections> connections;

        @NameInMap("MaxResults")
        public Float maxResults;

        @NameInMap("NextToken")
        public String nextToken;

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

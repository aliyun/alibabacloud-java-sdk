// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetConnectionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetConnectionResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("ApiKeyName")
        public String apiKeyName;

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
        @NameInMap("Password")
        public String password;

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

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ValuValuee")
        public String valuValuee;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters setValuValuee(String valuValuee) {
            this.valuValuee = valuValuee;
            return this;
        }
        public String getValuValuee() {
            return this.valuValuee;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters extends TeaModel {
        @NameInMap("BodyParameters")
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters> bodyParameters;

        @NameInMap("HeaderParameters")
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters> headerParameters;

        @NameInMap("QueryStringParameters")
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters> queryStringParameters;

        public static GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters self = new GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters();
            return TeaModel.build(map, self);
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters setBodyParameters(java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters> bodyParameters) {
            this.bodyParameters = bodyParameters;
            return this;
        }
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersBodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters setHeaderParameters(java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersHeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters setQueryStringParameters(java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters> queryStringParameters) {
            this.queryStringParameters = queryStringParameters;
            return this;
        }
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParametersQueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

    }

    public static class GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters extends TeaModel {
        @NameInMap("ClientID")
        public String clientID;

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
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("IsValueSecret")
        public String isValueSecret;

        @NameInMap("Key")
        public String key;

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
        @NameInMap("BodyParameters")
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersBodyParameters> bodyParameters;

        @NameInMap("HeaderParameters")
        public java.util.List<GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersOAuthHttpParametersHeaderParameters> headerParameters;

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
        @NameInMap("AuthorizationEndpoint")
        public String authorizationEndpoint;

        @NameInMap("ClientParameters")
        public GetConnectionResponseBodyDataConnectionsAuthParametersOAuthParametersClientParameters clientParameters;

        @NameInMap("HttpMethod")
        public String httpMethod;

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
        @NameInMap("ApiKeyAuthParameters")
        public GetConnectionResponseBodyDataConnectionsAuthParametersApiKeyAuthParameters apiKeyAuthParameters;

        @NameInMap("AuthorizationType")
        public String authorizationType;

        @NameInMap("BasicAuthParameters")
        public GetConnectionResponseBodyDataConnectionsAuthParametersBasicAuthParameters basicAuthParameters;

        @NameInMap("InvocationHttpParameters")
        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters invocationHttpParameters;

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

        public GetConnectionResponseBodyDataConnectionsAuthParameters setInvocationHttpParameters(GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters invocationHttpParameters) {
            this.invocationHttpParameters = invocationHttpParameters;
            return this;
        }
        public GetConnectionResponseBodyDataConnectionsAuthParametersInvocationHttpParameters getInvocationHttpParameters() {
            return this.invocationHttpParameters;
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
        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VpcId")
        public String vpcId;

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
        @NameInMap("AuthParameters")
        public GetConnectionResponseBodyDataConnectionsAuthParameters authParameters;

        @NameInMap("ConnectionName")
        public String connectionName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NetworkParameters")
        public GetConnectionResponseBodyDataConnectionsNetworkParameters networkParameters;

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

    }

    public static class GetConnectionResponseBodyData extends TeaModel {
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

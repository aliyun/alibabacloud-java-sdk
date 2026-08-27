// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListServiceEndpointsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>items</p>
     * 
     * <strong>example:</strong>
     * <p>[...]</p>
     */
    @NameInMap("Items")
    public java.util.List<ListServiceEndpointsResponseBodyItems> items;

    /**
     * <p>The maximum number of results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>nextToken</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>totalCount</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListServiceEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEndpointsResponseBody self = new ListServiceEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceEndpointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServiceEndpointsResponseBody setItems(java.util.List<ListServiceEndpointsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListServiceEndpointsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListServiceEndpointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceEndpointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServiceEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceEndpointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListServiceEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListServiceEndpointsResponseBodyItemsEndpointConfigAuth extends TeaModel {
        /**
         * <p>API Key</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ApiKey")
        public String apiKey;

        /**
         * <p>The API key name.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("ApiKeyName")
        public String apiKeyName;

        public static ListServiceEndpointsResponseBodyItemsEndpointConfigAuth build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsEndpointConfigAuth self = new ListServiceEndpointsResponseBodyItemsEndpointConfigAuth();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsEndpointConfigAuth setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListServiceEndpointsResponseBodyItemsEndpointConfigAuth setApiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }
        public String getApiKeyName() {
            return this.apiKeyName;
        }

    }

    public static class ListServiceEndpointsResponseBodyItemsEndpointConfig extends TeaModel {
        /**
         * <p>The authentication configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Auth")
        public ListServiceEndpointsResponseBodyItemsEndpointConfigAuth auth;

        public static ListServiceEndpointsResponseBodyItemsEndpointConfig build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItemsEndpointConfig self = new ListServiceEndpointsResponseBodyItemsEndpointConfig();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItemsEndpointConfig setAuth(ListServiceEndpointsResponseBodyItemsEndpointConfigAuth auth) {
            this.auth = auth;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsEndpointConfigAuth getAuth() {
            return this.auth;
        }

    }

    public static class ListServiceEndpointsResponseBodyItems extends TeaModel {
        /**
         * <p>The certificate identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-xxx</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The endpoint component. Valid values: <code>ELEMENT</code>, <code>MATRIX</code>, <code>WORKER</code>, and <code>TUNNEL</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>MATRIX</p>
         */
        @NameInMap("Component")
        public String component;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>matrix.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The domain name type. Valid values: <code>BUILTIN</code> and <code>CUSTOM</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The configuration information of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("EndpointConfig")
        public ListServiceEndpointsResponseBodyItemsEndpointConfig endpointConfig;

        /**
         * <p>Endpoint ID</p>
         * 
         * <strong>example:</strong>
         * <p>ep-xxx</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The service name. Exact match is used.</p>
         * 
         * <strong>example:</strong>
         * <p>matrix-service</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agentteams-cn-xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The network type. Valid values: <code>INTRANET</code> and <code>INTERNET</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>CONFIGURED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListServiceEndpointsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListServiceEndpointsResponseBodyItems self = new ListServiceEndpointsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListServiceEndpointsResponseBodyItems setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public ListServiceEndpointsResponseBodyItems setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public ListServiceEndpointsResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceEndpointsResponseBodyItems setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListServiceEndpointsResponseBodyItems setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public ListServiceEndpointsResponseBodyItems setEndpointConfig(ListServiceEndpointsResponseBodyItemsEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }
        public ListServiceEndpointsResponseBodyItemsEndpointConfig getEndpointConfig() {
            return this.endpointConfig;
        }

        public ListServiceEndpointsResponseBodyItems setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListServiceEndpointsResponseBodyItems setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListServiceEndpointsResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListServiceEndpointsResponseBodyItems setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListServiceEndpointsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServiceEndpointsResponseBodyItems setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}

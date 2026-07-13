// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListServiceEndpointsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Items")
    public java.util.List<ListServiceEndpointsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
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
        @NameInMap("ApiKey")
        public String apiKey;

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
         * <strong>example:</strong>
         * <p>cert-xxx</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <strong>example:</strong>
         * <p>MATRIX</p>
         */
        @NameInMap("Component")
        public String component;

        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>matrix.example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("EndpointConfig")
        public ListServiceEndpointsResponseBodyItemsEndpointConfig endpointConfig;

        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <strong>example:</strong>
         * <p>matrix-service</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>CONFIGURED</p>
         */
        @NameInMap("Status")
        public String status;

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

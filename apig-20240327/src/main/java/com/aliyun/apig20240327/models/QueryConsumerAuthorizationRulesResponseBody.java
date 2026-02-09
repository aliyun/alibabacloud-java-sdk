// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class QueryConsumerAuthorizationRulesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("data")
    public QueryConsumerAuthorizationRulesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A60EE5CA-1294-532A-9775-8D2FD1C6EFBF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryConsumerAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerAuthorizationRulesResponseBody self = new QueryConsumerAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryConsumerAuthorizationRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryConsumerAuthorizationRulesResponseBody setData(QueryConsumerAuthorizationRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryConsumerAuthorizationRulesResponseBodyData getData() {
        return this.data;
    }

    public QueryConsumerAuthorizationRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryConsumerAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo extends TeaModel {
        /**
         * <p>The operation information.</p>
         */
        @NameInMap("operationInfo")
        public HttpApiOperationInfo operationInfo;

        /**
         * <p>The route.</p>
         */
        @NameInMap("route")
        public HttpRoute route;

        public static QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo self = new QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo();
            return TeaModel.build(map, self);
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo setOperationInfo(HttpApiOperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }
        public HttpApiOperationInfo getOperationInfo() {
            return this.operationInfo;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo setRoute(HttpRoute route) {
            this.route = route;
            return this;
        }
        public HttpRoute getRoute() {
            return this.route;
        }

    }

    public static class QueryConsumerAuthorizationRulesResponseBodyDataItems extends TeaModel {
        /**
         * <p>The API details.</p>
         */
        @NameInMap("apiInfo")
        public HttpApiApiInfo apiInfo;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>car-csgeka5lhtggrjcprok0</p>
         */
        @NameInMap("consumerAuthorizationRuleId")
        public String consumerAuthorizationRuleId;

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-csheiftlhtgmp0j0hp4g</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The consumer information.</p>
         */
        @NameInMap("consumerInfo")
        public ConsumerInfo consumerInfo;

        /**
         * <p>The creation timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The deployment status of the API in the current environment.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        /**
         * <p>The environment information.</p>
         */
        @NameInMap("environmentInfo")
        public EnvironmentInfo environmentInfo;

        /**
         * <p>The expiry mode. Valid values: LongTerm and ShortTerm.</p>
         * 
         * <strong>example:</strong>
         * <p>ShortTerm</p>
         */
        @NameInMap("expireMode")
        public String expireMode;

        /**
         * <p>The rule status.</p>
         * 
         * <strong>example:</strong>
         * <p>InEffect</p>
         */
        @NameInMap("expireStatus")
        public String expireStatus;

        /**
         * <p>The time when the rule expires.</p>
         * 
         * <strong>example:</strong>
         * <p>172086834548</p>
         */
        @NameInMap("expireTimestamp")
        public Long expireTimestamp;

        /**
         * <p>The instance information.</p>
         */
        @NameInMap("gatewayInfo")
        public GatewayInfo gatewayInfo;

        /**
         * <p>The resource IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>2351944</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The resource information.</p>
         */
        @NameInMap("resourceInfo")
        public QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo resourceInfo;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpApiRoute</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The update timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static QueryConsumerAuthorizationRulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerAuthorizationRulesResponseBodyDataItems self = new QueryConsumerAuthorizationRulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setApiInfo(HttpApiApiInfo apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public HttpApiApiInfo getApiInfo() {
            return this.apiInfo;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setConsumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }
        public String getConsumerAuthorizationRuleId() {
            return this.consumerAuthorizationRuleId;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setConsumerInfo(ConsumerInfo consumerInfo) {
            this.consumerInfo = consumerInfo;
            return this;
        }
        public ConsumerInfo getConsumerInfo() {
            return this.consumerInfo;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setEnvironmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setExpireMode(String expireMode) {
            this.expireMode = expireMode;
            return this;
        }
        public String getExpireMode() {
            return this.expireMode;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setExpireStatus(String expireStatus) {
            this.expireStatus = expireStatus;
            return this;
        }
        public String getExpireStatus() {
            return this.expireStatus;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setGatewayInfo(GatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setResourceInfo(QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo resourceInfo) {
            this.resourceInfo = resourceInfo;
            return this;
        }
        public QueryConsumerAuthorizationRulesResponseBodyDataItemsResourceInfo getResourceInfo() {
            return this.resourceInfo;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryConsumerAuthorizationRulesResponseBodyDataItems setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class QueryConsumerAuthorizationRulesResponseBodyData extends TeaModel {
        /**
         * <p>The rules.</p>
         */
        @NameInMap("items")
        public java.util.List<QueryConsumerAuthorizationRulesResponseBodyDataItems> items;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("totalSize")
        public String totalSize;

        public static QueryConsumerAuthorizationRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryConsumerAuthorizationRulesResponseBodyData self = new QueryConsumerAuthorizationRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryConsumerAuthorizationRulesResponseBodyData setItems(java.util.List<QueryConsumerAuthorizationRulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryConsumerAuthorizationRulesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public QueryConsumerAuthorizationRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public QueryConsumerAuthorizationRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryConsumerAuthorizationRulesResponseBodyData setTotalSize(String totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public String getTotalSize() {
            return this.totalSize;
        }

    }

}

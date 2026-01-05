// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumerAuthorizationRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListConsumerAuthorizationRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>294382D9-EE60-5735-A4CD-F2AC2840423D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListConsumerAuthorizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerAuthorizationRulesResponseBody self = new ListConsumerAuthorizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumerAuthorizationRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumerAuthorizationRulesResponseBody setData(ListConsumerAuthorizationRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConsumerAuthorizationRulesResponseBodyData getData() {
        return this.data;
    }

    public ListConsumerAuthorizationRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumerAuthorizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConsumerAuthorizationRulesResponseBodyDataItems extends TeaModel {
        @NameInMap("apiInfo")
        public HttpApiApiInfo apiInfo;

        /**
         * <strong>example:</strong>
         * <p>car-csgeka5lhtggrjcprok0</p>
         */
        @NameInMap("consumerAuthorizationRuleId")
        public String consumerAuthorizationRuleId;

        /**
         * <strong>example:</strong>
         * <p>cs-csheiftlhtgmp0j0hp4g</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("deployStatus")
        public String deployStatus;

        @NameInMap("environmentInfo")
        public EnvironmentInfo environmentInfo;

        /**
         * <strong>example:</strong>
         * <p>ShortTerm</p>
         */
        @NameInMap("expireMode")
        public String expireMode;

        /**
         * <strong>example:</strong>
         * <p>InEffect</p>
         */
        @NameInMap("expireStatus")
        public String expireStatus;

        /**
         * <strong>example:</strong>
         * <p>172086834548</p>
         */
        @NameInMap("expireTimestamp")
        public Long expireTimestamp;

        @NameInMap("gatewayInfo")
        public GatewayInfo gatewayInfo;

        /**
         * <strong>example:</strong>
         * <p>2351944</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>HttpApiRoute</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>1721116090326</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static ListConsumerAuthorizationRulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerAuthorizationRulesResponseBodyDataItems self = new ListConsumerAuthorizationRulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setApiInfo(HttpApiApiInfo apiInfo) {
            this.apiInfo = apiInfo;
            return this;
        }
        public HttpApiApiInfo getApiInfo() {
            return this.apiInfo;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setConsumerAuthorizationRuleId(String consumerAuthorizationRuleId) {
            this.consumerAuthorizationRuleId = consumerAuthorizationRuleId;
            return this;
        }
        public String getConsumerAuthorizationRuleId() {
            return this.consumerAuthorizationRuleId;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setEnvironmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setExpireMode(String expireMode) {
            this.expireMode = expireMode;
            return this;
        }
        public String getExpireMode() {
            return this.expireMode;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setExpireStatus(String expireStatus) {
            this.expireStatus = expireStatus;
            return this;
        }
        public String getExpireStatus() {
            return this.expireStatus;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setGatewayInfo(GatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListConsumerAuthorizationRulesResponseBodyDataItems setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

    public static class ListConsumerAuthorizationRulesResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListConsumerAuthorizationRulesResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("totalSize")
        public String totalSize;

        public static ListConsumerAuthorizationRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerAuthorizationRulesResponseBodyData self = new ListConsumerAuthorizationRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumerAuthorizationRulesResponseBodyData setItems(java.util.List<ListConsumerAuthorizationRulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListConsumerAuthorizationRulesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListConsumerAuthorizationRulesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConsumerAuthorizationRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConsumerAuthorizationRulesResponseBodyData setTotalSize(String totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public String getTotalSize() {
            return this.totalSize;
        }

    }

}

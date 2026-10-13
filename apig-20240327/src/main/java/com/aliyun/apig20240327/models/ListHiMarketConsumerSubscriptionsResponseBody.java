// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListHiMarketConsumerSubscriptionsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListHiMarketConsumerSubscriptionsResponseBodyData data;

    /**
     * <p>The maximum number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor for the next page. An empty value indicates that the last page is reached.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListHiMarketConsumerSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHiMarketConsumerSubscriptionsResponseBody self = new ListHiMarketConsumerSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHiMarketConsumerSubscriptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHiMarketConsumerSubscriptionsResponseBody setData(ListHiMarketConsumerSubscriptionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHiMarketConsumerSubscriptionsResponseBodyData getData() {
        return this.data;
    }

    public ListHiMarketConsumerSubscriptionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHiMarketConsumerSubscriptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHiMarketConsumerSubscriptionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHiMarketConsumerSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHiMarketConsumerSubscriptionsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The ID of the consumer to which the subscription belongs. This is the same identifier as the consumerId path parameter of this API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxxxxxxxxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The name of the consumer to which the subscription belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("consumerName")
        public String consumerName;

        /**
         * <p>The ID of the subscribed API product, which is the primary ID of the API product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        @NameInMap("productId")
        public String productId;

        /**
         * <p>The name of the subscribed API product.</p>
         * 
         * <strong>example:</strong>
         * <p>model-service</p>
         */
        @NameInMap("productName")
        public String productName;

        /**
         * <p>The type of the subscribed API product. This response parameter does not declare enums. The related ListProductSubscriptions API operation declares the following valid values for the parameter with the same name: REST_API, HTTP_API, MCP_SERVER, AGENT_API, and MODEL_API.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_SERVER</p>
         */
        @NameInMap("productType")
        public String productType;

        /**
         * <p>The subscription status. Valid values: PENDING and APPROVED. This set of valid values is declared in the enums of the status request parameter in this API operation, and this response parameter does not declare enums.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The subscription ID. You can use this ID to unsubscribe from the product by calling UnsubscribeHiMarketProduct or approve the subscription by calling ApproveProductSubscription. Both operations locate the subscription by using the /himarket/v1/consumers/{consumerId}/subscriptions/{subscriptionId} path.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-xxxxxxxx</p>
         */
        @NameInMap("subscriptionId")
        public String subscriptionId;

        public static ListHiMarketConsumerSubscriptionsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListHiMarketConsumerSubscriptionsResponseBodyDataContent self = new ListHiMarketConsumerSubscriptionsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyDataContent setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyDataContent setConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public String getConsumerName() {
            return this.consumerName;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyDataContent setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyDataContent setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyDataContent setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

    }

    public static class ListHiMarketConsumerSubscriptionsResponseBodyData extends TeaModel {
        /**
         * <p>The list of API product subscriptions for the consumer. The list element is named subscription, and each element represents an API product subscription record.</p>
         */
        @NameInMap("content")
        public java.util.List<ListHiMarketConsumerSubscriptionsResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListHiMarketConsumerSubscriptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHiMarketConsumerSubscriptionsResponseBodyData self = new ListHiMarketConsumerSubscriptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyData setContent(java.util.List<ListHiMarketConsumerSubscriptionsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListHiMarketConsumerSubscriptionsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHiMarketConsumerSubscriptionsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

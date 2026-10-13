// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListProductSubscriptionsResponseBody extends TeaModel {
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
    public ListProductSubscriptionsResponseBodyData data;

    /**
     * <p>The response message.</p>
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
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProductSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductSubscriptionsResponseBody self = new ListProductSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductSubscriptionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductSubscriptionsResponseBody setData(ListProductSubscriptionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductSubscriptionsResponseBodyData getData() {
        return this.data;
    }

    public ListProductSubscriptionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProductSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductSubscriptionsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The ID of the consumer to which the subscription belongs. This ID and the consumerName returned in the same element refer to the same consumer.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxxxxxxxxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The name of the consumer to which the subscription belongs. This corresponds to the keyword search for the consumerName request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("consumerName")
        public String consumerName;

        /**
         * <p>The ID of the subscribed API product. This is the primary ID of the API product resource and is the same as the productId path parameter in this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        @NameInMap("productId")
        public String productId;

        /**
         * <p>The name of the subscribed API product. This is the Name property of the API product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>model-service</p>
         */
        @NameInMap("productName")
        public String productName;

        /**
         * <p>The type of the subscribed API product. Valid values: REST_API, HTTP_API, MCP_SERVER, AGENT_API, and MODEL_API.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_SERVER</p>
         */
        @NameInMap("productType")
        public String productType;

        /**
         * <p>The subscription status. Valid values: PENDING and APPROVED. (These values are defined in the enumeration for the status request parameter. This response parameter is not annotated with @enums.)</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The subscription ID, which identifies an API product subscription record. You can use this ID to cancel the subscription by calling UnsubscribeHiMarketProduct or approve the subscription by calling ApproveProductSubscription. Both operations locate the record by using the /himarket/v1/consumers/{consumerId}/subscriptions/{subscriptionId} path.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-xxxxxxxx</p>
         */
        @NameInMap("subscriptionId")
        public String subscriptionId;

        public static ListProductSubscriptionsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListProductSubscriptionsResponseBodyDataContent self = new ListProductSubscriptionsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListProductSubscriptionsResponseBodyDataContent setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public ListProductSubscriptionsResponseBodyDataContent setConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public String getConsumerName() {
            return this.consumerName;
        }

        public ListProductSubscriptionsResponseBodyDataContent setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductSubscriptionsResponseBodyDataContent setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListProductSubscriptionsResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListProductSubscriptionsResponseBodyDataContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProductSubscriptionsResponseBodyDataContent setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

    }

    public static class ListProductSubscriptionsResponseBodyData extends TeaModel {
        /**
         * <p>The subscription list of the API product. The list element is named subscription, and each element represents an API product subscription record.</p>
         */
        @NameInMap("content")
        public java.util.List<ListProductSubscriptionsResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListProductSubscriptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductSubscriptionsResponseBodyData self = new ListProductSubscriptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductSubscriptionsResponseBodyData setContent(java.util.List<ListProductSubscriptionsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListProductSubscriptionsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListProductSubscriptionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProductSubscriptionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProductSubscriptionsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

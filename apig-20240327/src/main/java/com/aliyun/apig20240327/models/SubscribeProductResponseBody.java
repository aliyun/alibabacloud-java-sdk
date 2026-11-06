// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SubscribeProductResponseBody extends TeaModel {
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
    public SubscribeProductResponseBodyData data;

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

    public static SubscribeProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubscribeProductResponseBody self = new SubscribeProductResponseBody();
        return TeaModel.build(map, self);
    }

    public SubscribeProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubscribeProductResponseBody setData(SubscribeProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubscribeProductResponseBodyData getData() {
        return this.data;
    }

    public SubscribeProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubscribeProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubscribeProductResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the consumer to which the subscription belongs. This is the same as the consumerId path parameter in the request and refers to the same consumer as the consumerName returned at the same level.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxxxxxxxxxxx</p>
         */
        @NameInMap("consumerId")
        public String consumerId;

        /**
         * <p>The name of the consumer to which the subscription belongs. This consumer is the same as the consumerId returned at the same level.</p>
         * 
         * <strong>example:</strong>
         * <p>consumer-1</p>
         */
        @NameInMap("consumerName")
        public String consumerName;

        /**
         * <p>The ID of the subscribed API product. This is the primary ID of the Product resource and is the same as the productId specified in the request body.</p>
         * 
         * <strong>example:</strong>
         * <p>product-xxxxxxxx</p>
         */
        @NameInMap("productId")
        public String productId;

        /**
         * <p>The name of the subscribed API product. This is the Name property of the Product resource.</p>
         * 
         * <strong>example:</strong>
         * <p>model-service</p>
         */
        @NameInMap("productName")
        public String productName;

        /**
         * <p>The type of the subscribed API product. The value set is not declared in this operation definition. The response parameter with the same name in the related ListProductSubscriptions operation is annotated with @enums. Valid values: REST_API, HTTP_API, MCP_SERVER, AGENT_API, and MODEL_API.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP_SERVER</p>
         */
        @NameInMap("productType")
        public String productType;

        /**
         * <p>The subscription status. Valid values: PENDING and APPROVED. The value set is declared in the enum of the status request parameter of the related ListProductSubscriptions operation. This response parameter is not annotated with @enums.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The subscription ID, which identifies the API product subscription record corresponding to this subscription. You can use this ID to call UnsubscribeHiMarketProduct to cancel the subscription or call ApproveProductSubscription to approve the subscription. Both operations identify the record by using /himarket/v1/consumers/{consumerId}/subscriptions/{subscriptionId}.</p>
         * 
         * <strong>example:</strong>
         * <p>sub-xxxxxxxx</p>
         */
        @NameInMap("subscriptionId")
        public String subscriptionId;

        public static SubscribeProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubscribeProductResponseBodyData self = new SubscribeProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubscribeProductResponseBodyData setConsumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }
        public String getConsumerId() {
            return this.consumerId;
        }

        public SubscribeProductResponseBodyData setConsumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public String getConsumerName() {
            return this.consumerName;
        }

        public SubscribeProductResponseBodyData setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public SubscribeProductResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public SubscribeProductResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public SubscribeProductResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubscribeProductResponseBodyData setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

    }

}

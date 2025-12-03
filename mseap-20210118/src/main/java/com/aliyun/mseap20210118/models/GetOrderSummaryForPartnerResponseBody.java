// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GetOrderSummaryForPartnerResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetOrderSummaryForPartnerResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>56B009EB-AAA5-52C9-B05F-AF425E3885E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOrderSummaryForPartnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOrderSummaryForPartnerResponseBody self = new GetOrderSummaryForPartnerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOrderSummaryForPartnerResponseBody setData(GetOrderSummaryForPartnerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOrderSummaryForPartnerResponseBodyData getData() {
        return this.data;
    }

    public GetOrderSummaryForPartnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOrderSummaryForPartnerResponseBodyDataOrderLines extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ob4twsebrj1734</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>11350044</p>
         */
        @NameInMap("OrderLineId")
        public String orderLineId;

        /**
         * <strong>example:</strong>
         * <p>UPGRADE</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        public static GetOrderSummaryForPartnerResponseBodyDataOrderLines build(java.util.Map<String, ?> map) throws Exception {
            GetOrderSummaryForPartnerResponseBodyDataOrderLines self = new GetOrderSummaryForPartnerResponseBodyDataOrderLines();
            return TeaModel.build(map, self);
        }

        public GetOrderSummaryForPartnerResponseBodyDataOrderLines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetOrderSummaryForPartnerResponseBodyDataOrderLines setOrderLineId(String orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }
        public String getOrderLineId() {
            return this.orderLineId;
        }

        public GetOrderSummaryForPartnerResponseBodyDataOrderLines setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

    public static class GetOrderSummaryForPartnerResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UShMru9tcC0RHD/04O0x1OrVkEJOq804ccSkgXSuZH0/42FlhtzyCKa6FofPs8n0</p>
         */
        @NameInMap("EncryptedBuyerId")
        public String encryptedBuyerId;

        /**
         * <strong>example:</strong>
         * <p>UShMru9tcC0RHD/04O0x1OrVkEJOq804ccSkgXSuZH0/42FlhtzyCKa6FofPs8n0</p>
         */
        @NameInMap("EncryptedPayerId")
        public String encryptedPayerId;

        /**
         * <strong>example:</strong>
         * <p>UShMru9tcC0RHD/04O0x1OrVkEJOq804ccSkgXSuZH0/42FlhtzyCKa6FofPs8n0</p>
         */
        @NameInMap("EncryptedUserId")
        public String encryptedUserId;

        /**
         * <strong>example:</strong>
         * <p>11350044</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OrderLines")
        public java.util.List<GetOrderSummaryForPartnerResponseBodyDataOrderLines> orderLines;

        public static GetOrderSummaryForPartnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOrderSummaryForPartnerResponseBodyData self = new GetOrderSummaryForPartnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOrderSummaryForPartnerResponseBodyData setEncryptedBuyerId(String encryptedBuyerId) {
            this.encryptedBuyerId = encryptedBuyerId;
            return this;
        }
        public String getEncryptedBuyerId() {
            return this.encryptedBuyerId;
        }

        public GetOrderSummaryForPartnerResponseBodyData setEncryptedPayerId(String encryptedPayerId) {
            this.encryptedPayerId = encryptedPayerId;
            return this;
        }
        public String getEncryptedPayerId() {
            return this.encryptedPayerId;
        }

        public GetOrderSummaryForPartnerResponseBodyData setEncryptedUserId(String encryptedUserId) {
            this.encryptedUserId = encryptedUserId;
            return this;
        }
        public String getEncryptedUserId() {
            return this.encryptedUserId;
        }

        public GetOrderSummaryForPartnerResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetOrderSummaryForPartnerResponseBodyData setOrderLines(java.util.List<GetOrderSummaryForPartnerResponseBodyDataOrderLines> orderLines) {
            this.orderLines = orderLines;
            return this;
        }
        public java.util.List<GetOrderSummaryForPartnerResponseBodyDataOrderLines> getOrderLines() {
            return this.orderLines;
        }

    }

}

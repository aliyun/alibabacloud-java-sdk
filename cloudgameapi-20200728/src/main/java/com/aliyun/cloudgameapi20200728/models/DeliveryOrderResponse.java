// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeliveryOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DeliveryOrderResponseData data;

    public static DeliveryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeliveryOrderResponse self = new DeliveryOrderResponse();
        return TeaModel.build(map, self);
    }

    public DeliveryOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeliveryOrderResponse setData(DeliveryOrderResponseData data) {
        this.data = data;
        return this;
    }
    public DeliveryOrderResponseData getData() {
        return this.data;
    }

    public static class DeliveryOrderResponseData extends TeaModel {
        @NameInMap("DeliveryStatus")
        @Validation(required = true)
        public String deliveryStatus;

        public static DeliveryOrderResponseData build(java.util.Map<String, ?> map) throws Exception {
            DeliveryOrderResponseData self = new DeliveryOrderResponseData();
            return TeaModel.build(map, self);
        }

        public DeliveryOrderResponseData setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

    }

}

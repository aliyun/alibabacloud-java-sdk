// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class DeliveryOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeliveryOrderResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeliveryOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeliveryOrderResponseBody self = new DeliveryOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeliveryOrderResponseBody setData(DeliveryOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeliveryOrderResponseBodyData getData() {
        return this.data;
    }

    public DeliveryOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeliveryOrderResponseBodyData extends TeaModel {
        @NameInMap("DeliveryStatus")
        public String deliveryStatus;

        public static DeliveryOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeliveryOrderResponseBodyData self = new DeliveryOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeliveryOrderResponseBodyData setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

    }

}

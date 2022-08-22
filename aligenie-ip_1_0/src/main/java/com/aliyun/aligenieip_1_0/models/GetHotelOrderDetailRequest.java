// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelOrderDetailRequest extends TeaModel {
    @NameInMap("Payload")
    public GetHotelOrderDetailRequestPayload payload;

    public static GetHotelOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelOrderDetailRequest self = new GetHotelOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelOrderDetailRequest setPayload(GetHotelOrderDetailRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public GetHotelOrderDetailRequestPayload getPayload() {
        return this.payload;
    }

    public static class GetHotelOrderDetailRequestPayload extends TeaModel {
        @NameInMap("OrderNo")
        public String orderNo;

        public static GetHotelOrderDetailRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            GetHotelOrderDetailRequestPayload self = new GetHotelOrderDetailRequestPayload();
            return TeaModel.build(map, self);
        }

        public GetHotelOrderDetailRequestPayload setOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }
        public String getOrderNo() {
            return this.orderNo;
        }

    }

}

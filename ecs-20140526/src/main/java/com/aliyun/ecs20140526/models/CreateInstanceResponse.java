// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("TradePrice")
    @Validation(required = true)
    public Float tradePrice;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static CreateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponse self = new CreateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceResponse setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
        return this;
    }
    public Float getTradePrice() {
        return this.tradePrice;
    }

    public CreateInstanceResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}

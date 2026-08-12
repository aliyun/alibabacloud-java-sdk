// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelCancelOrderRequest extends TeaModel {
    /**
     * <p>The distributor account ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AccountNo")
    public Long accountNo;

    /**
     * <p>The sales order number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SO202606290001</p>
     */
    @NameInMap("OrderNo")
    public String orderNo;

    /**
     * <p>TraceId</p>
     * 
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelCancelOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelCancelOrderRequest self = new GlobalHotelCancelOrderRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelCancelOrderRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelCancelOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public GlobalHotelCancelOrderRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}

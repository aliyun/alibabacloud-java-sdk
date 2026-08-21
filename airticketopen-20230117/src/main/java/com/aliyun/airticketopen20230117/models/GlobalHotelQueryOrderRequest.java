// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelQueryOrderRequest extends TeaModel {
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
     * <p>The external order number. At least one of ExternalOrderNo and OrderNo is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EXT_ORDER_001</p>
     */
    @NameInMap("ExternalOrderNo")
    public String externalOrderNo;

    /**
     * <p>The sales order number. At least one of OrderNo and ExternalOrderNo is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SO202606290001</p>
     */
    @NameInMap("OrderNo")
    public String orderNo;

    /**
     * <p>TracerId</p>
     * 
     * <strong>example:</strong>
     * <p>TracerId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelQueryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelQueryOrderRequest self = new GlobalHotelQueryOrderRequest();
        return TeaModel.build(map, self);
    }

    public GlobalHotelQueryOrderRequest setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public Long getAccountNo() {
        return this.accountNo;
    }

    public GlobalHotelQueryOrderRequest setExternalOrderNo(String externalOrderNo) {
        this.externalOrderNo = externalOrderNo;
        return this;
    }
    public String getExternalOrderNo() {
        return this.externalOrderNo;
    }

    public GlobalHotelQueryOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public GlobalHotelQueryOrderRequest setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

}

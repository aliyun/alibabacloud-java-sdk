// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsInformationData extends TeaModel {
    /**
     * <p>The logistics status. A value of 2 indicates that the order is shipped and awaits the buyer\&quot;s confirmation of receipt.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("logisticsStatus")
    public String logisticsStatus;

    /**
     * <p>The time when the information was last updated, in yyyy-MM-dd HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>1713407100321</p>
     */
    @NameInMap("modifiedTime")
    public String modifiedTime;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6696070566****8593</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <p>The ID of the order line.</p>
     * 
     * <strong>example:</strong>
     * <p>6692****5458</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    /**
     * <p>The external ID of the purchase order, provided upon creation.</p>
     * 
     * <strong>example:</strong>
     * <p>233111</p>
     */
    @NameInMap("outerPurchaseOrderId")
    public String outerPurchaseOrderId;

    /**
     * <p>The ID of the purchaser.</p>
     * 
     * <strong>example:</strong>
     * <p>PID22000009</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <p>The code of the logistics company.</p>
     * 
     * <strong>example:</strong>
     * <p>SF</p>
     */
    @NameInMap("trackingCompanyCode")
    public String trackingCompanyCode;

    /**
     * <p>The name of the logistics company.</p>
     * 
     * <strong>example:</strong>
     * <p>顺丰快递</p>
     */
    @NameInMap("trackingCompanyName")
    public String trackingCompanyName;

    /**
     * <p>The tracking number.</p>
     * 
     * <strong>example:</strong>
     * <p>SF198913131</p>
     */
    @NameInMap("trackingNumber")
    public String trackingNumber;

    public static LogisticsInformationData build(java.util.Map<String, ?> map) throws Exception {
        LogisticsInformationData self = new LogisticsInformationData();
        return TeaModel.build(map, self);
    }

    public LogisticsInformationData setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
        return this;
    }
    public String getLogisticsStatus() {
        return this.logisticsStatus;
    }

    public LogisticsInformationData setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public LogisticsInformationData setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public LogisticsInformationData setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
        return this;
    }
    public String getOrderLineId() {
        return this.orderLineId;
    }

    public LogisticsInformationData setOuterPurchaseOrderId(String outerPurchaseOrderId) {
        this.outerPurchaseOrderId = outerPurchaseOrderId;
        return this;
    }
    public String getOuterPurchaseOrderId() {
        return this.outerPurchaseOrderId;
    }

    public LogisticsInformationData setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public LogisticsInformationData setTrackingCompanyCode(String trackingCompanyCode) {
        this.trackingCompanyCode = trackingCompanyCode;
        return this;
    }
    public String getTrackingCompanyCode() {
        return this.trackingCompanyCode;
    }

    public LogisticsInformationData setTrackingCompanyName(String trackingCompanyName) {
        this.trackingCompanyName = trackingCompanyName;
        return this;
    }
    public String getTrackingCompanyName() {
        return this.trackingCompanyName;
    }

    public LogisticsInformationData setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }
    public String getTrackingNumber() {
        return this.trackingNumber;
    }

}

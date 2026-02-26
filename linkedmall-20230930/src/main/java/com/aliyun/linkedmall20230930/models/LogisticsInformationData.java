// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class LogisticsInformationData extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("logisticsStatus")
    public String logisticsStatus;

    /**
     * <strong>example:</strong>
     * <p>1713407100321</p>
     */
    @NameInMap("modifiedTime")
    public String modifiedTime;

    /**
     * <strong>example:</strong>
     * <p>6696070566****8593</p>
     */
    @NameInMap("orderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>6692****5458</p>
     */
    @NameInMap("orderLineId")
    public String orderLineId;

    /**
     * <strong>example:</strong>
     * <p>233111</p>
     */
    @NameInMap("outerPurchaseOrderId")
    public String outerPurchaseOrderId;

    /**
     * <strong>example:</strong>
     * <p>PID22000009</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <strong>example:</strong>
     * <p>SF</p>
     */
    @NameInMap("trackingCompanyCode")
    public String trackingCompanyCode;

    @NameInMap("trackingCompanyName")
    public String trackingCompanyName;

    /**
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

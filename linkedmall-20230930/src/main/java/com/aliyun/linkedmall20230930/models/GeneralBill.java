// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GeneralBill extends TeaModel {
    /**
     * <p>The bill ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bill_demo_001</p>
     */
    @NameInMap("billId")
    public String billId;

    /**
     * <p>The billing cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08</p>
     */
    @NameInMap("billPeriod")
    public String billPeriod;

    /**
     * <p>The details download URL.</p>
     */
    @NameInMap("downloadUrl")
    public java.util.List<String> downloadUrl;

    /**
     * <p>The end time of the billing cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The bill creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The bill modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The shop ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21000017</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <p>The shop name.</p>
     * 
     * <strong>example:</strong>
     * <p>Children\&quot;s distribution store</p>
     */
    @NameInMap("shopName")
    public String shopName;

    /**
     * <p>The start time of the billing cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 00:00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>The bill amount.</p>
     */
    @NameInMap("totalAmount")
    public Money totalAmount;

    public static GeneralBill build(java.util.Map<String, ?> map) throws Exception {
        GeneralBill self = new GeneralBill();
        return TeaModel.build(map, self);
    }

    public GeneralBill setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public GeneralBill setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
        return this;
    }
    public String getBillPeriod() {
        return this.billPeriod;
    }

    public GeneralBill setDownloadUrl(java.util.List<String> downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public java.util.List<String> getDownloadUrl() {
        return this.downloadUrl;
    }

    public GeneralBill setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GeneralBill setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GeneralBill setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GeneralBill setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GeneralBill setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }
    public String getShopName() {
        return this.shopName;
    }

    public GeneralBill setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GeneralBill setTotalAmount(Money totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Money getTotalAmount() {
        return this.totalAmount;
    }

}

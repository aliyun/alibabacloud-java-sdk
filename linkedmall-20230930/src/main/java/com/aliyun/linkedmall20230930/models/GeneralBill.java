// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GeneralBill extends TeaModel {
    @NameInMap("billId")
    public String billId;

    @NameInMap("billPeriod")
    public String billPeriod;

    @NameInMap("downloadUrl")
    public java.util.List<String> downloadUrl;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("shopId")
    public String shopId;

    @NameInMap("shopName")
    public String shopName;

    @NameInMap("startTime")
    public String startTime;

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

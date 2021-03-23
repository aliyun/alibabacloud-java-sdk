// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ApplyInvoiceRequest extends TeaModel {
    @NameInMap("InvoiceAmount")
    public Long invoiceAmount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CustomerId")
    public Long customerId;

    @NameInMap("AddressId")
    public Long addressId;

    @NameInMap("InvoicingType")
    public Integer invoicingType;

    @NameInMap("ProcessWay")
    public Integer processWay;

    @NameInMap("ApplyUserNick")
    public String applyUserNick;

    @NameInMap("SelectedIds")
    public java.util.List<Long> selectedIds;

    @NameInMap("InvoiceByAmount")
    public Boolean invoiceByAmount;

    public static ApplyInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceRequest self = new ApplyInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceRequest setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
        return this;
    }
    public Long getInvoiceAmount() {
        return this.invoiceAmount;
    }

    public ApplyInvoiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ApplyInvoiceRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public ApplyInvoiceRequest setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }
    public Long getAddressId() {
        return this.addressId;
    }

    public ApplyInvoiceRequest setInvoicingType(Integer invoicingType) {
        this.invoicingType = invoicingType;
        return this;
    }
    public Integer getInvoicingType() {
        return this.invoicingType;
    }

    public ApplyInvoiceRequest setProcessWay(Integer processWay) {
        this.processWay = processWay;
        return this;
    }
    public Integer getProcessWay() {
        return this.processWay;
    }

    public ApplyInvoiceRequest setApplyUserNick(String applyUserNick) {
        this.applyUserNick = applyUserNick;
        return this;
    }
    public String getApplyUserNick() {
        return this.applyUserNick;
    }

    public ApplyInvoiceRequest setSelectedIds(java.util.List<Long> selectedIds) {
        this.selectedIds = selectedIds;
        return this;
    }
    public java.util.List<Long> getSelectedIds() {
        return this.selectedIds;
    }

    public ApplyInvoiceRequest setInvoiceByAmount(Boolean invoiceByAmount) {
        this.invoiceByAmount = invoiceByAmount;
        return this;
    }
    public Boolean getInvoiceByAmount() {
        return this.invoiceByAmount;
    }

}

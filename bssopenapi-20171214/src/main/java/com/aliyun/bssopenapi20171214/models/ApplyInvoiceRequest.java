// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ApplyInvoiceRequest extends TeaModel {
    /**
     * <p>The ID of the mailing address, which corresponds to the ID parameter returned by the QueryCustomerAddressList operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>237958367</p>
     */
    @NameInMap("AddressId")
    public Long addressId;

    /**
     * <p>The nickname of the applicant. The system does not verify this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ApplyUserNick")
    public String applyUserNick;

    /**
     * <p>The ID of the invoice title information, which corresponds to the ID parameter returned by the QueryInvoicingCustomerList operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>124132423</p>
     */
    @NameInMap("CustomerId")
    public Long customerId;

    /**
     * <p>The requested invoice amount, in cents.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("InvoiceAmount")
    public Long invoiceAmount;

    /**
     * <p>Specifies whether to issue the invoice based on a specified amount. If this parameter is set to true, the invoice is applied for based on the specified InvoiceAmount. Otherwise, the invoice is applied for based on the total amount of the selected objects to be invoiced.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InvoiceByAmount")
    public Boolean invoiceByAmount;

    /**
     * <p>The invoice type. Valid values:</p>
     * <ul>
     * <li>0: VAT special invoice.</li>
     * <li>1: VAT general invoice.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InvoicingType")
    public Integer invoicingType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The invoicing channel. Set this parameter to 1. Valid values:</p>
     * <ul>
     * <li>0: Processed by Alibaba Cloud.</li>
     * <li>1: Processed by the tax platform.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProcessWay")
    public Integer processWay;

    /**
     * <p>The list of IDs of the selected objects to be invoiced, which correspond to the ID parameters returned by the QueryEvaluateList operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>384752367</p>
     */
    @NameInMap("SelectedIds")
    public java.util.List<Long> selectedIds;

    /**
     * <p>The user remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UserRemark")
    public String userRemark;

    /**
     * <p>The email addresses for receiving the invoice. The maximum length of this field is 200 characters. Separate multiple email addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:aaa@aa.com">aaa@aa.com</a>,<a href="mailto:bbb@bb.com">bbb@bb.com</a></p>
     */
    @NameInMap("emails")
    public String emails;

    public static ApplyInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceRequest self = new ApplyInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceRequest setAddressId(Long addressId) {
        this.addressId = addressId;
        return this;
    }
    public Long getAddressId() {
        return this.addressId;
    }

    public ApplyInvoiceRequest setApplyUserNick(String applyUserNick) {
        this.applyUserNick = applyUserNick;
        return this;
    }
    public String getApplyUserNick() {
        return this.applyUserNick;
    }

    public ApplyInvoiceRequest setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }
    public Long getCustomerId() {
        return this.customerId;
    }

    public ApplyInvoiceRequest setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
        return this;
    }
    public Long getInvoiceAmount() {
        return this.invoiceAmount;
    }

    public ApplyInvoiceRequest setInvoiceByAmount(Boolean invoiceByAmount) {
        this.invoiceByAmount = invoiceByAmount;
        return this;
    }
    public Boolean getInvoiceByAmount() {
        return this.invoiceByAmount;
    }

    public ApplyInvoiceRequest setInvoicingType(Integer invoicingType) {
        this.invoicingType = invoicingType;
        return this;
    }
    public Integer getInvoicingType() {
        return this.invoicingType;
    }

    public ApplyInvoiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ApplyInvoiceRequest setProcessWay(Integer processWay) {
        this.processWay = processWay;
        return this;
    }
    public Integer getProcessWay() {
        return this.processWay;
    }

    public ApplyInvoiceRequest setSelectedIds(java.util.List<Long> selectedIds) {
        this.selectedIds = selectedIds;
        return this;
    }
    public java.util.List<Long> getSelectedIds() {
        return this.selectedIds;
    }

    public ApplyInvoiceRequest setUserRemark(String userRemark) {
        this.userRemark = userRemark;
        return this;
    }
    public String getUserRemark() {
        return this.userRemark;
    }

    public ApplyInvoiceRequest setEmails(String emails) {
        this.emails = emails;
        return this;
    }
    public String getEmails() {
        return this.emails;
    }

}

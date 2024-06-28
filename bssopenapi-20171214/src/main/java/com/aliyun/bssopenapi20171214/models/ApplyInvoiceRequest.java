// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ApplyInvoiceRequest extends TeaModel {
    /**
     * <p>The ID of the address to which the invoice is delivered. This parameter is required if the invoice is a paper invoice. Set the ID to the value of the AddressId parameter returned by calling the QueryCustomerAddressList operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>237958367</p>
     */
    @NameInMap("AddressId")
    public Long addressId;

    /**
     * <p>The nickname of the applicant. The system does not verify the nickname.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ApplyUserNick")
    public String applyUserNick;

    /**
     * <p>The ID of the customer. Set the ID to the value of the CustomerId parameter returned by calling the QueryInvoicingCustomerList operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>124132423</p>
     */
    @NameInMap("CustomerId")
    public Long customerId;

    /**
     * <p>The amount of the invoice. Unit: Cent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>124132</p>
     */
    @NameInMap("InvoiceAmount")
    public Long invoiceAmount;

    /**
     * <p>Specifies whether to invoice by amount. A value of true indicates that the user applies for the invoice based on the InvoiceAmount parameter. A value of false indicates that the user applies for the invoice based on the total amount of the invoicing items.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InvoiceByAmount")
    public Boolean invoiceByAmount;

    /**
     * <p>The type of the invoice. Valid values:</p>
     * <ul>
     * <li>0: paper invoice</li>
     * <li>1: electronic invoice</li>
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
     * <p>The channel that is used to process the invoice. A value of 0 indicates that the invoice is processed by Alibaba Cloud. A value of 1 indicates that the invoice is processed by the tax platform. Set the value to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProcessWay")
    public Integer processWay;

    /**
     * <p>The IDs of the selected invoicing items. Set the IDs to the IDs returned by calling the QueryEvaluateList operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>384752367</p>
     */
    @NameInMap("SelectedIds")
    public java.util.List<Long> selectedIds;

    /**
     * <p>The remarks made by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("UserRemark")
    public String userRemark;

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

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainTicketScanQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bill_date")
    public String billDate;

    @NameInMap("bill_id")
    public Long billId;

    @NameInMap("invoice_sub_task_id")
    public Long invoiceSubTaskId;

    @NameInMap("page_no")
    public Integer pageNo;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("serial_number")
    public String serialNumber;

    @NameInMap("ticket_no")
    public String ticketNo;

    public static TrainTicketScanQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainTicketScanQueryRequest self = new TrainTicketScanQueryRequest();
        return TeaModel.build(map, self);
    }

    public TrainTicketScanQueryRequest setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

    public TrainTicketScanQueryRequest setBillId(Long billId) {
        this.billId = billId;
        return this;
    }
    public Long getBillId() {
        return this.billId;
    }

    public TrainTicketScanQueryRequest setInvoiceSubTaskId(Long invoiceSubTaskId) {
        this.invoiceSubTaskId = invoiceSubTaskId;
        return this;
    }
    public Long getInvoiceSubTaskId() {
        return this.invoiceSubTaskId;
    }

    public TrainTicketScanQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public TrainTicketScanQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public TrainTicketScanQueryRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public TrainTicketScanQueryRequest setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
        return this;
    }
    public String getTicketNo() {
        return this.ticketNo;
    }

}

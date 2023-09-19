// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightItineraryScanQueryRequest extends TeaModel {
    @NameInMap("bill_date")
    public String billDate;

    @NameInMap("bill_id")
    public Long billId;

    @NameInMap("invoice_sub_task_id")
    public Long invoiceSubTaskId;

    @NameInMap("itinerary_num")
    public String itineraryNum;

    @NameInMap("page_no")
    public Integer pageNo;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("ticket_no")
    public String ticketNo;

    public static FlightItineraryScanQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightItineraryScanQueryRequest self = new FlightItineraryScanQueryRequest();
        return TeaModel.build(map, self);
    }

    public FlightItineraryScanQueryRequest setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

    public FlightItineraryScanQueryRequest setBillId(Long billId) {
        this.billId = billId;
        return this;
    }
    public Long getBillId() {
        return this.billId;
    }

    public FlightItineraryScanQueryRequest setInvoiceSubTaskId(Long invoiceSubTaskId) {
        this.invoiceSubTaskId = invoiceSubTaskId;
        return this;
    }
    public Long getInvoiceSubTaskId() {
        return this.invoiceSubTaskId;
    }

    public FlightItineraryScanQueryRequest setItineraryNum(String itineraryNum) {
        this.itineraryNum = itineraryNum;
        return this;
    }
    public String getItineraryNum() {
        return this.itineraryNum;
    }

    public FlightItineraryScanQueryRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public FlightItineraryScanQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public FlightItineraryScanQueryRequest setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
        return this;
    }
    public String getTicketNo() {
        return this.ticketNo;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightItineraryScanQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightItineraryScanQueryResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightItineraryScanQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightItineraryScanQueryResponseBody self = new FlightItineraryScanQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightItineraryScanQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightItineraryScanQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightItineraryScanQueryResponseBody setModule(FlightItineraryScanQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightItineraryScanQueryResponseBodyModule getModule() {
        return this.module;
    }

    public FlightItineraryScanQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightItineraryScanQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightItineraryScanQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightItineraryScanQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("bill_date")
        public String billDate;

        @NameInMap("build")
        public String build;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("department")
        public String department;

        @NameInMap("fuel_surcharge")
        public String fuelSurcharge;

        @NameInMap("insurance")
        public String insurance;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("itinerary_num")
        public String itineraryNum;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("oss_url")
        public String ossUrl;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("project")
        public String project;

        @NameInMap("tax_amount")
        public String taxAmount;

        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_price")
        public String ticketPrice;

        @NameInMap("total_price")
        public String totalPrice;

        public static FlightItineraryScanQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            FlightItineraryScanQueryResponseBodyModuleItems self = new FlightItineraryScanQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setBillDate(String billDate) {
            this.billDate = billDate;
            return this;
        }
        public String getBillDate() {
            return this.billDate;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setBuild(String build) {
            this.build = build;
            return this;
        }
        public String getBuild() {
            return this.build;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setFuelSurcharge(String fuelSurcharge) {
            this.fuelSurcharge = fuelSurcharge;
            return this;
        }
        public String getFuelSurcharge() {
            return this.fuelSurcharge;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setInsurance(String insurance) {
            this.insurance = insurance;
            return this;
        }
        public String getInsurance() {
            return this.insurance;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setItineraryNum(String itineraryNum) {
            this.itineraryNum = itineraryNum;
            return this;
        }
        public String getItineraryNum() {
            return this.itineraryNum;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setTicketPrice(String ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public String getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setTotalPrice(String totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public String getTotalPrice() {
            return this.totalPrice;
        }

    }

    public static class FlightItineraryScanQueryResponseBodyModule extends TeaModel {
        @NameInMap("items")
        public java.util.List<FlightItineraryScanQueryResponseBodyModuleItems> items;

        @NameInMap("page_no")
        public Integer pageNo;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_page")
        public Integer totalPage;

        @NameInMap("total_size")
        public Integer totalSize;

        public static FlightItineraryScanQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightItineraryScanQueryResponseBodyModule self = new FlightItineraryScanQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightItineraryScanQueryResponseBodyModule setItems(java.util.List<FlightItineraryScanQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FlightItineraryScanQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public FlightItineraryScanQueryResponseBodyModule setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public FlightItineraryScanQueryResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public FlightItineraryScanQueryResponseBodyModule setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public FlightItineraryScanQueryResponseBodyModule setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}

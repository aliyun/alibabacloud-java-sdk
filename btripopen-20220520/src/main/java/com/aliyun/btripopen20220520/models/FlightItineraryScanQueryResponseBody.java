// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightItineraryScanQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightItineraryScanQueryResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
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

    public static class FlightItineraryScanQueryResponseBodyModuleItemsFlights extends TeaModel {
        /**
         * <p>航班至</p>
         */
        @NameInMap("arrival_station")
        public String arrivalStation;

        /**
         * <p>座位等级</p>
         * 
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>承运人</p>
         */
        @NameInMap("carrier")
        public String carrier;

        /**
         * <p>航班从</p>
         */
        @NameInMap("departure_station")
        public String departureStation;

        /**
         * <p>日期</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-18</p>
         */
        @NameInMap("flight_date")
        public String flightDate;

        /**
         * <p>航班号</p>
         * 
         * <strong>example:</strong>
         * <p>MU2271</p>
         */
        @NameInMap("flight_number")
        public String flightNumber;

        /**
         * <p>时间</p>
         * 
         * <strong>example:</strong>
         * <p>18:25</p>
         */
        @NameInMap("flight_time")
        public String flightTime;

        /**
         * <p>免费行李</p>
         * 
         * <strong>example:</strong>
         * <p>20K</p>
         */
        @NameInMap("free_baggage_allowance")
        public String freeBaggageAllowance;

        /**
         * <p>行号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <p>客票级别</p>
         * 
         * <strong>example:</strong>
         * <p>M</p>
         */
        @NameInMap("seat_class")
        public String seatClass;

        /**
         * <p>客票生效日期</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        @NameInMap("valid_from_date")
        public String validFromDate;

        /**
         * <p>有效截止日期</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        @NameInMap("valid_to_date")
        public String validToDate;

        public static FlightItineraryScanQueryResponseBodyModuleItemsFlights build(java.util.Map<String, ?> map) throws Exception {
            FlightItineraryScanQueryResponseBodyModuleItemsFlights self = new FlightItineraryScanQueryResponseBodyModuleItemsFlights();
            return TeaModel.build(map, self);
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setArrivalStation(String arrivalStation) {
            this.arrivalStation = arrivalStation;
            return this;
        }
        public String getArrivalStation() {
            return this.arrivalStation;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setDepartureStation(String departureStation) {
            this.departureStation = departureStation;
            return this;
        }
        public String getDepartureStation() {
            return this.departureStation;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setFlightDate(String flightDate) {
            this.flightDate = flightDate;
            return this;
        }
        public String getFlightDate() {
            return this.flightDate;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }
        public String getFlightNumber() {
            return this.flightNumber;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setFlightTime(String flightTime) {
            this.flightTime = flightTime;
            return this;
        }
        public String getFlightTime() {
            return this.flightTime;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setFreeBaggageAllowance(String freeBaggageAllowance) {
            this.freeBaggageAllowance = freeBaggageAllowance;
            return this;
        }
        public String getFreeBaggageAllowance() {
            return this.freeBaggageAllowance;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setSeatClass(String seatClass) {
            this.seatClass = seatClass;
            return this;
        }
        public String getSeatClass() {
            return this.seatClass;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setValidFromDate(String validFromDate) {
            this.validFromDate = validFromDate;
            return this;
        }
        public String getValidFromDate() {
            return this.validFromDate;
        }

        public FlightItineraryScanQueryResponseBodyModuleItemsFlights setValidToDate(String validToDate) {
            this.validToDate = validToDate;
            return this;
        }
        public String getValidToDate() {
            return this.validToDate;
        }

    }

    public static class FlightItineraryScanQueryResponseBodyModuleItems extends TeaModel {
        /**
         * <p>销售单位代号</p>
         * 
         * <strong>example:</strong>
         * <p>SIA25608336893</p>
         */
        @NameInMap("agent_code")
        public String agentCode;

        @NameInMap("apply_id")
        public String applyId;

        /**
         * <strong>example:</strong>
         * <p>2022-12-01</p>
         */
        @NameInMap("bill_date")
        public String billDate;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("build")
        public String build;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("department")
        public String department;

        /**
         * <p>机票行程明细</p>
         */
        @NameInMap("flights")
        public java.util.List<FlightItineraryScanQueryResponseBodyModuleItemsFlights> flights;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("fuel_surcharge")
        public String fuelSurcharge;

        /**
         * <p>UK</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("insurance")
        public String insurance;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("invoice_type")
        public Integer invoiceType;

        /**
         * <p>填开单位</p>
         */
        @NameInMap("issue_company")
        public String issueCompany;

        /**
         * <p>填开日期</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-28</p>
         */
        @NameInMap("issue_date")
        public String issueDate;

        /**
         * <strong>example:</strong>
         * <p>6666666666</p>
         */
        @NameInMap("itinerary_num")
        public String itineraryNum;

        @NameInMap("ofd_oss_url")
        public String ofdOssUrl;

        /**
         * <strong>example:</strong>
         * <p>4801105714092</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.testurl.com">https://www.testurl.com</a></p>
         */
        @NameInMap("oss_url")
        public String ossUrl;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("project")
        public String project;

        /**
         * <p>提示信息</p>
         */
        @NameInMap("prompt_message")
        public String promptMessage;

        @NameInMap("purchaser_name")
        public String purchaserName;

        @NameInMap("purchaser_type")
        public Integer purchaserType;

        /**
         * <strong>example:</strong>
         * <p>108.17</p>
         */
        @NameInMap("tax_amount")
        public String taxAmount;

        /**
         * <strong>example:</strong>
         * <p>9%</p>
         */
        @NameInMap("tax_rate")
        public String taxRate;

        /**
         * <strong>example:</strong>
         * <p>784-1111111111</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>1190</p>
         */
        @NameInMap("ticket_price")
        public String ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>1360</p>
         */
        @NameInMap("total_price")
        public String totalPrice;

        /**
         * <p>验证码</p>
         * 
         * <strong>example:</strong>
         * <p>9817</p>
         */
        @NameInMap("validation_code")
        public String validationCode;

        public static FlightItineraryScanQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            FlightItineraryScanQueryResponseBodyModuleItems self = new FlightItineraryScanQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setAgentCode(String agentCode) {
            this.agentCode = agentCode;
            return this;
        }
        public String getAgentCode() {
            return this.agentCode;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
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

        public FlightItineraryScanQueryResponseBodyModuleItems setFlights(java.util.List<FlightItineraryScanQueryResponseBodyModuleItemsFlights> flights) {
            this.flights = flights;
            return this;
        }
        public java.util.List<FlightItineraryScanQueryResponseBodyModuleItemsFlights> getFlights() {
            return this.flights;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setFuelSurcharge(String fuelSurcharge) {
            this.fuelSurcharge = fuelSurcharge;
            return this;
        }
        public String getFuelSurcharge() {
            return this.fuelSurcharge;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

        public FlightItineraryScanQueryResponseBodyModuleItems setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setIssueCompany(String issueCompany) {
            this.issueCompany = issueCompany;
            return this;
        }
        public String getIssueCompany() {
            return this.issueCompany;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }
        public String getIssueDate() {
            return this.issueDate;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setItineraryNum(String itineraryNum) {
            this.itineraryNum = itineraryNum;
            return this;
        }
        public String getItineraryNum() {
            return this.itineraryNum;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setOfdOssUrl(String ofdOssUrl) {
            this.ofdOssUrl = ofdOssUrl;
            return this;
        }
        public String getOfdOssUrl() {
            return this.ofdOssUrl;
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

        public FlightItineraryScanQueryResponseBodyModuleItems setPromptMessage(String promptMessage) {
            this.promptMessage = promptMessage;
            return this;
        }
        public String getPromptMessage() {
            return this.promptMessage;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setPurchaserName(String purchaserName) {
            this.purchaserName = purchaserName;
            return this;
        }
        public String getPurchaserName() {
            return this.purchaserName;
        }

        public FlightItineraryScanQueryResponseBodyModuleItems setPurchaserType(Integer purchaserType) {
            this.purchaserType = purchaserType;
            return this;
        }
        public Integer getPurchaserType() {
            return this.purchaserType;
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

        public FlightItineraryScanQueryResponseBodyModuleItems setValidationCode(String validationCode) {
            this.validationCode = validationCode;
            return this;
        }
        public String getValidationCode() {
            return this.validationCode;
        }

    }

    public static class FlightItineraryScanQueryResponseBodyModule extends TeaModel {
        @NameInMap("items")
        public java.util.List<FlightItineraryScanQueryResponseBodyModuleItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_no")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("total_page")
        public Integer totalPage;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
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

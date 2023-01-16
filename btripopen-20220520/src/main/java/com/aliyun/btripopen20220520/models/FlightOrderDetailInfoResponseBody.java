// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderDetailInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightOrderDetailInfoResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightOrderDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderDetailInfoResponseBody self = new FlightOrderDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightOrderDetailInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightOrderDetailInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightOrderDetailInfoResponseBody setModule(FlightOrderDetailInfoResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightOrderDetailInfoResponseBodyModule getModule() {
        return this.module;
    }

    public FlightOrderDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightOrderDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightOrderDetailInfoResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightOrderDetailInfoResponseBodyModuleFlightInfoList extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("airline_simple_name")
        public String airlineSimpleName;

        @NameInMap("arr_airport")
        public String arrAirport;

        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_airport_code_name")
        public String arrAirportCodeName;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_terminal")
        public String arrTerminal;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("baggage")
        public String baggage;

        @NameInMap("build_price")
        public Long buildPrice;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("carrier")
        public String carrier;

        @NameInMap("dep_airport")
        public String depAirport;

        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_airport_code_name")
        public String depAirportCodeName;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_terminal")
        public String depTerminal;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("last_cabin")
        public String lastCabin;

        @NameInMap("last_flight_no")
        public String lastFlightNo;

        @NameInMap("meal")
        public String meal;

        @NameInMap("oil_price")
        public Long oilPrice;

        @NameInMap("segment_type")
        public Integer segmentType;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city")
        public String stopCity;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        @NameInMap("ticket_price")
        public Long ticketPrice;

        @NameInMap("tuigaiqian_info")
        public String tuigaiqianInfo;

        public static FlightOrderDetailInfoResponseBodyModuleFlightInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailInfoResponseBodyModuleFlightInfoList self = new FlightOrderDetailInfoResponseBodyModuleFlightInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setArrAirport(String arrAirport) {
            this.arrAirport = arrAirport;
            return this;
        }
        public String getArrAirport() {
            return this.arrAirport;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setArrAirportCodeName(String arrAirportCodeName) {
            this.arrAirportCodeName = arrAirportCodeName;
            return this;
        }
        public String getArrAirportCodeName() {
            return this.arrAirportCodeName;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setBaggage(String baggage) {
            this.baggage = baggage;
            return this;
        }
        public String getBaggage() {
            return this.baggage;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setBuildPrice(Long buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Long getBuildPrice() {
            return this.buildPrice;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setDepAirport(String depAirport) {
            this.depAirport = depAirport;
            return this;
        }
        public String getDepAirport() {
            return this.depAirport;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setDepAirportCodeName(String depAirportCodeName) {
            this.depAirportCodeName = depAirportCodeName;
            return this;
        }
        public String getDepAirportCodeName() {
            return this.depAirportCodeName;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setLastCabin(String lastCabin) {
            this.lastCabin = lastCabin;
            return this;
        }
        public String getLastCabin() {
            return this.lastCabin;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setLastFlightNo(String lastFlightNo) {
            this.lastFlightNo = lastFlightNo;
            return this;
        }
        public String getLastFlightNo() {
            return this.lastFlightNo;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setMeal(String meal) {
            this.meal = meal;
            return this;
        }
        public String getMeal() {
            return this.meal;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setOilPrice(Long oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Long getOilPrice() {
            return this.oilPrice;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setSegmentType(Integer segmentType) {
            this.segmentType = segmentType;
            return this;
        }
        public Integer getSegmentType() {
            return this.segmentType;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightOrderDetailInfoResponseBodyModuleFlightInfoList setTuigaiqianInfo(String tuigaiqianInfo) {
            this.tuigaiqianInfo = tuigaiqianInfo;
            return this;
        }
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

    }

    public static class FlightOrderDetailInfoResponseBodyModuleTicketInfoList extends TeaModel {
        @NameInMap("open_ticket_status")
        public String openTicketStatus;

        @NameInMap("pnr_code")
        public String pnrCode;

        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_status")
        public String ticketStatus;

        public static FlightOrderDetailInfoResponseBodyModuleTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailInfoResponseBodyModuleTicketInfoList self = new FlightOrderDetailInfoResponseBodyModuleTicketInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailInfoResponseBodyModuleTicketInfoList setOpenTicketStatus(String openTicketStatus) {
            this.openTicketStatus = openTicketStatus;
            return this;
        }
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        public FlightOrderDetailInfoResponseBodyModuleTicketInfoList setPnrCode(String pnrCode) {
            this.pnrCode = pnrCode;
            return this;
        }
        public String getPnrCode() {
            return this.pnrCode;
        }

        public FlightOrderDetailInfoResponseBodyModuleTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public FlightOrderDetailInfoResponseBodyModuleTicketInfoList setTicketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public String getTicketStatus() {
            return this.ticketStatus;
        }

    }

    public static class FlightOrderDetailInfoResponseBodyModuleTravelerInfoList extends TeaModel {
        @NameInMap("birth_date")
        public String birthDate;

        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public String certType;

        @NameInMap("open_ticket_status")
        public Integer openTicketStatus;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("passenger_type")
        public String passengerType;

        @NameInMap("phone")
        public String phone;

        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("user_id")
        public String userId;

        public static FlightOrderDetailInfoResponseBodyModuleTravelerInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailInfoResponseBodyModuleTravelerInfoList self = new FlightOrderDetailInfoResponseBodyModuleTravelerInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setOpenTicketStatus(Integer openTicketStatus) {
            this.openTicketStatus = openTicketStatus;
            return this;
        }
        public Integer getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setPassengerType(String passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public String getPassengerType() {
            return this.passengerType;
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public FlightOrderDetailInfoResponseBodyModuleTravelerInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderDetailInfoResponseBodyModule extends TeaModel {
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        @NameInMap("book_user_id")
        public String bookUserId;

        @NameInMap("btrip_order_id")
        public Long btripOrderId;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("contact_phone")
        public String contactPhone;

        @NameInMap("dis_order_id")
        public String disOrderId;

        @NameInMap("extra")
        public String extra;

        @NameInMap("flight_info_list")
        public java.util.List<FlightOrderDetailInfoResponseBodyModuleFlightInfoList> flightInfoList;

        @NameInMap("last_pay_time")
        public String lastPayTime;

        @NameInMap("pay_status")
        public Integer payStatus;

        @NameInMap("pay_time")
        public String payTime;

        @NameInMap("promotion_price")
        public Long promotionPrice;

        @NameInMap("settle_amount")
        public Long settleAmount;

        @NameInMap("settle_type")
        public Integer settleType;

        @NameInMap("status")
        public Integer status;

        @NameInMap("ticket_info_list")
        public java.util.List<FlightOrderDetailInfoResponseBodyModuleTicketInfoList> ticketInfoList;

        @NameInMap("total_build_price")
        public Long totalBuildPrice;

        @NameInMap("total_oil_price")
        public Long totalOilPrice;

        @NameInMap("total_order_price")
        public Long totalOrderPrice;

        @NameInMap("traveler_info_list")
        public java.util.List<FlightOrderDetailInfoResponseBodyModuleTravelerInfoList> travelerInfoList;

        public static FlightOrderDetailInfoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailInfoResponseBodyModule self = new FlightOrderDetailInfoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailInfoResponseBodyModule setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public FlightOrderDetailInfoResponseBodyModule setBookUserId(String bookUserId) {
            this.bookUserId = bookUserId;
            return this;
        }
        public String getBookUserId() {
            return this.bookUserId;
        }

        public FlightOrderDetailInfoResponseBodyModule setBtripOrderId(Long btripOrderId) {
            this.btripOrderId = btripOrderId;
            return this;
        }
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        public FlightOrderDetailInfoResponseBodyModule setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightOrderDetailInfoResponseBodyModule setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public FlightOrderDetailInfoResponseBodyModule setDisOrderId(String disOrderId) {
            this.disOrderId = disOrderId;
            return this;
        }
        public String getDisOrderId() {
            return this.disOrderId;
        }

        public FlightOrderDetailInfoResponseBodyModule setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public FlightOrderDetailInfoResponseBodyModule setFlightInfoList(java.util.List<FlightOrderDetailInfoResponseBodyModuleFlightInfoList> flightInfoList) {
            this.flightInfoList = flightInfoList;
            return this;
        }
        public java.util.List<FlightOrderDetailInfoResponseBodyModuleFlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

        public FlightOrderDetailInfoResponseBodyModule setLastPayTime(String lastPayTime) {
            this.lastPayTime = lastPayTime;
            return this;
        }
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        public FlightOrderDetailInfoResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public FlightOrderDetailInfoResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public FlightOrderDetailInfoResponseBodyModule setPromotionPrice(Long promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public Long getPromotionPrice() {
            return this.promotionPrice;
        }

        public FlightOrderDetailInfoResponseBodyModule setSettleAmount(Long settleAmount) {
            this.settleAmount = settleAmount;
            return this;
        }
        public Long getSettleAmount() {
            return this.settleAmount;
        }

        public FlightOrderDetailInfoResponseBodyModule setSettleType(Integer settleType) {
            this.settleType = settleType;
            return this;
        }
        public Integer getSettleType() {
            return this.settleType;
        }

        public FlightOrderDetailInfoResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightOrderDetailInfoResponseBodyModule setTicketInfoList(java.util.List<FlightOrderDetailInfoResponseBodyModuleTicketInfoList> ticketInfoList) {
            this.ticketInfoList = ticketInfoList;
            return this;
        }
        public java.util.List<FlightOrderDetailInfoResponseBodyModuleTicketInfoList> getTicketInfoList() {
            return this.ticketInfoList;
        }

        public FlightOrderDetailInfoResponseBodyModule setTotalBuildPrice(Long totalBuildPrice) {
            this.totalBuildPrice = totalBuildPrice;
            return this;
        }
        public Long getTotalBuildPrice() {
            return this.totalBuildPrice;
        }

        public FlightOrderDetailInfoResponseBodyModule setTotalOilPrice(Long totalOilPrice) {
            this.totalOilPrice = totalOilPrice;
            return this;
        }
        public Long getTotalOilPrice() {
            return this.totalOilPrice;
        }

        public FlightOrderDetailInfoResponseBodyModule setTotalOrderPrice(Long totalOrderPrice) {
            this.totalOrderPrice = totalOrderPrice;
            return this;
        }
        public Long getTotalOrderPrice() {
            return this.totalOrderPrice;
        }

        public FlightOrderDetailInfoResponseBodyModule setTravelerInfoList(java.util.List<FlightOrderDetailInfoResponseBodyModuleTravelerInfoList> travelerInfoList) {
            this.travelerInfoList = travelerInfoList;
            return this;
        }
        public java.util.List<FlightOrderDetailInfoResponseBodyModuleTravelerInfoList> getTravelerInfoList() {
            return this.travelerInfoList;
        }

    }

}

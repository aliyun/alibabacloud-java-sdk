// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderDetailInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightOrderDetailInfoResponseBodyModule module;

    /**
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
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("airline_simple_name")
        public String airlineSimpleName;

        @NameInMap("arr_airport")
        public String arrAirport;

        /**
         * <strong>example:</strong>
         * <p>LHW</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_airport_code_name")
        public String arrAirportCodeName;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>LHW</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("baggage")
        public String baggage;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("build_price")
        public Long buildPrice;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>&quot;CA1351_PEK_CAN_2000-00-00 08:00</p>
         */
        @NameInMap("carrier")
        public String carrier;

        @NameInMap("dep_airport")
        public String depAirport;

        /**
         * <strong>example:</strong>
         * <p>NGB</p>
         */
        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_airport_code_name")
        public String depAirportCodeName;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>NGB</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2000-01-01 00:00:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>CA1351</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("last_cabin")
        public String lastCabin;

        /**
         * <strong>example:</strong>
         * <p>CA1351</p>
         */
        @NameInMap("last_flight_no")
        public String lastFlightNo;

        @NameInMap("meal")
        public String meal;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("oil_price")
        public Long oilPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_type")
        public Integer segmentType;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>CAN</p>
         */
        @NameInMap("stop_city")
        public String stopCity;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>“”</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("open_ticket_status")
        public String openTicketStatus;

        /**
         * <strong>example:</strong>
         * <p>KF0528</p>
         */
        @NameInMap("pnr_code")
        public String pnrCode;

        /**
         * <strong>example:</strong>
         * <p>444-000000000</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2000-01-01</p>
         */
        @NameInMap("birth_date")
        public String birthDate;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cert_type")
        public String certType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("open_ticket_status")
        public Integer openTicketStatus;

        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public String passengerType;

        /**
         * <strong>example:</strong>
         * <p>12345678909</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>444-000000000</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2389927372772</p>
         */
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        /**
         * <strong>example:</strong>
         * <p>1223</p>
         */
        @NameInMap("book_user_id")
        public String bookUserId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("btrip_order_id")
        public Long btripOrderId;

        @NameInMap("contact_name")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>12345678909</p>
         */
        @NameInMap("contact_phone")
        public String contactPhone;

        /**
         * <strong>example:</strong>
         * <p>dis123</p>
         */
        @NameInMap("dis_order_id")
        public String disOrderId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        @NameInMap("flight_info_list")
        public java.util.List<FlightOrderDetailInfoResponseBodyModuleFlightInfoList> flightInfoList;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("last_pay_time")
        public String lastPayTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("promotion_price")
        public Long promotionPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("settle_amount")
        public Long settleAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("settle_type")
        public Integer settleType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        @NameInMap("ticket_info_list")
        public java.util.List<FlightOrderDetailInfoResponseBodyModuleTicketInfoList> ticketInfoList;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("total_build_price")
        public Long totalBuildPrice;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("total_oil_price")
        public Long totalOilPrice;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
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

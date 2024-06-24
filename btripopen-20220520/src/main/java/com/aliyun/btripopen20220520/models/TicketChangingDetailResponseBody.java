// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TicketChangingDetailResponseBodyModule module;

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
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TicketChangingDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingDetailResponseBody self = new TicketChangingDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketChangingDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TicketChangingDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TicketChangingDetailResponseBody setModule(TicketChangingDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TicketChangingDetailResponseBodyModule getModule() {
        return this.module;
    }

    public TicketChangingDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketChangingDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TicketChangingDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TicketChangingDetailResponseBodyModuleFlightInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
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
         * <p>HGH</p>
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

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("baggage")
        public String baggage;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("build_price")
        public Long buildPrice;

        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>MU3849</p>
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

        /**
         * <strong>example:</strong>
         * <p>T4</p>
         */
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
         * <p>MU3849</p>
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
         * <p>CA1982</p>
         */
        @NameInMap("last_flight_no")
        public String lastFlightNo;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("meal")
        public String meal;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("oil_price")
        public Long oilPrice;

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
         * <p>NGB</p>
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

        @NameInMap("tuigaiqian_info")
        public String tuigaiqianInfo;

        public static TicketChangingDetailResponseBodyModuleFlightInfoList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingDetailResponseBodyModuleFlightInfoList self = new TicketChangingDetailResponseBodyModuleFlightInfoList();
            return TeaModel.build(map, self);
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setArrAirport(String arrAirport) {
            this.arrAirport = arrAirport;
            return this;
        }
        public String getArrAirport() {
            return this.arrAirport;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setArrAirportCodeName(String arrAirportCodeName) {
            this.arrAirportCodeName = arrAirportCodeName;
            return this;
        }
        public String getArrAirportCodeName() {
            return this.arrAirportCodeName;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setBaggage(String baggage) {
            this.baggage = baggage;
            return this;
        }
        public String getBaggage() {
            return this.baggage;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setBuildPrice(Long buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Long getBuildPrice() {
            return this.buildPrice;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setDepAirport(String depAirport) {
            this.depAirport = depAirport;
            return this;
        }
        public String getDepAirport() {
            return this.depAirport;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setDepAirportCodeName(String depAirportCodeName) {
            this.depAirportCodeName = depAirportCodeName;
            return this;
        }
        public String getDepAirportCodeName() {
            return this.depAirportCodeName;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setLastCabin(String lastCabin) {
            this.lastCabin = lastCabin;
            return this;
        }
        public String getLastCabin() {
            return this.lastCabin;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setLastFlightNo(String lastFlightNo) {
            this.lastFlightNo = lastFlightNo;
            return this;
        }
        public String getLastFlightNo() {
            return this.lastFlightNo;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setMeal(String meal) {
            this.meal = meal;
            return this;
        }
        public String getMeal() {
            return this.meal;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setOilPrice(Long oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Long getOilPrice() {
            return this.oilPrice;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setSegmentType(Integer segmentType) {
            this.segmentType = segmentType;
            return this;
        }
        public Integer getSegmentType() {
            return this.segmentType;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public TicketChangingDetailResponseBodyModuleFlightInfoList setTuigaiqianInfo(String tuigaiqianInfo) {
            this.tuigaiqianInfo = tuigaiqianInfo;
            return this;
        }
        public String getTuigaiqianInfo() {
            return this.tuigaiqianInfo;
        }

    }

    public static class TicketChangingDetailResponseBodyModuleTravelerInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000-01-01</p>
         */
        @NameInMap("birth_date")
        public String birthDate;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
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
         * <p>012992</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static TicketChangingDetailResponseBodyModuleTravelerInfoList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingDetailResponseBodyModuleTravelerInfoList self = new TicketChangingDetailResponseBodyModuleTravelerInfoList();
            return TeaModel.build(map, self);
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setOpenTicketStatus(Integer openTicketStatus) {
            this.openTicketStatus = openTicketStatus;
            return this;
        }
        public Integer getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setPassengerType(String passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public String getPassengerType() {
            return this.passengerType;
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public TicketChangingDetailResponseBodyModuleTravelerInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class TicketChangingDetailResponseBodyModule extends TeaModel {
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        /**
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("btrip_order_id")
        public Long btripOrderId;

        /**
         * <strong>example:</strong>
         * <p>37772</p>
         */
        @NameInMap("btrip_sub_order_id")
        public Long btripSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>dis123</p>
         */
        @NameInMap("dis_order_id")
        public String disOrderId;

        /**
         * <strong>example:</strong>
         * <p>chang123</p>
         */
        @NameInMap("dis_sub_order_id")
        public String disSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("extra")
        public String extra;

        @NameInMap("flight_info_list")
        public java.util.List<TicketChangingDetailResponseBodyModuleFlightInfoList> flightInfoList;

        /**
         * <strong>example:</strong>
         * <p>2022-12-30 11:30:00</p>
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
         * <p>2022-12-30 11:30:00</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("settle_price")
        public Long settlePrice;

        @NameInMap("settle_type")
        public Integer settleType;

        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_change_price")
        public Long totalChangePrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_upgrade_price")
        public Long totalUpgradePrice;

        @NameInMap("traveler_info_list")
        public java.util.List<TicketChangingDetailResponseBodyModuleTravelerInfoList> travelerInfoList;

        public static TicketChangingDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingDetailResponseBodyModule self = new TicketChangingDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TicketChangingDetailResponseBodyModule setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public TicketChangingDetailResponseBodyModule setBtripOrderId(Long btripOrderId) {
            this.btripOrderId = btripOrderId;
            return this;
        }
        public Long getBtripOrderId() {
            return this.btripOrderId;
        }

        public TicketChangingDetailResponseBodyModule setBtripSubOrderId(Long btripSubOrderId) {
            this.btripSubOrderId = btripSubOrderId;
            return this;
        }
        public Long getBtripSubOrderId() {
            return this.btripSubOrderId;
        }

        public TicketChangingDetailResponseBodyModule setDisOrderId(String disOrderId) {
            this.disOrderId = disOrderId;
            return this;
        }
        public String getDisOrderId() {
            return this.disOrderId;
        }

        public TicketChangingDetailResponseBodyModule setDisSubOrderId(String disSubOrderId) {
            this.disSubOrderId = disSubOrderId;
            return this;
        }
        public String getDisSubOrderId() {
            return this.disSubOrderId;
        }

        public TicketChangingDetailResponseBodyModule setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public TicketChangingDetailResponseBodyModule setFlightInfoList(java.util.List<TicketChangingDetailResponseBodyModuleFlightInfoList> flightInfoList) {
            this.flightInfoList = flightInfoList;
            return this;
        }
        public java.util.List<TicketChangingDetailResponseBodyModuleFlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

        public TicketChangingDetailResponseBodyModule setLastPayTime(String lastPayTime) {
            this.lastPayTime = lastPayTime;
            return this;
        }
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        public TicketChangingDetailResponseBodyModule setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public TicketChangingDetailResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public TicketChangingDetailResponseBodyModule setSettlePrice(Long settlePrice) {
            this.settlePrice = settlePrice;
            return this;
        }
        public Long getSettlePrice() {
            return this.settlePrice;
        }

        public TicketChangingDetailResponseBodyModule setSettleType(Integer settleType) {
            this.settleType = settleType;
            return this;
        }
        public Integer getSettleType() {
            return this.settleType;
        }

        public TicketChangingDetailResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public TicketChangingDetailResponseBodyModule setTotalChangePrice(Long totalChangePrice) {
            this.totalChangePrice = totalChangePrice;
            return this;
        }
        public Long getTotalChangePrice() {
            return this.totalChangePrice;
        }

        public TicketChangingDetailResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        public TicketChangingDetailResponseBodyModule setTotalUpgradePrice(Long totalUpgradePrice) {
            this.totalUpgradePrice = totalUpgradePrice;
            return this;
        }
        public Long getTotalUpgradePrice() {
            return this.totalUpgradePrice;
        }

        public TicketChangingDetailResponseBodyModule setTravelerInfoList(java.util.List<TicketChangingDetailResponseBodyModuleTravelerInfoList> travelerInfoList) {
            this.travelerInfoList = travelerInfoList;
            return this;
        }
        public java.util.List<TicketChangingDetailResponseBodyModuleTravelerInfoList> getTravelerInfoList() {
            return this.travelerInfoList;
        }

    }

}

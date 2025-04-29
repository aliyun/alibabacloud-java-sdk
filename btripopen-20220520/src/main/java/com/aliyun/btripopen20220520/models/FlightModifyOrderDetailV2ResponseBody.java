// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOrderDetailV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightModifyOrderDetailV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
     * <p>210bc2dc16839612026565712dcbe6</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightModifyOrderDetailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyOrderDetailV2ResponseBody self = new FlightModifyOrderDetailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightModifyOrderDetailV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightModifyOrderDetailV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightModifyOrderDetailV2ResponseBody setModule(FlightModifyOrderDetailV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightModifyOrderDetailV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightModifyOrderDetailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightModifyOrderDetailV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightModifyOrderDetailV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleAttributes extends TeaModel {
        @NameInMap("baggage_rule")
        public String baggageRule;

        @NameInMap("change_rule")
        public String changeRule;

        @NameInMap("latest_pay_time")
        public Object latestPayTime;

        @NameInMap("latest_pay_time_str")
        public String latestPayTimeStr;

        @NameInMap("refund_rule")
        public String refundRule;

        public static FlightModifyOrderDetailV2ResponseBodyModuleAttributes build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleAttributes self = new FlightModifyOrderDetailV2ResponseBodyModuleAttributes();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setBaggageRule(String baggageRule) {
            this.baggageRule = baggageRule;
            return this;
        }
        public String getBaggageRule() {
            return this.baggageRule;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setChangeRule(String changeRule) {
            this.changeRule = changeRule;
            return this;
        }
        public String getChangeRule() {
            return this.changeRule;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setLatestPayTime(Object latestPayTime) {
            this.latestPayTime = latestPayTime;
            return this;
        }
        public Object getLatestPayTime() {
            return this.latestPayTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setLatestPayTimeStr(String latestPayTimeStr) {
            this.latestPayTimeStr = latestPayTimeStr;
            return this;
        }
        public String getLatestPayTimeStr() {
            return this.latestPayTimeStr;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes setRefundRule(String refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public String getRefundRule() {
            return this.refundRule;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:17816963077@163.com">17816963077@163.com</a></p>
         */
        @NameInMap("contact_email")
        public String contactEmail;

        @NameInMap("contact_name")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>17816963077</p>
         */
        @NameInMap("contact_phone")
        public String contactPhone;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("send_msg_to_passenger")
        public Boolean sendMsgToPassenger;

        public static FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO self = new FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO setSendMsgToPassenger(Boolean sendMsgToPassenger) {
            this.sendMsgToPassenger = sendMsgToPassenger;
            return this;
        }
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange extends TeaModel {
        @NameInMap("change_desc")
        public String changeDesc;

        @NameInMap("change_status")
        public String changeStatus;

        @NameInMap("change_status_code")
        public String changeStatusCode;

        @NameInMap("new_segment")
        public Object newSegment;

        @NameInMap("passenger_names")
        public java.util.List<String> passengerNames;

        public static FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange self = new FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setChangeDesc(String changeDesc) {
            this.changeDesc = changeDesc;
            return this;
        }
        public String getChangeDesc() {
            return this.changeDesc;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setChangeStatus(String changeStatus) {
            this.changeStatus = changeStatus;
            return this;
        }
        public String getChangeStatus() {
            return this.changeStatus;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setChangeStatusCode(String changeStatusCode) {
            this.changeStatusCode = changeStatusCode;
            return this;
        }
        public String getChangeStatusCode() {
            return this.changeStatusCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setNewSegment(Object newSegment) {
            this.newSegment = newSegment;
            return this;
        }
        public Object getNewSegment() {
            return this.newSegment;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange setPassengerNames(java.util.List<String> passengerNames) {
            this.passengerNames = passengerNames;
            return this;
        }
        public java.util.List<String> getPassengerNames() {
            return this.passengerNames;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition self = new FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon_url")
        public String airlineIconUrl;

        @NameInMap("airline_name")
        public String airlineName;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_airport_name")
        public String arrAirportName;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2023-10-03 09:30:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("cabin_discount")
        public Long cabinDiscount;

        @NameInMap("carrier_airline_code")
        public String carrierAirlineCode;

        @NameInMap("carrier_airline_icon_url")
        public String carrierAirlineIconUrl;

        @NameInMap("carrier_airline_name")
        public String carrierAirlineName;

        @NameInMap("carrier_flight_no")
        public String carrierFlightNo;

        /**
         * <strong>example:</strong>
         * <p>PKX</p>
         */
        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_airport_name")
        public String depAirportName;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2023-10-03 07:30:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_change")
        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange flightChange;

        /**
         * <strong>example:</strong>
         * <p>MU5193</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>1194012</p>
         */
        @NameInMap("segmentI_id")
        public String segmentIId;

        @NameInMap("segment_position")
        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition segmentPosition;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city")
        public String stopCity;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS self = new FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setAirlineIconUrl(String airlineIconUrl) {
            this.airlineIconUrl = airlineIconUrl;
            return this;
        }
        public String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrAirportName(String arrAirportName) {
            this.arrAirportName = arrAirportName;
            return this;
        }
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCabinDiscount(Long cabinDiscount) {
            this.cabinDiscount = cabinDiscount;
            return this;
        }
        public Long getCabinDiscount() {
            return this.cabinDiscount;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCarrierAirlineIconUrl(String carrierAirlineIconUrl) {
            this.carrierAirlineIconUrl = carrierAirlineIconUrl;
            return this;
        }
        public String getCarrierAirlineIconUrl() {
            return this.carrierAirlineIconUrl;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setCarrierFlightNo(String carrierFlightNo) {
            this.carrierFlightNo = carrierFlightNo;
            return this;
        }
        public String getCarrierFlightNo() {
            return this.carrierFlightNo;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepAirportName(String depAirportName) {
            this.depAirportName = depAirportName;
            return this;
        }
        public String getDepAirportName() {
            return this.depAirportName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setFlightChange(FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange flightChange) {
            this.flightChange = flightChange;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSFlightChange getFlightChange() {
            return this.flightChange;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setSegmentIId(String segmentIId) {
            this.segmentIId = segmentIId;
            return this;
        }
        public String getSegmentIId() {
            return this.segmentIId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setSegmentPosition(FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOSSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee extends TeaModel {
        @NameInMap("change_fee")
        public Long changeFee;

        @NameInMap("service_fee")
        public Long serviceFee;

        @NameInMap("upgrade_price")
        public Long upgradePrice;

        public static FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee self = new FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee setChangeFee(Long changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Long getChangeFee() {
            return this.changeFee;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee setUpgradePrice(Long upgradePrice) {
            this.upgradePrice = upgradePrice;
            return this;
        }
        public Long getUpgradePrice() {
            return this.upgradePrice;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000-08-19</p>
         */
        @NameInMap("birth_date")
        public String birthDate;

        /**
         * <strong>example:</strong>
         * <p>430131413423435353</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("change_fee")
        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee changeFee;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gender")
        public Integer gender;

        @NameInMap("origin_ticket_nos")
        public java.util.List<String> originTicketNos;

        /**
         * <strong>example:</strong>
         * <p>12172819047252004460056</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <strong>example:</strong>
         * <p>17635462345</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>3243028</p>
         */
        @NameInMap("pid")
        public Long pid;

        @NameInMap("ticket_no_segment_map")
        public java.util.Map<String, ?> ticketNoSegmentMap;

        @NameInMap("ticket_nos")
        public java.util.List<String> ticketNos;

        public static FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS self = new FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setChangeFee(FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOSChangeFee getChangeFee() {
            return this.changeFee;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setOriginTicketNos(java.util.List<String> originTicketNos) {
            this.originTicketNos = originTicketNos;
            return this;
        }
        public java.util.List<String> getOriginTicketNos() {
            return this.originTicketNos;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setTicketNoSegmentMap(java.util.Map<String, ?> ticketNoSegmentMap) {
            this.ticketNoSegmentMap = ticketNoSegmentMap;
            return this;
        }
        public java.util.Map<String, ?> getTicketNoSegmentMap() {
            return this.ticketNoSegmentMap;
        }

        public FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS setTicketNos(java.util.List<String> ticketNos) {
            this.ticketNos = ticketNos;
            return this;
        }
        public java.util.List<String> getTicketNos() {
            return this.ticketNos;
        }

    }

    public static class FlightModifyOrderDetailV2ResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-08-14 11:28:01</p>
         */
        @NameInMap("apply_time")
        public String applyTime;

        @NameInMap("attributes")
        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes attributes;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:17635462345@163.com">17635462345@163.com</a></p>
         */
        @NameInMap("book_user_email")
        public String bookUserEmail;

        @NameInMap("book_user_name")
        public String bookUserName;

        /**
         * <strong>example:</strong>
         * <p>17635462345</p>
         */
        @NameInMap("bookuser_phone")
        public String bookuserPhone;

        @NameInMap("change_fail_reason")
        public String changeFailReason;

        @NameInMap("contact_info_d_t_o")
        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO contactInfoDTO;

        @NameInMap("dest_flight_info_d_t_o_s")
        public java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS> destFlightInfoDTOS;

        /**
         * <strong>example:</strong>
         * <p>2023-08-14 11:48:01</p>
         */
        @NameInMap("last_pay_time")
        public String lastPayTime;

        /**
         * <strong>example:</strong>
         * <p>1017124195788186048</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>1017124195788186048</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        /**
         * <strong>example:</strong>
         * <p>1019195836916029</p>
         */
        @NameInMap("out_sub_order_id")
        public String outSubOrderId;

        /**
         * <strong>example:</strong>
         * <p>2023-08-14 11:38:01</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1019195836916029</p>
         */
        @NameInMap("sub_order_id")
        public Long subOrderId;

        /**
         * <strong>example:</strong>
         * <p>2023-08-19 15:24:08</p>
         */
        @NameInMap("ticket_time")
        public String ticketTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total_service_fee_price")
        public Long totalServiceFeePrice;

        @NameInMap("traveler_info_d_t_o_s")
        public java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS> travelerInfoDTOS;

        public static FlightModifyOrderDetailV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOrderDetailV2ResponseBodyModule self = new FlightModifyOrderDetailV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setAttributes(FlightModifyOrderDetailV2ResponseBodyModuleAttributes attributes) {
            this.attributes = attributes;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleAttributes getAttributes() {
            return this.attributes;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setBookUserEmail(String bookUserEmail) {
            this.bookUserEmail = bookUserEmail;
            return this;
        }
        public String getBookUserEmail() {
            return this.bookUserEmail;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setBookUserName(String bookUserName) {
            this.bookUserName = bookUserName;
            return this;
        }
        public String getBookUserName() {
            return this.bookUserName;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setBookuserPhone(String bookuserPhone) {
            this.bookuserPhone = bookuserPhone;
            return this;
        }
        public String getBookuserPhone() {
            return this.bookuserPhone;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setChangeFailReason(String changeFailReason) {
            this.changeFailReason = changeFailReason;
            return this;
        }
        public String getChangeFailReason() {
            return this.changeFailReason;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setContactInfoDTO(FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO contactInfoDTO) {
            this.contactInfoDTO = contactInfoDTO;
            return this;
        }
        public FlightModifyOrderDetailV2ResponseBodyModuleContactInfoDTO getContactInfoDTO() {
            return this.contactInfoDTO;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setDestFlightInfoDTOS(java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS> destFlightInfoDTOS) {
            this.destFlightInfoDTOS = destFlightInfoDTOS;
            return this;
        }
        public java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleDestFlightInfoDTOS> getDestFlightInfoDTOS() {
            return this.destFlightInfoDTOS;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setLastPayTime(String lastPayTime) {
            this.lastPayTime = lastPayTime;
            return this;
        }
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setOutSubOrderId(String outSubOrderId) {
            this.outSubOrderId = outSubOrderId;
            return this;
        }
        public String getOutSubOrderId() {
            return this.outSubOrderId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setSubOrderId(Long subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public Long getSubOrderId() {
            return this.subOrderId;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setTicketTime(String ticketTime) {
            this.ticketTime = ticketTime;
            return this;
        }
        public String getTicketTime() {
            return this.ticketTime;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setTotalServiceFeePrice(Long totalServiceFeePrice) {
            this.totalServiceFeePrice = totalServiceFeePrice;
            return this;
        }
        public Long getTotalServiceFeePrice() {
            return this.totalServiceFeePrice;
        }

        public FlightModifyOrderDetailV2ResponseBodyModule setTravelerInfoDTOS(java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS> travelerInfoDTOS) {
            this.travelerInfoDTOS = travelerInfoDTOS;
            return this;
        }
        public java.util.List<FlightModifyOrderDetailV2ResponseBodyModuleTravelerInfoDTOS> getTravelerInfoDTOS() {
            return this.travelerInfoDTOS;
        }

    }

}

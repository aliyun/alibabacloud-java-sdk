// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundDetailV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightRefundDetailV2ResponseBodyModule module;

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

    public static FlightRefundDetailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundDetailV2ResponseBody self = new FlightRefundDetailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightRefundDetailV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightRefundDetailV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightRefundDetailV2ResponseBody setModule(FlightRefundDetailV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightRefundDetailV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightRefundDetailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightRefundDetailV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightRefundDetailV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightRefundDetailV2ResponseBodyModuleContactInfoDTO extends TeaModel {
        @NameInMap("contact_email")
        public String contactEmail;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("contact_phone")
        public String contactPhone;

        @NameInMap("send_msg_to_passenger")
        public Boolean sendMsgToPassenger;

        public static FlightRefundDetailV2ResponseBodyModuleContactInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundDetailV2ResponseBodyModuleContactInfoDTO self = new FlightRefundDetailV2ResponseBodyModuleContactInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightRefundDetailV2ResponseBodyModuleContactInfoDTO setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public FlightRefundDetailV2ResponseBodyModuleContactInfoDTO setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightRefundDetailV2ResponseBodyModuleContactInfoDTO setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public FlightRefundDetailV2ResponseBodyModuleContactInfoDTO setSendMsgToPassenger(Boolean sendMsgToPassenger) {
            this.sendMsgToPassenger = sendMsgToPassenger;
            return this;
        }
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

    }

    public static class FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition self = new FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition();
            return TeaModel.build(map, self);
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon_url")
        public String airlineIconUrl;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_airport_name")
        public String arrAirportName;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_terminal")
        public String arrTerminal;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_class_name")
        public String cabinClassName;

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

        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_airport_name")
        public String depAirportName;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_terminal")
        public String depTerminal;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("segment_id")
        public String segmentId;

        @NameInMap("segment_position")
        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition segmentPosition;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city")
        public String stopCity;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS self = new FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS();
            return TeaModel.build(map, self);
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setAirlineIconUrl(String airlineIconUrl) {
            this.airlineIconUrl = airlineIconUrl;
            return this;
        }
        public String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setArrAirportName(String arrAirportName) {
            this.arrAirportName = arrAirportName;
            return this;
        }
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setCabinDiscount(Long cabinDiscount) {
            this.cabinDiscount = cabinDiscount;
            return this;
        }
        public Long getCabinDiscount() {
            return this.cabinDiscount;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setCarrierAirlineIconUrl(String carrierAirlineIconUrl) {
            this.carrierAirlineIconUrl = carrierAirlineIconUrl;
            return this;
        }
        public String getCarrierAirlineIconUrl() {
            return this.carrierAirlineIconUrl;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setCarrierFlightNo(String carrierFlightNo) {
            this.carrierFlightNo = carrierFlightNo;
            return this;
        }
        public String getCarrierFlightNo() {
            return this.carrierFlightNo;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setDepAirportName(String depAirportName) {
            this.depAirportName = depAirportName;
            return this;
        }
        public String getDepAirportName() {
            return this.depAirportName;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setSegmentPosition(FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOSSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS extends TeaModel {
        @NameInMap("birth_date")
        public String birthDate;

        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("gender")
        public Integer gender;

        @NameInMap("origin_ticket_nos")
        public java.util.List<String> originTicketNos;

        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("passenger_type")
        public Integer passengerType;

        @NameInMap("phone")
        public String phone;

        @NameInMap("pid")
        public Long pid;

        @NameInMap("ticket_nos")
        public java.util.List<String> ticketNos;

        public static FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS self = new FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS();
            return TeaModel.build(map, self);
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setOriginTicketNos(java.util.List<String> originTicketNos) {
            this.originTicketNos = originTicketNos;
            return this;
        }
        public java.util.List<String> getOriginTicketNos() {
            return this.originTicketNos;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

        public FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS setTicketNos(java.util.List<String> ticketNos) {
            this.ticketNos = ticketNos;
            return this;
        }
        public java.util.List<String> getTicketNos() {
            return this.ticketNos;
        }

    }

    public static class FlightRefundDetailV2ResponseBodyModule extends TeaModel {
        @NameInMap("apply_time")
        public String applyTime;

        @NameInMap("contact_info_d_t_o")
        public FlightRefundDetailV2ResponseBodyModuleContactInfoDTO contactInfoDTO;

        @NameInMap("flight_info_d_t_o_s")
        public java.util.List<FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS> flightInfoDTOS;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("out_sub_order_id")
        public String outSubOrderId;

        @NameInMap("reason")
        public String reason;

        @NameInMap("reason_code")
        public String reasonCode;

        @NameInMap("refund_fail_reason")
        public String refundFailReason;

        @NameInMap("refund_handling_fee")
        public Long refundHandlingFee;

        @NameInMap("refund_money")
        public Long refundMoney;

        @NameInMap("status")
        public Integer status;

        @NameInMap("sub_order_id")
        public Long subOrderId;

        @NameInMap("traveler_info_d_t_o_s")
        public java.util.List<FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS> travelerInfoDTOS;

        public static FlightRefundDetailV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundDetailV2ResponseBodyModule self = new FlightRefundDetailV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightRefundDetailV2ResponseBodyModule setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public FlightRefundDetailV2ResponseBodyModule setContactInfoDTO(FlightRefundDetailV2ResponseBodyModuleContactInfoDTO contactInfoDTO) {
            this.contactInfoDTO = contactInfoDTO;
            return this;
        }
        public FlightRefundDetailV2ResponseBodyModuleContactInfoDTO getContactInfoDTO() {
            return this.contactInfoDTO;
        }

        public FlightRefundDetailV2ResponseBodyModule setFlightInfoDTOS(java.util.List<FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS> flightInfoDTOS) {
            this.flightInfoDTOS = flightInfoDTOS;
            return this;
        }
        public java.util.List<FlightRefundDetailV2ResponseBodyModuleFlightInfoDTOS> getFlightInfoDTOS() {
            return this.flightInfoDTOS;
        }

        public FlightRefundDetailV2ResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public FlightRefundDetailV2ResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public FlightRefundDetailV2ResponseBodyModule setOutSubOrderId(String outSubOrderId) {
            this.outSubOrderId = outSubOrderId;
            return this;
        }
        public String getOutSubOrderId() {
            return this.outSubOrderId;
        }

        public FlightRefundDetailV2ResponseBodyModule setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public FlightRefundDetailV2ResponseBodyModule setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public FlightRefundDetailV2ResponseBodyModule setRefundFailReason(String refundFailReason) {
            this.refundFailReason = refundFailReason;
            return this;
        }
        public String getRefundFailReason() {
            return this.refundFailReason;
        }

        public FlightRefundDetailV2ResponseBodyModule setRefundHandlingFee(Long refundHandlingFee) {
            this.refundHandlingFee = refundHandlingFee;
            return this;
        }
        public Long getRefundHandlingFee() {
            return this.refundHandlingFee;
        }

        public FlightRefundDetailV2ResponseBodyModule setRefundMoney(Long refundMoney) {
            this.refundMoney = refundMoney;
            return this;
        }
        public Long getRefundMoney() {
            return this.refundMoney;
        }

        public FlightRefundDetailV2ResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightRefundDetailV2ResponseBodyModule setSubOrderId(Long subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public Long getSubOrderId() {
            return this.subOrderId;
        }

        public FlightRefundDetailV2ResponseBodyModule setTravelerInfoDTOS(java.util.List<FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS> travelerInfoDTOS) {
            this.travelerInfoDTOS = travelerInfoDTOS;
            return this;
        }
        public java.util.List<FlightRefundDetailV2ResponseBodyModuleTravelerInfoDTOS> getTravelerInfoDTOS() {
            return this.travelerInfoDTOS;
        }

    }

}

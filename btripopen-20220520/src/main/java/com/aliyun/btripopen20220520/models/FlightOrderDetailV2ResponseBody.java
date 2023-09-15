// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderDetailV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightOrderDetailV2ResponseBodyModule module;

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

    public static FlightOrderDetailV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderDetailV2ResponseBody self = new FlightOrderDetailV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightOrderDetailV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightOrderDetailV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightOrderDetailV2ResponseBody setModule(FlightOrderDetailV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightOrderDetailV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightOrderDetailV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightOrderDetailV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightOrderDetailV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightOrderDetailV2ResponseBodyModuleContactInfoDTO extends TeaModel {
        @NameInMap("contact_email")
        public String contactEmail;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("contact_phone")
        public String contactPhone;

        @NameInMap("send_msg_to_passenger")
        public Boolean sendMsgToPassenger;

        public static FlightOrderDetailV2ResponseBodyModuleContactInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModuleContactInfoDTO self = new FlightOrderDetailV2ResponseBodyModuleContactInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModuleContactInfoDTO setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public FlightOrderDetailV2ResponseBodyModuleContactInfoDTO setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightOrderDetailV2ResponseBodyModuleContactInfoDTO setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public FlightOrderDetailV2ResponseBodyModuleContactInfoDTO setSendMsgToPassenger(Boolean sendMsgToPassenger) {
            this.sendMsgToPassenger = sendMsgToPassenger;
            return this;
        }
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange extends TeaModel {
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

        public static FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange self = new FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange setChangeDesc(String changeDesc) {
            this.changeDesc = changeDesc;
            return this;
        }
        public String getChangeDesc() {
            return this.changeDesc;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange setChangeStatus(String changeStatus) {
            this.changeStatus = changeStatus;
            return this;
        }
        public String getChangeStatus() {
            return this.changeStatus;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange setChangeStatusCode(String changeStatusCode) {
            this.changeStatusCode = changeStatusCode;
            return this;
        }
        public String getChangeStatusCode() {
            return this.changeStatusCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange setNewSegment(Object newSegment) {
            this.newSegment = newSegment;
            return this;
        }
        public Object getNewSegment() {
            return this.newSegment;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange setPassengerNames(java.util.List<String> passengerNames) {
            this.passengerNames = passengerNames;
            return this;
        }
        public java.util.List<String> getPassengerNames() {
            return this.passengerNames;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition self = new FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList extends TeaModel {
        @NameInMap("air_line_code")
        public String airLineCode;

        @NameInMap("air_line_english_name")
        public String airLineEnglishName;

        @NameInMap("air_line_name")
        public String airLineName;

        @NameInMap("air_line_phone")
        public String airLinePhone;

        @NameInMap("airline_icon_url")
        public String airlineIconUrl;

        @NameInMap("airline_short_name")
        public String airlineShortName;

        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_airport_name")
        public String arrAirportName;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("arrive_terminal")
        public String arriveTerminal;

        /**
         * <p>cabin</p>
         */
        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_and_discount")
        public String cabinAndDiscount;

        /**
         * <p>cabin_class</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>cabin_class_name</p>
         */
        @NameInMap("cabin_class_name")
        public String cabinClassName;

        @NameInMap("code_share")
        public Boolean codeShare;

        @NameInMap("deadline_text")
        public String deadlineText;

        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_airport_name")
        public String depAirportName;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("depart_terminal")
        public String departTerminal;

        @NameInMap("discount")
        public Double discount;

        @NameInMap("flight_change")
        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange flightChange;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("fly_duration")
        public Integer flyDuration;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("on_time_rate")
        public String onTimeRate;

        @NameInMap("operating_air_short_name")
        public String operatingAirShortName;

        @NameInMap("operating_airline_code")
        public String operatingAirlineCode;

        @NameInMap("operating_airline_english_name")
        public String operatingAirlineEnglishName;

        @NameInMap("operating_airline_icon_url")
        public String operatingAirlineIconUrl;

        @NameInMap("operating_airline_name")
        public String operatingAirlineName;

        @NameInMap("operating_airline_phone")
        public String operatingAirlinePhone;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        @NameInMap("plane_type")
        public String planeType;

        @NameInMap("raise_price")
        public Long raisePrice;

        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>segmentIndex</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("segment_position")
        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition segmentPosition;

        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city")
        public String stopCity;

        @NameInMap("stop_city_name")
        public String stopCityName;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList self = new FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setAirLineCode(String airLineCode) {
            this.airLineCode = airLineCode;
            return this;
        }
        public String getAirLineCode() {
            return this.airLineCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setAirLineEnglishName(String airLineEnglishName) {
            this.airLineEnglishName = airLineEnglishName;
            return this;
        }
        public String getAirLineEnglishName() {
            return this.airLineEnglishName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setAirLineName(String airLineName) {
            this.airLineName = airLineName;
            return this;
        }
        public String getAirLineName() {
            return this.airLineName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setAirLinePhone(String airLinePhone) {
            this.airLinePhone = airLinePhone;
            return this;
        }
        public String getAirLinePhone() {
            return this.airLinePhone;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setAirlineIconUrl(String airlineIconUrl) {
            this.airlineIconUrl = airlineIconUrl;
            return this;
        }
        public String getAirlineIconUrl() {
            return this.airlineIconUrl;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setAirlineShortName(String airlineShortName) {
            this.airlineShortName = airlineShortName;
            return this;
        }
        public String getAirlineShortName() {
            return this.airlineShortName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setArrAirportName(String arrAirportName) {
            this.arrAirportName = arrAirportName;
            return this;
        }
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setArriveTerminal(String arriveTerminal) {
            this.arriveTerminal = arriveTerminal;
            return this;
        }
        public String getArriveTerminal() {
            return this.arriveTerminal;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setCabinAndDiscount(String cabinAndDiscount) {
            this.cabinAndDiscount = cabinAndDiscount;
            return this;
        }
        public String getCabinAndDiscount() {
            return this.cabinAndDiscount;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDeadlineText(String deadlineText) {
            this.deadlineText = deadlineText;
            return this;
        }
        public String getDeadlineText() {
            return this.deadlineText;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDepAirportName(String depAirportName) {
            this.depAirportName = depAirportName;
            return this;
        }
        public String getDepAirportName() {
            return this.depAirportName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDepartTerminal(String departTerminal) {
            this.departTerminal = departTerminal;
            return this;
        }
        public String getDepartTerminal() {
            return this.departTerminal;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setDiscount(Double discount) {
            this.discount = discount;
            return this;
        }
        public Double getDiscount() {
            return this.discount;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setFlightChange(FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange flightChange) {
            this.flightChange = flightChange;
            return this;
        }
        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListFlightChange getFlightChange() {
            return this.flightChange;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setFlyDuration(Integer flyDuration) {
            this.flyDuration = flyDuration;
            return this;
        }
        public Integer getFlyDuration() {
            return this.flyDuration;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setOperatingAirShortName(String operatingAirShortName) {
            this.operatingAirShortName = operatingAirShortName;
            return this;
        }
        public String getOperatingAirShortName() {
            return this.operatingAirShortName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setOperatingAirlineCode(String operatingAirlineCode) {
            this.operatingAirlineCode = operatingAirlineCode;
            return this;
        }
        public String getOperatingAirlineCode() {
            return this.operatingAirlineCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setOperatingAirlineEnglishName(String operatingAirlineEnglishName) {
            this.operatingAirlineEnglishName = operatingAirlineEnglishName;
            return this;
        }
        public String getOperatingAirlineEnglishName() {
            return this.operatingAirlineEnglishName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setOperatingAirlineIconUrl(String operatingAirlineIconUrl) {
            this.operatingAirlineIconUrl = operatingAirlineIconUrl;
            return this;
        }
        public String getOperatingAirlineIconUrl() {
            return this.operatingAirlineIconUrl;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setOperatingAirlineName(String operatingAirlineName) {
            this.operatingAirlineName = operatingAirlineName;
            return this;
        }
        public String getOperatingAirlineName() {
            return this.operatingAirlineName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setOperatingAirlinePhone(String operatingAirlinePhone) {
            this.operatingAirlinePhone = operatingAirlinePhone;
            return this;
        }
        public String getOperatingAirlinePhone() {
            return this.operatingAirlinePhone;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setPlaneType(String planeType) {
            this.planeType = planeType;
            return this;
        }
        public String getPlaneType() {
            return this.planeType;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setRaisePrice(Long raisePrice) {
            this.raisePrice = raisePrice;
            return this;
        }
        public Long getRaisePrice() {
            return this.raisePrice;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setSegmentPosition(FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys extends TeaModel {
        @NameInMap("all_fly_duration")
        public Long allFlyDuration;

        @NameInMap("all_fly_duration_after_change")
        public Long allFlyDurationAfterChange;

        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("baggage_details")
        public String baggageDetails;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_status")
        public String flightStatus;

        /**
         * <p>iata_no</p>
         */
        @NameInMap("iata_no")
        public String iataNo;

        @NameInMap("is_reshop_journey")
        public Boolean isReshopJourney;

        @NameInMap("is_transfer")
        public Boolean isTransfer;

        @NameInMap("journey_title")
        public String journeyTitle;

        @NameInMap("refund_change_details")
        public String refundChangeDetails;

        @NameInMap("segment_list")
        public java.util.List<FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList> segmentList;

        public static FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys self = new FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setAllFlyDuration(Long allFlyDuration) {
            this.allFlyDuration = allFlyDuration;
            return this;
        }
        public Long getAllFlyDuration() {
            return this.allFlyDuration;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setAllFlyDurationAfterChange(Long allFlyDurationAfterChange) {
            this.allFlyDurationAfterChange = allFlyDurationAfterChange;
            return this;
        }
        public Long getAllFlyDurationAfterChange() {
            return this.allFlyDurationAfterChange;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setBaggageDetails(String baggageDetails) {
            this.baggageDetails = baggageDetails;
            return this;
        }
        public String getBaggageDetails() {
            return this.baggageDetails;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setFlightStatus(String flightStatus) {
            this.flightStatus = flightStatus;
            return this;
        }
        public String getFlightStatus() {
            return this.flightStatus;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setIataNo(String iataNo) {
            this.iataNo = iataNo;
            return this;
        }
        public String getIataNo() {
            return this.iataNo;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setIsReshopJourney(Boolean isReshopJourney) {
            this.isReshopJourney = isReshopJourney;
            return this;
        }
        public Boolean getIsReshopJourney() {
            return this.isReshopJourney;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setIsTransfer(Boolean isTransfer) {
            this.isTransfer = isTransfer;
            return this;
        }
        public Boolean getIsTransfer() {
            return this.isTransfer;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setJourneyTitle(String journeyTitle) {
            this.journeyTitle = journeyTitle;
            return this;
        }
        public String getJourneyTitle() {
            return this.journeyTitle;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setRefundChangeDetails(String refundChangeDetails) {
            this.refundChangeDetails = refundChangeDetails;
            return this;
        }
        public String getRefundChangeDetails() {
            return this.refundChangeDetails;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys setSegmentList(java.util.List<FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO extends TeaModel {
        @NameInMap("journeys")
        public java.util.List<FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys> journeys;

        @NameInMap("notice_tips")
        public String noticeTips;

        @NameInMap("trip_type")
        public String tripType;

        @NameInMap("trip_type_code")
        public Integer tripTypeCode;

        public static FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO self = new FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO setJourneys(java.util.List<FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys> journeys) {
            this.journeys = journeys;
            return this;
        }
        public java.util.List<FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTOJourneys> getJourneys() {
            return this.journeys;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO setNoticeTips(String noticeTips) {
            this.noticeTips = noticeTips;
            return this;
        }
        public String getNoticeTips() {
            return this.noticeTips;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO setTripType(String tripType) {
            this.tripType = tripType;
            return this;
        }
        public String getTripType() {
            return this.tripType;
        }

        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO setTripTypeCode(Integer tripTypeCode) {
            this.tripTypeCode = tripTypeCode;
            return this;
        }
        public Integer getTripTypeCode() {
            return this.tripTypeCode;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModulePassengerListCredential extends TeaModel {
        @NameInMap("birth_date")
        public String birthDate;

        @NameInMap("cert_issue_date")
        public String certIssueDate;

        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        @NameInMap("credential_no")
        public String credentialNo;

        @NameInMap("drive_licence_first")
        public String driveLicenceFirst;

        @NameInMap("drive_licence_type")
        public String driveLicenceType;

        @NameInMap("expire_date")
        public String expireDate;

        @NameInMap("holder_nationality")
        public String holderNationality;

        @NameInMap("id")
        public Long id;

        @NameInMap("id_check_code")
        public String idCheckCode;

        @NameInMap("issue_country")
        public String issueCountry;

        @NameInMap("type")
        public Integer type;

        public static FlightOrderDetailV2ResponseBodyModulePassengerListCredential build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModulePassengerListCredential self = new FlightOrderDetailV2ResponseBodyModulePassengerListCredential();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setCertIssueDate(String certIssueDate) {
            this.certIssueDate = certIssueDate;
            return this;
        }
        public String getCertIssueDate() {
            return this.certIssueDate;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setCertIssuePlace(String certIssuePlace) {
            this.certIssuePlace = certIssuePlace;
            return this;
        }
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setDriveLicenceFirst(String driveLicenceFirst) {
            this.driveLicenceFirst = driveLicenceFirst;
            return this;
        }
        public String getDriveLicenceFirst() {
            return this.driveLicenceFirst;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setDriveLicenceType(String driveLicenceType) {
            this.driveLicenceType = driveLicenceType;
            return this;
        }
        public String getDriveLicenceType() {
            return this.driveLicenceType;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setHolderNationality(String holderNationality) {
            this.holderNationality = holderNationality;
            return this;
        }
        public String getHolderNationality() {
            return this.holderNationality;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setIdCheckCode(String idCheckCode) {
            this.idCheckCode = idCheckCode;
            return this;
        }
        public String getIdCheckCode() {
            return this.idCheckCode;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setIssueCountry(String issueCountry) {
            this.issueCountry = issueCountry;
            return this;
        }
        public String getIssueCountry() {
            return this.issueCountry;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModulePassengerListCredentials extends TeaModel {
        @NameInMap("birth_date")
        public String birthDate;

        @NameInMap("cert_issue_date")
        public String certIssueDate;

        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        @NameInMap("credential_no")
        public String credentialNo;

        @NameInMap("drive_licence_first")
        public String driveLicenceFirst;

        @NameInMap("drive_licence_type")
        public String driveLicenceType;

        @NameInMap("expire_date")
        public String expireDate;

        @NameInMap("holder_nationality")
        public String holderNationality;

        @NameInMap("id")
        public Long id;

        @NameInMap("id_check_code")
        public String idCheckCode;

        @NameInMap("issue_country")
        public String issueCountry;

        @NameInMap("type")
        public Integer type;

        public static FlightOrderDetailV2ResponseBodyModulePassengerListCredentials build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModulePassengerListCredentials self = new FlightOrderDetailV2ResponseBodyModulePassengerListCredentials();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public String getBirthDate() {
            return this.birthDate;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setCertIssueDate(String certIssueDate) {
            this.certIssueDate = certIssueDate;
            return this;
        }
        public String getCertIssueDate() {
            return this.certIssueDate;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setCertIssuePlace(String certIssuePlace) {
            this.certIssuePlace = certIssuePlace;
            return this;
        }
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setDriveLicenceFirst(String driveLicenceFirst) {
            this.driveLicenceFirst = driveLicenceFirst;
            return this;
        }
        public String getDriveLicenceFirst() {
            return this.driveLicenceFirst;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setDriveLicenceType(String driveLicenceType) {
            this.driveLicenceType = driveLicenceType;
            return this;
        }
        public String getDriveLicenceType() {
            return this.driveLicenceType;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setHolderNationality(String holderNationality) {
            this.holderNationality = holderNationality;
            return this;
        }
        public String getHolderNationality() {
            return this.holderNationality;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setIdCheckCode(String idCheckCode) {
            this.idCheckCode = idCheckCode;
            return this;
        }
        public String getIdCheckCode() {
            return this.idCheckCode;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setIssueCountry(String issueCountry) {
            this.issueCountry = issueCountry;
            return this;
        }
        public String getIssueCountry() {
            return this.issueCountry;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListCredentials setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("open_ticket_status")
        public Integer openTicketStatus;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList self = new FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList setOpenTicketStatus(Integer openTicketStatus) {
            this.openTicketStatus = openTicketStatus;
            return this;
        }
        public Integer getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModulePassengerListTickets extends TeaModel {
        @NameInMap("channel")
        public String channel;

        @NameInMap("journey_title")
        public String journeyTitle;

        @NameInMap("open_ticket_status")
        public String openTicketStatus;

        /**
         * <p>pcc/office</p>
         */
        @NameInMap("pcc")
        public String pcc;

        @NameInMap("segment_open_ticket_list")
        public java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList> segmentOpenTicketList;

        @NameInMap("ticket_auth_memo")
        public String ticketAuthMemo;

        @NameInMap("ticket_auth_status")
        public Integer ticketAuthStatus;

        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_price")
        public Long ticketPrice;

        @NameInMap("ticket_status")
        public String ticketStatus;

        public static FlightOrderDetailV2ResponseBodyModulePassengerListTickets build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModulePassengerListTickets self = new FlightOrderDetailV2ResponseBodyModulePassengerListTickets();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setJourneyTitle(String journeyTitle) {
            this.journeyTitle = journeyTitle;
            return this;
        }
        public String getJourneyTitle() {
            return this.journeyTitle;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setOpenTicketStatus(String openTicketStatus) {
            this.openTicketStatus = openTicketStatus;
            return this;
        }
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setPcc(String pcc) {
            this.pcc = pcc;
            return this;
        }
        public String getPcc() {
            return this.pcc;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setSegmentOpenTicketList(java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList> segmentOpenTicketList) {
            this.segmentOpenTicketList = segmentOpenTicketList;
            return this;
        }
        public java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListTicketsSegmentOpenTicketList> getSegmentOpenTicketList() {
            return this.segmentOpenTicketList;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setTicketAuthMemo(String ticketAuthMemo) {
            this.ticketAuthMemo = ticketAuthMemo;
            return this;
        }
        public String getTicketAuthMemo() {
            return this.ticketAuthMemo;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setTicketAuthStatus(Integer ticketAuthStatus) {
            this.ticketAuthStatus = ticketAuthStatus;
            return this;
        }
        public Integer getTicketAuthStatus() {
            return this.ticketAuthStatus;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerListTickets setTicketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public String getTicketStatus() {
            return this.ticketStatus;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModulePassengerList extends TeaModel {
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("btrip_user_id")
        public String btripUserId;

        @NameInMap("code")
        public Integer code;

        @NameInMap("country")
        public String country;

        @NameInMap("country_code")
        public String countryCode;

        @NameInMap("credential")
        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential credential;

        @NameInMap("credentials")
        public java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListCredentials> credentials;

        @NameInMap("email")
        public String email;

        @NameInMap("en_first_name")
        public String enFirstName;

        @NameInMap("en_last_name")
        public String enLastName;

        @NameInMap("english_name")
        public String englishName;

        @NameInMap("gender")
        public Integer gender;

        @NameInMap("id")
        public String id;

        @NameInMap("is_complete")
        public Boolean isComplete;

        @NameInMap("is_frequently")
        public Boolean isFrequently;

        @NameInMap("memo")
        public String memo;

        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        @NameInMap("mobile_phone_number")
        public String mobilePhoneNumber;

        @NameInMap("name")
        public String name;

        @NameInMap("oneself")
        public Boolean oneself;

        @NameInMap("order_name")
        public String orderName;

        @NameInMap("out_passenger_id")
        public String outPassengerId;

        @NameInMap("phone")
        public String phone;

        @NameInMap("sheng_pi_pinyin")
        public String shengPiPinyin;

        @NameInMap("ticket_nos")
        public java.util.List<String> ticketNos;

        @NameInMap("tickets")
        public java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListTickets> tickets;

        @NameInMap("type")
        public Integer type;

        @NameInMap("user_id")
        public String userId;

        public static FlightOrderDetailV2ResponseBodyModulePassengerList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModulePassengerList self = new FlightOrderDetailV2ResponseBodyModulePassengerList();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setBtripUserId(String btripUserId) {
            this.btripUserId = btripUserId;
            return this;
        }
        public String getBtripUserId() {
            return this.btripUserId;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setCredential(FlightOrderDetailV2ResponseBodyModulePassengerListCredential credential) {
            this.credential = credential;
            return this;
        }
        public FlightOrderDetailV2ResponseBodyModulePassengerListCredential getCredential() {
            return this.credential;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setCredentials(java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListCredentials> credentials) {
            this.credentials = credentials;
            return this;
        }
        public java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListCredentials> getCredentials() {
            return this.credentials;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setEnFirstName(String enFirstName) {
            this.enFirstName = enFirstName;
            return this;
        }
        public String getEnFirstName() {
            return this.enFirstName;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setEnLastName(String enLastName) {
            this.enLastName = enLastName;
            return this;
        }
        public String getEnLastName() {
            return this.enLastName;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setIsComplete(Boolean isComplete) {
            this.isComplete = isComplete;
            return this;
        }
        public Boolean getIsComplete() {
            return this.isComplete;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setIsFrequently(Boolean isFrequently) {
            this.isFrequently = isFrequently;
            return this;
        }
        public Boolean getIsFrequently() {
            return this.isFrequently;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setMobilePhoneNumber(String mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setOneself(Boolean oneself) {
            this.oneself = oneself;
            return this;
        }
        public Boolean getOneself() {
            return this.oneself;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setOrderName(String orderName) {
            this.orderName = orderName;
            return this;
        }
        public String getOrderName() {
            return this.orderName;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setOutPassengerId(String outPassengerId) {
            this.outPassengerId = outPassengerId;
            return this;
        }
        public String getOutPassengerId() {
            return this.outPassengerId;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setShengPiPinyin(String shengPiPinyin) {
            this.shengPiPinyin = shengPiPinyin;
            return this;
        }
        public String getShengPiPinyin() {
            return this.shengPiPinyin;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setTicketNos(java.util.List<String> ticketNos) {
            this.ticketNos = ticketNos;
            return this;
        }
        public java.util.List<String> getTicketNos() {
            return this.ticketNos;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setTickets(java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListTickets> tickets) {
            this.tickets = tickets;
            return this;
        }
        public java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerListTickets> getTickets() {
            return this.tickets;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public FlightOrderDetailV2ResponseBodyModulePassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderDetailV2ResponseBodyModule extends TeaModel {
        @NameInMap("b2g_vip_code")
        public String b2gVipCode;

        @NameInMap("book_succ_time")
        public String bookSuccTime;

        @NameInMap("book_user_id")
        public String bookUserId;

        @NameInMap("book_user_name")
        public String bookUserName;

        @NameInMap("build_price")
        public Long buildPrice;

        @NameInMap("contact_info_d_t_o")
        public FlightOrderDetailV2ResponseBodyModuleContactInfoDTO contactInfoDTO;

        @NameInMap("create_time")
        public String createTime;

        @NameInMap("facevalue")
        public Long facevalue;

        @NameInMap("flight_tale_info_d_t_o")
        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO flightTaleInfoDTO;

        @NameInMap("is_protocol")
        public Boolean isProtocol;

        @NameInMap("isemergency")
        public Boolean isemergency;

        @NameInMap("issendmessage")
        public Boolean issendmessage;

        @NameInMap("oil_price")
        public Long oilPrice;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("order_price")
        public Long orderPrice;

        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("passenger_list")
        public java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerList> passengerList;

        /**
         * <p>key :passengerId</p>
         * <br>
         * <p>value :segmentId</p>
         */
        @NameInMap("passenger_segment_map")
        public java.util.Map<String, String> passengerSegmentMap;

        @NameInMap("pay_time")
        public String payTime;

        @NameInMap("saleprice")
        public Long saleprice;

        @NameInMap("sendcpsms")
        public Boolean sendcpsms;

        @NameInMap("status")
        public Integer status;

        @NameInMap("total_service_fee_price")
        public Long totalServiceFeePrice;

        public static FlightOrderDetailV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderDetailV2ResponseBodyModule self = new FlightOrderDetailV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightOrderDetailV2ResponseBodyModule setB2gVipCode(String b2gVipCode) {
            this.b2gVipCode = b2gVipCode;
            return this;
        }
        public String getB2gVipCode() {
            return this.b2gVipCode;
        }

        public FlightOrderDetailV2ResponseBodyModule setBookSuccTime(String bookSuccTime) {
            this.bookSuccTime = bookSuccTime;
            return this;
        }
        public String getBookSuccTime() {
            return this.bookSuccTime;
        }

        public FlightOrderDetailV2ResponseBodyModule setBookUserId(String bookUserId) {
            this.bookUserId = bookUserId;
            return this;
        }
        public String getBookUserId() {
            return this.bookUserId;
        }

        public FlightOrderDetailV2ResponseBodyModule setBookUserName(String bookUserName) {
            this.bookUserName = bookUserName;
            return this;
        }
        public String getBookUserName() {
            return this.bookUserName;
        }

        public FlightOrderDetailV2ResponseBodyModule setBuildPrice(Long buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Long getBuildPrice() {
            return this.buildPrice;
        }

        public FlightOrderDetailV2ResponseBodyModule setContactInfoDTO(FlightOrderDetailV2ResponseBodyModuleContactInfoDTO contactInfoDTO) {
            this.contactInfoDTO = contactInfoDTO;
            return this;
        }
        public FlightOrderDetailV2ResponseBodyModuleContactInfoDTO getContactInfoDTO() {
            return this.contactInfoDTO;
        }

        public FlightOrderDetailV2ResponseBodyModule setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public FlightOrderDetailV2ResponseBodyModule setFacevalue(Long facevalue) {
            this.facevalue = facevalue;
            return this;
        }
        public Long getFacevalue() {
            return this.facevalue;
        }

        public FlightOrderDetailV2ResponseBodyModule setFlightTaleInfoDTO(FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO flightTaleInfoDTO) {
            this.flightTaleInfoDTO = flightTaleInfoDTO;
            return this;
        }
        public FlightOrderDetailV2ResponseBodyModuleFlightTaleInfoDTO getFlightTaleInfoDTO() {
            return this.flightTaleInfoDTO;
        }

        public FlightOrderDetailV2ResponseBodyModule setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public FlightOrderDetailV2ResponseBodyModule setIsemergency(Boolean isemergency) {
            this.isemergency = isemergency;
            return this;
        }
        public Boolean getIsemergency() {
            return this.isemergency;
        }

        public FlightOrderDetailV2ResponseBodyModule setIssendmessage(Boolean issendmessage) {
            this.issendmessage = issendmessage;
            return this;
        }
        public Boolean getIssendmessage() {
            return this.issendmessage;
        }

        public FlightOrderDetailV2ResponseBodyModule setOilPrice(Long oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Long getOilPrice() {
            return this.oilPrice;
        }

        public FlightOrderDetailV2ResponseBodyModule setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public FlightOrderDetailV2ResponseBodyModule setOrderPrice(Long orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Long getOrderPrice() {
            return this.orderPrice;
        }

        public FlightOrderDetailV2ResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public FlightOrderDetailV2ResponseBodyModule setPassengerList(java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<FlightOrderDetailV2ResponseBodyModulePassengerList> getPassengerList() {
            return this.passengerList;
        }

        public FlightOrderDetailV2ResponseBodyModule setPassengerSegmentMap(java.util.Map<String, String> passengerSegmentMap) {
            this.passengerSegmentMap = passengerSegmentMap;
            return this;
        }
        public java.util.Map<String, String> getPassengerSegmentMap() {
            return this.passengerSegmentMap;
        }

        public FlightOrderDetailV2ResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public FlightOrderDetailV2ResponseBodyModule setSaleprice(Long saleprice) {
            this.saleprice = saleprice;
            return this;
        }
        public Long getSaleprice() {
            return this.saleprice;
        }

        public FlightOrderDetailV2ResponseBodyModule setSendcpsms(Boolean sendcpsms) {
            this.sendcpsms = sendcpsms;
            return this;
        }
        public Boolean getSendcpsms() {
            return this.sendcpsms;
        }

        public FlightOrderDetailV2ResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightOrderDetailV2ResponseBodyModule setTotalServiceFeePrice(Long totalServiceFeePrice) {
            this.totalServiceFeePrice = totalServiceFeePrice;
            return this;
        }
        public Long getTotalServiceFeePrice() {
            return this.totalServiceFeePrice;
        }

    }

}

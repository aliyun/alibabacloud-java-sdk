// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailListOfOrderNumResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public ChangeDetailListOfOrderNumResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

    @NameInMap("success")
    public Boolean success;

    public static ChangeDetailListOfOrderNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailListOfOrderNumResponseBody self = new ChangeDetailListOfOrderNumResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeDetailListOfOrderNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeDetailListOfOrderNumResponseBody setData(ChangeDetailListOfOrderNumResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeDetailListOfOrderNumResponseBodyData getData() {
        return this.data;
    }

    public ChangeDetailListOfOrderNumResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ChangeDetailListOfOrderNumResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public ChangeDetailListOfOrderNumResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ChangeDetailListOfOrderNumResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ChangeDetailListOfOrderNumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee extends TeaModel {
        @NameInMap("service_fee")
        public Double serviceFee;

        @NameInMap("tax_fee")
        public Double taxFee;

        @NameInMap("upgrade_fee")
        public Double upgradeFee;

        public static ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee self = new ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee setTaxFee(Double taxFee) {
            this.taxFee = taxFee;
            return this;
        }
        public Double getTaxFee() {
            return this.taxFee;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee setUpgradeFee(Double upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Double getUpgradeFee() {
            return this.upgradeFee;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger extends TeaModel {
        @NameInMap("document")
        public String document;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("last_name")
        public String lastName;

        public static ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger self = new ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails extends TeaModel {
        @NameInMap("change_fee")
        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee changeFee;

        @NameInMap("passenger")
        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger passenger;

        public static ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails self = new ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails setChangeFee(ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsChangeFee getChangeFee() {
            return this.changeFee;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails setPassenger(ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger passenger) {
            this.passenger = passenger;
            return this;
        }
        public ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetailsPassenger getPassenger() {
            return this.passenger;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers extends TeaModel {
        @NameInMap("document")
        public String document;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("last_name")
        public String lastName;

        public static ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers self = new ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList extends TeaModel {
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        @NameInMap("arrival_time")
        public String arrivalTime;

        @NameInMap("availability")
        public String availability;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("code_share")
        public Boolean codeShare;

        @NameInMap("departure_airport")
        public String departureAirport;

        @NameInMap("departure_city")
        public String departureCity;

        @NameInMap("departure_terminal")
        public String departureTerminal;

        @NameInMap("departure_time")
        public String departureTime;

        @NameInMap("equip_type")
        public String equipType;

        @NameInMap("flight_duration")
        public Integer flightDuration;

        @NameInMap("marketing_airline")
        public String marketingAirline;

        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        @NameInMap("operating_airline")
        public String operatingAirline;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        @NameInMap("segment_id")
        public String segmentId;

        @NameInMap("stop_city_list")
        public String stopCityList;

        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList self = new ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys extends TeaModel {
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList> segmentList;

        @NameInMap("transfer_count")
        public Integer transferCount;

        public static ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys self = new ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys setSegmentList(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListContact extends TeaModel {
        @NameInMap("email")
        public String email;

        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        @NameInMap("mobile_phone_num")
        public String mobilePhoneNum;

        public static ChangeDetailListOfOrderNumResponseBodyDataListContact build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListContact self = new ChangeDetailListOfOrderNumResponseBodyDataListContact();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListContact setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListContact setMobilePhoneNum(String mobilePhoneNum) {
            this.mobilePhoneNum = mobilePhoneNum;
            return this;
        }
        public String getMobilePhoneNum() {
            return this.mobilePhoneNum;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList extends TeaModel {
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        @NameInMap("arrival_time")
        public String arrivalTime;

        @NameInMap("availability")
        public String availability;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("code_share")
        public Boolean codeShare;

        @NameInMap("departure_airport")
        public String departureAirport;

        @NameInMap("departure_city")
        public String departureCity;

        @NameInMap("departure_terminal")
        public String departureTerminal;

        @NameInMap("departure_time")
        public String departureTime;

        @NameInMap("equip_type")
        public String equipType;

        @NameInMap("flight_duration")
        public Integer flightDuration;

        @NameInMap("marketing_airline")
        public String marketingAirline;

        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        @NameInMap("operating_airline")
        public String operatingAirline;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        @NameInMap("segment_id")
        public String segmentId;

        @NameInMap("stop_city_list")
        public String stopCityList;

        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList self = new ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys extends TeaModel {
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList> segmentList;

        @NameInMap("transfer_count")
        public Integer transferCount;

        public static ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys self = new ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys setSegmentList(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListLastJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList extends TeaModel {
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        @NameInMap("arrival_time")
        public String arrivalTime;

        @NameInMap("availability")
        public String availability;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("code_share")
        public Boolean codeShare;

        @NameInMap("departure_airport")
        public String departureAirport;

        @NameInMap("departure_city")
        public String departureCity;

        @NameInMap("departure_terminal")
        public String departureTerminal;

        @NameInMap("departure_time")
        public String departureTime;

        @NameInMap("equip_type")
        public String equipType;

        @NameInMap("flight_duration")
        public Integer flightDuration;

        @NameInMap("marketing_airline")
        public String marketingAirline;

        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        @NameInMap("operating_airline")
        public String operatingAirline;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        @NameInMap("segment_id")
        public String segmentId;

        @NameInMap("stop_city_list")
        public String stopCityList;

        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList self = new ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys extends TeaModel {
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList> segmentList;

        @NameInMap("transfer_count")
        public Integer transferCount;

        public static ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys self = new ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys setSegmentList(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataList extends TeaModel {
        @NameInMap("change_fee_details")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails> changeFeeDetails;

        @NameInMap("change_order_num")
        public Long changeOrderNum;

        @NameInMap("change_passengers")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers> changePassengers;

        @NameInMap("change_reason_type")
        public Integer changeReasonType;

        @NameInMap("changed_journeys")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys> changedJourneys;

        @NameInMap("close_reason")
        public String closeReason;

        @NameInMap("close_utc_time")
        public Long closeUtcTime;

        @NameInMap("contact")
        public ChangeDetailListOfOrderNumResponseBodyDataListContact contact;

        @NameInMap("create_utc_time")
        public Long createUtcTime;

        @NameInMap("last_confirm_utc_time")
        public Long lastConfirmUtcTime;

        @NameInMap("last_journeys")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys> lastJourneys;

        @NameInMap("order_num")
        public Long orderNum;

        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("original_journeys")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys> originalJourneys;

        @NameInMap("pay_status")
        public Integer payStatus;

        @NameInMap("pay_success_utc_time")
        public Long paySuccessUtcTime;

        @NameInMap("total_amount")
        public Double totalAmount;

        @NameInMap("transaction_no")
        public String transactionNo;

        public static ChangeDetailListOfOrderNumResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataList self = new ChangeDetailListOfOrderNumResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setChangeFeeDetails(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails> changeFeeDetails) {
            this.changeFeeDetails = changeFeeDetails;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangeFeeDetails> getChangeFeeDetails() {
            return this.changeFeeDetails;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setChangeOrderNum(Long changeOrderNum) {
            this.changeOrderNum = changeOrderNum;
            return this;
        }
        public Long getChangeOrderNum() {
            return this.changeOrderNum;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setChangePassengers(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers> changePassengers) {
            this.changePassengers = changePassengers;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangePassengers> getChangePassengers() {
            return this.changePassengers;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setChangeReasonType(Integer changeReasonType) {
            this.changeReasonType = changeReasonType;
            return this;
        }
        public Integer getChangeReasonType() {
            return this.changeReasonType;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setChangedJourneys(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys> changedJourneys) {
            this.changedJourneys = changedJourneys;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListChangedJourneys> getChangedJourneys() {
            return this.changedJourneys;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setCloseReason(String closeReason) {
            this.closeReason = closeReason;
            return this;
        }
        public String getCloseReason() {
            return this.closeReason;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setCloseUtcTime(Long closeUtcTime) {
            this.closeUtcTime = closeUtcTime;
            return this;
        }
        public Long getCloseUtcTime() {
            return this.closeUtcTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setContact(ChangeDetailListOfOrderNumResponseBodyDataListContact contact) {
            this.contact = contact;
            return this;
        }
        public ChangeDetailListOfOrderNumResponseBodyDataListContact getContact() {
            return this.contact;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setCreateUtcTime(Long createUtcTime) {
            this.createUtcTime = createUtcTime;
            return this;
        }
        public Long getCreateUtcTime() {
            return this.createUtcTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setLastConfirmUtcTime(Long lastConfirmUtcTime) {
            this.lastConfirmUtcTime = lastConfirmUtcTime;
            return this;
        }
        public Long getLastConfirmUtcTime() {
            return this.lastConfirmUtcTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setLastJourneys(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys> lastJourneys) {
            this.lastJourneys = lastJourneys;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListLastJourneys> getLastJourneys() {
            return this.lastJourneys;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setOriginalJourneys(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys> originalJourneys) {
            this.originalJourneys = originalJourneys;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataListOriginalJourneys> getOriginalJourneys() {
            return this.originalJourneys;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setPaySuccessUtcTime(Long paySuccessUtcTime) {
            this.paySuccessUtcTime = paySuccessUtcTime;
            return this;
        }
        public Long getPaySuccessUtcTime() {
            return this.paySuccessUtcTime;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setTotalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Double getTotalAmount() {
            return this.totalAmount;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataList setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyDataPagination extends TeaModel {
        @NameInMap("current_page")
        public Integer currentPage;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_count")
        public Integer totalCount;

        @NameInMap("total_page")
        public Integer totalPage;

        public static ChangeDetailListOfOrderNumResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyDataPagination self = new ChangeDetailListOfOrderNumResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyDataPagination setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ChangeDetailListOfOrderNumResponseBodyDataPagination setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

    public static class ChangeDetailListOfOrderNumResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataList> list;

        @NameInMap("pagination")
        public ChangeDetailListOfOrderNumResponseBodyDataPagination pagination;

        public static ChangeDetailListOfOrderNumResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailListOfOrderNumResponseBodyData self = new ChangeDetailListOfOrderNumResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeDetailListOfOrderNumResponseBodyData setList(java.util.List<ChangeDetailListOfOrderNumResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ChangeDetailListOfOrderNumResponseBodyDataList> getList() {
            return this.list;
        }

        public ChangeDetailListOfOrderNumResponseBodyData setPagination(ChangeDetailListOfOrderNumResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public ChangeDetailListOfOrderNumResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The data returned for a successful request.</p>
     */
    @NameInMap("data")
    public ChangeDetailResponseBodyData data;

    /**
     * <p>The business error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>The data returned with the error.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>The HTTP status code. The value is always 200 for successful HTTP requests.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ChangeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeDetailResponseBody self = new ChangeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeDetailResponseBody setData(ChangeDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeDetailResponseBodyData getData() {
        return this.data;
    }

    public ChangeDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ChangeDetailResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public ChangeDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ChangeDetailResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ChangeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee extends TeaModel {
        /**
         * <p>The service fee.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        @NameInMap("suez_service_fee")
        public Double suezServiceFee;

        /**
         * <p>The change tax fee.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("tax_fee")
        public Double taxFee;

        /**
         * <p>The upgrade fee.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("upgrade_fee")
        public Double upgradeFee;

        public static ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee self = new ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee setSuezServiceFee(Double suezServiceFee) {
            this.suezServiceFee = suezServiceFee;
            return this;
        }
        public Double getSuezServiceFee() {
            return this.suezServiceFee;
        }

        public ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee setTaxFee(Double taxFee) {
            this.taxFee = taxFee;
            return this;
        }
        public Double getTaxFee() {
            return this.taxFee;
        }

        public ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee setUpgradeFee(Double upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Double getUpgradeFee() {
            return this.upgradeFee;
        }

    }

    public static class ChangeDetailResponseBodyDataChangeFeeDetailsPassenger extends TeaModel {
        /**
         * <p>The document number.</p>
         * 
         * <strong>example:</strong>
         * <p>411***********4411</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>The first name of the passenger.</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>The last name of the passenger.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        public static ChangeDetailResponseBodyDataChangeFeeDetailsPassenger build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataChangeFeeDetailsPassenger self = new ChangeDetailResponseBodyDataChangeFeeDetailsPassenger();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataChangeFeeDetailsPassenger setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public ChangeDetailResponseBodyDataChangeFeeDetailsPassenger setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ChangeDetailResponseBodyDataChangeFeeDetailsPassenger setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class ChangeDetailResponseBodyDataChangeFeeDetails extends TeaModel {
        /**
         * <p>The change fee details for the passenger.</p>
         */
        @NameInMap("change_fee")
        public ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee changeFee;

        /**
         * <p>The passenger information for the change.</p>
         */
        @NameInMap("passenger")
        public ChangeDetailResponseBodyDataChangeFeeDetailsPassenger passenger;

        public static ChangeDetailResponseBodyDataChangeFeeDetails build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataChangeFeeDetails self = new ChangeDetailResponseBodyDataChangeFeeDetails();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataChangeFeeDetails setChangeFee(ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee getChangeFee() {
            return this.changeFee;
        }

        public ChangeDetailResponseBodyDataChangeFeeDetails setPassenger(ChangeDetailResponseBodyDataChangeFeeDetailsPassenger passenger) {
            this.passenger = passenger;
            return this;
        }
        public ChangeDetailResponseBodyDataChangeFeeDetailsPassenger getPassenger() {
            return this.passenger;
        }

    }

    public static class ChangeDetailResponseBodyDataChangePassengers extends TeaModel {
        /**
         * <p>The document number.</p>
         * 
         * <strong>example:</strong>
         * <p>411***********4411</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>The first name of the passenger.</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>The last name of the passenger.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        public static ChangeDetailResponseBodyDataChangePassengers build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataChangePassengers self = new ChangeDetailResponseBodyDataChangePassengers();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataChangePassengers setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public ChangeDetailResponseBodyDataChangePassengers setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ChangeDetailResponseBodyDataChangePassengers setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class ChangeDetailResponseBodyDataChangedJourneysSegmentList extends TeaModel {
        /**
         * <p>The three-letter IATA code of the arrival airport (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>The three-letter IATA code of the arrival city (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>The arrival terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>The arrival date and time in string format (yyyy-MM-dd HH:mm:ss).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>The number of remaining seats.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>The cabin code.</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>The cabin class.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>Indicates whether the flight is a codeshare flight.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>The three-letter IATA code of the departure airport (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>The three-letter IATA code of the departure city (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>The departure terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>The departure date and time in string format (yyyy-MM-dd HH:mm:ss).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>The aircraft type.</p>
         * 
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <p>The flight duration, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>The marketing airline code (such as HO).</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>The marketing flight number (such as HO1295).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>The numeric marketing flight number (such as 1295).</p>
         * 
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>The operating airline code (such as CX).</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>The operating flight number (such as CX601).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>The segment ID. Format: flight number + departure airport + arrival airport + departure date (MMdd).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>The list of stopover cities. This parameter has a value when stopQuantity is greater than 0. Multiple cities are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>The number of stopover cities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static ChangeDetailResponseBodyDataChangedJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataChangedJourneysSegmentList self = new ChangeDetailResponseBodyDataChangedJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public ChangeDetailResponseBodyDataChangedJourneysSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class ChangeDetailResponseBodyDataChangedJourneys extends TeaModel {
        /**
         * <p>The segment information.</p>
         */
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailResponseBodyDataChangedJourneysSegmentList> segmentList;

        /**
         * <p>The number of transfers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static ChangeDetailResponseBodyDataChangedJourneys build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataChangedJourneys self = new ChangeDetailResponseBodyDataChangedJourneys();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataChangedJourneys setSegmentList(java.util.List<ChangeDetailResponseBodyDataChangedJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<ChangeDetailResponseBodyDataChangedJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public ChangeDetailResponseBodyDataChangedJourneys setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class ChangeDetailResponseBodyDataContact extends TeaModel {
        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p>gao******@gmail.com</p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>The country calling code.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        /**
         * <p>The mobile phone number of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>183*****92</p>
         */
        @NameInMap("mobile_phone_num")
        public String mobilePhoneNum;

        public static ChangeDetailResponseBodyDataContact build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataContact self = new ChangeDetailResponseBodyDataContact();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ChangeDetailResponseBodyDataContact setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public ChangeDetailResponseBodyDataContact setMobilePhoneNum(String mobilePhoneNum) {
            this.mobilePhoneNum = mobilePhoneNum;
            return this;
        }
        public String getMobilePhoneNum() {
            return this.mobilePhoneNum;
        }

    }

    public static class ChangeDetailResponseBodyDataLastJourneysSegmentList extends TeaModel {
        /**
         * <p>The three-letter IATA code of the arrival airport (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>The three-letter IATA code of the arrival city (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>The arrival terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>The arrival date and time in string format (yyyy-MM-dd HH:mm:ss).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>The number of remaining seats.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>The cabin code.</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>The cabin class.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>Indicates whether the flight is a codeshare flight.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>The three-letter IATA code of the departure airport (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>The three-letter IATA code of the departure city (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>The departure terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>The departure date and time in string format (yyyy-MM-dd HH:mm:ss).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>The aircraft type.</p>
         * 
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <p>The flight duration, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>The marketing airline code (such as HO).</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>The marketing flight number (such as HO1295).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>The numeric marketing flight number (such as 1295).</p>
         * 
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>The operating airline code (such as CX).</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>The operating flight number (such as CX601).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>The segment ID. Format: flight number + departure airport + arrival airport + departure date (MMdd).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>The list of stopover cities. This parameter has a value when stopQuantity is greater than 0. Multiple cities are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>The number of stopover cities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static ChangeDetailResponseBodyDataLastJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataLastJourneysSegmentList self = new ChangeDetailResponseBodyDataLastJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public ChangeDetailResponseBodyDataLastJourneysSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class ChangeDetailResponseBodyDataLastJourneys extends TeaModel {
        /**
         * <p>The segment information.</p>
         */
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailResponseBodyDataLastJourneysSegmentList> segmentList;

        /**
         * <p>The number of transfers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static ChangeDetailResponseBodyDataLastJourneys build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataLastJourneys self = new ChangeDetailResponseBodyDataLastJourneys();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataLastJourneys setSegmentList(java.util.List<ChangeDetailResponseBodyDataLastJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<ChangeDetailResponseBodyDataLastJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public ChangeDetailResponseBodyDataLastJourneys setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class ChangeDetailResponseBodyDataOriginalJourneysSegmentList extends TeaModel {
        /**
         * <p>The three-letter IATA code of the arrival airport (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>The three-letter IATA code of the arrival city (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>The arrival terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>The arrival date and time in string format (yyyy-MM-dd HH:mm:ss).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>The number of remaining seats.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>The cabin code.</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>The cabin class.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>Indicates whether the flight is a codeshare flight.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>The three-letter IATA code of the departure airport (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>The three-letter IATA code of the departure city (uppercase).</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>The departure terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>The departure date and time in string format (yyyy-MM-dd HH:mm:ss).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>The aircraft type.</p>
         * 
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <p>The flight duration, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>The marketing airline code (such as HO).</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>The marketing flight number (such as HO1295).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>The numeric marketing flight number (such as 1295).</p>
         * 
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>The operating airline code (such as CX).</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>The operating flight number (such as CX601).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>The segment ID. Format: flight number + departure airport + arrival airport + departure date (MMdd).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>The list of stopover cities. This parameter has a value when stopQuantity is greater than 0. Multiple cities are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>The number of stopover cities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static ChangeDetailResponseBodyDataOriginalJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataOriginalJourneysSegmentList self = new ChangeDetailResponseBodyDataOriginalJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public ChangeDetailResponseBodyDataOriginalJourneysSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class ChangeDetailResponseBodyDataOriginalJourneys extends TeaModel {
        /**
         * <p>The segment information.</p>
         */
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailResponseBodyDataOriginalJourneysSegmentList> segmentList;

        /**
         * <p>The number of transfers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static ChangeDetailResponseBodyDataOriginalJourneys build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyDataOriginalJourneys self = new ChangeDetailResponseBodyDataOriginalJourneys();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyDataOriginalJourneys setSegmentList(java.util.List<ChangeDetailResponseBodyDataOriginalJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<ChangeDetailResponseBodyDataOriginalJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public ChangeDetailResponseBodyDataOriginalJourneys setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class ChangeDetailResponseBodyData extends TeaModel {
        /**
         * <p>The change fee details at the passenger level.</p>
         */
        @NameInMap("change_fee_details")
        public java.util.List<ChangeDetailResponseBodyDataChangeFeeDetails> changeFeeDetails;

        /**
         * <p>The change order number.</p>
         * 
         * <strong>example:</strong>
         * <p>4988430***950</p>
         */
        @NameInMap("change_order_num")
        public Long changeOrderNum;

        /**
         * <p>The list of passengers for the flight change.</p>
         */
        @NameInMap("change_passengers")
        public java.util.List<ChangeDetailResponseBodyDataChangePassengers> changePassengers;

        /**
         * <p>The type of the change reason. Valid values:</p>
         * <ul>
         * <li>0: voluntary date change</li>
         * <li>1: flight schedule change or flight cancellation</li>
         * <li>2: change due to pandemic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("change_reason_type")
        public Integer changeReasonType;

        /**
         * <p>The journeys after the change.</p>
         */
        @NameInMap("changed_journeys")
        public java.util.List<ChangeDetailResponseBodyDataChangedJourneys> changedJourneys;

        /**
         * <p>The reason for closing the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>reason desc</p>
         */
        @NameInMap("close_reason")
        public String closeReason;

        /**
         * <p>The time when the order was closed, in UTC timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1677415244000</p>
         */
        @NameInMap("close_utc_time")
        public Long closeUtcTime;

        /**
         * <p>The contact information for the change order.</p>
         */
        @NameInMap("contact")
        public ChangeDetailResponseBodyDataContact contact;

        /**
         * <p>The creation time of the change order, in UTC timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1677415276000</p>
         */
        @NameInMap("create_utc_time")
        public Long createUtcTime;

        /**
         * <p>The latest payment deadline for the buyer, in UTC timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1677415278000</p>
         */
        @NameInMap("last_confirm_utc_time")
        public Long lastConfirmUtcTime;

        /**
         * <p>The journeys from the previous change.</p>
         */
        @NameInMap("last_journeys")
        public java.util.List<ChangeDetailResponseBodyDataLastJourneys> lastJourneys;

        /**
         * <p>The order number.</p>
         * 
         * <strong>example:</strong>
         * <p>5988430***541</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        /**
         * <p>The status of the change order. Valid values:</p>
         * <ul>
         * <li>0: initial state</li>
         * <li>1: pending payment</li>
         * <li>2: payment successful</li>
         * <li>3: change successful</li>
         * <li>4: change closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        /**
         * <p>The original journeys.</p>
         */
        @NameInMap("original_journeys")
        public java.util.List<ChangeDetailResponseBodyDataOriginalJourneys> originalJourneys;

        /**
         * <p>The payment status. Valid values:</p>
         * <ul>
         * <li>0: initial state</li>
         * <li>1: pending payment</li>
         * <li>2: payment successful</li>
         * <li>4: paid order closed successfully</li>
         * <li>5: unpaid order closed successfully.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <p>The time when the buyer completed the payment, in UTC timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1677415255000</p>
         */
        @NameInMap("pay_success_utc_time")
        public Long paySuccessUtcTime;

        /**
         * <p>The total payment amount of the change order.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("total_amount")
        public Double totalAmount;

        /**
         * <p>The transaction number.</p>
         * 
         * <strong>example:</strong>
         * <p>hkduendkd-2023-dj0</p>
         */
        @NameInMap("transaction_no")
        public String transactionNo;

        public static ChangeDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeDetailResponseBodyData self = new ChangeDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeDetailResponseBodyData setChangeFeeDetails(java.util.List<ChangeDetailResponseBodyDataChangeFeeDetails> changeFeeDetails) {
            this.changeFeeDetails = changeFeeDetails;
            return this;
        }
        public java.util.List<ChangeDetailResponseBodyDataChangeFeeDetails> getChangeFeeDetails() {
            return this.changeFeeDetails;
        }

        public ChangeDetailResponseBodyData setChangeOrderNum(Long changeOrderNum) {
            this.changeOrderNum = changeOrderNum;
            return this;
        }
        public Long getChangeOrderNum() {
            return this.changeOrderNum;
        }

        public ChangeDetailResponseBodyData setChangePassengers(java.util.List<ChangeDetailResponseBodyDataChangePassengers> changePassengers) {
            this.changePassengers = changePassengers;
            return this;
        }
        public java.util.List<ChangeDetailResponseBodyDataChangePassengers> getChangePassengers() {
            return this.changePassengers;
        }

        public ChangeDetailResponseBodyData setChangeReasonType(Integer changeReasonType) {
            this.changeReasonType = changeReasonType;
            return this;
        }
        public Integer getChangeReasonType() {
            return this.changeReasonType;
        }

        public ChangeDetailResponseBodyData setChangedJourneys(java.util.List<ChangeDetailResponseBodyDataChangedJourneys> changedJourneys) {
            this.changedJourneys = changedJourneys;
            return this;
        }
        public java.util.List<ChangeDetailResponseBodyDataChangedJourneys> getChangedJourneys() {
            return this.changedJourneys;
        }

        public ChangeDetailResponseBodyData setCloseReason(String closeReason) {
            this.closeReason = closeReason;
            return this;
        }
        public String getCloseReason() {
            return this.closeReason;
        }

        public ChangeDetailResponseBodyData setCloseUtcTime(Long closeUtcTime) {
            this.closeUtcTime = closeUtcTime;
            return this;
        }
        public Long getCloseUtcTime() {
            return this.closeUtcTime;
        }

        public ChangeDetailResponseBodyData setContact(ChangeDetailResponseBodyDataContact contact) {
            this.contact = contact;
            return this;
        }
        public ChangeDetailResponseBodyDataContact getContact() {
            return this.contact;
        }

        public ChangeDetailResponseBodyData setCreateUtcTime(Long createUtcTime) {
            this.createUtcTime = createUtcTime;
            return this;
        }
        public Long getCreateUtcTime() {
            return this.createUtcTime;
        }

        public ChangeDetailResponseBodyData setLastConfirmUtcTime(Long lastConfirmUtcTime) {
            this.lastConfirmUtcTime = lastConfirmUtcTime;
            return this;
        }
        public Long getLastConfirmUtcTime() {
            return this.lastConfirmUtcTime;
        }

        public ChangeDetailResponseBodyData setLastJourneys(java.util.List<ChangeDetailResponseBodyDataLastJourneys> lastJourneys) {
            this.lastJourneys = lastJourneys;
            return this;
        }
        public java.util.List<ChangeDetailResponseBodyDataLastJourneys> getLastJourneys() {
            return this.lastJourneys;
        }

        public ChangeDetailResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public ChangeDetailResponseBodyData setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public ChangeDetailResponseBodyData setOriginalJourneys(java.util.List<ChangeDetailResponseBodyDataOriginalJourneys> originalJourneys) {
            this.originalJourneys = originalJourneys;
            return this;
        }
        public java.util.List<ChangeDetailResponseBodyDataOriginalJourneys> getOriginalJourneys() {
            return this.originalJourneys;
        }

        public ChangeDetailResponseBodyData setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public ChangeDetailResponseBodyData setPaySuccessUtcTime(Long paySuccessUtcTime) {
            this.paySuccessUtcTime = paySuccessUtcTime;
            return this;
        }
        public Long getPaySuccessUtcTime() {
            return this.paySuccessUtcTime;
        }

        public ChangeDetailResponseBodyData setTotalAmount(Double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Double getTotalAmount() {
            return this.totalAmount;
        }

        public ChangeDetailResponseBodyData setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

    }

}

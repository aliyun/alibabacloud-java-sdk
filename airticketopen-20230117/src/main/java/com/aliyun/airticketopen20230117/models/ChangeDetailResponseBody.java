// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeDetailResponseBody extends TeaModel {
    /**
     * <p>Request RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Correctly processed return data</p>
     */
    @NameInMap("data")
    public ChangeDetailResponseBodyData data;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>Data carried in error handling</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>HTTP request successful, status value is 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>Whether it is successful</p>
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
         * <p>fare penalty</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        /**
         * <p>tax penalty</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("tax_fee")
        public Double taxFee;

        /**
         * <p>price difference</p>
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
         * <p>Document number</p>
         * 
         * <strong>example:</strong>
         * <p>411***********4411</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>Passenger\&quot;s first name</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>Passenger\&quot;s last name</p>
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
         * <p>Change fee details for the passenger</p>
         */
        @NameInMap("change_fee")
        public ChangeDetailResponseBodyDataChangeFeeDetailsChangeFee changeFee;

        /**
         * <p>Information of the passenger for the change</p>
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
         * <p>Document number</p>
         * 
         * <strong>example:</strong>
         * <p>411***********4411</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>Passenger first name</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>Passenger last name</p>
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
         * <p>Arrival airport three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>Arrival city three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>Arrival terminal of the flight</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>Flight arrival date and time, in the format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>Number of available seats</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>RBD</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>service class ( compartment )</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>Whether it is a code-share flight</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>Departure airport three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>Departure city three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>Departure terminal of the flight</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>Flight departure date and time, in the format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>Aircraft type</p>
         * 
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <p>Flight duration in minutes</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>Market airline (e.g., HO)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>Marketing flight number (e.g., HO1295)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>Marketing flight number (e.g., 1295)</p>
         * 
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>Operating airline (e.g., CX)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>Operating flight number (e.g., CX601)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>Segment ID format: flight number + departure airport + arrival airport + departure date (MMdd)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>List of stop cities, with values when stopQuantity &gt; 0, separated by commas</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>Number of stop cities</p>
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
         * <p>Segment information</p>
         */
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailResponseBodyDataChangedJourneysSegmentList> segmentList;

        /**
         * <p>Number of transfers</p>
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
         * <p>Email address</p>
         * 
         * <strong>example:</strong>
         * <p>gao******@gmail.com</p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>Country code</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        /**
         * <p>Contact\&quot;s mobile phone number</p>
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
         * <p>Arrival airport three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>Arrival city three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>Arrival terminal of the flight</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>Flight arrival date and time, in the format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>Number of available seats</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>RBD</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>service class ( compartment )</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>Whether it is a codeshare flight</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>Departure airport three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>Departure city three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>Departure terminal of the flight</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>Flight departure date and time, in the format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>Aircraft type</p>
         * 
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <p>Flight duration in minutes</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>Marketing airline (e.g., HO)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>Marketing flight number (e.g., HO1295)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>Marketing flight number (e.g., 1295)</p>
         * 
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>Operating airline (e.g., CX)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>Operating flight number (e.g., CX601)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>Segment ID format: flight number + departure airport + arrival airport + departure date (MMdd)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>List of stop cities, with values when stopQuantity &gt; 0, separated by commas</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>Number of stop cities</p>
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
         * <p>Segment information</p>
         */
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailResponseBodyDataLastJourneysSegmentList> segmentList;

        /**
         * <p>Number of transfers</p>
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
         * <p>Arrival airport three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>Arrival city three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>Arrival terminal of the flight</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>Flight arrival date and time in string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>Number of available seats</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>RBD</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>service class ( compartment )</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>Whether it is a codeshare flight</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>Departure airport three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>Departure city three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>Departure terminal of the flight</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>Flight departure date and time in string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>Aircraft type</p>
         * 
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <p>Flight duration in minutes</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>Marketing airline (e.g., HO)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>Marketing flight number (e.g., HO1295)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>Marketing airline\&quot;s numeric flight number (e.g., 1295)</p>
         * 
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>Operating airline (e.g., CX)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>Operating airline\&quot;s flight number (e.g., CX601)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>Segment ID format: flight number + departure airport + arrival airport + departure date (yyyyMMdd)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>List of stop cities, with values when stopQuantity &gt; 0, separated by commas</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>Number of stop cities</p>
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
         * <p>Segment information</p>
         */
        @NameInMap("segment_list")
        public java.util.List<ChangeDetailResponseBodyDataOriginalJourneysSegmentList> segmentList;

        /**
         * <p>Number of transfers</p>
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
         * <p>Change fee details, per passenger</p>
         */
        @NameInMap("change_fee_details")
        public java.util.List<ChangeDetailResponseBodyDataChangeFeeDetails> changeFeeDetails;

        /**
         * <p>Change order number</p>
         * 
         * <strong>example:</strong>
         * <p>4988430***950</p>
         */
        @NameInMap("change_order_num")
        public Long changeOrderNum;

        /**
         * <p>List of passengers for the change</p>
         */
        @NameInMap("change_passengers")
        public java.util.List<ChangeDetailResponseBodyDataChangePassengers> changePassengers;

        /**
         * <p>Change reason type. 
         * 0: Voluntary change; 
         * 1: Involuntary change, due to flight delay or cancellation, schedule changes, or other airline reasons; 
         * 2: Involuntary change, due to health reasons with a medical report</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("change_reason_type")
        public Integer changeReasonType;

        /**
         * <p>New journeys</p>
         */
        @NameInMap("changed_journeys")
        public java.util.List<ChangeDetailResponseBodyDataChangedJourneys> changedJourneys;

        /**
         * <p>Reason for closing the change order</p>
         * 
         * <strong>example:</strong>
         * <p>reason desc</p>
         */
        @NameInMap("close_reason")
        public String closeReason;

        /**
         * <p>The time when the order was closed, in UTC timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1677415244000</p>
         */
        @NameInMap("close_utc_time")
        public Long closeUtcTime;

        /**
         * <p>Contact information for the change request</p>
         */
        @NameInMap("contact")
        public ChangeDetailResponseBodyDataContact contact;

        /**
         * <p>Creation time of the change order, UTC timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1677415276000</p>
         */
        @NameInMap("create_utc_time")
        public Long createUtcTime;

        /**
         * <p>Latest payment time for the buyer, UTC timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1677415278000</p>
         */
        @NameInMap("last_confirm_utc_time")
        public Long lastConfirmUtcTime;

        /**
         * <p>The itinerary of the last change</p>
         */
        @NameInMap("last_journeys")
        public java.util.List<ChangeDetailResponseBodyDataLastJourneys> lastJourneys;

        /**
         * <p>Ticketing Order number</p>
         * 
         * <strong>example:</strong>
         * <p>5988430***541</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        /**
         * <p>Change order status 0: Initial state; 1: Pending payment; 2: Payment successful; 3: Change successful; 4: Change closed</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        /**
         * <p>Original journeys</p>
         */
        @NameInMap("original_journeys")
        public java.util.List<ChangeDetailResponseBodyDataOriginalJourneys> originalJourneys;

        /**
         * <p>Payment status 0: initial state; 1: pending payment; 2: payment successful; 4: successfully closed paid order; 5: successfully closed unpaid order</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <p>The time when the buyer successfully paid, in UTC timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>1677415255000</p>
         */
        @NameInMap("pay_success_utc_time")
        public Long paySuccessUtcTime;

        /**
         * <p>Total payment amount for the change order</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("total_amount")
        public Double totalAmount;

        /**
         * <p>Transaction serial number</p>
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

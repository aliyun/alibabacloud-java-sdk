// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeApplyRequest extends TeaModel {
    /**
     * <p>The list of passengers for the change.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("change_passenger_list")
    public java.util.List<ChangeApplyRequestChangePassengerList> changePassengerList;

    /**
     * <p>The target journey for the change.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("changed_journeys")
    public java.util.List<ChangeApplyRequestChangedJourneys> changedJourneys;

    /**
     * <p>The contact information for the change.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact")
    public ChangeApplyRequestContact contact;

    /**
     * <p>The order number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4988430***950</p>
     */
    @NameInMap("order_num")
    public Long orderNum;

    /**
     * <p>The buyer remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>remark desc</p>
     */
    @NameInMap("remark")
    public String remark;

    /**
     * <p>The change type. Valid values:</p>
     * <ul>
     * <li>0: voluntary change</li>
     * <li>1: flight schedule change or flight cancellation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    public Integer type;

    public static ChangeApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeApplyRequest self = new ChangeApplyRequest();
        return TeaModel.build(map, self);
    }

    public ChangeApplyRequest setChangePassengerList(java.util.List<ChangeApplyRequestChangePassengerList> changePassengerList) {
        this.changePassengerList = changePassengerList;
        return this;
    }
    public java.util.List<ChangeApplyRequestChangePassengerList> getChangePassengerList() {
        return this.changePassengerList;
    }

    public ChangeApplyRequest setChangedJourneys(java.util.List<ChangeApplyRequestChangedJourneys> changedJourneys) {
        this.changedJourneys = changedJourneys;
        return this;
    }
    public java.util.List<ChangeApplyRequestChangedJourneys> getChangedJourneys() {
        return this.changedJourneys;
    }

    public ChangeApplyRequest setContact(ChangeApplyRequestContact contact) {
        this.contact = contact;
        return this;
    }
    public ChangeApplyRequestContact getContact() {
        return this.contact;
    }

    public ChangeApplyRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public ChangeApplyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ChangeApplyRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public static class ChangeApplyRequestChangePassengerList extends TeaModel {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>The last name of the passenger.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        public static ChangeApplyRequestChangePassengerList build(java.util.Map<String, ?> map) throws Exception {
            ChangeApplyRequestChangePassengerList self = new ChangeApplyRequestChangePassengerList();
            return TeaModel.build(map, self);
        }

        public ChangeApplyRequestChangePassengerList setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public ChangeApplyRequestChangePassengerList setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ChangeApplyRequestChangePassengerList setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class ChangeApplyRequestChangedJourneysSegmentList extends TeaModel {
        /**
         * <p>The three-letter IATA code of the arrival airport.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>The three-letter IATA code of the arrival city.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>The arrival terminal of the flight.</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrive_terminal")
        public String arriveTerminal;

        /**
         * <p>(该属性废弃)航班到达日期时间，utc时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1677232999000</p>
         */
        @NameInMap("arrive_time")
        public Long arriveTime;

        /**
         * <p>(必填参数)航班到达日期时间，航班的旅行时间，格式：yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-20 12:30:00</p>
         */
        @NameInMap("arrive_time_str")
        public String arriveTimeStr;

        /**
         * <p>Indicates whether the flight is a codeshare flight.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>The three-letter IATA code of the departure airport.</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>The three-letter IATA code of the departure city.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>The departure date (for example, yyyyMMdd).
         * <a href="Deprecated">_single.params.changed_journeys.items.segment_list.items.departure_time.desc</a> The departure date and time of the flight, in UTC timestamp.
         * <a href="Required">_single.params.changed_journeys.items.segment_list.items.departure_time_str.desc</a> The departure date and time of the flight, in local travel time. Format: yyyy-MM-dd HH:mm:ss.
         * <a href="Deprecated">_single.params.changed_journeys.items.segment_list.items.arrive_time.desc</a> The arrival date and time of the flight, in UTC timestamp.
         * <a href="Required">_single.params.changed_journeys.items.segment_list.items.arrive_time_str.desc</a> The arrival date and time of the flight, in local travel time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20230320</p>
         */
        @NameInMap("departure_date")
        public String departureDate;

        /**
         * <p>The departure terminal of the flight.</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>(该属性废弃)航班起飞日期，utc时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1677232998000</p>
         */
        @NameInMap("departure_time")
        public Long departureTime;

        /**
         * <p>(必填参数)航班起飞日期时间，航班的旅行时间，格式：yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-20 09:30:00</p>
         */
        @NameInMap("departure_time_str")
        public String departureTimeStr;

        /**
         * <p>The marketing flight number (such as KA5809).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>The operating flight number (such as CX601).</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static ChangeApplyRequestChangedJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            ChangeApplyRequestChangedJourneysSegmentList self = new ChangeApplyRequestChangedJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public ChangeApplyRequestChangedJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setArriveTerminal(String arriveTerminal) {
            this.arriveTerminal = arriveTerminal;
            return this;
        }
        public String getArriveTerminal() {
            return this.arriveTerminal;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setArriveTime(Long arriveTime) {
            this.arriveTime = arriveTime;
            return this;
        }
        public Long getArriveTime() {
            return this.arriveTime;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setArriveTimeStr(String arriveTimeStr) {
            this.arriveTimeStr = arriveTimeStr;
            return this;
        }
        public String getArriveTimeStr() {
            return this.arriveTimeStr;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
            return this;
        }
        public String getDepartureDate() {
            return this.departureDate;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setDepartureTime(Long departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public Long getDepartureTime() {
            return this.departureTime;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setDepartureTimeStr(String departureTimeStr) {
            this.departureTimeStr = departureTimeStr;
            return this;
        }
        public String getDepartureTimeStr() {
            return this.departureTimeStr;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public ChangeApplyRequestChangedJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class ChangeApplyRequestChangedJourneys extends TeaModel {
        /**
         * <p>The list of target segments for the change.</p>
         */
        @NameInMap("segment_list")
        public java.util.List<ChangeApplyRequestChangedJourneysSegmentList> segmentList;

        public static ChangeApplyRequestChangedJourneys build(java.util.Map<String, ?> map) throws Exception {
            ChangeApplyRequestChangedJourneys self = new ChangeApplyRequestChangedJourneys();
            return TeaModel.build(map, self);
        }

        public ChangeApplyRequestChangedJourneys setSegmentList(java.util.List<ChangeApplyRequestChangedJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<ChangeApplyRequestChangedJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

    }

    public static class ChangeApplyRequestContact extends TeaModel {
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

        public static ChangeApplyRequestContact build(java.util.Map<String, ?> map) throws Exception {
            ChangeApplyRequestContact self = new ChangeApplyRequestContact();
            return TeaModel.build(map, self);
        }

        public ChangeApplyRequestContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ChangeApplyRequestContact setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public ChangeApplyRequestContact setMobilePhoneNum(String mobilePhoneNum) {
            this.mobilePhoneNum = mobilePhoneNum;
            return this;
        }
        public String getMobilePhoneNum() {
            return this.mobilePhoneNum;
        }

    }

}

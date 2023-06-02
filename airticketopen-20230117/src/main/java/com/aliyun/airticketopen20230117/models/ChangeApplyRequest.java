// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeApplyRequest extends TeaModel {
    @NameInMap("change_passenger_list")
    public java.util.List<ChangeApplyRequestChangePassengerList> changePassengerList;

    @NameInMap("changed_journeys")
    public java.util.List<ChangeApplyRequestChangedJourneys> changedJourneys;

    @NameInMap("contact")
    public ChangeApplyRequestContact contact;

    @NameInMap("order_num")
    public Long orderNum;

    @NameInMap("remark")
    public String remark;

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
        @NameInMap("document")
        public String document;

        @NameInMap("first_name")
        public String firstName;

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
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("arrive_terminal")
        public String arriveTerminal;

        @NameInMap("arrive_time")
        public Long arriveTime;

        @NameInMap("code_share")
        public Boolean codeShare;

        @NameInMap("departure_airport")
        public String departureAirport;

        @NameInMap("departure_city")
        public String departureCity;

        @NameInMap("departure_date")
        public String departureDate;

        @NameInMap("departure_terminal")
        public String departureTerminal;

        @NameInMap("departure_time")
        public Long departureTime;

        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

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
        @NameInMap("email")
        public String email;

        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

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

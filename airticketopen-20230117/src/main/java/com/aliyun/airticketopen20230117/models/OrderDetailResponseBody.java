// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public OrderDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static OrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OrderDetailResponseBody self = new OrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public OrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OrderDetailResponseBody setData(OrderDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OrderDetailResponseBodyData getData() {
        return this.data;
    }

    public OrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OrderDetailResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public OrderDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public OrderDetailResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public OrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("baggage_amount")
        public Integer baggageAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("baggage_weight")
        public Integer baggageWeight;

        /**
         * <strong>example:</strong>
         * <p>KG</p>
         */
        @NameInMap("baggage_weight_unit")
        public String baggageWeightUnit;

        @NameInMap("is_all_weight")
        public Boolean isAllWeight;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("price")
        public Double price;

        public static OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary self = new OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary setBaggageAmount(Integer baggageAmount) {
            this.baggageAmount = baggageAmount;
            return this;
        }
        public Integer getBaggageAmount() {
            return this.baggageAmount;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary setBaggageWeight(Integer baggageWeight) {
            this.baggageWeight = baggageWeight;
            return this;
        }
        public Integer getBaggageWeight() {
            return this.baggageWeight;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary setBaggageWeightUnit(String baggageWeightUnit) {
            this.baggageWeightUnit = baggageWeightUnit;
            return this;
        }
        public String getBaggageWeightUnit() {
            return this.baggageWeightUnit;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary setIsAllWeight(Boolean isAllWeight) {
            this.isAllWeight = isAllWeight;
            return this;
        }
        public Boolean getIsAllWeight() {
            return this.isAllWeight;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

    }

    public static class OrderDetailResponseBodyDataAncillaryItemDetailListAncillary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MDY2NTAxLCJleHAiOjE2NxNzM3MDEsIm5ix</p>
         */
        @NameInMap("ancillary_id")
        public String ancillaryId;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ancillary_type")
        public Integer ancillaryType;

        @NameInMap("baggage_ancillary")
        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary baggageAncillary;

        public static OrderDetailResponseBodyDataAncillaryItemDetailListAncillary build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataAncillaryItemDetailListAncillary self = new OrderDetailResponseBodyDataAncillaryItemDetailListAncillary();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillary setAncillaryId(String ancillaryId) {
            this.ancillaryId = ancillaryId;
            return this;
        }
        public String getAncillaryId() {
            return this.ancillaryId;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillary setAncillaryType(Integer ancillaryType) {
            this.ancillaryType = ancillaryType;
            return this;
        }
        public Integer getAncillaryType() {
            return this.ancillaryType;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillary setBaggageAncillary(OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary baggageAncillary) {
            this.baggageAncillary = baggageAncillary;
            return this;
        }
        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillaryBaggageAncillary getBaggageAncillary() {
            return this.baggageAncillary;
        }

    }

    public static class OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        /**
         * <strong>example:</strong>
         * <p>E1***5674</p>
         */
        @NameInMap("credential_num")
        public String credentialNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("credential_type")
        public Integer credentialType;

        /**
         * <strong>example:</strong>
         * <p>20290101</p>
         */
        @NameInMap("expire_date")
        public String expireDate;

        public static OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential self = new OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential setCertIssuePlace(String certIssuePlace) {
            this.certIssuePlace = certIssuePlace;
            return this;
        }
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential setCredentialNum(String credentialNum) {
            this.credentialNum = credentialNum;
            return this;
        }
        public String getCredentialNum() {
            return this.credentialNum;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential setCredentialType(Integer credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Integer getCredentialType() {
            return this.credentialType;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

    }

    public static class OrderDetailResponseBodyDataAncillaryItemDetailListPassenger extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20020301</p>
         */
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("credential")
        public OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential credential;

        /**
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("gender")
        public Integer gender;

        /**
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        /**
         * <strong>example:</strong>
         * <p>183******96</p>
         */
        @NameInMap("mobile_phone_number")
        public String mobilePhoneNumber;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality")
        public String nationality;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        public static OrderDetailResponseBodyDataAncillaryItemDetailListPassenger build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataAncillaryItemDetailListPassenger self = new OrderDetailResponseBodyDataAncillaryItemDetailListPassenger();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setCredential(OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential credential) {
            this.credential = credential;
            return this;
        }
        public OrderDetailResponseBodyDataAncillaryItemDetailListPassengerCredential getCredential() {
            return this.credential;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setMobilePhoneNumber(String mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class OrderDetailResponseBodyDataAncillaryItemDetailList extends TeaModel {
        @NameInMap("ancillary")
        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillary ancillary;

        @NameInMap("passenger")
        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger passenger;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static OrderDetailResponseBodyDataAncillaryItemDetailList build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataAncillaryItemDetailList self = new OrderDetailResponseBodyDataAncillaryItemDetailList();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailList setAncillary(OrderDetailResponseBodyDataAncillaryItemDetailListAncillary ancillary) {
            this.ancillary = ancillary;
            return this;
        }
        public OrderDetailResponseBodyDataAncillaryItemDetailListAncillary getAncillary() {
            return this.ancillary;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailList setPassenger(OrderDetailResponseBodyDataAncillaryItemDetailListPassenger passenger) {
            this.passenger = passenger;
            return this;
        }
        public OrderDetailResponseBodyDataAncillaryItemDetailListPassenger getPassenger() {
            return this.passenger;
        }

        public OrderDetailResponseBodyDataAncillaryItemDetailList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class OrderDetailResponseBodyDataFlightItemDetailListFlightPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("sell_price")
        public Double sellPrice;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("tax")
        public Double tax;

        public static OrderDetailResponseBodyDataFlightItemDetailListFlightPrice build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataFlightItemDetailListFlightPrice self = new OrderDetailResponseBodyDataFlightItemDetailListFlightPrice();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataFlightItemDetailListFlightPrice setSellPrice(Double sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Double getSellPrice() {
            return this.sellPrice;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListFlightPrice setTax(Double tax) {
            this.tax = tax;
            return this;
        }
        public Double getTax() {
            return this.tax;
        }

    }

    public static class OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>economy class</p>
         */
        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("cabin_quantity")
        public String cabinQuantity;

        /**
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        public static OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation self = new OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation setCabinQuantity(String cabinQuantity) {
            this.cabinQuantity = cabinQuantity;
            return this;
        }
        public String getCabinQuantity() {
            return this.cabinQuantity;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

    }

    public static class OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        /**
         * <strong>example:</strong>
         * <p>E1***5674</p>
         */
        @NameInMap("credential_num")
        public String credentialNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("credential_type")
        public Integer credentialType;

        /**
         * <strong>example:</strong>
         * <p>20290101</p>
         */
        @NameInMap("expire_date")
        public String expireDate;

        public static OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential self = new OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential setCertIssuePlace(String certIssuePlace) {
            this.certIssuePlace = certIssuePlace;
            return this;
        }
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential setCredentialNum(String credentialNum) {
            this.credentialNum = credentialNum;
            return this;
        }
        public String getCredentialNum() {
            return this.credentialNum;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential setCredentialType(Integer credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Integer getCredentialType() {
            return this.credentialType;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

    }

    public static class OrderDetailResponseBodyDataFlightItemDetailListPassenger extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20020301</p>
         */
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("credential")
        public OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential credential;

        /**
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("gender")
        public Integer gender;

        /**
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        /**
         * <strong>example:</strong>
         * <p>183******96</p>
         */
        @NameInMap("mobile_phone_number")
        public String mobilePhoneNumber;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality")
        public String nationality;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        public static OrderDetailResponseBodyDataFlightItemDetailListPassenger build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataFlightItemDetailListPassenger self = new OrderDetailResponseBodyDataFlightItemDetailListPassenger();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setCredential(OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential credential) {
            this.credential = credential;
            return this;
        }
        public OrderDetailResponseBodyDataFlightItemDetailListPassengerCredential getCredential() {
            return this.credential;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setMobilePhoneNumber(String mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public OrderDetailResponseBodyDataFlightItemDetailListPassenger setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class OrderDetailResponseBodyDataFlightItemDetailList extends TeaModel {
        @NameInMap("b_pnr_list")
        public java.util.List<String> bPnrList;

        @NameInMap("c_pnr_list")
        public java.util.List<String> cPnrList;

        @NameInMap("flight_price")
        public OrderDetailResponseBodyDataFlightItemDetailListFlightPrice flightPrice;

        @NameInMap("flight_segment_cabin_relation")
        public java.util.List<OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation> flightSegmentCabinRelation;

        @NameInMap("passenger")
        public OrderDetailResponseBodyDataFlightItemDetailListPassenger passenger;

        /**
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("ticket_air_line")
        public String ticketAirLine;

        @NameInMap("ticket_nos")
        public java.util.List<String> ticketNos;

        public static OrderDetailResponseBodyDataFlightItemDetailList build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataFlightItemDetailList self = new OrderDetailResponseBodyDataFlightItemDetailList();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataFlightItemDetailList setBPnrList(java.util.List<String> bPnrList) {
            this.bPnrList = bPnrList;
            return this;
        }
        public java.util.List<String> getBPnrList() {
            return this.bPnrList;
        }

        public OrderDetailResponseBodyDataFlightItemDetailList setCPnrList(java.util.List<String> cPnrList) {
            this.cPnrList = cPnrList;
            return this;
        }
        public java.util.List<String> getCPnrList() {
            return this.cPnrList;
        }

        public OrderDetailResponseBodyDataFlightItemDetailList setFlightPrice(OrderDetailResponseBodyDataFlightItemDetailListFlightPrice flightPrice) {
            this.flightPrice = flightPrice;
            return this;
        }
        public OrderDetailResponseBodyDataFlightItemDetailListFlightPrice getFlightPrice() {
            return this.flightPrice;
        }

        public OrderDetailResponseBodyDataFlightItemDetailList setFlightSegmentCabinRelation(java.util.List<OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation> flightSegmentCabinRelation) {
            this.flightSegmentCabinRelation = flightSegmentCabinRelation;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataFlightItemDetailListFlightSegmentCabinRelation> getFlightSegmentCabinRelation() {
            return this.flightSegmentCabinRelation;
        }

        public OrderDetailResponseBodyDataFlightItemDetailList setPassenger(OrderDetailResponseBodyDataFlightItemDetailListPassenger passenger) {
            this.passenger = passenger;
            return this;
        }
        public OrderDetailResponseBodyDataFlightItemDetailListPassenger getPassenger() {
            return this.passenger;
        }

        public OrderDetailResponseBodyDataFlightItemDetailList setTicketAirLine(String ticketAirLine) {
            this.ticketAirLine = ticketAirLine;
            return this;
        }
        public String getTicketAirLine() {
            return this.ticketAirLine;
        }

        public OrderDetailResponseBodyDataFlightItemDetailList setTicketNos(java.util.List<String> ticketNos) {
            this.ticketNos = ticketNos;
            return this;
        }
        public java.util.List<String> getTicketNos() {
            return this.ticketNos;
        }

    }

    public static class OrderDetailResponseBodyDataPassengerListCredential extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        /**
         * <strong>example:</strong>
         * <p>E1***5674</p>
         */
        @NameInMap("credential_num")
        public String credentialNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("credential_type")
        public Integer credentialType;

        /**
         * <strong>example:</strong>
         * <p>20290101</p>
         */
        @NameInMap("expire_date")
        public String expireDate;

        public static OrderDetailResponseBodyDataPassengerListCredential build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataPassengerListCredential self = new OrderDetailResponseBodyDataPassengerListCredential();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataPassengerListCredential setCertIssuePlace(String certIssuePlace) {
            this.certIssuePlace = certIssuePlace;
            return this;
        }
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        public OrderDetailResponseBodyDataPassengerListCredential setCredentialNum(String credentialNum) {
            this.credentialNum = credentialNum;
            return this;
        }
        public String getCredentialNum() {
            return this.credentialNum;
        }

        public OrderDetailResponseBodyDataPassengerListCredential setCredentialType(Integer credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Integer getCredentialType() {
            return this.credentialType;
        }

        public OrderDetailResponseBodyDataPassengerListCredential setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

    }

    public static class OrderDetailResponseBodyDataPassengerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20020301</p>
         */
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("credential")
        public OrderDetailResponseBodyDataPassengerListCredential credential;

        /**
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("gender")
        public Integer gender;

        /**
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        /**
         * <strong>example:</strong>
         * <p>183******96</p>
         */
        @NameInMap("mobile_phone_number")
        public String mobilePhoneNumber;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality")
        public String nationality;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        public static OrderDetailResponseBodyDataPassengerList build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataPassengerList self = new OrderDetailResponseBodyDataPassengerList();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataPassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public OrderDetailResponseBodyDataPassengerList setCredential(OrderDetailResponseBodyDataPassengerListCredential credential) {
            this.credential = credential;
            return this;
        }
        public OrderDetailResponseBodyDataPassengerListCredential getCredential() {
            return this.credential;
        }

        public OrderDetailResponseBodyDataPassengerList setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public OrderDetailResponseBodyDataPassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public OrderDetailResponseBodyDataPassengerList setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public OrderDetailResponseBodyDataPassengerList setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public OrderDetailResponseBodyDataPassengerList setMobilePhoneNumber(String mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        public OrderDetailResponseBodyDataPassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public OrderDetailResponseBodyDataPassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class OrderDetailResponseBodyDataSolutionJourneyListSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static OrderDetailResponseBodyDataSolutionJourneyListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataSolutionJourneyListSegmentList self = new OrderDetailResponseBodyDataSolutionJourneyListSegmentList();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public OrderDetailResponseBodyDataSolutionJourneyListSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class OrderDetailResponseBodyDataSolutionJourneyList extends TeaModel {
        @NameInMap("segment_list")
        public java.util.List<OrderDetailResponseBodyDataSolutionJourneyListSegmentList> segmentList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static OrderDetailResponseBodyDataSolutionJourneyList build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataSolutionJourneyList self = new OrderDetailResponseBodyDataSolutionJourneyList();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataSolutionJourneyList setSegmentList(java.util.List<OrderDetailResponseBodyDataSolutionJourneyListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataSolutionJourneyListSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public OrderDetailResponseBodyDataSolutionJourneyList setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("luggage_direct_info_type")
        public Integer luggageDirectInfoType;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList self = new OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList setLuggageDirectInfoType(Integer luggageDirectInfoType) {
            this.luggageDirectInfoType = luggageDirectInfoType;
            return this;
        }
        public Integer getLuggageDirectInfoType() {
            return this.luggageDirectInfoType;
        }

        public OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList extends TeaModel {
        @NameInMap("passenger_baggage_allowance_mapping")
        public java.util.Map<String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList self = new OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList setPassengerBaggageAllowanceMapping(java.util.Map<String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping) {
            this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
            return this;
        }
        public java.util.Map<String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        public OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList extends TeaModel {
        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList self = new OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList setRefundChangeRuleMap(java.util.Map<String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap) {
            this.refundChangeRuleMap = refundChangeRuleMap;
            return this;
        }
        public java.util.Map<String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        public OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class OrderDetailResponseBodyDataSolution extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("adult_price")
        public Double adultPrice;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("adult_tax")
        public Double adultTax;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("child_price")
        public Double childPrice;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("child_tax")
        public Double childTax;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("infant_price")
        public Double infantPrice;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("infant_tax")
        public Double infantTax;

        @NameInMap("journey_list")
        public java.util.List<OrderDetailResponseBodyDataSolutionJourneyList> journeyList;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("product_type_description")
        public String productTypeDescription;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("refund_ticket_coupon_description")
        public String refundTicketCouponDescription;

        @NameInMap("segment_baggage_check_in_info_list")
        public java.util.List<OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        @NameInMap("segment_baggage_mapping_list")
        public java.util.List<OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList> segmentBaggageMappingList;

        @NameInMap("segment_refund_change_rule_mapping_list")
        public java.util.List<OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        /**
         * <p>solution_id</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TUxxx</p>
         */
        @NameInMap("solution_id")
        public String solutionId;

        public static OrderDetailResponseBodyDataSolution build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyDataSolution self = new OrderDetailResponseBodyDataSolution();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyDataSolution setAdultPrice(Double adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        public OrderDetailResponseBodyDataSolution setAdultTax(Double adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Double getAdultTax() {
            return this.adultTax;
        }

        public OrderDetailResponseBodyDataSolution setChildPrice(Double childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Double getChildPrice() {
            return this.childPrice;
        }

        public OrderDetailResponseBodyDataSolution setChildTax(Double childTax) {
            this.childTax = childTax;
            return this;
        }
        public Double getChildTax() {
            return this.childTax;
        }

        public OrderDetailResponseBodyDataSolution setInfantPrice(Double infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        public OrderDetailResponseBodyDataSolution setInfantTax(Double infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Double getInfantTax() {
            return this.infantTax;
        }

        public OrderDetailResponseBodyDataSolution setJourneyList(java.util.List<OrderDetailResponseBodyDataSolutionJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataSolutionJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public OrderDetailResponseBodyDataSolution setProductTypeDescription(String productTypeDescription) {
            this.productTypeDescription = productTypeDescription;
            return this;
        }
        public String getProductTypeDescription() {
            return this.productTypeDescription;
        }

        public OrderDetailResponseBodyDataSolution setRefundTicketCouponDescription(String refundTicketCouponDescription) {
            this.refundTicketCouponDescription = refundTicketCouponDescription;
            return this;
        }
        public String getRefundTicketCouponDescription() {
            return this.refundTicketCouponDescription;
        }

        public OrderDetailResponseBodyDataSolution setSegmentBaggageCheckInInfoList(java.util.List<OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
            this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataSolutionSegmentBaggageCheckInInfoList> getSegmentBaggageCheckInInfoList() {
            return this.segmentBaggageCheckInInfoList;
        }

        public OrderDetailResponseBodyDataSolution setSegmentBaggageMappingList(java.util.List<OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList> segmentBaggageMappingList) {
            this.segmentBaggageMappingList = segmentBaggageMappingList;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataSolutionSegmentBaggageMappingList> getSegmentBaggageMappingList() {
            return this.segmentBaggageMappingList;
        }

        public OrderDetailResponseBodyDataSolution setSegmentRefundChangeRuleMappingList(java.util.List<OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
            this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataSolutionSegmentRefundChangeRuleMappingList> getSegmentRefundChangeRuleMappingList() {
            return this.segmentRefundChangeRuleMappingList;
        }

        public OrderDetailResponseBodyDataSolution setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

    public static class OrderDetailResponseBodyData extends TeaModel {
        @NameInMap("ancillary_item_detail_list")
        public java.util.List<OrderDetailResponseBodyDataAncillaryItemDetailList> ancillaryItemDetailList;

        @NameInMap("baggage_allowance_map")
        public java.util.Map<String, DataBaggageAllowanceMapValue> baggageAllowanceMap;

        /**
         * <strong>example:</strong>
         * <p>1677210784000</p>
         */
        @NameInMap("book_time")
        public Long bookTime;

        @NameInMap("flight_item_detail_list")
        public java.util.List<OrderDetailResponseBodyDataFlightItemDetailList> flightItemDetailList;

        /**
         * <strong>example:</strong>
         * <p>4966***617111</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        /**
         * <strong>example:</strong>
         * <p>x091-2023-0220-j-0001</p>
         */
        @NameInMap("out_order_num")
        public String outOrderNum;

        @NameInMap("passenger_list")
        public java.util.List<OrderDetailResponseBodyDataPassengerList> passengerList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <strong>example:</strong>
         * <p>1677210788000</p>
         */
        @NameInMap("pay_time")
        public Long payTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("promotion_price")
        public Double promotionPrice;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("real_pay_price")
        public Double realPayPrice;

        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataRefundChangeRuleMapValue> refundChangeRuleMap;

        /**
         * <strong>example:</strong>
         * <p>nick</p>
         */
        @NameInMap("session_nick")
        public String sessionNick;

        @NameInMap("solution")
        public OrderDetailResponseBodyDataSolution solution;

        /**
         * <strong>example:</strong>
         * <p>1677210786000</p>
         */
        @NameInMap("succeed_time")
        public Long succeedTime;

        /**
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("total_price")
        public Double totalPrice;

        /**
         * <strong>example:</strong>
         * <p>hkduendkd-2023-dj0</p>
         */
        @NameInMap("transaction_no")
        public String transactionNo;

        public static OrderDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OrderDetailResponseBodyData self = new OrderDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OrderDetailResponseBodyData setAncillaryItemDetailList(java.util.List<OrderDetailResponseBodyDataAncillaryItemDetailList> ancillaryItemDetailList) {
            this.ancillaryItemDetailList = ancillaryItemDetailList;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataAncillaryItemDetailList> getAncillaryItemDetailList() {
            return this.ancillaryItemDetailList;
        }

        public OrderDetailResponseBodyData setBaggageAllowanceMap(java.util.Map<String, DataBaggageAllowanceMapValue> baggageAllowanceMap) {
            this.baggageAllowanceMap = baggageAllowanceMap;
            return this;
        }
        public java.util.Map<String, DataBaggageAllowanceMapValue> getBaggageAllowanceMap() {
            return this.baggageAllowanceMap;
        }

        public OrderDetailResponseBodyData setBookTime(Long bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public Long getBookTime() {
            return this.bookTime;
        }

        public OrderDetailResponseBodyData setFlightItemDetailList(java.util.List<OrderDetailResponseBodyDataFlightItemDetailList> flightItemDetailList) {
            this.flightItemDetailList = flightItemDetailList;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataFlightItemDetailList> getFlightItemDetailList() {
            return this.flightItemDetailList;
        }

        public OrderDetailResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public OrderDetailResponseBodyData setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public OrderDetailResponseBodyData setOutOrderNum(String outOrderNum) {
            this.outOrderNum = outOrderNum;
            return this;
        }
        public String getOutOrderNum() {
            return this.outOrderNum;
        }

        public OrderDetailResponseBodyData setPassengerList(java.util.List<OrderDetailResponseBodyDataPassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<OrderDetailResponseBodyDataPassengerList> getPassengerList() {
            return this.passengerList;
        }

        public OrderDetailResponseBodyData setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public OrderDetailResponseBodyData setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public OrderDetailResponseBodyData setPromotionPrice(Double promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public Double getPromotionPrice() {
            return this.promotionPrice;
        }

        public OrderDetailResponseBodyData setRealPayPrice(Double realPayPrice) {
            this.realPayPrice = realPayPrice;
            return this;
        }
        public Double getRealPayPrice() {
            return this.realPayPrice;
        }

        public OrderDetailResponseBodyData setRefundChangeRuleMap(java.util.Map<String, DataRefundChangeRuleMapValue> refundChangeRuleMap) {
            this.refundChangeRuleMap = refundChangeRuleMap;
            return this;
        }
        public java.util.Map<String, DataRefundChangeRuleMapValue> getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        public OrderDetailResponseBodyData setSessionNick(String sessionNick) {
            this.sessionNick = sessionNick;
            return this;
        }
        public String getSessionNick() {
            return this.sessionNick;
        }

        public OrderDetailResponseBodyData setSolution(OrderDetailResponseBodyDataSolution solution) {
            this.solution = solution;
            return this;
        }
        public OrderDetailResponseBodyDataSolution getSolution() {
            return this.solution;
        }

        public OrderDetailResponseBodyData setSucceedTime(Long succeedTime) {
            this.succeedTime = succeedTime;
            return this;
        }
        public Long getSucceedTime() {
            return this.succeedTime;
        }

        public OrderDetailResponseBodyData setTotalPrice(Double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Double getTotalPrice() {
            return this.totalPrice;
        }

        public OrderDetailResponseBodyData setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

    }

}

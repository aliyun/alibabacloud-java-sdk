// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class StandardSearchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public StandardSearchResponseBodyData data;

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

    public static StandardSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StandardSearchResponseBody self = new StandardSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public StandardSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StandardSearchResponseBody setData(StandardSearchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StandardSearchResponseBodyData getData() {
        return this.data;
    }

    public StandardSearchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StandardSearchResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public StandardSearchResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public StandardSearchResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public StandardSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StandardSearchResponseBodyDataSolutionListJourneyListSegmentList extends TeaModel {
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

        public static StandardSearchResponseBodyDataSolutionListJourneyListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyDataSolutionListJourneyListSegmentList self = new StandardSearchResponseBodyDataSolutionListJourneyListSegmentList();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyListSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class StandardSearchResponseBodyDataSolutionListJourneyList extends TeaModel {
        @NameInMap("segment_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListJourneyListSegmentList> segmentList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static StandardSearchResponseBodyDataSolutionListJourneyList build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyDataSolutionListJourneyList self = new StandardSearchResponseBodyDataSolutionListJourneyList();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyDataSolutionListJourneyList setSegmentList(java.util.List<StandardSearchResponseBodyDataSolutionListJourneyListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<StandardSearchResponseBodyDataSolutionListJourneyListSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public StandardSearchResponseBodyDataSolutionListJourneyList setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("luggage_direct_info_type")
        public Integer luggageDirectInfoType;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList self = new StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList setLuggageDirectInfoType(Integer luggageDirectInfoType) {
            this.luggageDirectInfoType = luggageDirectInfoType;
            return this;
        }
        public Integer getLuggageDirectInfoType() {
            return this.luggageDirectInfoType;
        }

        public StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList extends TeaModel {
        @NameInMap("passenger_baggage_allowance_mapping")
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList self = new StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList setPassengerBaggageAllowanceMapping(java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping) {
            this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
            return this;
        }
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        public StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList extends TeaModel {
        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList self = new StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList setRefundChangeRuleMap(java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap) {
            this.refundChangeRuleMap = refundChangeRuleMap;
            return this;
        }
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        public StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo extends TeaModel {
        @NameInMap("issue_ticket_type")
        public Integer issueTicketType;

        @NameInMap("issue_time_limit")
        public Integer issueTimeLimit;

        public static StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo self = new StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo setIssueTicketType(Integer issueTicketType) {
            this.issueTicketType = issueTicketType;
            return this;
        }
        public Integer getIssueTicketType() {
            return this.issueTicketType;
        }

        public StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo setIssueTimeLimit(Integer issueTimeLimit) {
            this.issueTimeLimit = issueTimeLimit;
            return this;
        }
        public Integer getIssueTimeLimit() {
            return this.issueTimeLimit;
        }

    }

    public static class StandardSearchResponseBodyDataSolutionListSolutionAttribute extends TeaModel {
        @NameInMap("issue_time_info")
        public StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo issueTimeInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("supply_source_type")
        public String supplySourceType;

        public static StandardSearchResponseBodyDataSolutionListSolutionAttribute build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyDataSolutionListSolutionAttribute self = new StandardSearchResponseBodyDataSolutionListSolutionAttribute();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyDataSolutionListSolutionAttribute setIssueTimeInfo(StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo issueTimeInfo) {
            this.issueTimeInfo = issueTimeInfo;
            return this;
        }
        public StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo getIssueTimeInfo() {
            return this.issueTimeInfo;
        }

        public StandardSearchResponseBodyDataSolutionListSolutionAttribute setSupplySourceType(String supplySourceType) {
            this.supplySourceType = supplySourceType;
            return this;
        }
        public String getSupplySourceType() {
            return this.supplySourceType;
        }

    }

    public static class StandardSearchResponseBodyDataSolutionList extends TeaModel {
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
        public java.util.List<StandardSearchResponseBodyDataSolutionListJourneyList> journeyList;

        @NameInMap("segment_baggage_check_in_info_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        @NameInMap("segment_baggage_mapping_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList> segmentBaggageMappingList;

        @NameInMap("segment_refund_change_rule_mapping_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        @NameInMap("solution_attribute")
        public StandardSearchResponseBodyDataSolutionListSolutionAttribute solutionAttribute;

        /**
         * <p>solution_id</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TUxxx</p>
         */
        @NameInMap("solution_id")
        public String solutionId;

        public static StandardSearchResponseBodyDataSolutionList build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyDataSolutionList self = new StandardSearchResponseBodyDataSolutionList();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyDataSolutionList setAdultPrice(Double adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        public StandardSearchResponseBodyDataSolutionList setAdultTax(Double adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Double getAdultTax() {
            return this.adultTax;
        }

        public StandardSearchResponseBodyDataSolutionList setChildPrice(Double childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Double getChildPrice() {
            return this.childPrice;
        }

        public StandardSearchResponseBodyDataSolutionList setChildTax(Double childTax) {
            this.childTax = childTax;
            return this;
        }
        public Double getChildTax() {
            return this.childTax;
        }

        public StandardSearchResponseBodyDataSolutionList setInfantPrice(Double infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        public StandardSearchResponseBodyDataSolutionList setInfantTax(Double infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Double getInfantTax() {
            return this.infantTax;
        }

        public StandardSearchResponseBodyDataSolutionList setJourneyList(java.util.List<StandardSearchResponseBodyDataSolutionListJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<StandardSearchResponseBodyDataSolutionListJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public StandardSearchResponseBodyDataSolutionList setSegmentBaggageCheckInInfoList(java.util.List<StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
            this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
            return this;
        }
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> getSegmentBaggageCheckInInfoList() {
            return this.segmentBaggageCheckInInfoList;
        }

        public StandardSearchResponseBodyDataSolutionList setSegmentBaggageMappingList(java.util.List<StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList> segmentBaggageMappingList) {
            this.segmentBaggageMappingList = segmentBaggageMappingList;
            return this;
        }
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList> getSegmentBaggageMappingList() {
            return this.segmentBaggageMappingList;
        }

        public StandardSearchResponseBodyDataSolutionList setSegmentRefundChangeRuleMappingList(java.util.List<StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
            this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
            return this;
        }
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> getSegmentRefundChangeRuleMappingList() {
            return this.segmentRefundChangeRuleMappingList;
        }

        public StandardSearchResponseBodyDataSolutionList setSolutionAttribute(StandardSearchResponseBodyDataSolutionListSolutionAttribute solutionAttribute) {
            this.solutionAttribute = solutionAttribute;
            return this;
        }
        public StandardSearchResponseBodyDataSolutionListSolutionAttribute getSolutionAttribute() {
            return this.solutionAttribute;
        }

        public StandardSearchResponseBodyDataSolutionList setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

    public static class StandardSearchResponseBodyData extends TeaModel {
        @NameInMap("solution_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionList> solutionList;

        public static StandardSearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StandardSearchResponseBodyData self = new StandardSearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StandardSearchResponseBodyData setSolutionList(java.util.List<StandardSearchResponseBodyDataSolutionList> solutionList) {
            this.solutionList = solutionList;
            return this;
        }
        public java.util.List<StandardSearchResponseBodyDataSolutionList> getSolutionList() {
            return this.solutionList;
        }

    }

}

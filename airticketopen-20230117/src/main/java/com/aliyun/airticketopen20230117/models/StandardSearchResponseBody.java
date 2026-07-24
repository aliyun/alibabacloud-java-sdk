// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class StandardSearchResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Data returned on successful processing</p>
     */
    @NameInMap("data")
    public StandardSearchResponseBodyData data;

    /**
     * <p>Business error code</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>Data carried with error handling</p>
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
     * <p>When HTTP request is successful, status value is always 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>Whether the request is successful</p>
     * 
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
         * <p>Flight arrival airport three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>Flight arrival city three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>Flight arrival terminal</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>Flight arrival date and time, string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>Remaining seat count. Value range: 1,2,3,4,5,6,7,8,9,A; A indicates more than 9 seats available.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>Cabin</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>Cabin class</p>
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
         * <p>Flight departure airport three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>Flight departure city three-letter code (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>Flight departure terminal</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>Flight departure date and time, string format (yyyy-MM-dd HH:mm:ss)</p>
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
         * <p>Flight duration, unit: minutes</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>Marketing airline (e.g.: HO)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>Marketing flight number (e.g.: HO1295)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>Marketing flight number in integer format (e.g.: 1295)</p>
         * 
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>Operating airline (e.g.: CX)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>Operating flight number (e.g.: CX601)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>Segment ID, format: flight number + departure airport + arrival airport + departure date (MMdd)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>Stopover city list, has values when stopQuantity &gt; 0, multiple values separated by commas</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>Number of stopover cities</p>
         * 
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
        /**
         * <p>Segment information</p>
         */
        @NameInMap("segment_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListJourneyListSegmentList> segmentList;

        /**
         * <p>Number of transfers</p>
         * 
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
         * <p>Baggage through-check rule type. 1: Baggage direct transfer between segments; 2: Baggage re-check between segments; 3: Baggage direct transfer at stopover city; 4: Baggage re-check at stopover city</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("luggage_direct_info_type")
        public Integer luggageDirectInfoType;

        /**
         * <p>Segment ID list. These segment IDs share the same baggage through-check rule</p>
         */
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
        /**
         * <p>Passenger type to free baggage allowance mapping. Key values: ADT: Adult; CHD: Child; INF: Infant</p>
         */
        @NameInMap("passenger_baggage_allowance_mapping")
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

        /**
         * <p>Segment ID list. These segment IDs share the same free baggage allowance rule</p>
         */
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
        /**
         * <p>Passenger type to refund and change rule mapping. Key values: ADT: Adult; CHD: Child; INF: Infant</p>
         */
        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

        /**
         * <p>Segment ID list. These segment IDs share the same refund and change rule</p>
         */
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
        /**
         * <p>Ticketing type. 1: After payment; 2: Before departure; -1: Unknown</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("issue_ticket_type")
        public Integer issueTicketType;

        /**
         * <p>Estimated ticketing duration, unit: minutes</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
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
        /**
         * <p>Ticketing time information</p>
         */
        @NameInMap("issue_time_info")
        public StandardSearchResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo issueTimeInfo;

        /**
         * <p>Supply source type. 1: Self-operated; 2: Agent; 3: Flagship store</p>
         * 
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
         * <p>Adult unit price</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("adult_price")
        public Double adultPrice;

        /**
         * <p>Adult tax</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("adult_tax")
        public Double adultTax;

        /**
         * <p>Child unit price</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("child_price")
        public Double childPrice;

        /**
         * <p>Child tax</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("child_tax")
        public Double childTax;

        /**
         * <p>Infant unit price</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("infant_price")
        public Double infantPrice;

        /**
         * <p>Infant tax</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("infant_tax")
        public Double infantTax;

        /**
         * <p>Journey</p>
         */
        @NameInMap("journey_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListJourneyList> journeyList;

        /**
         * <p>Baggage through-check rules</p>
         */
        @NameInMap("segment_baggage_check_in_info_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        /**
         * <p>Free baggage allowance rules</p>
         */
        @NameInMap("segment_baggage_mapping_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentBaggageMappingList> segmentBaggageMappingList;

        /**
         * <p>Refund and change rules</p>
         */
        @NameInMap("segment_refund_change_rule_mapping_list")
        public java.util.List<StandardSearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        /**
         * <p>Quote attributes</p>
         */
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
        /**
         * <p>Search and quote results</p>
         */
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

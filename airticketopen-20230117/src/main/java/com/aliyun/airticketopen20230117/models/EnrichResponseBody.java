// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class EnrichResponseBody extends TeaModel {
    /**
     * <p>request RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>correctly processed return data</p>
     */
    @NameInMap("data")
    public EnrichResponseBodyData data;

    /**
     * <p>business error code</p>
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
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>http request successful, status value is 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>whether the request was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static EnrichResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnrichResponseBody self = new EnrichResponseBody();
        return TeaModel.build(map, self);
    }

    public EnrichResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnrichResponseBody setData(EnrichResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnrichResponseBodyData getData() {
        return this.data;
    }

    public EnrichResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public EnrichResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public EnrichResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public EnrichResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public EnrichResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnrichResponseBodyDataSolutionListJourneyListSegmentList extends TeaModel {
        /**
         * <p>Three-letter code of the arrival airport (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>Three-letter code of the arrival city (uppercase)</p>
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
         * <p>null</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>Arrival date and time in string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>Number of remaining seats. The value range is 1,2,3,4,5,6,7,8,9,A; A indicates more than 9 seats available.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>Cabin class</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>Cabin grade</p>
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
         * <p>Three-letter code of the departure airport (uppercase)</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>Three-letter code of the departure city (uppercase)</p>
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
         * <p>Departure date and time in string format (yyyy-MM-dd HH:mm:ss)</p>
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
         * <p>Marketing airline (e.g., KA)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>Marketing flight number (e.g., KA5809)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>Marketing flight number in digits (e.g., 5809)</p>
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
         * <p>segment ID format: flight number + departure airport + arrival airport + departure date (MMdd)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>List of stopover cities, with values when stopQuantity &gt; 0, separated by commas</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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

        public static EnrichResponseBodyDataSolutionListJourneyListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyDataSolutionListJourneyListSegmentList self = new EnrichResponseBodyDataSolutionListJourneyListSegmentList();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public EnrichResponseBodyDataSolutionListJourneyListSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class EnrichResponseBodyDataSolutionListJourneyList extends TeaModel {
        /**
         * <p>segment information</p>
         */
        @NameInMap("segment_list")
        public java.util.List<EnrichResponseBodyDataSolutionListJourneyListSegmentList> segmentList;

        /**
         * <p>number of transfers</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static EnrichResponseBodyDataSolutionListJourneyList build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyDataSolutionListJourneyList self = new EnrichResponseBodyDataSolutionListJourneyList();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyDataSolutionListJourneyList setSegmentList(java.util.List<EnrichResponseBodyDataSolutionListJourneyListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<EnrichResponseBodyDataSolutionListJourneyListSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public EnrichResponseBodyDataSolutionListJourneyList setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList extends TeaModel {
        /**
         * <p>Baggage check-in rule type 1: Direct baggage between segments; 2: Re-check baggage between segments; 3: Direct baggage at stopover cities; 4: Re-check baggage at stopover cities</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("luggage_direct_info_type")
        public Integer luggageDirectInfoType;

        /**
         * <p>List of segment IDs that use the same baggage check-in rule</p>
         */
        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList self = new EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList setLuggageDirectInfoType(Integer luggageDirectInfoType) {
            this.luggageDirectInfoType = luggageDirectInfoType;
            return this;
        }
        public Integer getLuggageDirectInfoType() {
            return this.luggageDirectInfoType;
        }

        public EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class EnrichResponseBodyDataSolutionListSegmentBaggageMappingList extends TeaModel {
        /**
         * <p>Mapping of passenger type to free baggage allowance</p>
         */
        @NameInMap("passenger_baggage_allowance_mapping")
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

        /**
         * <p>List of segment IDs that use the same free baggage allowance rule</p>
         */
        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static EnrichResponseBodyDataSolutionListSegmentBaggageMappingList build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyDataSolutionListSegmentBaggageMappingList self = new EnrichResponseBodyDataSolutionListSegmentBaggageMappingList();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyDataSolutionListSegmentBaggageMappingList setPassengerBaggageAllowanceMapping(java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping) {
            this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
            return this;
        }
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        public EnrichResponseBodyDataSolutionListSegmentBaggageMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList extends TeaModel {
        /**
         * <p>Passenger type - refund and change rule mapping</p>
         */
        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

        /**
         * <p>Segment ID list. These segment IDs use the same refund and change rules.</p>
         */
        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList self = new EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList setRefundChangeRuleMap(java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap) {
            this.refundChangeRuleMap = refundChangeRuleMap;
            return this;
        }
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        public EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo extends TeaModel {
        /**
         * <p>Issue ticket type:  1: after payment; 2: before departure; -1: unknown</p>
         */
        @NameInMap("issue_ticket_type")
        public Integer issueTicketType;

        /**
         * <p>Estimated issue ticket time, unit: minutes</p>
         */
        @NameInMap("issue_time_limit")
        public Integer issueTimeLimit;

        public static EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo self = new EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo setIssueTicketType(Integer issueTicketType) {
            this.issueTicketType = issueTicketType;
            return this;
        }
        public Integer getIssueTicketType() {
            return this.issueTicketType;
        }

        public EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo setIssueTimeLimit(Integer issueTimeLimit) {
            this.issueTimeLimit = issueTimeLimit;
            return this;
        }
        public Integer getIssueTimeLimit() {
            return this.issueTimeLimit;
        }

    }

    public static class EnrichResponseBodyDataSolutionListSolutionAttribute extends TeaModel {
        /**
         * <p>Issue ticket time related</p>
         */
        @NameInMap("issue_time_info")
        public EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo issueTimeInfo;

        /**
         * <p>Supply source type 1: Self-operated; 2: Agent; 3: Flagship store</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("supply_source_type")
        public String supplySourceType;

        public static EnrichResponseBodyDataSolutionListSolutionAttribute build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyDataSolutionListSolutionAttribute self = new EnrichResponseBodyDataSolutionListSolutionAttribute();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyDataSolutionListSolutionAttribute setIssueTimeInfo(EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo issueTimeInfo) {
            this.issueTimeInfo = issueTimeInfo;
            return this;
        }
        public EnrichResponseBodyDataSolutionListSolutionAttributeIssueTimeInfo getIssueTimeInfo() {
            return this.issueTimeInfo;
        }

        public EnrichResponseBodyDataSolutionListSolutionAttribute setSupplySourceType(String supplySourceType) {
            this.supplySourceType = supplySourceType;
            return this;
        }
        public String getSupplySourceType() {
            return this.supplySourceType;
        }

    }

    public static class EnrichResponseBodyDataSolutionList extends TeaModel {
        /**
         * <p>adult unit price</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("adult_price")
        public Double adultPrice;

        /**
         * <p>adult tax</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("adult_tax")
        public Double adultTax;

        /**
         * <p>child unit price</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("child_price")
        public Double childPrice;

        /**
         * <p>child tax</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("child_tax")
        public Double childTax;

        /**
         * <p>infant unit price</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("infant_price")
        public Double infantPrice;

        /**
         * <p>infant tax</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("infant_tax")
        public Double infantTax;

        /**
         * <p>journey</p>
         */
        @NameInMap("journey_list")
        public java.util.List<EnrichResponseBodyDataSolutionListJourneyList> journeyList;

        /**
         * <p>Baggage check-in rules</p>
         */
        @NameInMap("segment_baggage_check_in_info_list")
        public java.util.List<EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        /**
         * <p>Free baggage rules</p>
         */
        @NameInMap("segment_baggage_mapping_list")
        public java.util.List<EnrichResponseBodyDataSolutionListSegmentBaggageMappingList> segmentBaggageMappingList;

        /**
         * <p>Refund and change rules</p>
         */
        @NameInMap("segment_refund_change_rule_mapping_list")
        public java.util.List<EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        /**
         * <p>Quotation attributes</p>
         */
        @NameInMap("solution_attribute")
        public EnrichResponseBodyDataSolutionListSolutionAttribute solutionAttribute;

        /**
         * <p>solution_id</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
         */
        @NameInMap("solution_id")
        public String solutionId;

        public static EnrichResponseBodyDataSolutionList build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyDataSolutionList self = new EnrichResponseBodyDataSolutionList();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyDataSolutionList setAdultPrice(Double adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        public EnrichResponseBodyDataSolutionList setAdultTax(Double adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Double getAdultTax() {
            return this.adultTax;
        }

        public EnrichResponseBodyDataSolutionList setChildPrice(Double childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Double getChildPrice() {
            return this.childPrice;
        }

        public EnrichResponseBodyDataSolutionList setChildTax(Double childTax) {
            this.childTax = childTax;
            return this;
        }
        public Double getChildTax() {
            return this.childTax;
        }

        public EnrichResponseBodyDataSolutionList setInfantPrice(Double infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        public EnrichResponseBodyDataSolutionList setInfantTax(Double infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Double getInfantTax() {
            return this.infantTax;
        }

        public EnrichResponseBodyDataSolutionList setJourneyList(java.util.List<EnrichResponseBodyDataSolutionListJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<EnrichResponseBodyDataSolutionListJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public EnrichResponseBodyDataSolutionList setSegmentBaggageCheckInInfoList(java.util.List<EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
            this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
            return this;
        }
        public java.util.List<EnrichResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> getSegmentBaggageCheckInInfoList() {
            return this.segmentBaggageCheckInInfoList;
        }

        public EnrichResponseBodyDataSolutionList setSegmentBaggageMappingList(java.util.List<EnrichResponseBodyDataSolutionListSegmentBaggageMappingList> segmentBaggageMappingList) {
            this.segmentBaggageMappingList = segmentBaggageMappingList;
            return this;
        }
        public java.util.List<EnrichResponseBodyDataSolutionListSegmentBaggageMappingList> getSegmentBaggageMappingList() {
            return this.segmentBaggageMappingList;
        }

        public EnrichResponseBodyDataSolutionList setSegmentRefundChangeRuleMappingList(java.util.List<EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
            this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
            return this;
        }
        public java.util.List<EnrichResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> getSegmentRefundChangeRuleMappingList() {
            return this.segmentRefundChangeRuleMappingList;
        }

        public EnrichResponseBodyDataSolutionList setSolutionAttribute(EnrichResponseBodyDataSolutionListSolutionAttribute solutionAttribute) {
            this.solutionAttribute = solutionAttribute;
            return this;
        }
        public EnrichResponseBodyDataSolutionListSolutionAttribute getSolutionAttribute() {
            return this.solutionAttribute;
        }

        public EnrichResponseBodyDataSolutionList setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

    public static class EnrichResponseBodyData extends TeaModel {
        /**
         * <p>search quotation results</p>
         */
        @NameInMap("solution_list")
        public java.util.List<EnrichResponseBodyDataSolutionList> solutionList;

        public static EnrichResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnrichResponseBodyData self = new EnrichResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnrichResponseBodyData setSolutionList(java.util.List<EnrichResponseBodyDataSolutionList> solutionList) {
            this.solutionList = solutionList;
            return this;
        }
        public java.util.List<EnrichResponseBodyDataSolutionList> getSolutionList() {
            return this.solutionList;
        }

    }

}

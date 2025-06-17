// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchResponseBody extends TeaModel {
    /**
     * <p>request ID</p>
     * 
     * <strong>example:</strong>
     * <p>2236993B-7BE7-5F92-B179-21FF08570165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public SearchResponseBodyData data;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>error data</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>http reqeust has been processed successfully，status code is 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>true represents success, false represents failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchResponseBody self = new SearchResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchResponseBody setData(SearchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchResponseBodyData getData() {
        return this.data;
    }

    public SearchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public SearchResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SearchResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public SearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchResponseBodyDataSolutionListJourneyListSegmentList extends TeaModel {
        /**
         * <p>arrival airport code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>arrival city code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>arrival terminal</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>arrival time in string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>available seats (for reference only)</p>
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
         * <p>cabin class</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>code share or not</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>departure airport code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>departure city code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>departure terminal</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>departure time in string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>equipment type</p>
         * 
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <p>flight time, unit: minute</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>marketing airline code (ex.: KA)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>marketing airline flight no. (ex.: KA5809)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>marketing airline integer flight no. (ex.: 5809)</p>
         * 
         * <strong>example:</strong>
         * <p>1259</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>operating airline code (ex.: CX)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>operating airline flight no. (ex.: CX601)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>segment ID format: flight no.+departure airport[IATA airport code]+arrival airport[IATA airport code]+departure time(MMdd)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>stop city list
         * when stop_quantity &gt; 1, use “,” for seperation</p>
         * 
         * <strong>example:</strong>
         * <p>MFM,PVG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>number of stops</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static SearchResponseBodyDataSolutionListJourneyListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDataSolutionListJourneyListSegmentList self = new SearchResponseBodyDataSolutionListJourneyListSegmentList();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public SearchResponseBodyDataSolutionListJourneyListSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class SearchResponseBodyDataSolutionListJourneyList extends TeaModel {
        /**
         * <p>segment Info</p>
         */
        @NameInMap("segment_list")
        public java.util.List<SearchResponseBodyDataSolutionListJourneyListSegmentList> segmentList;

        /**
         * <p>number of transfers</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static SearchResponseBodyDataSolutionListJourneyList build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDataSolutionListJourneyList self = new SearchResponseBodyDataSolutionListJourneyList();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDataSolutionListJourneyList setSegmentList(java.util.List<SearchResponseBodyDataSolutionListJourneyListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<SearchResponseBodyDataSolutionListJourneyListSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public SearchResponseBodyDataSolutionListJourneyList setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList extends TeaModel {
        /**
         * <p>through check-in baggage policy type</p>
         * <ol>
         * <li>baggage through check-in between segments</li>
         * <li>baggage re-check-in needed between segments</li>
         * <li>baggage through check-in at stop city ( applies for stop flight )</li>
         * <li>baggage re-checkin needed at stop city ( applies for stop flight )</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("luggage_direct_info_type")
        public Integer luggageDirectInfoType;

        /**
         * <p>segment id list. 
         * all the listed segment ids share the same baggage through check-in  policy</p>
         */
        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList self = new SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList setLuggageDirectInfoType(Integer luggageDirectInfoType) {
            this.luggageDirectInfoType = luggageDirectInfoType;
            return this;
        }
        public Integer getLuggageDirectInfoType() {
            return this.luggageDirectInfoType;
        }

        public SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class SearchResponseBodyDataSolutionListSegmentBaggageMappingList extends TeaModel {
        /**
         * <p>baggage rule mapping, key is passenger type, value is baggage allowance details</p>
         */
        @NameInMap("passenger_baggage_allowance_mapping")
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

        /**
         * <p>segment id list. 
         * all the listed segment id share the same baggage rule</p>
         */
        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static SearchResponseBodyDataSolutionListSegmentBaggageMappingList build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDataSolutionListSegmentBaggageMappingList self = new SearchResponseBodyDataSolutionListSegmentBaggageMappingList();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDataSolutionListSegmentBaggageMappingList setPassengerBaggageAllowanceMapping(java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping) {
            this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
            return this;
        }
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        public SearchResponseBodyDataSolutionListSegmentBaggageMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList extends TeaModel {
        /**
         * <p>change and refund policy mapping, key is passenger type, value is change and refund policy details</p>
         */
        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

        /**
         * <p>segment id list. 
         * all the listed segment ids share the same change and refund policy</p>
         */
        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList self = new SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList setRefundChangeRuleMap(java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap) {
            this.refundChangeRuleMap = refundChangeRuleMap;
            return this;
        }
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        public SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class SearchResponseBodyDataSolutionListSolutionAttribute extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("supply_source_type")
        public String supplySourceType;

        public static SearchResponseBodyDataSolutionListSolutionAttribute build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDataSolutionListSolutionAttribute self = new SearchResponseBodyDataSolutionListSolutionAttribute();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDataSolutionListSolutionAttribute setSupplySourceType(String supplySourceType) {
            this.supplySourceType = supplySourceType;
            return this;
        }
        public String getSupplySourceType() {
            return this.supplySourceType;
        }

    }

    public static class SearchResponseBodyDataSolutionList extends TeaModel {
        /**
         * <p>adult fare</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("adult_price")
        public Double adultPrice;

        /**
         * <p>adult tax</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("adult_tax")
        public Double adultTax;

        /**
         * <p>child fare</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("child_price")
        public Double childPrice;

        /**
         * <p>child tax</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("child_tax")
        public Double childTax;

        /**
         * <p>infant fare</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("infant_price")
        public Double infantPrice;

        /**
         * <p>infant tax</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("infant_tax")
        public Double infantTax;

        /**
         * <p>segment list</p>
         */
        @NameInMap("journey_list")
        public java.util.List<SearchResponseBodyDataSolutionListJourneyList> journeyList;

        /**
         * <p>product type description</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("product_type_description")
        public String productTypeDescription;

        /**
         * <p>refund airline coupon description</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("refund_ticket_coupon_description")
        public String refundTicketCouponDescription;

        /**
         * <p>through check-in baggage policy</p>
         */
        @NameInMap("segment_baggage_check_in_info_list")
        public java.util.List<SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        /**
         * <p>baggage rule</p>
         */
        @NameInMap("segment_baggage_mapping_list")
        public java.util.List<SearchResponseBodyDataSolutionListSegmentBaggageMappingList> segmentBaggageMappingList;

        /**
         * <p>change and refund policy</p>
         */
        @NameInMap("segment_refund_change_rule_mapping_list")
        public java.util.List<SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        @NameInMap("solution_attribute")
        public SearchResponseBodyDataSolutionListSolutionAttribute solutionAttribute;

        /**
         * <p>solution ID</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
         */
        @NameInMap("solution_id")
        public String solutionId;

        public static SearchResponseBodyDataSolutionList build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDataSolutionList self = new SearchResponseBodyDataSolutionList();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDataSolutionList setAdultPrice(Double adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        public SearchResponseBodyDataSolutionList setAdultTax(Double adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Double getAdultTax() {
            return this.adultTax;
        }

        public SearchResponseBodyDataSolutionList setChildPrice(Double childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Double getChildPrice() {
            return this.childPrice;
        }

        public SearchResponseBodyDataSolutionList setChildTax(Double childTax) {
            this.childTax = childTax;
            return this;
        }
        public Double getChildTax() {
            return this.childTax;
        }

        public SearchResponseBodyDataSolutionList setInfantPrice(Double infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        public SearchResponseBodyDataSolutionList setInfantTax(Double infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Double getInfantTax() {
            return this.infantTax;
        }

        public SearchResponseBodyDataSolutionList setJourneyList(java.util.List<SearchResponseBodyDataSolutionListJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<SearchResponseBodyDataSolutionListJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public SearchResponseBodyDataSolutionList setProductTypeDescription(String productTypeDescription) {
            this.productTypeDescription = productTypeDescription;
            return this;
        }
        public String getProductTypeDescription() {
            return this.productTypeDescription;
        }

        public SearchResponseBodyDataSolutionList setRefundTicketCouponDescription(String refundTicketCouponDescription) {
            this.refundTicketCouponDescription = refundTicketCouponDescription;
            return this;
        }
        public String getRefundTicketCouponDescription() {
            return this.refundTicketCouponDescription;
        }

        public SearchResponseBodyDataSolutionList setSegmentBaggageCheckInInfoList(java.util.List<SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
            this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
            return this;
        }
        public java.util.List<SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> getSegmentBaggageCheckInInfoList() {
            return this.segmentBaggageCheckInInfoList;
        }

        public SearchResponseBodyDataSolutionList setSegmentBaggageMappingList(java.util.List<SearchResponseBodyDataSolutionListSegmentBaggageMappingList> segmentBaggageMappingList) {
            this.segmentBaggageMappingList = segmentBaggageMappingList;
            return this;
        }
        public java.util.List<SearchResponseBodyDataSolutionListSegmentBaggageMappingList> getSegmentBaggageMappingList() {
            return this.segmentBaggageMappingList;
        }

        public SearchResponseBodyDataSolutionList setSegmentRefundChangeRuleMappingList(java.util.List<SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
            this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
            return this;
        }
        public java.util.List<SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> getSegmentRefundChangeRuleMappingList() {
            return this.segmentRefundChangeRuleMappingList;
        }

        public SearchResponseBodyDataSolutionList setSolutionAttribute(SearchResponseBodyDataSolutionListSolutionAttribute solutionAttribute) {
            this.solutionAttribute = solutionAttribute;
            return this;
        }
        public SearchResponseBodyDataSolutionListSolutionAttribute getSolutionAttribute() {
            return this.solutionAttribute;
        }

        public SearchResponseBodyDataSolutionList setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

    public static class SearchResponseBodyData extends TeaModel {
        /**
         * <p>solution list</p>
         */
        @NameInMap("solution_list")
        public java.util.List<SearchResponseBodyDataSolutionList> solutionList;

        public static SearchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyData self = new SearchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyData setSolutionList(java.util.List<SearchResponseBodyDataSolutionList> solutionList) {
            this.solutionList = solutionList;
            return this;
        }
        public java.util.List<SearchResponseBodyDataSolutionList> getSolutionList() {
            return this.solutionList;
        }

    }

}

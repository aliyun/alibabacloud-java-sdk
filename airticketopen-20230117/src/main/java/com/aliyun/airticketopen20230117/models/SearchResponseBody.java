// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2236993B-7BE7-5F92-B179-21FF08570165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public SearchResponseBodyData data;

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
         * <p>1259</p>
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
        @NameInMap("segment_list")
        public java.util.List<SearchResponseBodyDataSolutionListJourneyListSegmentList> segmentList;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("luggage_direct_info_type")
        public Integer luggageDirectInfoType;

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
        @NameInMap("passenger_baggage_allowance_mapping")
        public java.util.Map<String, DataSolutionListSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

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
        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataSolutionListSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

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

    public static class SearchResponseBodyDataSolutionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("adult_price")
        public Double adultPrice;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("adult_tax")
        public Double adultTax;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("child_price")
        public Double childPrice;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("child_tax")
        public Double childTax;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("infant_price")
        public Double infantPrice;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("infant_tax")
        public Double infantTax;

        @NameInMap("journey_list")
        public java.util.List<SearchResponseBodyDataSolutionListJourneyList> journeyList;

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
        public java.util.List<SearchResponseBodyDataSolutionListSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        @NameInMap("segment_baggage_mapping_list")
        public java.util.List<SearchResponseBodyDataSolutionListSegmentBaggageMappingList> segmentBaggageMappingList;

        @NameInMap("segment_refund_change_rule_mapping_list")
        public java.util.List<SearchResponseBodyDataSolutionListSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        /**
         * <p>solution_id</p>
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

        public SearchResponseBodyDataSolutionList setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

    public static class SearchResponseBodyData extends TeaModel {
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

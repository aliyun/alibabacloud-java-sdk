// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public SearchResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

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
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        @NameInMap("arrival_city")
        public String arrivalCity;

        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        @NameInMap("arrival_time")
        public String arrivalTime;

        @NameInMap("availability")
        public String availability;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("code_share")
        public Boolean codeShare;

        @NameInMap("departure_airport")
        public String departureAirport;

        @NameInMap("departure_city")
        public String departureCity;

        @NameInMap("departure_terminal")
        public String departureTerminal;

        @NameInMap("departure_time")
        public String departureTime;

        @NameInMap("equip_type")
        public String equipType;

        @NameInMap("flight_duration")
        public Integer flightDuration;

        @NameInMap("marketing_airline")
        public String marketingAirline;

        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        @NameInMap("operating_airline")
        public String operatingAirline;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        @NameInMap("segment_id")
        public String segmentId;

        @NameInMap("stop_city_list")
        public String stopCityList;

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
        @NameInMap("adult_price")
        public Double adultPrice;

        @NameInMap("adult_tax")
        public Double adultTax;

        @NameInMap("child_price")
        public Double childPrice;

        @NameInMap("child_tax")
        public Double childTax;

        @NameInMap("infant_price")
        public Double infantPrice;

        @NameInMap("infant_tax")
        public Double infantTax;

        @NameInMap("journey_list")
        public java.util.List<SearchResponseBodyDataSolutionListJourneyList> journeyList;

        @NameInMap("product_type_description")
        public String productTypeDescription;

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

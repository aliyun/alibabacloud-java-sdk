// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class ChangeReShopResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public ChangeReShopResponseBodyData data;

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

    public static ChangeReShopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeReShopResponseBody self = new ChangeReShopResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeReShopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeReShopResponseBody setData(ChangeReShopResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeReShopResponseBodyData getData() {
        return this.data;
    }

    public ChangeReShopResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ChangeReShopResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public ChangeReShopResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ChangeReShopResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ChangeReShopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList extends TeaModel {
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

        public static ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList self = new ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList();
            return TeaModel.build(map, self);
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class ChangeReShopResponseBodyDataSolutionsJourneyList extends TeaModel {
        @NameInMap("segment_list")
        public java.util.List<ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList> segmentList;

        @NameInMap("transfer_count")
        public Integer transferCount;

        public static ChangeReShopResponseBodyDataSolutionsJourneyList build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopResponseBodyDataSolutionsJourneyList self = new ChangeReShopResponseBodyDataSolutionsJourneyList();
            return TeaModel.build(map, self);
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyList setSegmentList(java.util.List<ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<ChangeReShopResponseBodyDataSolutionsJourneyListSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public ChangeReShopResponseBodyDataSolutionsJourneyList setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList extends TeaModel {
        @NameInMap("luggage_direct_info_type")
        public Integer luggageDirectInfoType;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList self = new ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList();
            return TeaModel.build(map, self);
        }

        public ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList setLuggageDirectInfoType(Integer luggageDirectInfoType) {
            this.luggageDirectInfoType = luggageDirectInfoType;
            return this;
        }
        public Integer getLuggageDirectInfoType() {
            return this.luggageDirectInfoType;
        }

        public ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList extends TeaModel {
        @NameInMap("passenger_baggage_allowance_mapping")
        public java.util.Map<String, DataSolutionsSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList self = new ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList();
            return TeaModel.build(map, self);
        }

        public ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList setPassengerBaggageAllowanceMapping(java.util.Map<String, DataSolutionsSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping) {
            this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
            return this;
        }
        public java.util.Map<String, DataSolutionsSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        public ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList extends TeaModel {
        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList self = new ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList();
            return TeaModel.build(map, self);
        }

        public ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList setRefundChangeRuleMap(java.util.Map<String, DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap) {
            this.refundChangeRuleMap = refundChangeRuleMap;
            return this;
        }
        public java.util.Map<String, DataSolutionsSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        public ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class ChangeReShopResponseBodyDataSolutions extends TeaModel {
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
        public java.util.List<ChangeReShopResponseBodyDataSolutionsJourneyList> journeyList;

        @NameInMap("product_type_description")
        public String productTypeDescription;

        @NameInMap("refund_ticket_coupon_description")
        public String refundTicketCouponDescription;

        @NameInMap("segment_baggage_check_in_info_list")
        public java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        @NameInMap("segment_baggage_mapping_list")
        public java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList> segmentBaggageMappingList;

        @NameInMap("segment_refund_change_rule_mapping_list")
        public java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        /**
         * <p>solution_id</p>
         */
        @NameInMap("solution_id")
        public String solutionId;

        public static ChangeReShopResponseBodyDataSolutions build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopResponseBodyDataSolutions self = new ChangeReShopResponseBodyDataSolutions();
            return TeaModel.build(map, self);
        }

        public ChangeReShopResponseBodyDataSolutions setAdultPrice(Double adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        public ChangeReShopResponseBodyDataSolutions setAdultTax(Double adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Double getAdultTax() {
            return this.adultTax;
        }

        public ChangeReShopResponseBodyDataSolutions setChildPrice(Double childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Double getChildPrice() {
            return this.childPrice;
        }

        public ChangeReShopResponseBodyDataSolutions setChildTax(Double childTax) {
            this.childTax = childTax;
            return this;
        }
        public Double getChildTax() {
            return this.childTax;
        }

        public ChangeReShopResponseBodyDataSolutions setInfantPrice(Double infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        public ChangeReShopResponseBodyDataSolutions setInfantTax(Double infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Double getInfantTax() {
            return this.infantTax;
        }

        public ChangeReShopResponseBodyDataSolutions setJourneyList(java.util.List<ChangeReShopResponseBodyDataSolutionsJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<ChangeReShopResponseBodyDataSolutionsJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public ChangeReShopResponseBodyDataSolutions setProductTypeDescription(String productTypeDescription) {
            this.productTypeDescription = productTypeDescription;
            return this;
        }
        public String getProductTypeDescription() {
            return this.productTypeDescription;
        }

        public ChangeReShopResponseBodyDataSolutions setRefundTicketCouponDescription(String refundTicketCouponDescription) {
            this.refundTicketCouponDescription = refundTicketCouponDescription;
            return this;
        }
        public String getRefundTicketCouponDescription() {
            return this.refundTicketCouponDescription;
        }

        public ChangeReShopResponseBodyDataSolutions setSegmentBaggageCheckInInfoList(java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
            this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
            return this;
        }
        public java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentBaggageCheckInInfoList> getSegmentBaggageCheckInInfoList() {
            return this.segmentBaggageCheckInInfoList;
        }

        public ChangeReShopResponseBodyDataSolutions setSegmentBaggageMappingList(java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList> segmentBaggageMappingList) {
            this.segmentBaggageMappingList = segmentBaggageMappingList;
            return this;
        }
        public java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentBaggageMappingList> getSegmentBaggageMappingList() {
            return this.segmentBaggageMappingList;
        }

        public ChangeReShopResponseBodyDataSolutions setSegmentRefundChangeRuleMappingList(java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
            this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
            return this;
        }
        public java.util.List<ChangeReShopResponseBodyDataSolutionsSegmentRefundChangeRuleMappingList> getSegmentRefundChangeRuleMappingList() {
            return this.segmentRefundChangeRuleMappingList;
        }

        public ChangeReShopResponseBodyDataSolutions setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

    public static class ChangeReShopResponseBodyData extends TeaModel {
        @NameInMap("solutions")
        public java.util.List<ChangeReShopResponseBodyDataSolutions> solutions;

        public static ChangeReShopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeReShopResponseBodyData self = new ChangeReShopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeReShopResponseBodyData setSolutions(java.util.List<ChangeReShopResponseBodyDataSolutions> solutions) {
            this.solutions = solutions;
            return this;
        }
        public java.util.List<ChangeReShopResponseBodyDataSolutions> getSolutions() {
            return this.solutions;
        }

    }

}

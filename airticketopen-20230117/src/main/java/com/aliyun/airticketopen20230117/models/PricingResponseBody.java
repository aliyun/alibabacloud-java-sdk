// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class PricingResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public PricingResponseBodyData data;

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

    public static PricingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PricingResponseBody self = new PricingResponseBody();
        return TeaModel.build(map, self);
    }

    public PricingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PricingResponseBody setData(PricingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PricingResponseBodyData getData() {
        return this.data;
    }

    public PricingResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PricingResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public PricingResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public PricingResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public PricingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PricingResponseBodyDataChangedPriceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("adult_price")
        public Double adultPrice;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("adult_tax")
        public Double adultTax;

        /**
         * <strong>example:</strong>
         * <p>100</p>
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

        public static PricingResponseBodyDataChangedPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyDataChangedPriceInfo self = new PricingResponseBodyDataChangedPriceInfo();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyDataChangedPriceInfo setAdultPrice(Double adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        public PricingResponseBodyDataChangedPriceInfo setAdultTax(Double adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Double getAdultTax() {
            return this.adultTax;
        }

        public PricingResponseBodyDataChangedPriceInfo setChildPrice(Double childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Double getChildPrice() {
            return this.childPrice;
        }

        public PricingResponseBodyDataChangedPriceInfo setChildTax(Double childTax) {
            this.childTax = childTax;
            return this;
        }
        public Double getChildTax() {
            return this.childTax;
        }

        public PricingResponseBodyDataChangedPriceInfo setInfantPrice(Double infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        public PricingResponseBodyDataChangedPriceInfo setInfantTax(Double infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Double getInfantTax() {
            return this.infantTax;
        }

    }

    public static class PricingResponseBodyDataOriginalPriceInfo extends TeaModel {
        /**
         * <p>成人单价</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("adult_price")
        public Double adultPrice;

        /**
         * <p>成人税</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("adult_tax")
        public Double adultTax;

        /**
         * <p>儿童单价</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("child_price")
        public Double childPrice;

        /**
         * <p>儿童税</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("child_tax")
        public Double childTax;

        /**
         * <p>婴儿单价</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("infant_price")
        public Double infantPrice;

        /**
         * <p>婴儿税</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("infant_tax")
        public Double infantTax;

        public static PricingResponseBodyDataOriginalPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyDataOriginalPriceInfo self = new PricingResponseBodyDataOriginalPriceInfo();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyDataOriginalPriceInfo setAdultPrice(Double adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        public PricingResponseBodyDataOriginalPriceInfo setAdultTax(Double adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Double getAdultTax() {
            return this.adultTax;
        }

        public PricingResponseBodyDataOriginalPriceInfo setChildPrice(Double childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Double getChildPrice() {
            return this.childPrice;
        }

        public PricingResponseBodyDataOriginalPriceInfo setChildTax(Double childTax) {
            this.childTax = childTax;
            return this;
        }
        public Double getChildTax() {
            return this.childTax;
        }

        public PricingResponseBodyDataOriginalPriceInfo setInfantPrice(Double infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        public PricingResponseBodyDataOriginalPriceInfo setInfantTax(Double infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Double getInfantTax() {
            return this.infantTax;
        }

    }

    public static class PricingResponseBodyDataSolutionJourneyListSegmentList extends TeaModel {
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
         * <p>ALL_CABIN</p>
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
         * <p>&quot;&quot;</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static PricingResponseBodyDataSolutionJourneyListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyDataSolutionJourneyListSegmentList self = new PricingResponseBodyDataSolutionJourneyListSegmentList();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public PricingResponseBodyDataSolutionJourneyListSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class PricingResponseBodyDataSolutionJourneyList extends TeaModel {
        @NameInMap("segment_list")
        public java.util.List<PricingResponseBodyDataSolutionJourneyListSegmentList> segmentList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static PricingResponseBodyDataSolutionJourneyList build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyDataSolutionJourneyList self = new PricingResponseBodyDataSolutionJourneyList();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyDataSolutionJourneyList setSegmentList(java.util.List<PricingResponseBodyDataSolutionJourneyListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<PricingResponseBodyDataSolutionJourneyListSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public PricingResponseBodyDataSolutionJourneyList setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("luggage_direct_info_type")
        public Integer luggageDirectInfoType;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList self = new PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList setLuggageDirectInfoType(Integer luggageDirectInfoType) {
            this.luggageDirectInfoType = luggageDirectInfoType;
            return this;
        }
        public Integer getLuggageDirectInfoType() {
            return this.luggageDirectInfoType;
        }

        public PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class PricingResponseBodyDataSolutionSegmentBaggageMappingList extends TeaModel {
        @NameInMap("passenger_baggage_allowance_mapping")
        public java.util.Map<String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static PricingResponseBodyDataSolutionSegmentBaggageMappingList build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyDataSolutionSegmentBaggageMappingList self = new PricingResponseBodyDataSolutionSegmentBaggageMappingList();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyDataSolutionSegmentBaggageMappingList setPassengerBaggageAllowanceMapping(java.util.Map<String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> passengerBaggageAllowanceMapping) {
            this.passengerBaggageAllowanceMapping = passengerBaggageAllowanceMapping;
            return this;
        }
        public java.util.Map<String, DataSolutionSegmentBaggageMappingListPassengerBaggageAllowanceMappingValue> getPassengerBaggageAllowanceMapping() {
            return this.passengerBaggageAllowanceMapping;
        }

        public PricingResponseBodyDataSolutionSegmentBaggageMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList extends TeaModel {
        @NameInMap("refund_change_rule_map")
        public java.util.Map<String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList self = new PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList setRefundChangeRuleMap(java.util.Map<String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> refundChangeRuleMap) {
            this.refundChangeRuleMap = refundChangeRuleMap;
            return this;
        }
        public java.util.Map<String, DataSolutionSegmentRefundChangeRuleMappingListRefundChangeRuleMapValue> getRefundChangeRuleMap() {
            return this.refundChangeRuleMap;
        }

        public PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class PricingResponseBodyDataSolution extends TeaModel {
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
         * <p>200</p>
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
        public java.util.List<PricingResponseBodyDataSolutionJourneyList> journeyList;

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
        public java.util.List<PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList;

        @NameInMap("segment_baggage_mapping_list")
        public java.util.List<PricingResponseBodyDataSolutionSegmentBaggageMappingList> segmentBaggageMappingList;

        @NameInMap("segment_refund_change_rule_mapping_list")
        public java.util.List<PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList;

        /**
         * <p>solution_id</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
         */
        @NameInMap("solution_id")
        public String solutionId;

        public static PricingResponseBodyDataSolution build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyDataSolution self = new PricingResponseBodyDataSolution();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyDataSolution setAdultPrice(Double adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Double getAdultPrice() {
            return this.adultPrice;
        }

        public PricingResponseBodyDataSolution setAdultTax(Double adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Double getAdultTax() {
            return this.adultTax;
        }

        public PricingResponseBodyDataSolution setChildPrice(Double childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Double getChildPrice() {
            return this.childPrice;
        }

        public PricingResponseBodyDataSolution setChildTax(Double childTax) {
            this.childTax = childTax;
            return this;
        }
        public Double getChildTax() {
            return this.childTax;
        }

        public PricingResponseBodyDataSolution setInfantPrice(Double infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Double getInfantPrice() {
            return this.infantPrice;
        }

        public PricingResponseBodyDataSolution setInfantTax(Double infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Double getInfantTax() {
            return this.infantTax;
        }

        public PricingResponseBodyDataSolution setJourneyList(java.util.List<PricingResponseBodyDataSolutionJourneyList> journeyList) {
            this.journeyList = journeyList;
            return this;
        }
        public java.util.List<PricingResponseBodyDataSolutionJourneyList> getJourneyList() {
            return this.journeyList;
        }

        public PricingResponseBodyDataSolution setProductTypeDescription(String productTypeDescription) {
            this.productTypeDescription = productTypeDescription;
            return this;
        }
        public String getProductTypeDescription() {
            return this.productTypeDescription;
        }

        public PricingResponseBodyDataSolution setRefundTicketCouponDescription(String refundTicketCouponDescription) {
            this.refundTicketCouponDescription = refundTicketCouponDescription;
            return this;
        }
        public String getRefundTicketCouponDescription() {
            return this.refundTicketCouponDescription;
        }

        public PricingResponseBodyDataSolution setSegmentBaggageCheckInInfoList(java.util.List<PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList> segmentBaggageCheckInInfoList) {
            this.segmentBaggageCheckInInfoList = segmentBaggageCheckInInfoList;
            return this;
        }
        public java.util.List<PricingResponseBodyDataSolutionSegmentBaggageCheckInInfoList> getSegmentBaggageCheckInInfoList() {
            return this.segmentBaggageCheckInInfoList;
        }

        public PricingResponseBodyDataSolution setSegmentBaggageMappingList(java.util.List<PricingResponseBodyDataSolutionSegmentBaggageMappingList> segmentBaggageMappingList) {
            this.segmentBaggageMappingList = segmentBaggageMappingList;
            return this;
        }
        public java.util.List<PricingResponseBodyDataSolutionSegmentBaggageMappingList> getSegmentBaggageMappingList() {
            return this.segmentBaggageMappingList;
        }

        public PricingResponseBodyDataSolution setSegmentRefundChangeRuleMappingList(java.util.List<PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList> segmentRefundChangeRuleMappingList) {
            this.segmentRefundChangeRuleMappingList = segmentRefundChangeRuleMappingList;
            return this;
        }
        public java.util.List<PricingResponseBodyDataSolutionSegmentRefundChangeRuleMappingList> getSegmentRefundChangeRuleMappingList() {
            return this.segmentRefundChangeRuleMappingList;
        }

        public PricingResponseBodyDataSolution setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

    public static class PricingResponseBodyData extends TeaModel {
        @NameInMap("changed_price_info")
        public PricingResponseBodyDataChangedPriceInfo changedPriceInfo;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_changed")
        public Boolean isChanged;

        /**
         * <p>变价之前价格信息 isChanged = true 时，才有值</p>
         */
        @NameInMap("original_price_info")
        public PricingResponseBodyDataOriginalPriceInfo originalPriceInfo;

        @NameInMap("remain_seats")
        public String remainSeats;

        /**
         * <p>solution</p>
         */
        @NameInMap("solution")
        public PricingResponseBodyDataSolution solution;

        public static PricingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PricingResponseBodyData self = new PricingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PricingResponseBodyData setChangedPriceInfo(PricingResponseBodyDataChangedPriceInfo changedPriceInfo) {
            this.changedPriceInfo = changedPriceInfo;
            return this;
        }
        public PricingResponseBodyDataChangedPriceInfo getChangedPriceInfo() {
            return this.changedPriceInfo;
        }

        public PricingResponseBodyData setIsChanged(Boolean isChanged) {
            this.isChanged = isChanged;
            return this;
        }
        public Boolean getIsChanged() {
            return this.isChanged;
        }

        public PricingResponseBodyData setOriginalPriceInfo(PricingResponseBodyDataOriginalPriceInfo originalPriceInfo) {
            this.originalPriceInfo = originalPriceInfo;
            return this;
        }
        public PricingResponseBodyDataOriginalPriceInfo getOriginalPriceInfo() {
            return this.originalPriceInfo;
        }

        public PricingResponseBodyData setRemainSeats(String remainSeats) {
            this.remainSeats = remainSeats;
            return this;
        }
        public String getRemainSeats() {
            return this.remainSeats;
        }

        public PricingResponseBodyData setSolution(PricingResponseBodyDataSolution solution) {
            this.solution = solution;
            return this;
        }
        public PricingResponseBodyDataSolution getSolution() {
            return this.solution;
        }

    }

}

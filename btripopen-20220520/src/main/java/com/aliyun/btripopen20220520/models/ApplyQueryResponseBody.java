// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public ApplyQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static ApplyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyQueryResponseBody self = new ApplyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyQueryResponseBody setModule(ApplyQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ApplyQueryResponseBodyModule getModule() {
        return this.module;
    }

    public ApplyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApplyQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ApplyQueryResponseBodyModuleApproverList extends TeaModel {
        @NameInMap("note")
        public String note;

        @NameInMap("operate_time")
        public String operateTime;

        @NameInMap("order")
        public Integer order;

        @NameInMap("status")
        public Integer status;

        @NameInMap("status_desc")
        public String statusDesc;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static ApplyQueryResponseBodyModuleApproverList build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleApproverList self = new ApplyQueryResponseBodyModuleApproverList();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleApproverList setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ApplyQueryResponseBodyModuleApproverList setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public ApplyQueryResponseBodyModuleApproverList setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public ApplyQueryResponseBodyModuleApproverList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ApplyQueryResponseBodyModuleApproverList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ApplyQueryResponseBodyModuleApproverList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ApplyQueryResponseBodyModuleApproverList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ApplyQueryResponseBodyModuleCarRule extends TeaModel {
        @NameInMap("scenario_template_id")
        public String scenarioTemplateId;

        @NameInMap("scenario_template_name")
        public String scenarioTemplateName;

        public static ApplyQueryResponseBodyModuleCarRule build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleCarRule self = new ApplyQueryResponseBodyModuleCarRule();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleCarRule setScenarioTemplateId(String scenarioTemplateId) {
            this.scenarioTemplateId = scenarioTemplateId;
            return this;
        }
        public String getScenarioTemplateId() {
            return this.scenarioTemplateId;
        }

        public ApplyQueryResponseBodyModuleCarRule setScenarioTemplateName(String scenarioTemplateName) {
            this.scenarioTemplateName = scenarioTemplateName;
            return this;
        }
        public String getScenarioTemplateName() {
            return this.scenarioTemplateName;
        }

    }

    public static class ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys self = new ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys self = new ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyQueryResponseBodyModuleExternalTravelerList extends TeaModel {
        @NameInMap("business_discount")
        public Integer businessDiscount;

        @NameInMap("economy_discount")
        public Integer economyDiscount;

        @NameInMap("first_discount")
        public Integer firstDiscount;

        @NameInMap("flight_cabins")
        public String flightCabins;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys> hotelIntlCitys;

        @NameInMap("premium_economy_discount")
        public Integer premiumEconomyDiscount;

        @NameInMap("reserve_type")
        public Integer reserveType;

        @NameInMap("train_seats")
        public String trainSeats;

        @NameInMap("user_name")
        public String userName;

        public static ApplyQueryResponseBodyModuleExternalTravelerList build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleExternalTravelerList self = new ApplyQueryResponseBodyModuleExternalTravelerList();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setBusinessDiscount(Integer businessDiscount) {
            this.businessDiscount = businessDiscount;
            return this;
        }
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setEconomyDiscount(Integer economyDiscount) {
            this.economyDiscount = economyDiscount;
            return this;
        }
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setFirstDiscount(Integer firstDiscount) {
            this.firstDiscount = firstDiscount;
            return this;
        }
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setFlightCabins(String flightCabins) {
            this.flightCabins = flightCabins;
            return this;
        }
        public String getFlightCabins() {
            return this.flightCabins;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setHotelCitys(java.util.List<ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys> hotelCitys) {
            this.hotelCitys = hotelCitys;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleExternalTravelerListHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setHotelIntlCitys(java.util.List<ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys> hotelIntlCitys) {
            this.hotelIntlCitys = hotelIntlCitys;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleExternalTravelerListHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setPremiumEconomyDiscount(Integer premiumEconomyDiscount) {
            this.premiumEconomyDiscount = premiumEconomyDiscount;
            return this;
        }
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setReserveType(Integer reserveType) {
            this.reserveType = reserveType;
            return this;
        }
        public Integer getReserveType() {
            return this.reserveType;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setTrainSeats(String trainSeats) {
            this.trainSeats = trainSeats;
            return this;
        }
        public String getTrainSeats() {
            return this.trainSeats;
        }

        public ApplyQueryResponseBodyModuleExternalTravelerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ApplyQueryResponseBodyModuleHotelShare extends TeaModel {
        @NameInMap("param")
        public String param;

        @NameInMap("type")
        public String type;

        public static ApplyQueryResponseBodyModuleHotelShare build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleHotelShare self = new ApplyQueryResponseBodyModuleHotelShare();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleHotelShare setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public ApplyQueryResponseBodyModuleHotelShare setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ApplyQueryResponseBodyModuleItineraryListItineraryTravelStandard extends TeaModel {
        @NameInMap("hotel_available_nights_per_day")
        public Integer hotelAvailableNightsPerDay;

        public static ApplyQueryResponseBodyModuleItineraryListItineraryTravelStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleItineraryListItineraryTravelStandard self = new ApplyQueryResponseBodyModuleItineraryListItineraryTravelStandard();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleItineraryListItineraryTravelStandard setHotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
            this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
            return this;
        }
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

    }

    public static class ApplyQueryResponseBodyModuleItineraryList extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("invoice_name")
        public String invoiceName;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("itinerary_travel_standard")
        public ApplyQueryResponseBodyModuleItineraryListItineraryTravelStandard itineraryTravelStandard;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("traffic_type")
        public Integer trafficType;

        @NameInMap("trip_way")
        public Integer tripWay;

        public static ApplyQueryResponseBodyModuleItineraryList build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleItineraryList self = new ApplyQueryResponseBodyModuleItineraryList();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleItineraryList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public ApplyQueryResponseBodyModuleItineraryList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public ApplyQueryResponseBodyModuleItineraryList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public ApplyQueryResponseBodyModuleItineraryList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public ApplyQueryResponseBodyModuleItineraryList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public ApplyQueryResponseBodyModuleItineraryList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public ApplyQueryResponseBodyModuleItineraryList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public ApplyQueryResponseBodyModuleItineraryList setInvoiceName(String invoiceName) {
            this.invoiceName = invoiceName;
            return this;
        }
        public String getInvoiceName() {
            return this.invoiceName;
        }

        public ApplyQueryResponseBodyModuleItineraryList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public ApplyQueryResponseBodyModuleItineraryList setItineraryTravelStandard(ApplyQueryResponseBodyModuleItineraryListItineraryTravelStandard itineraryTravelStandard) {
            this.itineraryTravelStandard = itineraryTravelStandard;
            return this;
        }
        public ApplyQueryResponseBodyModuleItineraryListItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
        }

        public ApplyQueryResponseBodyModuleItineraryList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyQueryResponseBodyModuleItineraryList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyQueryResponseBodyModuleItineraryList setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public ApplyQueryResponseBodyModuleItineraryList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

        public ApplyQueryResponseBodyModuleItineraryList setTripWay(Integer tripWay) {
            this.tripWay = tripWay;
            return this;
        }
        public Integer getTripWay() {
            return this.tripWay;
        }

    }

    public static class ApplyQueryResponseBodyModuleItinerarySetListItineraryTravelStandard extends TeaModel {
        @NameInMap("hotel_available_nights_per_day")
        public Integer hotelAvailableNightsPerDay;

        public static ApplyQueryResponseBodyModuleItinerarySetListItineraryTravelStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleItinerarySetListItineraryTravelStandard self = new ApplyQueryResponseBodyModuleItinerarySetListItineraryTravelStandard();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleItinerarySetListItineraryTravelStandard setHotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
            this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
            return this;
        }
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

    }

    public static class ApplyQueryResponseBodyModuleItinerarySetList extends TeaModel {
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("city_code_set")
        public String cityCodeSet;

        @NameInMap("city_set")
        public String citySet;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("invoice_name")
        public String invoiceName;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("itinerary_travel_standard")
        public ApplyQueryResponseBodyModuleItinerarySetListItineraryTravelStandard itineraryTravelStandard;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("traffic_type")
        public Integer trafficType;

        public static ApplyQueryResponseBodyModuleItinerarySetList build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleItinerarySetList self = new ApplyQueryResponseBodyModuleItinerarySetList();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setCityCodeSet(String cityCodeSet) {
            this.cityCodeSet = cityCodeSet;
            return this;
        }
        public String getCityCodeSet() {
            return this.cityCodeSet;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setCitySet(String citySet) {
            this.citySet = citySet;
            return this;
        }
        public String getCitySet() {
            return this.citySet;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setInvoiceName(String invoiceName) {
            this.invoiceName = invoiceName;
            return this;
        }
        public String getInvoiceName() {
            return this.invoiceName;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setItineraryTravelStandard(ApplyQueryResponseBodyModuleItinerarySetListItineraryTravelStandard itineraryTravelStandard) {
            this.itineraryTravelStandard = itineraryTravelStandard;
            return this;
        }
        public ApplyQueryResponseBodyModuleItinerarySetListItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public ApplyQueryResponseBodyModuleItinerarySetList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

    }

    public static class ApplyQueryResponseBodyModuleTravelerListCarCitySet extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        public static ApplyQueryResponseBodyModuleTravelerListCarCitySet build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleTravelerListCarCitySet self = new ApplyQueryResponseBodyModuleTravelerListCarCitySet();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleTravelerListCarCitySet setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyQueryResponseBodyModuleTravelerListCarCitySet setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class ApplyQueryResponseBodyModuleTravelerListHotelCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyQueryResponseBodyModuleTravelerListHotelCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleTravelerListHotelCitys self = new ApplyQueryResponseBodyModuleTravelerListHotelCitys();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleTravelerListHotelCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyQueryResponseBodyModuleTravelerListHotelCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyQueryResponseBodyModuleTravelerListHotelCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys self = new ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyQueryResponseBodyModuleTravelerList extends TeaModel {
        @NameInMap("business_discount")
        public Integer businessDiscount;

        @NameInMap("car_city_set")
        public java.util.List<ApplyQueryResponseBodyModuleTravelerListCarCitySet> carCitySet;

        @NameInMap("economy_discount")
        public Integer economyDiscount;

        @NameInMap("first_discount")
        public Integer firstDiscount;

        @NameInMap("flight_cabins")
        public String flightCabins;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyQueryResponseBodyModuleTravelerListHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys> hotelIntlCitys;

        @NameInMap("premium_economy_discount")
        public Integer premiumEconomyDiscount;

        @NameInMap("reserve_type")
        public Integer reserveType;

        @NameInMap("train_seats")
        public String trainSeats;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static ApplyQueryResponseBodyModuleTravelerList build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModuleTravelerList self = new ApplyQueryResponseBodyModuleTravelerList();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModuleTravelerList setBusinessDiscount(Integer businessDiscount) {
            this.businessDiscount = businessDiscount;
            return this;
        }
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        public ApplyQueryResponseBodyModuleTravelerList setCarCitySet(java.util.List<ApplyQueryResponseBodyModuleTravelerListCarCitySet> carCitySet) {
            this.carCitySet = carCitySet;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleTravelerListCarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        public ApplyQueryResponseBodyModuleTravelerList setEconomyDiscount(Integer economyDiscount) {
            this.economyDiscount = economyDiscount;
            return this;
        }
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        public ApplyQueryResponseBodyModuleTravelerList setFirstDiscount(Integer firstDiscount) {
            this.firstDiscount = firstDiscount;
            return this;
        }
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        public ApplyQueryResponseBodyModuleTravelerList setFlightCabins(String flightCabins) {
            this.flightCabins = flightCabins;
            return this;
        }
        public String getFlightCabins() {
            return this.flightCabins;
        }

        public ApplyQueryResponseBodyModuleTravelerList setHotelCitys(java.util.List<ApplyQueryResponseBodyModuleTravelerListHotelCitys> hotelCitys) {
            this.hotelCitys = hotelCitys;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleTravelerListHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        public ApplyQueryResponseBodyModuleTravelerList setHotelIntlCitys(java.util.List<ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys> hotelIntlCitys) {
            this.hotelIntlCitys = hotelIntlCitys;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleTravelerListHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        public ApplyQueryResponseBodyModuleTravelerList setPremiumEconomyDiscount(Integer premiumEconomyDiscount) {
            this.premiumEconomyDiscount = premiumEconomyDiscount;
            return this;
        }
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        public ApplyQueryResponseBodyModuleTravelerList setReserveType(Integer reserveType) {
            this.reserveType = reserveType;
            return this;
        }
        public Integer getReserveType() {
            return this.reserveType;
        }

        public ApplyQueryResponseBodyModuleTravelerList setTrainSeats(String trainSeats) {
            this.trainSeats = trainSeats;
            return this;
        }
        public String getTrainSeats() {
            return this.trainSeats;
        }

        public ApplyQueryResponseBodyModuleTravelerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ApplyQueryResponseBodyModuleTravelerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_show_id")
        public String applyShowId;

        @NameInMap("approver_list")
        public java.util.List<ApplyQueryResponseBodyModuleApproverList> approverList;

        @NameInMap("budget")
        public Long budget;

        @NameInMap("budget_merge")
        public Integer budgetMerge;

        @NameInMap("car_rule")
        public ApplyQueryResponseBodyModuleCarRule carRule;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <p>补充描述，账单中将会体现此字段的值。可以用于企业的统计和对账</p>
         */
        @NameInMap("extend_field")
        public String extendField;

        @NameInMap("external_traveler_list")
        public java.util.List<ApplyQueryResponseBodyModuleExternalTravelerList> externalTravelerList;

        @NameInMap("flight_budget")
        public Long flightBudget;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("hotel_budget")
        public Long hotelBudget;

        @NameInMap("hotel_share")
        public ApplyQueryResponseBodyModuleHotelShare hotelShare;

        @NameInMap("id")
        public Long id;

        @NameInMap("itinerary_list")
        public java.util.List<ApplyQueryResponseBodyModuleItineraryList> itineraryList;

        @NameInMap("itinerary_rule")
        public Integer itineraryRule;

        @NameInMap("itinerary_set_list")
        public java.util.List<ApplyQueryResponseBodyModuleItinerarySetList> itinerarySetList;

        @NameInMap("limit_traveler")
        public Integer limitTraveler;

        @NameInMap("status")
        public Integer status;

        @NameInMap("status_desc")
        public String statusDesc;

        @NameInMap("thirdpart_business_id")
        public String thirdpartBusinessId;

        @NameInMap("thirdpart_id")
        public String thirdpartId;

        @NameInMap("together_book_rule")
        public Integer togetherBookRule;

        @NameInMap("train_budget")
        public Long trainBudget;

        @NameInMap("traveler_list")
        public java.util.List<ApplyQueryResponseBodyModuleTravelerList> travelerList;

        @NameInMap("trip_cause")
        public String tripCause;

        @NameInMap("trip_day")
        public Integer tripDay;

        @NameInMap("trip_title")
        public String tripTitle;

        @NameInMap("type")
        public Integer type;

        @NameInMap("union_no")
        public String unionNo;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        @NameInMap("vehicle_budget")
        public Long vehicleBudget;

        public static ApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ApplyQueryResponseBodyModule self = new ApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ApplyQueryResponseBodyModule setApplyShowId(String applyShowId) {
            this.applyShowId = applyShowId;
            return this;
        }
        public String getApplyShowId() {
            return this.applyShowId;
        }

        public ApplyQueryResponseBodyModule setApproverList(java.util.List<ApplyQueryResponseBodyModuleApproverList> approverList) {
            this.approverList = approverList;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleApproverList> getApproverList() {
            return this.approverList;
        }

        public ApplyQueryResponseBodyModule setBudget(Long budget) {
            this.budget = budget;
            return this;
        }
        public Long getBudget() {
            return this.budget;
        }

        public ApplyQueryResponseBodyModule setBudgetMerge(Integer budgetMerge) {
            this.budgetMerge = budgetMerge;
            return this;
        }
        public Integer getBudgetMerge() {
            return this.budgetMerge;
        }

        public ApplyQueryResponseBodyModule setCarRule(ApplyQueryResponseBodyModuleCarRule carRule) {
            this.carRule = carRule;
            return this;
        }
        public ApplyQueryResponseBodyModuleCarRule getCarRule() {
            return this.carRule;
        }

        public ApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ApplyQueryResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public ApplyQueryResponseBodyModule setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public ApplyQueryResponseBodyModule setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public ApplyQueryResponseBodyModule setExtendField(String extendField) {
            this.extendField = extendField;
            return this;
        }
        public String getExtendField() {
            return this.extendField;
        }

        public ApplyQueryResponseBodyModule setExternalTravelerList(java.util.List<ApplyQueryResponseBodyModuleExternalTravelerList> externalTravelerList) {
            this.externalTravelerList = externalTravelerList;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleExternalTravelerList> getExternalTravelerList() {
            return this.externalTravelerList;
        }

        public ApplyQueryResponseBodyModule setFlightBudget(Long flightBudget) {
            this.flightBudget = flightBudget;
            return this;
        }
        public Long getFlightBudget() {
            return this.flightBudget;
        }

        public ApplyQueryResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ApplyQueryResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ApplyQueryResponseBodyModule setHotelBudget(Long hotelBudget) {
            this.hotelBudget = hotelBudget;
            return this;
        }
        public Long getHotelBudget() {
            return this.hotelBudget;
        }

        public ApplyQueryResponseBodyModule setHotelShare(ApplyQueryResponseBodyModuleHotelShare hotelShare) {
            this.hotelShare = hotelShare;
            return this;
        }
        public ApplyQueryResponseBodyModuleHotelShare getHotelShare() {
            return this.hotelShare;
        }

        public ApplyQueryResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ApplyQueryResponseBodyModule setItineraryList(java.util.List<ApplyQueryResponseBodyModuleItineraryList> itineraryList) {
            this.itineraryList = itineraryList;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleItineraryList> getItineraryList() {
            return this.itineraryList;
        }

        public ApplyQueryResponseBodyModule setItineraryRule(Integer itineraryRule) {
            this.itineraryRule = itineraryRule;
            return this;
        }
        public Integer getItineraryRule() {
            return this.itineraryRule;
        }

        public ApplyQueryResponseBodyModule setItinerarySetList(java.util.List<ApplyQueryResponseBodyModuleItinerarySetList> itinerarySetList) {
            this.itinerarySetList = itinerarySetList;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleItinerarySetList> getItinerarySetList() {
            return this.itinerarySetList;
        }

        public ApplyQueryResponseBodyModule setLimitTraveler(Integer limitTraveler) {
            this.limitTraveler = limitTraveler;
            return this;
        }
        public Integer getLimitTraveler() {
            return this.limitTraveler;
        }

        public ApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ApplyQueryResponseBodyModule setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ApplyQueryResponseBodyModule setThirdpartBusinessId(String thirdpartBusinessId) {
            this.thirdpartBusinessId = thirdpartBusinessId;
            return this;
        }
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

        public ApplyQueryResponseBodyModule setThirdpartId(String thirdpartId) {
            this.thirdpartId = thirdpartId;
            return this;
        }
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        public ApplyQueryResponseBodyModule setTogetherBookRule(Integer togetherBookRule) {
            this.togetherBookRule = togetherBookRule;
            return this;
        }
        public Integer getTogetherBookRule() {
            return this.togetherBookRule;
        }

        public ApplyQueryResponseBodyModule setTrainBudget(Long trainBudget) {
            this.trainBudget = trainBudget;
            return this;
        }
        public Long getTrainBudget() {
            return this.trainBudget;
        }

        public ApplyQueryResponseBodyModule setTravelerList(java.util.List<ApplyQueryResponseBodyModuleTravelerList> travelerList) {
            this.travelerList = travelerList;
            return this;
        }
        public java.util.List<ApplyQueryResponseBodyModuleTravelerList> getTravelerList() {
            return this.travelerList;
        }

        public ApplyQueryResponseBodyModule setTripCause(String tripCause) {
            this.tripCause = tripCause;
            return this;
        }
        public String getTripCause() {
            return this.tripCause;
        }

        public ApplyQueryResponseBodyModule setTripDay(Integer tripDay) {
            this.tripDay = tripDay;
            return this;
        }
        public Integer getTripDay() {
            return this.tripDay;
        }

        public ApplyQueryResponseBodyModule setTripTitle(String tripTitle) {
            this.tripTitle = tripTitle;
            return this;
        }
        public String getTripTitle() {
            return this.tripTitle;
        }

        public ApplyQueryResponseBodyModule setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ApplyQueryResponseBodyModule setUnionNo(String unionNo) {
            this.unionNo = unionNo;
            return this;
        }
        public String getUnionNo() {
            return this.unionNo;
        }

        public ApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ApplyQueryResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ApplyQueryResponseBodyModule setVehicleBudget(Long vehicleBudget) {
            this.vehicleBudget = vehicleBudget;
            return this;
        }
        public Long getVehicleBudget() {
            return this.vehicleBudget;
        }

    }

}

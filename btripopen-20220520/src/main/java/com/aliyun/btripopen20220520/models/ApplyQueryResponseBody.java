// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public ApplyQueryResponseBodyModule module;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static ApplyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyQueryResponseBody self = new ApplyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
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

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

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

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

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

        public ApplyQueryResponseBodyModuleItinerarySetList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
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

    public static class ApplyQueryResponseBodyModuleTravelerList extends TeaModel {
        @NameInMap("business_discount")
        public Integer businessDiscount;

        @NameInMap("economy_discount")
        public Integer economyDiscount;

        @NameInMap("first_discount")
        public Integer firstDiscount;

        @NameInMap("flight_cabins")
        public String flightCabins;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyQueryResponseBodyModuleTravelerListHotelCitys> hotelCitys;

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

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

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

    public static class CarApplyQueryResponseBodyApplyListApproverList extends TeaModel {
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

        public static CarApplyQueryResponseBodyApplyListApproverList build(java.util.Map<String, ?> map) throws Exception {
            CarApplyQueryResponseBodyApplyListApproverList self = new CarApplyQueryResponseBodyApplyListApproverList();
            return TeaModel.build(map, self);
        }

        public CarApplyQueryResponseBodyApplyListApproverList setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CarApplyQueryResponseBodyApplyListApproverList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CarApplyQueryResponseBodyApplyListItineraryList extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("invoice_id")
        public Long invoiceId;

        @NameInMap("invoice_name")
        public String invoiceName;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("traffic_type")
        public Integer trafficType;

        public static CarApplyQueryResponseBodyApplyListItineraryList build(java.util.Map<String, ?> map) throws Exception {
            CarApplyQueryResponseBodyApplyListItineraryList self = new CarApplyQueryResponseBodyApplyListItineraryList();
            return TeaModel.build(map, self);
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setInvoiceName(String invoiceName) {
            this.invoiceName = invoiceName;
            return this;
        }
        public String getInvoiceName() {
            return this.invoiceName;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public CarApplyQueryResponseBodyApplyListItineraryList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

    }

    public static class CarApplyQueryResponseBodyApplyList extends TeaModel {
        @NameInMap("approver_list")
        public java.util.List<CarApplyQueryResponseBodyApplyListApproverList> approverList;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("itinerary_list")
        public java.util.List<CarApplyQueryResponseBodyApplyListItineraryList> itineraryList;

        @NameInMap("status")
        public Integer status;

        @NameInMap("status_desc")
        public String statusDesc;

        @NameInMap("thirdpart_id")
        public String thirdpartId;

        @NameInMap("trip_cause")
        public String tripCause;

        @NameInMap("trip_title")
        public String tripTitle;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static CarApplyQueryResponseBodyApplyList build(java.util.Map<String, ?> map) throws Exception {
            CarApplyQueryResponseBodyApplyList self = new CarApplyQueryResponseBodyApplyList();
            return TeaModel.build(map, self);
        }

        public CarApplyQueryResponseBodyApplyList setApproverList(java.util.List<CarApplyQueryResponseBodyApplyListApproverList> approverList) {
            this.approverList = approverList;
            return this;
        }
        public java.util.List<CarApplyQueryResponseBodyApplyListApproverList> getApproverList() {
            return this.approverList;
        }

        public CarApplyQueryResponseBodyApplyList setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public CarApplyQueryResponseBodyApplyList setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public CarApplyQueryResponseBodyApplyList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CarApplyQueryResponseBodyApplyList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CarApplyQueryResponseBodyApplyList setItineraryList(java.util.List<CarApplyQueryResponseBodyApplyListItineraryList> itineraryList) {
            this.itineraryList = itineraryList;
            return this;
        }
        public java.util.List<CarApplyQueryResponseBodyApplyListItineraryList> getItineraryList() {
            return this.itineraryList;
        }

        public CarApplyQueryResponseBodyApplyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CarApplyQueryResponseBodyApplyList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public CarApplyQueryResponseBodyApplyList setThirdpartId(String thirdpartId) {
            this.thirdpartId = thirdpartId;
            return this;
        }
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        public CarApplyQueryResponseBodyApplyList setTripCause(String tripCause) {
            this.tripCause = tripCause;
            return this;
        }
        public String getTripCause() {
            return this.tripCause;
        }

        public CarApplyQueryResponseBodyApplyList setTripTitle(String tripTitle) {
            this.tripTitle = tripTitle;
            return this;
        }
        public String getTripTitle() {
            return this.tripTitle;
        }

        public CarApplyQueryResponseBodyApplyList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CarApplyQueryResponseBodyApplyList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CommonApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("biz_category")
        public Integer bizCategory;

        @NameInMap("cause")
        public String cause;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("extend_value")
        public String extendValue;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("status")
        public Integer status;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        @NameInMap("thirdpart_id")
        public String thirdpartId;

        @NameInMap("trip_cause")
        public String tripCause;

        @NameInMap("user_id")
        public String userId;

        public static CommonApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CommonApplyQueryResponseBodyModule self = new CommonApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CommonApplyQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public CommonApplyQueryResponseBodyModule setBizCategory(Integer bizCategory) {
            this.bizCategory = bizCategory;
            return this;
        }
        public Integer getBizCategory() {
            return this.bizCategory;
        }

        public CommonApplyQueryResponseBodyModule setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public CommonApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CommonApplyQueryResponseBodyModule setExtendValue(String extendValue) {
            this.extendValue = extendValue;
            return this;
        }
        public String getExtendValue() {
            return this.extendValue;
        }

        public CommonApplyQueryResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CommonApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CommonApplyQueryResponseBodyModule setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public CommonApplyQueryResponseBodyModule setThirdpartId(String thirdpartId) {
            this.thirdpartId = thirdpartId;
            return this;
        }
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        public CommonApplyQueryResponseBodyModule setTripCause(String tripCause) {
            this.tripCause = tripCause;
            return this;
        }
        public String getTripCause() {
            return this.tripCause;
        }

        public CommonApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public Integer cabinClass;

        @NameInMap("cabin_class_str")
        public String cabinClassStr;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("discount")
        public String discount;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("price")
        public Long price;

        @NameInMap("type")
        public Integer type;

        public static FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo build(java.util.Map<String, ?> map) throws Exception {
            FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo self = new FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo();
            return TeaModel.build(map, self);
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCabinClass(Integer cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public Integer getCabinClass() {
            return this.cabinClass;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCabinClassStr(String cabinClassStr) {
            this.cabinClassStr = cabinClassStr;
            return this;
        }
        public String getCabinClassStr() {
            return this.cabinClassStr;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightExceedApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("apply_intention_info_do")
        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo applyIntentionInfoDo;

        @NameInMap("btrip_cause")
        public String btripCause;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("exceed_reason")
        public String exceedReason;

        @NameInMap("exceed_type")
        public Integer exceedType;

        @NameInMap("origin_standard")
        public String originStandard;

        @NameInMap("status")
        public Integer status;

        @NameInMap("submit_time")
        public String submitTime;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        @NameInMap("user_id")
        public String userId;

        public static FlightExceedApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightExceedApplyQueryResponseBodyModule self = new FlightExceedApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightExceedApplyQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public FlightExceedApplyQueryResponseBodyModule setApplyIntentionInfoDo(FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo applyIntentionInfoDo) {
            this.applyIntentionInfoDo = applyIntentionInfoDo;
            return this;
        }
        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo getApplyIntentionInfoDo() {
            return this.applyIntentionInfoDo;
        }

        public FlightExceedApplyQueryResponseBodyModule setBtripCause(String btripCause) {
            this.btripCause = btripCause;
            return this;
        }
        public String getBtripCause() {
            return this.btripCause;
        }

        public FlightExceedApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightExceedApplyQueryResponseBodyModule setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public FlightExceedApplyQueryResponseBodyModule setExceedType(Integer exceedType) {
            this.exceedType = exceedType;
            return this;
        }
        public Integer getExceedType() {
            return this.exceedType;
        }

        public FlightExceedApplyQueryResponseBodyModule setOriginStandard(String originStandard) {
            this.originStandard = originStandard;
            return this;
        }
        public String getOriginStandard() {
            return this.originStandard;
        }

        public FlightExceedApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightExceedApplyQueryResponseBodyModule setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public FlightExceedApplyQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public FlightExceedApplyQueryResponseBodyModule setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public FlightExceedApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo extends TeaModel {
        @NameInMap("check_in")
        public String checkIn;

        @NameInMap("check_out")
        public String checkOut;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("price")
        public Long price;

        @NameInMap("together")
        public Boolean together;

        @NameInMap("type")
        public Integer type;

        public static HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo build(java.util.Map<String, ?> map) throws Exception {
            HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo self = new HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo();
            return TeaModel.build(map, self);
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCheckOut(String checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public String getCheckOut() {
            return this.checkOut;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setTogether(Boolean together) {
            this.together = together;
            return this;
        }
        public Boolean getTogether() {
            return this.together;
        }

        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class HotelExceedApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("apply_intention_info_do")
        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo applyIntentionInfoDo;

        @NameInMap("btrip_cause")
        public String btripCause;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("exceed_reason")
        public String exceedReason;

        @NameInMap("exceed_type")
        public Integer exceedType;

        @NameInMap("origin_standard")
        public String originStandard;

        @NameInMap("status")
        public Integer status;

        @NameInMap("submit_time")
        public String submitTime;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        @NameInMap("user_id")
        public String userId;

        public static HotelExceedApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelExceedApplyQueryResponseBodyModule self = new HotelExceedApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelExceedApplyQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public HotelExceedApplyQueryResponseBodyModule setApplyIntentionInfoDo(HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo applyIntentionInfoDo) {
            this.applyIntentionInfoDo = applyIntentionInfoDo;
            return this;
        }
        public HotelExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo getApplyIntentionInfoDo() {
            return this.applyIntentionInfoDo;
        }

        public HotelExceedApplyQueryResponseBodyModule setBtripCause(String btripCause) {
            this.btripCause = btripCause;
            return this;
        }
        public String getBtripCause() {
            return this.btripCause;
        }

        public HotelExceedApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public HotelExceedApplyQueryResponseBodyModule setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public HotelExceedApplyQueryResponseBodyModule setExceedType(Integer exceedType) {
            this.exceedType = exceedType;
            return this;
        }
        public Integer getExceedType() {
            return this.exceedType;
        }

        public HotelExceedApplyQueryResponseBodyModule setOriginStandard(String originStandard) {
            this.originStandard = originStandard;
            return this;
        }
        public String getOriginStandard() {
            return this.originStandard;
        }

        public HotelExceedApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public HotelExceedApplyQueryResponseBodyModule setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public HotelExceedApplyQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public HotelExceedApplyQueryResponseBodyModule setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public HotelExceedApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO extends TeaModel {
        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_station")
        public String arrStation;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_station")
        public String depStation;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("price")
        public Long price;

        @NameInMap("seat_name")
        public String seatName;

        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_type_desc")
        public String trainTypeDesc;

        @NameInMap("type")
        public Integer type;

        public static TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO build(java.util.Map<String, ?> map) throws Exception {
            TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO self = new TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO();
            return TeaModel.build(map, self);
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setDepStation(String depStation) {
            this.depStation = depStation;
            return this;
        }
        public String getDepStation() {
            return this.depStation;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setSeatName(String seatName) {
            this.seatName = seatName;
            return this;
        }
        public String getSeatName() {
            return this.seatName;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setTrainTypeDesc(String trainTypeDesc) {
            this.trainTypeDesc = trainTypeDesc;
            return this;
        }
        public String getTrainTypeDesc() {
            return this.trainTypeDesc;
        }

        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class TrainExceedApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("apply_intention_info_d_o")
        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO applyIntentionInfoDO;

        @NameInMap("btrip_cause")
        public String btripCause;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("exceed_reason")
        public String exceedReason;

        @NameInMap("exceed_type")
        public Integer exceedType;

        @NameInMap("origin_standard")
        public String originStandard;

        @NameInMap("status")
        public Integer status;

        @NameInMap("submit_time")
        public String submitTime;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        @NameInMap("user_id")
        public String userId;

        public static TrainExceedApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainExceedApplyQueryResponseBodyModule self = new TrainExceedApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainExceedApplyQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public TrainExceedApplyQueryResponseBodyModule setApplyIntentionInfoDO(TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO applyIntentionInfoDO) {
            this.applyIntentionInfoDO = applyIntentionInfoDO;
            return this;
        }
        public TrainExceedApplyQueryResponseBodyModuleApplyIntentionInfoDO getApplyIntentionInfoDO() {
            return this.applyIntentionInfoDO;
        }

        public TrainExceedApplyQueryResponseBodyModule setBtripCause(String btripCause) {
            this.btripCause = btripCause;
            return this;
        }
        public String getBtripCause() {
            return this.btripCause;
        }

        public TrainExceedApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public TrainExceedApplyQueryResponseBodyModule setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public TrainExceedApplyQueryResponseBodyModule setExceedType(Integer exceedType) {
            this.exceedType = exceedType;
            return this;
        }
        public Integer getExceedType() {
            return this.exceedType;
        }

        public TrainExceedApplyQueryResponseBodyModule setOriginStandard(String originStandard) {
            this.originStandard = originStandard;
            return this;
        }
        public String getOriginStandard() {
            return this.originStandard;
        }

        public TrainExceedApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public TrainExceedApplyQueryResponseBodyModule setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public TrainExceedApplyQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public TrainExceedApplyQueryResponseBodyModule setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public TrainExceedApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

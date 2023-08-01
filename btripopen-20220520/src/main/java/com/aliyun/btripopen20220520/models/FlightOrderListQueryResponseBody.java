// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderListQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<FlightOrderListQueryResponseBodyModule> module;

    @NameInMap("page_info")
    public FlightOrderListQueryResponseBodyPageInfo pageInfo;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightOrderListQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderListQueryResponseBody self = new FlightOrderListQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightOrderListQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightOrderListQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightOrderListQueryResponseBody setModule(java.util.List<FlightOrderListQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<FlightOrderListQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public FlightOrderListQueryResponseBody setPageInfo(FlightOrderListQueryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public FlightOrderListQueryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public FlightOrderListQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightOrderListQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightOrderListQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightOrderListQueryResponseBodyModuleCostCenter extends TeaModel {
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("number")
        public String number;

        public static FlightOrderListQueryResponseBodyModuleCostCenter build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryResponseBodyModuleCostCenter self = new FlightOrderListQueryResponseBodyModuleCostCenter();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryResponseBodyModuleCostCenter setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightOrderListQueryResponseBodyModuleCostCenter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FlightOrderListQueryResponseBodyModuleCostCenter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FlightOrderListQueryResponseBodyModuleCostCenter setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class FlightOrderListQueryResponseBodyModuleInsureInfoList extends TeaModel {
        @NameInMap("insure_no")
        public String insureNo;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public Integer status;

        public static FlightOrderListQueryResponseBodyModuleInsureInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryResponseBodyModuleInsureInfoList self = new FlightOrderListQueryResponseBodyModuleInsureInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryResponseBodyModuleInsureInfoList setInsureNo(String insureNo) {
            this.insureNo = insureNo;
            return this;
        }
        public String getInsureNo() {
            return this.insureNo;
        }

        public FlightOrderListQueryResponseBodyModuleInsureInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FlightOrderListQueryResponseBodyModuleInsureInfoList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class FlightOrderListQueryResponseBodyModuleInvoice extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("title")
        public String title;

        public static FlightOrderListQueryResponseBodyModuleInvoice build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryResponseBodyModuleInvoice self = new FlightOrderListQueryResponseBodyModuleInvoice();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryResponseBodyModuleInvoice setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FlightOrderListQueryResponseBodyModuleInvoice setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOrderListQueryResponseBodyModulePriceInfoList extends TeaModel {
        @NameInMap("category_code")
        public Integer categoryCode;

        @NameInMap("category_type")
        public Integer categoryType;

        @NameInMap("change_flight_no")
        public String changeFlightNo;

        @NameInMap("discount")
        public String discount;

        @NameInMap("end_time")
        public String endTime;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("original_ticket_no")
        public String originalTicketNo;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("price")
        public Double price;

        @NameInMap("start_time")
        public String startTime;

        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("trade_id")
        public String tradeId;

        @NameInMap("type")
        public Integer type;

        public static FlightOrderListQueryResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryResponseBodyModulePriceInfoList self = new FlightOrderListQueryResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setChangeFlightNo(String changeFlightNo) {
            this.changeFlightNo = changeFlightNo;
            return this;
        }
        public String getChangeFlightNo() {
            return this.changeFlightNo;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setOriginalTicketNo(String originalTicketNo) {
            this.originalTicketNo = originalTicketNo;
            return this;
        }
        public String getOriginalTicketNo() {
            return this.originalTicketNo;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public FlightOrderListQueryResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOrderListQueryResponseBodyModuleUserAffiliateList extends TeaModel {
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static FlightOrderListQueryResponseBodyModuleUserAffiliateList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryResponseBodyModuleUserAffiliateList self = new FlightOrderListQueryResponseBodyModuleUserAffiliateList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryResponseBodyModuleUserAffiliateList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FlightOrderListQueryResponseBodyModuleUserAffiliateList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class FlightOrderListQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("arr_airport")
        public String arrAirport;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_ad_code")
        public String arrCityAdCode;

        @NameInMap("btrip_title")
        public String btripTitle;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("cost_center")
        public FlightOrderListQueryResponseBodyModuleCostCenter costCenter;

        @NameInMap("dep_airport")
        public String depAirport;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_ad_code")
        public String depCityAdCode;

        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("discount")
        public String discount;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("insure_info_list")
        public java.util.List<FlightOrderListQueryResponseBodyModuleInsureInfoList> insureInfoList;

        @NameInMap("invoice")
        public FlightOrderListQueryResponseBodyModuleInvoice invoice;

        @NameInMap("passenger_count")
        public Integer passengerCount;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("price_info_list")
        public java.util.List<FlightOrderListQueryResponseBodyModulePriceInfoList> priceInfoList;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("ret_date")
        public String retDate;

        @NameInMap("status")
        public Integer status;

        @NameInMap("third_part_project_id")
        public String thirdPartProjectId;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("trip_type")
        public Integer tripType;

        @NameInMap("user_affiliate_list")
        public java.util.List<FlightOrderListQueryResponseBodyModuleUserAffiliateList> userAffiliateList;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static FlightOrderListQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryResponseBodyModule self = new FlightOrderListQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public FlightOrderListQueryResponseBodyModule setArrAirport(String arrAirport) {
            this.arrAirport = arrAirport;
            return this;
        }
        public String getArrAirport() {
            return this.arrAirport;
        }

        public FlightOrderListQueryResponseBodyModule setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightOrderListQueryResponseBodyModule setArrCityAdCode(String arrCityAdCode) {
            this.arrCityAdCode = arrCityAdCode;
            return this;
        }
        public String getArrCityAdCode() {
            return this.arrCityAdCode;
        }

        public FlightOrderListQueryResponseBodyModule setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public FlightOrderListQueryResponseBodyModule setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightOrderListQueryResponseBodyModule setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightOrderListQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightOrderListQueryResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public FlightOrderListQueryResponseBodyModule setCostCenter(FlightOrderListQueryResponseBodyModuleCostCenter costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public FlightOrderListQueryResponseBodyModuleCostCenter getCostCenter() {
            return this.costCenter;
        }

        public FlightOrderListQueryResponseBodyModule setDepAirport(String depAirport) {
            this.depAirport = depAirport;
            return this;
        }
        public String getDepAirport() {
            return this.depAirport;
        }

        public FlightOrderListQueryResponseBodyModule setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public FlightOrderListQueryResponseBodyModule setDepCityAdCode(String depCityAdCode) {
            this.depCityAdCode = depCityAdCode;
            return this;
        }
        public String getDepCityAdCode() {
            return this.depCityAdCode;
        }

        public FlightOrderListQueryResponseBodyModule setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public FlightOrderListQueryResponseBodyModule setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public FlightOrderListQueryResponseBodyModule setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public FlightOrderListQueryResponseBodyModule setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightOrderListQueryResponseBodyModule setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOrderListQueryResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderListQueryResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public FlightOrderListQueryResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FlightOrderListQueryResponseBodyModule setInsureInfoList(java.util.List<FlightOrderListQueryResponseBodyModuleInsureInfoList> insureInfoList) {
            this.insureInfoList = insureInfoList;
            return this;
        }
        public java.util.List<FlightOrderListQueryResponseBodyModuleInsureInfoList> getInsureInfoList() {
            return this.insureInfoList;
        }

        public FlightOrderListQueryResponseBodyModule setInvoice(FlightOrderListQueryResponseBodyModuleInvoice invoice) {
            this.invoice = invoice;
            return this;
        }
        public FlightOrderListQueryResponseBodyModuleInvoice getInvoice() {
            return this.invoice;
        }

        public FlightOrderListQueryResponseBodyModule setPassengerCount(Integer passengerCount) {
            this.passengerCount = passengerCount;
            return this;
        }
        public Integer getPassengerCount() {
            return this.passengerCount;
        }

        public FlightOrderListQueryResponseBodyModule setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightOrderListQueryResponseBodyModule setPriceInfoList(java.util.List<FlightOrderListQueryResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<FlightOrderListQueryResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public FlightOrderListQueryResponseBodyModule setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public FlightOrderListQueryResponseBodyModule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public FlightOrderListQueryResponseBodyModule setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public FlightOrderListQueryResponseBodyModule setRetDate(String retDate) {
            this.retDate = retDate;
            return this;
        }
        public String getRetDate() {
            return this.retDate;
        }

        public FlightOrderListQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightOrderListQueryResponseBodyModule setThirdPartProjectId(String thirdPartProjectId) {
            this.thirdPartProjectId = thirdPartProjectId;
            return this;
        }
        public String getThirdPartProjectId() {
            return this.thirdPartProjectId;
        }

        public FlightOrderListQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public FlightOrderListQueryResponseBodyModule setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public FlightOrderListQueryResponseBodyModule setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

        public FlightOrderListQueryResponseBodyModule setUserAffiliateList(java.util.List<FlightOrderListQueryResponseBodyModuleUserAffiliateList> userAffiliateList) {
            this.userAffiliateList = userAffiliateList;
            return this;
        }
        public java.util.List<FlightOrderListQueryResponseBodyModuleUserAffiliateList> getUserAffiliateList() {
            return this.userAffiliateList;
        }

        public FlightOrderListQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FlightOrderListQueryResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class FlightOrderListQueryResponseBodyPageInfo extends TeaModel {
        @NameInMap("page")
        public Integer page;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_number")
        public Integer totalNumber;

        public static FlightOrderListQueryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryResponseBodyPageInfo self = new FlightOrderListQueryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public FlightOrderListQueryResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public FlightOrderListQueryResponseBodyPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}

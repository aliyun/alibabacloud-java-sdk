// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderListQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<FlightOrderListQueryResponseBodyModule> module;

    @NameInMap("page_info")
    public FlightOrderListQueryResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
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

        /**
         * <strong>example:</strong>
         * <p>44632</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>NM98767</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>KJ-879657</p>
         */
        @NameInMap("insure_no")
        public String insureNo;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>7304</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category_code")
        public Integer categoryCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category_type")
        public Integer categoryType;

        /**
         * <strong>example:</strong>
         * <p>MU5354</p>
         */
        @NameInMap("change_flight_no")
        public String changeFlightNo;

        /**
         * <strong>example:</strong>
         * <p>12%</p>
         */
        @NameInMap("discount")
        public String discount;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("end_time")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>00-7687</p>
         */
        @NameInMap("original_ticket_no")
        public String originalTicketNo;

        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("price")
        public Double price;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("start_time")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>A-135767</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>f98236773</p>
         */
        @NameInMap("trade_id")
        public String tradeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>11774</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <strong>example:</strong>
         * <p>30.12%</p>
         */
        @NameInMap("discount")
        public String discount;

        /**
         * <strong>example:</strong>
         * <p>MU7854</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("gmt_modified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>200042</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("insure_info_list")
        public java.util.List<FlightOrderListQueryResponseBodyModuleInsureInfoList> insureInfoList;

        @NameInMap("invoice")
        public FlightOrderListQueryResponseBodyModuleInvoice invoice;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("passenger_count")
        public Integer passengerCount;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("price_info_list")
        public java.util.List<FlightOrderListQueryResponseBodyModulePriceInfoList> priceInfoList;

        /**
         * <strong>example:</strong>
         * <p>CS-PROJECT</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>CS-PROJECT</p>
         */
        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("ret_date")
        public String retDate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>CS-PROJECT</p>
         */
        @NameInMap("third_part_project_id")
        public String thirdPartProjectId;

        /**
         * <strong>example:</strong>
         * <p>CS-UMN98989</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>cs9897766</p>
         */
        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderListQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<TrainOrderListQueryResponseBodyModule> module;

    @NameInMap("page_info")
    public TrainOrderListQueryResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>F93C3EBD-17BE-5FE6-BF06-96A6F1AC8DC5</p>
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

    public static TrainOrderListQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderListQueryResponseBody self = new TrainOrderListQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainOrderListQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainOrderListQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainOrderListQueryResponseBody setModule(java.util.List<TrainOrderListQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<TrainOrderListQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public TrainOrderListQueryResponseBody setPageInfo(TrainOrderListQueryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public TrainOrderListQueryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public TrainOrderListQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainOrderListQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainOrderListQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainOrderListQueryResponseBodyModuleCostCenter extends TeaModel {
        @NameInMap("corp_id")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p>11643</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>CS112234</p>
         */
        @NameInMap("number")
        public String number;

        public static TrainOrderListQueryResponseBodyModuleCostCenter build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderListQueryResponseBodyModuleCostCenter self = new TrainOrderListQueryResponseBodyModuleCostCenter();
            return TeaModel.build(map, self);
        }

        public TrainOrderListQueryResponseBodyModuleCostCenter setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public TrainOrderListQueryResponseBodyModuleCostCenter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TrainOrderListQueryResponseBodyModuleCostCenter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TrainOrderListQueryResponseBodyModuleCostCenter setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class TrainOrderListQueryResponseBodyModuleInvoice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11324</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("title")
        public String title;

        public static TrainOrderListQueryResponseBodyModuleInvoice build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderListQueryResponseBodyModuleInvoice self = new TrainOrderListQueryResponseBodyModuleInvoice();
            return TeaModel.build(map, self);
        }

        public TrainOrderListQueryResponseBodyModuleInvoice setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TrainOrderListQueryResponseBodyModuleInvoice setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class TrainOrderListQueryResponseBodyModulePriceInfoList extends TeaModel {
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

        @NameInMap("end_city")
        public String endCity;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("end_time")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>CS-663</p>
         */
        @NameInMap("original_train_no")
        public String originalTrainNo;

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

        @NameInMap("seat_type")
        public String seatType;

        @NameInMap("start_city")
        public String startCity;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("start_time")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>cs1165734212</p>
         */
        @NameInMap("trade_id")
        public String tradeId;

        /**
         * <strong>example:</strong>
         * <p>Z1521</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static TrainOrderListQueryResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderListQueryResponseBodyModulePriceInfoList self = new TrainOrderListQueryResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setEndCity(String endCity) {
            this.endCity = endCity;
            return this;
        }
        public String getEndCity() {
            return this.endCity;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setOriginalTrainNo(String originalTrainNo) {
            this.originalTrainNo = originalTrainNo;
            return this;
        }
        public String getOriginalTrainNo() {
            return this.originalTrainNo;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setStartCity(String startCity) {
            this.startCity = startCity;
            return this;
        }
        public String getStartCity() {
            return this.startCity;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainOrderListQueryResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class TrainOrderListQueryResponseBodyModuleUserAffiliateList extends TeaModel {
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static TrainOrderListQueryResponseBodyModuleUserAffiliateList build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderListQueryResponseBodyModuleUserAffiliateList self = new TrainOrderListQueryResponseBodyModuleUserAffiliateList();
            return TeaModel.build(map, self);
        }

        public TrainOrderListQueryResponseBodyModuleUserAffiliateList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public TrainOrderListQueryResponseBodyModuleUserAffiliateList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class TrainOrderListQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11367</p>
         */
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_ad_code")
        public String arrCityAdCode;

        @NameInMap("arr_station")
        public String arrStation;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("btrip_title")
        public String btripTitle;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("cost_center")
        public TrainOrderListQueryResponseBodyModuleCostCenter costCenter;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_ad_code")
        public String depCityAdCode;

        @NameInMap("dep_station")
        public String depStation;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("gmt_modified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1478652</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("invoice")
        public TrainOrderListQueryResponseBodyModuleInvoice invoice;

        @NameInMap("price_info_list")
        public java.util.List<TrainOrderListQueryResponseBodyModulePriceInfoList> priceInfoList;

        /**
         * <strong>example:</strong>
         * <p>PCXIDF</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>12425</p>
         */
        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("rider_name")
        public String riderName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("run_time")
        public String runTime;

        @NameInMap("seat_type")
        public String seatType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        @NameInMap("thirdPart_business_id")
        public String thirdPartBusinessId;

        /**
         * <strong>example:</strong>
         * <p>CS-SKPFDS</p>
         */
        @NameInMap("third_part_project_id")
        public String thirdPartProjectId;

        /**
         * <strong>example:</strong>
         * <p>CSIODJUSN</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>CS-IT89D</p>
         */
        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ticket_count")
        public Integer ticketCount;

        /**
         * <strong>example:</strong>
         * <p>CS-663</p>
         */
        @NameInMap("ticket_no12306")
        public String ticketNo12306;

        /**
         * <strong>example:</strong>
         * <p>CS-663</p>
         */
        @NameInMap("train_number")
        public String trainNumber;

        @NameInMap("train_type")
        public String trainType;

        @NameInMap("user_affiliate_list")
        public java.util.List<TrainOrderListQueryResponseBodyModuleUserAffiliateList> userAffiliateList;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static TrainOrderListQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderListQueryResponseBodyModule self = new TrainOrderListQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainOrderListQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public TrainOrderListQueryResponseBodyModule setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public TrainOrderListQueryResponseBodyModule setArrCityAdCode(String arrCityAdCode) {
            this.arrCityAdCode = arrCityAdCode;
            return this;
        }
        public String getArrCityAdCode() {
            return this.arrCityAdCode;
        }

        public TrainOrderListQueryResponseBodyModule setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public TrainOrderListQueryResponseBodyModule setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainOrderListQueryResponseBodyModule setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public TrainOrderListQueryResponseBodyModule setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public TrainOrderListQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public TrainOrderListQueryResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public TrainOrderListQueryResponseBodyModule setCostCenter(TrainOrderListQueryResponseBodyModuleCostCenter costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public TrainOrderListQueryResponseBodyModuleCostCenter getCostCenter() {
            return this.costCenter;
        }

        public TrainOrderListQueryResponseBodyModule setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public TrainOrderListQueryResponseBodyModule setDepCityAdCode(String depCityAdCode) {
            this.depCityAdCode = depCityAdCode;
            return this;
        }
        public String getDepCityAdCode() {
            return this.depCityAdCode;
        }

        public TrainOrderListQueryResponseBodyModule setDepStation(String depStation) {
            this.depStation = depStation;
            return this;
        }
        public String getDepStation() {
            return this.depStation;
        }

        public TrainOrderListQueryResponseBodyModule setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainOrderListQueryResponseBodyModule setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public TrainOrderListQueryResponseBodyModule setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public TrainOrderListQueryResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public TrainOrderListQueryResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public TrainOrderListQueryResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TrainOrderListQueryResponseBodyModule setInvoice(TrainOrderListQueryResponseBodyModuleInvoice invoice) {
            this.invoice = invoice;
            return this;
        }
        public TrainOrderListQueryResponseBodyModuleInvoice getInvoice() {
            return this.invoice;
        }

        public TrainOrderListQueryResponseBodyModule setPriceInfoList(java.util.List<TrainOrderListQueryResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<TrainOrderListQueryResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public TrainOrderListQueryResponseBodyModule setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public TrainOrderListQueryResponseBodyModule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public TrainOrderListQueryResponseBodyModule setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public TrainOrderListQueryResponseBodyModule setRiderName(String riderName) {
            this.riderName = riderName;
            return this;
        }
        public String getRiderName() {
            return this.riderName;
        }

        public TrainOrderListQueryResponseBodyModule setRunTime(String runTime) {
            this.runTime = runTime;
            return this;
        }
        public String getRunTime() {
            return this.runTime;
        }

        public TrainOrderListQueryResponseBodyModule setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainOrderListQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public TrainOrderListQueryResponseBodyModule setThirdPartBusinessId(String thirdPartBusinessId) {
            this.thirdPartBusinessId = thirdPartBusinessId;
            return this;
        }
        public String getThirdPartBusinessId() {
            return this.thirdPartBusinessId;
        }

        public TrainOrderListQueryResponseBodyModule setThirdPartProjectId(String thirdPartProjectId) {
            this.thirdPartProjectId = thirdPartProjectId;
            return this;
        }
        public String getThirdPartProjectId() {
            return this.thirdPartProjectId;
        }

        public TrainOrderListQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public TrainOrderListQueryResponseBodyModule setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public TrainOrderListQueryResponseBodyModule setTicketCount(Integer ticketCount) {
            this.ticketCount = ticketCount;
            return this;
        }
        public Integer getTicketCount() {
            return this.ticketCount;
        }

        public TrainOrderListQueryResponseBodyModule setTicketNo12306(String ticketNo12306) {
            this.ticketNo12306 = ticketNo12306;
            return this;
        }
        public String getTicketNo12306() {
            return this.ticketNo12306;
        }

        public TrainOrderListQueryResponseBodyModule setTrainNumber(String trainNumber) {
            this.trainNumber = trainNumber;
            return this;
        }
        public String getTrainNumber() {
            return this.trainNumber;
        }

        public TrainOrderListQueryResponseBodyModule setTrainType(String trainType) {
            this.trainType = trainType;
            return this;
        }
        public String getTrainType() {
            return this.trainType;
        }

        public TrainOrderListQueryResponseBodyModule setUserAffiliateList(java.util.List<TrainOrderListQueryResponseBodyModuleUserAffiliateList> userAffiliateList) {
            this.userAffiliateList = userAffiliateList;
            return this;
        }
        public java.util.List<TrainOrderListQueryResponseBodyModuleUserAffiliateList> getUserAffiliateList() {
            return this.userAffiliateList;
        }

        public TrainOrderListQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public TrainOrderListQueryResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class TrainOrderListQueryResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_number")
        public Integer totalNumber;

        public static TrainOrderListQueryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderListQueryResponseBodyPageInfo self = new TrainOrderListQueryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderListQueryResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public TrainOrderListQueryResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public TrainOrderListQueryResponseBodyPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}

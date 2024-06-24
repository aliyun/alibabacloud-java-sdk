// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarOrderListQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<CarOrderListQueryResponseBodyModule> module;

    @NameInMap("page_info")
    public CarOrderListQueryResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CarOrderListQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CarOrderListQueryResponseBody self = new CarOrderListQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CarOrderListQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CarOrderListQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CarOrderListQueryResponseBody setModule(java.util.List<CarOrderListQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<CarOrderListQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public CarOrderListQueryResponseBody setPageInfo(CarOrderListQueryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public CarOrderListQueryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public CarOrderListQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CarOrderListQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CarOrderListQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CarOrderListQueryResponseBodyModulePriceInfoList extends TeaModel {
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
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

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
        @NameInMap("person_price")
        public Double personPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("price")
        public Double price;

        /**
         * <strong>example:</strong>
         * <p>8908076767</p>
         */
        @NameInMap("trade_id")
        public String tradeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static CarOrderListQueryResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            CarOrderListQueryResponseBodyModulePriceInfoList self = new CarOrderListQueryResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setPersonPrice(Double personPrice) {
            this.personPrice = personPrice;
            return this;
        }
        public Double getPersonPrice() {
            return this.personPrice;
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public CarOrderListQueryResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class CarOrderListQueryResponseBodyModuleUserAffiliateList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11342</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static CarOrderListQueryResponseBodyModuleUserAffiliateList build(java.util.Map<String, ?> map) throws Exception {
            CarOrderListQueryResponseBodyModuleUserAffiliateList self = new CarOrderListQueryResponseBodyModuleUserAffiliateList();
            return TeaModel.build(map, self);
        }

        public CarOrderListQueryResponseBodyModuleUserAffiliateList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CarOrderListQueryResponseBodyModuleUserAffiliateList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CarOrderListQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>117429516</p>
         */
        @NameInMap("apply_id")
        public Long applyId;

        /**
         * <strong>example:</strong>
         * <p>201802031353000525653</p>
         */
        @NameInMap("apply_show_id")
        public String applyShowId;

        @NameInMap("btrip_title")
        public String btripTitle;

        /**
         * <strong>example:</strong>
         * <p>TRAVEL</p>
         */
        @NameInMap("business_category")
        public String businessCategory;

        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("cancel_time")
        public String cancelTime;

        @NameInMap("car_info")
        public String carInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("car_level")
        public Integer carLevel;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        /**
         * <strong>example:</strong>
         * <p>11376</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>CT-134JHK</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("dept_id")
        public Long deptId;

        @NameInMap("dept_name")
        public String deptName;

        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("driver_confirm_time")
        public String driverConfirmTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("estimate_price")
        public Double estimatePrice;

        @NameInMap("from_address")
        public String fromAddress;

        @NameInMap("from_city_ad_code")
        public String fromCityAdCode;

        @NameInMap("from_city_name")
        public String fromCityName;

        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("gmt_modified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>3615085</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>11876</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_special")
        public Boolean isSpecial;

        @NameInMap("memo")
        public String memo;

        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        @NameInMap("price_info_list")
        public java.util.List<CarOrderListQueryResponseBodyModulePriceInfoList> priceInfoList;

        /**
         * <strong>example:</strong>
         * <p>P- JI87KK</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>11546</p>
         */
        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("provider")
        public Integer provider;

        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("publish_time")
        public String publishTime;

        @NameInMap("real_from_address")
        public String realFromAddress;

        @NameInMap("real_from_city_ad_code")
        public String realFromCityAdCode;

        @NameInMap("real_from_city_name")
        public String realFromCityName;

        @NameInMap("real_to_address")
        public String realToAddress;

        @NameInMap("real_to_city_ad_code")
        public String realToCityAdCode;

        @NameInMap("real_to_city_name")
        public String realToCityName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("service_type")
        public Integer serviceType;

        @NameInMap("special_types")
        public java.util.List<String> specialTypes;

        /**
         * <strong>example:</strong>
         * <p>2022-07-04T16:13Z</p>
         */
        @NameInMap("taken_time")
        public String takenTime;

        /**
         * <strong>example:</strong>
         * <p>CS-OIPK34H</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>CS-112JKDF</p>
         */
        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("to_address")
        public String toAddress;

        @NameInMap("to_city_ad_code")
        public String toCityAdCode;

        @NameInMap("to_city_name")
        public String toCityName;

        /**
         * <strong>example:</strong>
         * <p>1.2</p>
         */
        @NameInMap("travel_distance")
        public Double travelDistance;

        @NameInMap("user_affiliate_list")
        public java.util.List<CarOrderListQueryResponseBodyModuleUserAffiliateList> userAffiliateList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("user_confirm")
        public Integer userConfirm;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static CarOrderListQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CarOrderListQueryResponseBodyModule self = new CarOrderListQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CarOrderListQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public CarOrderListQueryResponseBodyModule setApplyShowId(String applyShowId) {
            this.applyShowId = applyShowId;
            return this;
        }
        public String getApplyShowId() {
            return this.applyShowId;
        }

        public CarOrderListQueryResponseBodyModule setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public CarOrderListQueryResponseBodyModule setBusinessCategory(String businessCategory) {
            this.businessCategory = businessCategory;
            return this;
        }
        public String getBusinessCategory() {
            return this.businessCategory;
        }

        public CarOrderListQueryResponseBodyModule setCancelTime(String cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public String getCancelTime() {
            return this.cancelTime;
        }

        public CarOrderListQueryResponseBodyModule setCarInfo(String carInfo) {
            this.carInfo = carInfo;
            return this;
        }
        public String getCarInfo() {
            return this.carInfo;
        }

        public CarOrderListQueryResponseBodyModule setCarLevel(Integer carLevel) {
            this.carLevel = carLevel;
            return this;
        }
        public Integer getCarLevel() {
            return this.carLevel;
        }

        public CarOrderListQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CarOrderListQueryResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public CarOrderListQueryResponseBodyModule setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public CarOrderListQueryResponseBodyModule setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public CarOrderListQueryResponseBodyModule setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public CarOrderListQueryResponseBodyModule setDeptId(Long deptId) {
            this.deptId = deptId;
            return this;
        }
        public Long getDeptId() {
            return this.deptId;
        }

        public CarOrderListQueryResponseBodyModule setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public CarOrderListQueryResponseBodyModule setDriverConfirmTime(String driverConfirmTime) {
            this.driverConfirmTime = driverConfirmTime;
            return this;
        }
        public String getDriverConfirmTime() {
            return this.driverConfirmTime;
        }

        public CarOrderListQueryResponseBodyModule setEstimatePrice(Double estimatePrice) {
            this.estimatePrice = estimatePrice;
            return this;
        }
        public Double getEstimatePrice() {
            return this.estimatePrice;
        }

        public CarOrderListQueryResponseBodyModule setFromAddress(String fromAddress) {
            this.fromAddress = fromAddress;
            return this;
        }
        public String getFromAddress() {
            return this.fromAddress;
        }

        public CarOrderListQueryResponseBodyModule setFromCityAdCode(String fromCityAdCode) {
            this.fromCityAdCode = fromCityAdCode;
            return this;
        }
        public String getFromCityAdCode() {
            return this.fromCityAdCode;
        }

        public CarOrderListQueryResponseBodyModule setFromCityName(String fromCityName) {
            this.fromCityName = fromCityName;
            return this;
        }
        public String getFromCityName() {
            return this.fromCityName;
        }

        public CarOrderListQueryResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CarOrderListQueryResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CarOrderListQueryResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CarOrderListQueryResponseBodyModule setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public CarOrderListQueryResponseBodyModule setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public CarOrderListQueryResponseBodyModule setIsSpecial(Boolean isSpecial) {
            this.isSpecial = isSpecial;
            return this;
        }
        public Boolean getIsSpecial() {
            return this.isSpecial;
        }

        public CarOrderListQueryResponseBodyModule setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public CarOrderListQueryResponseBodyModule setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public CarOrderListQueryResponseBodyModule setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public CarOrderListQueryResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public CarOrderListQueryResponseBodyModule setPriceInfoList(java.util.List<CarOrderListQueryResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<CarOrderListQueryResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public CarOrderListQueryResponseBodyModule setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public CarOrderListQueryResponseBodyModule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CarOrderListQueryResponseBodyModule setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public CarOrderListQueryResponseBodyModule setProvider(Integer provider) {
            this.provider = provider;
            return this;
        }
        public Integer getProvider() {
            return this.provider;
        }

        public CarOrderListQueryResponseBodyModule setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public CarOrderListQueryResponseBodyModule setRealFromAddress(String realFromAddress) {
            this.realFromAddress = realFromAddress;
            return this;
        }
        public String getRealFromAddress() {
            return this.realFromAddress;
        }

        public CarOrderListQueryResponseBodyModule setRealFromCityAdCode(String realFromCityAdCode) {
            this.realFromCityAdCode = realFromCityAdCode;
            return this;
        }
        public String getRealFromCityAdCode() {
            return this.realFromCityAdCode;
        }

        public CarOrderListQueryResponseBodyModule setRealFromCityName(String realFromCityName) {
            this.realFromCityName = realFromCityName;
            return this;
        }
        public String getRealFromCityName() {
            return this.realFromCityName;
        }

        public CarOrderListQueryResponseBodyModule setRealToAddress(String realToAddress) {
            this.realToAddress = realToAddress;
            return this;
        }
        public String getRealToAddress() {
            return this.realToAddress;
        }

        public CarOrderListQueryResponseBodyModule setRealToCityAdCode(String realToCityAdCode) {
            this.realToCityAdCode = realToCityAdCode;
            return this;
        }
        public String getRealToCityAdCode() {
            return this.realToCityAdCode;
        }

        public CarOrderListQueryResponseBodyModule setRealToCityName(String realToCityName) {
            this.realToCityName = realToCityName;
            return this;
        }
        public String getRealToCityName() {
            return this.realToCityName;
        }

        public CarOrderListQueryResponseBodyModule setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

        public CarOrderListQueryResponseBodyModule setSpecialTypes(java.util.List<String> specialTypes) {
            this.specialTypes = specialTypes;
            return this;
        }
        public java.util.List<String> getSpecialTypes() {
            return this.specialTypes;
        }

        public CarOrderListQueryResponseBodyModule setTakenTime(String takenTime) {
            this.takenTime = takenTime;
            return this;
        }
        public String getTakenTime() {
            return this.takenTime;
        }

        public CarOrderListQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public CarOrderListQueryResponseBodyModule setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public CarOrderListQueryResponseBodyModule setToAddress(String toAddress) {
            this.toAddress = toAddress;
            return this;
        }
        public String getToAddress() {
            return this.toAddress;
        }

        public CarOrderListQueryResponseBodyModule setToCityAdCode(String toCityAdCode) {
            this.toCityAdCode = toCityAdCode;
            return this;
        }
        public String getToCityAdCode() {
            return this.toCityAdCode;
        }

        public CarOrderListQueryResponseBodyModule setToCityName(String toCityName) {
            this.toCityName = toCityName;
            return this;
        }
        public String getToCityName() {
            return this.toCityName;
        }

        public CarOrderListQueryResponseBodyModule setTravelDistance(Double travelDistance) {
            this.travelDistance = travelDistance;
            return this;
        }
        public Double getTravelDistance() {
            return this.travelDistance;
        }

        public CarOrderListQueryResponseBodyModule setUserAffiliateList(java.util.List<CarOrderListQueryResponseBodyModuleUserAffiliateList> userAffiliateList) {
            this.userAffiliateList = userAffiliateList;
            return this;
        }
        public java.util.List<CarOrderListQueryResponseBodyModuleUserAffiliateList> getUserAffiliateList() {
            return this.userAffiliateList;
        }

        public CarOrderListQueryResponseBodyModule setUserConfirm(Integer userConfirm) {
            this.userConfirm = userConfirm;
            return this;
        }
        public Integer getUserConfirm() {
            return this.userConfirm;
        }

        public CarOrderListQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CarOrderListQueryResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CarOrderListQueryResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("total_number")
        public Integer totalNumber;

        public static CarOrderListQueryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            CarOrderListQueryResponseBodyPageInfo self = new CarOrderListQueryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public CarOrderListQueryResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public CarOrderListQueryResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public CarOrderListQueryResponseBodyPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}

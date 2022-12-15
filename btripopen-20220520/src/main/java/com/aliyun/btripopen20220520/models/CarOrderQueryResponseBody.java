// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarOrderQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CarOrderQueryResponseBodyModule module;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    // traceId
    @NameInMap("traceId")
    public String traceId;

    public static CarOrderQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CarOrderQueryResponseBody self = new CarOrderQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CarOrderQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CarOrderQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CarOrderQueryResponseBody setModule(CarOrderQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CarOrderQueryResponseBodyModule getModule() {
        return this.module;
    }

    public CarOrderQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CarOrderQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CarOrderQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CarOrderQueryResponseBodyModuleCarInfo extends TeaModel {
        @NameInMap("business_category")
        public String businessCategory;

        @NameInMap("cancel_time")
        public Long cancelTime;

        @NameInMap("car_info")
        public String carInfo;

        @NameInMap("car_level")
        public Integer carLevel;

        @NameInMap("driver_confirm_time")
        public Long driverConfirmTime;

        @NameInMap("estimate_price")
        public Long estimatePrice;

        @NameInMap("from_address")
        public String fromAddress;

        @NameInMap("from_city_name")
        public String fromCityName;

        @NameInMap("is_special")
        public Boolean isSpecial;

        @NameInMap("memo")
        public String memo;

        @NameInMap("pay_time")
        public Long payTime;

        @NameInMap("publish_time")
        public Long publishTime;

        @NameInMap("real_from_address")
        public String realFromAddress;

        @NameInMap("real_from_city_name")
        public String realFromCityName;

        @NameInMap("real_to_address")
        public String realToAddress;

        @NameInMap("real_to_city_name")
        public String realToCityName;

        @NameInMap("service_type")
        public Integer serviceType;

        @NameInMap("special_types")
        public String specialTypes;

        @NameInMap("taken_time")
        public Long takenTime;

        @NameInMap("to_address")
        public String toAddress;

        @NameInMap("to_city_name")
        public String toCityName;

        @NameInMap("travel_distance")
        public String travelDistance;

        public static CarOrderQueryResponseBodyModuleCarInfo build(java.util.Map<String, ?> map) throws Exception {
            CarOrderQueryResponseBodyModuleCarInfo self = new CarOrderQueryResponseBodyModuleCarInfo();
            return TeaModel.build(map, self);
        }

        public CarOrderQueryResponseBodyModuleCarInfo setBusinessCategory(String businessCategory) {
            this.businessCategory = businessCategory;
            return this;
        }
        public String getBusinessCategory() {
            return this.businessCategory;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setCancelTime(Long cancelTime) {
            this.cancelTime = cancelTime;
            return this;
        }
        public Long getCancelTime() {
            return this.cancelTime;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setCarInfo(String carInfo) {
            this.carInfo = carInfo;
            return this;
        }
        public String getCarInfo() {
            return this.carInfo;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setCarLevel(Integer carLevel) {
            this.carLevel = carLevel;
            return this;
        }
        public Integer getCarLevel() {
            return this.carLevel;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setDriverConfirmTime(Long driverConfirmTime) {
            this.driverConfirmTime = driverConfirmTime;
            return this;
        }
        public Long getDriverConfirmTime() {
            return this.driverConfirmTime;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setEstimatePrice(Long estimatePrice) {
            this.estimatePrice = estimatePrice;
            return this;
        }
        public Long getEstimatePrice() {
            return this.estimatePrice;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setFromAddress(String fromAddress) {
            this.fromAddress = fromAddress;
            return this;
        }
        public String getFromAddress() {
            return this.fromAddress;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setFromCityName(String fromCityName) {
            this.fromCityName = fromCityName;
            return this;
        }
        public String getFromCityName() {
            return this.fromCityName;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setIsSpecial(Boolean isSpecial) {
            this.isSpecial = isSpecial;
            return this;
        }
        public Boolean getIsSpecial() {
            return this.isSpecial;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setPublishTime(Long publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public Long getPublishTime() {
            return this.publishTime;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setRealFromAddress(String realFromAddress) {
            this.realFromAddress = realFromAddress;
            return this;
        }
        public String getRealFromAddress() {
            return this.realFromAddress;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setRealFromCityName(String realFromCityName) {
            this.realFromCityName = realFromCityName;
            return this;
        }
        public String getRealFromCityName() {
            return this.realFromCityName;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setRealToAddress(String realToAddress) {
            this.realToAddress = realToAddress;
            return this;
        }
        public String getRealToAddress() {
            return this.realToAddress;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setRealToCityName(String realToCityName) {
            this.realToCityName = realToCityName;
            return this;
        }
        public String getRealToCityName() {
            return this.realToCityName;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setServiceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Integer getServiceType() {
            return this.serviceType;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setSpecialTypes(String specialTypes) {
            this.specialTypes = specialTypes;
            return this;
        }
        public String getSpecialTypes() {
            return this.specialTypes;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setTakenTime(Long takenTime) {
            this.takenTime = takenTime;
            return this;
        }
        public Long getTakenTime() {
            return this.takenTime;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setToAddress(String toAddress) {
            this.toAddress = toAddress;
            return this;
        }
        public String getToAddress() {
            return this.toAddress;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setToCityName(String toCityName) {
            this.toCityName = toCityName;
            return this;
        }
        public String getToCityName() {
            return this.toCityName;
        }

        public CarOrderQueryResponseBodyModuleCarInfo setTravelDistance(String travelDistance) {
            this.travelDistance = travelDistance;
            return this;
        }
        public String getTravelDistance() {
            return this.travelDistance;
        }

    }

    public static class CarOrderQueryResponseBodyModuleInvoiceInfo extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("title")
        public String title;

        public static CarOrderQueryResponseBodyModuleInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            CarOrderQueryResponseBodyModuleInvoiceInfo self = new CarOrderQueryResponseBodyModuleInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public CarOrderQueryResponseBodyModuleInvoiceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CarOrderQueryResponseBodyModuleInvoiceInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CarOrderQueryResponseBodyModuleOrderBaseInfo extends TeaModel {
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("btrip_cause")
        public String btripCause;

        @NameInMap("btrip_title")
        public String btripTitle;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("gmt_create")
        public Long gmtCreate;

        @NameInMap("gmt_modified")
        public Long gmtModified;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("sub_order_id")
        public Long subOrderId;

        @NameInMap("third_depart_id")
        public String thirdDepartId;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static CarOrderQueryResponseBodyModuleOrderBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            CarOrderQueryResponseBodyModuleOrderBaseInfo self = new CarOrderQueryResponseBodyModuleOrderBaseInfo();
            return TeaModel.build(map, self);
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setBtripCause(String btripCause) {
            this.btripCause = btripCause;
            return this;
        }
        public String getBtripCause() {
            return this.btripCause;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setSubOrderId(Long subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public Long getSubOrderId() {
            return this.subOrderId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setThirdDepartId(String thirdDepartId) {
            this.thirdDepartId = thirdDepartId;
            return this;
        }
        public String getThirdDepartId() {
            return this.thirdDepartId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CarOrderQueryResponseBodyModuleOrderBaseInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class CarOrderQueryResponseBodyModulePassengerList extends TeaModel {
        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        @NameInMap("thirdpart_project_id")
        public String thirdpartProjectId;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        @NameInMap("user_type")
        public Integer userType;

        public static CarOrderQueryResponseBodyModulePassengerList build(java.util.Map<String, ?> map) throws Exception {
            CarOrderQueryResponseBodyModulePassengerList self = new CarOrderQueryResponseBodyModulePassengerList();
            return TeaModel.build(map, self);
        }

        public CarOrderQueryResponseBodyModulePassengerList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public CarOrderQueryResponseBodyModulePassengerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public CarOrderQueryResponseBodyModulePassengerList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public CarOrderQueryResponseBodyModulePassengerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public CarOrderQueryResponseBodyModulePassengerList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CarOrderQueryResponseBodyModulePassengerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public CarOrderQueryResponseBodyModulePassengerList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public CarOrderQueryResponseBodyModulePassengerList setThirdpartProjectId(String thirdpartProjectId) {
            this.thirdpartProjectId = thirdpartProjectId;
            return this;
        }
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        public CarOrderQueryResponseBodyModulePassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CarOrderQueryResponseBodyModulePassengerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CarOrderQueryResponseBodyModulePassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class CarOrderQueryResponseBodyModulePriceInfoList extends TeaModel {
        @NameInMap("category_code")
        public Integer categoryCode;

        @NameInMap("gmt_create")
        public Long gmtCreate;

        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("person_price")
        public Long personPrice;

        @NameInMap("price")
        public Long price;

        @NameInMap("trade_id")
        public String tradeId;

        @NameInMap("type")
        public Integer type;

        public static CarOrderQueryResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            CarOrderQueryResponseBodyModulePriceInfoList self = new CarOrderQueryResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public CarOrderQueryResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public CarOrderQueryResponseBodyModulePriceInfoList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CarOrderQueryResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public CarOrderQueryResponseBodyModulePriceInfoList setPersonPrice(Long personPrice) {
            this.personPrice = personPrice;
            return this;
        }
        public Long getPersonPrice() {
            return this.personPrice;
        }

        public CarOrderQueryResponseBodyModulePriceInfoList setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public CarOrderQueryResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public CarOrderQueryResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class CarOrderQueryResponseBodyModule extends TeaModel {
        @NameInMap("car_info")
        public CarOrderQueryResponseBodyModuleCarInfo carInfo;

        @NameInMap("invoice_info")
        public CarOrderQueryResponseBodyModuleInvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        public CarOrderQueryResponseBodyModuleOrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_list")
        public java.util.List<CarOrderQueryResponseBodyModulePassengerList> passengerList;

        @NameInMap("price_info_list")
        public java.util.List<CarOrderQueryResponseBodyModulePriceInfoList> priceInfoList;

        public static CarOrderQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CarOrderQueryResponseBodyModule self = new CarOrderQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CarOrderQueryResponseBodyModule setCarInfo(CarOrderQueryResponseBodyModuleCarInfo carInfo) {
            this.carInfo = carInfo;
            return this;
        }
        public CarOrderQueryResponseBodyModuleCarInfo getCarInfo() {
            return this.carInfo;
        }

        public CarOrderQueryResponseBodyModule setInvoiceInfo(CarOrderQueryResponseBodyModuleInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public CarOrderQueryResponseBodyModuleInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public CarOrderQueryResponseBodyModule setOrderBaseInfo(CarOrderQueryResponseBodyModuleOrderBaseInfo orderBaseInfo) {
            this.orderBaseInfo = orderBaseInfo;
            return this;
        }
        public CarOrderQueryResponseBodyModuleOrderBaseInfo getOrderBaseInfo() {
            return this.orderBaseInfo;
        }

        public CarOrderQueryResponseBodyModule setPassengerList(java.util.List<CarOrderQueryResponseBodyModulePassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<CarOrderQueryResponseBodyModulePassengerList> getPassengerList() {
            return this.passengerList;
        }

        public CarOrderQueryResponseBodyModule setPriceInfoList(java.util.List<CarOrderQueryResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<CarOrderQueryResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

    }

}

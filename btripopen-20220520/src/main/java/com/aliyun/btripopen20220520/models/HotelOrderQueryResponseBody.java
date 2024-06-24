// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module。</p>
     */
    @NameInMap("module")
    public HotelOrderQueryResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderQueryResponseBody self = new HotelOrderQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderQueryResponseBody setModule(HotelOrderQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelOrderQueryResponseBodyModule getModule() {
        return this.module;
    }

    public HotelOrderQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderQueryResponseBodyModuleHotelInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1669344020</p>
         */
        @NameInMap("check_in")
        public Long checkIn;

        /**
         * <strong>example:</strong>
         * <p>1669344020</p>
         */
        @NameInMap("check_out")
        public Long checkOut;

        @NameInMap("city")
        public String city;

        @NameInMap("city_ad_code")
        public String cityAdCode;

        @NameInMap("hotel_address")
        public String hotelAddress;

        @NameInMap("hotel_name")
        public String hotelName;

        @NameInMap("hotel_phone")
        public String hotelPhone;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("hotel_support_vat_invoice_type")
        public Integer hotelSupportVatInvoiceType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("night")
        public Integer night;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("room_num")
        public Integer roomNum;

        @NameInMap("room_type")
        public String roomType;

        public static HotelOrderQueryResponseBodyModuleHotelInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderQueryResponseBodyModuleHotelInfo self = new HotelOrderQueryResponseBodyModuleHotelInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setCheckIn(Long checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public Long getCheckIn() {
            return this.checkIn;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setCheckOut(Long checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public Long getCheckOut() {
            return this.checkOut;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setCityAdCode(String cityAdCode) {
            this.cityAdCode = cityAdCode;
            return this;
        }
        public String getCityAdCode() {
            return this.cityAdCode;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setHotelPhone(String hotelPhone) {
            this.hotelPhone = hotelPhone;
            return this;
        }
        public String getHotelPhone() {
            return this.hotelPhone;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setHotelSupportVatInvoiceType(Integer hotelSupportVatInvoiceType) {
            this.hotelSupportVatInvoiceType = hotelSupportVatInvoiceType;
            return this;
        }
        public Integer getHotelSupportVatInvoiceType() {
            return this.hotelSupportVatInvoiceType;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setNight(Integer night) {
            this.night = night;
            return this;
        }
        public Integer getNight() {
            return this.night;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setRoomNum(Integer roomNum) {
            this.roomNum = roomNum;
            return this;
        }
        public Integer getRoomNum() {
            return this.roomNum;
        }

        public HotelOrderQueryResponseBodyModuleHotelInfo setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }
        public String getRoomType() {
            return this.roomType;
        }

    }

    public static class HotelOrderQueryResponseBodyModuleInvoiceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("title")
        public String title;

        public static HotelOrderQueryResponseBodyModuleInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderQueryResponseBodyModuleInvoiceInfo self = new HotelOrderQueryResponseBodyModuleInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderQueryResponseBodyModuleInvoiceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public HotelOrderQueryResponseBodyModuleInvoiceInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class HotelOrderQueryResponseBodyModuleOrderBaseInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("btrip_title")
        public String btripTitle;

        /**
         * <strong>example:</strong>
         * <p>iscorpId</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("exceed_apply_nos")
        public java.util.List<String> exceedApplyNos;

        @NameInMap("extend_field")
        public String extendField;

        /**
         * <strong>example:</strong>
         * <p>1669344020</p>
         */
        @NameInMap("gmt_create")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1669344020</p>
         */
        @NameInMap("gmt_modified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1002145190081005400</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("itinerary_id")
        public String itineraryId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order_type")
        public Integer orderType;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("thirdpart_depart_id")
        public String thirdpartDepartId;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static HotelOrderQueryResponseBodyModuleOrderBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderQueryResponseBodyModuleOrderBaseInfo self = new HotelOrderQueryResponseBodyModuleOrderBaseInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setExceedApplyNos(java.util.List<String> exceedApplyNos) {
            this.exceedApplyNos = exceedApplyNos;
            return this;
        }
        public java.util.List<String> getExceedApplyNos() {
            return this.exceedApplyNos;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setExtendField(String extendField) {
            this.extendField = extendField;
            return this;
        }
        public String getExtendField() {
            return this.extendField;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartDepartId(String thirdpartDepartId) {
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public HotelOrderQueryResponseBodyModuleOrderBaseInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class HotelOrderQueryResponseBodyModulePassengerList extends TeaModel {
        @NameInMap("apply_id")
        public String applyId;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("occupant_type")
        public Integer occupantType;

        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("thirdpart_project_id")
        public String thirdpartProjectId;

        /**
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static HotelOrderQueryResponseBodyModulePassengerList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderQueryResponseBodyModulePassengerList self = new HotelOrderQueryResponseBodyModulePassengerList();
            return TeaModel.build(map, self);
        }

        public HotelOrderQueryResponseBodyModulePassengerList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setOccupantType(Integer occupantType) {
            this.occupantType = occupantType;
            return this;
        }
        public Integer getOccupantType() {
            return this.occupantType;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setThirdpartProjectId(String thirdpartProjectId) {
            this.thirdpartProjectId = thirdpartProjectId;
            return this;
        }
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public HotelOrderQueryResponseBodyModulePassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class HotelOrderQueryResponseBodyModulePriceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category_code")
        public Integer categoryCode;

        /**
         * <strong>example:</strong>
         * <p>1669344020</p>
         */
        @NameInMap("gmt_create")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("price")
        public Double price;

        /**
         * <strong>example:</strong>
         * <p>12345678910987654321</p>
         */
        @NameInMap("trade_id")
        public String tradeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static HotelOrderQueryResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderQueryResponseBodyModulePriceInfoList self = new HotelOrderQueryResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderQueryResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public HotelOrderQueryResponseBodyModulePriceInfoList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public HotelOrderQueryResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public HotelOrderQueryResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public HotelOrderQueryResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public HotelOrderQueryResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class HotelOrderQueryResponseBodyModule extends TeaModel {
        @NameInMap("hotel_info")
        public HotelOrderQueryResponseBodyModuleHotelInfo hotelInfo;

        @NameInMap("invoice_info")
        public HotelOrderQueryResponseBodyModuleInvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        public HotelOrderQueryResponseBodyModuleOrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_list")
        public java.util.List<HotelOrderQueryResponseBodyModulePassengerList> passengerList;

        @NameInMap("price_info_list")
        public java.util.List<HotelOrderQueryResponseBodyModulePriceInfoList> priceInfoList;

        public static HotelOrderQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderQueryResponseBodyModule self = new HotelOrderQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderQueryResponseBodyModule setHotelInfo(HotelOrderQueryResponseBodyModuleHotelInfo hotelInfo) {
            this.hotelInfo = hotelInfo;
            return this;
        }
        public HotelOrderQueryResponseBodyModuleHotelInfo getHotelInfo() {
            return this.hotelInfo;
        }

        public HotelOrderQueryResponseBodyModule setInvoiceInfo(HotelOrderQueryResponseBodyModuleInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public HotelOrderQueryResponseBodyModuleInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public HotelOrderQueryResponseBodyModule setOrderBaseInfo(HotelOrderQueryResponseBodyModuleOrderBaseInfo orderBaseInfo) {
            this.orderBaseInfo = orderBaseInfo;
            return this;
        }
        public HotelOrderQueryResponseBodyModuleOrderBaseInfo getOrderBaseInfo() {
            return this.orderBaseInfo;
        }

        public HotelOrderQueryResponseBodyModule setPassengerList(java.util.List<HotelOrderQueryResponseBodyModulePassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<HotelOrderQueryResponseBodyModulePassengerList> getPassengerList() {
            return this.passengerList;
        }

        public HotelOrderQueryResponseBodyModule setPriceInfoList(java.util.List<HotelOrderQueryResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<HotelOrderQueryResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

    }

}

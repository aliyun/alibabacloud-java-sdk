// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderListQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<HotelOrderListQueryResponseBodyModule> module;

    @NameInMap("page_info")
    public HotelOrderListQueryResponseBodyPageInfo pageInfo;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderListQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderListQueryResponseBody self = new HotelOrderListQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderListQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderListQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public HotelOrderListQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderListQueryResponseBody setModule(java.util.List<HotelOrderListQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<HotelOrderListQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public HotelOrderListQueryResponseBody setPageInfo(HotelOrderListQueryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public HotelOrderListQueryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public HotelOrderListQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderListQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderListQueryResponseBodyModuleCostCenter extends TeaModel {
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("number")
        public String number;

        public static HotelOrderListQueryResponseBodyModuleCostCenter build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderListQueryResponseBodyModuleCostCenter self = new HotelOrderListQueryResponseBodyModuleCostCenter();
            return TeaModel.build(map, self);
        }

        public HotelOrderListQueryResponseBodyModuleCostCenter setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public HotelOrderListQueryResponseBodyModuleCostCenter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public HotelOrderListQueryResponseBodyModuleCostCenter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotelOrderListQueryResponseBodyModuleCostCenter setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class HotelOrderListQueryResponseBodyModuleInvoice extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("invoice_type")
        public Integer invoiceType;

        @NameInMap("title")
        public String title;

        public static HotelOrderListQueryResponseBodyModuleInvoice build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderListQueryResponseBodyModuleInvoice self = new HotelOrderListQueryResponseBodyModuleInvoice();
            return TeaModel.build(map, self);
        }

        public HotelOrderListQueryResponseBodyModuleInvoice setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public HotelOrderListQueryResponseBodyModuleInvoice setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public HotelOrderListQueryResponseBodyModuleInvoice setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class HotelOrderListQueryResponseBodyModulePriceInfoList extends TeaModel {
        @NameInMap("category_code")
        public Integer categoryCode;

        @NameInMap("category_type")
        public Integer categoryType;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("price")
        public Double price;

        @NameInMap("trade_id")
        public String tradeId;

        @NameInMap("type")
        public Integer type;

        public static HotelOrderListQueryResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderListQueryResponseBodyModulePriceInfoList self = new HotelOrderListQueryResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderListQueryResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public HotelOrderListQueryResponseBodyModulePriceInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public HotelOrderListQueryResponseBodyModulePriceInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public HotelOrderListQueryResponseBodyModulePriceInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public HotelOrderListQueryResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public HotelOrderListQueryResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public HotelOrderListQueryResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public HotelOrderListQueryResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class HotelOrderListQueryResponseBodyModuleUserAffiliateList extends TeaModel {
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static HotelOrderListQueryResponseBodyModuleUserAffiliateList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderListQueryResponseBodyModuleUserAffiliateList self = new HotelOrderListQueryResponseBodyModuleUserAffiliateList();
            return TeaModel.build(map, self);
        }

        public HotelOrderListQueryResponseBodyModuleUserAffiliateList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public HotelOrderListQueryResponseBodyModuleUserAffiliateList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class HotelOrderListQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("btrip_title")
        public String btripTitle;

        @NameInMap("check_in")
        public String checkIn;

        @NameInMap("check_out")
        public String checkOut;

        @NameInMap("city")
        public String city;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("cost_center")
        public HotelOrderListQueryResponseBodyModuleCostCenter costCenter;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("guest")
        public String guest;

        @NameInMap("hotel_name")
        public String hotelName;

        @NameInMap("hotel_support_vat_invoice_type")
        public Integer hotelSupportVatInvoiceType;

        @NameInMap("id")
        public Long id;

        @NameInMap("invoice")
        public HotelOrderListQueryResponseBodyModuleInvoice invoice;

        @NameInMap("night")
        public Integer night;

        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        @NameInMap("order_type")
        public Integer orderType;

        @NameInMap("order_type_desc")
        public String orderTypeDesc;

        @NameInMap("price_info_list")
        public java.util.List<HotelOrderListQueryResponseBodyModulePriceInfoList> priceInfoList;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("room_num")
        public Integer roomNum;

        @NameInMap("room_type")
        public String roomType;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("thirdpart_project_id")
        public String thirdpartProjectId;

        @NameInMap("user_affiliate_list")
        public java.util.List<HotelOrderListQueryResponseBodyModuleUserAffiliateList> userAffiliateList;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static HotelOrderListQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderListQueryResponseBodyModule self = new HotelOrderListQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderListQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public HotelOrderListQueryResponseBodyModule setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public HotelOrderListQueryResponseBodyModule setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public HotelOrderListQueryResponseBodyModule setCheckOut(String checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public String getCheckOut() {
            return this.checkOut;
        }

        public HotelOrderListQueryResponseBodyModule setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public HotelOrderListQueryResponseBodyModule setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public HotelOrderListQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public HotelOrderListQueryResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public HotelOrderListQueryResponseBodyModule setCostCenter(HotelOrderListQueryResponseBodyModuleCostCenter costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public HotelOrderListQueryResponseBodyModuleCostCenter getCostCenter() {
            return this.costCenter;
        }

        public HotelOrderListQueryResponseBodyModule setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public HotelOrderListQueryResponseBodyModule setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public HotelOrderListQueryResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public HotelOrderListQueryResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public HotelOrderListQueryResponseBodyModule setGuest(String guest) {
            this.guest = guest;
            return this;
        }
        public String getGuest() {
            return this.guest;
        }

        public HotelOrderListQueryResponseBodyModule setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelOrderListQueryResponseBodyModule setHotelSupportVatInvoiceType(Integer hotelSupportVatInvoiceType) {
            this.hotelSupportVatInvoiceType = hotelSupportVatInvoiceType;
            return this;
        }
        public Integer getHotelSupportVatInvoiceType() {
            return this.hotelSupportVatInvoiceType;
        }

        public HotelOrderListQueryResponseBodyModule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public HotelOrderListQueryResponseBodyModule setInvoice(HotelOrderListQueryResponseBodyModuleInvoice invoice) {
            this.invoice = invoice;
            return this;
        }
        public HotelOrderListQueryResponseBodyModuleInvoice getInvoice() {
            return this.invoice;
        }

        public HotelOrderListQueryResponseBodyModule setNight(Integer night) {
            this.night = night;
            return this;
        }
        public Integer getNight() {
            return this.night;
        }

        public HotelOrderListQueryResponseBodyModule setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public HotelOrderListQueryResponseBodyModule setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public HotelOrderListQueryResponseBodyModule setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public HotelOrderListQueryResponseBodyModule setOrderTypeDesc(String orderTypeDesc) {
            this.orderTypeDesc = orderTypeDesc;
            return this;
        }
        public String getOrderTypeDesc() {
            return this.orderTypeDesc;
        }

        public HotelOrderListQueryResponseBodyModule setPriceInfoList(java.util.List<HotelOrderListQueryResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<HotelOrderListQueryResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public HotelOrderListQueryResponseBodyModule setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public HotelOrderListQueryResponseBodyModule setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public HotelOrderListQueryResponseBodyModule setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public HotelOrderListQueryResponseBodyModule setRoomNum(Integer roomNum) {
            this.roomNum = roomNum;
            return this;
        }
        public Integer getRoomNum() {
            return this.roomNum;
        }

        public HotelOrderListQueryResponseBodyModule setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }
        public String getRoomType() {
            return this.roomType;
        }

        public HotelOrderListQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public HotelOrderListQueryResponseBodyModule setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public HotelOrderListQueryResponseBodyModule setThirdpartProjectId(String thirdpartProjectId) {
            this.thirdpartProjectId = thirdpartProjectId;
            return this;
        }
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        public HotelOrderListQueryResponseBodyModule setUserAffiliateList(java.util.List<HotelOrderListQueryResponseBodyModuleUserAffiliateList> userAffiliateList) {
            this.userAffiliateList = userAffiliateList;
            return this;
        }
        public java.util.List<HotelOrderListQueryResponseBodyModuleUserAffiliateList> getUserAffiliateList() {
            return this.userAffiliateList;
        }

        public HotelOrderListQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public HotelOrderListQueryResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class HotelOrderListQueryResponseBodyPageInfo extends TeaModel {
        @NameInMap("page")
        public Integer page;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_number")
        public Integer totalNumber;

        public static HotelOrderListQueryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderListQueryResponseBodyPageInfo self = new HotelOrderListQueryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderListQueryResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public HotelOrderListQueryResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public HotelOrderListQueryResponseBodyPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}

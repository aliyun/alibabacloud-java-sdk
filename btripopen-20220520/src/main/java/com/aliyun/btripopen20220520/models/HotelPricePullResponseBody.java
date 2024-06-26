// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelPricePullResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelPricePullResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>9BCDD5DE-E6CB-5C25-93B9-9BE178A0AA56</p>
     */
    @NameInMap("request_id")
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
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelPricePullResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelPricePullResponseBody self = new HotelPricePullResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelPricePullResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelPricePullResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelPricePullResponseBody setModule(HotelPricePullResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelPricePullResponseBodyModule getModule() {
        return this.module;
    }

    public HotelPricePullResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelPricePullResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelPricePullResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("hour")
        public Long hour;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("value")
        public Long value;

        public static HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList self = new HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList();
            return TeaModel.build(map, self);
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList setHour(Long hour) {
            this.hour = hour;
            return this;
        }
        public Long getHour() {
            return this.hour;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy extends TeaModel {
        @NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cancel_policy_type")
        public Integer cancelPolicyType;

        public static HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy build(java.util.Map<String, ?> map) throws Exception {
            HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy self = new HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy();
            return TeaModel.build(map, self);
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy setBtripHotelCancelPolicyInfoDTOList(java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList) {
            this.btripHotelCancelPolicyInfoDTOList = btripHotelCancelPolicyInfoDTOList;
            return this;
        }
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicyBtripHotelCancelPolicyInfoDTOList> getBtripHotelCancelPolicyInfoDTOList() {
            return this.btripHotelCancelPolicyInfoDTOList;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy setCancelPolicyType(Integer cancelPolicyType) {
            this.cancelPolicyType = cancelPolicyType;
            return this;
        }
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

    }

    public static class HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("discount_price")
        public Long discountPrice;

        /**
         * <strong>example:</strong>
         * <p>62800</p>
         */
        @NameInMap("last_discounts_price")
        public Long lastDiscountsPrice;

        /**
         * <strong>example:</strong>
         * <p>62800</p>
         */
        @NameInMap("price")
        public Long price;

        /**
         * <strong>example:</strong>
         * <p>2023-10-17</p>
         */
        @NameInMap("start_date")
        public String startDate;

        public static HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys build(java.util.Map<String, ?> map) throws Exception {
            HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys self = new HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys();
            return TeaModel.build(map, self);
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys setLastDiscountsPrice(Long lastDiscountsPrice) {
            this.lastDiscountsPrice = lastDiscountsPrice;
            return this;
        }
        public Long getLastDiscountsPrice() {
            return this.lastDiscountsPrice;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("breakfast")
        public String breakfast;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("breakfast_count")
        public Integer breakfastCount;

        @NameInMap("btrip_hotel_cancel_policy")
        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy btripHotelCancelPolicy;

        @NameInMap("cancel_policy_desc")
        public String cancelPolicyDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("company_aassist")
        public String companyAassist;

        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("currency_code")
        public String currencyCode;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("instant_confirm")
        public Boolean instantConfirm;

        /**
         * <strong>example:</strong>
         * <p>721700504622</p>
         */
        @NameInMap("item_id")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("max_adv_hours")
        public Integer maxAdvHours;

        /**
         * <strong>example:</strong>
         * <p>4344</p>
         */
        @NameInMap("max_days")
        public Integer maxDays;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("min_adv_hours")
        public Integer minAdvHours;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("min_days")
        public Integer minDays;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("nod")
        public Integer nod;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("nop")
        public Integer nop;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("payment_type")
        public Integer paymentType;

        /**
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("price")
        public Long price;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("promotion_info")
        public String promotionInfo;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("quota")
        public Integer quota;

        @NameInMap("rate_dailys")
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys> rateDailys;

        /**
         * <strong>example:</strong>
         * <p>4509447432148</p>
         */
        @NameInMap("rate_id")
        public String rateId;

        @NameInMap("rate_plan_name")
        public String ratePlanName;

        /**
         * <strong>example:</strong>
         * <p>4509447432148</p>
         */
        @NameInMap("rp_id")
        public String rpId;

        /**
         * <strong>example:</strong>
         * <p>2829486701</p>
         */
        @NameInMap("seller_id")
        public String sellerId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("support_special_invoice")
        public Boolean supportSpecialInvoice;

        public static HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates build(java.util.Map<String, ?> map) throws Exception {
            HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates self = new HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates();
            return TeaModel.build(map, self);
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setBreakfast(String breakfast) {
            this.breakfast = breakfast;
            return this;
        }
        public String getBreakfast() {
            return this.breakfast;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setBreakfastCount(Integer breakfastCount) {
            this.breakfastCount = breakfastCount;
            return this;
        }
        public Integer getBreakfastCount() {
            return this.breakfastCount;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setBtripHotelCancelPolicy(HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy btripHotelCancelPolicy) {
            this.btripHotelCancelPolicy = btripHotelCancelPolicy;
            return this;
        }
        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesBtripHotelCancelPolicy getBtripHotelCancelPolicy() {
            return this.btripHotelCancelPolicy;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setCancelPolicyDesc(String cancelPolicyDesc) {
            this.cancelPolicyDesc = cancelPolicyDesc;
            return this;
        }
        public String getCancelPolicyDesc() {
            return this.cancelPolicyDesc;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setCompanyAassist(String companyAassist) {
            this.companyAassist = companyAassist;
            return this;
        }
        public String getCompanyAassist() {
            return this.companyAassist;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setInstantConfirm(Boolean instantConfirm) {
            this.instantConfirm = instantConfirm;
            return this;
        }
        public Boolean getInstantConfirm() {
            return this.instantConfirm;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setMaxAdvHours(Integer maxAdvHours) {
            this.maxAdvHours = maxAdvHours;
            return this;
        }
        public Integer getMaxAdvHours() {
            return this.maxAdvHours;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setMaxDays(Integer maxDays) {
            this.maxDays = maxDays;
            return this;
        }
        public Integer getMaxDays() {
            return this.maxDays;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setMinAdvHours(Integer minAdvHours) {
            this.minAdvHours = minAdvHours;
            return this;
        }
        public Integer getMinAdvHours() {
            return this.minAdvHours;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setMinDays(Integer minDays) {
            this.minDays = minDays;
            return this;
        }
        public Integer getMinDays() {
            return this.minDays;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setNod(Integer nod) {
            this.nod = nod;
            return this;
        }
        public Integer getNod() {
            return this.nod;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setNop(Integer nop) {
            this.nop = nop;
            return this;
        }
        public Integer getNop() {
            return this.nop;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setPaymentType(Integer paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Integer getPaymentType() {
            return this.paymentType;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setPromotionInfo(String promotionInfo) {
            this.promotionInfo = promotionInfo;
            return this;
        }
        public String getPromotionInfo() {
            return this.promotionInfo;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setRateDailys(java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys> rateDailys) {
            this.rateDailys = rateDailys;
            return this;
        }
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRatesRateDailys> getRateDailys() {
            return this.rateDailys;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setRateId(String rateId) {
            this.rateId = rateId;
            return this;
        }
        public String getRateId() {
            return this.rateId;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setRatePlanName(String ratePlanName) {
            this.ratePlanName = ratePlanName;
            return this;
        }
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setRpId(String rpId) {
            this.rpId = rpId;
            return this;
        }
        public String getRpId() {
            return this.rpId;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates setSupportSpecialInvoice(Boolean supportSpecialInvoice) {
            this.supportSpecialInvoice = supportSpecialInvoice;
            return this;
        }
        public Boolean getSupportSpecialInvoice() {
            return this.supportSpecialInvoice;
        }

    }

    public static class HotelPricePullResponseBodyModuleHotelPriceInfosRooms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("area")
        public String area;

        @NameInMap("bed")
        public String bed;

        @NameInMap("bed_type_string")
        public String bedTypeString;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;bathtub\&quot;:true}</p>
         */
        @NameInMap("facility")
        public String facility;

        /**
         * <strong>example:</strong>
         * <p>1,2,3,4,5,6</p>
         */
        @NameInMap("floor")
        public String floor;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("max_occupancy")
        public Integer maxOccupancy;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("network_service")
        public String networkService;

        @NameInMap("pics")
        public java.util.List<String> pics;

        @NameInMap("rates")
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates> rates;

        /**
         * <strong>example:</strong>
         * <p>64681618</p>
         */
        @NameInMap("room_id")
        public String roomId;

        @NameInMap("room_name")
        public String roomName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("window_type")
        public String windowType;

        public static HotelPricePullResponseBodyModuleHotelPriceInfosRooms build(java.util.Map<String, ?> map) throws Exception {
            HotelPricePullResponseBodyModuleHotelPriceInfosRooms self = new HotelPricePullResponseBodyModuleHotelPriceInfosRooms();
            return TeaModel.build(map, self);
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setBed(String bed) {
            this.bed = bed;
            return this;
        }
        public String getBed() {
            return this.bed;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setBedTypeString(String bedTypeString) {
            this.bedTypeString = bedTypeString;
            return this;
        }
        public String getBedTypeString() {
            return this.bedTypeString;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setFacility(String facility) {
            this.facility = facility;
            return this;
        }
        public String getFacility() {
            return this.facility;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setFloor(String floor) {
            this.floor = floor;
            return this;
        }
        public String getFloor() {
            return this.floor;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setMaxOccupancy(Integer maxOccupancy) {
            this.maxOccupancy = maxOccupancy;
            return this;
        }
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setNetworkService(String networkService) {
            this.networkService = networkService;
            return this;
        }
        public String getNetworkService() {
            return this.networkService;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setPics(java.util.List<String> pics) {
            this.pics = pics;
            return this;
        }
        public java.util.List<String> getPics() {
            return this.pics;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setRates(java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates> rates) {
            this.rates = rates;
            return this;
        }
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRoomsRates> getRates() {
            return this.rates;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfosRooms setWindowType(String windowType) {
            this.windowType = windowType;
            return this;
        }
        public String getWindowType() {
            return this.windowType;
        }

    }

    public static class HotelPricePullResponseBodyModuleHotelPriceInfos extends TeaModel {
        @NameInMap("address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>64389015</p>
         */
        @NameInMap("hotel_id")
        public String hotelId;

        @NameInMap("hotel_name")
        public String hotelName;

        @NameInMap("rooms")
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRooms> rooms;

        /**
         * <strong>example:</strong>
         * <p>9BCDD5DE-E6CB-5C25-93B9-9BE178A0AA56</p>
         */
        @NameInMap("search_id")
        public String searchId;

        public static HotelPricePullResponseBodyModuleHotelPriceInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelPricePullResponseBodyModuleHotelPriceInfos self = new HotelPricePullResponseBodyModuleHotelPriceInfos();
            return TeaModel.build(map, self);
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfos setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfos setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfos setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfos setRooms(java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRooms> rooms) {
            this.rooms = rooms;
            return this;
        }
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfosRooms> getRooms() {
            return this.rooms;
        }

        public HotelPricePullResponseBodyModuleHotelPriceInfos setSearchId(String searchId) {
            this.searchId = searchId;
            return this;
        }
        public String getSearchId() {
            return this.searchId;
        }

    }

    public static class HotelPricePullResponseBodyModule extends TeaModel {
        @NameInMap("hotel_price_infos")
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfos> hotelPriceInfos;

        public static HotelPricePullResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelPricePullResponseBodyModule self = new HotelPricePullResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelPricePullResponseBodyModule setHotelPriceInfos(java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfos> hotelPriceInfos) {
            this.hotelPriceInfos = hotelPriceInfos;
            return this;
        }
        public java.util.List<HotelPricePullResponseBodyModuleHotelPriceInfos> getHotelPriceInfos() {
            return this.hotelPriceInfos;
        }

    }

}

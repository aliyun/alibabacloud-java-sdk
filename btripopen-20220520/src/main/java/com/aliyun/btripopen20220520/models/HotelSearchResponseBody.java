// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSearchResponseBody extends TeaModel {
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
    public HotelSearchResponseBodyModule module;

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
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelSearchResponseBody self = new HotelSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelSearchResponseBody setModule(HotelSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelSearchResponseBodyModule getModule() {
        return this.module;
    }

    public HotelSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail extends TeaModel {
        @NameInMap("label_name")
        public java.util.List<String> labelName;

        @NameInMap("money_desc")
        public String moneyDesc;

        public static HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail build(java.util.Map<String, ?> map) throws Exception {
            HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail self = new HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail();
            return TeaModel.build(map, self);
        }

        public HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail setLabelName(java.util.List<String> labelName) {
            this.labelName = labelName;
            return this;
        }
        public java.util.List<String> getLabelName() {
            return this.labelName;
        }

        public HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail setMoneyDesc(String moneyDesc) {
            this.moneyDesc = moneyDesc;
            return this;
        }
        public String getMoneyDesc() {
            return this.moneyDesc;
        }

    }

    public static class HotelSearchResponseBodyModuleItemsDiscountDesc extends TeaModel {
        @NameInMap("cash_reduce_total")
        public String cashReduceTotal;

        @NameInMap("dinamic_label")
        public String dinamicLabel;

        @NameInMap("discount_detail")
        public java.util.List<HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail> discountDetail;

        @NameInMap("sub_title")
        public String subTitle;

        @NameInMap("title")
        public String title;

        public static HotelSearchResponseBodyModuleItemsDiscountDesc build(java.util.Map<String, ?> map) throws Exception {
            HotelSearchResponseBodyModuleItemsDiscountDesc self = new HotelSearchResponseBodyModuleItemsDiscountDesc();
            return TeaModel.build(map, self);
        }

        public HotelSearchResponseBodyModuleItemsDiscountDesc setCashReduceTotal(String cashReduceTotal) {
            this.cashReduceTotal = cashReduceTotal;
            return this;
        }
        public String getCashReduceTotal() {
            return this.cashReduceTotal;
        }

        public HotelSearchResponseBodyModuleItemsDiscountDesc setDinamicLabel(String dinamicLabel) {
            this.dinamicLabel = dinamicLabel;
            return this;
        }
        public String getDinamicLabel() {
            return this.dinamicLabel;
        }

        public HotelSearchResponseBodyModuleItemsDiscountDesc setDiscountDetail(java.util.List<HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail> discountDetail) {
            this.discountDetail = discountDetail;
            return this;
        }
        public java.util.List<HotelSearchResponseBodyModuleItemsDiscountDescDiscountDetail> getDiscountDetail() {
            return this.discountDetail;
        }

        public HotelSearchResponseBodyModuleItemsDiscountDesc setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

        public HotelSearchResponseBodyModuleItemsDiscountDesc setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class HotelSearchResponseBodyModuleItems extends TeaModel {
        @NameInMap("brand_name")
        public String brandName;

        /**
         * <strong>example:</strong>
         * <p>1902</p>
         */
        @NameInMap("btand_code")
        public String btandCode;

        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("discount_desc")
        public HotelSearchResponseBodyModuleItemsDiscountDesc discountDesc;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("distance")
        public Integer distance;

        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("district_code")
        public String districtCode;

        @NameInMap("hotel_address")
        public String hotelAddress;

        /**
         * <strong>example:</strong>
         * <p>55335212</p>
         */
        @NameInMap("hotel_code")
        public String hotelCode;

        /**
         * <strong>example:</strong>
         * <p>Business travel hotel</p>
         */
        @NameInMap("hotel_en_name")
        public String hotelEnName;

        @NameInMap("hotel_name")
        public String hotelName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("hotel_star")
        public String hotelStar;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i3/6000000000003/O1CN01xkZQR41BtPxK1PQCb_!!6000000000003-0-hotel.jpg">https://img.alicdn.com/imgextra/i3/6000000000003/O1CN01xkZQR41BtPxK1PQCb_!!6000000000003-0-hotel.jpg</a></p>
         */
        @NameInMap("image_url")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_protocol")
        public Boolean isProtocol;

        /**
         * <strong>example:</strong>
         * <p>119.844005,30.054384</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("min_price")
        public Double minPrice;

        @NameInMap("original_min_price")
        public Double originalMinPrice;

        /**
         * <strong>example:</strong>
         * <p>3.2</p>
         */
        @NameInMap("score")
        public String score;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>0571-88886784-8888</p>
         */
        @NameInMap("tel")
        public String tel;

        public static HotelSearchResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            HotelSearchResponseBodyModuleItems self = new HotelSearchResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public HotelSearchResponseBodyModuleItems setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public HotelSearchResponseBodyModuleItems setBtandCode(String btandCode) {
            this.btandCode = btandCode;
            return this;
        }
        public String getBtandCode() {
            return this.btandCode;
        }

        public HotelSearchResponseBodyModuleItems setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public HotelSearchResponseBodyModuleItems setDiscountDesc(HotelSearchResponseBodyModuleItemsDiscountDesc discountDesc) {
            this.discountDesc = discountDesc;
            return this;
        }
        public HotelSearchResponseBodyModuleItemsDiscountDesc getDiscountDesc() {
            return this.discountDesc;
        }

        public HotelSearchResponseBodyModuleItems setDistance(Integer distance) {
            this.distance = distance;
            return this;
        }
        public Integer getDistance() {
            return this.distance;
        }

        public HotelSearchResponseBodyModuleItems setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public HotelSearchResponseBodyModuleItems setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public HotelSearchResponseBodyModuleItems setHotelCode(String hotelCode) {
            this.hotelCode = hotelCode;
            return this;
        }
        public String getHotelCode() {
            return this.hotelCode;
        }

        public HotelSearchResponseBodyModuleItems setHotelEnName(String hotelEnName) {
            this.hotelEnName = hotelEnName;
            return this;
        }
        public String getHotelEnName() {
            return this.hotelEnName;
        }

        public HotelSearchResponseBodyModuleItems setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelSearchResponseBodyModuleItems setHotelStar(String hotelStar) {
            this.hotelStar = hotelStar;
            return this;
        }
        public String getHotelStar() {
            return this.hotelStar;
        }

        public HotelSearchResponseBodyModuleItems setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public HotelSearchResponseBodyModuleItems setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public HotelSearchResponseBodyModuleItems setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public HotelSearchResponseBodyModuleItems setMinPrice(Double minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Double getMinPrice() {
            return this.minPrice;
        }

        public HotelSearchResponseBodyModuleItems setOriginalMinPrice(Double originalMinPrice) {
            this.originalMinPrice = originalMinPrice;
            return this;
        }
        public Double getOriginalMinPrice() {
            return this.originalMinPrice;
        }

        public HotelSearchResponseBodyModuleItems setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public HotelSearchResponseBodyModuleItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public HotelSearchResponseBodyModuleItems setTel(String tel) {
            this.tel = tel;
            return this;
        }
        public String getTel() {
            return this.tel;
        }

    }

    public static class HotelSearchResponseBodyModule extends TeaModel {
        @NameInMap("count")
        public Integer count;

        @NameInMap("items")
        public java.util.List<HotelSearchResponseBodyModuleItems> items;

        public static HotelSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelSearchResponseBodyModule self = new HotelSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelSearchResponseBodyModule setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public HotelSearchResponseBodyModule setItems(java.util.List<HotelSearchResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<HotelSearchResponseBodyModuleItems> getItems() {
            return this.items;
        }

    }

}

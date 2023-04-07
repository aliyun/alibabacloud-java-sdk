// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSearchResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelSearchResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

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

    public static class HotelSearchResponseBodyModuleItems extends TeaModel {
        @NameInMap("brand_name")
        public String brandName;

        @NameInMap("btand_code")
        public String btandCode;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("distance")
        public Integer distance;

        @NameInMap("district_code")
        public String districtCode;

        @NameInMap("hotel_address")
        public String hotelAddress;

        @NameInMap("hotel_code")
        public String hotelCode;

        @NameInMap("hotel_en_name")
        public String hotelEnName;

        @NameInMap("hotel_name")
        public String hotelName;

        @NameInMap("hotel_star")
        public String hotelStar;

        @NameInMap("image_url")
        public String imageUrl;

        @NameInMap("is_protocol")
        public Boolean isProtocol;

        @NameInMap("location")
        public String location;

        @NameInMap("min_price")
        public Double minPrice;

        @NameInMap("score")
        public String score;

        @NameInMap("status")
        public Integer status;

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
        @NameInMap("items")
        public java.util.List<HotelSearchResponseBodyModuleItems> items;

        public static HotelSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelSearchResponseBodyModule self = new HotelSearchResponseBodyModule();
            return TeaModel.build(map, self);
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

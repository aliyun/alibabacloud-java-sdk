// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelSuggestV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelSuggestV2ResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static HotelSuggestV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelSuggestV2ResponseBody self = new HotelSuggestV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelSuggestV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelSuggestV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelSuggestV2ResponseBody setModule(HotelSuggestV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelSuggestV2ResponseBodyModule getModule() {
        return this.module;
    }

    public HotelSuggestV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelSuggestV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelSuggestV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelSuggestV2ResponseBodyModuleGuessSuggestInfos extends TeaModel {
        @NameInMap("address")
        public String address;

        @NameInMap("city_code")
        public Integer cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("display_name")
        public String displayName;

        @NameInMap("hotel_id")
        public String hotelId;

        @NameInMap("icon")
        public String icon;

        @NameInMap("point")
        public String point;

        @NameInMap("price")
        public String price;

        @NameInMap("region")
        public Integer region;

        @NameInMap("type")
        public Integer type;

        @NameInMap("type_desc")
        public String typeDesc;

        public static HotelSuggestV2ResponseBodyModuleGuessSuggestInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestV2ResponseBodyModuleGuessSuggestInfos self = new HotelSuggestV2ResponseBodyModuleGuessSuggestInfos();
            return TeaModel.build(map, self);
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setCityCode(Integer cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Integer getCityCode() {
            return this.cityCode;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public HotelSuggestV2ResponseBodyModuleGuessSuggestInfos setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
            return this;
        }
        public String getTypeDesc() {
            return this.typeDesc;
        }

    }

    public static class HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity extends TeaModel {
        @NameInMap("address")
        public String address;

        @NameInMap("city_code")
        public Integer cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("display_name")
        public String displayName;

        @NameInMap("hotel_id")
        public String hotelId;

        @NameInMap("icon")
        public String icon;

        @NameInMap("point")
        public String point;

        @NameInMap("price")
        public String price;

        @NameInMap("region")
        public Integer region;

        @NameInMap("type")
        public Integer type;

        @NameInMap("type_desc")
        public String typeDesc;

        public static HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity self = new HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity();
            return TeaModel.build(map, self);
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setCityCode(Integer cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Integer getCityCode() {
            return this.cityCode;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
            return this;
        }
        public String getTypeDesc() {
            return this.typeDesc;
        }

    }

    public static class HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos extends TeaModel {
        @NameInMap("address")
        public String address;

        @NameInMap("business_area_with_city")
        public java.util.List<HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity> businessAreaWithCity;

        @NameInMap("city_code")
        public Integer cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("display_name")
        public String displayName;

        @NameInMap("hotel_id")
        public String hotelId;

        @NameInMap("icon")
        public String icon;

        @NameInMap("point")
        public String point;

        @NameInMap("price")
        public String price;

        @NameInMap("region")
        public Integer region;

        @NameInMap("type")
        public Integer type;

        @NameInMap("type_desc")
        public String typeDesc;

        public static HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos self = new HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos();
            return TeaModel.build(map, self);
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setBusinessAreaWithCity(java.util.List<HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity> businessAreaWithCity) {
            this.businessAreaWithCity = businessAreaWithCity;
            return this;
        }
        public java.util.List<HotelSuggestV2ResponseBodyModuleKeywordSuggestInfosBusinessAreaWithCity> getBusinessAreaWithCity() {
            return this.businessAreaWithCity;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setCityCode(Integer cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Integer getCityCode() {
            return this.cityCode;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setPoint(String point) {
            this.point = point;
            return this;
        }
        public String getPoint() {
            return this.point;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
            return this;
        }
        public String getTypeDesc() {
            return this.typeDesc;
        }

    }

    public static class HotelSuggestV2ResponseBodyModulePopularSuggestInfosPopularInfos extends TeaModel {
        @NameInMap("display_name")
        public String displayName;

        public static HotelSuggestV2ResponseBodyModulePopularSuggestInfosPopularInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestV2ResponseBodyModulePopularSuggestInfosPopularInfos self = new HotelSuggestV2ResponseBodyModulePopularSuggestInfosPopularInfos();
            return TeaModel.build(map, self);
        }

        public HotelSuggestV2ResponseBodyModulePopularSuggestInfosPopularInfos setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class HotelSuggestV2ResponseBodyModulePopularSuggestInfos extends TeaModel {
        @NameInMap("icon")
        public String icon;

        @NameInMap("popular_infos")
        public java.util.List<HotelSuggestV2ResponseBodyModulePopularSuggestInfosPopularInfos> popularInfos;

        @NameInMap("title")
        public String title;

        public static HotelSuggestV2ResponseBodyModulePopularSuggestInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestV2ResponseBodyModulePopularSuggestInfos self = new HotelSuggestV2ResponseBodyModulePopularSuggestInfos();
            return TeaModel.build(map, self);
        }

        public HotelSuggestV2ResponseBodyModulePopularSuggestInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public HotelSuggestV2ResponseBodyModulePopularSuggestInfos setPopularInfos(java.util.List<HotelSuggestV2ResponseBodyModulePopularSuggestInfosPopularInfos> popularInfos) {
            this.popularInfos = popularInfos;
            return this;
        }
        public java.util.List<HotelSuggestV2ResponseBodyModulePopularSuggestInfosPopularInfos> getPopularInfos() {
            return this.popularInfos;
        }

        public HotelSuggestV2ResponseBodyModulePopularSuggestInfos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class HotelSuggestV2ResponseBodyModule extends TeaModel {
        @NameInMap("guess_suggest_infos")
        public java.util.List<HotelSuggestV2ResponseBodyModuleGuessSuggestInfos> guessSuggestInfos;

        @NameInMap("keyword_suggest_infos")
        public java.util.List<HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos> keywordSuggestInfos;

        @NameInMap("popular_suggest_infos")
        public java.util.List<HotelSuggestV2ResponseBodyModulePopularSuggestInfos> popularSuggestInfos;

        @NameInMap("tips")
        public String tips;

        public static HotelSuggestV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelSuggestV2ResponseBodyModule self = new HotelSuggestV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelSuggestV2ResponseBodyModule setGuessSuggestInfos(java.util.List<HotelSuggestV2ResponseBodyModuleGuessSuggestInfos> guessSuggestInfos) {
            this.guessSuggestInfos = guessSuggestInfos;
            return this;
        }
        public java.util.List<HotelSuggestV2ResponseBodyModuleGuessSuggestInfos> getGuessSuggestInfos() {
            return this.guessSuggestInfos;
        }

        public HotelSuggestV2ResponseBodyModule setKeywordSuggestInfos(java.util.List<HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos> keywordSuggestInfos) {
            this.keywordSuggestInfos = keywordSuggestInfos;
            return this;
        }
        public java.util.List<HotelSuggestV2ResponseBodyModuleKeywordSuggestInfos> getKeywordSuggestInfos() {
            return this.keywordSuggestInfos;
        }

        public HotelSuggestV2ResponseBodyModule setPopularSuggestInfos(java.util.List<HotelSuggestV2ResponseBodyModulePopularSuggestInfos> popularSuggestInfos) {
            this.popularSuggestInfos = popularSuggestInfos;
            return this;
        }
        public java.util.List<HotelSuggestV2ResponseBodyModulePopularSuggestInfos> getPopularSuggestInfos() {
            return this.popularSuggestInfos;
        }

        public HotelSuggestV2ResponseBodyModule setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

}

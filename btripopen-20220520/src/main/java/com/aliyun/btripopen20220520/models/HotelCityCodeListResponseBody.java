// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelCityCodeListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>response is empty.</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<HotelCityCodeListResponseBodyModule> module;

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

    public static HotelCityCodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelCityCodeListResponseBody self = new HotelCityCodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelCityCodeListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelCityCodeListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelCityCodeListResponseBody setModule(java.util.List<HotelCityCodeListResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<HotelCityCodeListResponseBodyModule> getModule() {
        return this.module;
    }

    public HotelCityCodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelCityCodeListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelCityCodeListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelCityCodeListResponseBodyModuleCitysDistricts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>330000</p>
         */
        @NameInMap("district_code")
        public String districtCode;

        @NameInMap("district_name")
        public String districtName;

        public static HotelCityCodeListResponseBodyModuleCitysDistricts build(java.util.Map<String, ?> map) throws Exception {
            HotelCityCodeListResponseBodyModuleCitysDistricts self = new HotelCityCodeListResponseBodyModuleCitysDistricts();
            return TeaModel.build(map, self);
        }

        public HotelCityCodeListResponseBodyModuleCitysDistricts setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public HotelCityCodeListResponseBodyModuleCitysDistricts setDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }
        public String getDistrictName() {
            return this.districtName;
        }

    }

    public static class HotelCityCodeListResponseBodyModuleCitys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>445222</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("districts")
        public java.util.List<HotelCityCodeListResponseBodyModuleCitysDistricts> districts;

        public static HotelCityCodeListResponseBodyModuleCitys build(java.util.Map<String, ?> map) throws Exception {
            HotelCityCodeListResponseBodyModuleCitys self = new HotelCityCodeListResponseBodyModuleCitys();
            return TeaModel.build(map, self);
        }

        public HotelCityCodeListResponseBodyModuleCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public HotelCityCodeListResponseBodyModuleCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelCityCodeListResponseBodyModuleCitys setDistricts(java.util.List<HotelCityCodeListResponseBodyModuleCitysDistricts> districts) {
            this.districts = districts;
            return this;
        }
        public java.util.List<HotelCityCodeListResponseBodyModuleCitysDistricts> getDistricts() {
            return this.districts;
        }

    }

    public static class HotelCityCodeListResponseBodyModule extends TeaModel {
        @NameInMap("citys")
        public java.util.List<HotelCityCodeListResponseBodyModuleCitys> citys;

        /**
         * <strong>example:</strong>
         * <p>108800</p>
         */
        @NameInMap("provice_code")
        public String proviceCode;

        @NameInMap("province_name")
        public String provinceName;

        public static HotelCityCodeListResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelCityCodeListResponseBodyModule self = new HotelCityCodeListResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelCityCodeListResponseBodyModule setCitys(java.util.List<HotelCityCodeListResponseBodyModuleCitys> citys) {
            this.citys = citys;
            return this;
        }
        public java.util.List<HotelCityCodeListResponseBodyModuleCitys> getCitys() {
            return this.citys;
        }

        public HotelCityCodeListResponseBodyModule setProviceCode(String proviceCode) {
            this.proviceCode = proviceCode;
            return this;
        }
        public String getProviceCode() {
            return this.proviceCode;
        }

        public HotelCityCodeListResponseBodyModule setProvinceName(String provinceName) {
            this.provinceName = provinceName;
            return this;
        }
        public String getProvinceName() {
            return this.provinceName;
        }

    }

}

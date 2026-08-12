// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelSearchCityPageResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GlobalHotelSearchCityPageResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>CityCodeRequired</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>City code cannot be empty</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>TraceId</p>
     * 
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static GlobalHotelSearchCityPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelSearchCityPageResponseBody self = new GlobalHotelSearchCityPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalHotelSearchCityPageResponseBody setData(GlobalHotelSearchCityPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GlobalHotelSearchCityPageResponseBodyData getData() {
        return this.data;
    }

    public GlobalHotelSearchCityPageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GlobalHotelSearchCityPageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GlobalHotelSearchCityPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalHotelSearchCityPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GlobalHotelSearchCityPageResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class GlobalHotelSearchCityPageResponseBodyDataCities extends TeaModel {
        /**
         * <p>The Chinese name.</p>
         * 
         * <strong>example:</strong>
         * <p>北京市</p>
         */
        @NameInMap("CnName")
        public String cnName;

        /**
         * <p>The city code.</p>
         * 
         * <strong>example:</strong>
         * <p>110100</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The country code.</p>
         * 
         * <strong>example:</strong>
         * <p>156</p>
         */
        @NameInMap("Country")
        public Integer country;

        /**
         * <p>The country code (ISO 3166-1 alpha-2).</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <p>The English name.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("EnName")
        public String enName;

        /**
         * <p>The administrative level.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <p>The parent city code.</p>
         * 
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("ParentCode")
        public Integer parentCode;

        /**
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Region")
        public Integer region;

        public static GlobalHotelSearchCityPageResponseBodyDataCities build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelSearchCityPageResponseBodyDataCities self = new GlobalHotelSearchCityPageResponseBodyDataCities();
            return TeaModel.build(map, self);
        }

        public GlobalHotelSearchCityPageResponseBodyDataCities setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public GlobalHotelSearchCityPageResponseBodyDataCities setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GlobalHotelSearchCityPageResponseBodyDataCities setCountry(Integer country) {
            this.country = country;
            return this;
        }
        public Integer getCountry() {
            return this.country;
        }

        public GlobalHotelSearchCityPageResponseBodyDataCities setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public GlobalHotelSearchCityPageResponseBodyDataCities setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public GlobalHotelSearchCityPageResponseBodyDataCities setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GlobalHotelSearchCityPageResponseBodyDataCities setParentCode(Integer parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public Integer getParentCode() {
            return this.parentCode;
        }

        public GlobalHotelSearchCityPageResponseBodyDataCities setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

    }

    public static class GlobalHotelSearchCityPageResponseBodyData extends TeaModel {
        /**
         * <p>The list of cities.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Cities")
        public java.util.List<GlobalHotelSearchCityPageResponseBodyDataCities> cities;

        /**
         * <p>Indicates whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GlobalHotelSearchCityPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GlobalHotelSearchCityPageResponseBodyData self = new GlobalHotelSearchCityPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GlobalHotelSearchCityPageResponseBodyData setCities(java.util.List<GlobalHotelSearchCityPageResponseBodyDataCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<GlobalHotelSearchCityPageResponseBodyDataCities> getCities() {
            return this.cities;
        }

        public GlobalHotelSearchCityPageResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public GlobalHotelSearchCityPageResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}

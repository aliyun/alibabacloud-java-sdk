// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchCityPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public SearchCityPageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CityCodeRequired</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>城市编码不能为空</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>TraceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static SearchCityPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCityPageResponseBody self = new SearchCityPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCityPageResponseBody setData(SearchCityPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchCityPageResponseBodyData getData() {
        return this.data;
    }

    public SearchCityPageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchCityPageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SearchCityPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCityPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchCityPageResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class SearchCityPageResponseBodyDataCities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>北京市</p>
         */
        @NameInMap("CnName")
        public String cnName;

        /**
         * <strong>example:</strong>
         * <p>110100</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>156</p>
         */
        @NameInMap("Country")
        public Integer country;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("CountryCode")
        public String countryCode;

        /**
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("EnName")
        public String enName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Level")
        public Integer level;

        /**
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("ParentCode")
        public Integer parentCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Region")
        public Integer region;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static SearchCityPageResponseBodyDataCities build(java.util.Map<String, ?> map) throws Exception {
            SearchCityPageResponseBodyDataCities self = new SearchCityPageResponseBodyDataCities();
            return TeaModel.build(map, self);
        }

        public SearchCityPageResponseBodyDataCities setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public SearchCityPageResponseBodyDataCities setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public SearchCityPageResponseBodyDataCities setCountry(Integer country) {
            this.country = country;
            return this;
        }
        public Integer getCountry() {
            return this.country;
        }

        public SearchCityPageResponseBodyDataCities setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public SearchCityPageResponseBodyDataCities setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public SearchCityPageResponseBodyDataCities setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public SearchCityPageResponseBodyDataCities setParentCode(Integer parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public Integer getParentCode() {
            return this.parentCode;
        }

        public SearchCityPageResponseBodyDataCities setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

        public SearchCityPageResponseBodyDataCities setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class SearchCityPageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Cities")
        public java.util.List<SearchCityPageResponseBodyDataCities> cities;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasNext")
        public Boolean hasNext;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static SearchCityPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchCityPageResponseBodyData self = new SearchCityPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchCityPageResponseBodyData setCities(java.util.List<SearchCityPageResponseBodyDataCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<SearchCityPageResponseBodyDataCities> getCities() {
            return this.cities;
        }

        public SearchCityPageResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public SearchCityPageResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}

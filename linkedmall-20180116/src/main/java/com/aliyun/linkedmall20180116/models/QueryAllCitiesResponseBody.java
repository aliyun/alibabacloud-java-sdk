// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCitiesResponseBody extends TeaModel {
    @NameInMap("Cities")
    public QueryAllCitiesResponseBodyCities cities;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>79C01D47-3C44-57D9-BC99-1B33F7ED14B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>1004</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAllCitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCitiesResponseBody self = new QueryAllCitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllCitiesResponseBody setCities(QueryAllCitiesResponseBodyCities cities) {
        this.cities = cities;
        return this;
    }
    public QueryAllCitiesResponseBodyCities getCities() {
        return this.cities;
    }

    public QueryAllCitiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAllCitiesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryAllCitiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllCitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllCitiesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryAllCitiesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryAllCitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAllCitiesResponseBodyCitiesCity extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>110100</p>
         */
        @NameInMap("CityCode")
        public Long cityCode;

        /**
         * <strong>example:</strong>
         * <p>424</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        /**
         * <strong>example:</strong>
         * <p>beijing</p>
         */
        @NameInMap("PinYin")
        public String pinYin;

        public static QueryAllCitiesResponseBodyCitiesCity build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCitiesResponseBodyCitiesCity self = new QueryAllCitiesResponseBodyCitiesCity();
            return TeaModel.build(map, self);
        }

        public QueryAllCitiesResponseBodyCitiesCity setCityCode(Long cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Long getCityCode() {
            return this.cityCode;
        }

        public QueryAllCitiesResponseBodyCitiesCity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAllCitiesResponseBodyCitiesCity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAllCitiesResponseBodyCitiesCity setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryAllCitiesResponseBodyCitiesCity setPinYin(String pinYin) {
            this.pinYin = pinYin;
            return this;
        }
        public String getPinYin() {
            return this.pinYin;
        }

    }

    public static class QueryAllCitiesResponseBodyCities extends TeaModel {
        @NameInMap("City")
        public java.util.List<QueryAllCitiesResponseBodyCitiesCity> city;

        public static QueryAllCitiesResponseBodyCities build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCitiesResponseBodyCities self = new QueryAllCitiesResponseBodyCities();
            return TeaModel.build(map, self);
        }

        public QueryAllCitiesResponseBodyCities setCity(java.util.List<QueryAllCitiesResponseBodyCitiesCity> city) {
            this.city = city;
            return this;
        }
        public java.util.List<QueryAllCitiesResponseBodyCitiesCity> getCity() {
            return this.city;
        }

    }

}

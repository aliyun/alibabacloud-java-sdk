// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCitiesResponseBody extends TeaModel {
    @NameInMap("Cities")
    public QueryAllCitiesResponseBodyCities cities;

    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

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
        @NameInMap("CityCode")
        public Long cityCode;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

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

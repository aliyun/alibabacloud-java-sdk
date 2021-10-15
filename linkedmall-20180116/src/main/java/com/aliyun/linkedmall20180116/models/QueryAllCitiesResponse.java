// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCitiesResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Cities")
    @Validation(required = true)
    public QueryAllCitiesResponseCities cities;

    public static QueryAllCitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCitiesResponse self = new QueryAllCitiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllCitiesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAllCitiesResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryAllCitiesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllCitiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllCitiesResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryAllCitiesResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryAllCitiesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAllCitiesResponse setCities(QueryAllCitiesResponseCities cities) {
        this.cities = cities;
        return this;
    }
    public QueryAllCitiesResponseCities getCities() {
        return this.cities;
    }

    public static class QueryAllCitiesResponseCitiesCity extends TeaModel {
        @NameInMap("PinYin")
        @Validation(required = true)
        public String pinYin;

        @NameInMap("CityCode")
        @Validation(required = true)
        public Long cityCode;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        public static QueryAllCitiesResponseCitiesCity build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCitiesResponseCitiesCity self = new QueryAllCitiesResponseCitiesCity();
            return TeaModel.build(map, self);
        }

        public QueryAllCitiesResponseCitiesCity setPinYin(String pinYin) {
            this.pinYin = pinYin;
            return this;
        }
        public String getPinYin() {
            return this.pinYin;
        }

        public QueryAllCitiesResponseCitiesCity setCityCode(Long cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public Long getCityCode() {
            return this.cityCode;
        }

        public QueryAllCitiesResponseCitiesCity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAllCitiesResponseCitiesCity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAllCitiesResponseCitiesCity setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class QueryAllCitiesResponseCities extends TeaModel {
        @NameInMap("City")
        @Validation(required = true)
        public java.util.List<QueryAllCitiesResponseCitiesCity> city;

        public static QueryAllCitiesResponseCities build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCitiesResponseCities self = new QueryAllCitiesResponseCities();
            return TeaModel.build(map, self);
        }

        public QueryAllCitiesResponseCities setCity(java.util.List<QueryAllCitiesResponseCitiesCity> city) {
            this.city = city;
            return this;
        }
        public java.util.List<QueryAllCitiesResponseCitiesCity> getCity() {
            return this.city;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCinemasResponseBody extends TeaModel {
    @NameInMap("Cinemas")
    public QueryAllCinemasResponseBodyCinemas cinemas;

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

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryAllCinemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCinemasResponseBody self = new QueryAllCinemasResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAllCinemasResponseBody setCinemas(QueryAllCinemasResponseBodyCinemas cinemas) {
        this.cinemas = cinemas;
        return this;
    }
    public QueryAllCinemasResponseBodyCinemas getCinemas() {
        return this.cinemas;
    }

    public QueryAllCinemasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAllCinemasResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryAllCinemasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllCinemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllCinemasResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryAllCinemasResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryAllCinemasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAllCinemasResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryAllCinemasResponseBodyCinemasCinema extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("CinemaName")
        public String cinemaName;

        @NameInMap("CityId")
        public Long cityId;

        @NameInMap("CityName")
        public String cityName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("ScheduleCloseTime")
        public Long scheduleCloseTime;

        @NameInMap("StandardId")
        public String standardId;

        public static QueryAllCinemasResponseBodyCinemasCinema build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCinemasResponseBodyCinemasCinema self = new QueryAllCinemasResponseBodyCinemasCinema();
            return TeaModel.build(map, self);
        }

        public QueryAllCinemasResponseBodyCinemasCinema setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setCinemaName(String cinemaName) {
            this.cinemaName = cinemaName;
            return this;
        }
        public String getCinemaName() {
            return this.cinemaName;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setCityId(Long cityId) {
            this.cityId = cityId;
            return this;
        }
        public Long getCityId() {
            return this.cityId;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setScheduleCloseTime(Long scheduleCloseTime) {
            this.scheduleCloseTime = scheduleCloseTime;
            return this;
        }
        public Long getScheduleCloseTime() {
            return this.scheduleCloseTime;
        }

        public QueryAllCinemasResponseBodyCinemasCinema setStandardId(String standardId) {
            this.standardId = standardId;
            return this;
        }
        public String getStandardId() {
            return this.standardId;
        }

    }

    public static class QueryAllCinemasResponseBodyCinemas extends TeaModel {
        @NameInMap("Cinema")
        public java.util.List<QueryAllCinemasResponseBodyCinemasCinema> cinema;

        public static QueryAllCinemasResponseBodyCinemas build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCinemasResponseBodyCinemas self = new QueryAllCinemasResponseBodyCinemas();
            return TeaModel.build(map, self);
        }

        public QueryAllCinemasResponseBodyCinemas setCinema(java.util.List<QueryAllCinemasResponseBodyCinemasCinema> cinema) {
            this.cinema = cinema;
            return this;
        }
        public java.util.List<QueryAllCinemasResponseBodyCinemasCinema> getCinema() {
            return this.cinema;
        }

    }

}

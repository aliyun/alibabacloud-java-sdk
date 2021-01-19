// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCinemasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Cinemas")
    @Validation(required = true)
    public QueryAllCinemasResponseCinemas cinemas;

    public static QueryAllCinemasResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCinemasResponse self = new QueryAllCinemasResponse();
        return TeaModel.build(map, self);
    }

    public QueryAllCinemasResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAllCinemasResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAllCinemasResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAllCinemasResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryAllCinemasResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryAllCinemasResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryAllCinemasResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAllCinemasResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAllCinemasResponse setCinemas(QueryAllCinemasResponseCinemas cinemas) {
        this.cinemas = cinemas;
        return this;
    }
    public QueryAllCinemasResponseCinemas getCinemas() {
        return this.cinemas;
    }

    public static class QueryAllCinemasResponseCinemasCinema extends TeaModel {
        @NameInMap("CityId")
        @Validation(required = true)
        public Long cityId;

        @NameInMap("CityName")
        @Validation(required = true)
        public String cityName;

        @NameInMap("ScheduleCloseTime")
        @Validation(required = true)
        public Long scheduleCloseTime;

        @NameInMap("Latitude")
        @Validation(required = true)
        public String latitude;

        @NameInMap("Longitude")
        @Validation(required = true)
        public String longitude;

        @NameInMap("CinemaName")
        @Validation(required = true)
        public String cinemaName;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Phone")
        @Validation(required = true)
        public String phone;

        @NameInMap("StandardId")
        @Validation(required = true)
        public String standardId;

        public static QueryAllCinemasResponseCinemasCinema build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCinemasResponseCinemasCinema self = new QueryAllCinemasResponseCinemasCinema();
            return TeaModel.build(map, self);
        }

        public QueryAllCinemasResponseCinemasCinema setCityId(Long cityId) {
            this.cityId = cityId;
            return this;
        }
        public Long getCityId() {
            return this.cityId;
        }

        public QueryAllCinemasResponseCinemasCinema setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public QueryAllCinemasResponseCinemasCinema setScheduleCloseTime(Long scheduleCloseTime) {
            this.scheduleCloseTime = scheduleCloseTime;
            return this;
        }
        public Long getScheduleCloseTime() {
            return this.scheduleCloseTime;
        }

        public QueryAllCinemasResponseCinemasCinema setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public QueryAllCinemasResponseCinemasCinema setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public QueryAllCinemasResponseCinemasCinema setCinemaName(String cinemaName) {
            this.cinemaName = cinemaName;
            return this;
        }
        public String getCinemaName() {
            return this.cinemaName;
        }

        public QueryAllCinemasResponseCinemasCinema setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryAllCinemasResponseCinemasCinema setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryAllCinemasResponseCinemasCinema setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryAllCinemasResponseCinemasCinema setStandardId(String standardId) {
            this.standardId = standardId;
            return this;
        }
        public String getStandardId() {
            return this.standardId;
        }

    }

    public static class QueryAllCinemasResponseCinemas extends TeaModel {
        @NameInMap("Cinema")
        @Validation(required = true)
        public java.util.List<QueryAllCinemasResponseCinemasCinema> cinema;

        public static QueryAllCinemasResponseCinemas build(java.util.Map<String, ?> map) throws Exception {
            QueryAllCinemasResponseCinemas self = new QueryAllCinemasResponseCinemas();
            return TeaModel.build(map, self);
        }

        public QueryAllCinemasResponseCinemas setCinema(java.util.List<QueryAllCinemasResponseCinemasCinema> cinema) {
            this.cinema = cinema;
            return this;
        }
        public java.util.List<QueryAllCinemasResponseCinemasCinema> getCinema() {
            return this.cinema;
        }

    }

}

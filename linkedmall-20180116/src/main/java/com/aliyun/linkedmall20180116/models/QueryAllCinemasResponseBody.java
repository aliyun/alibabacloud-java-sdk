// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCinemasResponseBody extends TeaModel {
    @NameInMap("Cinemas")
    public QueryAllCinemasResponseBodyCinemas cinemas;

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
     * <p>6103AD7B-21C2-523B-89D0-579DA58D08E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>205</p>
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

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("CinemaName")
        public String cinemaName;

        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("CityId")
        public Long cityId;

        @NameInMap("CityName")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>153</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Latitude")
        public String latitude;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Longitude")
        public String longitude;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("ScheduleCloseTime")
        public Long scheduleCloseTime;

        /**
         * <strong>example:</strong>
         * <p>42112601</p>
         */
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

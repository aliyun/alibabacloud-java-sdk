// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSchedulesResponseBody extends TeaModel {
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
     * <p>1718921E-C8D4-55E1-B8D4-114AE537C1B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schedules")
    public QueryMovieSchedulesResponseBodySchedules schedules;

    /**
     * <strong>example:</strong>
     * <p>207</p>
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

    public static QueryMovieSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSchedulesResponseBody self = new QueryMovieSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMovieSchedulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieSchedulesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieSchedulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieSchedulesResponseBody setSchedules(QueryMovieSchedulesResponseBodySchedules schedules) {
        this.schedules = schedules;
        return this;
    }
    public QueryMovieSchedulesResponseBodySchedules getSchedules() {
        return this.schedules;
    }

    public QueryMovieSchedulesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieSchedulesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieSchedulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMovieSchedulesResponseBodySchedulesSchedule extends TeaModel {
        @NameInMap("CinemaId")
        public Long cinemaId;

        @NameInMap("HallName")
        public String hallName;

        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsExpired")
        public Boolean isExpired;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MaxCanBuy")
        public Long maxCanBuy;

        @NameInMap("MovieId")
        public Long movieId;

        @NameInMap("MovieVersion")
        public String movieVersion;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Price")
        public Long price;

        @NameInMap("ReleaseDate")
        public String releaseDate;

        @NameInMap("ScheduleArea")
        public String scheduleArea;

        @NameInMap("SectionId")
        public String sectionId;

        @NameInMap("ServiceFee")
        public Long serviceFee;

        /**
         * <strong>example:</strong>
         * <p>2022-04-01 12:00:00</p>
         */
        @NameInMap("SessionEndingTime")
        public String sessionEndingTime;

        /**
         * <strong>example:</strong>
         * <p>2022-04-01 10:00:00</p>
         */
        @NameInMap("SessionStartingTime")
        public String sessionStartingTime;

        public static QueryMovieSchedulesResponseBodySchedulesSchedule build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSchedulesResponseBodySchedulesSchedule self = new QueryMovieSchedulesResponseBodySchedulesSchedule();
            return TeaModel.build(map, self);
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setCinemaId(Long cinemaId) {
            this.cinemaId = cinemaId;
            return this;
        }
        public Long getCinemaId() {
            return this.cinemaId;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setHallName(String hallName) {
            this.hallName = hallName;
            return this;
        }
        public String getHallName() {
            return this.hallName;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setMaxCanBuy(Long maxCanBuy) {
            this.maxCanBuy = maxCanBuy;
            return this;
        }
        public Long getMaxCanBuy() {
            return this.maxCanBuy;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setMovieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }
        public Long getMovieId() {
            return this.movieId;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setScheduleArea(String scheduleArea) {
            this.scheduleArea = scheduleArea;
            return this;
        }
        public String getScheduleArea() {
            return this.scheduleArea;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setSessionEndingTime(String sessionEndingTime) {
            this.sessionEndingTime = sessionEndingTime;
            return this;
        }
        public String getSessionEndingTime() {
            return this.sessionEndingTime;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setSessionStartingTime(String sessionStartingTime) {
            this.sessionStartingTime = sessionStartingTime;
            return this;
        }
        public String getSessionStartingTime() {
            return this.sessionStartingTime;
        }

    }

    public static class QueryMovieSchedulesResponseBodySchedules extends TeaModel {
        @NameInMap("Schedule")
        public java.util.List<QueryMovieSchedulesResponseBodySchedulesSchedule> schedule;

        public static QueryMovieSchedulesResponseBodySchedules build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSchedulesResponseBodySchedules self = new QueryMovieSchedulesResponseBodySchedules();
            return TeaModel.build(map, self);
        }

        public QueryMovieSchedulesResponseBodySchedules setSchedule(java.util.List<QueryMovieSchedulesResponseBodySchedulesSchedule> schedule) {
            this.schedule = schedule;
            return this;
        }
        public java.util.List<QueryMovieSchedulesResponseBodySchedulesSchedule> getSchedule() {
            return this.schedule;
        }

    }

}

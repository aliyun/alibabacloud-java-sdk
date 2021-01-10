// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSchedulesResponseBody extends TeaModel {
    @NameInMap("Schedules")
    public QueryMovieSchedulesResponseBodySchedules schedules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMovieSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSchedulesResponseBody self = new QueryMovieSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMovieSchedulesResponseBody setSchedules(QueryMovieSchedulesResponseBodySchedules schedules) {
        this.schedules = schedules;
        return this;
    }
    public QueryMovieSchedulesResponseBodySchedules getSchedules() {
        return this.schedules;
    }

    public QueryMovieSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieSchedulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieSchedulesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieSchedulesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieSchedulesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieSchedulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieSchedulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMovieSchedulesResponseBodySchedulesSchedule extends TeaModel {
        @NameInMap("SessionEndingTime")
        public String sessionEndingTime;

        @NameInMap("MovieVersion")
        public String movieVersion;

        @NameInMap("MaxCanBuy")
        public Long maxCanBuy;

        @NameInMap("MovieId")
        public Long movieId;

        @NameInMap("ScheduleArea")
        public String scheduleArea;

        @NameInMap("HallName")
        public String hallName;

        @NameInMap("IsExpired")
        public Boolean isExpired;

        @NameInMap("SessionStartingTime")
        public String sessionStartingTime;

        @NameInMap("Price")
        public Long price;

        @NameInMap("ReleaseDate")
        public String releaseDate;

        @NameInMap("SectionId")
        public String sectionId;

        @NameInMap("CinemaId")
        public Long cinemaId;

        @NameInMap("ServiceFee")
        public Long serviceFee;

        @NameInMap("Id")
        public Long id;

        public static QueryMovieSchedulesResponseBodySchedulesSchedule build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSchedulesResponseBodySchedulesSchedule self = new QueryMovieSchedulesResponseBodySchedulesSchedule();
            return TeaModel.build(map, self);
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setSessionEndingTime(String sessionEndingTime) {
            this.sessionEndingTime = sessionEndingTime;
            return this;
        }
        public String getSessionEndingTime() {
            return this.sessionEndingTime;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
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

        public QueryMovieSchedulesResponseBodySchedulesSchedule setScheduleArea(String scheduleArea) {
            this.scheduleArea = scheduleArea;
            return this;
        }
        public String getScheduleArea() {
            return this.scheduleArea;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setHallName(String hallName) {
            this.hallName = hallName;
            return this;
        }
        public String getHallName() {
            return this.hallName;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setSessionStartingTime(String sessionStartingTime) {
            this.sessionStartingTime = sessionStartingTime;
            return this;
        }
        public String getSessionStartingTime() {
            return this.sessionStartingTime;
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

        public QueryMovieSchedulesResponseBodySchedulesSchedule setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setCinemaId(Long cinemaId) {
            this.cinemaId = cinemaId;
            return this;
        }
        public Long getCinemaId() {
            return this.cinemaId;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public QueryMovieSchedulesResponseBodySchedulesSchedule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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

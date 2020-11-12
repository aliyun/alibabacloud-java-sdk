// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSchedulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Schedules")
    @Validation(required = true)
    public QueryMovieSchedulesResponseSchedules schedules;

    public static QueryMovieSchedulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSchedulesResponse self = new QueryMovieSchedulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMovieSchedulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieSchedulesResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieSchedulesResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieSchedulesResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieSchedulesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieSchedulesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMovieSchedulesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieSchedulesResponse setSchedules(QueryMovieSchedulesResponseSchedules schedules) {
        this.schedules = schedules;
        return this;
    }
    public QueryMovieSchedulesResponseSchedules getSchedules() {
        return this.schedules;
    }

    public static class QueryMovieSchedulesResponseSchedulesSchedule extends TeaModel {
        @NameInMap("CinemaId")
        @Validation(required = true)
        public Long cinemaId;

        @NameInMap("SessionEndingTime")
        @Validation(required = true)
        public String sessionEndingTime;

        @NameInMap("HallName")
        @Validation(required = true)
        public String hallName;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("IsExpired")
        @Validation(required = true)
        public Boolean isExpired;

        @NameInMap("MaxCanBuy")
        @Validation(required = true)
        public Long maxCanBuy;

        @NameInMap("Price")
        @Validation(required = true)
        public Long price;

        @NameInMap("ScheduleArea")
        @Validation(required = true)
        public String scheduleArea;

        @NameInMap("SectionId")
        @Validation(required = true)
        public String sectionId;

        @NameInMap("ServiceFee")
        @Validation(required = true)
        public Long serviceFee;

        @NameInMap("ReleaseDate")
        @Validation(required = true)
        public String releaseDate;

        @NameInMap("MovieId")
        @Validation(required = true)
        public Long movieId;

        @NameInMap("SessionStartingTime")
        @Validation(required = true)
        public String sessionStartingTime;

        @NameInMap("MovieVersion")
        @Validation(required = true)
        public String movieVersion;

        public static QueryMovieSchedulesResponseSchedulesSchedule build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSchedulesResponseSchedulesSchedule self = new QueryMovieSchedulesResponseSchedulesSchedule();
            return TeaModel.build(map, self);
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setCinemaId(Long cinemaId) {
            this.cinemaId = cinemaId;
            return this;
        }
        public Long getCinemaId() {
            return this.cinemaId;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setSessionEndingTime(String sessionEndingTime) {
            this.sessionEndingTime = sessionEndingTime;
            return this;
        }
        public String getSessionEndingTime() {
            return this.sessionEndingTime;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setHallName(String hallName) {
            this.hallName = hallName;
            return this;
        }
        public String getHallName() {
            return this.hallName;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setMaxCanBuy(Long maxCanBuy) {
            this.maxCanBuy = maxCanBuy;
            return this;
        }
        public Long getMaxCanBuy() {
            return this.maxCanBuy;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setScheduleArea(String scheduleArea) {
            this.scheduleArea = scheduleArea;
            return this;
        }
        public String getScheduleArea() {
            return this.scheduleArea;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public String getReleaseDate() {
            return this.releaseDate;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setMovieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }
        public Long getMovieId() {
            return this.movieId;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setSessionStartingTime(String sessionStartingTime) {
            this.sessionStartingTime = sessionStartingTime;
            return this;
        }
        public String getSessionStartingTime() {
            return this.sessionStartingTime;
        }

        public QueryMovieSchedulesResponseSchedulesSchedule setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
        }

    }

    public static class QueryMovieSchedulesResponseSchedules extends TeaModel {
        @NameInMap("Schedule")
        @Validation(required = true)
        public java.util.List<QueryMovieSchedulesResponseSchedulesSchedule> schedule;

        public static QueryMovieSchedulesResponseSchedules build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieSchedulesResponseSchedules self = new QueryMovieSchedulesResponseSchedules();
            return TeaModel.build(map, self);
        }

        public QueryMovieSchedulesResponseSchedules setSchedule(java.util.List<QueryMovieSchedulesResponseSchedulesSchedule> schedule) {
            this.schedule = schedule;
            return this;
        }
        public java.util.List<QueryMovieSchedulesResponseSchedulesSchedule> getSchedule() {
            return this.schedule;
        }

    }

}

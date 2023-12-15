// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSchedulesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schedules")
    public java.util.List<TaobaoFilmGetSchedulesResponseBodySchedules> schedules;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static TaobaoFilmGetSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSchedulesResponseBody self = new TaobaoFilmGetSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSchedulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmGetSchedulesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmGetSchedulesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmGetSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmGetSchedulesResponseBody setSchedules(java.util.List<TaobaoFilmGetSchedulesResponseBodySchedules> schedules) {
        this.schedules = schedules;
        return this;
    }
    public java.util.List<TaobaoFilmGetSchedulesResponseBodySchedules> getSchedules() {
        return this.schedules;
    }

    public TaobaoFilmGetSchedulesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmGetSchedulesResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public static class TaobaoFilmGetSchedulesResponseBodySchedules extends TeaModel {
        @NameInMap("CinemaId")
        public Long cinemaId;

        @NameInMap("CloseTime")
        public String closeTime;

        @NameInMap("HallId")
        public String hallId;

        @NameInMap("HallName")
        public String hallName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsExpired")
        public Boolean isExpired;

        @NameInMap("MaxCanBuy")
        public Long maxCanBuy;

        @NameInMap("Price")
        public Long price;

        @NameInMap("ScheduleArea")
        public String scheduleArea;

        @NameInMap("SectionId")
        public String sectionId;

        @NameInMap("ServiceFee")
        public Long serviceFee;

        @NameInMap("ShowDate")
        public String showDate;

        @NameInMap("ShowId")
        public Long showId;

        @NameInMap("ShowTime")
        public String showTime;

        @NameInMap("ShowVersion")
        public String showVersion;

        public static TaobaoFilmGetSchedulesResponseBodySchedules build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmGetSchedulesResponseBodySchedules self = new TaobaoFilmGetSchedulesResponseBodySchedules();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setCinemaId(Long cinemaId) {
            this.cinemaId = cinemaId;
            return this;
        }
        public Long getCinemaId() {
            return this.cinemaId;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setCloseTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }
        public String getCloseTime() {
            return this.closeTime;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setHallId(String hallId) {
            this.hallId = hallId;
            return this;
        }
        public String getHallId() {
            return this.hallId;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setHallName(String hallName) {
            this.hallName = hallName;
            return this;
        }
        public String getHallName() {
            return this.hallName;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setMaxCanBuy(Long maxCanBuy) {
            this.maxCanBuy = maxCanBuy;
            return this;
        }
        public Long getMaxCanBuy() {
            return this.maxCanBuy;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setScheduleArea(String scheduleArea) {
            this.scheduleArea = scheduleArea;
            return this;
        }
        public String getScheduleArea() {
            return this.scheduleArea;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setSectionId(String sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public String getSectionId() {
            return this.sectionId;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setShowDate(String showDate) {
            this.showDate = showDate;
            return this;
        }
        public String getShowDate() {
            return this.showDate;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setShowId(Long showId) {
            this.showId = showId;
            return this;
        }
        public Long getShowId() {
            return this.showId;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setShowTime(String showTime) {
            this.showTime = showTime;
            return this;
        }
        public String getShowTime() {
            return this.showTime;
        }

        public TaobaoFilmGetSchedulesResponseBodySchedules setShowVersion(String showVersion) {
            this.showVersion = showVersion;
            return this;
        }
        public String getShowVersion() {
            return this.showVersion;
        }

    }

}

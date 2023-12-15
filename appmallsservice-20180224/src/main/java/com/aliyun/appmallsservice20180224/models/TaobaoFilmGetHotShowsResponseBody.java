// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetHotShowsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Shows")
    public java.util.List<TaobaoFilmGetHotShowsResponseBodyShows> shows;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static TaobaoFilmGetHotShowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetHotShowsResponseBody self = new TaobaoFilmGetHotShowsResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetHotShowsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmGetHotShowsResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmGetHotShowsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmGetHotShowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmGetHotShowsResponseBody setShows(java.util.List<TaobaoFilmGetHotShowsResponseBodyShows> shows) {
        this.shows = shows;
        return this;
    }
    public java.util.List<TaobaoFilmGetHotShowsResponseBodyShows> getShows() {
        return this.shows;
    }

    public TaobaoFilmGetHotShowsResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmGetHotShowsResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public static class TaobaoFilmGetHotShowsResponseBodyShows extends TeaModel {
        @NameInMap("BackgroundPicture")
        public String backgroundPicture;

        @NameInMap("Country")
        public String country;

        @NameInMap("Description")
        public String description;

        @NameInMap("Director")
        public String director;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Highlight")
        public String highlight;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Language")
        public String language;

        @NameInMap("LeadingRole")
        public String leadingRole;

        @NameInMap("OpenDay")
        public String openDay;

        @NameInMap("OpenTime")
        public String openTime;

        @NameInMap("Poster")
        public String poster;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("ShowMark")
        public String showMark;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("ShowNameEn")
        public String showNameEn;

        @NameInMap("ShowVersionList")
        public java.util.List<String> showVersionList;

        @NameInMap("TrailerList")
        public java.util.List<String> trailerList;

        @NameInMap("Type")
        public String type;

        public static TaobaoFilmGetHotShowsResponseBodyShows build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmGetHotShowsResponseBodyShows self = new TaobaoFilmGetHotShowsResponseBodyShows();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setBackgroundPicture(String backgroundPicture) {
            this.backgroundPicture = backgroundPicture;
            return this;
        }
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setDirector(String director) {
            this.director = director;
            return this;
        }
        public String getDirector() {
            return this.director;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }
        public String getHighlight() {
            return this.highlight;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setLeadingRole(String leadingRole) {
            this.leadingRole = leadingRole;
            return this;
        }
        public String getLeadingRole() {
            return this.leadingRole;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setOpenDay(String openDay) {
            this.openDay = openDay;
            return this;
        }
        public String getOpenDay() {
            return this.openDay;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setPoster(String poster) {
            this.poster = poster;
            return this;
        }
        public String getPoster() {
            return this.poster;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setShowMark(String showMark) {
            this.showMark = showMark;
            return this;
        }
        public String getShowMark() {
            return this.showMark;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setShowNameEn(String showNameEn) {
            this.showNameEn = showNameEn;
            return this;
        }
        public String getShowNameEn() {
            return this.showNameEn;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setShowVersionList(java.util.List<String> showVersionList) {
            this.showVersionList = showVersionList;
            return this;
        }
        public java.util.List<String> getShowVersionList() {
            return this.showVersionList;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setTrailerList(java.util.List<String> trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public java.util.List<String> getTrailerList() {
            return this.trailerList;
        }

        public TaobaoFilmGetHotShowsResponseBodyShows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

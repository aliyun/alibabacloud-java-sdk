// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSoonShowsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Shows")
    public java.util.List<TaobaoFilmGetSoonShowsResponseBodyShows> shows;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static TaobaoFilmGetSoonShowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSoonShowsResponseBody self = new TaobaoFilmGetSoonShowsResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSoonShowsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmGetSoonShowsResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmGetSoonShowsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmGetSoonShowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmGetSoonShowsResponseBody setShows(java.util.List<TaobaoFilmGetSoonShowsResponseBodyShows> shows) {
        this.shows = shows;
        return this;
    }
    public java.util.List<TaobaoFilmGetSoonShowsResponseBodyShows> getShows() {
        return this.shows;
    }

    public TaobaoFilmGetSoonShowsResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmGetSoonShowsResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public static class TaobaoFilmGetSoonShowsResponseBodyShows extends TeaModel {
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

        public static TaobaoFilmGetSoonShowsResponseBodyShows build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmGetSoonShowsResponseBodyShows self = new TaobaoFilmGetSoonShowsResponseBodyShows();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setBackgroundPicture(String backgroundPicture) {
            this.backgroundPicture = backgroundPicture;
            return this;
        }
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setDirector(String director) {
            this.director = director;
            return this;
        }
        public String getDirector() {
            return this.director;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }
        public String getHighlight() {
            return this.highlight;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setLeadingRole(String leadingRole) {
            this.leadingRole = leadingRole;
            return this;
        }
        public String getLeadingRole() {
            return this.leadingRole;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setOpenDay(String openDay) {
            this.openDay = openDay;
            return this;
        }
        public String getOpenDay() {
            return this.openDay;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setPoster(String poster) {
            this.poster = poster;
            return this;
        }
        public String getPoster() {
            return this.poster;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setShowMark(String showMark) {
            this.showMark = showMark;
            return this;
        }
        public String getShowMark() {
            return this.showMark;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setShowNameEn(String showNameEn) {
            this.showNameEn = showNameEn;
            return this;
        }
        public String getShowNameEn() {
            return this.showNameEn;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setShowVersionList(java.util.List<String> showVersionList) {
            this.showVersionList = showVersionList;
            return this;
        }
        public java.util.List<String> getShowVersionList() {
            return this.showVersionList;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setTrailerList(java.util.List<String> trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public java.util.List<String> getTrailerList() {
            return this.trailerList;
        }

        public TaobaoFilmGetSoonShowsResponseBodyShows setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

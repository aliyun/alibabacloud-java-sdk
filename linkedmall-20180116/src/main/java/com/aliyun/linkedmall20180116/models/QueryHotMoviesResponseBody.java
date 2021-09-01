// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryHotMoviesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Movies")
    public QueryHotMoviesResponseBodyMovies movies;

    public static QueryHotMoviesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotMoviesResponseBody self = new QueryHotMoviesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotMoviesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotMoviesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryHotMoviesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryHotMoviesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryHotMoviesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotMoviesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryHotMoviesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryHotMoviesResponseBody setMovies(QueryHotMoviesResponseBodyMovies movies) {
        this.movies = movies;
        return this;
    }
    public QueryHotMoviesResponseBodyMovies getMovies() {
        return this.movies;
    }

    public static class QueryHotMoviesResponseBodyMoviesMovieMovieTypeList extends TeaModel {
        @NameInMap("MovieTypeList")
        public java.util.List<String> movieTypeList;

        public static QueryHotMoviesResponseBodyMoviesMovieMovieTypeList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseBodyMoviesMovieMovieTypeList self = new QueryHotMoviesResponseBodyMoviesMovieMovieTypeList();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseBodyMoviesMovieMovieTypeList setMovieTypeList(java.util.List<String> movieTypeList) {
            this.movieTypeList = movieTypeList;
            return this;
        }
        public java.util.List<String> getMovieTypeList() {
            return this.movieTypeList;
        }

    }

    public static class QueryHotMoviesResponseBodyMoviesMovieTrailerList extends TeaModel {
        @NameInMap("TrailerList")
        public java.util.List<String> trailerList;

        public static QueryHotMoviesResponseBodyMoviesMovieTrailerList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseBodyMoviesMovieTrailerList self = new QueryHotMoviesResponseBodyMoviesMovieTrailerList();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseBodyMoviesMovieTrailerList setTrailerList(java.util.List<String> trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public java.util.List<String> getTrailerList() {
            return this.trailerList;
        }

    }

    public static class QueryHotMoviesResponseBodyMoviesMovie extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MovieVersion")
        public String movieVersion;

        @NameInMap("BackgroundPicture")
        public String backgroundPicture;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("OpenDay")
        public String openDay;

        @NameInMap("Highlight")
        public String highlight;

        @NameInMap("Language")
        public String language;

        @NameInMap("OpenTime")
        public String openTime;

        @NameInMap("Director")
        public String director;

        @NameInMap("Poster")
        public String poster;

        @NameInMap("MovieName")
        public String movieName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Country")
        public String country;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("MovieNameEn")
        public String movieNameEn;

        @NameInMap("LeadingRole")
        public String leadingRole;

        @NameInMap("Id")
        public Long id;

        @NameInMap("MovieTypeList")
        public QueryHotMoviesResponseBodyMoviesMovieMovieTypeList movieTypeList;

        @NameInMap("TrailerList")
        public QueryHotMoviesResponseBodyMoviesMovieTrailerList trailerList;

        public static QueryHotMoviesResponseBodyMoviesMovie build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseBodyMoviesMovie self = new QueryHotMoviesResponseBodyMoviesMovie();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseBodyMoviesMovie setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setBackgroundPicture(String backgroundPicture) {
            this.backgroundPicture = backgroundPicture;
            return this;
        }
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setOpenDay(String openDay) {
            this.openDay = openDay;
            return this;
        }
        public String getOpenDay() {
            return this.openDay;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }
        public String getHighlight() {
            return this.highlight;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setDirector(String director) {
            this.director = director;
            return this;
        }
        public String getDirector() {
            return this.director;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setPoster(String poster) {
            this.poster = poster;
            return this;
        }
        public String getPoster() {
            return this.poster;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }
        public String getMovieName() {
            return this.movieName;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setMovieNameEn(String movieNameEn) {
            this.movieNameEn = movieNameEn;
            return this;
        }
        public String getMovieNameEn() {
            return this.movieNameEn;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setLeadingRole(String leadingRole) {
            this.leadingRole = leadingRole;
            return this;
        }
        public String getLeadingRole() {
            return this.leadingRole;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setMovieTypeList(QueryHotMoviesResponseBodyMoviesMovieMovieTypeList movieTypeList) {
            this.movieTypeList = movieTypeList;
            return this;
        }
        public QueryHotMoviesResponseBodyMoviesMovieMovieTypeList getMovieTypeList() {
            return this.movieTypeList;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setTrailerList(QueryHotMoviesResponseBodyMoviesMovieTrailerList trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public QueryHotMoviesResponseBodyMoviesMovieTrailerList getTrailerList() {
            return this.trailerList;
        }

    }

    public static class QueryHotMoviesResponseBodyMovies extends TeaModel {
        @NameInMap("Movie")
        public java.util.List<QueryHotMoviesResponseBodyMoviesMovie> movie;

        public static QueryHotMoviesResponseBodyMovies build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseBodyMovies self = new QueryHotMoviesResponseBodyMovies();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseBodyMovies setMovie(java.util.List<QueryHotMoviesResponseBodyMoviesMovie> movie) {
            this.movie = movie;
            return this;
        }
        public java.util.List<QueryHotMoviesResponseBodyMoviesMovie> getMovie() {
            return this.movie;
        }

    }

}

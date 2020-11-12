// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryHotMoviesResponse extends TeaModel {
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

    @NameInMap("Movies")
    @Validation(required = true)
    public QueryHotMoviesResponseMovies movies;

    public static QueryHotMoviesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotMoviesResponse self = new QueryHotMoviesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotMoviesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotMoviesResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryHotMoviesResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryHotMoviesResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryHotMoviesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryHotMoviesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryHotMoviesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotMoviesResponse setMovies(QueryHotMoviesResponseMovies movies) {
        this.movies = movies;
        return this;
    }
    public QueryHotMoviesResponseMovies getMovies() {
        return this.movies;
    }

    public static class QueryHotMoviesResponseMoviesMovieMovieTypeList extends TeaModel {
        // MovieTypeList
        @NameInMap("MovieTypeList")
        @Validation(required = true)
        public java.util.List<String> movieTypeList;

        public static QueryHotMoviesResponseMoviesMovieMovieTypeList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseMoviesMovieMovieTypeList self = new QueryHotMoviesResponseMoviesMovieMovieTypeList();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseMoviesMovieMovieTypeList setMovieTypeList(java.util.List<String> movieTypeList) {
            this.movieTypeList = movieTypeList;
            return this;
        }
        public java.util.List<String> getMovieTypeList() {
            return this.movieTypeList;
        }

    }

    public static class QueryHotMoviesResponseMoviesMovieTrailerList extends TeaModel {
        // TrailerList
        @NameInMap("TrailerList")
        @Validation(required = true)
        public java.util.List<String> trailerList;

        public static QueryHotMoviesResponseMoviesMovieTrailerList build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseMoviesMovieTrailerList self = new QueryHotMoviesResponseMoviesMovieTrailerList();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseMoviesMovieTrailerList setTrailerList(java.util.List<String> trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public java.util.List<String> getTrailerList() {
            return this.trailerList;
        }

    }

    public static class QueryHotMoviesResponseMoviesMovie extends TeaModel {
        @NameInMap("BackgroundPicture")
        @Validation(required = true)
        public String backgroundPicture;

        @NameInMap("Country")
        @Validation(required = true)
        public String country;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Director")
        @Validation(required = true)
        public String director;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

        @NameInMap("Highlight")
        @Validation(required = true)
        public String highlight;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Language")
        @Validation(required = true)
        public String language;

        @NameInMap("LeadingRole")
        @Validation(required = true)
        public String leadingRole;

        @NameInMap("OpenDay")
        @Validation(required = true)
        public String openDay;

        @NameInMap("OpenTime")
        @Validation(required = true)
        public String openTime;

        @NameInMap("Poster")
        @Validation(required = true)
        public String poster;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("MovieVersion")
        @Validation(required = true)
        public String movieVersion;

        @NameInMap("MovieName")
        @Validation(required = true)
        public String movieName;

        @NameInMap("MovieNameEn")
        @Validation(required = true)
        public String movieNameEn;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("MovieTypeList")
        @Validation(required = true)
        public QueryHotMoviesResponseMoviesMovieMovieTypeList movieTypeList;

        @NameInMap("TrailerList")
        @Validation(required = true)
        public QueryHotMoviesResponseMoviesMovieTrailerList trailerList;

        public static QueryHotMoviesResponseMoviesMovie build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseMoviesMovie self = new QueryHotMoviesResponseMoviesMovie();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseMoviesMovie setBackgroundPicture(String backgroundPicture) {
            this.backgroundPicture = backgroundPicture;
            return this;
        }
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        public QueryHotMoviesResponseMoviesMovie setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryHotMoviesResponseMoviesMovie setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHotMoviesResponseMoviesMovie setDirector(String director) {
            this.director = director;
            return this;
        }
        public String getDirector() {
            return this.director;
        }

        public QueryHotMoviesResponseMoviesMovie setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryHotMoviesResponseMoviesMovie setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }
        public String getHighlight() {
            return this.highlight;
        }

        public QueryHotMoviesResponseMoviesMovie setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryHotMoviesResponseMoviesMovie setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryHotMoviesResponseMoviesMovie setLeadingRole(String leadingRole) {
            this.leadingRole = leadingRole;
            return this;
        }
        public String getLeadingRole() {
            return this.leadingRole;
        }

        public QueryHotMoviesResponseMoviesMovie setOpenDay(String openDay) {
            this.openDay = openDay;
            return this;
        }
        public String getOpenDay() {
            return this.openDay;
        }

        public QueryHotMoviesResponseMoviesMovie setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public QueryHotMoviesResponseMoviesMovie setPoster(String poster) {
            this.poster = poster;
            return this;
        }
        public String getPoster() {
            return this.poster;
        }

        public QueryHotMoviesResponseMoviesMovie setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryHotMoviesResponseMoviesMovie setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
        }

        public QueryHotMoviesResponseMoviesMovie setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }
        public String getMovieName() {
            return this.movieName;
        }

        public QueryHotMoviesResponseMoviesMovie setMovieNameEn(String movieNameEn) {
            this.movieNameEn = movieNameEn;
            return this;
        }
        public String getMovieNameEn() {
            return this.movieNameEn;
        }

        public QueryHotMoviesResponseMoviesMovie setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHotMoviesResponseMoviesMovie setMovieTypeList(QueryHotMoviesResponseMoviesMovieMovieTypeList movieTypeList) {
            this.movieTypeList = movieTypeList;
            return this;
        }
        public QueryHotMoviesResponseMoviesMovieMovieTypeList getMovieTypeList() {
            return this.movieTypeList;
        }

        public QueryHotMoviesResponseMoviesMovie setTrailerList(QueryHotMoviesResponseMoviesMovieTrailerList trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public QueryHotMoviesResponseMoviesMovieTrailerList getTrailerList() {
            return this.trailerList;
        }

    }

    public static class QueryHotMoviesResponseMovies extends TeaModel {
        @NameInMap("Movie")
        @Validation(required = true)
        public java.util.List<QueryHotMoviesResponseMoviesMovie> movie;

        public static QueryHotMoviesResponseMovies build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseMovies self = new QueryHotMoviesResponseMovies();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseMovies setMovie(java.util.List<QueryHotMoviesResponseMoviesMovie> movie) {
            this.movie = movie;
            return this;
        }
        public java.util.List<QueryHotMoviesResponseMoviesMovie> getMovie() {
            return this.movie;
        }

    }

}

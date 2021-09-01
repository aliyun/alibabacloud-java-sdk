// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUpcomingMoviesResponseBody extends TeaModel {
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

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Movies")
    public QueryUpcomingMoviesResponseBodyMovies movies;

    public static QueryUpcomingMoviesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUpcomingMoviesResponseBody self = new QueryUpcomingMoviesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUpcomingMoviesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUpcomingMoviesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryUpcomingMoviesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryUpcomingMoviesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUpcomingMoviesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUpcomingMoviesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryUpcomingMoviesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUpcomingMoviesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryUpcomingMoviesResponseBody setMovies(QueryUpcomingMoviesResponseBodyMovies movies) {
        this.movies = movies;
        return this;
    }
    public QueryUpcomingMoviesResponseBodyMovies getMovies() {
        return this.movies;
    }

    public static class QueryUpcomingMoviesResponseBodyMoviesMovie extends TeaModel {
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

        @NameInMap("MovieTypeList")
        public String movieTypeList;

        @NameInMap("Language")
        public String language;

        @NameInMap("Director")
        public String director;

        @NameInMap("OpenTime")
        public String openTime;

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

        @NameInMap("TrailerList")
        public String trailerList;

        public static QueryUpcomingMoviesResponseBodyMoviesMovie build(java.util.Map<String, ?> map) throws Exception {
            QueryUpcomingMoviesResponseBodyMoviesMovie self = new QueryUpcomingMoviesResponseBodyMoviesMovie();
            return TeaModel.build(map, self);
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setBackgroundPicture(String backgroundPicture) {
            this.backgroundPicture = backgroundPicture;
            return this;
        }
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setOpenDay(String openDay) {
            this.openDay = openDay;
            return this;
        }
        public String getOpenDay() {
            return this.openDay;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }
        public String getHighlight() {
            return this.highlight;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setMovieTypeList(String movieTypeList) {
            this.movieTypeList = movieTypeList;
            return this;
        }
        public String getMovieTypeList() {
            return this.movieTypeList;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setDirector(String director) {
            this.director = director;
            return this;
        }
        public String getDirector() {
            return this.director;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setPoster(String poster) {
            this.poster = poster;
            return this;
        }
        public String getPoster() {
            return this.poster;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }
        public String getMovieName() {
            return this.movieName;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setMovieNameEn(String movieNameEn) {
            this.movieNameEn = movieNameEn;
            return this;
        }
        public String getMovieNameEn() {
            return this.movieNameEn;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setLeadingRole(String leadingRole) {
            this.leadingRole = leadingRole;
            return this;
        }
        public String getLeadingRole() {
            return this.leadingRole;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setTrailerList(String trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public String getTrailerList() {
            return this.trailerList;
        }

    }

    public static class QueryUpcomingMoviesResponseBodyMovies extends TeaModel {
        @NameInMap("Movie")
        public java.util.List<QueryUpcomingMoviesResponseBodyMoviesMovie> movie;

        public static QueryUpcomingMoviesResponseBodyMovies build(java.util.Map<String, ?> map) throws Exception {
            QueryUpcomingMoviesResponseBodyMovies self = new QueryUpcomingMoviesResponseBodyMovies();
            return TeaModel.build(map, self);
        }

        public QueryUpcomingMoviesResponseBodyMovies setMovie(java.util.List<QueryUpcomingMoviesResponseBodyMoviesMovie> movie) {
            this.movie = movie;
            return this;
        }
        public java.util.List<QueryUpcomingMoviesResponseBodyMoviesMovie> getMovie() {
            return this.movie;
        }

    }

}

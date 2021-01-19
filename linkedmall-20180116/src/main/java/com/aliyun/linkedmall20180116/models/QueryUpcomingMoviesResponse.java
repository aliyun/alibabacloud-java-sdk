// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUpcomingMoviesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("SubCode")
    @Validation(required = true)
    public String subCode;

    @NameInMap("SubMessage")
    @Validation(required = true)
    public String subMessage;

    @NameInMap("LogsId")
    @Validation(required = true)
    public String logsId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Movies")
    @Validation(required = true)
    public QueryUpcomingMoviesResponseMovies movies;

    public static QueryUpcomingMoviesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUpcomingMoviesResponse self = new QueryUpcomingMoviesResponse();
        return TeaModel.build(map, self);
    }

    public QueryUpcomingMoviesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUpcomingMoviesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUpcomingMoviesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUpcomingMoviesResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryUpcomingMoviesResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryUpcomingMoviesResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryUpcomingMoviesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryUpcomingMoviesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUpcomingMoviesResponse setMovies(QueryUpcomingMoviesResponseMovies movies) {
        this.movies = movies;
        return this;
    }
    public QueryUpcomingMoviesResponseMovies getMovies() {
        return this.movies;
    }

    public static class QueryUpcomingMoviesResponseMoviesMovie extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("BackgroundPicture")
        @Validation(required = true)
        public String backgroundPicture;

        @NameInMap("Highlight")
        @Validation(required = true)
        public String highlight;

        @NameInMap("OpenTime")
        @Validation(required = true)
        public String openTime;

        @NameInMap("MovieTypeList")
        @Validation(required = true)
        public String movieTypeList;

        @NameInMap("MovieVersion")
        @Validation(required = true)
        public String movieVersion;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Poster")
        @Validation(required = true)
        public String poster;

        @NameInMap("TrailerList")
        @Validation(required = true)
        public String trailerList;

        @NameInMap("OpenDay")
        @Validation(required = true)
        public String openDay;

        @NameInMap("Duration")
        @Validation(required = true)
        public Long duration;

        @NameInMap("Language")
        @Validation(required = true)
        public String language;

        @NameInMap("Country")
        @Validation(required = true)
        public String country;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("LeadingRole")
        @Validation(required = true)
        public String leadingRole;

        @NameInMap("Director")
        @Validation(required = true)
        public String director;

        @NameInMap("MovieNameEn")
        @Validation(required = true)
        public String movieNameEn;

        @NameInMap("MovieName")
        @Validation(required = true)
        public String movieName;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        public static QueryUpcomingMoviesResponseMoviesMovie build(java.util.Map<String, ?> map) throws Exception {
            QueryUpcomingMoviesResponseMoviesMovie self = new QueryUpcomingMoviesResponseMoviesMovie();
            return TeaModel.build(map, self);
        }

        public QueryUpcomingMoviesResponseMoviesMovie setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setBackgroundPicture(String backgroundPicture) {
            this.backgroundPicture = backgroundPicture;
            return this;
        }
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }
        public String getHighlight() {
            return this.highlight;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setMovieTypeList(String movieTypeList) {
            this.movieTypeList = movieTypeList;
            return this;
        }
        public String getMovieTypeList() {
            return this.movieTypeList;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setPoster(String poster) {
            this.poster = poster;
            return this;
        }
        public String getPoster() {
            return this.poster;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setTrailerList(String trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public String getTrailerList() {
            return this.trailerList;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setOpenDay(String openDay) {
            this.openDay = openDay;
            return this;
        }
        public String getOpenDay() {
            return this.openDay;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setLeadingRole(String leadingRole) {
            this.leadingRole = leadingRole;
            return this;
        }
        public String getLeadingRole() {
            return this.leadingRole;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setDirector(String director) {
            this.director = director;
            return this;
        }
        public String getDirector() {
            return this.director;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setMovieNameEn(String movieNameEn) {
            this.movieNameEn = movieNameEn;
            return this;
        }
        public String getMovieNameEn() {
            return this.movieNameEn;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }
        public String getMovieName() {
            return this.movieName;
        }

        public QueryUpcomingMoviesResponseMoviesMovie setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class QueryUpcomingMoviesResponseMovies extends TeaModel {
        @NameInMap("Movie")
        @Validation(required = true)
        public java.util.List<QueryUpcomingMoviesResponseMoviesMovie> movie;

        public static QueryUpcomingMoviesResponseMovies build(java.util.Map<String, ?> map) throws Exception {
            QueryUpcomingMoviesResponseMovies self = new QueryUpcomingMoviesResponseMovies();
            return TeaModel.build(map, self);
        }

        public QueryUpcomingMoviesResponseMovies setMovie(java.util.List<QueryUpcomingMoviesResponseMoviesMovie> movie) {
            this.movie = movie;
            return this;
        }
        public java.util.List<QueryUpcomingMoviesResponseMoviesMovie> getMovie() {
            return this.movie;
        }

    }

}

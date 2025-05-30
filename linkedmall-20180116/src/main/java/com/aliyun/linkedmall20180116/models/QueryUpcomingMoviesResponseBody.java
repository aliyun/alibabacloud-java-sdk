// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUpcomingMoviesResponseBody extends TeaModel {
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

    @NameInMap("Movies")
    public QueryUpcomingMoviesResponseBodyMovies movies;

    /**
     * <strong>example:</strong>
     * <p>9681B75A-1BE4-57D2-8C03-5B6BEF29378D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>208</p>
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

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryUpcomingMoviesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUpcomingMoviesResponseBody self = new QueryUpcomingMoviesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUpcomingMoviesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUpcomingMoviesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryUpcomingMoviesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUpcomingMoviesResponseBody setMovies(QueryUpcomingMoviesResponseBodyMovies movies) {
        this.movies = movies;
        return this;
    }
    public QueryUpcomingMoviesResponseBodyMovies getMovies() {
        return this.movies;
    }

    public QueryUpcomingMoviesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUpcomingMoviesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryUpcomingMoviesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryUpcomingMoviesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryUpcomingMoviesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryUpcomingMoviesResponseBodyMoviesMovie extends TeaModel {
        @NameInMap("BackgroundPicture")
        public String backgroundPicture;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Country")
        public String country;

        @NameInMap("Description")
        public String description;

        @NameInMap("Director")
        public String director;

        /**
         * <strong>example:</strong>
         * <p>190</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Highlight")
        public String highlight;

        /**
         * <strong>example:</strong>
         * <p>1159177</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("LeadingRole")
        public String leadingRole;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("MovieName")
        public String movieName;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("MovieNameEn")
        public String movieNameEn;

        @NameInMap("MovieTypeList")
        public String movieTypeList;

        @NameInMap("MovieVersion")
        public String movieVersion;

        @NameInMap("OpenDay")
        public String openDay;

        /**
         * <strong>example:</strong>
         * <p>2022-04-01 12:00:00</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Poster")
        public String poster;

        /**
         * <strong>example:</strong>
         * <p>9.6</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("TrailerList")
        public String trailerList;

        @NameInMap("Type")
        public String type;

        public static QueryUpcomingMoviesResponseBodyMoviesMovie build(java.util.Map<String, ?> map) throws Exception {
            QueryUpcomingMoviesResponseBodyMoviesMovie self = new QueryUpcomingMoviesResponseBodyMoviesMovie();
            return TeaModel.build(map, self);
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setBackgroundPicture(String backgroundPicture) {
            this.backgroundPicture = backgroundPicture;
            return this;
        }
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setDirector(String director) {
            this.director = director;
            return this;
        }
        public String getDirector() {
            return this.director;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }
        public String getHighlight() {
            return this.highlight;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setLeadingRole(String leadingRole) {
            this.leadingRole = leadingRole;
            return this;
        }
        public String getLeadingRole() {
            return this.leadingRole;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }
        public String getMovieName() {
            return this.movieName;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setMovieNameEn(String movieNameEn) {
            this.movieNameEn = movieNameEn;
            return this;
        }
        public String getMovieNameEn() {
            return this.movieNameEn;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setMovieTypeList(String movieTypeList) {
            this.movieTypeList = movieTypeList;
            return this;
        }
        public String getMovieTypeList() {
            return this.movieTypeList;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setOpenDay(String openDay) {
            this.openDay = openDay;
            return this;
        }
        public String getOpenDay() {
            return this.openDay;
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

        public QueryUpcomingMoviesResponseBodyMoviesMovie setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setTrailerList(String trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public String getTrailerList() {
            return this.trailerList;
        }

        public QueryUpcomingMoviesResponseBodyMoviesMovie setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

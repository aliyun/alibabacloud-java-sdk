// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryHotMoviesResponseBody extends TeaModel {
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
    public QueryHotMoviesResponseBodyMovies movies;

    /**
     * <strong>example:</strong>
     * <p>1AF23E47-D8FB-576A-B069-CA98B4DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>205</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryHotMoviesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHotMoviesResponseBody self = new QueryHotMoviesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHotMoviesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryHotMoviesResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryHotMoviesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHotMoviesResponseBody setMovies(QueryHotMoviesResponseBodyMovies movies) {
        this.movies = movies;
        return this;
    }
    public QueryHotMoviesResponseBodyMovies getMovies() {
        return this.movies;
    }

    public QueryHotMoviesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHotMoviesResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryHotMoviesResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryHotMoviesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("BackgroundPicture")
        public String backgroundPicture;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
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
         * <p>5790</p>
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
        public QueryHotMoviesResponseBodyMoviesMovieMovieTypeList movieTypeList;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("MovieVersion")
        public String movieVersion;

        /**
         * <strong>example:</strong>
         * <p>2022-04-01 12:00:00</p>
         */
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
         * <p>9.7</p>
         */
        @NameInMap("Remark")
        public String remark;

        @NameInMap("TrailerList")
        public QueryHotMoviesResponseBodyMoviesMovieTrailerList trailerList;

        @NameInMap("Type")
        public String type;

        public static QueryHotMoviesResponseBodyMoviesMovie build(java.util.Map<String, ?> map) throws Exception {
            QueryHotMoviesResponseBodyMoviesMovie self = new QueryHotMoviesResponseBodyMoviesMovie();
            return TeaModel.build(map, self);
        }

        public QueryHotMoviesResponseBodyMoviesMovie setBackgroundPicture(String backgroundPicture) {
            this.backgroundPicture = backgroundPicture;
            return this;
        }
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setDirector(String director) {
            this.director = director;
            return this;
        }
        public String getDirector() {
            return this.director;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setHighlight(String highlight) {
            this.highlight = highlight;
            return this;
        }
        public String getHighlight() {
            return this.highlight;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setLeadingRole(String leadingRole) {
            this.leadingRole = leadingRole;
            return this;
        }
        public String getLeadingRole() {
            return this.leadingRole;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setMovieName(String movieName) {
            this.movieName = movieName;
            return this;
        }
        public String getMovieName() {
            return this.movieName;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setMovieNameEn(String movieNameEn) {
            this.movieNameEn = movieNameEn;
            return this;
        }
        public String getMovieNameEn() {
            return this.movieNameEn;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setMovieTypeList(QueryHotMoviesResponseBodyMoviesMovieMovieTypeList movieTypeList) {
            this.movieTypeList = movieTypeList;
            return this;
        }
        public QueryHotMoviesResponseBodyMoviesMovieMovieTypeList getMovieTypeList() {
            return this.movieTypeList;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setMovieVersion(String movieVersion) {
            this.movieVersion = movieVersion;
            return this;
        }
        public String getMovieVersion() {
            return this.movieVersion;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setOpenDay(String openDay) {
            this.openDay = openDay;
            return this;
        }
        public String getOpenDay() {
            return this.openDay;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setPoster(String poster) {
            this.poster = poster;
            return this;
        }
        public String getPoster() {
            return this.poster;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setTrailerList(QueryHotMoviesResponseBodyMoviesMovieTrailerList trailerList) {
            this.trailerList = trailerList;
            return this;
        }
        public QueryHotMoviesResponseBodyMoviesMovieTrailerList getTrailerList() {
            return this.trailerList;
        }

        public QueryHotMoviesResponseBodyMoviesMovie setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

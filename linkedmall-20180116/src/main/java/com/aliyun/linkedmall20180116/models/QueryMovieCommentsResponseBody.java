// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieCommentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CommentList")
    public QueryMovieCommentsResponseBodyCommentList commentList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

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

    /**
     * <strong>example:</strong>
     * <p>42A19B5E-B9A0-5D41-91D0-CC316A97B92A</p>
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

    public static QueryMovieCommentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieCommentsResponseBody self = new QueryMovieCommentsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMovieCommentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieCommentsResponseBody setCommentList(QueryMovieCommentsResponseBodyCommentList commentList) {
        this.commentList = commentList;
        return this;
    }
    public QueryMovieCommentsResponseBodyCommentList getCommentList() {
        return this.commentList;
    }

    public QueryMovieCommentsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryMovieCommentsResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieCommentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieCommentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieCommentsResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieCommentsResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieCommentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMovieCommentsResponseBodyCommentListComment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("CommentTime")
        public String commentTime;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("FavorCount")
        public Long favorCount;

        /**
         * <strong>example:</strong>
         * <p>6331</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("MovieId")
        public Long movieId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Remark")
        public Long remark;

        @NameInMap("Subject")
        public String subject;

        public static QueryMovieCommentsResponseBodyCommentListComment build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieCommentsResponseBodyCommentListComment self = new QueryMovieCommentsResponseBodyCommentListComment();
            return TeaModel.build(map, self);
        }

        public QueryMovieCommentsResponseBodyCommentListComment setCommentTime(String commentTime) {
            this.commentTime = commentTime;
            return this;
        }
        public String getCommentTime() {
            return this.commentTime;
        }

        public QueryMovieCommentsResponseBodyCommentListComment setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryMovieCommentsResponseBodyCommentListComment setFavorCount(Long favorCount) {
            this.favorCount = favorCount;
            return this;
        }
        public Long getFavorCount() {
            return this.favorCount;
        }

        public QueryMovieCommentsResponseBodyCommentListComment setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMovieCommentsResponseBodyCommentListComment setMovieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }
        public Long getMovieId() {
            return this.movieId;
        }

        public QueryMovieCommentsResponseBodyCommentListComment setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryMovieCommentsResponseBodyCommentListComment setRemark(Long remark) {
            this.remark = remark;
            return this;
        }
        public Long getRemark() {
            return this.remark;
        }

        public QueryMovieCommentsResponseBodyCommentListComment setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class QueryMovieCommentsResponseBodyCommentList extends TeaModel {
        @NameInMap("Comment")
        public java.util.List<QueryMovieCommentsResponseBodyCommentListComment> comment;

        public static QueryMovieCommentsResponseBodyCommentList build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieCommentsResponseBodyCommentList self = new QueryMovieCommentsResponseBodyCommentList();
            return TeaModel.build(map, self);
        }

        public QueryMovieCommentsResponseBodyCommentList setComment(java.util.List<QueryMovieCommentsResponseBodyCommentListComment> comment) {
            this.comment = comment;
            return this;
        }
        public java.util.List<QueryMovieCommentsResponseBodyCommentListComment> getComment() {
            return this.comment;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieCommentsResponse extends TeaModel {
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

    @NameInMap("Count")
    @Validation(required = true)
    public Long count;

    @NameInMap("CommentList")
    @Validation(required = true)
    public QueryMovieCommentsResponseCommentList commentList;

    public static QueryMovieCommentsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieCommentsResponse self = new QueryMovieCommentsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMovieCommentsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMovieCommentsResponse setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryMovieCommentsResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryMovieCommentsResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryMovieCommentsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMovieCommentsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryMovieCommentsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMovieCommentsResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryMovieCommentsResponse setCommentList(QueryMovieCommentsResponseCommentList commentList) {
        this.commentList = commentList;
        return this;
    }
    public QueryMovieCommentsResponseCommentList getCommentList() {
        return this.commentList;
    }

    public static class QueryMovieCommentsResponseCommentListComment extends TeaModel {
        @NameInMap("CommentTime")
        @Validation(required = true)
        public String commentTime;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("FavorCount")
        @Validation(required = true)
        public Long favorCount;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("NickName")
        @Validation(required = true)
        public String nickName;

        @NameInMap("Remark")
        @Validation(required = true)
        public Long remark;

        @NameInMap("MovieId")
        @Validation(required = true)
        public Long movieId;

        @NameInMap("Subject")
        @Validation(required = true)
        public String subject;

        public static QueryMovieCommentsResponseCommentListComment build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieCommentsResponseCommentListComment self = new QueryMovieCommentsResponseCommentListComment();
            return TeaModel.build(map, self);
        }

        public QueryMovieCommentsResponseCommentListComment setCommentTime(String commentTime) {
            this.commentTime = commentTime;
            return this;
        }
        public String getCommentTime() {
            return this.commentTime;
        }

        public QueryMovieCommentsResponseCommentListComment setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryMovieCommentsResponseCommentListComment setFavorCount(Long favorCount) {
            this.favorCount = favorCount;
            return this;
        }
        public Long getFavorCount() {
            return this.favorCount;
        }

        public QueryMovieCommentsResponseCommentListComment setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMovieCommentsResponseCommentListComment setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryMovieCommentsResponseCommentListComment setRemark(Long remark) {
            this.remark = remark;
            return this;
        }
        public Long getRemark() {
            return this.remark;
        }

        public QueryMovieCommentsResponseCommentListComment setMovieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }
        public Long getMovieId() {
            return this.movieId;
        }

        public QueryMovieCommentsResponseCommentListComment setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class QueryMovieCommentsResponseCommentList extends TeaModel {
        @NameInMap("Comment")
        @Validation(required = true)
        public java.util.List<QueryMovieCommentsResponseCommentListComment> comment;

        public static QueryMovieCommentsResponseCommentList build(java.util.Map<String, ?> map) throws Exception {
            QueryMovieCommentsResponseCommentList self = new QueryMovieCommentsResponseCommentList();
            return TeaModel.build(map, self);
        }

        public QueryMovieCommentsResponseCommentList setComment(java.util.List<QueryMovieCommentsResponseCommentListComment> comment) {
            this.comment = comment;
            return this;
        }
        public java.util.List<QueryMovieCommentsResponseCommentListComment> getComment() {
            return this.comment;
        }

    }

}

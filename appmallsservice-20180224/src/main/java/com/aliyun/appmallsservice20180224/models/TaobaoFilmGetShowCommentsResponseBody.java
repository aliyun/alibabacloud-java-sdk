// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetShowCommentsResponseBody extends TeaModel {
    @NameInMap("CommentList")
    public java.util.List<TaobaoFilmGetShowCommentsResponseBodyCommentList> commentList;

    @NameInMap("Count")
    public Long count;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMsg")
    public String subMsg;

    public static TaobaoFilmGetShowCommentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetShowCommentsResponseBody self = new TaobaoFilmGetShowCommentsResponseBody();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetShowCommentsResponseBody setCommentList(java.util.List<TaobaoFilmGetShowCommentsResponseBodyCommentList> commentList) {
        this.commentList = commentList;
        return this;
    }
    public java.util.List<TaobaoFilmGetShowCommentsResponseBodyCommentList> getCommentList() {
        return this.commentList;
    }

    public TaobaoFilmGetShowCommentsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public TaobaoFilmGetShowCommentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TaobaoFilmGetShowCommentsResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public TaobaoFilmGetShowCommentsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public TaobaoFilmGetShowCommentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaobaoFilmGetShowCommentsResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public TaobaoFilmGetShowCommentsResponseBody setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public static class TaobaoFilmGetShowCommentsResponseBodyCommentList extends TeaModel {
        @NameInMap("CommentTime")
        public String commentTime;

        @NameInMap("Content")
        public String content;

        @NameInMap("FavorCount")
        public Long favorCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Remark")
        public Long remark;

        @NameInMap("ShowId")
        public Long showId;

        @NameInMap("Subject")
        public String subject;

        public static TaobaoFilmGetShowCommentsResponseBodyCommentList build(java.util.Map<String, ?> map) throws Exception {
            TaobaoFilmGetShowCommentsResponseBodyCommentList self = new TaobaoFilmGetShowCommentsResponseBodyCommentList();
            return TeaModel.build(map, self);
        }

        public TaobaoFilmGetShowCommentsResponseBodyCommentList setCommentTime(String commentTime) {
            this.commentTime = commentTime;
            return this;
        }
        public String getCommentTime() {
            return this.commentTime;
        }

        public TaobaoFilmGetShowCommentsResponseBodyCommentList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public TaobaoFilmGetShowCommentsResponseBodyCommentList setFavorCount(Long favorCount) {
            this.favorCount = favorCount;
            return this;
        }
        public Long getFavorCount() {
            return this.favorCount;
        }

        public TaobaoFilmGetShowCommentsResponseBodyCommentList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TaobaoFilmGetShowCommentsResponseBodyCommentList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public TaobaoFilmGetShowCommentsResponseBodyCommentList setRemark(Long remark) {
            this.remark = remark;
            return this;
        }
        public Long getRemark() {
            return this.remark;
        }

        public TaobaoFilmGetShowCommentsResponseBodyCommentList setShowId(Long showId) {
            this.showId = showId;
            return this;
        }
        public Long getShowId() {
            return this.showId;
        }

        public TaobaoFilmGetShowCommentsResponseBodyCommentList setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

}

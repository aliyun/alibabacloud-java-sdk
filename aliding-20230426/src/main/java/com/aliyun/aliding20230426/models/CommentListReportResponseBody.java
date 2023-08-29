// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CommentListReportResponseBody extends TeaModel {
    @NameInMap("comments")
    public java.util.List<CommentListReportResponseBodyComments> comments;

    @NameInMap("hasMore")
    public Boolean hasMore;

    @NameInMap("nextCursor")
    public Long nextCursor;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CommentListReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommentListReportResponseBody self = new CommentListReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CommentListReportResponseBody setComments(java.util.List<CommentListReportResponseBodyComments> comments) {
        this.comments = comments;
        return this;
    }
    public java.util.List<CommentListReportResponseBodyComments> getComments() {
        return this.comments;
    }

    public CommentListReportResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public CommentListReportResponseBody setNextCursor(Long nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    public Long getNextCursor() {
        return this.nextCursor;
    }

    public CommentListReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CommentListReportResponseBodyComments extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Userid")
        public String userid;

        public static CommentListReportResponseBodyComments build(java.util.Map<String, ?> map) throws Exception {
            CommentListReportResponseBodyComments self = new CommentListReportResponseBodyComments();
            return TeaModel.build(map, self);
        }

        public CommentListReportResponseBodyComments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CommentListReportResponseBodyComments setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CommentListReportResponseBodyComments setUserid(String userid) {
            this.userid = userid;
            return this;
        }
        public String getUserid() {
            return this.userid;
        }

    }

}
